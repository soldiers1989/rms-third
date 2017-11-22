package com.jzfq.rms.third.service;

import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.mongo.TdData;
import com.jzfq.rms.mongo.TdHitRuleData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;

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
     * @param params
     * @return
     * @throws Exception
     */
    ResponseResult queryTdDatas(Map<String,Object> params) throws Exception;

    /**
     * 保存同盾规则按照订单号
     * @param taskId
     * @param orderNo
     */
     void saveResult(String taskId, String orderNo, FraudApiResponse apiResp);
}
