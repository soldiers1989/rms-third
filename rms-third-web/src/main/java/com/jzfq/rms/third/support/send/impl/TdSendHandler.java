package com.jzfq.rms.third.support.send.impl;

import cn.fraudmetrix.riskservice.RuleDetailClient;
import cn.fraudmetrix.riskservice.RuleDetailResult;
import cn.fraudmetrix.riskservice.object.Environment;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiInvoker;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:47.
 **/
public class TdSendHandler extends AbstractSendHandler {
    private static final Logger logger = LoggerFactory.getLogger(GpjSendHandler.class);
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() {

        if(StringUtils.equals(InterfaceIdEnum.THIRD_TD01.getCode(),(String)this.getParams().get("interfaceId"))){
            return getTdData01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_TD02.getCode(),(String)this.getParams().get("interfaceId"))){
            return getTdData02();
        }
        return null;
    }

    /**
     * 初始化
     *
     * @param params
     * @param bizParams
     */
    @Override
    public void init(Map<String, Object> params, Map<String, Object> bizParams) {
        this.setParams(params);
        this.setBizParams(bizParams);
    }

    ResponseResult getTdData01(){
        FraudApiResponse apiResp = null;
        String apiUrl = this.getParams().get("url").toString();
        try {
            apiResp = new FraudApiInvoker(apiUrl).invoke(this.getBizParams());
        }catch (Exception e){
            logger.error("获取同盾数据异常",e);
        }
        return new ResponseResult(this.getParams().get("traceId").toString(), ReturnCode.REQUEST_SUCCESS,apiResp);
    }

    ResponseResult getTdData02(){
        Environment env = (Environment)this.getParams().get("env");
        String partner_code = (String)this.getParams().get("partner_code");
        String partner_key = (String)this.getParams().get("partner_key");
        String sequenceId = (String)this.getBizParams().get("sequenceId");
        // 调用接口
        RuleDetailClient client = RuleDetailClient.getInstance(partner_code, env);
        RuleDetailResult result = client.execute(partner_key, sequenceId);
        return new ResponseResult(this.getParams().get("traceId").toString(), ReturnCode.REQUEST_SUCCESS,result);
    }
}
