package com.jzfq.rms.third.service;




import net.sf.json.JSONObject;

import java.util.Map;

/**
 *
 * @description 融360服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IRong360Service {
    JSONObject doOpenApiRequest(String method, Map<String, String> params, Map<String, String> bizData) throws Exception;

    JSONObject getPhoneNetworkLength(String taskId, Map<String, String> bizData) throws Exception;

    JSONObject getMobilecheck3item(String taskId, Map<String, String> bizData) throws Exception;

    JSONObject getPhonestatus(String taskId, Map<String, String> bizData) throws Exception;
}
