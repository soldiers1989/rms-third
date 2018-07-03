package com.jzfq.rms.third.common.domain;

import java.util.Date;
import java.util.List;

public class TThirdTdPolicySetData {
    private String cId;

    private String cSeqId;

    private String cPolicyUuid;

    private String cPolicyDecision;

    private String cPolicyMode;

    private String cPolicyScore;

    private String cPolicyName;

    private String cRiskType;

    private Date cCreattime;


    private List<TThirdTdHitRulesData> ruleDatas;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcSeqId() {
        return cSeqId;
    }

    public void setcSeqId(String cSeqId) {
        this.cSeqId = cSeqId == null ? null : cSeqId.trim();
    }

    public String getcPolicyUuid() {
        return cPolicyUuid;
    }

    public void setcPolicyUuid(String cPolicyUuid) {
        this.cPolicyUuid = cPolicyUuid == null ? null : cPolicyUuid.trim();
    }

    public String getcPolicyDecision() {
        return cPolicyDecision;
    }

    public void setcPolicyDecision(String cPolicyDecision) {
        this.cPolicyDecision = cPolicyDecision == null ? null : cPolicyDecision.trim();
    }

    public String getcPolicyMode() {
        return cPolicyMode;
    }

    public void setcPolicyMode(String cPolicyMode) {
        this.cPolicyMode = cPolicyMode == null ? null : cPolicyMode.trim();
    }

    public String getcPolicyScore() {
        return cPolicyScore;
    }

    public void setcPolicyScore(String cPolicyScore) {
        this.cPolicyScore = cPolicyScore == null ? null : cPolicyScore.trim();
    }

    public String getcPolicyName() {
        return cPolicyName;
    }

    public void setcPolicyName(String cPolicyName) {
        this.cPolicyName = cPolicyName == null ? null : cPolicyName.trim();
    }

    public String getcRiskType() {
        return cRiskType;
    }

    public void setcRiskType(String cRiskType) {
        this.cRiskType = cRiskType == null ? null : cRiskType.trim();
    }

    public Date getcCreattime() {
        return cCreattime;
    }

    public void setcCreattime(Date cCreattime) {
        this.cCreattime = cCreattime;
    }

    public List<TThirdTdHitRulesData> getRuleDatas() {
        return ruleDatas;
    }

    public void setRuleDatas(List<TThirdTdHitRulesData> ruleDatas) {
        this.ruleDatas = ruleDatas;
    }
}