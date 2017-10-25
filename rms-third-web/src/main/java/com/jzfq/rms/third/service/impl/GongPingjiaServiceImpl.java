package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.GpjCarDetailModel;
import com.jzfq.rms.third.common.domain.SysTask;
import com.jzfq.rms.third.common.dto.CarDetailModelConditionDTO;
import com.jzfq.rms.third.common.dto.CarModelResponseDTO;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.utils.JWTUtils;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.persistence.dao.IThirdTransferLogDao;
import com.jzfq.rms.third.persistence.mapper.GpjCarDetailModelMapper;
import com.jzfq.rms.third.persistence.mapper.SysTaskMapper;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.service.ISendMessegeService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.*;

@Service("gongPingjiaService")
public class GongPingjiaServiceImpl implements IGongPingjiaService{

    private static final Logger log = LoggerFactory.getLogger("GongPingjiaService");

    @Value("${gongpingjia.evaluation.apiUrl}")
    private String evaluationUrl;
    @Value("${gongpingjia.detail.model.apiUrl}")
    private String detailModelInfoUrl;
    @Value("${gongpingjia.key}")
    private String key;
    @Value("${gongpingjia.secret}")
    private String secret;
    @Value("${gongpingjia.timeout}")
    private Long timeout ;

    @Value("${gongpingjia.detail.model.page.size}")
    private int size ;

    @Autowired
    private GpjCarDetailModelMapper gpjCarDetailModelMapper;

    @Autowired
    private SysTaskMapper sysTaskMapper;

    @Autowired
    ISendMessegeService sendMessegeService;


    public List<EvaluationInfoVo> queryGaopingjiaEvalation(String vin, String licensePlatHeader){
        log.info("公平价接口调用[车架号="+vin+"车牌头两位"+licensePlatHeader+"]-开始");
        JSONObject evaluation = getGongpingjiaData(vin, licensePlatHeader);
        if(evaluation == null){
            return null;
        }
        return createCarEvaluations((List<Map<String,String>>)evaluation.get("data"));
    }
    /**
     * 调用公平价接口
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    private JSONObject getGongpingjiaData(String vin, String licensePlatHeader){
        JSONObject result = new JSONObject();
        ResponseResult response ;
        try{
            response = JWTUtils.getData(key, secret, timeout,getEvaluationUrl(vin, licensePlatHeader));
        }catch (Exception e){
            return null;
        }
        if(!(ReturnCode.REQUEST_SUCCESS.code() == response.getCode())||response.getData()==null){
            log.info("公平价估价接口调用[车架号="+vin+"车牌头两位="+licensePlatHeader+"]失败:"+response.getCode()+"响应信息："+response.getData());
            return null;
        }
        String evaluationStr = response.getData().toString();
        if(StringUtils.isBlank(evaluationStr)){
            log.info("公平价估价接口调用[车架号="+vin+"车牌头两位="+licensePlatHeader+"]返回信息为空");
            return null;
        }
        JSONObject evaluationInfo = JSONObject.parseObject(evaluationStr);
        if(!StringUtils.equals(evaluationInfo.get("status").toString(),"success")){
            log.info("公平价估价接口调用[车架号="+vin+"车牌头两位="+licensePlatHeader+"]返回失败:"+evaluationInfo.get("message").toString());
            return null;
        }
        log.info("公平价估价接口调用[车架号="+vin+"车牌头两位="+licensePlatHeader+"]成功");
        return evaluationInfo;
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
            String modelSlug = evaluation.getDetailModelSlug();
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

    /**
     * 全量更新
     * @param currentTask
     */
    public void insertAllCarDetailModels(SysTask currentTask) {
        Integer totalPages = 0;
        Integer page=1;
        synchronizeData(  totalPages,  currentTask,  page,  "all",  null);
    }
    public int getCountCarDetailModels(){
        return gpjCarDetailModelMapper.getCountCarDetailModel();
    }

