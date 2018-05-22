package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJiguangService;
import com.jzfq.rms.third.service.IPushDataService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.impl.BrPostService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import com.jzfq.rms.third.web.action.parser.JiguangParser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 极光反欺诈-黑名单接口
 *
 * @author 大连桔子分期科技有限公司
 * @date 2018/5/21 15:03.
 **/
@Component("request1023Handler")
public class Request1023Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1023Handler.class);


    @Autowired
    ICountCache interfaceCountCache;

    @Autowired
    IJiguangService iJiguangService;

    /**
     * 超时时间 30天
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

        String orderNo = (String) params.get("orderNo");
        String channelId = (String) params.get("channelId");
        if (StringUtils.isBlank(orderNo)
                || StringUtils.isBlank(channelId)
                || params.get("personInfo") == null) {
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
        String orderNo = request.getParam("orderNo").toString();
        String customerType = (String) request.getParam("customerType");
        String channelId = (String) request.getParam("channelId");
        RiskPersonalInfo info = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        String isRepeatKey = "";
        if (null != info) {
            isRepeatKey = getKeyPersonalInfo(info, channelId);
        } else {
            info = new RiskPersonalInfo();
        }
//        // 2.判断是否远程拉取
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey, time);
        log.info("traceId={} 获取极光反欺诈数据,缓存isRepeatKey={},是否重新拉取={}", traceId, isRepeatKey, isRpc);
        if (!isRpc) {
            JSONObject value = iJiguangService.getData(info.getName(), info.getCertCardNo(), info.getMobile(), orderNo, channelId);
            if (null != value) {
                log.info("traceId={} 获取极光反欺诈数据成功(mongodb),返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, null)); //成功
                return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, value);
            } else {
                log.info("traceId={}，获取极光反欺诈数据失败(mongodb不存在此数据，请删除缓存重新拉取),", traceId); //成功
                return new ResponseResult(traceId, ReturnCode.REQUEST_NO_EXIST_DATA, null);
            }
        }
        // 3.远程拉取
        ResponseResult result = null;
        try {
            result = iJiguangService.getHttpData(info.getName(), info.getCertCardNo(), info.getMobile(), channelId);
        } catch (Exception e) {
            interfaceCountCache.setFailure(isRepeatKey);
            log.error("traceId={} 获取极光反欺诈数据失败", traceId, e);
            throw e;
        }
        if (result == null || result.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            interfaceCountCache.setFailure(isRepeatKey);
            log.info("traceId={} 拉取极光反欺诈数据失败,返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL, result)); //失败
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL, result);
        }
        String brResponse = "";
        if (null !=  result.getData()) {
             brResponse = (String) result.getData();
        }
        if (StringUtils.isBlank(brResponse)) {
            interfaceCountCache.setFailure(isRepeatKey);
            log.info("traceId={} 拉取极光反欺诈数据失败,返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL, result)); //失败
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL, null);
        }
        JSONObject jsonObject = JSONObject.parseObject(brResponse);
        Map<String, String> resultMap = JiguangParser.getScore(jsonObject);
        //验证code码
        if (null != resultMap) {
            String code = resultMap.get("code");
            if (StringUtils.isNotBlank(code)) {
                interfaceCountCache.setFailure(isRepeatKey);
                return new ResponseResult(traceId, Integer.parseInt(code), null);
            }
        } else {
            interfaceCountCache.setFailure(isRepeatKey);
            log.info("traceId={} 拉取极光反欺诈数据失败,返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL, result)); //失败
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL, null);
        }
        try {
            //保存极光数据
            iJiguangService.saveData(info, jsonObject, orderNo, channelId, traceId, resultMap);
            result.setData(resultMap);
        } catch (Exception e) {
            log.error("traceId={} 保存数据失败", traceId, e);
            interfaceCountCache.setFailure(isRepeatKey);
        }
        return result;
    }


    /**
     * 获取 唯一Key
     *
     * @return
     */
    private String getKeyPersonalInfo(RiskPersonalInfo info, String channelId) {
        StringBuilder sb = new StringBuilder("rms_third_1023_");
        sb.append(channelId);
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
