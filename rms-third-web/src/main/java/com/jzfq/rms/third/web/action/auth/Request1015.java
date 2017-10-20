package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSONObject;

/**
 * 捷安 手机三要素
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 19:27.
 **/
public class Request1015 extends AbstractRequestAuthentication {
    public Request1015(String appId, String apiId, long timestamp, String token, String apiVersion) {
        super(appId, apiId, timestamp, token, apiVersion);
    }

    /**
     * @param params
     */
    @Override
    protected void getBizParams(JSONObject params) {

    }
}


