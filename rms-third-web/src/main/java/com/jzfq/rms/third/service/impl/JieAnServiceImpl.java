package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJieAnService;
import com.jzfq.rms.third.service.ISendMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 捷安
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/18 16:48.
 **/
@Service
public class JieAnServiceImpl implements IJieAnService {

    private static final Logger log = LoggerFactory.getLogger("JieAnService");
    @Value("${jiean.request.mac.key}")
    private String MAC_KEY;
    @Value("${jiean.request.api.url}")
    private String apiUrl;
    @Value("${jiean.request.custId}")
    private String custId;

    @Autowired
    ISendMessageService sendMessegeService;


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
        commonParams.put("taskId",taskId);
        commonParams.put("custId",custId);
        commonParams.put("MAC_KEY",MAC_KEY);
        commonParams.put("url",apiUrl);
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
}

