package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.TongDunStringData;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IPushDataService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 同盾分
 *
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:18.
 **/
@Component("request1008Handler")
public class Request1008Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1008Handler.class);

    @Autowired
    ITdDataService tdDataService;
    @Autowired
    IPushDataService pushDataService;

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        log.info("checkParams请求参数" + params.toString());
        String frontId = (String) params.get("frontId");
        String orderNo = (String) params.get("orderNo");
        String channelId = (String) params.get("channelId");
        String financialProductId = (String) params.get("financialProductId");
        String operationType = (String) params.get("operationType");
        String clientType = (String) params.get("clientType");
        if (StringUtils.isBlank(frontId) || StringUtils.isBlank(orderNo)
                || StringUtils.isBlank(channelId) || StringUtils.isBlank(financialProductId)
                || StringUtils.isBlank(operationType) || StringUtils.isBlank(clientType)
                || params.get("personInfo") == null) {
            return false;
        }
        return true;
    }

    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3 * 24 * 60 * 60L;

    @Override
    protected boolean isRpc(Map<String, Serializable> params) {
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
        if (StringUtils.equals(request.getApiVersion(), "02")) {
            return handler02(request);
        }
        return handler01(request);
    }

    /**
     * 版本01 处理器
     *
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequest request) throws Exception {
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        Map<String, Object> commonParams = getCommonParams(request);
        RiskPersonalInfo personInfo = (RiskPersonalInfo)commonParams.get("personalInfo");
        String mobile = "";
        String idCard = "";
        if (null != personInfo) {
            mobile = personInfo.getMobile();
            idCard = personInfo.getCertCardNo();
        }
//        // 根据orderNo查询数据库
        String eventId = getEventId(request);
        if (StringUtils.isBlank(eventId)) {
            return new ResponseResult(traceId, ReturnCode.ERROR_NOT_FOUNT_EVENT_ID, null);
        }

        String isRepeatKey = getKeyByOrderNo(orderNo, eventId);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey, time);
        log.info("traceId={} 获取同盾分,缓存isRepeatKey={},是否重新拉取={}",traceId, isRepeatKey,isRpc);
        if (!isRpc) {
            List<TongDunStringData> datas = tdDataService.getDataByEvent(orderNo, eventId);
            if (!CollectionUtils.isEmpty(datas)) {
                ResponseResult responseResult = new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, null);
                TongDunStringData data = datas.get(0);
                responseResult.setData(data.getValue());
//                responseResult.setData(20);
                log.info("traceId={} 获取同盾分成功(mongodb),返回结果={}", traceId, responseResult.toString()); //成功
                return responseResult;
            }else {
                log.info("traceId={}，获取同盾分成功(mongodb不存在此数据，请删除缓存重新拉取),", traceId); //成功
                return new ResponseResult(traceId, ReturnCode.REQUEST_NO_EXIST_DATA, null);
            }
        }
        try {
            ResponseResult response = new ResponseResult();
            response = tdDataService.queryTdDatas(commonParams);
            if (response == null) {
                log.info("traceId={} 同盾拉取无效：false ", commonParams.get("traceId"));     //失败
                interfaceCountCache.setFailure(isRepeatKey);
                throw new BusinessException("traceId={} 同盾拉取无效：false", true);
            }
            if (response.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
                log.info("traceId={} 同盾拉取失败：false ,同盾返回结果={}", commonParams.get("traceId"),response);     //失败
                interfaceCountCache.setFailure(isRepeatKey);
                return response;
            }
            FraudApiResponse apiResp = (FraudApiResponse) response.getData();
            response.setData(apiResp.getFinal_score());
//            response.setData(20);
            tdDataService.saveResult(orderNo, eventId, apiResp, commonParams);
            //push推送
            if (null != apiResp.getFinal_score()) {
                pushDataService.pushData(traceId,"tdscore", String.valueOf(apiResp.getFinal_score()), idCard, orderNo);
            }else {
                log.info("traceId={} 同盾拉取失败：false ，同盾分为空",traceId);     //失败
            }
            log.info("traceId={} 拉取三方同盾分成功,返回结果={}",traceId,response.toString()); //成功
            return response;
        } catch (Exception e) {
            log.info("traceId={} 同盾拉取无效：false ", TraceIDThreadLocal.getTraceID());     //失败
            interfaceCountCache.setFailure(isRepeatKey);
            throw e;
        }

    }

    /**
     * 封装推送参数
     *
     * @return
     */

    private  Map<String,String> getPushParams(String orderNo,String responseResult,String score ) {
        Map<String,String> pushParams = new HashMap<String,String>();
        pushParams.put("orderNo",orderNo);
        pushParams.put("responseResult",responseResult);
        pushParams.put("scoreType","tdscore");
        pushParams.put("score",score);
        pushParams.put("apiId","1008");
        return pushParams;
    }

    private String getEventId(AbstractRequest request) {
        String channelId = (String) request.getParam("channelId");
        String financialProductId = (String) request.getParam("financialProductId");
        String operationType = (String) request.getParam("operationType");
        String clientType = (String) request.getParam("clientType");
        return tdDataService.getEventId(channelId, financialProductId, operationType, clientType);
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

    private String getKeyByOrderNo(String orderNo, String eventId) {
        StringBuilder key = new StringBuilder("rms_third_1008_");
        key.append(orderNo).append("_");
        key.append(eventId);
        return key.toString();
    }

    /**
     * 版本02 处理器
     *
     * @param request
     * @return
     */
    private ResponseResult handler02(AbstractRequest request) throws Exception {
        return null;
    }

}
