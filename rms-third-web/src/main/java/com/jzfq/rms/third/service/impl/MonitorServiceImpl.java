package com.jzfq.rms.third.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jzfq.rms.third.common.domain.*;
import com.jzfq.rms.third.common.dto.MonitorSendDTO;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.pojo.Monitor;
import com.jzfq.rms.third.common.utils.IPUtils;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.mapper.*;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
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

import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/19 21:48.
 **/
@Service("monitorService")
public class MonitorServiceImpl implements IMonitorService {
    private static final Logger logger = LoggerFactory.getLogger(MonitorServiceImpl.class);
    @Value("${rms.monitor.log.url}")
    private String apiUrl;

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
            Map<String,Object> monitorParams  = creatMonitorMessage(traceId,params);
            ResponseResult dto = postData(monitorParams);
            logger.info("traceId={} 发送监控消息 返回结果:{}", traceId,dto.toString());
        });
    }


    public ResponseResult postData(Map<String,Object> params){
        ResponseResult dto = HttpConnectionManager.doUncheckPost(apiUrl,params);
        return dto;
    }
    private  Map<String,Object> creatMonitorMessage(String traceId, Map<String, Object> params){
        Map<String,Object> monitorParams = new HashMap<>();
//        monitorParams.put("traceID",getString(params,"traceId"));
//        monitorParams.put("systemID",getString(params,"systemID"));

        monitorParams.put("traceID",11);
        monitorParams.put("systemID",22);
        Monitor monitor = createMonitorParams(params);
        String json = JSON.toJSONString(monitor, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteMapNullValue);
        monitorParams.put("params",json);
        return monitorParams;
    }

    private Monitor createMonitorParams(Map<String, Object> params){

        Monitor monitor = new Monitor();
//        monitor.setFront_id(getString(params,"frontId"));
//        monitor.setProductConfigID(getString(params,"rms"));
//        monitor.setSendParam(getString(params,"bizParms"));
//        monitor.setSendType(getString(params,"sendType"));
//        monitor.setSendURL(getString(params,"url"));
//        monitor.setTraceID(getString(params,"traceId"));
//        ResponseResult response = (ResponseResult)params.get("response");
//        monitor.setReturnState(JSONUtils.toJSONString(response.getCode()));
//        monitor.setReturnResult(JSONUtils.toJSONString(response.getMsg()));
//        monitor.setCreator(getString(params,"rms-third"));
        monitor.setFront_id("11");
        monitor.setTargetID("1");
        monitor.setSourceID("11");
        monitor.setProductConfigID("11");
        monitor.setSendParam("222");
        monitor.setSendType("232");
        monitor.setSendURL("323");
        monitor.setTraceID("222");
        monitor.setReturnState("22");
        monitor.setReturnResult("sw");
        monitor.setCreator("1111");
        monitor.setSystemIP(IPUtils.getLocalHostIP());
        return monitor;
    }

    private String getString(Map<String,Object> params,String key){
        Object input = params.get(key);
        if(input==null){
            return "";
        }
        return input.toString();
    }
    @Override
    public void sendLogToDB(String traceId, Map<String, Object> params) {
        ThreadProvider.getThreadPool().execute(() ->  {
            String targetId = getString(params,"targetId");
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
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"apiId"));
        ResponseResult result = (ResponseResult)params.get("response");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(params,"frontId"));
        record.setcParams(getString(params,"bizParams"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcMsg(JSONUtils.toJSONString(result.getMsg()));
        return record;
    }

    private TGpjTransferLog createNewGpjRecord(Map<String, Object> params){
        TGpjTransferLog record = new TGpjTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"interfaceId"));
        record.setcTraceid(getString(params,"traceId"));
        record.setcSystemId(getString(params,"systemId"));
        ResponseResult result = (ResponseResult)params.get("response");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(params,"appId"));
        Map<String,Object> bizParams = (Map<String,Object>)params.get("bizParams");
        String bizStr = JSON.toJSONString(bizParams, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteMapNullValue);
        record.setcParams(bizStr);
        record.setcProLine(getString(params,"systemId"));
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
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"apiId"));
        ResponseResult result = (ResponseResult)params.get("response");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(params,"frontId"));
        record.setcParams(getString(params,"bizParams"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcMsg(JSONUtils.toJSONString(result.getMsg()));
        return record;
    }

    private TTdTransferLog createNewTdRecord(Map<String, Object> params){
        TTdTransferLog record = new TTdTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"apiId"));
        ResponseResult result = (ResponseResult)params.get("response");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(params,"frontId"));
        record.setcParams(getString(params,"bizParams"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcMsg(JSONUtils.toJSONString(result.getMsg()));
        return record;
    }

    private TBrTransferLog createNewBrRecord(Map<String, Object> params){
        TBrTransferLog record = new TBrTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"apiId"));
        ResponseResult result = (ResponseResult)params.get("response");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(params,"frontId"));
        record.setcParams(getString(params,"bizParams"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcMsg(JSONUtils.toJSONString(result.getMsg()));
        return record;
    }

    private TRsllTransferLog createNewRsllRecord(Map<String, Object> params){
        TRsllTransferLog record = new TRsllTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"apiId"));
        ResponseResult result = (ResponseResult)params.get("response");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(params,"frontId"));
        record.setcParams(getString(params,"bizParams"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcMsg(JSONUtils.toJSONString(result.getMsg()));
        return record;
    }

    private TJieanTransferLog createNewJieanRecord(Map<String, Object> params){
        TJieanTransferLog record = new TJieanTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"apiId"));
        ResponseResult result = (ResponseResult)params.get("response");
        record.setcStatus(JSONUtils.toJSONString(result.getCode()));
        record.setcChannel(getString(params,"frontId"));
        record.setcParams(getString(params,"bizParams"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcMsg(JSONUtils.toJSONString(result.getMsg()));
        return record;
    }
}
