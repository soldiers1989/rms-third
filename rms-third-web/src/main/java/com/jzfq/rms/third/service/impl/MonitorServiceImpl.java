package com.jzfq.rms.third.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jzfq.rms.third.common.domain.*;
import com.jzfq.rms.third.common.dto.MonitorSendDTO;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ResponseHandlerEnum;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.pojo.Monitor;
import com.jzfq.rms.third.common.utils.IPUtils;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.persistence.mapper.*;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import com.jzfq.rms.third.support.response.IResponseHandler;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import com.jzfq.rms.third.support.send.ISendHandler;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/19 21:48.
 **/
@Service("monitorService")
public class MonitorServiceImpl implements IMonitorService {
    private static final Logger logger = LoggerFactory.getLogger(MonitorServiceImpl.class);

    @Autowired
    IConfigDao configCacheDao;
    @Autowired
    TPyTransferLogMapper pyTransferLogMapper;
    @Autowired
    TJxlTransferLogMapper jxlTransferLogMapper;
    @Autowired
    TGpjTransferLogMapper gpjTransferLogMapper;
    @Autowired
    TJieanTransferLogMapper jieanTransferLogMapper;
    @Autowired
    TBrTransferLogMapper brTransferLogMapper;
    @Autowired
    TRsllTransferLogMapper rsllTransferLogMapper;
    @Autowired
    TTdTransferLogMapper tdTransferLogMapper;


    @Override
    public void sendLogToMonitor(String traceId, Map<String, Object> params) {
        ThreadProvider.getThreadPool().execute(() ->  {
            Map<String,Object> monitorParams  = creatMonitorMessage(params);
            ResponseResult dto = postData(monitorParams);
            logger.info("traceId={} 发送监控消息 返回结果:{}", traceId, StringUtil.getStringOfObject(dto));
        });
    }
    public ResponseResult postData(Map<String,Object> params){
        ResponseResult dto = HttpConnectionManager.doUncheckPost(configCacheDao.getMonitorUrl(),params);
        return dto;
    }
    private  Map<String,Object> creatMonitorMessage(Map<String, Object> params){
        Map<String,Object> monitorParams = new HashMap<>();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        monitorParams.put("traceID",getString(commonParams,"traceId"));
        monitorParams.put("callSystemID", SystemIdEnum.RMS_THIRD.getCode());
        Monitor monitor = createMonitorParams(params);
        monitorParams.put("params",toJSONString(monitor));
        return monitorParams;
    }

    private Monitor createMonitorParams(Map<String, Object> params){
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        Monitor monitor = new Monitor();
        monitor.setFrontID(getString(commonParams,"frontId"));
        monitor.setProductConfigID(getInteger(SystemIdEnum.RMS_THIRD.getCode()));
        monitor.setSendParam(getString(params,"bizParms"));
        monitor.setSendType(getInteger(commonParams,"sendType"));
        monitor.setSendURL(getString(commonParams,"url"));
        monitor.setTraceID(getString(commonParams,"traceId"));
        ResponseResult response = (ResponseResult)params.get("handlerResult");
        monitor.setReturnState(JSONUtils.toJSONString(response.getCode()));
        monitor.setReturnResult(JSONUtils.toJSONString(response.getMsg()));
        monitor.setCreator(SystemIdEnum.RMS_THIRD.getName());
        monitor.setTargetID(getInteger(commonParams,"targetID"));
        monitor.setSourceID(getInteger(SystemIdEnum.RMS_THIRD.getCode()));
        monitor.setSystemIP(IPUtils.getLocalHostIP());
        return monitor;
    }

