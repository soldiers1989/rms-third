package com.jzfq.rms.third.support.response.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:43.
 **/
public class BrResponseHandler extends AbstractResponseHandler {
	private static final String SUCCESS_CODE = "00";
    private static final String NO_RESULT_CODE = "100002";
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult getResult() {
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String interfaceId = getString(commonParams,"interfaceId");
        if(StringUtils.equals(InterfaceIdEnum.THIRD_BR01.getCode(),interfaceId)){
            return getBaiRongScore();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_BR03.getCode(),interfaceId)){
            return getLoginToken();
        }
        return (ResponseResult)params.get("response");
    }

    /**
     *
     */
    private ResponseResult getLoginToken(){

        ResponseResult responseResult = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.REQUEST_SUCCESS,Constants.EMPTY_STR);
        if(responseResult==null){
            result.setCode(ReturnCode.ERROR_RESPONSE_NULL.code());
            result.setMsg(ReturnCode.ERROR_RESPONSE_NULL.msg());
            return result;
        }
        String responseData = StringUtil.getStringOfObject(responseResult.getData());
        if(ReturnCode.REQUEST_SUCCESS.code() != responseResult.getCode()
                ||StringUtils.isBlank(responseData)){
            result.setCode(ReturnCode.ERROR_THIRD_RRSPONSE_NULL.code());
            result.setMsg(ReturnCode.ERROR_THIRD_RRSPONSE_NULL.msg());
            return result;
        }
        JSONObject data = JSONObject.parseObject(responseData);
        String code = StringUtil.getStringOfObject(data.get("code"));
        if(StringUtils.equals(code,SUCCESS_CODE)||StringUtils.equals(code,NO_RESULT_CODE)){
            result.setData(data.getString("tokenid"));
            return result;
        }
        result.setCode(ReturnCode.ERROR_THIRD_RESPONSE.code());
        result.setMsg(StringUtil.getStringOfObject(data.get("code")));
        result.setData(responseData);
        return result;
    }


    private String getString(Map<String,Object> params,String key){
        Object input = params.get(key);
        if(input==null){
            return "";
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


    private ResponseResult getBaiRongScore(){
        ResponseResult responseResult = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.REQUEST_SUCCESS,Constants.EMPTY_STR);
        if(responseResult==null){
            result.setCode(ReturnCode.ERROR_RESPONSE_NULL.code());
            result.setMsg(ReturnCode.ERROR_RESPONSE_NULL.msg());
            return result;
        }
        String responseData = StringUtil.getStringOfObject(responseResult.getData());
        if(ReturnCode.REQUEST_SUCCESS.code() != responseResult.getCode()
                ||StringUtils.isBlank(responseData)){
            result.setCode(ReturnCode.ERROR_THIRD_RRSPONSE_NULL.code());
            result.setMsg(ReturnCode.ERROR_THIRD_RRSPONSE_NULL.msg());
            return result;
        }
        JSONObject data = JSONObject.parseObject(responseData);
        String code = StringUtil.getStringOfObject(data.get("code"));
        if(StringUtils.equals(code,SUCCESS_CODE)||StringUtils.equals(code,NO_RESULT_CODE)){
            result.setData(responseData);
            return result;
        }
        result.setCode(ReturnCode.ERROR_THIRD_RESPONSE.code());
        result.setMsg(StringUtil.getStringOfObject(data.get("code")));
        result.setData(responseData);
        return result;
    }
}
