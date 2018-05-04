package com.jzfq.rms.third.web.action.parser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/12 15:55.
 **/
public class JaoParser {
    private static final Logger logger = LoggerFactory.getLogger(JaoParser.class);

    /**
     * 手机三要素 代码值1
     *
     * @param json
     * @return
     */
    public static String getValueOfRmsPull(JSONObject json) throws Exception {
        String jsonRsult = "";
        try {
            logger.info("手机三要素接口返回数据集奥data：" + json.toJSONString());
            String result = json.getString("data");
            if (StringUtils.isNotBlank(result)) {
                JSONObject jsonObject = json.getJSONObject("data");
                //先获取ECL 是否有错误信息(如果接口数据异常会在此返回)
                JSONArray jsonObjectEcl = jsonObject.getJSONArray("ECL");
                if (null != jsonObjectEcl) {
                    if (jsonObjectEcl.size() > 0) {
                        JSONObject jsonObjectEclCode = jsonObjectEcl.getJSONObject(0);
                        String errorCode = jsonObjectEclCode.getString("code");
                        if ("-200".equals(errorCode) || "200".equals(errorCode)) {
                            errorCode = "500";
                        }
                        return errorCode;
                    }
                }
                //如果ECL没有返回信息 则获取正常响应信息RSL
                JSONArray jsonObject4 = jsonObject.getJSONArray("RSL");
                if (null != jsonObject4) {
                    if (jsonObject4.size() <= 0) {
                        return String.valueOf(ReturnCode.ERROR_RSLL_PARAMS_ERROR.code());
                    }
                    JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
                    JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
                    String jsonRsult0 = jsonObject6.getString("code");
                    if ("0".equals(jsonRsult0)) {
                        jsonRsult = PhoneThreeItemEnum.AGREE.getCode();
                    } else if (StringUtils.equals("1", jsonRsult0) ||
                            StringUtils.equals("4", jsonRsult0) ||
                            StringUtils.equals("5", jsonRsult0)) {
                        jsonRsult = PhoneThreeItemEnum.UNAGREE.getCode();
                    } else {
                        jsonRsult = PhoneThreeItemEnum.OTHER.getCode();
                    }
                }
            }
            return jsonRsult;
        } catch (Exception e) {
            logger.error("traceId={} 手机三要素[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }

    /**
     * 手机三要素 远程调用key
     *
     * @param bizData
     * @return
     */
    public static String getRpcControlKey(Map<String, Object> bizData) {
        StringBuilder sb = new StringBuilder("rms_third_1012_");
        sb.append(StringUtil.getStringOfObject(bizData.get("realName")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("cid")));
        return sb.toString();
    }

    /**
     * 获取在网时长 代码值
     *
     * @param json
     * @return
     */
    public static String getNetworkLengthOfRmsPull(JSONObject json) throws Exception {
        String jsonRsult = "";
        try {
            logger.info("v手机在网时长接口返回数据集奥data：" + json.toJSONString());
            JSONObject jsonObject0 = json.getJSONObject("data");
            jsonRsult = jsonObject0.getString("message");
            if (StringUtils.isBlank(jsonRsult)) {
                //先获取ECL 是否有错误信息(如果接口数据异常会在此返回)
                JSONArray jsonObjectEcl = jsonObject0.getJSONArray("ECL");
                if (null != jsonObjectEcl) {
                    if (jsonObjectEcl.size() > 0) {
                        JSONObject jsonObjectEclCode = jsonObjectEcl.getJSONObject(0);
                        String errorCode = jsonObjectEclCode.getString("code");
                        if ("-200".equals(errorCode) || "200".equals(errorCode)) {
                            errorCode = "500";
                        }
                        return errorCode;
                    }
                }
                //如果ECL没有返回信息 则获取正常响应信息RSL
                JSONArray jsonObject4 = jsonObject0.getJSONArray("RSL");
                if (jsonObject4 != null) {
                    if (jsonObject4.size() <= 0) {
                        return String.valueOf(ReturnCode.ERROR_RSLL_PARAMS_ERROR.code());
                    }
                    JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
                    JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
                    String jsonRsult0 = jsonObject6.getString("code");
                    if ("03".equals(jsonRsult0)) {
                        return PhoneNetworkLengthEnum.THREE_MONTH.getCode();
                    }
                    if ("04".equals(jsonRsult0)) {
                        return PhoneNetworkLengthEnum.SIX_MONTH.getCode();
                    }
                    if ("1".equals(jsonRsult0)) {
                        return PhoneNetworkLengthEnum.ONE_YEAR.getCode();
                    }
                    if ("2".equals(jsonRsult0)) {
                        return PhoneNetworkLengthEnum.TWO_YEAR.getCode();
                    }
                    if ("3".equals(jsonRsult0)) {
                        return PhoneNetworkLengthEnum.OVER_TWO_YEAR.getCode();
                    }
                    return PhoneNetworkLengthEnum.OTHER.getCode();
                }
            }
            return jsonRsult;
        } catch (Exception e) {
            logger.error("traceId={} 手机在网时长[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }


    /**
     * 获取在网时长 远程调用key
     *
     * @param bizData
     * @return
     */
    public static String getRpcKeyOfNetWorkLength(Map<String, Object> bizData) {
        StringBuilder sb = new StringBuilder("rms_third_1013_");
        sb.append(StringUtil.getStringOfObject(bizData.get("realName")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("cid")));
        return sb.toString();
    }

    /**
     * 远程调用key 在网状态
     *
     * @param bizData
     * @return
     */
    public static String getRpcKeyOfStatus(Map<String, Object> bizData) {
        StringBuilder sb = new StringBuilder("rms_third_1014_");
        sb.append(StringUtil.getStringOfObject(bizData.get("realName")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("cid")));
        return sb.toString();
    }

    /**
     * 在网状态 代码值
     *
     * @param json
     * @return
     */
    public static String getStatusOfRmsPull(JSONObject json) throws Exception {
        try {
            String jsonRsult = "";
            logger.info("手机在网状态接口返回数据集奥data：" + json.toJSONString());
            String result = json.getString("data");
            if (StringUtils.isNotBlank(result)) {
                JSONObject jsonObject0 = json.getJSONObject("data");
                JSONArray jsonObjectEcl = jsonObject0.getJSONArray("ECL");
                if (null != jsonObjectEcl) {
                    if (jsonObjectEcl.size() > 0) {
                        JSONObject jsonObjectEclCode = jsonObjectEcl.getJSONObject(0);
                        String errorCode = jsonObjectEclCode.getString("code");
                        if ("-200".equals(errorCode) || "200".equals(errorCode)) {
                            errorCode = "500";
                        }
                        return errorCode;
                    }
                }
                //如果ECL没有返回信息 则获取正常响应信息RSL
                JSONArray jsonObject4 = jsonObject0.getJSONArray("RSL");
                if (null != jsonObject4) {
                    if (jsonObject4.size() <= 0) {
                        return String.valueOf(ReturnCode.ERROR_RSLL_PARAMS_ERROR.code());
                    }

//                    JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
                    JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
                    JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
                    jsonRsult = jsonObject6.getString("code");
                    if ("0".equals(jsonRsult)) {
                        return PhoneStatusEnum.NORMAL.getCode();
                    }
                    if ("1".equals(jsonRsult)) {
                        return PhoneStatusEnum.UNNORMAL.getCode();
                    }
                    if ("2".equals(jsonRsult)) {
                        return PhoneStatusEnum.UNNORMAL.getCode();
                    }
                    if ("3".equals(jsonRsult)) {
                        return PhoneStatusEnum.UNNORMAL.getCode();
                    }
                    if ("4".equals(jsonRsult)) {
                        return PhoneStatusEnum.UNNORMAL.getCode();
                    }
                }
            }
            return jsonRsult;

        } catch (Exception e) {
            logger.error("traceId={} 手机在网状态[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }
}
