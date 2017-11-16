package com.jzfq.rms.third.test;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.TBrTransferLog;
import com.jzfq.rms.third.common.mongo.MongoTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/15 17:48.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class MongTester {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public void test(){

        TBrTransferLog log = new TBrTransferLog();
        log.setcChannel("1111");
        MongoTest test = new MongoTest();
        List<TBrTransferLog> list = new ArrayList<>();
        test.setList(list );
        list.add(log);
        mongoTemplate.insert(test);
    }
}
