package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TThirdTdMainData {
    private String cId;

    private String cSeqId;

    private String cSuccess;

    private String cReasonCode;

    private String cSpendTime;

    private String cPolicySetName;

    private String cFinalScore;

    private String cFinalDecision;

    private Date cCreattime;

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

    public String getcSuccess() {
        return cSuccess;
    }

    public void setcSuccess(String cSuccess) {
        this.cSuccess = cSuccess == null ? null : cSuccess.trim();
    }

    public String getcReasonCode() {
        return cReasonCode;
    }

    public void setcReasonCode(String cReasonCode) {
        this.cReasonCode = cReasonCode == null ? null : cReasonCode.trim();
    }

    public String getcSpendTime() {
        return cSpendTime;
    }

    public void setcSpendTime(String cSpendTime) {
        this.cSpendTime = cSpendTime == null ? null : cSpendTime.trim();
    }

    public String getcPolicySetName() {
        return cPolicySetName;
    }

    public void setcPolicySetName(String cPolicySetName) {
        this.cPolicySetName = cPolicySetName == null ? null : cPolicySetName.trim();
    }

    public String getcFinalScore() {
        return cFinalScore;
    }

    public void setcFinalScore(String cFinalScore) {
        this.cFinalScore = cFinalScore == null ? null : cFinalScore.trim();
    }

    public String getcFinalDecision() {
        return cFinalDecision;
    }

    public void setcFinalDecision(String cFinalDecision) {
        this.cFinalDecision = cFinalDecision == null ? null : cFinalDecision.trim();
    }

    public Date getcCreattime() {
        return cCreattime;
    }

    public void setcCreattime(Date cCreattime) {
        this.cCreattime = cCreattime;
    }
}