package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统接口
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 21:33.
 **/
public class RequestS000 extends AbstractRequest {

    public RequestS000(String appId, String apiId, long timestamp, String token, String apiVersion) {
        super(appId, apiId, timestamp, token, apiVersion);
    }

    @Override
    protected void getBizParams(JSONObject httpRequest) {
        String paramsStr = httpRequest.getString("params");
        if(paramsStr==null){
            return ;
        }
        Map<String,Serializable> map = JSONObject.parseObject(paramsStr, HashMap.class);
        setParams(map);
    }
}
