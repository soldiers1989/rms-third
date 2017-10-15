package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.service.IPengYuanService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 15:35.
 **/
@Component("request1002Handler")
public class Request1002Handler extends AbstractRequestHandler{
    @Autowired
    private IPengYuanService pengYuanService;
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String taskId = (String)params.get("taskId");
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
        Long taskId = Long.parseLong(request.getParam("taskId").toString());
        Map<String,Object> carInfo = JSONObject.parseObject(request.getParam("carInfo").toString(), HashMap.class);
        log.info("鹏元车辆信息 params：【" + taskId + ":"+carInfo+"】");
        JSONObject data = pengYuanService.queryPengYuanData(taskId,carInfo);
        if(StringUtils.isBlank(data.getString("errorCode"))){
            return new ResponseResult("1002", ReturnCode.REQUEST_SUCCESS,data );
        }
        return new ResponseResult("1002",Integer.parseInt(data.getString("errorCode"))
                ,data.getString("errorMessage"),data);
    }
}
