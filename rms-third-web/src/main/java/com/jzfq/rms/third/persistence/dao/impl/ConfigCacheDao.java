package com.jzfq.rms.third.persistence.dao.impl;

import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.support.cache.ICache;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.mchange.v1.lang.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 10:57.
 **/
@Component("configCacheDao")
public class ConfigCacheDao implements IConfigDao {
    @Autowired
    ICountCache interfaceCountCache;

    @Autowired
    ICache prefixCache;

    @Value("${rms.monitor.log.url}")
    private String apiUrl;
    @Override
    public String getMonitorUrl() {
        return (String)prefixCache.readConfigByGroup("rms-third-interface-url","monitor");
    }

    public boolean isDebug() {
        String debug = interfaceCountCache.getValue("debug") ;
        if(StringUtils.isBlank(debug)){
            return false;
        }
        return BooleanUtils.parseBoolean(debug);
    }
}
