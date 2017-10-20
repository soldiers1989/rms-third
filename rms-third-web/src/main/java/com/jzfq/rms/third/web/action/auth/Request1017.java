package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

/**
 * 手机在网时长
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 19:28.
 **/
public class Request1017 extends AbstractRequestAuthentication {

    public Request1017(String appId, String apiId, long timestamp, String token, String apiVersion) {
        super(appId, apiId, timestamp, token, apiVersion);
    }

    /**
     * @param params
     */
    @Override
    protected void getBizParams(JSONObject params) {

    }
}


