package com.jzfq.rms.third.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.mongo.JiaoData;
import com.jzfq.rms.third.common.mongo.JiaoErrorData;
import com.jzfq.rms.third.common.mongo.Rong360Data;
import com.jzfq.rms.third.common.utils.DateUtils;
import com.jzfq.rms.third.common.utils.JAoAuthCodeUtil;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.service.*;
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
public class JaoServiceImpl implements IJaoService {

    private static final Logger log = LoggerFactory.getLogger(JaoServiceImpl.class);

    /**
     * 为机构分配的appid，通常是7位数字
     */
    @Value("${jao.url}")
    private String jao_url;

    @Value("${jao.login.url}")
    private String jao_login_url;

    @Value("${jao.rule.name}")
    private String jao_rule_name;

    @Value("${jao.rule.pwd}")
    private String jao_rule_pwd;

    @Value("${jao.rule.uno}")
    private String jao_rule_uno;

    @Value("${jao.encryptionType}")
    private String jao_encryptionType;

    @Value("${jao.encryptionKey}")
    private String jao_encryptionKey;

    @Value("${jao.login.token.key}")
    private String jao_login_token_key;

    @Value("${jao.phone.three.innerIfType}")
    private String jao_phone_three_innerIfType;

    @Value("${jao.phone.length.innerIfType}")
    private String jao_phone_length_innerIfType;

    @Value("${jao.phone.status.innerIfType}")
    private String jao_phone_status_innerIfType;

    @Value("${jao.sys}")
    private String jao_sys;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 是否是测试环境，测试环境会连接测试环境并打印debug信息,false:生产环境；true：沙箱环境
     */
    @Value("${jao.isTestEnv}")
    private boolean isTestEnv;

    @Autowired
    ISendMessageService sendMessegeService;

    @Override
    public void saveErrorDatas(String orderNo, PhoneDataTypeEnum type, String value, JSONObject result, Map<String, Object> bizData) {
        // 保存错误数据 Rong360Data
        saveErrorData(new JiaoErrorData((String) bizData.get("realName"), (String) bizData.get("idNumber")
                , (String) bizData.get("cid"), value, type, result));
    }

    @Autowired
    IRiskPostDataService riskPostDataService;

