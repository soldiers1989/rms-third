package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TThirdJiguangData {
    private String cId;

    private String cOrderNo;

    private String cTraceId;

    private String cName;

    private String cPhone;

    private String cIdCard;

    private String cCode;

    private String cMessage;

    private String cOverduescore;

    private String cContractscore;

    private String cRiskscore;

    private String cTotalscore;

    private Date cCreateTime;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcOrderNo() {
        return cOrderNo;
    }

    public void setcOrderNo(String cOrderNo) {
        this.cOrderNo = cOrderNo == null ? null : cOrderNo.trim();
    }

    public String getcTraceId() {
        return cTraceId;
    }

    public void setcTraceId(String cTraceId) {
        this.cTraceId = cTraceId == null ? null : cTraceId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public String getcIdCard() {
        return cIdCard;
    }

    public void setcIdCard(String cIdCard) {
        this.cIdCard = cIdCard == null ? null : cIdCard.trim();
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public String getcMessage() {
        return cMessage;
    }

    public void setcMessage(String cMessage) {
        this.cMessage = cMessage == null ? null : cMessage.trim();
    }

    public String getcOverduescore() {
        return cOverduescore;
    }

    public void setcOverduescore(String cOverduescore) {
        this.cOverduescore = cOverduescore == null ? null : cOverduescore.trim();
    }

    public String getcContractscore() {
        return cContractscore;
    }

    public void setcContractscore(String cContractscore) {
        this.cContractscore = cContractscore == null ? null : cContractscore.trim();
    }

    public String getcRiskscore() {
        return cRiskscore;
    }

    public void setcRiskscore(String cRiskscore) {
        this.cRiskscore = cRiskscore == null ? null : cRiskscore.trim();
    }

    public String getcTotalscore() {
        return cTotalscore;
    }

    public void setcTotalscore(String cTotalscore) {
        this.cTotalscore = cTotalscore == null ? null : cTotalscore.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }
}