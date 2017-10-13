package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/13 16:46.
 **/
public class Request1001 extends AbstractRequestAuthentication{
    public Request1001(String appId, String apiId, long timestamp, String token, String apiVersion) {
        super(appId, apiId, timestamp, token, apiVersion);
    }

    @Override
    protected void getBizParams(JSONObject httpRequest) {
        setParams((Map<String, Serializable>)httpRequest.get("params"));
    }
}