    /**
     * 增量更新
     * @param currentTask
     */
    public void updateCarDetailModels(SysTask currentTask) {
        SysTask task = sysTaskMapper.selectByTaskSlug("GPJgetCarDetailModel");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String beginTime = "all";
        if(task!=null&&task.getExcTime()!=null){
            beginTime = sdf.format(task.getExcTime());
        }
        String endTime = sdf.format(currentTask.getExcTime());
        Integer totalPages = 0;
        Integer page=1;
        synchronizeData(  totalPages,  currentTask,  page,  beginTime,  endTime);
    }

    /**
     * 根据条件同步数据
     * @param totalPages
     * @param currentTask
     * @param page
     * @param beginTime
     * @param endTime
     */
    private void synchronizeData(Integer totalPages,SysTask currentTask,Integer page,String beginTime,String endTime){
        do{
            ResponseResult dto = synchronizeData(  page,  beginTime,  endTime);
            if(dto.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
                log.info("调用公平价接口失败:{} ",dto.getMsg());
                currentTask.setStatus(TaskCode.EXCUTE_FAILURE.code());
                break;
            }
            JSONObject json = JSONObject.parseObject(dto.getData().toString());
            String models = json.getString("data");
            if(totalPages==0){
                totalPages = json.getInteger("total_pages");
                currentTask.setTaskParams("total_pages:"+totalPages);
            }
            totalPages--;
            page++;
            JSONArray array = JSONObject.parseArray(models);
            List<GpjCarDetailModel> modelList = new ArrayList<>();
            Set<String> slugs = new HashSet<>();
            for (int i = 0; i < array.size(); i++) {
                GpjCarDetailModel car = new GpjCarDetailModel();
                buildCar(array, i, car);
                slugs.add(car.getDetailModelSlug());
                modelList.add(car);
            }
            try {
                gpjCarDetailModelMapper.batchDelete(slugs);
                gpjCarDetailModelMapper.batchInsert(modelList);
            } catch (Exception e) {
                log.error("批量插入车型出错：",e);
                currentTask.setStatus(TaskCode.EXCUTE_FAILURE.code());
            }
        }while(totalPages>0);
    }

    /**
     * 调用接口
     * @param page
     * @param beginTime
     * @param endTime
     * @return
     */
    private ResponseResult synchronizeData(Integer page,String beginTime,String endTime){

        Map<String, Object> params = new HashMap<>();
        params.put("key",key);
        params.put("secret",secret);
        params.put("timeout",timeout);
        params.put("url",detailModelInfoUrl);
        params.put("targetId", SystemIdEnum.THIRD_GPJ.getCode());
        params.put("apiId", ApiIdEnum.ThIRD_GPJ_EVALUCTION.getCode());
        params.put("appId", "");
        params.put("interfaceId", InterfaceIdEnum.THIRD_GPJ_SYNCHRONIZEDATA.getCode());
        params.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        params.put("traceId", TraceIDThreadLocal.getTraceID());

        Map<String, Object> bizParams  = new HashMap<>();
        bizParams.put("size",size);
        bizParams.put("page",page);
        bizParams.put("beginTime",beginTime);
        bizParams.put("endTime",endTime);
        return sendMessegeService.sendByThreeChance(SendMethodEnum.GPJ02.getCode(),params,bizParams);
    }

