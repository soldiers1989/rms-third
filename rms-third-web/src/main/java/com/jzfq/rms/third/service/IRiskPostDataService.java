package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.domain.RiskPostTask;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.mongo.BairongData;

import java.util.List;
import java.util.Map;

/**
 *
 * @description 拉取数据服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IRiskPostDataService {

    void saveData(Object data);

    void saveRmsData(String orderNo, String result,String customerType);

    void saveRmsThirdData(RiskPersonalInfo info, String customerType, String result);
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

    /**
     * 根据姓名和身份证号获取百融数据
     * @param name
     * @param certCardNo
     * @return
     */
    BairongData getBairongData(String name, String certCardNo, String mobile);
}
