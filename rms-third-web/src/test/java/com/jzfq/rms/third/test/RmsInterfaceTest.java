package com.jzfq.rms.third.test;

import com.jzfq.rms.third.service.IRmsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 18:45.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class RmsInterfaceTest {
    @Autowired
    IRmsService rmsService;
    @Test
    public void test(){
        String taskId = rmsService.queryByOrderNo("22","142");
        System.out.println(taskId);
    }
}