    private String getString(Map<String,Object> params,String key){
        Object input = params.get(key);
        if(input==null){
            return "N/A";
        }
        return input.toString().trim();
    }
    private Integer getInteger(Object ob){
        if(ob==null||!NumberUtils.isNumber(ob.toString().trim())){
            return 0;
        }
        return Integer.parseInt(ob.toString().trim());
    }
    private Long getLong(Object ob){
        if(ob==null||!NumberUtils.isNumber(ob.toString().trim())){
            return 0L;
        }
        return Long.parseLong(ob.toString().trim());
    }
    private Long getLong(Map<String,Object> params,String key){
        Object input = params.get(key);
        if(input==null||!NumberUtils.isNumber(input.toString().trim())){
            return 0L;
        }
        return Long.parseLong(input.toString().trim());
    }
    private Integer getInteger(Map<String,Object> params,String key){
        Object input = params.get(key);
        if(input==null||!NumberUtils.isNumber(input.toString().trim())){
            return 0;
        }
        return Integer.parseInt(input.toString().trim());
    }
    private String toJSONString(Object ob){
        if(ob==null){
            return "N/A";
        }
        String json = JSON.toJSONString(ob, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteMapNullValue);
        return json;
    }

    @Override
    public void sendLogToDB(String traceId, Map<String, Object> params) {
        ThreadProvider.getThreadPool().execute(() ->  {
            Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
            String targetId = getString(commonParams,"targetId");
            if(StringUtils.equals(targetId, SystemIdEnum.THIRD_GPJ.getCode())){
                TGpjTransferLog log = createNewGpjRecord(params);
                gpjTransferLogMapper.insert(log);
                return;
            }
            if(StringUtils.equals(targetId,SystemIdEnum.THIRD_BR.getCode())){
                TBrTransferLog log = createNewBrRecord(params);
                brTransferLogMapper.insert(log);
                return;
            }
            if(StringUtils.equals(targetId,SystemIdEnum.THIRD_RSLL.getCode())){
                TRsllTransferLog log = createNewRsllRecord(params);
                rsllTransferLogMapper.insert(log);
                return;
            }
            if(StringUtils.equals(targetId,SystemIdEnum.THIRD_TD.getCode())){
                TTdTransferLog log = createNewTdRecord(params);
                tdTransferLogMapper.insert(log);
                return;
            }
            if(StringUtils.equals(targetId,SystemIdEnum.THIRD_JIEAN.getCode())){
                TJieanTransferLog log = createNewJieanRecord(params);
                jieanTransferLogMapper.insert(log);
                return;
            }
            if(StringUtils.equals(targetId,SystemIdEnum.THIRD_PY.getCode())){
                TPyTransferLog log = createNewPyRecord(params);
                pyTransferLogMapper.insert(log);
                return;
            }
            if(StringUtils.equals(targetId,SystemIdEnum.THIRD_JXL.getCode())){
                TJxlTransferLog log = createNewJxlRecord(params);
                jxlTransferLogMapper.insert(log);
            }
        });
    }


