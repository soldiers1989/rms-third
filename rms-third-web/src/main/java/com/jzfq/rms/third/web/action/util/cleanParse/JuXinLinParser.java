package com.jzfq.rms.third.web.action.util.cleanParse;

import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/15 13:31.
 **/
public class JuXinLinParser {
    /**
     * 获取 主键
     * @param customerName
     * @param idCard
     * @param phone
     * @return
     */
    public static String getPrimaryKey(String customerName,String idCard,String phone, String token){
        if(StringUtils.isNotBlank(token)){
            return token;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(customerName).append("_").append(idCard).append("_").append(phone);
        return sb.toString();
    }

    /**
     * 获取redis key
     * @param name
     * @param idCard
     * @param phone
     * @return
     */
    public static  String getKeyByInfo(String name, String idCard, String phone, String token){
        StringBuilder sb = new StringBuilder("rms_third_1004_");
        if(StringUtils.isNotBlank(token)){
            sb.append(token);
            return sb.toString();
        }
        sb.append(name);
        sb.append("_");
        sb.append(idCard);
        sb.append("_");
        sb.append(phone);
        return sb.toString();
    }

    /**
     * 获取公共参数
     * @param request
     * @return
     */
    public static  Map<String,Object> getCommonParams(AbstractRequest request){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        return commonParams;
    }
}
