package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.io.Serializable;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 20:30.
 **/
public abstract class AbstractRequestHandler {

    /**
     * 日志，子类可访问
     */
    protected final static Logger log = LoggerFactory.getLogger(AbstractRequestHandler.class);

    private boolean rpc;

    protected boolean isRpc() {
        return rpc;
    }

    /**
     * 根据请求查找请求处理器
     * @param request 请求
     * @return 实体处理器，如果request 参数为 null 或找不到合适的处理器则返回 null
     */
    private static AbstractRequestHandler findRequestHandler(AbstractRequest request, ServletContext context) {
        if (request == null) {
            return null;
        }
        String apiId = request.getApiId();
        if ("1012".equals(apiId)) {
            apiId = "1020";
        }else if ("1013".equals(apiId)) {
            apiId = "1021";
        }else if ("1014".equals(apiId)) {
            apiId = "1022";
        }
        try {
            ApplicationContext applicationContext = WebApplicationContextUtils
                    .getWebApplicationContext(context,
                            "org.springframework.web.servlet.FrameworkServlet.CONTEXT.springmvc");
            return (AbstractRequestHandler) applicationContext.getBean("request" + apiId + "Handler");
        } catch (NoSuchBeanDefinitionException e) {
            return null;
        }
    }

    /**
     *
     * @param request
     * @param context
     * @return
     */
    public static ResponseResult handleRequest(AbstractRequest request, ServletContext context)
    throws BusinessException{
        try {
            // 验证身份
            if (!request.verifyToken()) {
                log.warn("请求签名验证不通过！request：{}", request);
                return new ResponseResult("",ReturnCode.ERROR_INVALID_TOKEN);
            }

            AbstractRequestHandler handler = findRequestHandler(request, context);
            if (handler == null) {
                log.warn("找不到合适的请求处理器！request：{}", request);
                return new ResponseResult("",ReturnCode.ERROR_UNKNOWN_API);
            }

            if (!handler.checkParams(request.getParams())) {
                log.warn("请求参数不合法！request：{}", request);
                return new ResponseResult("",ReturnCode.ERROR_INVALID_ARGS);
            }

            if (handler.isCheckRepeat()) {
                boolean rpc = handler.isRpc(request.getParams());
                handler.setRpc(rpc);
            }
            return handler.bizHandle(request);
        } catch (BusinessException e){
            throw e;
        }catch (Throwable t) {
            log.error("处理请求出错！请求：{}", request, t);
            ResponseResult result = new ResponseResult();
            if ("1001".equals(request.getApiId())) {
                result.setCode(200);
                result.setData("49999");
            } else {
                result = new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.ACTIVE_EXCEPTION);
            }
            return result;
        }
    }
    /**
     * 是否远程调用
     * @return 合法返回true，否则返回false
     */
    protected void setRpc(boolean rpc){
        this.rpc = rpc;
    }

    /**
     * 是否远程调用
     * @return 合法返回true，否则返回false
     */
    protected boolean isRpc(Map<String, Serializable> params){
        return true;
    }
    /**
     * 是否控制重复调用
     * @return 合法返回true，否则返回false
     */
    protected  boolean isCheckRepeat(){
        return false;
    }
    /**
     * 检查业务参数是否合法，交由子类实现。
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    protected abstract boolean checkParams(Map<String, Serializable> params);
    /**
     * 业务处理，交由子类实现。
     * @param request 请求实体
     * @return 响应
     */
    protected abstract ResponseResult bizHandle(AbstractRequest request) throws RuntimeException, Exception;
}
