package com.jzfq.rms.third.persistence.dao.impl;

import com.jzfq.rms.third.common.domain.TSysConfig;
import com.jzfq.rms.third.common.domain.example.TSysConfigExample;
import com.jzfq.rms.third.persistence.dao.IJxlDao;
import com.jzfq.rms.third.persistence.mapper.TSysConfigMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

import static com.jzfq.rms.third.common.enums.ConfigCode.*;
import static com.jzfq.rms.third.common.enums.ConfigLevelCode.SYSTEM_CONFIG;
import static com.jzfq.rms.third.constant.Constants.IS_DELETE_NO;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 19:46.
 **/
@Component("jxlDao")
public class JxlDao implements IJxlDao{

    private static String accessReportStatusUrl ;
    private static String accessTokenUrl ;
    private static String accessBusiRawDataUrl ;
    private static String accessReportDataUrl ;
    private static String accessRawDataUrl ;

    private static String accessReportStatusByTokenUrl ;
    private static String accessBusiRawDataByTokenUrl ;
    private static String accessReportDataByTokenUrl ;
    private static String accessRawDataByTokenUrl ;

    @Autowired
    TSysConfigMapper tSysConfigMapper;

    @Override
    public String getAccessTokenUrl() {
        accessTokenUrl = getPrefix(accessTokenUrl, THIRD_URL_JXL_ACCESSTOKEN.code());
        return accessTokenUrl;
    }

    @Override
    public String getAccessReportStatusUrl() {
        accessReportStatusUrl = getPrefix(accessReportStatusUrl, THIRD_URL_JXL_ACCESSREPORTSTATUS.code());
        return accessReportStatusUrl;
    }

    @Override
    public String getAccessReportDataUrl() {
        accessReportDataUrl = getPrefix(accessReportDataUrl, THIRD_URL_JXL_ACCESSREPORTDATA.code());
        return accessReportDataUrl;
    }

    @Override
    public String getAccessRawDataUrl() {
        accessRawDataUrl = getPrefix(accessRawDataUrl, THIRD_URL_JXL_ACCESSRAWDATA.code());
        return accessRawDataUrl;
    }

    @Override
    public String getAccessBusiRawDataUrl() {
        accessBusiRawDataUrl = getPrefix(accessBusiRawDataUrl, THIRD_URL_JXL_ACCESSBUSIRAWDATA.code());
        return accessBusiRawDataUrl;
    }

    @Override
    public String getAccessReportStatusByTokenUrl() {
        accessReportStatusByTokenUrl = getPrefix(accessReportStatusByTokenUrl, THIRD_URL_JXL_ACCESSREPORTSTATUS_TOKEN.code());
        return accessReportStatusByTokenUrl;
    }

    @Override
    public String getAccessReportDataByTokenUrl() {
        accessReportDataByTokenUrl = getPrefix(accessReportDataByTokenUrl, THIRD_URL_JXL_ACCESSREPORTDATA_TOKEN.code());
        return accessReportDataByTokenUrl;
    }

    @Override
    public String getAccessRawDataByTokenUrl() {
        accessRawDataByTokenUrl = getPrefix(accessRawDataByTokenUrl, THIRD_URL_JXL_ACCESSRAWDATA_TOKEN.code());
        return accessRawDataByTokenUrl;
    }

    @Override
    public String getAccessBusiRawDataByTokenUrl() {
        accessBusiRawDataByTokenUrl = getPrefix(accessBusiRawDataByTokenUrl, THIRD_URL_JXL_ACCESSBUSIRAWDATA_TOKEN.code());
        return accessBusiRawDataByTokenUrl;
    }

    private String getPrefix(String cache, String key){
        if(StringUtils.isBlank(cache)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(key).andCLevelEqualTo(SYSTEM_CONFIG.code())
                    .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            return tSysConfig.get(0).getcValue();
        }
        return cache;
    }
}
