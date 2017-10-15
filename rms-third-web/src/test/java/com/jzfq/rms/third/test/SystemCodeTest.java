package com.jzfq.rms.third.test;

import com.jzfq.rms.third.common.domain.TSysCode;
import com.jzfq.rms.third.common.domain.TSysConfig;
import com.jzfq.rms.third.persistence.mapper.TSysCodeMapper;
import com.jzfq.rms.third.persistence.mapper.TSysConfigMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 12:16.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class SystemCodeTest {
    @Autowired
    TSysCodeMapper tSysCodeMapper;
    @Autowired
    TSysConfigMapper tTSysConfigMapper;

    @Test
    public void test(){
//        TSysCode code = tSysCodeMapper.selectByPrimaryKey("000001");
//        System.out.println(code);
        TSysConfig config = new TSysConfig();
        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        config.setcKey("com.jzfq.rms.third.url.pengyuan.pycredit");
        config.setcValue("http://test.pycredit.com:9001/services/WebServiceSingleQuery?wsdl");
        config.setcLevel("1");
        config.setcDescription("鹏元pycredit接口");
        config.setcDel("0");
        config.setcCreateUser("init");
        config.setDtCreateTime(new Date());
        tTSysConfigMapper.insert(config);
    }
}
