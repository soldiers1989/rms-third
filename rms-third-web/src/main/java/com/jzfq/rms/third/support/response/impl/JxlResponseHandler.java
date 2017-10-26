package com.jzfq.rms.third.support.response.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.constants.RmsConstants;
import com.jzfq.rms.mongo.JxlData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:42.
 **/
public class JxlResponseHandler extends AbstractResponseHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult getResult() {
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String interfaceId = StringUtil.getString(commonParams,"interfaceId");
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL01.getCode(),interfaceId)){
            return handle01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL02.getCode(),interfaceId)){
            return handle02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL03.getCode(),interfaceId)){
            return handle03();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL04.getCode(),interfaceId)){
            return handle04();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL05.getCode(),interfaceId)){
            return handle05();
        }
        return (ResponseResult)params.get("response");
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

    private ResponseResult handle01(){
        Map<String ,Object> commonParams = (Map<String ,Object> )this.params.get("params");
        String traceId = (String)commonParams.get("traceId");
        ResponseResult response = (ResponseResult)params.get("response");
        if(null==response){
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL,null);
        }
        if(response.getCode()!= ReturnCode.REQUEST_SUCCESS.code()){
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
        }
        String result = (String)response.getData();
        JSONObject jsonResult= JSON.parseObject(result);
        if(null!=jsonResult && jsonResult.getString("success").equalsIgnoreCase("true")){
            JSONObject data= jsonResult.getJSONObject("data");
            JSONArray details=data.getJSONArray("details");
            String status = null;
            if (details.size() != 0) {
                JSONObject json = details.getJSONObject(0);
                status = json.getString("websiteStatus");
            }
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,status);
        }
        return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
    }

    private ResponseResult handle02(){
        Map<String ,Object> commonParams = (Map<String ,Object> )this.params.get("params");
        String traceId = (String)commonParams.get("traceId");
        ResponseResult response = (ResponseResult)params.get("response");
        if(null==response){
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL,null);
        }
        if(response.getCode()!= ReturnCode.REQUEST_SUCCESS.code()){
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
        }
        String result = (String)response.getData();
        JSONObject jsonResult= JSON.parseObject(result);
        if(null!=jsonResult && jsonResult.getString("success").equalsIgnoreCase("true")
                && StringUtils.isNotBlank(jsonResult.getString("report_data"))){
            String reportData=jsonResult.getString("report_data");
            logger.info("成功获取用户报告, 长度[ "+reportData.length()+" ]");
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,reportData);
        }
        return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
    }

    private ResponseResult handle03(){
        Map<String ,Object> commonParams = (Map<String ,Object> )this.params.get("params");
        String traceId = (String)commonParams.get("traceId");
        ResponseResult response = (ResponseResult)params.get("response");
        if(null==response){
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL,null);
        }
        if(response.getCode()!= ReturnCode.REQUEST_SUCCESS.code()){
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
        }
        String result = (String)response.getData();
        JSONObject jsonResult= JSON.parseObject(result);
        if(null!=jsonResult && jsonResult.getString("success").equalsIgnoreCase("true")
                && StringUtils.isNotBlank(jsonResult.getString("raw_data"))){

            String rawData=jsonResult.getString("raw_data");
            logger.info("成功获取移动运营商数据, 长度[ "+rawData.length()+" ]");
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,rawData);
        }
        return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
    }

    private ResponseResult handle04(){
        Map<String ,Object> commonParams = (Map<String ,Object> )this.params.get("params");
        String traceId = (String)commonParams.get("traceId");
        ResponseResult response = (ResponseResult)params.get("response");
        if(null==response){
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL,null);
        }
        if(response.getCode()!= ReturnCode.REQUEST_SUCCESS.code()){
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
        }
        String result = (String)response.getData();
        JSONObject jsonResult= JSON.parseObject(result);
        if(null!=jsonResult && jsonResult.getString("success").equalsIgnoreCase("true")
                && StringUtils.isNotBlank(jsonResult.getString("raw_data"))){
            String rawData=jsonResult.getString("raw_data");
            logger.info("成功获取电商数据");
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,rawData);
        }
        return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
    }

    private ResponseResult handle05(){
        Map<String ,Object> commonParams = (Map<String ,Object> )this.params.get("params");
        String traceId = (String)commonParams.get("traceId");
        ResponseResult response = (ResponseResult)params.get("response");
        if(null==response ){
            return new ResponseResult(traceId,ReturnCode.ERROR_THIRD_RESPONSE,null);
        }
        if(response.getCode()!= ReturnCode.REQUEST_SUCCESS.code()){
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,response.getData());
        }
        String result = (String)response.getData();
        JSONObject jsonResult= JSON.parseObject(result);
        if(null==jsonResult){
            return new ResponseResult(traceId,ReturnCode.ERROR_THIRD_RRSPONSE_NULL,result);
        }
        if(!jsonResult.getString("success").equalsIgnoreCase("true")){
            return new ResponseResult(traceId,ReturnCode.ERROR_THIRD_RESPONSE,result);
        }
        String data = jsonResult.getString("access_token");
        return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,data);

    }

}
