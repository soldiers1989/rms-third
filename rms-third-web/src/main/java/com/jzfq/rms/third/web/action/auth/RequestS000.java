package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

/**
 * 系统接口
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 21:33.
 **/
public class RequestS000 extends AbstractRequestAuthentication {

    public RequestS000(String appId, String apiId, long timestamp, String token, String apiVersion) {
        super(appId, apiId, timestamp, token, apiVersion);
    }

    @Override
    protected void getBizParams(JSONObject httpRequest) {
        System.out.println("hehe");
    }
}
