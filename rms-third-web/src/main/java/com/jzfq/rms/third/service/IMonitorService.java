package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.dto.ResponseResult;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 系统监控
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/19 21:47.
 **/
@Service
public interface IMonitorService {
    void sendLogToMonitor(String traceId, Map<String, Object> params);

    void sendLogToDB(String traceId, Map<String, Object> params);
}
