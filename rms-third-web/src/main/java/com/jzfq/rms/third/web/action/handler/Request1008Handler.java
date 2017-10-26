package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 同盾分
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:18.
 **/
@Component("request1008Handler")
public class Request1008Handler  extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("TongDun");

    @Autowired
    ITdDataService tdDataService;

    @Autowired
    IRmsService rmsService;
    /**
     * 是否控制重复调用
     *
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean isCheckRepeat() {
        return true;
    }

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String orderNo = (String)params.get("orderNo");
        String loanType = (String)params.get("loanType");
        String personInfo = (String)params.get("personInfo");
        if(StringUtils.isBlank(orderNo)||StringUtils.isBlank(loanType)
                ||StringUtils.isBlank(personInfo)){
            return false;
        }
        return true;
    }
    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;
    @Override
    protected boolean isRpc(Map<String, Serializable> params){
        Map<String,Object> carInfo = JSONObject.parseObject(params.get("carInfo").toString(), HashMap.class);
        String type = carInfo.get("type").toString();
        if (Integer.parseInt(type) <= 9) {
            type = String.format("%02d", Integer.parseInt(type));
        }
        StringBuilder key = new StringBuilder();
        key.append("rms_third_1002_").append(StringUtil.getStringOfObject(type))
                .append(StringUtil.getStringOfObject(carInfo.get("certCardNo")))
                .append(StringUtil.getStringOfObject(carInfo.get("phone")))
                .append(StringUtil.getStringOfObject(carInfo.get("plateNo")));
        return interfaceCountCache.isRequestOutInterface(key.toString(),time);
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws Exception {
        if(StringUtils.equals(request.getApiVersion(),"02")){
            return handler02(request);
        }
        return handler01(request);
    }
    /**
     * 版本01 处理器
     * @param request
     * @return
     */
    private  ResponseResult handler01(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        Byte loanType = (Byte)request.getParam("loanType");
        String taskId = rmsService.queryByOrderNo(traceId, orderNo);
        RiskPersonalInfo personInfo = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Map<String,Object> queryParams = new HashMap<>();
        queryParams.put("traceId",traceId);
        queryParams.put("taskId",taskId);
        queryParams.put("personalInfo",personInfo);
        queryParams.put("loanType",loanType);
        Object data = tdDataService.getTdData(queryParams);
        if(data == null){
            new RuntimeException("traceId=" +traceId+ "同盾分获取结果为null");
        }
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, data);
    }

    /**
     * 版本02 处理器
     * @param request
     * @return
     */
    private  ResponseResult handler02(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        Byte loanType = (Byte)request.getParam("loanType");
        String taskId = rmsService.queryByOrderNo(traceId, orderNo);
        RiskPersonalInfo personInfo = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Map<String,Object> queryParams = new HashMap<>();
        queryParams.put("traceId",traceId);
        queryParams.put("taskId",taskId);
        queryParams.put("personalInfo",personInfo);
        queryParams.put("loanType",loanType);
        Object data = tdDataService.getTdData(queryParams);
        if(data == null){
            new RuntimeException("traceId=" +traceId+ "同盾分获取结果为null");
        }
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, data);
    }
}
