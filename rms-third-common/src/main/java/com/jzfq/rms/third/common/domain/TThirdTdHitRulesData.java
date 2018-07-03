package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TThirdTdHitRulesData {
    private String cId;

    private String cPolicyUuid;

    private String cDecision;

    private String cScore;

    private String cName;

    private String cUuid;

    private String cParentuuid;

    private String cRuleId;

    private Date cCreattime;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcPolicyUuid() {
        return cPolicyUuid;
    }

    public void setcPolicyUuid(String cPolicyUuid) {
        this.cPolicyUuid = cPolicyUuid == null ? null : cPolicyUuid.trim();
    }

    public String getcDecision() {
        return cDecision;
    }

    public void setcDecision(String cDecision) {
        this.cDecision = cDecision == null ? null : cDecision.trim();
    }

    public String getcScore() {
        return cScore;
    }

    public void setcScore(String cScore) {
        this.cScore = cScore == null ? null : cScore.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcUuid() {
        return cUuid;
    }

    public void setcUuid(String cUuid) {
        this.cUuid = cUuid == null ? null : cUuid.trim();
    }

    public String getcParentuuid() {
        return cParentuuid;
    }

    public void setcParentuuid(String cParentuuid) {
        this.cParentuuid = cParentuuid == null ? null : cParentuuid.trim();
    }

    public String getcRuleId() {
        return cRuleId;
    }

    public void setcRuleId(String cRuleId) {
        this.cRuleId = cRuleId == null ? null : cRuleId.trim();
    }

    public Date getcCreattime() {
        return cCreattime;
    }

    public void setcCreattime(Date cCreattime) {
        this.cCreattime = cCreattime;
    }
}