package com.jzfq.rms.third.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 11:35.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class MongodbTest {
//    @Autowired
//    private MongoTemplate mongoTemplate;

    @Test
    public void test(){
//        List<PengYuan> list = mongoTemplate.find(new Query(Criteria.
//                where("taskId").is(10923).and("idCard").is("110000199001041119")),PengYuan.class);
//        System.out.println(list.size());
    }
}
