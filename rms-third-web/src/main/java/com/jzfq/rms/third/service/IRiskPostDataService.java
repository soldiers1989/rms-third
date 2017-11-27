package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPostTask;
import com.jzfq.rms.mongo.BrPostData;

import java.util.List;

/**
 *
 * @description 拉取数据服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IRiskPostDataService {

    void saveData(Object data);
    /**
     * 根据任务id 和 接口类型，查询请求的信用数据
     *
     * @param taskId
     * @param type
     * @return
     */
    Object queryData(long taskId, int type);

    /**
     * 根据任务id  查询同盾命中规则
     *
     * @param taskId
     * @return
     */
    Object queryTdRuleData(long taskId);

    /**
     *
     * @param name
     * @param certCardNo
     * @param mobile
     * @param type
     * @return
     */
    JSONObject getBairongData(String name,String certCardNo,String mobile,String type);
}
