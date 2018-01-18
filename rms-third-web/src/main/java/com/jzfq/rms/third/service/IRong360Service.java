package com.jzfq.rms.third.service;




import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;

import java.util.Map;

/**
 *
 * @description 融360服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IRong360Service {
    ResponseResult getPhoneNetworkLength(Map<String, Object> bizData) throws Exception;

    ResponseResult getMobilecheck3item(Map<String, Object> bizData) throws Exception;

    ResponseResult getPhonestatus(Map<String, Object> bizData) throws Exception;

    void saveDatas(String orderNo, PhoneDataTypeEnum type, String value, JSONObject result, Map<String, Object> bizData);

    void saveRmsDatas(String orderNo, PhoneDataTypeEnum type, JSONObject resultJson, Map<String, Object> bizData);

    String getValueByDB(String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData);

    String getValueByDBAndSave(String orderNo, String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData);
}
