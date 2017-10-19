package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 同盾分
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:18.
 **/
@Component("request1008Handler")
public class Request1008Handler  extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("TongDun");

    @Autowired
    ITdDataService tdDataService;

    /**
     * 是否控制重复调用
     *
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean isCheckRepeat() {
        return false;
    }

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        return true;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws RuntimeException {
        String traceId = request.getParam("traceId").toString();
        String taskId = request.getParam("taskId").toString();
        String fraudId = request.getParam("fraudId").toString();
        RiskPersonalInfo personInfo = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Map<String,Object> queryParams = new HashMap<>();
        queryParams.put("traceId",traceId);
        queryParams.put("taskId",taskId);
        queryParams.put("fraudId",fraudId);
        queryParams.put("personalInfo",personInfo);
        Object data = tdDataService.getTdData(queryParams);
        if(data == null){
            new RuntimeException("traceId=" +traceId+ "同盾分获取结果为null");
        }
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, data);
    }
}
