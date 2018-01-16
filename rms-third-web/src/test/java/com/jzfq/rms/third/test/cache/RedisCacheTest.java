package com.jzfq.rms.third.test.cache;

import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
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
public class RedisCacheTest {
    @Autowired
    ICountCache interfaceCountCache;

    @Autowired
    ICache prefixCache;

    /**
     * 按照应用划分
     * @param channelId
     * @param financialProductId
     * @param operationType
     * @param clientType
     * @return
     */
    private String getEventId(String channelId, String financialProductId, String operationType, String clientType){
        StringBuilder key = new StringBuilder("dictionary_prefix_");
        key.append("jd_td_event_test").append("_");
        key.append(channelId).append("-").append(financialProductId)
                .append("-").append(clientType).append("-").append(operationType);
        return StringUtil.getStringOfObject(prefixCache.readConfig(key.toString()));
    }
    @Autowired
    IConfigDao configCacheDao;
    @Test
    public void test(){
        Object gpj = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_GPJ_EVALATION.getCode());
        System.out.println(gpj);
//        System.out.print(getEventId("1","1","1","5"));
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

// DEV
//        prefixCache.setConfigByGroup("rms-third-interface-url","monitor","http://dev.rms-monitor.juzifenqi.com/inner/record/save.json");

//        prefixCache.setConfigByGroup("rms-third-interface-url","gpj-evaluation","https://apigw.gongpingjia.com/api/cars/evaluation/juzi/");
//        prefixCache.setConfigByGroup("rms-third-interface-url","gpj-detail-model","http://openapi.gongpingjia.com/api/modeldetail/lastupdated/");

//        prefixCache.setConfigByGroup("rms-third-interface-url","rms-third-interface","http://dev2.rms.third.juzifenqi.com/inter");
//
//        prefixCache.setConfigByGroup("rms-third-interface-url","rms-task-id","http://dev2.rms.juzifenqi.com/rmsToThird/order.json");

        // PRE
//                prefixCache.setConfigByGroup("rms-third-interface-url","monitor","http://pre-rms-monitor.juzifenqi.com/inner/record/save.json");
//                prefixCache.setConfigByGroup("rms-third-interface-url","gpj-evaluation","https://apigw.gongpingjia.com/api/cars/evaluation/juzi/");
//        prefixCache.setConfigByGroup("rms-third-interface-url","gpj-detail-model","http://openapi.gongpingjia.com/api/modeldetail/lastupdated/");
//                prefixCache.setConfigByGroup("rms-third-interface-url","rms-third-interface","http://pre.rms.third.juzifenqi.com/inter");
//                prefixCache.setConfigByGroup("rms-third-interface-url","rms-task-id","http://pre.rms.juzifenqi.com/rmsToThird/order.json");

        //prd
//        prefixCache.setConfigByGroup("rms-third-interface-url","monitor","http://rms.monitor.juzifenqi.com/inner/record/save.json");
//        prefixCache.setConfigByGroup("rms-third-interface-url","gpj-evaluation","https://apigw.gongpingjia.com/api/cars/evaluation/juzi/");
//        prefixCache.setConfigByGroup("rms-third-interface-url","gpj-detail-model","http://openapi.gongpingjia.com/api/modeldetail/lastupdated/");
//        prefixCache.setConfigByGroup("rms-third-interface-url","rms-third-interface","http://rms.third.juzifenqi.com/inter");
//        prefixCache.setConfigByGroup("rms-third-interface-url","rms-task-id","http://rms.juzifenqi.com/rmsToThird/order.json");
    }
}
