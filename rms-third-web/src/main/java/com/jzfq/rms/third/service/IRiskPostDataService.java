package com.jzfq.rms.third.service;

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

    void saveDataAndUpdateTask(BrPostData data, long taskId, byte taskState);

    void saveData(BrPostData data);

    void updateTask(long taskId, byte taskState);

    /**
     * 根据任务id 和 接口类型，查询请求的信用数据
     *
     * @param taskId
     * @param type
     * @return
     */
    public Object queryData(long taskId, int type);

    /**
     * 根据任务id 查询 星辰学籍信息
     * @param taskId
     * @return
     */
    public Object queryXingChenSchooldata(long taskId);

    /**
     * 根据任务id 查询 手机三要素
     * @param taskId
     * @param type
     * @return
     */
    public Object queryPhoneThreeData(long taskId, int type);
    /**
     * 根据任务id 检查 手机三要素
     * @param obj
     * @return
     */
    public boolean checkPhoneThreeData(Object obj);
    /**
     * 根据任务id 检查 手机三要素
     * @param taskId
     * @param type
     * @return
     */
    public boolean checkPhoneThreeData(long taskId, int type);
    /**
     * 根据任务id 查询 手机在网时长
     * @param taskId
     * @param type
     * @return
     */
    public Object queryPhonePeriodData(long taskId, int type);

    /**
     * 根据任务id 查询 手机在网状态
     * @param taskId
     * @param type
     * @return
     */
    public Object queryPhoneStatusData(long taskId, int type);
    /**
     * 根据任务id 检查 手机在网状态
     * @param obj
     * @return
     */
    public boolean checkPhoneStatusData(Object obj);



    /**
     * 根据任务id  查询同盾命中规则
     *
     * @param taskId
     * @return
     */
    Object queryTdRuleData(long taskId);
}
