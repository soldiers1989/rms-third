package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.service.ISendMessegeService;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import com.jzfq.rms.third.support.send.ISendHandler;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 发送信息服务
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/19 21:49.
 **/
@Service
public class SendMessegeServiceImpl implements ISendMessegeService{
    @Autowired
    IMonitorService monitorService;
    /**
     * 发送的数据
     *
     * @param method    调用的发送协议方法
     * @param params    需要记录的信息
     * @param bizParams 发送的数据
     * @return
     */
    @Override
    public ResponseResult sendByThreeChance( String method, Map<String, Object> params, Map<String, Object> bizParams) {
        int time = 0;
        ResponseResult result = null;
        do{
            time++;
            Exception error = null;
            try {
                result = send(method,params,bizParams);
            } catch (ClassNotFoundException e) {
                error=e;
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                error=e;
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                error=e;
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                error=e;
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
                error=e;
            }finally {
                params.put("bizParams",bizParams);
                params.put("response",result);
                params.put("exception",error);
                Map<String,Object> newParams = new HashMap<>();
                BeanUtils.copyProperties(params,newParams);
                // 调用日志存入数据库
                monitorService.sendLogToDB(TraceIDThreadLocal.getTraceID(),params);
                // 推送监控平台
                monitorService.sendLogToMonitor(TraceIDThreadLocal.getTraceID(),params);
            }
            if(result.getCode()==ReturnCode.REQUEST_SUCCESS.code()){
                return result;
            }
        }while(time<3);
        return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.ACTIVE_FAILURE);
    }

    private ResponseResult send(String method, Map<String, Object> params, Map<String, Object> bizParams) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<? extends AbstractSendHandler> clazz = (Class<? extends AbstractSendHandler>)
                Class.forName(getHandlerName(method));
        Constructor<? extends AbstractSendHandler> c = clazz.getConstructor();
        ISendHandler handler = c.newInstance();
        handler.init(params,bizParams);
        return send(handler);
    }

    private ResponseResult send(ISendHandler handler){
        return handler.send();
    }

    private String getHandlerName(String method){
        return AbstractSendHandler.getDefaultBasePackage() +"."+ SendMethodEnum.getName(method);
    }
}

