package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.mongo.TongDunData;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IBrPostService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.service.impl.BrPostService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import io.jsonwebtoken.lang.Collections;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 小桔汇金 同盾百融
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/18 13:11.
 **/
@Component("request1019Handler")
public class Request1019Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1019Handler.class);
    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String name = (String)params.get("name");
        String certCardNo = (String)params.get("certCardNo");
        String phone = (String)params.get("phone");
        String orderNo = (String)params.get("orderNo");
        String serialNo = (String)params.get("serialNo");
        String channel = (String)params.get("channel");
        boolean juzi = (boolean)params.get("juzi");
        if(StringUtils.isBlank(name)||StringUtils.isBlank(certCardNo)
                ||StringUtils.isBlank(phone)
                ||StringUtils.isBlank(channel)||StringUtils.isBlank(serialNo)
                ||params.get("juzi")==null
                ||(juzi&&StringUtils.isBlank(orderNo))
                ){
            return false;
        }
        return true;
    }
    @Autowired
    ITdDataService tdDataService;
    @Autowired
    IRiskPostDataService riskPostDataService;
    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;
    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {
        log.info("traceId={} 小桔汇金接口 1019 开始", TraceIDThreadLocal.getTraceID());
        JSONObject brData = getBrData(request);
        JSONObject tdData = getTdData(request);
        JSONObject result = new JSONObject();
        result.putAll(brData);
        result.putAll(tdData);
        if(StringUtils.equals(brData.getString("brFlag"),"200")
                ||StringUtils.equals(brData.getString("tdFlag"),"200")){
            log.info("traceId={} 小桔汇金接口 1019 结束", TraceIDThreadLocal.getTraceID());
            return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS, result);
        }
        return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.ERROR_RESPONSE_NULL, request);
    }

    @Autowired
    BrPostService brPostService;

    private static final int OFFICE_TYPE = 0;
    private static final String OFFICE_TYPE_STR = "0";
    JSONObject getBrData(AbstractRequest request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String name = request.getParam("name").toString();
        String certCardNo = request.getParam("certCardNo").toString();
        String phone = request.getParam("phone").toString();
        String serialNo = request.getParam("serialNo").toString();
        String channel = request.getParam("channel").toString();
        log.info("traceId={} 渠道={} 小桔汇金接口 1019 百融 开始", TraceIDThreadLocal.getTraceID(), channel);
        JSONObject result = new JSONObject();
        result.put("brScore", "");
        result.put("brFlag",ReturnCode.REQUEST_SUCCESS.code());
        // 百融
        BairongData bairongData = riskPostDataService.getBairongDataByOrder(name, certCardNo, phone);
        if(bairongData!=null){
            result.put("brScore",bairongData.getData());
            return result;
        }

        RiskPersonalInfo info = new RiskPersonalInfo();
        info.setCertCardNo(certCardNo);
        info.setName(name);
        info.setMobile(phone);
        // 2.判断是否远程拉取
        String isRepeatKey = getKeyPersonalInfo(info);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            result.put("brFlag",ReturnCode.ACTIVE_THIRD_RPC.code());
            return result;
        }
        // 3.远程拉取
        ResponseResult brResponse = null;
        try{
            brResponse = brPostService.getApiData(info,getCommonParams(request));
        }catch (Exception e){
            interfaceCountCache.setFailure(isRepeatKey);
            result.put("brFlag",ReturnCode.ERROR_SERVER.code());
            log.error("traceId={} serialNo={} 获取百融分失败",traceId,serialNo,e);
            throw e;
        }
        if (brResponse == null || brResponse.getCode()!=ReturnCode.REQUEST_SUCCESS.code()) {
            interfaceCountCache.setFailure(isRepeatKey);
            result.put("brFlag",ReturnCode.ERROR_RESPONSE_NULL.code());
            return result;
        }
        String brResponseData = (String)brResponse.getData();
        try{
            riskPostDataService.saveRmsThirdData(info,null, brResponseData);
        }catch (Exception e) {
            log.error("traceId={} 保存数据失败",traceId,e);
            result.put("brFlag",ReturnCode.ERROR_SERVER.code());
            interfaceCountCache.setFailure(isRepeatKey);
        }
        interfaceCountCache.setFailure(isRepeatKey);
        result.put("brFlag",ReturnCode.ERROR_RESPONSE_NULL.code());
        return result;
    }

    /**
     * 获取 唯一Key
     * @return
     */
    private String getKeyPersonalInfo(RiskPersonalInfo info){
        StringBuilder sb = new StringBuilder("rms_third_1019_br_");
        sb.append(info.getName());
        sb.append("_");
        sb.append(info.getCertCardNo());
        sb.append("_");
        sb.append(info.getMobile());
        return sb.toString();
    }


    JSONObject getTdData(AbstractRequest request) throws Exception{
        String serialNo = request.getParam("serialNo").toString();
        boolean juzi = (boolean)request.getParam("juzi");
        String traceId = TraceIDThreadLocal.getTraceID();
        JSONObject result = new JSONObject();
        result.put("tdScore","");
        result.put("tdDetail","");
        result.put("tdFlag",ReturnCode.REQUEST_SUCCESS.code());
        // 同盾
        if(juzi){
            String orderNo = request.getParam("orderNo").toString();
            List<TongDunData> tongDunData = tdDataService.getTongDongData(orderNo);
            if(Collections.isEmpty(tongDunData)){
                result.put("tdScore",tongDunData.get(0).getApiResp());
                result.put("tdDetail",tongDunData.get(0).getRuleDetailResult());
            }else{
                result.put("tdFlag",ReturnCode.ERROR_RESPONSE_NULL.code());
            }
            log.info("1019 traceId={} serialNo={}获取同盾标识:{}",traceId,orderNo,result.get("tdFlag"));
            return result;
        }
        List<TongDunData> tongDunData = tdDataService.getTongDongDataBySerialNo(serialNo);
        if(Collections.isEmpty(tongDunData)){
            result.put("tdScore",tongDunData.get(0).getApiResp());
            result.put("tdDetail",tongDunData.get(0).getRuleDetailResult());
            log.info("1019 traceId={} serialNo={}获取同盾标识:{}",traceId,serialNo,result.get("tdFlag"));
            return result;
        }
        String isRepeatKey = getKeyBySerialNo(serialNo);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            result.put("tdFlag",ReturnCode.ACTIVE_THIRD_RPC.code());
            log.info("1019 traceId={} serialNo={}获取同盾标识:{}",traceId,serialNo,result.get("tdFlag"));
            return result;
        }
        Map<String,Object> commonParams = getCommonParams(request);
        JSONObject response =null;
        try {
            response = tdDataService.queryTdAllDatas(serialNo, commonParams);
        }catch (Exception e){
            log.info("traceId={} 同盾拉取无效：false ",commonParams.get("traceId"));     //失败
            interfaceCountCache.setFailure(isRepeatKey);
            result.put("tdFlag",ReturnCode.ERROR_SERVER.code());
            log.info("1019 traceId={} serialNo={}获取同盾标识:{}",traceId,serialNo,result.get("tdFlag"));
            return result;
        }
        if(response == null){
            interfaceCountCache.setFailure(isRepeatKey);
            result.put("tdFlag",ReturnCode.ERROR_RESPONSE_NULL.code());
            log.info("1019 traceId={} serialNo={}获取同盾标识:{}",traceId,serialNo,result.get("tdFlag"));
            return result;
        }
        if(response.getInteger("tdFlag") != ReturnCode.REQUEST_SUCCESS.code()){
            interfaceCountCache.setFailure(isRepeatKey);
            result.put("tdFlag",ReturnCode.ERROR_THIRD_RESPONSE.code());
            log.info("1019 traceId={} serialNo={}获取同盾标识:{}",traceId,serialNo,result.get("tdFlag"));
            return result;
        }
        result.putAll(response);
        log.info("1019 traceId={} serialNo={}获取同盾标识:{}",traceId,serialNo,result.get("tdFlag"));
        return response;
    }
    private String getKeyBySerialNo(String serialNo){
        return "rms_third_1019_td_"+serialNo;
    }
    private Map<String,Object> getCommonParams(AbstractRequest request){
        String channelId = ChannelIdEnum.JZFQ.getCode();
        String financialProductId = FinancialProductIdEnum.XYQB.getCode();//信用钱包
        String operationType = OperationTypeEnum.RZ.getCode();//认证
        String clientType = ClientTypeEnum.AND.getCode();
        String name = request.getParam("name").toString();
        String certCardNo = request.getParam("certCardNo").toString();
        String phone = request.getParam("phone").toString();
        String qq = (String)request.getParam("qq");
        String email = (String)request.getParam("email");
        String cardNumber = (String)request.getParam("cardNumber");
        RiskPersonalInfo personInfo = new RiskPersonalInfo();
        personInfo.setCertCardNo(certCardNo);
        personInfo.setName(name);
        personInfo.setMobile(phone);
        personInfo.setQq(qq);
        personInfo.setEmail(email);
        personInfo.setBankNo(cardNumber);
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        commonParams.put("traceId",TraceIDThreadLocal.getTraceID());
        commonParams.put("personalInfo",personInfo);
        commonParams.put("channelId",channelId);
        commonParams.put("financialProductId",financialProductId);
        commonParams.put("operationType",operationType);
        commonParams.put("clientType",clientType);
        return commonParams;
    }
}
