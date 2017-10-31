package com.jzfq.rms.third.support.response.impl;

import cn.fraudmetrix.riskservice.RuleDetailClient;
import cn.fraudmetrix.riskservice.RuleDetailResult;
import cn.fraudmetrix.riskservice.object.Environment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.FraudApiResponse;
import com.jzfq.rms.mongo.TdData;
import com.jzfq.rms.mongo.TdHitRuleData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:43.
 **/
public class TdResponseHandler extends AbstractResponseHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult getResult() throws Exception{
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String interfaceId = StringUtil.getString(commonParams,"interfaceId");
        if(StringUtils.equals(InterfaceIdEnum.THIRD_TD01.getCode(),interfaceId)){
            return handle01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_TD02.getCode(),interfaceId)){
            return handle02();
        }
        return (ResponseResult)params.get("response");
    }

    /**
     * 同盾-同盾分
     * @return
     */
    private ResponseResult handle01() throws Exception{
        Map<String ,Object> commonParams = (Map<String ,Object> )this.params.get("params");
        String traceId = (String)commonParams.get("traceId");
        String taskId = (String)commonParams.get("taskId");
        ResponseResult response = (ResponseResult)params.get("response");
        FraudApiResponse apiResp = (FraudApiResponse)response.getData();
        if(apiResp == null){
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NULL,apiResp);
        }
        //同盾信息写入mongo
        TdHitRuleData tdHitRuleData = new TdHitRuleData(taskId.toString(),
                "同盾规则命中信息", new Date());
        if(apiResp.getDevice_info()!=null && apiResp.getDevice_info().get("deviceId")!=null){
            tdHitRuleData.setData(apiResp.getDevice_info().get("deviceId").toString());
        }
        logger.info("traceId= {} 同盾拉取结果：{} --同盾分= {} 拉取结果:{} "
                ,commonParams.get("traceId"),apiResp.getSuccess(),apiResp.getFinal_score(),apiResp.toString());     //是否成功
        BeanUtils.copyProperties(tdHitRuleData, apiResp);
        return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,tdHitRuleData);
    }

    /**
     * 同盾-同盾规则
     * @return
     */
    private ResponseResult handle02(){
        Map<String ,Object> commonParams = (Map<String ,Object> )this.params.get("params");
        String traceId = (String)commonParams.get("traceId");
        Long taskId = (Long)commonParams.get("taskId");
        ResponseResult response = (ResponseResult)params.get("response");
        RuleDetailResult result = (RuleDetailResult)response.getData();
        if(result==null){
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NULL,result);
        }
        if (result.getSuccess() != true){
            logger.info("traceId={} 拉取同盾规则失败,result={}", traceId , JSONObject.toJSON(result));
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RESPONSE,result);
        }
        String json= JSON.toJSONString(result);
        TdData data = new TdData(taskId.toString(), json, "同盾规则命中列表", new Date());
        return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,data);
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
}
