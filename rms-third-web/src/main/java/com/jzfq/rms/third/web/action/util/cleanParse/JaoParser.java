package com.jzfq.rms.third.web.action.util.cleanParse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.TThirdJiaoData;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

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
    public static TThirdJiaoData getValueOfRmsPull(JSONObject json, String idCard, String phone, String name, String orderNo, String traceId, Date requestTime) throws Exception {
        try {
            logger.info("手机三要素接口返回数据集奥data：" + json.toJSONString());
            String result = json.getString("data");
            String code = json.getString("code");
            if (StringUtils.isNotBlank(result)) {
                JSONObject jsonObject = json.getJSONObject("data");
                //ECL信息
                JSONArray jsonObjectEcl = jsonObject.getJSONArray("ECL");
                //RSL信息
                JSONArray jsonObjectRsl = jsonObject.getJSONArray("RSL");
                //运营商信息
                JSONObject jsonObjectIsp = jsonObject.getJSONObject("ISPNUM");
                return getData(json, jsonObjectEcl, jsonObjectRsl, jsonObjectIsp, PhoneDataTypeEnum.THREE_ITEM.getCode(),idCard,phone,name,orderNo,traceId,requestTime);
            }
            return null;
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
    public static TThirdJiaoData getNetworkLengthOfRmsPull(JSONObject json,String idCard,String phone,String name,String orderNo,String traceId,Date requestTime) throws Exception {
        String jsonRsult = "";
        try {
            logger.info("v手机在网时长接口返回数据集奥data：" + json.toJSONString());
            JSONObject jsonObject0 = json.getJSONObject("data");
            jsonRsult = jsonObject0.getString("message");
            if (StringUtils.isBlank(jsonRsult)) {
                //先获取ECL 是否有错误信息(如果接口数据异常会在此返回)
                JSONArray jsonObjectEcl = jsonObject0.getJSONArray("ECL");

                //如果ECL没有返回信息 则获取正常响应信息RSL
                JSONArray jsonObjectRsl = jsonObject0.getJSONArray("RSL");
                //运营商信息
                JSONObject jsonObjectIsp = jsonObject0.getJSONObject("ISPNUM");
                return getData(json, jsonObjectEcl, jsonObjectRsl, jsonObjectIsp, PhoneDataTypeEnum.NETWORK_LENGTH.getCode(),idCard,phone,name,orderNo,traceId,requestTime);
            }
            return null;
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
    public static TThirdJiaoData getStatusOfRmsPull(JSONObject json,String idCard,String phone,String name,String orderNo,String traceId,Date requestTime) throws Exception {
        try {
            String jsonRsult = "";
            logger.info("手机在网状态接口返回数据集奥data：" + json.toJSONString());
            String result = json.getString("data");
            if (StringUtils.isNotBlank(result)) {
                JSONObject jsonObject0 = json.getJSONObject("data");
                JSONArray jsonObjectEcl = jsonObject0.getJSONArray("ECL");
                //信息RSL
                JSONArray jsonObjectRsl = jsonObject0.getJSONArray("RSL");
                //运营商信息
                JSONObject jsonObjectIsp = jsonObject0.getJSONObject("ISPNUM");
                return getData(json, jsonObjectEcl, jsonObjectRsl, jsonObjectIsp, PhoneDataTypeEnum.NETWORK_STATUS.getCode(),idCard,phone,name,orderNo,traceId,requestTime);
            }
            return null;

        } catch (Exception e) {
            logger.error("traceId={} 手机在网状态[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }

    public static TThirdJiaoData getData(JSONObject json, JSONArray jsonObjectEcl, JSONArray jsonObjectRsl, JSONObject jsonObjectIsp,
                                         String interfaceType,String idCard,String phone,String name,String orderNo,String traceId,Date requestTime) {
        TThirdJiaoData data = new TThirdJiaoData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-",""));
        data.setcInnerType(interfaceType);//接口类型
        data.setcCode(json.getString("code"));//接口返回code
        data.setcMsg(json.get("msg") == null ? "" : json.getString("msg"));//描述
        data.setcName(name);//姓名
        data.setcIdCard(idCard);//身份证
        data.setcPhone(phone);//电话
        data.setcOrderNo(orderNo);//订单号
        data.setcTraceId(traceId);//流水号
        data.setcCreateTime(requestTime);
        //校验code码 如果非200全部返回
        if (!"200".equals(data.getcCode())) {
            return data;
        }

        //ISP 信息
        if (null != jsonObjectIsp) {
            data.setcProvince(jsonObjectIsp.get("province") == null ? "" : jsonObjectIsp.getString("province").toString());
            data.setcCity(jsonObjectIsp.get("city") == null ? "" : jsonObjectIsp.get("city").toString());
            data.setcIsp(jsonObjectIsp.get("isp") == null ? "" : jsonObjectIsp.get("isp").toString());
        }

        //ECL 信息
        if (null != jsonObjectEcl) {
            if (jsonObjectEcl.size() > 0) {
                JSONObject jsonObjectEclCode = jsonObjectEcl.getJSONObject(0);
                String errorCode = jsonObjectEclCode.getString("code");
                data.setErrorCode(errorCode);
                data.setErrorCode(String.valueOf(ReturnCode.ERROR_RSLL_PARAMS_ERROR.code()));
                return data;
            }
        }

        //RSL 信息
        if (null != jsonObjectRsl) {
            if (jsonObjectRsl.size() < 0) {
                data.setErrorCode(String.valueOf(ReturnCode.ERROR_RSLL_PARAMS_ERROR.code()));
                return data;
            }
            String jsonRsult = "";
            JSONObject jsonObject5 = jsonObjectRsl.getJSONObject(0);
            JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
            String jsonRsult0 = jsonObject6.getString("code");

            //判断是那个接口
            if (interfaceType.equals(PhoneDataTypeEnum.THREE_ITEM.getCode())) {
                //三要素信息
                if ("0".equals(jsonRsult0)) {
                    jsonRsult = PhoneThreeItemEnum.AGREE.getCode();
                } else if (StringUtils.equals("1", jsonRsult0) ||
                        StringUtils.equals("4", jsonRsult0) ||
                        StringUtils.equals("5", jsonRsult0)) {
                    jsonRsult = PhoneThreeItemEnum.UNAGREE.getCode();
                } else {
                    jsonRsult = PhoneThreeItemEnum.OTHER.getCode();
                }
            } else if (interfaceType.equals(PhoneDataTypeEnum.NETWORK_LENGTH.getCode())) {
                //在网时长
                if ("03".equals(jsonRsult0)) {
                    jsonRsult = PhoneNetworkLengthEnum.THREE_MONTH.getCode();
                }
                if ("04".equals(jsonRsult0)) {
                    jsonRsult = PhoneNetworkLengthEnum.SIX_MONTH.getCode();
                }
                if ("1".equals(jsonRsult0)) {
                    jsonRsult = PhoneNetworkLengthEnum.ONE_YEAR.getCode();
                }
                if ("2".equals(jsonRsult0)) {
                    jsonRsult = PhoneNetworkLengthEnum.TWO_YEAR.getCode();
                }
                if ("3".equals(jsonRsult0)) {
                    jsonRsult = PhoneNetworkLengthEnum.OVER_TWO_YEAR.getCode();
                }
                jsonRsult = PhoneNetworkLengthEnum.OTHER.getCode();
            } else if (interfaceType.equals(PhoneDataTypeEnum.NETWORK_STATUS.getCode())) {
                //在网状态
                if ("0".equals(jsonRsult)) {
                    jsonRsult = PhoneStatusEnum.NORMAL.getCode();
                }
                if ("1".equals(jsonRsult)) {
                    jsonRsult = PhoneStatusEnum.UNNORMAL.getCode();
                }
                if ("2".equals(jsonRsult)) {
                    jsonRsult = PhoneStatusEnum.UNNORMAL.getCode();
                }
                if ("3".equals(jsonRsult)) {
                    jsonRsult = PhoneStatusEnum.UNNORMAL.getCode();
                }
                if ("4".equals(jsonRsult)) {
                    jsonRsult = PhoneStatusEnum.UNNORMAL.getCode();
                }
            }
            String desc = jsonObject6.getString("desc");
            data.setcRslCode(jsonRsult);
            data.setcRslDesc(desc);
        }

        return data;


    }


}
