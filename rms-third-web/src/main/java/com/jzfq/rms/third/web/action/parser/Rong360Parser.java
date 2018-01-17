package com.jzfq.rms.third.web.action.parser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.enums.PhoneNetworkLengthEnum;
import com.jzfq.rms.third.common.enums.PhoneStatusEnum;
import com.jzfq.rms.third.common.enums.PhoneThreeItemEnum;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.web.action.handler.Request1012Handler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/12 15:55.
 **/
public class Rong360Parser {
    private static final Logger logger = LoggerFactory.getLogger(Rong360Parser.class);
    /**
     * 手机三要素 代码值
     * @param json
     * @return
     */
    public static String getValueOfRmsPull(JSONObject json) throws Exception{
        String jsonRsult="";
        try{
            JSONArray jsonObject0 = json.getJSONArray("tianji_api_jiao_mobilecheck3item_response");
            JSONObject jsonObject1 = jsonObject0.getJSONObject(0);
            JSONObject jsonObject2 = jsonObject1.getJSONObject("checkResult");
            JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
            JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
            JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
            String jsonRsult0=jsonObject6.getString("code");
            if("0".equals(jsonRsult0)){
                jsonRsult = PhoneThreeItemEnum.AGREE.getCode();
            }else if(StringUtils.equals("1",jsonRsult0)||
                    StringUtils.equals("4",jsonRsult0)||
                    StringUtils.equals("5",jsonRsult0)) {
                jsonRsult = PhoneThreeItemEnum.UNAGREE.getCode();
            }else{
                jsonRsult = PhoneThreeItemEnum.OTHER.getCode();
            }
            return jsonRsult;
        } catch (Exception e){
            logger.error("traceId={} 手机三要素[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }

    /**
     * 手机三要素 远程调用key
     * @param bizData
     * @return
     */
    public static  String getRpcControlKey(Map<String, Object> bizData) {
        StringBuilder sb = new StringBuilder("rms_third_1012_");
        sb.append(StringUtil.getStringOfObject(bizData.get("name")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("phone")));
        return sb.toString() ;
    }

    /**
     * 获取在网时长 代码值
     * @param json
     * @return
     */
    public static String getNetworkLengthOfRmsPull(JSONObject json) throws Exception{
        try{
            JSONObject jsonObject0 = json.getJSONObject("tianji_api_jiao_phonenetworklength_response");
            JSONArray jsonObject4 = jsonObject0.getJSONArray("RSL");
            JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
            JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
            String jsonRsult0=jsonObject6.getString("code");
            if("03".equals(jsonRsult0)){
                return PhoneNetworkLengthEnum.THREE_MONTH.getCode();
            }
            if("04".equals(jsonRsult0)){
                return PhoneNetworkLengthEnum.SIX_MONTH.getCode();
            }
            if("1".equals(jsonRsult0)){
                return PhoneNetworkLengthEnum.ONE_YEAR.getCode();
            }
            if("2".equals(jsonRsult0)){
                return PhoneNetworkLengthEnum.TWO_YEAR.getCode();
            }
            if("3".equals(jsonRsult0)){
                return PhoneNetworkLengthEnum.OVER_TWO_YEAR.getCode();
            }
            return PhoneNetworkLengthEnum.OTHER.getCode();
        } catch (Exception e){
            logger.error("traceId={} 手机在网时长[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }
    /**
     * 获取在网时长 远程调用key
     * @param bizData
     * @return
     */
    public static String getRpcKeyOfNetWorkLength(Map<String, Object> bizData){
        StringBuilder sb = new StringBuilder("rms_third_1013_");
        sb.append(StringUtil.getStringOfObject(bizData.get("name")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("phone")));
        return sb.toString() ;
    }

    /**
     * 远程调用key 在网状态
     * @param bizData
     * @return
     */
    public static String getRpcKeyOfStatus(Map<String, Object> bizData){
        StringBuilder sb = new StringBuilder("rms_third_1014_");
        sb.append(StringUtil.getStringOfObject(bizData.get("name")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("phone")));
        return sb.toString() ;
    }

    /**
     * 在网状态 代码值
     * @param json
     * @return
     */
    public static String getStatusOfRmsPull(JSONObject json) throws Exception{
        try{
            JSONArray jsonObject0 = json.getJSONArray("tianji_api_jiao_phonestatus_response");
            JSONObject jsonObject1 = jsonObject0.getJSONObject(0);
            JSONObject jsonObject2 = jsonObject1.getJSONObject("checkResult");
            JSONObject jsonObject3 = jsonObject2.getJSONObject("ISPNUM");
            JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
            JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
            JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
            String jsonRsult=jsonObject6.getString("code");
            if("0".equals(jsonRsult)){
                return PhoneStatusEnum.NORMAL.getCode();
            }
            if("1".equals(jsonRsult)){
                return PhoneStatusEnum.UNNORMAL.getCode();
            }
            if("2".equals(jsonRsult)){
                return PhoneStatusEnum.UNNORMAL.getCode();
            }
            if("3".equals(jsonRsult)){
                return PhoneStatusEnum.UNNORMAL.getCode();
            }
            if("4".equals(jsonRsult)){
                return PhoneStatusEnum.UNNORMAL.getCode();
            }
            return PhoneStatusEnum.OTHER.getCode();
        } catch (Exception e){
            logger.error("traceId={} 手机在网状态[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }
}
