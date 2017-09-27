package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.GpjCarDetailModel;
import com.jzfq.rms.third.common.dto.CarDetailModelConditionDTO;
import com.jzfq.rms.third.common.dto.CarModelResponseDTO;
import com.jzfq.rms.third.common.dto.ResponseDTO;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.utils.JWTUtils;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.persistence.mapper.GpjCarDetailModelMapper;
import com.jzfq.rms.third.service.IGongPingjiaService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Service("gongPingjiaService")
public class GongPingjiaServiceImpl implements IGongPingjiaService{

    private static final Logger log = LoggerFactory.getLogger("GongPingjiaServiceLog");

    @Value("${gongpingjia.evaluation.apiUrl}")
    private String evaluationUrl;
    @Value("${gongpingjia.detail.model.apiUrl}")
    private String detailModelInfoUrl;
    @Value("${gongpingjia.key}")
    private String key;
    @Value("${gongpingjia.secret}")
    private String secret;
    @Value("${gongpingjia.timeout}")
    private int timeout ;

    @Autowired
    private GpjCarDetailModelMapper gpjCarDetailModelMapper;

    public List<EvaluationInfoVo> queryGaopingjiaEvalation(String vin, String licensePlatHeader){
        {
            log.info("公平价接口调用[车架号="+vin+"车牌头两位"+licensePlatHeader+"]-开始");
            JSONObject evaluation = getGongpingjiaData(vin, licensePlatHeader);
            if(evaluation == null){
                return null;
            }
            return createCarEvaluations((List<Map<String,String>>)evaluation.get("data"));
        }
    }
    /**
     * 调用公平价接口
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    private JSONObject getGongpingjiaData(String vin, String licensePlatHeader){
        ResponseDTO response = JWTUtils.getData(key, secret, timeout,getEvaluationUrl(vin, licensePlatHeader));
        if(!(ReturnCode.REQUEST_SUCCESS.code() == response.getCode())||response.getAttach()==null){
            log.info("公平价估价接口调用[车架号="+vin+"车牌头两位="+licensePlatHeader+"]失败:"+response.getCode()+"响应信息："+response.getAttach());
            return null;
        }
        String evaluationStr = response.getAttach().toString();
        if(StringUtils.isBlank(evaluationStr)){
            log.info("公平价估价接口调用[车架号="+vin+"车牌头两位="+licensePlatHeader+"]返回信息为空");
            return null;
        }
        JSONObject evaluationObject = JSONObject.parseObject(evaluationStr);
        if(!StringUtils.equals(evaluationObject.get("status").toString(),"success")){
            log.info("公平价估价接口调用[车架号="+vin+"车牌头两位="+licensePlatHeader+"]返回失败:"+evaluationObject.get("message").toString());
            return null;
        }
        log.info("公平价估价接口调用[车架号="+vin+"车牌头两位="+licensePlatHeader+"]成功");
        return evaluationObject;
    }

    /**
     * 根据车辆信息和公平价返回数据拼接页面数据
     * @param datas
     * @return
     */
    private List<EvaluationInfoVo>  createCarEvaluations(List<Map<String,String>> datas){
        if(CollectionUtils.isEmpty(datas)){
            return null;
        }
        Set<String> slugs = new HashSet<>();
        List<EvaluationInfoVo> evaluationInfos = new ArrayList<>();
        for(Map<String,String> data:datas){
            EvaluationInfoVo evaluation = getEvaluationDatas(data,slugs);
            if(evaluation!=null){
                evaluationInfos.add(evaluation);
            }
        }
        // 查新车型库信息
        if(CollectionUtils.isEmpty(slugs)||CollectionUtils.isEmpty(evaluationInfos)){
            return null;
        }
        List<GpjCarDetailModel> carRepositories = gpjCarDetailModelMapper.selectByModelSlugList(slugs);
        if(CollectionUtils.isEmpty(carRepositories)){
            return null;
        }
        Map<String,GpjCarDetailModel> repositories = new HashMap<>();
        for(GpjCarDetailModel repository:carRepositories){
            repositories.put(repository.getDetailModelSlug(),repository);
        }
        for(EvaluationInfoVo evaluation:evaluationInfos){
            String modelSlug = evaluation.getModelSlug();
            GpjCarDetailModel repository = repositories.get(modelSlug);
            if(repository ==null){
                continue;
            }
            evaluation.setBrandName(repository.getBrandName());
            evaluation.setBrandSlug(repository.getBrandSlug());
            evaluation.setModelName(repository.getModelName());
            evaluation.setModelSlug(repository.getModelSlug());
            evaluation.setDetailModelName(repository.getDetailModelName());
            evaluation.setGuidePrice(repository.getPriceBn());
            evaluation.setListedYear(repository.getListedYear());
        }

        return evaluationInfos;
    }
    private EvaluationInfoVo getEvaluationDatas(Map<String,String> data,Set<String> slugs){
        String modelDetailSlug = data.get("model_detail_slug");
        if(StringUtils.isBlank(modelDetailSlug)||slugs.contains(modelDetailSlug)){
            return null;
        }
        slugs.add(modelDetailSlug);
        EvaluationInfoVo evaluation = new EvaluationInfoVo();
        evaluation.setMinSellPrice(data.get("min_sell_price"));
        evaluation.setSellPrice(data.get("sell_price"));
        evaluation.setMaxSellPrice(data.get("max_sell_price"));
        evaluation.setSellUrl(data.get("sell_url"));

        evaluation.setMinPrivatePrice(data.get("min_private_price"));
        evaluation.setPrivatePrice(data.get("private_price"));
        evaluation.setMaxPrivatePrice(data.get("max_private_price"));
        evaluation.setPrivateUrl(data.get("private_url"));

        evaluation.setMinBuyPrice(data.get("min_buy_price"));
        evaluation.setBuyPrice(data.get("buy_price"));
        evaluation.setMaxBuyPrice(data.get("max_buy_price"));
        evaluation.setBuyUrl(data.get("buy_url"));

        evaluation.setDetailModelSlug(modelDetailSlug);
        return evaluation;
    }

