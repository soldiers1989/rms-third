package com.jzfq.rms.third.support.response.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/23 21:03.
 **/
public class GpjResponseHandler extends AbstractResponseHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult getResult() {

        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String interfaceId = getString(commonParams,"interfaceId");
        if(StringUtils.equals(InterfaceIdEnum.THIRD_GPJ_EVALATION.getCode(),interfaceId)){
            return handleEvaluationResult();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_GPJ_SYNCHRONIZEDATA.getCode(),interfaceId)){
            return handleSyncResult();
        }
        return (ResponseResult)params.get("response");
    }
    ResponseResult handleEvaluationResult(){
        ResponseResult response = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.REQUEST_SUCCESS,null);
        if(response==null){
            result.setCode(ReturnCode.ERROR_RESPONSE_NULL.code());
            result.setMsg(ReturnCode.ERROR_RESPONSE_NULL.msg());
            return result;
        }
        String evaluation = StringUtil.getStringOfObject(response.getData());
        if(!(ReturnCode.REQUEST_SUCCESS.code() == response.getCode())
                ||StringUtils.isBlank(evaluation)){
            result.setCode(ReturnCode.ERROR_THIRD_RRSPONSE_NULL.code());
            result.setMsg(ReturnCode.ERROR_THIRD_RRSPONSE_NULL.msg());
            return result;
        }
        JSONObject evaluationInfo = JSONObject.parseObject(evaluation);
        if(!StringUtils.equals(StringUtil.getStringOfObject(evaluationInfo.get("status")),"success")){
            result.setCode(ReturnCode.ERROR_THIRD_RESPONSE.code());
            result.setMsg(StringUtil.getStringOfObject(evaluationInfo.get("error_code"))
                    +":"
                    +StringUtil.getStringOfObject(evaluationInfo.get("message")));
        }else {
            result.setMsg(StringUtil.getStringOfObject(evaluationInfo.get("message")));
        }
        result.setData(evaluationInfo.get("data"));
        return result;
    }
    private String getString(Map<String,Object> params,String key){
        Object input = params.get(key);
        if(input==null){
            return "N/A";
        }
        return input.toString().trim();
    }
    /**
     * 初始化
     *
     * @param params
     */
    @Override
    public void init(Map<String, Object> params) {
        this.params = params;
    }




    private ResponseResult handleSyncResult(){
        ResponseResult response = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.REQUEST_SUCCESS,null);
        if(response==null){
            result.setCode(ReturnCode.ERROR_RESPONSE_NULL.code());
            result.setMsg(ReturnCode.ERROR_RESPONSE_NULL.msg());
            return result;
        }
        String responseData = StringUtil.getStringOfObject(response.getData());
        if(!(ReturnCode.REQUEST_SUCCESS.code() == response.getCode())
                ||StringUtils.isBlank(responseData)){
            result.setCode(ReturnCode.ERROR_THIRD_RRSPONSE_NULL.code());
            result.setMsg(ReturnCode.ERROR_THIRD_RRSPONSE_NULL.msg());
            return result;
        }
        JSONObject data = JSONObject.parseObject(responseData);
        if(StringUtils.equals(StringUtil.getStringOfObject(data.get("status")),"0")){
            return response;
        }
        result.setCode(ReturnCode.ERROR_THIRD_RESPONSE.code());
        result.setMsg(StringUtil.getStringOfObject(data.get("status"))
                + ":"
                + StringUtil.getStringOfObject(data.get("msg")));
        return result;
    }
}
