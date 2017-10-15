package com.jzfq.rms.third.test;

import com.jzfq.rms.third.common.domain.TSysCode;
import com.jzfq.rms.third.persistence.mapper.TSysCodeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 12:16.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class SystemCodeTest {
    @Autowired
    TSysCodeMapper tSysCodeMapper;
    @Test
    public void test(){
        TSysCode code = tSysCodeMapper.selectByPrimaryKey("1");
        System.out.println(code);
    }
}
