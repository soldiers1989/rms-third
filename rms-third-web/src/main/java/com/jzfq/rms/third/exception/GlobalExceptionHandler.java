package com.jzfq.rms.third.exception;

import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.constant.ResponseCode;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import org.apache.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BusinessException.class)
    public @ResponseBody ResponseResult handleBusinessException(BusinessException e, HttpServletResponse response){
        LOGGER.error("业务异常:{}", e.getMessage());
        ResponseResult bizResp = new ResponseResult(TraceIDThreadLocal.getTraceID(), e.getErrorCode(), e.getMessage());
        return bizResp;
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody ResponseResult handleException(Exception e, HttpServletResponse response) {
        LOGGER.error("程序异常:", e);
        ResponseResult bizResp = new ResponseResult(TraceIDThreadLocal.getTraceID(), ResponseCode.REQUEST_ERROR_PROGRAM_EXCEPTION, e.getMessage());
        return bizResp;
    }
}