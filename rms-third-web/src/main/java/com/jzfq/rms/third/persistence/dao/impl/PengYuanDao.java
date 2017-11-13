package com.jzfq.rms.third.persistence.dao.impl;

import com.jzfq.rms.third.common.domain.TPyCarCheck;
import com.jzfq.rms.third.common.domain.TSysConfig;
import com.jzfq.rms.third.common.domain.example.TPyCarCheckExample;
import com.jzfq.rms.third.common.domain.example.TSysConfigExample;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.persistence.dao.IPengYuanDao;
import com.jzfq.rms.third.persistence.mapper.TPyCarCheckMapper;
import com.jzfq.rms.third.persistence.mapper.TSysConfigMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.jzfq.rms.third.common.enums.ConfigCode.THIRD_URL_PENGYUAN_PYCREDIT;
import static com.jzfq.rms.third.common.enums.ConfigLevelCode.SYSTEM_CONFIG;
import static com.jzfq.rms.third.constant.Constants.IS_DELETE_NO;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 14:30.
 **/
@Component("pengYuanDao")
public class PengYuanDao implements IPengYuanDao{
    private static String pyUrl ;
    @Autowired
    TSysConfigMapper tSysConfigMapper;
    @Autowired
    TPyCarCheckMapper pyCarCheckMapper;
    @Override
    public String getPyUrl() {

        if(StringUtils.isBlank(pyUrl)){
            TSysConfigExample example = new TSysConfigExample();
            TSysConfigExample.Criteria Criteria=example.createCriteria();
            Criteria.andCKeyEqualTo(THIRD_URL_PENGYUAN_PYCREDIT.code()).andCLevelEqualTo(SYSTEM_CONFIG.code())
            .andCDelEqualTo(IS_DELETE_NO);
            List<TSysConfig> tSysConfig = tSysConfigMapper.selectByExample(example);
            if(CollectionUtils.isEmpty(tSysConfig)){
                return null;
            }
            pyUrl = tSysConfig.get(0).getcValue();
            return pyUrl;
        }
        return pyUrl;
    }

    @Override
    public List<TPyCarCheck> getPengYuanData(String name, String documentNo, String lisence, String carType, Integer outTime) {
        TPyCarCheckExample example = new TPyCarCheckExample();
        TPyCarCheckExample.Criteria criteria = example.createCriteria();
        criteria.andCNameEqualTo(name).andCCertcardNoEqualTo(documentNo).andCLicenseNoEqualTo(lisence).andCCarTypeEqualTo(carType);
        Date minTime = getMinTime(outTime);
        criteria.andDtUpdateTimeGreaterThanOrEqualTo(minTime);
        example.setOrderByClause("dt_update_time desc");
        return pyCarCheckMapper.selectByExample(example);
    }

    private Date getMinTime(Integer time){
        Calendar calendar = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
        calendar.add(Calendar.DAY_OF_MONTH, -1*time);//取当前日期的前一天.
        return calendar.getTime();
    }
}
