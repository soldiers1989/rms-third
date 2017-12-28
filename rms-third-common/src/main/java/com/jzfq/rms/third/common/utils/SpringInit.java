package com.jzfq.rms.third.common.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 22:39.
 **/
public class SpringInit implements ServletContextListener {

    private static WebApplicationContext springContext;

    public SpringInit() {
        super();
    }
    @Override
    public void contextInitialized(ServletContextEvent event) {
        springContext = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
    }

    public static ApplicationContext getApplicationContext() {
        return springContext;
    }



}
