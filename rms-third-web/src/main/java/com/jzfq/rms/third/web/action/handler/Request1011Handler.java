package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.service.IPushDataService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.impl.BrPostService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 百融分
 *
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 15:03.
 **/
@Component("request1011Handler")
public class Request1011Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1011Handler.class);

    @Autowired
    BrPostService brPostService;

    @Autowired
    IRiskPostDataService riskPostDataService;

    @Autowired
    ICountCache interfaceCountCache;
    @Autowired
    IPushDataService pushDataService;

    @Autowired
    IConfigDao configCacheDao;


    /**
     * 超时时间 三天
     */
    private static final Long time = 30 * 24 * 60 * 60L;

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {

        String frontId = (String) params.get("frontId");
        String orderNo = (String) params.get("orderNo");
        String channelId = (String) params.get("channelId");
        String financialProductId = (String) params.get("financialProductId");
        String operationType = (String) params.get("operationType");
        String clientType = (String) params.get("clientType");
        String customerType = (String) params.get("customerType");
        if (StringUtils.isBlank(frontId) || StringUtils.isBlank(orderNo)
                || StringUtils.isBlank(channelId) || StringUtils.isBlank(financialProductId)
                || StringUtils.isBlank(operationType) || StringUtils.isBlank(clientType)
                || params.get("personInfo") == null || StringUtils.isBlank(customerType)) {
            return false;
        }
        return true;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {

        return handler01(request);
    }

    /**
     * 版本01
     *
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequest request) throws Exception {
        String traceId = TraceIDThreadLocal.getTraceID();
        if (1 == 1) {
            JSONObject resultJson = new JSONObject();
            resultJson.put("score", "null");
            resultJson.put("weight", "null");
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, resultJson);
        }


        String orderNo = request.getParam("orderNo").toString();
        String customerType = (String) request.getParam("customerType");
        RiskPersonalInfo info = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        // 1.搜索mongo中是否存在
        String strategyId = getStrategyId(request);
        if (StringUtils.isBlank(strategyId)) {
            return new ResponseResult(traceId, ReturnCode.ERROR_NOT_FOUNT_STRATEGE_ID, null);
        }
        String idCard = "";
        String isRepeatKey = "";
        if (null != info) {
            idCard = info.getCertCardNo();
            isRepeatKey = getKeyPersonalInfo(info, strategyId);
        } else {
            info = new RiskPersonalInfo();
        }
//        // 2.判断是否远程拉取
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey, time);
        log.info("traceId={} 获取百融分,缓存isRepeatKey={},是否重新拉取={}", traceId, isRepeatKey, isRpc);
        if (!isRpc) {
            JSONObject jsonObject = riskPostDataService.getBairongData(info.getName(), info.getCertCardNo(), info.getMobile(), strategyId);
            if (null != jsonObject) {
                riskPostDataService.saveRmsData(orderNo, jsonObject.toJSONString(), customerType);
                JSONObject resultJson = new JSONObject();
                resultJson.put("score", riskPostDataService.getScoreByJson(jsonObject));
                resultJson.put("weight", jsonObject.getString("Rule_final_weight"));
                log.info("traceId={} 获取百融分成功(mongodb),返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, resultJson)); //成功
                return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, resultJson);
            } else {
                log.info("traceId={}，获取百融分成功(mongodb不存在此数据，请删除缓存重新拉取){},", traceId, isRepeatKey); //成功
                return new ResponseResult(traceId, ReturnCode.REQUEST_NO_EXIST_DATA, null);
            }
        }
        // 3.远程拉取
        ResponseResult result = null;
        try {
            result = brPostService.getApiData(info, getCommonParams(request));
        } catch (Exception e) {
            interfaceCountCache.setFailure(isRepeatKey);
            log.error("traceId={} 获取百融分失败", traceId, e);
            throw e;
        }
        if (result == null || result.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            interfaceCountCache.setFailure(isRepeatKey);
            log.info("traceId={} 拉取百融分失败,返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL, result)); //失败
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL, result);
        }
        String brResponse = (String) result.getData();
        try {
            riskPostDataService.saveRmsData(orderNo, brResponse, customerType);
            riskPostDataService.saveRmsThirdData(info, customerType, strategyId, brResponse);
        } catch (Exception e) {
            log.error("traceId={} 保存数据失败", traceId, e);
            interfaceCountCache.setFailure(isRepeatKey);
        }
        JSONObject resultJson = new JSONObject();
        JSONObject tempResult = JSONObject.parseObject(brResponse);
        //上线恢复
        resultJson.put("score", riskPostDataService.getScoreByJson(tempResult));
        resultJson.put("weight", tempResult.getString("Rule_final_weight"));
        //push推送riskPostDataService.getScoreByJson(tempResult)
        pushDataService.pushData(traceId, "brscore", riskPostDataService.getScoreByJson(tempResult), idCard, orderNo);
        log.info("traceId={} 拉取三方百融分成功,返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, resultJson)); //失败
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, resultJson);

    }

    /**
     * 封装推送参数
     *
     * @return
     */

    private Map<String, String> getPushParams(String orderNo, String responseResult, String score) {
        Map<String, String> pushParams = new HashMap<String, String>();
        pushParams.put("orderNo", orderNo);
        pushParams.put("thirdInterfaceResult", responseResult);
        pushParams.put("scoreType", "brscore");
        pushParams.put("score", score);
        pushParams.put("apiId", "1011");
        return pushParams;
    }

    String getStrategyId(AbstractRequest request) {
        String channelId = (String) request.getParam("channelId");
        String financialProductId = (String) request.getParam("financialProductId");
        String operationType = (String) request.getParam("operationType");
        String clientType = (String) request.getParam("clientType");
        return brPostService.getStrategyId(channelId, financialProductId, operationType, clientType);
    }

    /**
     * 获取 唯一Key
     *
     * @return
     */
    private String getKeyPersonalInfo(RiskPersonalInfo info, String strategyId) {
        StringBuilder sb = new StringBuilder("rms_third_1011_");
        sb.append(strategyId);
        sb.append("_");
        sb.append(info.getName());
        sb.append("_");
        sb.append(info.getCertCardNo());
        sb.append("_");
        sb.append(info.getMobile());
        return sb.toString();
    }

    private Map<String, Object> getCommonParams(AbstractRequest request) {
        String channelId = (String) request.getParam("channelId");
        String financialProductId = (String) request.getParam("financialProductId");
        String operationType = (String) request.getParam("operationType");
        String clientType = (String) request.getParam("clientType");
        RiskPersonalInfo personInfo = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Map<String, Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        commonParams.put("personalInfo", personInfo);
        commonParams.put("channelId", channelId);
        commonParams.put("financialProductId", financialProductId);
        commonParams.put("operationType", operationType);
        commonParams.put("clientType", clientType);
        return commonParams;
    }


}
