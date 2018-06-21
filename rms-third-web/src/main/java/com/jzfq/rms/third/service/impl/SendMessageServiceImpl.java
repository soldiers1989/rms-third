package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.AbstractHandlerFactory;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.service.ISendMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 发送信息服务
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/19 21:49.
 **/
@Service
public class SendMessageServiceImpl extends AbstractHandlerFactory implements ISendMessageService {

    private static Logger logger = LoggerFactory.getLogger(SendMessageServiceImpl.class);


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
            ResponseResult handlerResult = null;
            try {
                result = send(method,params,bizParams);
            } catch (Exception e) {
//                e.printStackTrace();
                logger.info(e.getMessage());
                error=e;
            }finally {
                Map<String,Object> newParams = new HashMap<>();
                newParams.put("bizParams",bizParams);
                newParams.put("response",result);
                newParams.put("params",params);
                try {
                    handlerResult = getResult(method,newParams);
                } catch (Exception e) {
//                    e.printStackTrace();
                    logger.info(e.getMessage());
                    if(error==null){
                        error=e;
                    }
                }
                newParams.put("exception",error);
                newParams.put("handlerResult",handlerResult);
                // 调用日志存入数据库
                monitorService.sendLogToDB(TraceIDThreadLocal.getTraceID(),newParams);
                // 推送监控平台
                monitorService.sendLogToMonitor(TraceIDThreadLocal.getTraceID(),newParams);
            }
            if (result == null) {
                return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.ACTIVE_FAILURE);
            }else {
                if (null == result.getData()) {
                    return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.ACTIVE_FAILURE);
                }
            }

            if(error==null){
                return handlerResult;
            }
        }while(time<3);
        return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.ACTIVE_FAILURE);
    }
}

