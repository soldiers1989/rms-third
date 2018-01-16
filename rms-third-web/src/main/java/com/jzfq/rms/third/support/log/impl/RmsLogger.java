package com.jzfq.rms.third.support.log.impl;

import com.jzfq.rms.third.support.log.ILogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/10 13:16.
 **/
public class RmsLogger implements ILogger {

    private Logger logger;

    private RmsLogger(Class<?> clazz){
        logger =  LoggerFactory.getLogger(clazz);
    }

    public static RmsLogger getFactory(Class<?> clazz){
        return new RmsLogger(clazz);
    }

    private void setMDC(String traceID, String messageTypeID){
        MDC.put("traceId",traceID);
        MDC.put("messageTypeID",messageTypeID);
    }
    @Override
    public void trace(String traceID, String messageTypeID, String var1) {
        setMDC(traceID, messageTypeID);
        logger.trace(var1);
    }

    @Override
    public void trace(String traceID, String messageTypeID, String var1, Object var2) {
        setMDC(traceID, messageTypeID);
        logger.trace(var1, var2);
    }

    @Override
    public void trace(String traceID, String messageTypeID, String var1, Object var2, Object var3) {
        setMDC(traceID, messageTypeID);
        logger.trace(var1, var2, var3);
    }

    @Override
    public void trace(String traceID, String messageTypeID, String var1, Throwable var2) {
        setMDC(traceID, messageTypeID);
        logger.trace(var1, var2);
    }

    @Override
    public void trace(String traceID, String messageTypeID, String var1, Object... var2) {
        setMDC(traceID, messageTypeID);
        logger.trace(var1, var2);
    }

    @Override
    public void info(String traceID, String messageTypeID, String var1) {
        setMDC(traceID, messageTypeID);
        logger.info(var1);
    }

    @Override
    public void info(String traceID, String messageTypeID, String var1, Object var2) {
        setMDC(traceID, messageTypeID);
        logger.info(var1, var2);
    }

    @Override
    public void info(String traceID, String messageTypeID, String var1, Object var2, Object var3) {
        setMDC(traceID, messageTypeID);
        logger.info(var1, var2, var3);
    }

    @Override
    public void info(String traceID, String messageTypeID, String var1, Throwable var2) {
        setMDC(traceID, messageTypeID);
        logger.info(var1, var2);
    }

    @Override
    public void info(String traceID, String messageTypeID, String var1, Object... var2) {
        setMDC(traceID, messageTypeID);
        logger.info(var1, var2);
    }

    @Override
    public void debug(String traceID, String messageTypeID, String var1) {
        MDC.put("traceId",traceID);
        MDC.put("messageTypeID",messageTypeID);
        logger.debug(var1);
    }

    @Override
    public void debug(String traceID, String messageTypeID, String var1, Object var2) {
        setMDC(traceID, messageTypeID);
        logger.debug(var1, var2);
    }

    @Override
    public void debug(String traceID, String messageTypeID, String var1, Object var2, Object var3) {
        setMDC(traceID, messageTypeID);
        logger.debug(var1, var2, var3);
    }

    @Override
    public void debug(String traceID, String messageTypeID, String var1, Throwable var2) {
        setMDC(traceID, messageTypeID);
        logger.debug(var1, var2);
    }

    @Override
    public void debug(String traceID, String messageTypeID, String var1, Object... var2) {
        setMDC(traceID, messageTypeID);
        logger.debug(var1, var2);
    }

    @Override
    public void error(String traceID, String messageTypeID, String var1) {
        setMDC(traceID, messageTypeID);
        logger.error(var1);
    }

    @Override
    public void error(String traceID, String messageTypeID, String var1, Object var2) {
        setMDC(traceID, messageTypeID);
        logger.error(var1, var2);
    }

    @Override
    public void error(String traceID, String messageTypeID, String var1, Object var2, Object var3) {
        setMDC(traceID, messageTypeID);
        logger.error(var1, var2, var3);
    }

    @Override
    public void error(String traceID, String messageTypeID, String var1, Throwable var2) {
        setMDC(traceID, messageTypeID);
        logger.error(var1, var2);
    }

    @Override
    public void error(String traceID, String messageTypeID, String var1, Object... var2) {
        setMDC(traceID, messageTypeID);
        logger.error(var1, var2);
    }

    @Override
    public void warn(String traceID, String messageTypeID, String var1) {
        setMDC(traceID, messageTypeID);
        logger.warn(var1);
    }

    @Override
    public void warn(String traceID, String messageTypeID, String var1, Object var2) {
        setMDC(traceID, messageTypeID);
        logger.warn(var1, var2);
    }

    @Override
    public void warn(String traceID, String messageTypeID, String var1, Object var2, Object var3) {
        setMDC(traceID, messageTypeID);
        logger.warn(var1, var2, var3);
    }

    @Override
    public void warn(String traceID, String messageTypeID, String var1, Throwable var2) {
        setMDC(traceID, messageTypeID);
        logger.warn(var1, var2);
    }

    @Override
    public void warn(String traceID, String messageTypeID, String var1, Object... var2) {
        setMDC(traceID, messageTypeID);
        logger.warn(var1, var2);
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }


}
