package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJxlDataService;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * 更新用户token
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:16.
 **/
@Component("request1007Handler")
public class Request1007Handler   extends AbstractRequestHandler{
    private static final Logger log = LoggerFactory.getLogger(Request1007Handler.class);
    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String idNumber = (String)params.get("idNumber");
        String token = (String)params.get("token");
        String type = (String)params.get("type");
        boolean check = StringUtils.isBlank(idNumber)||
                StringUtils.isBlank(token)||
                StringUtils.isBlank(type);
        if(check){
            return false;
        }
        return true;
    }

    @Autowired
    IJxlDataService jxlDataService;
    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws RuntimeException {
        String idNumber = (String)request.getParam("idNumber");
        String token = (String)request.getParam("token");
        String type = (String)request.getParam("type");
        jxlDataService.insertToken(idNumber, token, type);
        return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS, null);
    }
}
