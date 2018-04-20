package com.jzfq.rms.third.support.send;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 15:55.
 **/
public abstract class AbstractSendHandler implements ISendHandler{
    /**
     * 默认类路径
     */
    private static final String DEFAULT_BASE_PACKAGE = "com.jzfq.rms.third.support.send.impl";
    /**
     * 处理参数
     */
    private Map<String,Object> params;
    /**
     * 业务参数
     */
    private Map<String,Object> bizParams;

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public Map<String, Object> getBizParams() {
        return bizParams;
    }

    public void setBizParams(Map<String, Object> bizParams) {
        this.bizParams = bizParams;
    }

    public static String getDefaultBasePackage(){
        return DEFAULT_BASE_PACKAGE;
    }

}
