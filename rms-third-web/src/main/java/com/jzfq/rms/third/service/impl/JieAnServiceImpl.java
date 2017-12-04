package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.domain.TJieanPhoneData;
import com.jzfq.rms.third.common.domain.example.TJieanPhoneDataExample;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.persistence.mapper.TJieanPhoneDataMapper;
import com.jzfq.rms.third.service.IJieAnService;
import com.jzfq.rms.third.service.ISendMessageService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 捷安
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/18 16:48.
 **/
@Service
public class JieAnServiceImpl implements IJieAnService {

    private static final Logger log = LoggerFactory.getLogger(JieAnServiceImpl.class);
    @Value("${jiean.request.mac.key}")
    private String MAC_KEY;
    @Value("${jiean.request.api.url}")
    private String apiUrl;
    @Value("${jiean.request.custId}")
    private String custId;

    @Autowired
    ISendMessageService sendMessegeService;

    @Autowired
    TJieanPhoneDataMapper jieanPhoneDataMapper;

    @Autowired
    IConfigDao configCacheDao;

    /**
     * 在网时长
     *
     * @param taskId
     * @param bizData
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult getPhoneNetworkLength(String taskId, Map<String, Object> bizData) throws Exception {
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("taskId",taskId);
        commonParams.put("custId",custId);
        commonParams.put("MAC_KEY",MAC_KEY);
        commonParams.put("url",apiUrl);
        commonParams.put("frontId",bizData.get("frontId"));
        commonParams.put("targetId", SystemIdEnum.THIRD_JIEAN.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JIEAN01.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JIEAN01.getCode(),commonParams,bizData);
    }

    /**
     * 运营商实名
     * @param taskId
     * @param bizData
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult getMobilecheck3item(String taskId, Map<String, Object> bizData) throws Exception {
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("custId",custId);
        commonParams.put("MAC_KEY",MAC_KEY);
        commonParams.put("url",apiUrl);
        commonParams.put("frontId",bizData.get("frontId"));
        commonParams.put("targetId", SystemIdEnum.THIRD_JIEAN.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JIEAN03.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JIEAN03.getCode(),commonParams,bizData);
    }

    /**
     * 在网状态
     *
     * @param taskId
     * @param bizData
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult getPhonestatus(String taskId, Map<String, Object> bizData) throws Exception {
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("taskId",taskId);
        commonParams.put("frontId",bizData.get("frontId"));
        commonParams.put("custId",custId);
        commonParams.put("MAC_KEY",MAC_KEY);
        commonParams.put("url",apiUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_JIEAN.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JIEAN02.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JIEAN02.getCode(),commonParams,bizData);
    }

    /**
     * @param type
     * @param code
     * @param result
     * @param value
     * @param bizParams
     */
    @Override
    public void savePhonesData(String type, String code, String result, String value, Map<String, Object> bizParams) {
        TJieanPhoneData record = new TJieanPhoneData();
        record.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setcType(type);
        record.setcJieanId(StringUtil.getStringOfObject(bizParams.get("orderId")));
        record.setcCertcardNo(StringUtil.getStringOfObject(bizParams.get("idNumber")));
        record.setcName(StringUtil.getStringOfObject(bizParams.get("name")));
        record.setcPhone(StringUtil.getStringOfObject(bizParams.get("phone")));
        record.setcStatus(code);
        record.setcResult(result);
        record.setcValue(value);
        record.setDtUpdateTime(new Date());
        jieanPhoneDataMapper.insert(record);
    }

    /**
     * 获取数据
     *
     * @param name
     * @param idNumber
     * @param phone
     * @param type
     * @return
     */
    @Override
    public List<TJieanPhoneData> getJieanData(String name, String idNumber, String phone, String type) {
        TJieanPhoneDataExample example = new TJieanPhoneDataExample();
        TJieanPhoneDataExample.Criteria criteria =example.createCriteria();
        criteria.andCTypeEqualTo(type);
        if(StringUtils.isNotBlank(name)){
            criteria.andCNameEqualTo(name);
        }
        if(StringUtils.isNotBlank(idNumber)){
            criteria.andCCertcardNoEqualTo(idNumber);
        }
        if(StringUtils.isNotBlank(phone)){
            criteria.andCPhoneEqualTo(phone);
        }
        Integer outTime = configCacheDao.getOutTimeUnit(type);
        Date minTime = getMinTime(outTime);
        criteria.andDtUpdateTimeGreaterThanOrEqualTo(minTime);
        example.setOrderByClause("dt_update_time desc");
        return jieanPhoneDataMapper.selectByExample(example);
    }
    private Date getMinTime(Integer time){
        Calendar calendar = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
        calendar.add(Calendar.DAY_OF_MONTH, -1*time);//取当前日期的前一天.
        return calendar.getTime();
    }
}

