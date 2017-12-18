package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.impl.BrPostService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 百融分
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 15:03.
 **/
@Component("request1011Handler")
public class Request1011Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("Bairong 1011");

    @Autowired
    BrPostService brPostService;

    @Autowired
    IRiskPostDataService riskPostDataService;

    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;

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
        String customerType = (String)params.get("customerType");
        Integer loanType = (Integer)params.get("loanType");
        if(StringUtils.isBlank(frontId)||StringUtils.isBlank(orderNo)||params.get("personInfo")==null
                || loanType==null||StringUtils.isBlank(orderNo)
                || StringUtils.isBlank(customerType)){
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
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequest request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        String customerType =(String) request.getParam("customerType");
        Integer loanType = (Integer)request.getParam("loanType");
        RiskPersonalInfo info = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Integer type = Integer.parseInt(customerType);
        // 1.搜索mongo中是否存在
        JSONObject jsonObject = riskPostDataService.getBairongData(info.getName(), info.getCertCardNo(),info.getMobile(),customerType);
        if(null != jsonObject){
            riskPostDataService.saveRmsData(orderNo, jsonObject.toJSONString(), customerType);
            JSONObject resultJson = new JSONObject();
            resultJson.put("score",jsonObject.getString("scorepettycashv1"));
            if (StringUtils.isBlank(resultJson.getString("score"))){
                resultJson.put("score",jsonObject.getString("scoreconsoffv2"));
            }
            resultJson.put("weight",jsonObject.getString("Rule_final_weight"));
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,resultJson);
        }
        // 2.判断是否远程拉取
        String isRepeatKey = getKeyPersonalInfo(info);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            return new ResponseResult(traceId,ReturnCode.ACTIVE_THIRD_RPC,null);
        }
        // 3.远程拉取
        String result = null;
        try{
            result = brPostService.getApiData(info,type,loanType,getCommonParams(request));
        }catch (Exception e){
            interfaceCountCache.setFailure(isRepeatKey);
            log.error("traceId={} 保存数据失败",traceId,e);
            throw e;
        }
        if (StringUtil.checkNotEmpty(result)) {
            try{
                riskPostDataService.saveRmsData(orderNo, result, customerType);
                riskPostDataService.saveRmsThirdData(info, customerType, result);
            }catch (Exception e) {
                log.error("traceId={} 保存数据失败",traceId,e);
                interfaceCountCache.setFailure(isRepeatKey);
            }
            JSONObject resultJson = new JSONObject();
            JSONObject tempResult = JSONObject.parseObject(result);
            resultJson.put("score",tempResult.getString("scorepettycashv1"));
            if (StringUtils.isBlank(tempResult.getString("score"))){
                resultJson.put("score",tempResult.getString("scoreconsoffv2"));
            }
            resultJson.put("weight",tempResult.getString("Rule_final_weight"));
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,resultJson);
        }
        interfaceCountCache.setFailure(isRepeatKey);
        return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL,result);
    }





    /**
     * 获取 唯一Key
     * @return
     */
    private String getKeyPersonalInfo(RiskPersonalInfo info){
        StringBuilder sb = new StringBuilder("rms_third_1011_");
        sb.append(info.getName());
        sb.append("_");
        sb.append(info.getCertCardNo());
        sb.append("_");
        sb.append(info.getMobile());
        return sb.toString();
    }

    private Map<String,Object> getCommonParams(AbstractRequest request){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        commonParams.put("isRpc",this.isRpc());
        return commonParams;
    }


}
