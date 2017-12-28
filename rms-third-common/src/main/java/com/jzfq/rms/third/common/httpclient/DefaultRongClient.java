/*
 * 文 件 名:  DefaultRongClient.java
 * 修 改 人:  chenchong@rong360.com
 * 修改时间:  2016年2月25日
 * 修改内容:  <修改内容>
 */
package com.jzfq.rms.third.common.httpclient;

import com.jzfq.rms.third.common.utils.Base64Utils;
import com.jzfq.rms.third.common.utils.CrawlerUtils;
import com.jzfq.rms.third.common.utils.HttpTools;
import com.jzfq.rms.third.common.utils.RSAUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 默认的请求客户端实现
 * @ClassName:  DefaultRongClient
 * @author 大连桔子分期科技有限公司
 * @date  2017年8月3日
 */
public class DefaultRongClient implements RongClient {
    private String serverUrl	= "";
    private String appId		= "";
    private String version 		= "1.0.0";
    private String privateKey	= "";
    private String charset		= "utf-8";
    private String format 		= "json";
    private String signType 	= "RSA";
    private int connectTimeout 	= 3000;
    private int readTimeout    	= 40000;
    private boolean isDebug 	= false;
    
    public DefaultRongClient(String serverUrl, String appId, String privateKey, String format,
                             String charset, boolean isDebug) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.privateKey = privateKey;
        this.format = format;
        this.isDebug = isDebug;
        this.charset = charset;
        checkParams();
    }
    
    /**
     * 重载方法
     * @throws Exception 
     */
    @Override
    public String execute(Map<String,Object> params) throws Exception {
        if(params==null){
            params = new HashMap<String,Object>();
        }
        params.put("app_id", this.appId);
        params.put("version", this.version);
        params.put("sign_type", this.signType);
        params.put("format", this.format);
        params.put("timestamp", String.valueOf(new Date().getTime()));
        
        //sign处理 RSA加密
        String paramsStr = CrawlerUtils.getSortParams(params);
        printDebugLog("待签名数据：" + paramsStr);
        byte[] bytes = RSAUtils.generateSHA1withRSASigature(paramsStr, privateKey, charset);
        String sign = Base64Utils.encode(bytes);
        printDebugLog("签名后数据：" + sign);
        params.put("sign", sign);
        String result = HttpTools.post(this.serverUrl, params, this.connectTimeout, this.readTimeout);
        printDebugLog("请求返回数据：" + result);
        return result;
    }
    
    private void printDebugLog(String log) {
    	if (isDebug) {
    		System.out.println("[DEBUG]" + log);
    	}
    }
    
    private void checkParams() {
    	if (!StringUtils.isNumeric(appId) || (appId.length() != 7 && !appId.equals("123456"))) {
    		throw new IllegalArgumentException("appid格式不合法！");
    	}
//    	if (!isValidPublicKey()) {
//    		throw new IllegalArgumentException("私钥格式不合法！");
//    	}
    }

	private boolean isValidPublicKey() {
		String[] strs = StringUtils.split(privateKey, "\n");
		for (int index = 0; index < 13; index++) {
			if (index >= strs.length || strs[index].length() != 64) {
				return false;
			}
		}
		if (strs.length < 14 || strs[13].length() != 16) {
			return false;
		}
		return true;
	}
    
}
