package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.mongo.TdHitRuleData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.TongDunData;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 同盾分
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:18.
 **/
@Component("request1008Handler")
public class Request1008Handler  extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("TongDun");

    @Autowired
    ITdDataService tdDataService;

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String frontId = (String)params.get("frontId");
        String orderNo = (String)params.get("orderNo");
        String channelId = (String)params.get("channelId");
        String financialProductId = (String)params.get("financialProductId");
        String operationType = (String)params.get("operationType");
        String clientType = (String)params.get("clientType");
        if(StringUtils.isBlank(frontId)||StringUtils.isBlank(orderNo)
                ||StringUtils.isBlank(channelId)||StringUtils.isBlank(financialProductId)
                ||StringUtils.isBlank(operationType)||StringUtils.isBlank(clientType)
                ||params.get("personInfo")==null){
            return false;
        }
        return true;
    }
    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;
    @Override
    protected boolean isRpc(Map<String, Serializable> params){
        return true;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws Exception {
        if(StringUtils.equals(request.getApiVersion(),"02")){
            return handler02(request);
        }
        return handler01(request);
    }
    /**
     * 版本01 处理器
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        // 根据orderNo查询数据库
        List<TongDunData> datas = tdDataService.getTongDongData(orderNo);
        if(!CollectionUtils.isEmpty(datas)){
            ResponseResult responseResult = new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,null);
            TongDunData data = datas.get(0);
            responseResult.setData(data.getApiResp().getFinal_score());
            return responseResult;
        }
        String isRepeatKey = getKeyByOrderNo(orderNo);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            return new ResponseResult(traceId,ReturnCode.ACTIVE_THIRD_RPC,null);
        }
        Map<String,Object> commonParams = getCommonParams(request);
        ResponseResult response =null;
        try {
            response = tdDataService.queryTdDatas(commonParams);
        }catch (Exception e){
            log.info("traceId={} 同盾拉取无效：false ",commonParams.get("traceId"));     //失败
            interfaceCountCache.setFailure(isRepeatKey);
            throw e;
        }
        if (response == null){
            log.info("traceId={} 同盾拉取无效：false ",commonParams.get("traceId"));     //失败
            interfaceCountCache.setFailure(isRepeatKey);
            new BusinessException("traceId={} 同盾拉取无效：false",true);
        }
        if(response.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
            interfaceCountCache.setFailure(isRepeatKey);
            return response;
        }
        FraudApiResponse apiResp = (FraudApiResponse)response.getData();
        response.setData(apiResp.getFinal_score());
        tdDataService.saveResult(orderNo, apiResp);
        return response;
    }

    private Map<String,Object> getCommonParams(AbstractRequestAuthentication request){
//        Integer loanType = (Integer)request.getParam("loanType");
//        String channel = (String)request.getParam("channel");
        String channelId = (String)request.getParam("channelId");
        String financialProductId = (String)request.getParam("financialProductId");
        String operationType = (String)request.getParam("operationType");
        String clientType = (String)request.getParam("clientType");
        RiskPersonalInfo personInfo = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        commonParams.put("traceId",TraceIDThreadLocal.getTraceID());
        commonParams.put("personalInfo",personInfo);
//        commonParams.put("loanType",loanType);
//        commonParams.put("channel",channel);
        commonParams.put("channelId",channelId);
        commonParams.put("financialProductId",financialProductId);
        commonParams.put("operationType",operationType);
        commonParams.put("clientType",clientType);
        return commonParams;
    }

    private String getKeyByOrderNo(String orderNo){
        return "rms_third_1008_"+orderNo;
    }
    /**
     * 版本02 处理器
     * @param request
     * @return
     */
    private ResponseResult handler02(AbstractRequestAuthentication request) throws Exception{
        return null;
    }

}
