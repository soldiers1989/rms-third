package com.jzfq.rms.third.persistence.dao.impl;

import com.jzfq.rms.third.common.domain.TSysConfig;
import com.jzfq.rms.third.common.domain.example.TSysConfigExample;
import com.jzfq.rms.third.persistence.dao.ITdDao;
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
 * @date 2017/10/15 21:04.
 **/
@Component("tdDao")
public class TdDao implements ITdDao {
    private static String loginTdScoreUrl ;
    private static String addTdFraudBlackUrl ;

    @Autowired
    TSysConfigMapper tSysConfigMapper;
    @Override
    public String getLoginTdScoreUrl() {
        if(StringUtils.isBlank(loginTdScoreUrl)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(THIRD_URL_TD_LOGINTDSCORE.code()).andCLevelEqualTo(SYSTEM_CONFIG.code())
                    .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            loginTdScoreUrl = tSysConfig.get(0).getcValue();
            return loginTdScoreUrl;
        }
        return loginTdScoreUrl;
    }

    @Override
    public String getAddTdFraudBlackUrl() {
        if(StringUtils.isBlank(addTdFraudBlackUrl)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(THIRD_URL_TD_ADDTDFRAUDBLACK.code()).andCLevelEqualTo(SYSTEM_CONFIG.code())
                    .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            addTdFraudBlackUrl = tSysConfig.get(0).getcValue();
            return addTdFraudBlackUrl;
        }
        return addTdFraudBlackUrl;
    }
}
