/*
 * 文 件 名:  ClientManager.java
 * 修 改 人:  chenchong@rong360.com
 * 修改时间:  2016年2月25日
 * 修改内容:  <修改内容>
 */
package com.jzfq.rms.third.common.httpclient;

/**
 * http client类
 * @ClassName:  ClientManager
 * @author 大连桔子分期科技有限公司
 */
public class ClientManager {
   
	private static String url = "";
	private static String format = "json";
	private static String charset = "utf-8";
	
    public static RongClient createClient(String appId, String privateKey, boolean isTestEnv,String url) {
        return new DefaultRongClient(url, appId, privateKey, format, charset, isTestEnv);
    }
    
}
