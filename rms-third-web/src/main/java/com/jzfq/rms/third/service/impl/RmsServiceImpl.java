package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.service.IRmsService;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 18:22.
 **/
@Service
public class RmsServiceImpl implements IRmsService {
    private static final Logger log = LoggerFactory.getLogger("RmsService");

    @Value("${rms.api.query.taskid.url}")
    private String apiUrl;
    @Override
    public String queryByOrderNo(String traceId, String orderNo) throws RuntimeException{
        Map<String,String> params = new HashMap<>();
        params.put("orderNo",orderNo);
        return postData(traceId, params);
    }

    public String postData(String traceId,Map<String,String> params) throws RuntimeException {
        log.info("traceId:"+traceId+" rms请求参数："+params);
        ResponseResult dto = HttpConnectionManager.doPost(apiUrl,params);

        Object respose = dto.getData();
        if(respose==null||StringUtils.isBlank(respose.toString())){
            throw new RuntimeException("traceId:"+traceId+" 根据订单号查询taskId 返回结果为null");
        }
        JSONObject json = JSONObject.fromObject(respose);
        if(StringUtils.isBlank(json.getString("attach"))){
            throw new RuntimeException("traceId:"+traceId+" 根据订单号查询taskId 返回结果为null");
        }
        log.info("traceId:"+traceId+" rms返回结果："+dto);
        return json.getString("attach");
    }
}