    /**
     * 机构K入网时长查询接口
     * bizData是业务参数
     */
    @Override
    public ResponseResult getPhoneNetworkLength(Map<String, Object> commonParams) throws Exception {
        Map<String, Object> bizData = getCommonParams();
        commonParams.put("innerIfType", jao_phone_length_innerIfType);
        commonParams.put("authCode", JAoAuthCodeUtil.lpad(jao_rule_uno, 8, '0'));
        commonParams.put("interfaceId", InterfaceIdEnum.JAO22.getCode());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JAO22.getCode(), commonParams, bizData);
    }

    /**
     * 机构K手机号三项验证接口查询
     * bizData是业务参数
     */
    @Override
    public ResponseResult getMobilecheck3item(Map<String, Object> commonParams) throws Exception {
        Map<String, Object> bizData = getCommonParams();
        commonParams.put("innerIfType", jao_phone_three_innerIfType);
        commonParams.put("authCode", JAoAuthCodeUtil.lpad(jao_rule_uno, 8, '0'));
        commonParams.put("interfaceId", InterfaceIdEnum.JAO20.getCode());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JAO20.getCode(), commonParams, bizData);
    }


    /**
     * 机构K手机号手机号码当前状态查询接口
     * bizData是业务参数
     */
    @Override
    public ResponseResult getPhonestatus(Map<String, Object> commonParams) throws Exception {
        Map<String, Object> bizData = getCommonParams();
        commonParams.put("innerIfType", jao_phone_status_innerIfType);
        commonParams.put("authCode", JAoAuthCodeUtil.lpad(jao_rule_uno, 8, '0'));
        commonParams.put("interfaceId", InterfaceIdEnum.JAO21.getCode());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JAO21.getCode(), commonParams, bizData);
    }


    @Autowired
    IRmsService rmsService;

    @Override
    public void saveDatas(String orderNo, PhoneDataTypeEnum type, String value, JSONObject resultJson, Map<String, Object> bizData) {
        String traceId = TraceIDThreadLocal.getTraceID();
        ThreadProvider.getThreadPool().execute(() -> {
            String taskId = rmsService.queryByOrderNo(traceId, orderNo);
//            String taskId = "13154";
            try {
                // 保存数据 Rong360Data
                saveData(new JiaoData((String) bizData.get("realName"), (String) bizData.get("idNumber")
                        , (String) bizData.get("cid"), value, type, resultJson));
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
//                String taskId = "13254";
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
    public String getValueByDBNew(String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData) {
        List<Rong360Data> report = mongoTemplate.find(new Query(Criteria.where("type").is(type.getCode())
                .and("name").is(bizData.get("realName")).and("idCard")
                .is(bizData.get("idNumber")).and("phone")
                .is(bizData.get("cid"))), Rong360Data.class);
        if (CollectionUtils.isEmpty(report)) {
            return null;
        }
        return report.get(0).getValue();
    }

    @Override
    public String getValueByDBAndSave(String orderNo, String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData) {
        Integer outTime = configCacheDao.getOutTimeUnit(interfaceId);
        List<JiaoData> report = mongoTemplate.find(new Query(Criteria.where("type").is(type.getCode())
                        .and("name").is(bizData.get("realName")).and("idCard")
                        .is(bizData.get("idNumber")).and("phone")
                        .is(bizData.get("cid")).and("createTime").gte(getMinTime(outTime))).with(new Sort(Sort.Direction.DESC, "createTime")),
                JiaoData.class);
        if (CollectionUtils.isEmpty(report)) {
            return null;
        }
        saveRmsDatas(orderNo, type, report.get(0).getData(), bizData);
        return report.get(0).getValue();
    }


    @Override
    public List<JiaoErrorData> getData(String interfaceId, PhoneDataTypeEnum type) {
        Integer outTime = configCacheDao.getOutTimeUnit(interfaceId);
        List<JiaoErrorData> report = mongoTemplate.find(new Query(Criteria.where("type").is(type.getCode())
                        .and("createTime").gte(DateUtils.lastDayWholePointDate(new Date())).lt(new Date())).with(new Sort(Sort.Direction.DESC, "createTime")),
                JiaoErrorData.class);
        if (CollectionUtils.isEmpty(report)) {
            return null;
        }
        return report;
    }

    @Override
    public List<JiaoData> getJaoData(String interfaceId, PhoneDataTypeEnum type) {
        List<JiaoData> report = mongoTemplate.find(new Query(Criteria.where("type").is(type.getCode())
                        .and("createTime").gte(DateUtils.str2Date("2018-06-15", DateUtils.DATE_FORMAT_LONG)).lt(new Date())).with(new Sort(Sort.Direction.DESC, "createTime")),
                JiaoData.class);
        if (CollectionUtils.isEmpty(report)) {
            return null;
        }
        return report;
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
        String results = paramJson.getString("data");
        if (StringUtils.isNotBlank(results)) {
            JSONObject jsonObject0 = paramJson.getJSONObject("data");
            //先获取ECL 是否有错误信息(如果接口数据异常会在此返回)
            JSONArray jsonObjectEcl = jsonObject0.getJSONArray("ECL");
            if (null != jsonObjectEcl) {
                if (jsonObjectEcl.size() > 0) {
                    JSONObject jsonObjectEclCode = jsonObjectEcl.getJSONObject(0);
                    String errorCode = jsonObjectEclCode.getString("code");
                    return Rong360PhoneStatusCode.getMsg(errorCode);
                }
            }
            //如果ECL没有返回信息 则获取正常响应信息RSL
            JSONArray jsonObject4 = jsonObject0.getJSONArray("RSL");
            if (null != jsonObject4) {
                if (jsonObject4.size() <= 0) {
                    return ReturnCode.ERROR_RSLL_PARAMS_ERROR.msg();
                }
                JSONObject jsonObject3 = jsonObject0.getJSONObject("ISPNUM");
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
        JSONObject jsonObject0 = paramJson.getJSONObject("data");
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

    private Map<String, Object> getCommonParams() {
        Map<String, Object> commonParams = new HashMap<>();
        commonParams.put("url", jao_url);
        commonParams.put("loginUrl", jao_login_url);
        commonParams.put("dataUrl", jao_url);

        commonParams.put("sys", jao_sys);

        commonParams.put("username", jao_rule_name);
        commonParams.put("password", jao_rule_pwd);
        commonParams.put("uno", jao_rule_uno);


        commonParams.put("encryptionType", jao_encryptionType);
        commonParams.put("encryptionKey", jao_encryptionKey);


        commonParams.put("dsign", 1);

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
        String jsonResult = paramJson.getString("data");
        if (StringUtils.isNotBlank(jsonResult)) {
            JSONObject jsonObject0 = paramJson.getJSONObject("data");
            //先获取ECL 是否有错误信息(如果接口数据异常会在此返回)
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
        return "";
    }

    private void savePostData(String taskId, String desc, String data, String type) {
        BrPostData dataBean = new BrPostData.BrDataBuild().createTime(new Date()).taskId(taskId)
                .desc(desc).data(data).interfaceType(type).build();
        riskPostDataService.saveData(dataBean);
    }

    private void saveData(JiaoData data) {
        log.info("集奥 数据开始入库......");
        try {
            mongoTemplate.insert(data);
        } catch (Exception e) {
            log.error("入库失败......", e);
        }
        log.info("集奥 数据入库结束......");
    }

    private void saveErrorData(JiaoErrorData data) {
        log.info("集奥 返回错误数据开始入库......");
        try {
            mongoTemplate.insert(data);
        } catch (Exception e) {
            log.error("入库失败......", e);
        }
        log.info("集奥 返回错误数据入库结束......");
    }

}
