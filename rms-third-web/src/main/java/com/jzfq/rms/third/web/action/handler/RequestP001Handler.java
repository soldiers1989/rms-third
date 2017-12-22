package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.support.cache.ICache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/22 13:34.
 **/
@Component("requestP001Handler")
public class RequestP001Handler extends AbstractRequestHandler {
    @Autowired
    ICache prefixCache;
    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String key = (String)params.get("key");
        String method = (String)params.get("method");
        String value = (String)params.get("value");
        if(StringUtils.isBlank(key)||StringUtils.isBlank(method)){
            return false;
        }
        if(StringUtils.equals(method, "update")&&StringUtils.isBlank(value)){
            return false;
        }
        return true;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws  Exception {
        String key = request.getParam("key").toString();
        String property = request.getParam("property").toString();
        String method = request.getParam("method").toString();
        ResponseResult responseResult = new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
        if(StringUtils.equals(method,"select")){
            if(StringUtils.isNotBlank(property)){
                responseResult.setData(prefixCache.readConfigByGroup(key, property));
            }else{
                responseResult.setData(prefixCache.readConfig(key));
            }
            return responseResult;
        }
        if(StringUtils.equals(method,"update")){
            String value = request.getParam("value").toString();
            if(StringUtils.isNotBlank(property)){
                prefixCache.setConfigByGroup(key, property,value);
            }else{
                prefixCache.setConfig(key, value);
            }
            return responseResult;
        }
        if(StringUtils.equals(method,"delete")){
            prefixCache.setLoseTime(key,0l);
            return responseResult;
        }
        return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
    }
}
