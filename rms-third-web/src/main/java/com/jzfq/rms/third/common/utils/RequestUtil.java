package com.jzfq.rms.third.common.utils;

import com.jzfq.rms.third.common.httpclient.ClientManager;
import com.jzfq.rms.third.common.httpclient.RongClient;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * request类
 * @ClassName:  RequestUtil
 * @author 大连桔子分期科技有限公司
 * @date  2017年8月4日
 */
public class RequestUtil<K, V> {

    public static String request(String method, Map<String, Object> params, Map<String, Object> bizData, String appId,
    		String privateKey, boolean isTestEnv,String url) throws Exception {
    	if (StringUtils.isEmpty(method) || bizData.isEmpty()) {
    		throw new IllegalArgumentException("参数错误！method和biz_data不能为空！");
    	}
    	if (!isValidMethod(method)) {
    		throw new IllegalArgumentException("参数method格式错误！");
    	}
    	checkNull(params);
    	checkNull(bizData);
        params.put("method", method);
        params.put("biz_data", JSONObject.fromObject(bizData).toString());
        RongClient client = ClientManager.createClient(appId, privateKey, isTestEnv, url);
        return client.execute(params);
    }
    
    private static boolean isValidMethod(String method) {
    	String pattern = "\\w+\\.\\w+\\.(\\w+.)?\\w+\\.\\w+";
    	return Pattern.matches(pattern, method);
    }

    private static void checkNull(Map<String, Object> params) {
    	for (Map.Entry entry : params.entrySet()) {
            if (entry.getValue() == null) {
                throw new NullPointerException("参数" + entry.getKey() + "不能为空！");
            }
		}
	}
    
}
