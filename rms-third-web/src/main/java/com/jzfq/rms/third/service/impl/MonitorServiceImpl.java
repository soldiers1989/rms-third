package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/19 21:48.
 **/
@Service
public class MonitorServiceImpl implements IMonitorService {
    @Override
    public ResponseResult sendLogToMonitor(String traceId, Map<String, Object> params) {
        ThreadProvider.getThreadPool().execute(() ->  {
            System.out.println(Thread.currentThread().getName()+"记录日志");
        });
        return null;
    }

    @Override
    public ResponseResult sendLogToDB(String traceId, Map<String, Object> params) {
        ThreadProvider.getThreadPool().execute(() ->  {
            System.out.println(Thread.currentThread().getName()+"记录日志");
        });
        return null;
    }
}
