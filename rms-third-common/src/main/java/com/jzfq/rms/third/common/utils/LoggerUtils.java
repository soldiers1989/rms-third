package com.jzfq.rms.third.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public class LoggerUtils {

    public static void trace(Class<?> clazz, String traceID, String messageTypeID,String var1) {
        MDC.put("traceId",traceID);
        MDC.put("messageTypeID",messageTypeID);
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.trace(var1);
    }

    public static void trace(Class<?> clazz, String traceID, String messageTypeID,String var1, Object var2) {
        MDC.put("traceId",traceID);
        MDC.put("messageTypeID",messageTypeID);
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.trace(var1, var2);
    }

    public static void trace(Class<?> clazz, String traceID, String messageTypeID,String var1, Object var2, Object var3) {
        MDC.put("traceId",traceID);
        MDC.put("messageTypeID",messageTypeID);
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.trace(var1,   var2,   var3);
    }

    public static void trace(Class<?> clazz, String traceID, String messageTypeID,String var1, Throwable var2) {
        MDC.put("traceId",traceID);
        MDC.put("messageTypeID",messageTypeID);
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.trace(var1,   var2);
    }

    public static void trace(Class<?> clazz, String traceID, String messageTypeID,String var1, Object... var2) {
        MDC.put("traceId",traceID);
        MDC.put("messageTypeID",messageTypeID);
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.trace(var1, var2);
    }
}
