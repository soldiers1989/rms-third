package com.jzfq.rms.third.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jzfq.rms.third.common.domain.*;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.utils.IPUtils;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.persistence.mapper.*;
import com.jzfq.rms.third.service.IDbLogService;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/2 18:51.
 **/
@Service("dbLogService")
public class DbLogServiceImpl implements IDbLogService {
    private static final Logger logger = LoggerFactory.getLogger(DbLogServiceImpl.class);

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
    public void writeLogToDB(String traceId, Map<String, Object> params, Map<String, Object> logParams) {
        String targetId = getString(params,"targetId");
        if(StringUtils.equals(targetId, SystemIdEnum.THIRD_GPJ.getCode())){
            TGpjTransferLog log = createNewGpjRecord(logParams);
            gpjTransferLogMapper.insert(log);
            return;
        }
        if(StringUtils.equals(targetId,SystemIdEnum.THIRD_BR.getCode())){
            TBrTransferLog log = createNewBrRecord(logParams);
            brTransferLogMapper.insert(log);
            return;
        }
        if(StringUtils.equals(targetId,SystemIdEnum.THIRD_RSLL.getCode())){
            TRsllTransferLog log = createNewRsllRecord(logParams);
            rsllTransferLogMapper.insert(log);
            return;
        }
        if(StringUtils.equals(targetId,SystemIdEnum.THIRD_TD.getCode())){
            TTdTransferLog log = createNewTdRecord(logParams);
            tdTransferLogMapper.insert(log);
            return;
        }
        if(StringUtils.equals(targetId,SystemIdEnum.THIRD_JIEAN.getCode())){
            TJieanTransferLog log = createNewJieanRecord(logParams);
            jieanTransferLogMapper.insert(log);
            return;
        }
        if(StringUtils.equals(targetId,SystemIdEnum.THIRD_PY.getCode())){
            TPyTransferLog log = createNewPyRecord(logParams);
            pyTransferLogMapper.insert(log);
            return;
        }
        if(StringUtils.equals(targetId,SystemIdEnum.THIRD_JXL.getCode())){
            TJxlTransferLog log = createNewJxlRecord(logParams);
            jxlTransferLogMapper.insert(log);
        }
    }
    private TPyTransferLog createNewPyRecord(Map<String, Object> params){
        TPyTransferLog record = new TPyTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"interfaceId"));
        record.setcTraceid(getString(params,"traceId"));
        record.setcSystemId(getString(params,"systemId"));
        record.setcStatus(getString(params,"status"));
        record.setcMsg(getString(params,"message"));
        record.setcChannel(getString(params,"appId"));
        record.setcParams(getString(params,"params"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(getString(params,"systemIP"));
        return record;
    }

    private TGpjTransferLog createNewGpjRecord(Map<String, Object> params){
        TGpjTransferLog record = new TGpjTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"interfaceId"));
        record.setcTraceid(getString(params,"traceId"));
        record.setcSystemId(getString(params,"systemId"));
        record.setcStatus(getString(params,"status"));
        record.setcMsg(getString(params,"message"));
        record.setcChannel(getString(params,"appId"));
        record.setcParams(getString(params,"params"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(getString(params,"systemIP"));
        return record;
    }

    private TJxlTransferLog createNewJxlRecord(Map<String, Object> params){
        TJxlTransferLog record = new TJxlTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"interfaceId"));
        record.setcTraceid(getString(params,"traceId"));
        record.setcSystemId(getString(params,"systemId"));
        record.setcStatus(getString(params,"status"));
        record.setcMsg(getString(params,"message"));
        record.setcChannel(getString(params,"appId"));
        record.setcParams(getString(params,"params"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(getString(params,"systemIP"));
        return record;
    }

    private TTdTransferLog createNewTdRecord(Map<String, Object> params){
        TTdTransferLog record = new TTdTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"interfaceId"));
        record.setcTraceid(getString(params,"traceId"));
        record.setcSystemId(getString(params,"systemId"));
        record.setcStatus(getString(params,"status"));
        record.setcMsg(getString(params,"message"));
        record.setcChannel(getString(params,"appId"));
        record.setcParams(getString(params,"params"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(getString(params,"systemIP"));
        return record;
    }

    private TBrTransferLog createNewBrRecord(Map<String, Object> params){
        TBrTransferLog record = new TBrTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"interfaceId"));
        record.setcTraceid(getString(params,"traceId"));
        record.setcSystemId(getString(params,"systemId"));
        record.setcStatus(getString(params,"status"));
        record.setcMsg(getString(params,"message"));
        record.setcChannel(getString(params,"appId"));
        record.setcParams(getString(params,"params"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(getString(params,"systemIP"));
        return record;
    }

    private TRsllTransferLog createNewRsllRecord(Map<String, Object> params){
        TRsllTransferLog record = new TRsllTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"interfaceId"));
        record.setcTraceid(getString(params,"traceId"));
        record.setcSystemId(getString(params,"systemId"));
        record.setcStatus(getString(params,"status"));
        record.setcMsg(getString(params,"message"));
        record.setcChannel(getString(params,"appId"));
        record.setcParams(getString(params,"params"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(getString(params,"systemIP"));
        return record;
    }

    private TJieanTransferLog createNewJieanRecord(Map<String, Object> params){
        TJieanTransferLog record = new TJieanTransferLog();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcInterfaceKey(getString(params,"interfaceId"));
        record.setcTraceid(getString(params,"traceId"));
        record.setcSystemId(getString(params,"systemId"));
        record.setcStatus(getString(params,"status"));
        record.setcMsg(getString(params,"message"));
        record.setcChannel(getString(params,"appId"));
        record.setcParams(getString(params,"params"));
        record.setcProLine(getString(params,"systemId"));
        record.setDtCreateTime(new Date());
        record.setnDel(0);
        record.setcIp(getString(params,"systemIP"));
        return record;
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
}
