package com.jzfq.rms.third.web.action.parser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.enums.PhoneThreeItemEnum;
import com.jzfq.rms.third.common.utils.StringUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/12 15:55.
 **/
public class Rong360Parser {
    public static String getValueOfRmsPull(JSONObject json){
        JSONArray jsonObject0 = json.getJSONArray("tianji_api_jiao_mobilecheck3item_response");
        JSONObject jsonObject1 = jsonObject0.getJSONObject(0);
        JSONObject jsonObject2 = jsonObject1.getJSONObject("checkResult");
        JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
        JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
        JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
        String jsonRsult0=jsonObject6.getString("code");
        String jsonRsult="";
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
    }

    /**
     * 远程调用key
     * @param bizData
     * @return
     */
    public static  String getRpcControlKey(Map<String, Object> bizData){
        StringBuilder sb = new StringBuilder("rms_third_1012_");
        sb.append(StringUtil.getStringOfObject(bizData.get("name")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("phone")));
        return sb.toString() ;
    }

    /**
     * 远程调用key
     * @param bizData
     * @return
     */
    public static  String getRpcControlKeyByToken(Map<String, Object> bizData){
        StringBuilder sb = new StringBuilder("rms_third_1012_token_");
        sb.append(StringUtil.getStringOfObject(bizData.get("token")));
        return sb.toString() ;
    }

}