    /**
     * 拼接估值接口URL参数
     *
     */
    private String getEvaluationUrl(String vin, String licensePlatHeader){
        String params = "?vin="+vin+"&license_plat_header="+licensePlatHeader;
        return evaluationUrl + params;
    }

    public ResponseDTO queryCarDetailModels(CarDetailModelConditionDTO params){
        log.info("公平价车型库接口调用开始");
        Map<String,Object> condition = new HashMap<>();
        condition.put("page",params.getPage());
        condition.put("page_size",params.getPage_size());
        condition.put("start_time",params.getStart_time());
        condition.put("end_time",params.getEnd_time());
        ResponseDTO dto = HttpConnectionManager.doGet(detailModelInfoUrl,condition);
        if(dto==null || dto.getCode()!= ReturnCode.REQUEST_SUCCESS.code() ){
            log.info("公平价车型库接口调用失败");
            return new ResponseDTO(ReturnCode.ACTIVE_FAILURE);
        }
        CarModelResponseDTO gpjResponse = JSONObject.parseObject(dto.getAttach().toString(), CarModelResponseDTO.class);
        if(gpjResponse == null){
            log.info("公平价车型库接口调用失败");
            return new ResponseDTO(ReturnCode.ACTIVE_FAILURE);
        }
        if(!StringUtils.equals(gpjResponse.getStatus(),"success")){
            dto = new ResponseDTO(ReturnCode.ACTIVE_FAILURE);
            dto.setAttach(gpjResponse.getMessage());
            log.info("公平价车型库接口调用失败");
            return dto;
        }
        dto.setAttach(gpjResponse);
        log.info("公平价车型库接口调用结束");
        return dto;
    }
}
