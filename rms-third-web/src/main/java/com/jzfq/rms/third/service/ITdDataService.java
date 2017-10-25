package com.jzfq.rms.third.service;

import com.jzfq.rms.domain.RiskPostTask;
import com.jzfq.rms.mongo.TdData;
import com.jzfq.rms.mongo.TdHitRuleData;

import java.io.IOException;
import java.util.Map;

/**
 *
 * @description 同盾数据服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface ITdDataService {

    /**
     * 抓取同盾数据
     * @param riskPostInfo
     * @throws IOException
     */
    Object getTdData(Map<String, Object> riskPostInfo) throws Exception;

    /**
     * 抓取同盾分
     * @param riskPostInfo
     * @return
     */
    public TdHitRuleData getTdStoreData(Map<String, Object> riskPostInfo);

    /**
     * 同盾规则
     * @param orderNo
     * @param sequenceId
     * @param traceId
     * @return
     */
     public TdData getTdRuleData(String orderNo, String sequenceId, String traceId);
}
