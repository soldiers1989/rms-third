package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
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
    private static AbstractRequestHandler findRequestHandler(AbstractRequestAuthentication request, ServletContext context) {
        if (request == null) {
            return null;
        }
        String apiId = request.getApiId();
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
    public static ResponseResult handleRequest(AbstractRequestAuthentication request, ServletContext context)
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
                handler.isRpc(request.getParams());
            }

            return handler.bizHandle(request);
        } catch (BusinessException e){
            throw e;
        }catch (Throwable t) {
            log.error("处理请求出错！请求：{}", request, t);
            ResponseResult result = new ResponseResult("",ReturnCode.ACTIVE_EXCEPTION);
            return new ResponseResult("",ReturnCode.ACTIVE_EXCEPTION);
        }

    }
    /**
     * 是否远程调用
     * @return 合法返回true，否则返回false
     */
    protected void isRpc(Map<String, Serializable> params){
        this.rpc = true;
    }
    /**
     * 是否控制重复调用
     * @return 合法返回true，否则返回false
     */
    protected abstract boolean isCheckRepeat();
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
    protected abstract ResponseResult bizHandle(AbstractRequestAuthentication request) throws RuntimeException, Exception;
}
