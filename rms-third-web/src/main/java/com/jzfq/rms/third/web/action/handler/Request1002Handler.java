package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.service.IPengYuanService;
import com.jzfq.rms.third.service.IRmsService;
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
    @Autowired
    private IPengYuanService pengYuanService;

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

    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String taskId = (String)params.get("traceId");
        String carInfoStr = (String)params.get("carInfo");

        if(StringUtils.isBlank(taskId)|| !NumberUtils.isNumber(taskId) ||StringUtils.isBlank(carInfoStr)){
            return false;
        }
        Map<String,Object> carInfo = JSONObject.parseObject(carInfoStr, HashMap.class);
        if(carInfo==null){
            return false;
        }
        return true;
    }

    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws RuntimeException {
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
}