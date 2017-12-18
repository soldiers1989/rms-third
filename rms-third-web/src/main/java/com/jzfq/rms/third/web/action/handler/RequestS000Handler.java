package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IDbLogService;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 老系统记录日志
 * 记录第三方 调用记录
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 21:28.
 **/
@Component("requestS000Handler")
public class RequestS000Handler extends AbstractRequestHandler {
    @Autowired
    IMonitorService monitorService;
    @Autowired
    IDbLogService dbLogService;
    /**
     * 是否控制重复调用
     *
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean isCheckRepeat() {
        return false;
    }

    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        return true;
    }

    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws  Exception{
        Map<String , Object> params = new HashMap<>();
        params.put("targetId", request.getParam("targetId"));
        Map<String , Object> logParams = new HashMap<>();
        logParams.put("interfaceId", request.getParam("interfaceId"));
        logParams.put("traceId",TraceIDThreadLocal.getTraceID());
        logParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        logParams.put("status",request.getParam("status"));
        logParams.put("message",request.getParam("message"));
        logParams.put("appId",request.getAppId());
        logParams.put("params",request.getParam("params"));
        logParams.put("systemIP",request.getParam("systemIP"));
        try{
            dbLogService.writeLogToDB(TraceIDThreadLocal.getTraceID(),params,logParams);
        }catch (Exception e){
            log.info("{} 记录日志异常 {}",TraceIDThreadLocal.getTraceID(),e);
            throw new RuntimeException(TraceIDThreadLocal.getTraceID()+" 记录日志异常 "
                    +e.getMessage()+ request.getParams());
        }
        return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
    }
}
