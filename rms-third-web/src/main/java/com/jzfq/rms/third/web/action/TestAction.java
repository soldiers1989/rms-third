package com.jzfq.rms.third.web.action;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.utils.UniformInterfaceUtils;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IDbLogService;
import com.jzfq.rms.third.support.log.ILogger;
import com.jzfq.rms.third.support.log.impl.RmsLogger;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import com.jzfq.rms.third.web.action.handler.AbstractRequestHandler;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/11 13:52.
 **/
@RestController
@RequestMapping(value = "/test")
public class TestAction {
    private static final String url = "http://192.168.3.36:8780/inter";
    final protected static ILogger logger = RmsLogger.getFactory(LoggerFactory.getLogger(TestAction.class));
    @Autowired
    IDbLogService dbLogService;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/test1.json")
    public void test1(HttpServletRequest request, HttpServletResponse response) throws BusinessException, ServletException, IOException {


//        Map<String, Object> map = new HashMap<>();
//        map.put("frontId", "49");
//        map.put("channelId", "1");
//        map.put("operationType", "1");
//        map.put("clientType", "1");
//        map.put("financialProductId", "1");
//        Map<String, Object> personalInfo = new HashMap<>();
//        personalInfo.put("mobile", "15398461910");
//        personalInfo.put("name", "严秋俊");
//        personalInfo.put("bankNo", "6217003860024844738");
//        personalInfo.put("certCardNo", "530323199506231910");
//        map.put("personInfo", personalInfo);
//        map.put("orderNo", "1106633711234");//test2205544



        Map<String,Object> map = new HashMap<>();
        map.put("frontId","49");
        map.put("channelId","1");
        map.put("operationType","1");
        map.put("clientType","1");
        map.put("financialProductId","1");
        Map<String ,Object> personalInfo = new HashMap<>();
        personalInfo.put("mobile","15398461910");
        personalInfo.put("name","严秋俊");
        personalInfo.put("bankNo","6217003860024844738");
        personalInfo.put("certCardNo","530323199506231910");
        map.put("personInfo",personalInfo);
        map.put("orderNo","1106633711234");//test22055444
//        ResponseResult dto = rmsThirdService.sendAndHandleRespose("test33020180111172732","1","","1008","01",map);
//        System.out.println(dto);


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
//        personalInfo.put("mobile","15398461912");
//        map.put("personInfo",personalInfo);
//        map.put("orderNo","305677");

        Map<String, Object> params = new HashMap<>();
        params.put("traceID", "test33020180111172732");
        params.put("callSystemID", "1");
        params.put("appId", "1");
        params.put("apiId", "1008");
        params.put("v", "01");
        Long timestamp = System.currentTimeMillis();

        params.put("token", UniformInterfaceUtils.getToken("1", "1008", "93dd7a6468807ade", timestamp));
        params.put("timestamp", timestamp);
        String json = JSONObject.toJSONString(map);
        params.put("params", json);



        ResponseResult result = HttpConnectionManager.doPost(url, params);

//        ResponseResult data = JSONObject.parseObject((String) result.getData(), ResponseResult.class);


    }


}
