package com.jzfq.rms.third.support.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/10 13:15.
 **/
public interface ILogger {
    void trace(String traceID, String messageTypeID,String var1);

    void trace(String traceID, String messageTypeID,String var1, Object var2) ;

    void trace(String traceID, String messageTypeID,String var1, Object var2, Object var3) ;

    void trace(String traceID, String messageTypeID,String var1, Throwable var2) ;

    void trace(String traceID, String messageTypeID,String var1, Object... var2);


    void info(String traceID, String messageTypeID,String var1);

    void info(String traceID, String messageTypeID,String var1, Object var2) ;

    void info(String traceID, String messageTypeID,String var1, Object var2, Object var3) ;

    void info(String traceID, String messageTypeID,String var1, Throwable var2) ;

    void info(String traceID, String messageTypeID,String var1, Object... var2);

    void debug(String traceID, String messageTypeID,String var1);

    void debug(String traceID, String messageTypeID,String var1, Object var2) ;

    void debug(String traceID, String messageTypeID,String var1, Object var2, Object var3) ;

    void debug(String traceID, String messageTypeID,String var1, Throwable var2) ;

    void debug(String traceID, String messageTypeID,String var1, Object... var2);


    void error(String traceID, String messageTypeID,String var1);

    void error(String traceID, String messageTypeID,String var1, Object var2) ;

    void error(String traceID, String messageTypeID,String var1, Object var2, Object var3) ;

    void error(String traceID, String messageTypeID,String var1, Throwable var2) ;

    void error(String traceID, String messageTypeID,String var1, Object... var2);


    void warn(String traceID, String messageTypeID,String var1);

    void warn(String traceID, String messageTypeID,String var1, Object var2) ;

    void warn(String traceID, String messageTypeID,String var1, Object var2, Object var3) ;

    void warn(String traceID, String messageTypeID,String var1, Throwable var2) ;

    void warn(String traceID, String messageTypeID,String var1, Object... var2);

    boolean isInfoEnabled();
}
