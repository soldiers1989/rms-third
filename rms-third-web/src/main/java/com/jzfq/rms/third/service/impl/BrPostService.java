package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bfd.facade.MerchantServer;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.enums.BrPostUrl;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IBrPostService;
import com.jzfq.rms.third.service.ISendMessageService;
import com.jzfq.rms.third.support.cache.ICache;
import net.sf.json.JSONArray;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @description 百融服务
 * @author 大连桔子分期科技有限公司
 *
 */
@Component("brPostService")
public class BrPostService {

    private static final Logger log = LoggerFactory.getLogger("postLogger");
    @Value("${br.rule.user}")
    private String ruleUser;

    @Value("${br.rule.pwd}")
    private String rulePwd;

    @Value("${br.rule.apicode}")
    private String ruleApiCode;

    @Autowired
    ISendMessageService sendMessegeService;

    private String tokenid;
    private static MerchantServer ms = new MerchantServer();

    public String getTokenid(){
        tokenid = login();
        return tokenid;
    }
    /**
     * 登录百融系统 传入类型
     * @return
     */
    private String login() {
        Map<String,Object> commonParams = getLoginCommonParams();
        Map<String,Object> bizParams = getInterfaceInput();
        log.info("登录百融系统参数信息："+"commonParams："+commonParams+"bizParams："+bizParams);
        ResponseResult response = sendMessegeService
                .sendByThreeChance(SendMethodEnum.BR03.getCode(),commonParams,bizParams);
        if(response.getCode()== ReturnCode.REQUEST_SUCCESS.code()&&response.getData()!=null){
            return response.getData().toString();
        }
        return null;
    }

    /**
     * 登陆事件 公用参数
     * @return
     */
    private Map<String,Object> getLoginCommonParams(){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("url","百融客户端调用方法login");
        commonParams.put("targetId", SystemIdEnum.THIRD_BR.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR03.getCode());
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        commonParams.put("ms",ms);
        return commonParams;
    }

    /**
     * 登陆 api name
     */
    private static final String STR_BR_LOGIN_API = "LoginApi";
    /**
     * 登陆事件 业务参数
     */
    private Map<String,Object> getInterfaceInput(){
        Map<String,Object> bizParams = new HashMap<>();
        bizParams.put("userName",ruleUser);
        bizParams.put("pwd",rulePwd);
        bizParams.put("loginName", STR_BR_LOGIN_API);
        bizParams.put("apicode",ruleApiCode);
        return bizParams;
    }

    /**
     * 百融策略 redis key
     */
    private final static String STR_BR_REDIS_KEY = "jd_br_strategy";

    @Autowired
    ICache prefixCache;

    /**
     * 从 redis 获取 策略ID
     * @param clientType
     * @return
     */
    public String getStrategyId(String channelId, String financialProductId, String operationType, String clientType){
        StringBuilder key = new StringBuilder(Constants.STR_DIC_HEADER);
        key.append(STR_BR_REDIS_KEY).append("_");
        key.append(channelId).append("-").append(financialProductId)
                .append("-").append(clientType).append("-").append(operationType);
        return StringUtil.getStringOfObject(prefixCache.readConfig(key.toString()));
    }
    /**
     * 根据url 和类型 查询数据
     * @return
     */
    public ResponseResult getApiData(RiskPersonalInfo info,Map<String,Object> commonParams) throws Exception{
        // 设置公共参数
        setApiCommonParams(commonParams);
        // 设置业务参数
        Map<String ,Object> bizParams = getBizParams(info, commonParams);
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.BR01.getCode(),commonParams,bizParams);
        return response;
    }

    /**
     * 根据url 和类型 查询数据
     * @return
     */
    public ResponseResult getApiDataByParams(RiskPersonalInfo info,Map<String,Object> commonParams) throws Exception{
        // 设置公共参数
        setApiCommonParamsByParams(commonParams);
        // 设置业务参数
        Map<String ,Object> bizParams = getBizParams(info, commonParams);
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.BR01.getCode(),commonParams,bizParams);
        return response;
    }


    /**
     * 获取 策略引擎 公共参数
     * @param commonParams
     */
    private void setApiCommonParamsByParams(Map<String, Object> commonParams){
        commonParams.put("url","百融客户端调用方法getApiData");
        commonParams.put("targetId", SystemIdEnum.THIRD_BR.getCode());
        commonParams.put("appId", "");
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        commonParams.put("ms",ms);
        String channelId = (String)commonParams.get("channelId");
        String financialProductId = (String)commonParams.get("financialProductId");
        String operationType = (String)commonParams.get("operationType");
        String clientType = (String)commonParams.get("clientType");
        String strategyId = (String)commonParams.get("strategyId");
        commonParams.put("strategyId",strategyId);
        // 登陆 获取token
        String token = getTokenid();
        //设置token
        commonParams.put("token",token);
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR01.getCode());
        commonParams.put("apiName", "strategyApi");
        commonParams.put("apicode",ruleApiCode);
    }


    /**
     * 获取 策略引擎 公共参数
     * @param commonParams
     */
    private void setApiCommonParams(Map<String, Object> commonParams){
        commonParams.put("url","百融客户端调用方法getApiData");
        commonParams.put("targetId", SystemIdEnum.THIRD_BR.getCode());
        commonParams.put("appId", "");
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        commonParams.put("ms",ms);
        String channelId = (String)commonParams.get("channelId");
        String financialProductId = (String)commonParams.get("financialProductId");
        String operationType = (String)commonParams.get("operationType");
        String clientType = (String)commonParams.get("clientType");
        String strategyId = getStrategyId(channelId, financialProductId, operationType, clientType);
        commonParams.put("strategyId",strategyId);
        // 登陆 获取token
        String token = getTokenid();
        //设置token
        commonParams.put("token",token);
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR01.getCode());
        commonParams.put("apiName", "strategyApi");
        commonParams.put("apicode",ruleApiCode);
    }

    /**
     * 获取 策略引擎 业务参数
     * @param info
     * @param commonParams
     * @return
     */
    private Map<String, Object> getBizParams(RiskPersonalInfo info, Map<String, Object> commonParams){
        Map<String ,Object> bizParams = new HashMap<>();
        JSONObject personInfo = new JSONObject();
        JSONArray cells=new JSONArray();
        personInfo.put("id",info.getCertCardNo());
        cells.add(info.getMobile());
        personInfo.put("cell",cells);
        personInfo.put("name",info.getName());
        bizParams.put("personInfo",personInfo);
        bizParams.put("clientType",commonParams.get("clientType"));
        return bizParams;
    }
}
