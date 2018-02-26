package com.jzfq.rms.third.test;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.TBrTransferLog;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.mongo.MongoTest;
import com.jzfq.rms.third.common.mongo.TongDunData;
import com.jzfq.rms.third.common.mongo.TongDunStringData;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import io.jsonwebtoken.lang.Collections;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/15 17:48.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class MongTester {

    @Autowired
    IConfigDao configCacheDao;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public void test(){
        List<TongDunData> list = getDataByEvent("11066337", "Loan_ios_20170509");
        if(!Collections.isEmpty(list)){
            System.out.println(StringUtil.toJSONString(list.get(0).getApiResp()));
            System.out.println(StringUtil.toJSONString(list.get(0).getRuleDetailResult()));
        }
//        TBrTransferLog log = new TBrTransferLog();
//        log.setcChannel("1111");
//        MongoTest test = new MongoTest();
//        List<TBrTransferLog> list = new ArrayList<>();
//        test.setList(list );
//        list.add(log);
//        mongoTemplate.insert(test);
//        Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_BR01.getCode());
//        List<BairongData> datas = mongoTemplate.find(new Query(Criteria.where("name").is("严秋俊")
//                .and("certCardNo").is("530323199506231910").and("mobile").is("15398461910")
//                .and("createTime").gte(getMinTime(outTime))), BairongData.class);
//        System.out.println(datas);
    }

//    private Date getMinTime(Integer time){
//        Calendar calendar = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
//        calendar.add(Calendar.DAY_OF_MONTH, -1*time);//取当前日期的前一天.
//        return calendar.getTime();
//    }

    public List<TongDunData> getDataByEvent(String orderNo, String eventId) {
        List<TongDunData> datas = mongoTemplate.find(new Query(Criteria.where("orderNo").is(orderNo).and("eventId").is(eventId))
                , TongDunData.class);
        return datas;
    }
}
