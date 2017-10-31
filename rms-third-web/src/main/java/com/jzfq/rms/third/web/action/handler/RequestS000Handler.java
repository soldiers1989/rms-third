package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 记录第三方 调用记录
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 21:28.
 **/
@Component("requestS000Handler")
public class RequestS000Handler extends AbstractRequestHandler{
    @Autowired
    IMonitorService monitorService;
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
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws  Exception {
        Map<String , Object> params = new HashMap<>();
        monitorService.sendLogToDB(TraceIDThreadLocal.getTraceID(),params);
        return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
    }
}
