package com.jzfq.rms.third.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.mongo.JuXinLiData;
import com.jzfq.rms.third.common.mongo.Rong360Data;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.IRong360Service;
import com.jzfq.rms.third.service.ISendMessageService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @description 通过OpenApi访问Rong360服务实现
 */
@Service
public class Rong360ServiceImpl implements IRong360Service {

    private static final Logger log = LoggerFactory.getLogger(Rong360ServiceImpl.class);
    /**
     * 为机构分配的appid，通常是7位数字
     */
    @Value("${rong360.appId}")
    private String appId;

    @Value("${rong360.sandbox.apiUrl}")
    private String sandboxApiUrl;

    @Value("${rong360.apiUrl}")
    private String apiUrl;

    @Value("${rong360.method.phoneNetworkLength}")
    private String method_phoneNetworkLength;

    @Value("${rong360.method.mobileCheck3item}")
    private String method_mobileCheck3item;

    @Value("${rong360.method.phoneStatus}")
    private String method_phoneStatus;


    /**
     * 机构的私钥，需要是pkcs8格式的
     */
    @Value("${rong360.privateKey}")
    private String privateKey;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 是否是测试环境，测试环境会连接测试环境并打印debug信息,false:生产环境；true：沙箱环境
     */
    @Value("${rong360.isTestEnv}")
    private boolean isTestEnv;

    @Autowired
    ISendMessageService sendMessegeService;


    @Autowired
    IRiskPostDataService riskPostDataService;

    /**
     * 机构K入网时间查询接口
     * bizData是业务参数
     */
    @Override
    public ResponseResult getPhoneNetworkLength(Map<String, Object> bizData) throws Exception {
        Map<String, Object> commonParams = getCommonParams(method_phoneNetworkLength, InterfaceIdEnum.THIRD_RSLL01);
        commonParams.put("frontId", bizData.get("frontId"));
        return sendMessegeService.sendByThreeChance(SendMethodEnum.RSLL01.getCode(), commonParams, bizData);
    }

    /**
     * 机构K手机号三项验证接口查询
     * bizData是业务参数
     */
    @Override
    public ResponseResult getMobilecheck3item(Map<String, Object> bizData) throws Exception {
        Map<String, Object> commonParams = getCommonParams(method_mobileCheck3item, InterfaceIdEnum.THIRD_RSLL03);
        commonParams.put("frontId", bizData.get("frontId"));
        return sendMessegeService.sendByThreeChance(SendMethodEnum.RSLL03.getCode(), commonParams, bizData);
    }

    /**
     * 机构K手机号手机号码当前状态查询接口
     * bizData是业务参数
     */
    @Override
    public ResponseResult getPhonestatus(Map<String, Object> bizData) throws Exception {
        Map<String, Object> commonParams = getCommonParams(method_phoneStatus, InterfaceIdEnum.THIRD_RSLL02);
        commonParams.put("frontId", bizData.get("frontId"));
        return sendMessegeService.sendByThreeChance(SendMethodEnum.RSLL02.getCode(), commonParams, bizData);
    }

    @Autowired
    IRmsService rmsService;

    @Override
    public void saveDatas(String orderNo, PhoneDataTypeEnum type, String value, JSONObject resultJson, Map<String, Object> bizData) {
        String traceId = TraceIDThreadLocal.getTraceID();
        ThreadProvider.getThreadPool().execute(() -> {
            String taskId = rmsService.queryByOrderNo(traceId, orderNo);
            try {
                // 保存数据 Rong360Data
                saveData(new Rong360Data((String) bizData.get("name"), (String) bizData.get("idNumber")
                        , (String) bizData.get("phone"), value, type, resultJson));
                if (StringUtils.isBlank(taskId)) {
                    return;
                }
                // 保存rms数据
                String result = "";
                if (StringUtils.equals(type.getCode(), PhoneDataTypeEnum.THREE_ITEM.getCode())) {
                    result = changeBairongPhone3rdinfo(resultJson);
                }
                if (StringUtils.equals(type.getCode(), PhoneDataTypeEnum.NETWORK_LENGTH.getCode())) {
                    result = changeBairongPhoneNetworkLength(resultJson);
                }
                if (StringUtils.equals(type.getCode(), PhoneDataTypeEnum.NETWORK_STATUS.getCode())) {
                    result = changeBairongPhonestatus(resultJson);
                }
                savePostData(taskId, type.getName(), result, (String) bizData.get("custumType"));
            } catch (Exception e) {
                log.error("traceId={} 保存{}异常", traceId, type.getName(), e);
            }
        });

    }

