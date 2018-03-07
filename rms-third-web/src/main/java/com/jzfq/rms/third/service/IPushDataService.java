package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.dto.ResponseResult;

/**
 * @author 大连桔子分期科技有限公司
 * @description 推送同盾/百融数据服务接口实现
 */
public interface IPushDataService {


    /**
     * 将参数推送到push内部系统
     *
     * @param traceId
     * @param score
     * @param mobile
     * @param orderNo
     * @return
     */
    void pushData(String traceId, String score, String mobile, String orderNo);


}
