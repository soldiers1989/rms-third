package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJaoService;
import com.jzfq.rms.third.service.IRong360Service;
import com.jzfq.rms.third.support.cache.ICache;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import com.jzfq.rms.third.web.action.parser.JaoParser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 集奥 手机三要素
 *
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 16:40.
 **/
@Component("request1020Handler")
public class Request1020Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1020Handler.class);
    @Autowired
    IJaoService iJaoService;
    @Autowired
    IRong360Service iRong360Service;

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
        if (StringUtils.isBlank(frontId) || StringUtils.isBlank(orderNo)) {
            return false;
        }
        String name = (String) params.get("name");
        String idNumber = (String) params.get("idNumber");
        String phone = (String) params.get("phone");
        if (StringUtils.isBlank(name) || StringUtils.isBlank(idNumber)
                || StringUtils.isBlank(phone)) {
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
        if (org.apache.commons.lang.StringUtils.equals(request.getApiVersion(), "02")) {
            return handler01(request);
        }
        return handler01(request);
    }

    @Autowired
    ICountCache interfaceCountCache;
    @Autowired
    ICache prefixCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3 * 24 * 60 * 60L;

    /**
     * 版本01
     *
     * @param request
     * @return
     * @throws Exception
     */
    private ResponseResult handler01(AbstractRequest request) throws Exception {
        return getDataByThreeItems(request);
    }


    /**
     * 根据三要素获取 手机实名制
     *
     * @param request
     * @return
     * @throws Exception
     */
    private ResponseResult getDataByThreeItems(AbstractRequest request) throws Exception {
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        // 数据库查询
        String name = request.getParam("name").toString();
        String idNumber = request.getParam("idNumber").toString();
        String phone = request.getParam("phone").toString();
        String custumType = request.getParam("custumType").toString();
        String frontId = request.getParam("frontId").toString();
        Map<String, Object> bizData = new HashMap<>();
        bizData.put("realName", name);
        bizData.put("idNumber", idNumber);
        bizData.put("cid", phone);
        bizData.put("custumType", custumType);
//        bizData.put("frontId",frontId);

        //判断缓存key是否失效
        String isRepeatKey = JaoParser.getRpcControlKey(bizData);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey, time);
        log.info("traceId={} 获取手机三要素,缓存isRepeatKey={},是否重新拉取={}", traceId, isRepeatKey, isRpc);
        if (!isRpc) {
            // 数据库
//        String valueDb = rong360Service.getValueByDB(InterfaceIdEnum.THIRD_RSLL03.getCode(),PhoneDataTypeEnum.THREE_ITEM,bizData);
            String valueDb = iJaoService.getValueByDBAndSave(orderNo, InterfaceIdEnum.THIRD_RSLL03.getCode(), PhoneDataTypeEnum.THREE_ITEM, bizData);
            if (StringUtils.isNotBlank(valueDb)) {
                log.info("traceId={} 获取手机三要素成功(mongodb==jao),返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, valueDb)); //成功
                return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, valueDb);
            } else {
                //获取融360缓存数据
                bizData = newBizForRong360(bizData,name,idNumber,phone,custumType,frontId);
                valueDb = iRong360Service.getValueByDBAndSave(orderNo, InterfaceIdEnum.THIRD_RSLL03.getCode(), PhoneDataTypeEnum.THREE_ITEM, bizData);
                if (StringUtils.isNotBlank(valueDb)) {
                    log.info("traceId={} 获取手机三要素成功(mongodb==rong360),返回结果={}", traceId, new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, valueDb)); //成功
                    return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, valueDb);
                } else {
                    log.info("traceId={}，获取手机三要素成功(mongodb不存在此数据，请删除缓存重新拉取),", traceId); //成功
                    return new ResponseResult(traceId, ReturnCode.REQUEST_NO_EXIST_DATA, null);
                }
            }
        }
        try {
            //手机三要素远程拉取
            ResponseResult responseResult = iJaoService.getMobilecheck3item(bizData);
            responseResult.setTraceID(traceId);
            if (responseResult.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
                log.info("traceId={} 拉取三方手机三要素失败,返回结果={}", traceId, responseResult); //失败
                interfaceCountCache.setFailure(isRepeatKey);
                return responseResult;
            }

            //恢复上线
            JSONObject resultJson = (JSONObject) responseResult.getData();
            // 转换rms-pull需要的值
            String value = JaoParser.getValueOfRmsPull(resultJson);
            //校验验证码
            if (!JaoCodeEnum.checkJaoCode(value) || !JaoEclCodeEnum.checkJaoCode(value)) {
                interfaceCountCache.setFailure(isRepeatKey);
                log.info("traceId={} 拉取三方手机三要素返回错误码={},返回结果={}", traceId,value, responseResult); //失败
                responseResult.setData(null);
                responseResult.setCode(Integer.parseInt(value));
                iJaoService.saveErrorDatas(orderNo, PhoneDataTypeEnum.THREE_ITEM, value, resultJson, bizData);
                return responseResult;
            }
            // 保存数据
            iJaoService.saveDatas(orderNo, PhoneDataTypeEnum.THREE_ITEM, value, resultJson, bizData);
            responseResult.setData(value);
            log.info("traceId={} 拉取三方手机三要素成功,返回结果={}", traceId, responseResult); //失败
            return responseResult;
        } catch (Exception e) {
            interfaceCountCache.setFailure(isRepeatKey);
            log.error("traceId={} 手机三要素异常", traceId, e);
            throw e;
        }
    }

    /*
     * 封装融360缓存参数数据
     * */

    public static Map<String, Object> newBizForRong360(Map<String, Object> bizData, String name,
                                                       String idNumber,
                                                       String phone,
                                                       String custumType,
                                                       String frontId) {
        Map<String, Object> bizData1 = new HashMap<>();
        bizData1.put("name", name);
        bizData1.put("idNumber", idNumber);
        bizData1.put("phone", phone);
        bizData1.put("custumType", custumType);
        bizData1.put("frontId", frontId);
        return bizData1;
    }


}
