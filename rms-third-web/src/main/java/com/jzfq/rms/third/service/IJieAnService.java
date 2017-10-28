package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.dto.ResponseResult;
import net.sf.json.JSONObject;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/18 16:48.
 **/
public interface IJieAnService {

    /**
     * 在网时长
     * @param taskId
     * @param bizData
     * @return
     * @throws Exception
     */
    ResponseResult getPhoneNetworkLength(String taskId, Map<String, Object> bizData) throws Exception;

    /**
     * 三要素 运营商实名
     * @param taskId
     * @param bizData
     * @return
     * @throws Exception
     */
    ResponseResult getMobilecheck3item(String taskId, Map<String, Object> bizData) throws Exception;

    /**
     * 在网状态
     * @param taskId
     * @param Object
     * @return
     * @throws Exception
     */
    ResponseResult getPhonestatus(String taskId, Map<String, Object> Object) throws Exception;
}
