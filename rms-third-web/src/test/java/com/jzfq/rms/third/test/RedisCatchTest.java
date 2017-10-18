package com.jzfq.rms.third.test;

import com.jzfq.rms.third.support.cache.ICountCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 19:59.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class RedisCatchTest {
    @Autowired
    ICountCache interfaceCountCache;

    @Test
    public void test(){
        interfaceCountCache.isRequestOutInterface("test.data");
        Object ob = interfaceCountCache.getValue("test.data");
        System.out.println("interfaceCountCache"+ob);
    }
}
