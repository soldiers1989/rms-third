package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;
import com.jzfq.rms.third.common.enums.PhoneNetworkLengthEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.IRong360Service;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import com.jzfq.rms.third.web.action.parser.Rong360Parser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 融360 在网时长
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 16:41.
 **/
@Component("request1013Handler")
public class Request1013Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1013Handler.class);

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
        String frontId = (String)params.get("frontId");
        String orderNo = (String)params.get("orderNo");
        String name = (String)params.get("name");
        String idNumber = (String)params.get("idNumber");
        String phone = (String)params.get("phone");
        String custumType = (String)params.get("custumType");
        if(StringUtils.isBlank(frontId)||StringUtils.isBlank(orderNo)||StringUtils.isBlank(name)
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
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {
        if(StringUtils.equals(request.getApiVersion(),"02")){
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
    private ResponseResult handler01(AbstractRequest request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        // 数据库查询
        String name = request.getParam("name").toString();
        String idNumber = request.getParam("idNumber").toString();
        String phone = request.getParam("phone").toString();
        String custumType = request.getParam("custumType").toString();
        String frontId = request.getParam("frontId").toString();
        Map<String, Object> bizData = new HashMap<>();
        bizData.put("name",name);
        bizData.put("idNumber",idNumber);
        bizData.put("phone",phone);
        bizData.put("custumType",custumType);
        bizData.put("frontId",frontId);
        // 数据库
//        String valueDb = rong360Service.getValueByDB( InterfaceIdEnum.THIRD_RSLL01.getCode(),PhoneDataTypeEnum.NETWORK_LENGTH,bizData);
        String valueDb = rong360Service.getValueByDBAndSave(orderNo, InterfaceIdEnum.THIRD_RSLL01.getCode(),PhoneDataTypeEnum.NETWORK_LENGTH,bizData);
        if(StringUtils.isNotBlank(valueDb)){
            return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,valueDb);
        }
        //远程调用
        String isRepeatKey = Rong360Parser.getRpcKeyOfNetWorkLength(bizData);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.ACTIVE_THIRD_RPC,null);
        }
        try {
            //手机在网时长
            ResponseResult responseResult = rong360Service.getPhoneNetworkLength(bizData);
            responseResult.setTraceID(traceId);
            if(responseResult.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
                interfaceCountCache.setFailure(isRepeatKey);
                return responseResult;
            }
            JSONObject resultJson = (JSONObject)responseResult.getData();
            // 转换rms-pull需要的值
            String value = Rong360Parser.getNetworkLengthOfRmsPull(resultJson);
            // 保存数据
            rong360Service.saveDatas(orderNo, PhoneDataTypeEnum.NETWORK_LENGTH, value, resultJson, bizData);
            responseResult.setData(value);
            return responseResult;
        }catch (Exception e){
            interfaceCountCache.setFailure(isRepeatKey);
            log.error("traceId={} 手机在网时长异常",traceId,e);
            throw e;
        }
    }
}
