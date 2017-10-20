package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.service.ISendMessegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * @param traceId
     * @param method    调用的发送协议方法
     * @param params    需要记录的信息
     * @param bizParams 发送的数据
     * @return
     */
    @Override
    public ResponseResult sendByThreeChance(String traceId, String method, Map<String, Object> params, Map<String, Object> bizParams) {
        int time = 0;
        do{
            time++;
            //TODO 发送data
            // 调用日志存入数据库
            monitorService.sendLogToDB(traceId,params);
            // 推送监控平台
            monitorService.sendLogToMonitor(traceId,params);
            if(1==1){

                return null;
            }
        }while(time<=3);
        return new ResponseResult(traceId, ReturnCode.ACTIVE_FAILURE);
    }
}

