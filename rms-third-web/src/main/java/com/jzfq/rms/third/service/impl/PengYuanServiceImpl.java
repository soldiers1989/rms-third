package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.TPyCarCheck;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.mongo.PengYuan;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.persistence.dao.IPengYuanDao;
import com.jzfq.rms.third.service.IPengYuanService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.ISendMessageService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @description 鹏元服务接口实现
 * @author 大连桔子分期科技有限公司
 *
 */
@Service
public class PengYuanServiceImpl implements IPengYuanService {

    private static final Logger log = LoggerFactory.getLogger("pengYuanLog");

    @Value("${pengyuan.data.username}")
    private String userName;
    @Value("${pengyuan.data.password}")
    private String passWord;

    @Autowired
    private IPengYuanDao pengYuanDao;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    ISendMessageService sendMessegeService;

    @Autowired
    IConfigDao configCacheDao;

    private void saveData(PengYuan pengYuan) {
        log.info("鹏元数据开始入库......");
        try {
            mongoTemplate.insert(pengYuan);
        } catch (Exception e) {
            log.error("入库失败......" , e);
        }
        log.info("鹏元数据入库结束......");
    }




    @Override
    public ResponseResult queryPyCarDatas(Map<String,Object> carInfo, Map<String,Object> commonParams) throws Exception{
        return getCarDataByRpc(carInfo,commonParams);
    }

    /**
     * 远程调用鹏元接口
     * @param carInfo
     * @param commonParams
     * @return
     * @throws Exception
     */
    private ResponseResult getCarDataByRpc(Map<String,Object> carInfo, Map<String,Object> commonParams)throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String pyUrl = pengYuanDao.getPyUrl();
        if(StringUtils.isBlank(pyUrl)){
            return new ResponseResult(traceId, ReturnCode.ERROR_SYSTEM_CONFIG_NULL.code(),
                    "获取鹏元接口系统配置地址为空",null);
        }
        commonParams.put("url",pyUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_PY.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_PY01.getCode());
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        commonParams.put("userName", userName);
        commonParams.put("passWord", passWord);

        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.PY01.getCode(),commonParams,carInfo);
        if(response==null){
            log.info("traceId={} 鹏元车辆 响应信息为空", TraceIDThreadLocal.getTraceID());
            throw new BusinessException(ReturnCode.ERROR_RESPONSE_NULL.code(),"鹏元车辆信息接口失败 返回为空",true);
        }
        if(response.getCode()!= ReturnCode.REQUEST_SUCCESS.code()){
            log.info("traceId={} 鹏元车辆 响应信息为空", TraceIDThreadLocal.getTraceID());
            return response;
        }
        return response;
    }
    /**
     * 获取 鹏元车辆核查数据
     *
     * @param name
     * @param documentNo
     * @param lisence
     * @param carType
     * @return
     */
    @Override
    public List<TPyCarCheck> getPengYuanData(String name, String documentNo, String lisence, String carType) {
        Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_PY01.getCode());
        return pengYuanDao.getPengYuanData(name, documentNo, lisence, carType,outTime);
    }

    /**
     * 保存 车辆审核信息
     *
     * @param result
     * @param value
     * @param carInfo
     * @param status
     */
    @Override
    public void saveCarCheckInfo(String reqId, String result, String value, Map<String, Object> carInfo, Integer status) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try{
            ThreadProvider.getThreadPool().execute(()->{
                TPyCarCheck pyCarCheck = new TPyCarCheck();
                pyCarCheck.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
                pyCarCheck.setcPengyuanId(reqId);
                pyCarCheck.setcName(StringUtil.getStringOfObject(carInfo.get("name")));
                pyCarCheck.setcCertcardNo(StringUtil.getStringOfObject(carInfo.get("certCardNo")));
                pyCarCheck.setcLicenseNo(StringUtil.getStringOfObject(carInfo.get("plateNo")));
                pyCarCheck.setcCarType(StringUtil.getStringOfObject(carInfo.get("type")));
                pyCarCheck.setcResult(result);
                pyCarCheck.setcValue(value);
                pyCarCheck.setcStatus(status.toString());
                pyCarCheck.setDtUpdateTime(new Date());
                pengYuanDao.save(pyCarCheck);
            });
        }catch (Exception e){
            log.error("traceId={} 保存rms-third鹏元数据异常",traceId,e);
        }
    }

    @Autowired
    IRmsService rmsService;
    /**
     * 保存rms旧系统鹏元数据
     *
     * @param orderNo
     * @param result
     */
    @Override
    public void saveRmsDatas(String orderNo, String result, Map<String,Object> carInfo,String value) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try {
            ThreadProvider.getThreadPool().execute(()->{
                String taskIdStr = rmsService.queryByOrderNo(traceId, orderNo);
                Long taskId = null;
                if(StringUtils.isNotBlank(taskIdStr)){
                    taskId = Long.parseLong(taskIdStr);
                }
                if(taskId == null){
                    return;
                }
                JSONObject json = new JSONObject();
                if(StringUtils.isNotBlank(result)){
                    json = JSONObject.parseObject(result);
                }
                PengYuan py = new PengYuan(taskId,(String) carInfo.get("certCardNo"), "",json ,value);
                saveData(py);
            });
        }catch (Exception e){
            log.error("orderNo={} 保存数据异常",orderNo,e);
        }
    }

}

