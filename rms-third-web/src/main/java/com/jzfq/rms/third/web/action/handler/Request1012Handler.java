package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;
import com.jzfq.rms.third.common.enums.PhoneThreeItemEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.IRong360Service;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 融360 手机三要素
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 16:40.
 **/
@Component("request1012Handler")
public class Request1012Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("Rong360 1012");
    @Autowired
    IRong360Service rong360Service;

    @Autowired
    IRmsService rmsService;

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String orderNo = (String)params.get("orderNo");
        String name = (String)params.get("name");
        String idNumber = (String)params.get("idNumber");
        String phone = (String)params.get("phone");
        String custumType = (String)params.get("custumType");
        if(StringUtils.isBlank(orderNo)||StringUtils.isBlank(name)
                ||StringUtils.isBlank(idNumber)||StringUtils.isBlank(phone)
                ||StringUtils.isBlank(custumType)){
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
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws Exception {
        if(org.apache.commons.lang.StringUtils.equals(request.getApiVersion(),"02")){
            return handler01(request);
        }
        return handler01(request);
    }
    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;
    /**
     * 版本01
     * @param request
     * @return
     * @throws Exception
     */
    private ResponseResult handler01(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        String taskIdStr = rmsService.queryByOrderNo(TraceIDThreadLocal.getTraceID(), orderNo);
        Long taskId = Long.parseLong(taskIdStr);
        if(taskId==null){
            return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.ERROR_TASK_ID_NULL,null);
        }
        // 数据库查询
        String name = request.getParam("name").toString();
        String idNumber = request.getParam("idNumber").toString();
        String phone = request.getParam("phone").toString();
        String custumType = request.getParam("custumType").toString();
        Map<String, Object> bizData = new HashMap<>();
        bizData.put("name",name);
        bizData.put("idNumber",idNumber);
        bizData.put("phone",phone);
        bizData.put("custumType",custumType);
        // 数据库
        String valueDb = rong360Service.getValueByDB(taskIdStr, InterfaceIdEnum.THIRD_RSLL03.getCode(),PhoneDataTypeEnum.THREE_ITEM,bizData);
        if(StringUtils.isNotBlank(valueDb)){
            return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,valueDb);
        }
        //远程调用
        String isRepeatKey = getRpcControlKey(bizData);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.ACTIVE_THIRD_RPC,null);
        }
        try {
            //手机三要素
            ResponseResult responseResult = rong360Service.getMobilecheck3item(bizData);
            if(responseResult.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
                interfaceCountCache.setFailure(isRepeatKey);
                return responseResult;
            }
            JSONObject resultJson = (JSONObject)responseResult.getData();
            // 转换rms-pull需要的值
            String value = getValueOfRmsPull(resultJson);
            // 保存数据
            rong360Service.saveDatas(taskIdStr, PhoneDataTypeEnum.THREE_ITEM, value, resultJson, bizData);
            responseResult.setData(value);
            return responseResult;
        }catch (Exception e){
            interfaceCountCache.setFailure(isRepeatKey);
            log.error("traceId={} 手机三要素异常",traceId,e);
            throw e;
        }
    }

    private String getValueOfRmsPull(JSONObject json){
        JSONArray jsonObject0 = json.getJSONArray("tianji_api_jiao_mobilecheck3item_response");
        JSONObject jsonObject1 = jsonObject0.getJSONObject(0);
        JSONObject jsonObject2 = jsonObject1.getJSONObject("checkResult");
        JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
        JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
        JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
        String jsonRsult0=jsonObject6.getString("code");
        String jsonRsult="";
        if("0".equals(jsonRsult0)){
            jsonRsult = PhoneThreeItemEnum.AGREE.getCode();
        }else if(StringUtils.equals("1",jsonRsult0)||
                StringUtils.equals("4",jsonRsult0)||
                StringUtils.equals("5",jsonRsult0)) {
            jsonRsult = PhoneThreeItemEnum.UNAGREE.getCode();
        }else{
            jsonRsult = PhoneThreeItemEnum.OTHER.getCode();
        }
        return jsonRsult;
    }

    /**
     * 远程调用key
     * @param bizData
     * @return
     */
    private String getRpcControlKey(Map<String, Object> bizData){
        StringBuilder sb = new StringBuilder("rms_third_1012_");
        sb.append(StringUtil.getStringOfObject(bizData.get("name")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("phone")));
        return sb.toString() ;
    }

}
