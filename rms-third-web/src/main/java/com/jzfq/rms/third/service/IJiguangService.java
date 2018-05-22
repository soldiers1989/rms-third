package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;

/**
 * @author 大连桔子分期科技有限公司
 * @description 集奥服务接口
 */
public interface IJiguangService {


    void saveData(RiskPersonalInfo info, JSONObject data, String orderNo, String channelId, String traceId
            , String yqScore,String wyScore,String fxgxScore,String sumScore,String description);


    JSONObject getData(String name, String idcard, String phone, String orderNo, String channelId);


    ResponseResult getHttpData(String name, String idcard, String phone, String channelId);


}
