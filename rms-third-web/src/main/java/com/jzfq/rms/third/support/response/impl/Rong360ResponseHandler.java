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
 * @date 2017/10/25 15:43.
 **/
public class Rong360ResponseHandler extends AbstractResponseHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult getResult() throws Exception{
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String interfaceId = getString(commonParams,"interfaceId");
        if(StringUtils.equals(InterfaceIdEnum.THIRD_RSLL01.getCode(),interfaceId)){
            return handle01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_RSLL02.getCode(),interfaceId)){
            return handle02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_RSLL03.getCode(),interfaceId)){
            return handle03();
        }
        return (ResponseResult)params.get("response");
    }
    /**
     * 手机在网时长
     * @return
     * @throws Exception
     */
    private ResponseResult handle01() throws Exception{
        ResponseResult responseResult = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
        String data = (String) responseResult.getData();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String traceId = StringUtil.getString(commonParams,"traceId");
        if (data == null || data.length() == 0) {
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NULL, null);
        }
        JSONObject jsonRet = JSONObject.parseObject(data);
        if (jsonRet == null) {
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NON_JSON, null);
        }
        result.setData(jsonRet);
        return result;
    }
    /**
     * 手机在网时长
     * @return
     * @throws Exception
     */
    private ResponseResult handle02() throws Exception{
        ResponseResult responseResult = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
        String data = (String) responseResult.getData();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String traceId = StringUtil.getString(commonParams,"traceId");
        if (data == null || data.length() == 0) {
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NULL, null);
        }
        JSONObject jsonRet = JSONObject.parseObject(data);
        if (jsonRet == null) {
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NON_JSON, null);
        }
        result.setData(jsonRet);
        return result;
    }
    /**
     * 手机在网时长
     * @return
     * @throws Exception
     */
    private ResponseResult handle03() throws Exception{
        ResponseResult responseResult = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
        String data = (String) responseResult.getData();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String traceId = StringUtil.getString(commonParams,"traceId");
        if (data == null || data.length() == 0) {
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NULL, null);
        }
        JSONObject jsonRet = JSONObject.parseObject(data);
        if (jsonRet == null) {
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NON_JSON, null);
        }
        result.setData(jsonRet);
        return result;
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

    public static String getString(Map<String,Object> params,String key){
        Object input = params.get(key);
        if(input==null){
            return "N/A";
        }
        return input.toString().trim();
    }
}
