package com.jzfq.rms.third.test;

import com.jzfq.rms.third.support.context.SpringWiredContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 10:47.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class InterfaceTest {
    @Test
    public void test() throws  Exception{
//        String url = "http://192.168.1.166:8080/inter";
//        Map<String,Object> params = new HashMap();
//        params.put("appId","com.jzfq.rms");
//        params.put("apiId","1001");
//        params.put("timestamp","111");
//        params.put("token","1111");
//        Map<String,Object> map = new HashMap<>();
//        map.put("vin","LE4GF4HB8DL254936");
//        map.put("licensePlatHeader","京A");
//        params.put("params", JSON.toJSONString(map));
//        String str = HttpTools.post(url,params,100000,100000);
//        ResponseResult res = JSONObject.parseObject(str, ResponseResult.class);
//        System.out.println(res.toJsonString());
//        System.out.println("sssssssssssssssssssssssssss:"+SpringThirdContext.getObject("mongoTemplate"));
        System.out.println("sssssssssssssssssssssssssss:"+ SpringWiredContext.getInstance().getBeanById("springUtil"));
    }
}
