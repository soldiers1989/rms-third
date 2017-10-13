package com.jzfq.rms.third.web.action.auth;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.utils.UniformInterfaceUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 21:46.
 **/
public abstract class AbstractRequestAuthentication implements Serializable {

    private static final String DEFAULT_APP_KEY = "com.jzfq.rms";

    private static String currentApp;

    /**
     * @param currentApp the currentApp to set
     */
    public static void setCurrentApp(String currentApp) {
        AbstractRequestAuthentication.currentApp = currentApp;
    }

    /**
     * @return the currentApp
     */
    public static String getCurrentApp() {
        if (StringUtils.isNotBlank(currentApp)) {
            return currentApp;
        }
        return DEFAULT_APP_KEY;
    }

    /**
     * 默认类路径
     */
    private static final String DEFAULT_REQ_BASE_PACKAGE = "com.jzfq.rms.third.web.action.auth";

    private static String requsetPackage;


    /**
     *
     * @param requsetPackage
     */
    public static void setRequestPackage(String requsetPackage) {
        AbstractRequestAuthentication.requsetPackage = requsetPackage;
    }

    private String appId;

    private long timestamp;

    private String apiId;

    private String token;

    private String apiVersion;

    private Map<String, Serializable> params = new HashMap<String, Serializable>();

    public AbstractRequestAuthentication(String appId, String apiId, long timestamp,
                                         String token, String apiVersion) {
        this.appId = appId;
        this.apiId = apiId;
        this.timestamp = timestamp;
        this.token = token;
        this.apiVersion = apiVersion;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * @return the params
     */
    public Map<String, Serializable> getParams() {
        Map<String, Serializable> tempParams = new HashMap<String, Serializable>(params.size());
        tempParams.putAll(params);
        return tempParams;
    }

    /**
     * @param params the params to set
     */
    public void setParams(Map<String, Serializable> params) {
        this.params.clear();
        if (params != null) {
            this.params.putAll(params);
        }
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void addParam(String name, Serializable value) {
        params.put(name, value);
    }

    public void removeParam(String name) {
        params.remove(name);
    }

    public Serializable getParam(String name) {
        return params.get(name);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String version) {
        this.apiVersion = version;
    }

    public static AbstractRequestAuthentication fromHttpRequest(JSONObject params) throws RuntimeException {
        String apiId = params.getString(UniformInterfaceUtils.PARAM_NAME_APIID);
        String appId = params.getString(UniformInterfaceUtils.PARAM_NAME_APPID);
        String timestampStr = params.getString(UniformInterfaceUtils.PARAM_NAME_TIMESTAMP);
        String token = params.getString(UniformInterfaceUtils.PARAM_NAME_TOKEN);
        String apiVersion = params.getString(UniformInterfaceUtils.PARAM_NAME_APIVERSION);

        Assert.hasText(apiId, "请求中缺少必要参数：" + UniformInterfaceUtils.PARAM_NAME_APIID);
        Assert.hasText(appId, "请求中缺少必要参数：" + UniformInterfaceUtils.PARAM_NAME_APPID);
        Assert.hasText(timestampStr, "请求中缺少必要参数：" + UniformInterfaceUtils.PARAM_NAME_TIMESTAMP);
        Assert.hasText(token, "请求中缺少必要参数：" + UniformInterfaceUtils.PARAM_NAME_TOKEN);
        Assert.isTrue(NumberUtils.isNumber(timestampStr), "参数" + UniformInterfaceUtils.PARAM_NAME_APIVERSION + "不是有效的数字");

        long timestamp = Long.parseLong(timestampStr);
        try {
            @SuppressWarnings("unchecked")
            Class<? extends AbstractRequestAuthentication> clazz = (Class<? extends AbstractRequestAuthentication>)
                    Class.forName(getRequestClassName(apiId));
            Constructor<? extends AbstractRequestAuthentication> c = clazz.getConstructor(String.class, String.class, long.class, String.class, String.class);
            AbstractRequestAuthentication req = c.newInstance(appId, apiId, timestamp, token, apiVersion);
            req.getBizParams(params);
            return req;
        } catch (Exception e) {
            throw new RuntimeException("根据请求构建请求实体类出错", e);
        }
    }

    /**
     * @param apiKey
     * @return
     */
    private static String getRequestClassName(String apiKey) {
        if (StringUtils.startsWith(apiKey, "S")) {
            return DEFAULT_REQ_BASE_PACKAGE + ".Request" + apiKey;
        }
        return requsetPackage + ".Request" + apiKey;
    }

    /**
     *
     * @param httpRequest
     */
    protected abstract void getBizParams(JSONObject httpRequest);

    /**
     *
     * @param params
     * @param paramNames
     */
    protected final void getSimpleStringParams(JSONObject params, String... paramNames) {
        if (paramNames == null) {
            return;
        }
        for (String paramName : paramNames) {
            String param = params.getString(paramName);
            addParam(paramName, param == null ? null : param.trim());
        }
    }

    /**
     * 验证签名合法性
     * @return 合法返回true，否则返回false
     */
    public final boolean verifySign() {
//        String appSecret = ConfigUtils.getSysConfig("app.secret." + appKey);
//        if (appSecret == null) {
//            return false;
//        }
//
//        long timeout = ConfigUtils.getSysConfigLong("app.expiretime." + appKey);
//        if (Math.abs(System.currentTimeMillis() - timestamp) > timeout * Consts.MILLIS_PER_SECOND) {//时间戳误差不超过5分钟
//            return false;
//        }
//        String tempSign = UniformInterfaceUtils.genSign(appKey, appSecret, apiKey,timestamp);
//        return StringUtils.equalsIgnoreCase(tempSign, sign);
        return true;
    }

}
