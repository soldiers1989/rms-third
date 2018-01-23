package com.jzfq.rms.third.web.filter;

import com.jzfq.rms.third.common.utils.RequestUtils;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.support.log.ILogger;
import com.jzfq.rms.third.support.log.impl.RmsLogger;
import com.jzfq.rms.third.web.action.GongPingJiaAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public class RequestFilter implements Filter {

    private final static ILogger LOGGER = RmsLogger.getFactory(LoggerFactory.getLogger(RequestFilter.class));

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        long beginTime = System.currentTimeMillis();

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        //记录请求参数
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(TraceIDThreadLocal.getTraceID(), "filter","requestURI:[{}], requestData:[{}]", requestURI, RequestUtils.getRequestData(request));
        }

        chain.doFilter(servletRequest, servletResponse);
        //记录请求执行时长
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(TraceIDThreadLocal.getTraceID(), "filter", "requestURI:[{}], requestExecuteTime:[{}]ms", requestURI, (System.currentTimeMillis() - beginTime));
        }
    }

    @Override
    public void destroy() {

    }
}
