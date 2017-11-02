package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IDbLogService;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws  Exception{
        Map<String , Object> params = new HashMap<>();
        params.put("targetId", SystemIdEnum.THIRD_BR.getCode());
        Map<String , Object> logParams = new HashMap<>();
        logParams.put("interfaceId", InterfaceIdEnum.THIRD_BR01.getCode());
        logParams.put("traceId","");
        logParams.put("systemId","");
        logParams.put("status","");
        logParams.put("message","");
        logParams.put("appId","");
        logParams.put("params","");
        logParams.put("systemIP","");
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
