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
import org.apache.commons.lang3.math.NumberUtils;
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
public class Request1002Handler extends AbstractRequestHandler{
    private static final Logger log = LoggerFactory.getLogger("PengYuan");

    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;
    @Autowired
    private IPengYuanService pengYuanService;

    @Autowired
    IRmsService rmsService;

    @Autowired
    ICountCache interfaceCountCache;

    /**
     * 是否控制重复调用
     *
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean isCheckRepeat() {
        return true;
    }

    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String taskId = (String)params.get("traceId");
        String carInfoStr = (String)params.get("carInfo");
        String orderNo = (String)params.get("orderNo");
        if(StringUtils.isBlank(orderNo)||StringUtils.isBlank(carInfoStr)){
            return false;
        }
        Map<String,Object> carInfo = JSONObject.parseObject(carInfoStr, HashMap.class);
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
     * 版本01 处理器
     * @param request
     * @return
     */
    private  ResponseResult handler01(AbstractRequestAuthentication request){
        String traceId = request.getParam("traceId").toString();
        String orderNo = request.getParam("orderNo").toString();
        String taskIdStr = rmsService.queryByOrderNo(traceId, orderNo);
        Long taskId = Long.parseLong(taskIdStr);
        Map<String,Object> carInfo = JSONObject.parseObject(request.getParam("carInfo").toString(), HashMap.class);
        log.info("traceId="+traceId+" 鹏元车辆信息 params：【"+carInfo+"】");
        JSONObject data = pengYuanService.queryPengYuanData(taskId,carInfo);
        log.info("traceId="+traceId+" 鹏元车辆信息 data：【"+data+"】");
        if(StringUtils.isBlank(data.getString("errorCode"))){
            return new ResponseResult(taskIdStr, ReturnCode.REQUEST_SUCCESS,data );
        }
        return new ResponseResult(taskIdStr,Integer.parseInt(data.getString("errorCode"))
                ,data.getString("errorMessage"),data);
    }

    /**
     * 版本02 处理器
     * @param request
     * @return
     */
    private  ResponseResult handler02(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        Map<String,Object> carInfo = JSONObject.parseObject(request.getParam("carInfo").toString(), HashMap.class);
        log.info("traceId="+traceId+" 鹏元车辆信息 params：【"+carInfo+"】");
        Map<String,Object> commonParams = getCommonParams(  request);
        ResponseResult result = pengYuanService.queryPyCarDatas(carInfo,commonParams);
        log.info("traceId="+traceId+" 鹏元车辆信息 结束{} ",result.getMsg());
        return result;
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
