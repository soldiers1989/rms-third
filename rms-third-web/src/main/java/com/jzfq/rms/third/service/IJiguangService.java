package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @description 集奥服务接口
 */
public interface IJiguangService {


    void saveData(RiskPersonalInfo info, JSONObject data, String orderNo, String channelId, String traceId
            , Map<String,String> resultMap);


    JSONObject getData(String name, String idcard, String phone, String orderNo, String channelId);


    ResponseResult getHttpData(String name, String idcard, String phone, String channelId);


    void saveErrorData(RiskPersonalInfo info, JSONObject data, String orderNo, String channelId, String traceId
            , Map<String,String> resultMap,String errorCode);
}