    private TPyTransferLog createNewPyRecord(Map<String, Object> params){
        TPyTransferLog record = new TPyTransferLog();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(commonParams,"interfaceId"));
        record.setcTraceid(getString(commonParams,"traceId"));
        record.setcSystemId(getString(commonParams,"systemId"));
        ResponseResult result = (ResponseResult)params.get("handlerResult");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(commonParams,"appId"));
        record.setcParams(toJSONString(params.get("bizParams")));
        record.setcProLine(getString(commonParams,"systemId"));
        Exception error = (Exception)params.get("exception");
        if(error!=null){
            record.setcMsg(error.getMessage());
            record.setcMsgDetail(error.toString());
        }else {
            record.setcMsg(result.getMsg());
        }
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(IPUtils.getLocalHostIP());
        return record;
    }

    private TGpjTransferLog createNewGpjRecord(Map<String, Object> params){
        TGpjTransferLog record = new TGpjTransferLog();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(commonParams,"interfaceId"));
        record.setcTraceid(getString(commonParams,"traceId"));
        record.setcSystemId(getString(commonParams,"systemId"));
        ResponseResult result = (ResponseResult)params.get("handlerResult");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(commonParams,"appId"));
        record.setcParams(toJSONString(params.get("bizParams")));
        record.setcProLine(getString(commonParams,"systemId"));
        Exception error = (Exception)params.get("exception");
        if(error!=null){
            record.setcMsg(error.getMessage());
            record.setcMsgDetail(error.toString());
        }else {
            record.setcMsg(result.getMsg());
        }
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(IPUtils.getLocalHostIP());
        return record;
    }

    private TJxlTransferLog createNewJxlRecord(Map<String, Object> params){
        TJxlTransferLog record = new TJxlTransferLog();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(commonParams,"interfaceId"));
        record.setcTraceid(getString(commonParams,"traceId"));
        record.setcSystemId(getString(commonParams,"systemId"));
        ResponseResult result = (ResponseResult)params.get("handlerResult");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(commonParams,"appId"));
        record.setcParams(toJSONString(params.get("bizParams")));
        record.setcProLine(getString(commonParams,"systemId"));
        Exception error = (Exception)params.get("exception");
        if(error!=null){
            record.setcMsg(error.getMessage());
            record.setcMsgDetail(error.toString());
        }else {
            record.setcMsg(result.getMsg());
        }
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(IPUtils.getLocalHostIP());
        return record;
    }

    private TTdTransferLog createNewTdRecord(Map<String, Object> params){
        TTdTransferLog record = new TTdTransferLog();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(commonParams,"interfaceId"));
        record.setcTraceid(getString(commonParams,"traceId"));
        record.setcSystemId(getString(commonParams,"systemId"));
        ResponseResult result = (ResponseResult)params.get("handlerResult");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(commonParams,"appId"));
        record.setcParams(toJSONString(params.get("bizParams")));
        record.setcProLine(getString(commonParams,"systemId"));
        Exception error = (Exception)params.get("exception");
        if(error!=null){
            record.setcMsg(error.getMessage());
            record.setcMsgDetail(error.toString());
        }else {
            record.setcMsg(result.getMsg());
        }
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(IPUtils.getLocalHostIP());
        return record;
    }

    private TBrTransferLog createNewBrRecord(Map<String, Object> params){
        TBrTransferLog record = new TBrTransferLog();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(commonParams,"interfaceId"));
        record.setcTraceid(getString(commonParams,"traceId"));
        record.setcSystemId(getString(commonParams,"systemId"));
        ResponseResult result = (ResponseResult)params.get("handlerResult");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(commonParams,"appId"));
        record.setcParams(toJSONString(params.get("bizParams")));
        record.setcProLine(getString(commonParams,"systemId"));
        Exception error = (Exception)params.get("exception");
        if(error!=null){
            record.setcMsg(error.getMessage());
            record.setcMsgDetail(error.toString());
        }else {
            record.setcMsg(result.getMsg());
        }
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(IPUtils.getLocalHostIP());
        return record;
    }

    private TRsllTransferLog createNewRsllRecord(Map<String, Object> params){
        TRsllTransferLog record = new TRsllTransferLog();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(commonParams,"interfaceId"));
        record.setcTraceid(getString(commonParams,"traceId"));
        record.setcSystemId(getString(commonParams,"systemId"));
        ResponseResult result = (ResponseResult)params.get("handlerResult");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(commonParams,"appId"));
        record.setcParams(toJSONString(params.get("bizParams")));
        record.setcProLine(getString(commonParams,"systemId"));
        Exception error = (Exception)params.get("exception");
        if(error!=null){
            record.setcMsg(error.getMessage());
            record.setcMsgDetail(error.toString());
        }else {
            record.setcMsg(result.getMsg());
        }
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(IPUtils.getLocalHostIP());
        return record;
    }

    private TJieanTransferLog createNewJieanRecord(Map<String, Object> params){
        TJieanTransferLog record = new TJieanTransferLog();
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(commonParams,"interfaceId"));
        record.setcTraceid(getString(commonParams,"traceId"));
        record.setcSystemId(getString(commonParams,"systemId"));
        ResponseResult result = (ResponseResult)params.get("handlerResult");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(commonParams,"appId"));
        record.setcParams(toJSONString(params.get("bizParams")));
        record.setcProLine(getString(commonParams,"systemId"));
        Exception error = (Exception)params.get("exception");
        if(error!=null){
            record.setcMsg(error.getMessage());
            record.setcMsgDetail(error.toString());
        }else {
            record.setcMsg(result.getMsg());
        }
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(IPUtils.getLocalHostIP());
        return record;
    }
}
