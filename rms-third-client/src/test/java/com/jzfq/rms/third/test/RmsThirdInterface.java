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
//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("licensePlatHeader","京A");
//        map.put("vin","LE4GF4HB8DL254936");
//        ResponseResult dto = rmsThirdService.send("","1","","1001","01",map);
//        System.out.println(""+dto);

//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("orderNo","LE4GF4HB8DL254936");
//        Map<String ,Object> carInfo = new HashMap<>();
//        carInfo.put("certCardNo","222");
//        carInfo.put("phone","222");
//        carInfo.put("plateNo","1111");
//        carInfo.put("type","222");
//        map.put("carInfo",carInfo);
//        map.put("orderNo","8002386");
//        ResponseResult dto = rmsThirdService.send("123","1","","1002","01",map);
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


//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("loanType",(byte)1);
//        Map<String ,Object> personalInfo = new HashMap<>();
//        personalInfo.put("name","gaorenpeng");
//        map.put("personInfo",personalInfo);
//        map.put("orderNo","8002386");
//        ResponseResult dto = rmsThirdService.send("123","1","","1008","02",map);
//        System.out.println(dto);

        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
        Map<String,Object> map = new HashMap<>();
        map.put("frontId","111111");
        map.put("loanType",(byte)1);
        Map<String ,Object> personalInfo = new HashMap<>();
        map.put("customerType","0");
        personalInfo.put("name","gaorenpeng");
        map.put("personInfo",personalInfo);
        map.put("orderNo","8002386");
        ResponseResult dto = rmsThirdService.send("123","1","","1011","01",map);
        System.out.println(dto);


//        RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.3.36:8099/rms-third/inter");
//        Map<String,Object> map = new HashMap<>();
//        map.put("frontId","111111");
//        map.put("idCard","210282198909062117");
//        map.put("customerName","高仁鹏");
//        map.put("phone","13130485366");
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
    }
}
