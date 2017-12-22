package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/22 13:35.
 **/
public class RequestP001  extends AbstractRequest{
    public RequestP001(String appId, String apiId, long timestamp, String token, String apiVersion) {
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
