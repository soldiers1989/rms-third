package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.support.cache.ICache;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.support.log.ILogger;
import com.jzfq.rms.third.support.log.impl.RmsLogger;
import com.jzfq.rms.third.web.action.GongPingJiaAction;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/13 16:44.
 **/
@Component("request1001Handler")
public class Request1001Handler extends AbstractRequestHandler {
    final protected static ILogger log = RmsLogger.getFactory(LoggerFactory.getLogger(GongPingJiaAction.class));
    final protected static Logger logger = LoggerFactory.getLogger(Request1001Handler.class);
    @Autowired
    private IGongPingjiaService gongPingjiaService;
    @Autowired
    ICache prefixCache;
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String frontId = (String) params.get("frontId");
        String vin = (String) params.get("vin");
        String licensePlatHeader = (String) params.get("licensePlatHeader");
        if (StringUtils.isBlank(frontId) ||
                StringUtils.isBlank(vin) || StringUtils.isBlank(licensePlatHeader)) {
            return false;
        }
        return true;
    }

    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {
        if (StringUtils.equals("01", request.getApiVersion())) {
            return handlerOfVersion01(request);
        }
        return handlerOfVersion01(request);
    }

    @Autowired
    ICountCache interfaceCountCache;

    Long time = 24 * 60 * 60 * 10L;

    /**
     * 版本10
     *
     * @param request
     * @return
     */
    private ResponseResult handlerOfVersion01(AbstractRequest request) throws BusinessException {
        String vin = (String) request.getParam("vin");
        String licensePlatHeader = (String) request.getParam("licensePlatHeader");
//        String isRepeatKey = getKey(vin, licensePlatHeader);
//        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
//        if(!isRpc){
//            return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.ACTIVE_THIRD_RPC,null);
//        }
        String price = gongPingjiaService.getEvaluatePrice(vin, licensePlatHeader);
        if (StringUtils.isNotBlank(price)) {
            if ("".equals(price) || null == price) {
                price = StringUtil.getStringOfObject(prefixCache.readConfig(Constants.DICTIONARY_PREFIX_DEFAULT_VALUE_CAR_VALUATION));;
            }
            logger.info("公平价返回结果：" + new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS, price).toString() + ",公平价frontid：" + StringUtil.getStringOfObject(request.getParam("frontId")));
            return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS, price);
        }
        log.info(TraceIDThreadLocal.getTraceID(), "third1001", "traceID={} 公平价估值信息 params：【" + vin + ":" + licensePlatHeader + "】");
        Map<String, Object> commonParams = getCommonParams(request);
        ResponseResult result = gongPingjiaService.getGpjDataAndCalculateEvaluations(vin, licensePlatHeader.toUpperCase(), commonParams);
        log.info(TraceIDThreadLocal.getTraceID(), "third1001", "traceID={} 公平价估值返回结果 params：【" + vin + ":" + licensePlatHeader + "】结束 {}", TraceIDThreadLocal.getTraceID(), result.toString());
        logger.info("公平价返回结果：" + result.toString() + ",公平价frontid：" + commonParams.get("frontId").toString());
        return result;
    }

    private String getKey(String vin, String plantNo) {
        StringBuilder sb = new StringBuilder("rms_third_1001_");
        sb.append(vin);
        sb.append("_");
        sb.append(plantNo);
        return sb.toString();
    }

    private Map<String, Object> getCommonParams(AbstractRequest request) {
        Map<String, Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        return commonParams;
    }
}