    /**
     * 构建车型库对象
     * @param array
     * @param i
     * @param car
     */
    private void buildCar(JSONArray array, int i, GpjCarDetailModel car) {
        JSONObject o = (JSONObject) array.get(i);
        Integer gpj_id = o.getInteger("gpj_id");
        car.setGpjId(gpj_id);
        String detail_model = o.getString("detail_model");
        car.setDetailModelName(detail_model);
        Date update_time = o.getDate("update_time");
        car.setUpdateTime(update_time);
        String emission_standard = o.getString("emission_standard");
        car.setEmissionStandard(emission_standard);
        String volume = o.getString("volume");
        if(StringUtils.isNotBlank(volume)&& com.alibaba.druid.util.StringUtils.isNumber(volume.trim())){
            car.setVolume(Float.parseFloat(volume.trim()));
        }
        String listed_year = o.getString("listed_year");
        if(StringUtils.isNotBlank(listed_year)&& com.alibaba.druid.util.StringUtils.isNumber(listed_year.trim())){
            car.setListedYear(Integer.parseInt(listed_year.trim()));
        }
        String delisted_year = o.getString("delisted_year");
        if(StringUtils.isNotBlank(delisted_year)&& com.alibaba.druid.util.StringUtils.isNumber(delisted_year.trim())){
            car.setDelistedYear(Integer.parseInt(delisted_year.trim()));
        }
        String detail_model_slug = o.getString("detail_model_slug");
        car.setDetailModelSlug(detail_model_slug);
        String price_bn = o.getString("price_bn");
        if(StringUtils.isNotBlank(price_bn)&& com.alibaba.druid.util.StringUtils.isNumber(price_bn.trim())){
            car.setPriceBn(Float.parseFloat(price_bn.trim()));
        }
        String brand = o.getString("brand");
        JSONObject o1 = JSONObject.parseObject(brand);
        String name = o1.getString("name");
        car.setBrandName(name);
        String slug = o1.getString("slug");
        car.setBrandSlug(slug);
        String model = o.getString("model");
        JSONObject o2 = JSONObject.parseObject(model);
        String name1 = o2.getString("name");
        car.setModelName(name1);
        String slug1 = o2.getString("slug");
        car.setModelSlug(slug1);
        String mum = o2.getString("mum");
        car.setModelMum(mum);
        car.setStatus("0");
        car.setOptTime(new Date());
    }

    /**
     * 根据vin和车牌前两位查询车辆估值信息 02
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    public ResponseResult queryCarEvaluations(String vin, String licensePlatHeader,Map<String,Object> commonParams) throws
            BusinessException{
        log.info("traceId={} 公平价接口调用[车架号={} 车牌头两位{}]-开始",
                TraceIDThreadLocal.getTraceID(),vin,licensePlatHeader);
        Map<String, Object> params = new HashMap<>();
        params.put("key",key);
        params.put("secret",secret);
        params.put("timeout",timeout);

        params.put("url",evaluationUrl);
        params.put("targetId", SystemIdEnum.THIRD_GPJ.getCode());
        params.put("apiId", ApiIdEnum.ThIRD_GPJ_EVALUCTION.getCode());
        params.put("appId", "");
        params.put("interfaceId", InterfaceIdEnum.THIRD_GPJ_EVALATION.getCode());
        params.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        params.put("traceId", TraceIDThreadLocal.getTraceID());

        Map<String, Object> bizParams  = new HashMap<>();
        bizParams.put("vin",vin);
        bizParams.put("licensePlatHeader",licensePlatHeader);
        ResponseResult result = getGongpingjiaData( params ,bizParams);
        List<Map<String,String>> list = (List<Map<String,String>>)result.getData();
        if(list == null&&result.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
            return result;
        }
        result.setData(createCarEvaluations(list));
        return result;
    }

    /**
     * 调用公平价接口 02
     * @param params
     * @param bizParams
     * @return
     */
    private ResponseResult getGongpingjiaData( Map<String, Object> params,Map<String, Object> bizParams) throws BusinessException{
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.GPJ01.getCode(),params,bizParams);
        if(response==null){
            log.info("公平价估价接口调用[车架号={} 车牌头两位={}] 响应信息为空" ,
                    bizParams.get("vin"),bizParams.get("licensePlatHeader"));
            throw new BusinessException(ReturnCode.ERROR_RESPONSE_NULL.code(),"公平价估价接口失败 返回为空",true);
        }
        return response;
    }
}
