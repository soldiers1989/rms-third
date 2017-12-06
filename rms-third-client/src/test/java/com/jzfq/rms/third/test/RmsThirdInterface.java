package com.jzfq.rms.third.test;

import com.jzfq.rms.third.client.RmsThirdService;
import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/28 16:01.
 **/
public class RmsThirdInterface {
    public static void main(String[] argc){
//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("licensePlatHeader","京A");
//        map.put("vin","LE4GF4HB8DL254936");
//        ResponseResult dto = rmsThirdService.send("hehe","1","","1001","01",map);
//        System.out.println(""+dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        Map<String ,Object> carInfo = new HashMap<>();
//        carInfo.put("certCardNo","372922198811154775");
//        carInfo.put("name","刘士召");
//        carInfo.put("plateNo","辽BC01X7");
//        carInfo.put("type","2");
//        map.put("carInfo",carInfo);
//        map.put("orderNo","305582");
//        ResponseResult dto = rmsThirdService.send("123","1","","1002","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("custumType","0");
//        map.put("idNumber","210282198909062117");
//        map.put("name","高仁鹏");
//        map.put("phone","13130485366");
//        map.put("orderNo","305677");
//        ResponseResult dto = rmsThirdService.send("123","1","","1012","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("custumType","0");
//        map.put("idNumber","210282198909062117");
//        map.put("name","高仁鹏");
//        map.put("phone","13130485366");
//        map.put("orderNo","305677");
//        ResponseResult dto = rmsThirdService.send("123","1","","1013","01",map);
//        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("custumType","0");
//        map.put("idNumber","210282198909062117");
//        map.put("name","高仁鹏");
//        map.put("phone","13130485366");
//        map.put("orderNo","305677");
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

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("loanType",(byte)1);
//        map.put("channel","IOS");
//        Map<String ,Object> personalInfo = new HashMap<>();
//        personalInfo.put("name","gaorenpeng");
//        map.put("personInfo",personalInfo);
//        map.put("orderNo","305582");
//        ResponseResult dto = rmsThirdService.send("123","1","","1008","01",map);
//        System.out.println(dto);

        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
        Map<String,Object> map = new HashMap<>();
        map.put("frontId","111111");
        map.put("appName","jzfq_ios");
        Map<String ,Object> info = new HashMap<>();
        info.put("id_number", "370404199006301915");
        info.put("account_mobile", "15961718173");
        info.put("account_name", "皮晴晴");
        map.put("info",info);
        map.put("orderNo","305582");
        ResponseResult dto = rmsThirdService.send("123","1","","1009","01",map);
        System.out.println(dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.2.163:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("loanType",(byte)2);
//        Map<String ,Object> personalInfo = new HashMap<>();
//        map.put("customerType","0");
//        personalInfo.put("name","王亮");
//        personalInfo.put("certCardNo","140502198811102244");
//        personalInfo.put("mobile","13986671110");
//        map.put("personInfo",personalInfo);
//        map.put("orderNo","305677");
//        ResponseResult dto = rmsThirdService.send("123","1","","1011","01",map);
//        System.out.println(dto);


//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("idCard","412721199003203444");
//        map.put("customerName","邵莉莉");
//        map.put("phone","18801014677");
//        ResponseResult dto = rmsThirdService.send("123","1","","1004","01",map);
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
    }
}
