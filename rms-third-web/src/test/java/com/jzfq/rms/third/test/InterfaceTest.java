package com.jzfq.rms.third.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.utils.HttpTools;
import org.junit.Test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 10:47.
 **/
public class InterfaceTest {
    @Test
    public void test() throws  Exception{
        String url = "http://192.168.1.166:8080/inter";
        Map<String,String> params = new HashMap();
        params.put("appId","com.jzfq.rms");
        params.put("apiId","1001");
        params.put("timestamp","111");
        params.put("token","1111");
        Map<String,Object> map = new HashMap<>();
        map.put("vin","LE4GF4HB8DL254936");
        map.put("licensePlatHeader","京A");
        params.put("params", JSON.toJSONString(map));
        String str = HttpTools.post(url,params,100000,100000);
        ResponseResult res = JSONObject.parseObject(str, ResponseResult.class);
        System.out.println(res.toJsonString());
    }
}
