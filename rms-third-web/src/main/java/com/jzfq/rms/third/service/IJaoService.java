package com.jzfq.rms.third.service;




import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;
import com.jzfq.rms.third.common.mongo.JiaoData;
import com.jzfq.rms.third.common.mongo.JiaoErrorData;

import java.util.List;
import java.util.Map;

/**
 *
 * @description 集奥服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IJaoService {
    ResponseResult getPhoneNetworkLength(Map<String, Object> bizData) throws Exception;

    ResponseResult getMobilecheck3item(Map<String, Object> bizData) throws Exception;

    ResponseResult getPhonestatus(Map<String, Object> bizData) throws Exception;

    void saveDatas(String orderNo, PhoneDataTypeEnum type, String value, JSONObject result, Map<String, Object> bizData);

    void saveRmsDatas(String orderNo, PhoneDataTypeEnum type, JSONObject resultJson, Map<String, Object> bizData);

    String getValueByDB(String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData);

    String getValueByDBNew(String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData);

    String getValueByDBAndSave(String orderNo, String interfaceId, PhoneDataTypeEnum type, Map<String, Object> bizData);

    void saveErrorDatas(String orderNo, PhoneDataTypeEnum type, String value, JSONObject result, Map<String, Object> bizData);

    List<JiaoErrorData> getData(String interfaceId,PhoneDataTypeEnum type);


    List<JiaoData> getJaoData(String interfaceId, PhoneDataTypeEnum type);
}
