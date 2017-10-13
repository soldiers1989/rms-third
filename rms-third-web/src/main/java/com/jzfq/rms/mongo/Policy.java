package com.jzfq.rms.mongo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 政策
 * @author 大连桔子分期科技有限公司
 * @date 2016/12/1. 下午3:58:45
 */
public class Policy implements Serializable {

    private static final long serialVersionUID = 2971731835604653516L;
    private String policy_uuid;                            // 策略uuid
    private String policy_decision;                        // 策略结果
    private String policy_mode;                            // 策略模式
    private String policy_name;                            // 策略名称
    private int policy_score;                              // 策略分数
    private String risk_type;                              // 风险类型

    private List<HitRule> hit_rules = new ArrayList<>();   // 命中规则列表

    //    ...省略若干Getter与Setter

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPolicy_uuid() {
        return policy_uuid;
    }

    public void setPolicy_uuid(String policy_uuid) {
        this.policy_uuid = policy_uuid;
    }

    public String getPolicy_decision() {
        return policy_decision;
    }

    public void setPolicy_decision(String policy_decision) {
        this.policy_decision = policy_decision;
    }

    public String getPolicy_mode() {
        return policy_mode;
    }

    public void setPolicy_mode(String policy_mode) {
        this.policy_mode = policy_mode;
    }

    public String getPolicy_name() {
        return policy_name;
    }

    public void setPolicy_name(String policy_name) {
        this.policy_name = policy_name;
    }

    public int getPolicy_score() {
        return policy_score;
    }

    public void setPolicy_score(int policy_score) {
        this.policy_score = policy_score;
    }

    public String getRisk_type() {
        return risk_type;
    }

    public void setRisk_type(String risk_type) {
        this.risk_type = risk_type;
    }

    public List<HitRule> getHit_rules() {
        return hit_rules;
    }

    public void setHit_rules(List<HitRule> hit_rules) {
        this.hit_rules = hit_rules;
    }

    @Override
    public String toString() {
        return "policy_name:" + this.policy_name + "\npolicy_mode:" + this.policy_mode + "\nhit_rules:"
                + this.hit_rules;
    }
}