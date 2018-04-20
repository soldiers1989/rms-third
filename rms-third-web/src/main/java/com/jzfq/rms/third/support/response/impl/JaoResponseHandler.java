package com.jzfq.rms.third.support.response.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:43.
 **/
public class JaoResponseHandler extends AbstractResponseHandler {
    private static final Logger logger = LoggerFactory.getLogger(PyResponseHandler.class);
    /**
     * 解析
     *
     * @return
     */
    @Override
    public ResponseResult getResult() throws Exception{
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String interfaceId = getString(commonParams,"interfaceId");
        if(StringUtils.equals(InterfaceIdEnum.JAO20.getCode(),interfaceId)){
            return handle01();
        }
        if(StringUtils.equals(InterfaceIdEnum.JAO21.getCode(),interfaceId)){
            return handle02();
        }
        if(StringUtils.equals(InterfaceIdEnum.JAO22.getCode(),interfaceId)){
            return handle03();
        }
        return (ResponseResult)params.get("response");
    }
    /**
     * 手机三要素
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
        String errorCode = jsonRet.getString("code");
        if(StringUtils.isBlank(errorCode)||!StringUtils.equals(errorCode,"200")){
            logger.info("traceId={} 手机在网时长{} {}", traceId,ReturnCode.ERROR_THIRD_RESPONSE.msg(), jsonRet);
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE, errorCode);
        }
        result.setData(jsonRet);
        return result;
    }
    /**
     * 手机在网状态
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
        String errorCode = jsonRet.getString("code");
        if(StringUtils.isBlank(errorCode)||!StringUtils.equals(errorCode,"200")){
            logger.info("traceId={} 手机在网时长{} {}", traceId,ReturnCode.ERROR_THIRD_RESPONSE.msg(), jsonRet);
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE, errorCode);
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
        String errorCode = jsonRet.getString("code");
        if(StringUtils.isBlank(errorCode)||!StringUtils.equals(errorCode,"200")){
            logger.info("traceId={} 手机三要素{} {}", traceId,ReturnCode.ERROR_THIRD_RESPONSE.msg(), jsonRet);
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE, errorCode);
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
