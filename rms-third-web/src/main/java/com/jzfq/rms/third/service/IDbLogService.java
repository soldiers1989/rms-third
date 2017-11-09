package com.jzfq.rms.third.service;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/2 18:50.
 **/
public interface IDbLogService {

    void writeLogToDB(String traceId, Map<String, Object> params,Map<String,Object> logParams);
}
