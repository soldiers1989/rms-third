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

    @Autowired
    TSysConfigMapper tSysConfigMapper;

    @Override
    public String getAccessTokenUrl() {
        if(StringUtils.isBlank(accessTokenUrl)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(THIRD_URL_JXL_ACCESSTOKEN.code()).andCLevelEqualTo(SYSTEM_CONFIG.code())
                    .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            accessTokenUrl = tSysConfig.get(0).getcValue();
            return accessTokenUrl;
        }
        return accessTokenUrl;
    }

    @Override
    public String getAccessReportStatusUrl() {
        if(StringUtils.isBlank(accessReportStatusUrl)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(THIRD_URL_JXL_ACCESSREPORTSTATUS.code()).andCLevelEqualTo(SYSTEM_CONFIG.code())
                    .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            accessReportStatusUrl = tSysConfig.get(0).getcValue();
            return accessReportStatusUrl;
        }
        return accessReportStatusUrl;
    }

    @Override
    public String getAccessReportDataUrl() {
        if(StringUtils.isBlank(accessReportDataUrl)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(THIRD_URL_JXL_ACCESSREPORTDATA.code()).andCLevelEqualTo(SYSTEM_CONFIG.code())
                    .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            accessReportDataUrl = tSysConfig.get(0).getcValue();
            return accessReportDataUrl;
        }
        return accessReportDataUrl;
    }

    @Override
    public String getAccessRawDataUrl() {
        if(StringUtils.isBlank(accessRawDataUrl)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(THIRD_URL_JXL_ACCESSRAWDATA.code()).andCLevelEqualTo(SYSTEM_CONFIG.code())
                    .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            accessRawDataUrl = tSysConfig.get(0).getcValue();
            return accessRawDataUrl;
        }
        return accessRawDataUrl;
    }

    @Override
    public String getAccessBusiRawDataUrl() {
        if(StringUtils.isBlank(accessBusiRawDataUrl)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(THIRD_URL_JXL_ACCESSBUSIRAWDATA.code()).andCLevelEqualTo(SYSTEM_CONFIG.code())
                    .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            accessBusiRawDataUrl = tSysConfig.get(0).getcValue();
            return accessBusiRawDataUrl;
        }
        return accessBusiRawDataUrl;
    }

}
