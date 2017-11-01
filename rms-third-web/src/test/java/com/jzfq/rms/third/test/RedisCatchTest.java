package com.jzfq.rms.third.test;

import com.jzfq.rms.third.support.cache.ICache;
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

    @Autowired
    ICache prefixCache;

    @Test
    public void test(){
//        interfaceCountCache.setValue("debug","false");
//        prefixCache.setConfig("debug","false");
//        System.out.println(prefixCache.readConfig("debug"));
//        prefixCache.setConfigByGroup("rms-third-interface","gpj_01","false");
//        System.out.println(prefixCache.readConfigByGroup("rms-third","debug"));



//        System.out.println(interfaceCountCache.isRequestOutInterface("test.data"));
//        System.out.println(interfaceCountCache.isRequestOutInterface("test.data"));
//        Object ob = interfaceCountCache.setFailure("test.data");
//        System.out.println(interfaceCountCache.isRequestOutInterface("test.data"));
//        System.out.println(interfaceCountCache.isRequestOutInterface("test.data"));
//        System.out.println("interfaceCountCache"+ob);

// hehehehehehehehehehehehehe
//        prefixCache.setConfigByGroup("rms-third-interface-url","monitor","http://dev.rms-monitor.juzifenqi.com/inner/record/save.json");

//        prefixCache.setConfigByGroup("rms-third-interface-url","gpj-evaluation","https://apigw.gongpingjia.com/api/cars/evaluation/juzi/");
//        prefixCache.setConfigByGroup("rms-third-interface-url","gpj-detail-model","http://openapi.gongpingjia.com/api/modeldetail/lastupdated/");

        prefixCache.setConfigByGroup("rms-third-interface-url","monitor","http://pre-rms-monitor.juzifenqi.com/inner/record/save.json");
    }
}
