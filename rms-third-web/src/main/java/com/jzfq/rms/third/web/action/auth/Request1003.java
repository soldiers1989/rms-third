package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * jxl
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 9:32.
 **/
public class Request1003 extends AbstractRequest {
    public Request1003(String appId, String apiId, long timestamp, String token, String apiVersion) {
        super(appId, apiId, timestamp, token, apiVersion);
    }
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