    @Override
    public void saveRmsDatas(String orderNo, PhoneDataTypeEnum type, JSONObject resultJson, Map<String, Object> bizData) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try {
            ThreadProvider.getThreadPool().execute(() -> {
                String taskId = rmsService.queryByOrderNo(traceId, orderNo);
                try {
                    if (StringUtils.isBlank(taskId)) {
                        return;
                    }
                    // 保存rms数据
                    String result = "";
                    if (StringUtils.equals(type.getCode(), PhoneDataTypeEnum.THREE_ITEM.getCode())) {
                        result = changeBairongPhone3rdinfo(resultJson);
                    }
                    if (StringUtils.equals(type.getCode(), PhoneDataTypeEnum.NETWORK_LENGTH.getCode())) {
                        result = changeBairongPhoneNetworkLength(resultJson);
                    }
                    if (StringUtils.equals(type.getCode(), PhoneDataTypeEnum.NETWORK_STATUS.getCode())) {
                        result = changeBairongPhonestatus(resultJson);
                    }
                    savePostData(taskId, type.getName(), result, (String) bizData.get("custumType"));
                } catch (Exception e) {
                    log.error("traceId={} rms保存{}异常", traceId, type.getName(), e);
                }
            });
        } catch (Exception e) {
            log.error("traceId={} rms保存{}异常", traceId, type.getName(), e);
        }
    }

    @Autowired
    IConfigDao configCacheDao;

    @Override
    public String getValueByDB(String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData) {
        Integer outTime = configCacheDao.getOutTimeUnit(interfaceId);
        List<Rong360Data> report = mongoTemplate.find(new Query(Criteria.where("type").is(type.getCode())
                .and("name").is(bizData.get("name")).and("idCard")
                .is(bizData.get("idNumber")).and("phone")
                .is(bizData.get("phone")).and("createTime").gte(getMinTime(outTime))), Rong360Data.class);
        if (CollectionUtils.isEmpty(report)) {
            return null;
        }
        return report.get(0).getValue();
    }

    @Override
    public String getValueByDBAndSave(String orderNo, String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData) {
        Integer outTime = configCacheDao.getOutTimeUnit(interfaceId);
        List<Rong360Data> report = mongoTemplate.find(new Query(Criteria.where("type").is(type.getCode())
                        .and("name").is(bizData.get("name")).and("idCard")
                        .is(bizData.get("idNumber")).and("phone")
                        .is(bizData.get("phone")).and("createTime").gte(getMinTime(outTime))).with(new Sort(Sort.Direction.DESC, "createTime")),
                Rong360Data.class);
        if (CollectionUtils.isEmpty(report)) {
            return null;
        }
        saveRmsDatas(orderNo, type, report.get(0).getData(), bizData);
        return report.get(0).getValue();
    }

    private Date getMinTime(Integer time) {
        Calendar calendar = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
        calendar.add(Calendar.DAY_OF_MONTH, -1 * time);//取当前日期的前一天.
        return calendar.getTime();
    }

    /**
     * 在网状态转换
     *
     * @param paramJson
     * @return
     */
    private static String changeBairongPhonestatus(JSONObject paramJson) {

        log.info("在网状态转换：" + paramJson.toJSONString());
        String results = paramJson.getString("tianji_api_jiao_phonestatus_response");
        if (StringUtils.isNotBlank(results)) {
            //如果包含[ 则表示接口返回正确
            char[] strChar = results.substring(0, 1).toCharArray();
            char firstStr = strChar[0];
            if (firstStr == '[') {
                JSONArray jsonObject0 = paramJson.getJSONArray("tianji_api_jiao_phonestatus_response");
                JSONObject jsonObject1 = jsonObject0.getJSONObject(0);
                if (null != jsonObject1) {
                    JSONObject jsonObject2 = jsonObject1.getJSONObject("checkResult");
                    if (null != jsonObject2) {
                        //先获取ECL 是否有错误信息(如果接口数据异常会在此返回)
                        JSONArray jsonObjectEcl = jsonObject2.getJSONArray("ECL");
                        if (null != jsonObjectEcl) {
                            if (jsonObjectEcl.size() > 0) {
                                JSONObject jsonObjectEclCode = jsonObjectEcl.getJSONObject(0);
                                String errorCode = jsonObjectEclCode.getString("code");
                                return Rong360PhoneStatusCode.getMsg(errorCode);
                            }
                        }
                        //如果ECL没有返回信息 则获取正常响应信息RSL
                        JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
                        if (null != jsonObject4) {
                            if (jsonObject4.size() <= 0) {
                                return ReturnCode.ERROR_RSLL_PARAMS_ERROR.msg();
                            }
                            JSONObject jsonObject3 = jsonObject2.getJSONObject("ISPNUM");
                            JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
                            JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
                            String jsonOperation0 = jsonObject3.getString("city");
                            String jsonRsult0 = jsonObject6.getString("desc");

                            String jsonOperation = jsonOperation0;
                            String jsonRsult = jsonRsult0;
                            String result = "{\"swift_number\":\"3100034_20170629114811_9744\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"3\",\"costTime\":31},\"flag\":{\"flag_telCheck\":1}}";
                            net.sf.json.JSONObject jsonPhonestatus = net.sf.json.JSONObject.fromObject(result);
                            net.sf.json.JSONObject product = jsonPhonestatus.getJSONObject("product");
                            product.put("result", jsonRsult);
                            product.put("operation", jsonOperation);
                            return jsonPhonestatus.toString();
                        }
                    }
                }
            }
        }
        return "";
    }

    /**
     * 在网时间转换
     *
     * @param paramJson
     * @return
     */
    private static String changeBairongPhoneNetworkLength(JSONObject paramJson) {
        String jsonRsult = "";
        log.info("在网时长转换:" + paramJson.toJSONString());
        JSONObject jsonObject0 = paramJson.getJSONObject("tianji_api_jiao_phonenetworklength_response");
        jsonRsult = jsonObject0.getString("message");
        if (StringUtils.isBlank(jsonRsult)) {
//				先获取ECL 是否有错误信息(如果接口数据异常会在此返回)
            JSONArray jsonObjectEcl = jsonObject0.getJSONArray("ECL");
            if (null != jsonObjectEcl) {
                if (jsonObjectEcl.size() > 0) {
                    JSONObject jsonObjectEclCode = jsonObjectEcl.getJSONObject(0);
                    String errorCode = jsonObjectEclCode.getString("code");
                    return "";
                }
            }
            //如果ECL没有返回信息 则获取正常响应信息RSL
            JSONArray jsonObject4 = jsonObject0.getJSONArray("RSL");
            if (null != jsonObject4) {
                if (jsonObject4.size() <= 0) {
                    return "";
                }
            } else {
                return "";
            }
            JSONObject jsonObject3 = jsonObject0.getJSONObject("ISPNUM");
            JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
            JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
            String jsonOperation0 = jsonObject3.getString("isp");
            String jsonRsult0 = jsonObject6.getString("code");
            String jsonOperation = "";
            if ("电信".equals(jsonOperation0)) {
                jsonOperation = "1";
            } else if ("联通".equals(jsonOperation0)) {
                jsonOperation = "2";
            } else if ("移动".equals(jsonOperation0)) {
                jsonOperation = "3";
            } else {
                jsonOperation = "4";
            }
            if ("03".equals(jsonRsult0) || "04".equals(jsonRsult0)) {
                jsonRsult = "1";
            } else if ("1".equals(jsonRsult0)) {
                jsonRsult = "2";
            } else if ("2".equals(jsonRsult0)) {
                jsonRsult = "3";
            } else if ("3".equals(jsonRsult0)) {
                jsonRsult = "4";
            }
            String result = "{\"swift_number\":\"3100034_20170712173700_9237\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"2\",\"data\":{\"value\":\"3\"},\"costTime\":9},\"flag\":{\"flag_telperiod\":1}}";
            JSONObject jsonNetworkLength = JSONObject.parseObject(result);
            JSONObject product = jsonNetworkLength.getJSONObject("product");
            JSONObject data = product.getJSONObject("data");
            data.put("value", jsonRsult);
            product.put("operation", jsonOperation);
            return jsonNetworkLength.toString();
        }
        return "";
    }

    private Map<String, Object> getCommonParams(String method, InterfaceIdEnum interfaceType) {
        Map<String, Object> commonParams = new HashMap<>();
        commonParams.put("method", method);
        String url = "";
        if (isTestEnv) {
            url = sandboxApiUrl;
        } else {
            url = apiUrl;
        }
        commonParams.put("url", url);
        commonParams.put("isTestEnv", isTestEnv);
        commonParams.put("targetId", SystemIdEnum.THIRD_RSLL.getCode());
        commonParams.put("appRongId", appId);
        commonParams.put("appId", appId);
        commonParams.put("interfaceId", interfaceType.getCode());
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        commonParams.put("privateKey", privateKey);
        return commonParams;
    }

    /**
     * 三要素转换
     *
     * @param paramJson
     * @return
     */
    private static String changeBairongPhone3rdinfo(JSONObject paramJson) {
        log.info("三要素转换：" + paramJson.toJSONString());
        String jsonResult = paramJson.getString("tianji_api_jiao_mobilecheck3item_response");
        if (StringUtils.isNotBlank(jsonResult)) {
            //如果包含[ 则表示接口返回正确
            char[] strChar = jsonResult.substring(0, 1).toCharArray();
            char firstStr = strChar[0];
            if (firstStr == '[') {
                JSONArray jsonObject0 = paramJson.getJSONArray("tianji_api_jiao_mobilecheck3item_response");
                JSONObject jsonObject1 = jsonObject0.getJSONObject(0);
                if (null != jsonObject1) {
                    JSONObject jsonObject2 = jsonObject1.getJSONObject("checkResult");
                    if (null != jsonObject2) {
                        //先获取ECL 是否有错误信息(如果接口数据异常会在此返回)
                        JSONArray jsonObjectEcl = jsonObject2.getJSONArray("ECL");
                        if (null != jsonObjectEcl) {
                            if (jsonObjectEcl.size() > 0) {
                                JSONObject jsonObjectEclCode = jsonObjectEcl.getJSONObject(0);
                                String errorCode = jsonObjectEclCode.getString("code");
                                return "";
                            }
                        }
                        //如果ECL没有返回信息 则获取正常响应信息RSL
                        JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
                        if (null != jsonObject4) {
                            if (jsonObject4.size() <= 0) {
                                return "";
                            }
                            JSONObject jsonObject3 = jsonObject2.getJSONObject("ISPNUM");
                            JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
                            JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
                            String jsonOperation0 = jsonObject3.getString("isp");
                            String jsonRsult0 = jsonObject6.getString("code");
                            String jsonOperation = "";
                            if ("电信".equals(jsonOperation0)) {
                                jsonOperation = "1";
                            } else if ("联通".equals(jsonOperation0)) {
                                jsonOperation = "2";
                            } else if ("移动".equals(jsonOperation0)) {
                                jsonOperation = "3";
                            } else {
                                jsonOperation = "4";
                            }

                            String jsonRsult = "";
                            if ("0".equals(jsonRsult0)) {
                                jsonRsult = "1";
                            } else if ("6".equals(jsonRsult0)) {
                                jsonRsult = "2";
                            } else {
                                jsonRsult = "0";
                            }
                            String result = "{\"swift_number\":\"3100034_20170629114811_9744\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"3\",\"costTime\":31},\"flag\":{\"flag_telCheck\":1}}";
                            JSONObject json3rd = JSONObject.parseObject(result);
                            JSONObject product = json3rd.getJSONObject("product");
                            product.put("result", jsonRsult);
                            product.put("operation", jsonOperation);
                            return json3rd.toString();
                        }
                    }
                }
            }
        }
        return "";
    }

    private void savePostData(String taskId, String desc, String data, String type) {
        BrPostData dataBean = new BrPostData.BrDataBuild().createTime(new Date()).taskId(taskId)
                .desc(desc).data(data).interfaceType(type).build();
        riskPostDataService.saveData(dataBean);
    }

    private void saveData(Rong360Data data) {
        log.info("融360 数据开始入库......");
        try {
            mongoTemplate.insert(data);
        } catch (Exception e) {
            log.error("入库失败......", e);
        }
        log.info("融360 数据入库结束......");
    }

}
