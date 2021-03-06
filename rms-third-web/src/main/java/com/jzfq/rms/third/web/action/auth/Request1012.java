package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 18:16.
 **/
public class Request1012 extends AbstractRequest {
    public Request1012(String appId, String apiId, long timestamp, String token, String apiVersion) {
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
