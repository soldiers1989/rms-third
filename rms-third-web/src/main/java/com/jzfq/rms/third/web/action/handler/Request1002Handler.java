package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IPengYuanService;
import com.jzfq.rms.third.service.IRmsService;
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
 * PengYuan
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 15:35.
 **/
@Component("request1002Handler")
public class Request1002Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1002Handler.class);


    @Autowired
    private IPengYuanService pengYuanService;

    @Autowired
    IRmsService rmsService;

    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String orderNo = (String)params.get("orderNo");
        if(StringUtils.isBlank(orderNo)||params.get("carInfo")==null){
            return false;
        }
        Map<String,Object> carInfo = JSONObject.parseObject(params.get("carInfo").toString(), HashMap.class);
        if(carInfo==null){
            return false;
        }
        return true;
    }

    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws Exception {
        if(StringUtils.equals(request.getApiVersion(),"02")){
            return handler02(request);
        }
        return handler01(request);
    }
    @Autowired
    ICountCache interfaceCountCache;


    Long time = 24*60*60*3L;
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
        // 根据查询数据库


        Map<String,Object> carInfo = JSONObject.parseObject(request.getParam("carInfo").toString(), HashMap.class);
        log.info("traceId="+traceId+" 鹏元车辆信息 params：【"+carInfo+"】");
        Map<String,Object> commonParams = getCommonParams(request);
        String isRepeatKey = getKeyByTaskID(taskId);
        commonParams.put("isRepeatKey",isRepeatKey);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        commonParams.put("isRpc",isRpc);
        ResponseResult result = null;
        try {
            result = pengYuanService.queryPyCarDatas(carInfo,commonParams);
        } catch (Exception e) {
            interfaceCountCache.setFailure(isRepeatKey);
            throw e;
        }
        log.info("traceId="+traceId+" 鹏元车辆信息 结束{} ",result.getMsg());
        if(result.getCode()!= ReturnCode.REQUEST_SUCCESS.code()&&isRpc){
            interfaceCountCache.setFailure(isRepeatKey);
        }
        return result;
    }

    private String getKeyByTaskID(Long taskId){
        return "rms_third_1002_"+taskId;
    }
    /**
     * 版本02 处理器
     * @param request
     * @return
     */
    private ResponseResult handler02(AbstractRequestAuthentication request) throws Exception{
//        String traceId = TraceIDThreadLocal.getTraceID();
//        Map<String,Object> carInfo = JSONObject.parseObject(request.getParam("carInfo").toString(), HashMap.class);
//        log.info("traceId="+traceId+" 鹏元车辆信息 params：【"+carInfo+"】");
//        Map<String,Object> commonParams = getCommonParams(  request);
//        ResponseResult result = pengYuanService.queryPyCarDatas(carInfo,commonParams);
//        log.info("traceId="+traceId+" 鹏元车辆信息 结束{} ",result.getMsg());
//        if(result.getCode()!=ReturnCode.REQUEST_SUCCESS.code()&&isRpc()){
//            //TODO 缓存过期
//
//        }
//        interfaceCountCache.setFailure(getKey(request));
        return null;
    }

    private Map<String,Object> getCommonParams(AbstractRequestAuthentication request){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        commonParams.put("isRpc",this.isRpc());
        String orderNo = request.getParam("orderNo").toString();
        String taskIdStr = rmsService.queryByOrderNo(TraceIDThreadLocal.getTraceID(), orderNo);
        Long taskId = Long.parseLong(taskIdStr);
        commonParams.put("taskId",taskId);
        return commonParams;
    }
}
