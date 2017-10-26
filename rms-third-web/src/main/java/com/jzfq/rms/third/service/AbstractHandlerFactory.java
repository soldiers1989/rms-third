package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ResponseHandlerEnum;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import com.jzfq.rms.third.support.response.IResponseHandler;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import com.jzfq.rms.third.support.send.ISendHandler;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/24 10:35.
 **/
public class AbstractHandlerFactory {
    protected static ResponseResult send(String method, Map<String, Object> params, Map<String, Object> bizParams) throws Exception {
        Class<? extends AbstractSendHandler> clazz = (Class<? extends AbstractSendHandler>)
                Class.forName(getHandlerName(method));
        Constructor<? extends AbstractSendHandler> c = clazz.getConstructor();
        ISendHandler handler = c.newInstance();
        handler.init(params,bizParams);
        return send(handler);
    }

    protected static ResponseResult send(ISendHandler handler) throws Exception{
        return handler.send();
    }

    protected static String getHandlerName(String method){
        return AbstractSendHandler.getDefaultBasePackage() +"."+ SendMethodEnum.getName(method);
    }
    protected static ResponseResult getResult(String method, Map<String, Object> params) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<? extends AbstractResponseHandler> clazz = (Class<? extends AbstractResponseHandler>)
                Class.forName(getResponseHandlerName(method));
        Constructor<? extends AbstractResponseHandler> c = clazz.getConstructor();
        IResponseHandler handler = c.newInstance();
        handler.init(params);
        return getResult(handler);
    }
    protected static ResponseResult getResult(IResponseHandler handler){
        return handler.getResult();
    }
    protected static String getResponseHandlerName(String method){
        return AbstractResponseHandler.getDefaultBasePackage() +"."+ ResponseHandlerEnum.getName(method);
    }
}
