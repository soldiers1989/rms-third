package com.jzfq.rms.third.persistence.dao.impl;

import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.support.cache.ICache;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.mchange.v1.lang.BooleanUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

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

//    @Value("${rms.monitor.log.url}")
//    private String apiUrl;
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

    /**
     * 超时时间映射
     */
    private final static Map<String, String> outTimeMapping = new HashMap<String, String>(){
        private static final long serialVersionUID = 8215851505074904567L;
        {
            put(InterfaceIdEnum.THIRD_RSLL03.getCode(), "1");
            put(InterfaceIdEnum.THIRD_RSLL01.getCode(), "2");
            put(InterfaceIdEnum.THIRD_RSLL02.getCode(), "3");
            put(InterfaceIdEnum.THIRD_BR01.getCode(), "4");
            put(InterfaceIdEnum.THIRD_PY01.getCode(), "5");
            put(InterfaceIdEnum.THIRD_GPJ_EVALATION.getCode(), "6");
            put(InterfaceIdEnum.THIRD_JXL02.getCode(), "7");
            put(InterfaceIdEnum.THIRD_JXL03.getCode(), "7");
            put(InterfaceIdEnum.THIRD_JXL04.getCode(), "7");
        }
    };
    /**
     * 外部数据 缓存期（天）
     */
    private final static String STR_THIRD_DATA_OUTTIME_KEY = "jd_external_storage_";
    /**
     * 获取失效时间
     *
     * @param type
     * @return
     */
    @Override
    public Integer getOutTimeUnit(String type) {
        StringBuilder key = new StringBuilder(Constants.STR_DIC_HEADER);
        key.append(STR_THIRD_DATA_OUTTIME_KEY);
        key.append(outTimeMapping.get(type));
        String time = StringUtil.getStringOfObject(prefixCache.readConfig(key.toString()));
        if(StringUtils.isNotBlank(time)&& NumberUtils.isNumber(time)){
            return Integer.parseInt(time);
        }
        return 30;
    }
}
