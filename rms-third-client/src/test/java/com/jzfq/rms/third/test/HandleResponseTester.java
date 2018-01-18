package com.jzfq.rms.third.test;

import com.jzfq.rms.third.client.RmsThirdService;
import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/3 11:47.
 **/
public class HandleResponseTester {
    public static void main(String[] argc){
//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("licensePlatHeader","蒙E");
//        map.put("vin","LVSHFFAL39N039327");
//        ResponseResult dto = rmsThirdService.send("hehe","1","","1001","01",map);
//        System.out.println(""+dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://dev2.rms.third.juzifenqi.com/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        Map<String ,Object> carInfo = new HashMap<>();
//        carInfo.put("certCardNo","440804199303041822");
//        carInfo.put("name","郑土月");
//        carInfo.put("plateNo","桂JDM186");
//        carInfo.put("type","2");
//        map.put("carInfo",carInfo);
//        map.put("orderNo","305582");
//        ResponseResult dto = rmsThirdService.sendAndHandleRespose("123","1","","1002","01",map);
//        System.out.println(dto);

        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/inter");
        Map<String,Object> map = new HashMap<>();
        map.put("frontId","123");
        map.put("custumType","1");
        map.put("idNumber","440804199303041822");
        map.put("name","丽丽");
        map.put("phone","13132233226");
        map.put("orderNo","zhengyy910");
        ResponseResult dto = rmsThirdService.send("test33320180110152907","33","","1013","01",map);
        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://dev2.rms.third.juzifenqi.com/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","19");
//        map.put("custumType","0");
//        map.put("idNumber","412721199003203444");
//        map.put("name","邵莉莉");
//        map.put("phone","18801014677");
//        map.put("orderNo","test333");
//        ResponseResult dto = rmsThirdService.send("test33320180110152907","0","","1013","01",map);
//                System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://dev2.rms.third.juzifenqi.com/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","19");
//        map.put("custumType","0");
//        map.put("idNumber","530323199506231910");
//        map.put("name","严秋俊");
//        map.put("phone","15398461910");
//        map.put("orderNo","test333");
//        ResponseResult dto = rmsThirdService.send("123","1","","1014","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("custumType","0");
//        map.put("idNumber","210282198909062117");
//        map.put("name","高仁鹏");
//        map.put("phone","13130485366");
//        map.put("orderNo","8002386");
//        ResponseResult dto = rmsThirdService.send("123","1","","1015","01",map);
//        System.out.println(dto);


//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("custumType","0");
//        map.put("idNumber","210282198909062117");
//        map.put("name","高仁鹏");
//        map.put("phone","13130485366");
//        map.put("orderNo","8002386");
//        ResponseResult dto = rmsThirdService.send("123","1","","1016","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("custumType","0");
//        map.put("idNumber","210282198909062117");
//        map.put("name","高仁鹏");
//        map.put("phone","13130485366");
//        map.put("orderNo","8002386");
//        ResponseResult dto = rmsThirdService.send("123","1","","1017","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://dev2.rms.third.juzifenqi.com/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","49");
//        map.put("channelId","1");
//        map.put("operationType","2");
//        map.put("clientType","1");
//        map.put("financialProductId","2");
//        Map<String ,Object> personalInfo = new HashMap<>();
//        personalInfo.put("mobile","15398461910");
//        personalInfo.put("name","严秋俊");
//        personalInfo.put("bankNo","6217003860024844738");
//        personalInfo.put("certCardNo","530323199506231910");
//        map.put("personInfo",personalInfo);
//        map.put("orderNo","test330");//test22055444
//        ResponseResult dto = rmsThirdService.sendAndHandleRespose("test33020180111172732","1","","1008","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("appName","jzfq_ios");
//        Map<String ,Object> info = new HashMap<>();
//        info.put("id_number", "370404199006301915");
//        info.put("account_mobile", "15961718173");
//        info.put("account_name", "皮晴晴");
//        map.put("info",info);
//        map.put("orderNo","305582");
//        ResponseResult dto = rmsThirdService.send("123","1","","1009","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://dev2.rms.third.juzifenqi.com/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("channelId","1");
//        map.put("operationType","1");
//        map.put("clientType","1");
//        map.put("financialProductId","1");
//        Map<String ,Object> personalInfo = new HashMap<>();
//        map.put("customerType","0");
//        personalInfo.put("name","严秋俊");
//        personalInfo.put("certCardNo","140502198811102244");
//        personalInfo.put("mobile","15398461910");
//        map.put("personInfo",personalInfo);
//        map.put("orderNo","305677");
//        ResponseResult dto = rmsThirdService.sendAndHandleRespose("123","1","","1011","01",map);
//        System.out.println(dto);


//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("idCard","452626198112023855");
//        map.put("customerName","曾显洋");
//        map.put("phone","15814212227");
//        ResponseResult dto = rmsThirdService.sendAndHandleRespose("123","1","","1004","01",map);
//        System.out.println(dto);


//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("idCard","412721199003203444");
//        map.put("customerName","邵莉莉");
//        map.put("phone","18801014677");
//        ResponseResult dto = rmsThirdService.send("123","1","","1006","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("idCard","210282198909062117");
//        map.put("customerName","高仁鹏");
//        map.put("phone","13130485366");
//        ResponseResult dto = rmsThirdService.send("123","1","","1005","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("idCard","210282198909062117");
//        map.put("customerName","高仁鹏");
//        map.put("phone","13130485366");
//        map.put("category","1");
//        ResponseResult dto = rmsThirdService.send("123","1","","1003","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        ResponseResult dto = rmsThirdService.send("","1","","1018","01",map);
//        System.out.println(""+dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://dev2.rms.third.juzifenqi.com/rms-third/inter");
//        Map<String,Object> logParams = new HashMap<>();
//        logParams.put("targetId", "17");
//        logParams.put("interfaceId", 1);
//        logParams.put("status",2);
//        logParams.put("message",4);
//        logParams.put("params",6);
//        logParams.put("systemIP",null);
//        ResponseResult dto = rmsThirdService.send("HEHE","1","","S000","01",logParams);
//        System.out.println(""+dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("certCardNo","140502198811102244");
//        map.put("name","王亮222dre");
//        map.put("phone","13986671110");
//        map.put("orderNo","305582D");
//        map.put("juzi",false);
//        map.put("channelId","1");
//        map.put("operationType","1");
//        map.put("clientType","2");
//        map.put("financialProductId","1");
//        map.put("serialNo","1234");
//        List apis = new ArrayList<String>();
//        // bairong
//        apis.add("1");
////         tongdun
////        apis.add("2");
//        map.put("apiBox",apis);
//        ResponseResult dto = rmsThirdService.sendAndHandleRespose("1234","36","","1019","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://dev2.rms.third.juzifenqi.com/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("idNumber","412721199003203444");
//        map.put("token","1");
//        map.put("type","1");
//        ResponseResult dto = rmsThirdService.send("test33320180110152907","0","","1007","01",map);
//        System.out.println(dto);
    }
}
