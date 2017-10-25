package com.jzfq.rms.third.persistence.dao.impl;

import com.jzfq.rms.third.persistence.dao.IConfigDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 10:57.
 **/
@Component("configCacheDao")
public class ConfigCacheDao implements IConfigDao {

    @Value("${rms.monitor.log.url}")
    private String apiUrl;
    @Override
    public String getMonitorUrl() {
        return apiUrl;
    }

    @Value("${develop.debug}")
    private boolean debug ;

    public boolean isDebug() {
        return debug;
    }
}
