package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
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
        return false;
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
        if(StringUtils.isBlank(orderNo)||params.get("loanType")==null||params.get("personInfo")==null){
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
        return true;
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
    private ResponseResult handler01(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        String taskIdStr = rmsService.queryByOrderNo(traceId, orderNo);
        Long taskId = Long.parseLong(taskIdStr);
        if(taskId==null){
            return new ResponseResult(traceId, ReturnCode.ERROR_TASK_ID_NULL,null);
        }
        Map<String,Object> commonParams = getCommonParams(  request);
        String isRepeatKey = getKeyByTaskID(taskId);
        commonParams.put("isRepeatKey",isRepeatKey);
//        commonParams.put("redisCache",interfaceCountCache);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        commonParams.put("isRpc",isRpc);
        commonParams.put("traceId",traceId);
        commonParams.put("taskId",taskId);
        Object data = tdDataService.getTdData(commonParams);
        if(data == null||isRpc){
            interfaceCountCache.setFailure(isRepeatKey);
            throw new BusinessException("traceId=" +traceId+ "同盾分获取结果为null",true);
        }
        if(data == null){
            throw new BusinessException("traceId=" +traceId+ "远程调用接口中，或数据库中数据为过期，同盾分获取结果为null",true);
        }
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, data);
    }


    private Map<String,Object> getCommonParams(AbstractRequestAuthentication request){
        Integer loanType = (Integer)request.getParam("loanType");
        RiskPersonalInfo personInfo = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Map<String,Object> commonParams = new HashMap<>();

        commonParams.put("personalInfo",personInfo);
        commonParams.put("loanType",loanType);
        return commonParams;
    }

    private String getKeyByTaskID(Long taskId){
        return "rms_third_1008_"+taskId;
    }
    /**
     * 版本02 处理器
     * @param request
     * @return
     */
    private ResponseResult handler02(AbstractRequestAuthentication request) throws Exception{
        return null;
    }

}
