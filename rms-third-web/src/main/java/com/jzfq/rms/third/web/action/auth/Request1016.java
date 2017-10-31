package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 捷安 手机在网状态
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 19:28.
 **/
public class Request1016  extends AbstractRequestAuthentication {
    public Request1016(String appId, String apiId, long timestamp, String token, String apiVersion) {
        super(appId, apiId, timestamp, token, apiVersion);
    }

    /**
     * @param params
     */
    @Override
    protected void getBizParams(JSONObject params) {
        String paramsStr = params.getString("params");
        if(paramsStr==null){
            return ;
        }
        Map<String,Serializable> map = JSONObject.parseObject(paramsStr, HashMap.class);
        setParams(map);
    }
}
