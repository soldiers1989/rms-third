package com.jzfq.rms.third.service;

import net.sf.json.JSONObject;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/18 16:48.
 **/
public interface IJieAnService {
    /**
     * 接口调用
     * @param params
     * @return
     */
    JSONObject postData(Map<String, String> params) throws Exception;
    /**
     * 在网时长
     * @param user_id
     * @param bizData
     * @return
     * @throws Exception
     */
    JSONObject getPhoneNetworkLength(String user_id, Map<String, String> bizData) throws Exception;

    /**
     *
     * @param user_id
     * @param bizData
     * @return
     * @throws Exception
     */
    JSONObject getMobilecheck3item(String user_id, Map<String, String> bizData) throws Exception;

    /**
     * 在网状态
     * @param user_id
     * @param bizData
     * @return
     * @throws Exception
     */
    JSONObject getPhonestatus(String user_id, Map<String, String> bizData) throws Exception;
}
