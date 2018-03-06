package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseDTO;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.service.IPushDataService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import com.jzfq.rms.third.web.action.thread.ThreadInterface;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PushDataServiceImpl implements IPushDataService {

    private static final Logger log = LoggerFactory.getLogger(PushDataServiceImpl.class);
    //请求push url
    @Value("${rms.api.push.url}")
    private String apiUrl;
    //私钥key
    @Value("${thirdToCustomer}")
    private String thirdToCustomer;

    @Override
    public void pushData(String traceId,String type,  String score, String mobile,String orderNo) {

        pushDataToRmsPush(traceId,type, score, mobile,orderNo);


    }


    //推百融/同盾数据到push系统

    public void pushDataToRmsPush(String traceId,String type, String result, String mobile,String orderNo) {
        ThreadProvider.getThreadPool().execute(() -> {
            requestPushParams(traceId,result, mobile,orderNo);
        });

    }


    public void requestPushParams(String traceId,String result, String mobile,String orderNo) {

        log.info("推送push系統流水號：", traceId);
        JSONObject jsonData = new JSONObject();
        jsonData.put("brscore", result);
        jsonData.put("mobile", mobile);
        jsonData.put("orderNo",orderNo);

        JSONObject jsonParams = new JSONObject();
        jsonParams.put("pushkey", thirdToCustomer);
        jsonParams.put("sourceID", 1);
        jsonParams.put("targetID", 7);
        jsonParams.put("sendtype", 2);
        jsonParams.put("sendparam", jsonData.toString());
        Map<String, String> map = new HashMap<String, String>();
        map.put("params", jsonParams.toString());
        //開始推送
        postData(traceId, map);
    }


    public String postData(String traceId, Map<String, String> params) throws RuntimeException {
        log.info("traceId:" + traceId + "推送push url" + apiUrl + " 推送數據：" + params);
        ResponseResult dto = HttpConnectionManager.post(apiUrl, params);
        Object respose = dto.getData();
        log.info("推送push返回結果：", respose.toString());
        ResponseDTO responseDTO = JSONObject.parseObject((String) respose, ResponseDTO.class);
        String taskId = (String) responseDTO.getAttach();
        if (StringUtils.isBlank(taskId)) {
            throw new RuntimeException("traceId:" + traceId + " 根据订单号查询taskId 返回结果为null");
        }
        log.info("traceId:" + traceId + " rms返回结果：" + dto);
        return taskId;
    }


}
