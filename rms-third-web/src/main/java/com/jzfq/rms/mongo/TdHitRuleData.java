package com.jzfq.rms.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 同盾命中规则数据
 * @author 大连桔子分期科技有限公司
 * @date 2016/12/2. 下午3:58:45
 */
@Document(collection = "td_hit_rule_data")
public class TdHitRuleData {
    @Id
    @JsonIgnore
    protected ObjectId id;

    //进件编号 也就是商城推送过来的
    @Indexed
    private String taskId;

    // 此接口描述
    private String desc;

    // type  区分 同盾
    @SuppressWarnings("unused")
    private String type;

    //最终的风险系数
    private int final_score;

    private String seq_id;

    //命中规则数据
    private String hit_rules;

    //设备指纹信息
    private String device_info;

    //触发的策略集名称
    private String policy_set_name;

    //策略集的内容
    private String policy_set;

    //接口返回的设备ID
    private String data;

    private Date createTime;

    public TdHitRuleData(){

    }

    public TdHitRuleData(String taskId, String desc, Date createTime) {
        this.taskId = taskId;
        this.type = "td_rule";
        this.desc = desc;
        this.createTime = createTime;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getFinal_score() {
        return final_score;
    }

    public void setFinal_score(int final_score) {
        this.final_score = final_score;
    }

    public String getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(String seq_id) {
        this.seq_id = seq_id;
    }

    public String getHit_rules() {
        return hit_rules;
    }

    public void setHit_rules(String hit_rules) {
        this.hit_rules = hit_rules;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getPolicy_set_name() {
        return policy_set_name;
    }

    public void setPolicy_set_name(String policy_set_name) {
        this.policy_set_name = policy_set_name;
    }

    public String getPolicy_set() {
        return policy_set;
    }

    public void setPolicy_set(String policy_set) {
        this.policy_set = policy_set;
    }
}
