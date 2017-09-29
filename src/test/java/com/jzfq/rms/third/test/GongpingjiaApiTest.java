package com.jzfq.rms.third.test;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.GpjCarDetailModel;
import com.jzfq.rms.third.common.vo.RiskCarEvaluationVo;
import com.jzfq.rms.third.persistence.mapper.GpjCarDetailModelMapper;
import com.jzfq.rms.third.persistence.mapper.SysTaskMapper;
import com.jzfq.rms.third.service.IGongPingjiaService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class GongpingjiaApiTest {

    static String vin = "LE4GF4HB8DL254936";
    static String licensePlatHeader = "京A";
    @Autowired
    private SysTaskMapper sysTaskMapper;
    @Autowired
    private GpjCarDetailModelMapper gpjCarDetailModelMapper;
    @Autowired
    private IGongPingjiaService gongPingjiaService;
    @Test
    public void test(){
        sysTaskMapper.selectByTaskSlug("www");
//        if(StringUtils.isBlank(vin))
//            throw new IllegalAccessError("入参vin 为空");
//        if(StringUtils.isBlank(licensePlatHeader))
//            throw new IllegalAccessError("入参licensePlatHeader 为空");
//        ResponseDTO result = JWTUtils.getData(getEvaluationUrl(  vin,   licensePlatHeader));
//        System.out.print(result);
//
//        String evaluationStr = result.getAttach().toString();
//        JSONObject evaluationObject = JSONObject.parseObject(evaluationStr);
//
//        createCarEvaluations((List<Map<String,String>>)evaluationObject.get("data"));

        //        ResponseDTO response = JWTUtils.getData(key, secret, timeout,getEvaluationUrl( "LE4GF4HB8DL254936",
//                "京A"));
//        gongPingjiaService.queryGaopingjiaEvalation(vin,licensePlatHeader);
//        CarDetailModelConditionDTO params = new CarDetailModelConditionDTO();
//        params.setPage(1);
//        params.setStart_time("all");
//        gongPingjiaService.queryCarDetailModels(params);

//
//        GpjCarDetailModel a = gpjCarDetailModelMapper.selectByPrimaryKey(1);
//        Set<Integer> set = new HashSet<>();
//        set.add(2);
//        gpjCarDetailModelMapper.selectByModelSlugList(set);
//        a = new GpjCarDetailModel();
//        a.setGpjId(1);
//        a.setDetailModelSlug("16801_ah");
//        gpjCarDetailModelMapper.insert(a);
//        System.out.println(a);

//        boolean b = StringUtils.



    }



    /**
     * 估值接口URL
     */
    final static String FINAL_GONGPINGJIA_EVALUATION_URL = "https://apigw.gongpingjia.com/api/cars/evaluation/juzi/";
    /**
     * 拼接估值接口URL参数
     *
     */
    private static String getEvaluationUrl(String vin, String licensePlatHeader){
        String params = "?vin="+vin+"&license_plat_header="+licensePlatHeader;
        return FINAL_GONGPINGJIA_EVALUATION_URL + params;
    }

    private JSONObject createCarEvaluations(List<Map<String,String>> datas){
        RiskCarEvaluationVo evaluationInfo = new RiskCarEvaluationVo();
        Set<String> slugs = new HashSet<>();
        if(!CollectionUtils.isEmpty(datas)){
            for(Map<String,String> data:datas){
                String modelSlug = data.get("model_detail_slug");
                if(!StringUtils.isBlank(modelSlug)&&!slugs.contains(modelSlug)){
                    slugs.add(modelSlug);
                }
            }
            // 查新车型库信息
            if(!CollectionUtils.isEmpty(slugs)){
                List<GpjCarDetailModel> carRepositories = gpjCarDetailModelMapper.selectByModelSlugList(slugs);
                carRepositories.size();
            }
        }
        return JSONObject.parseObject(JSONObject.toJSONString(evaluationInfo));
    }

    @Test
    public void riskCarRepositoryMapperTest(){
        Set<String> slugs = new HashSet<>();
        slugs.add("model_31857_cs");
        List<GpjCarDetailModel> carRepositories = gpjCarDetailModelMapper.selectByModelSlugList(slugs);
        System.out.println(carRepositories.size());
    }
}
