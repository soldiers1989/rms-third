package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TJieanPhoneData {
    private String cId;

    private String cJieanId;

    private String cType;

    private String cName;

    private String cPhone;

    private String cCertcardNo;

    private String cStatus;

    private String cResult;

    private String cValue;

    private Date dtUpdateTime;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcJieanId() {
        return cJieanId;
    }

    public void setcJieanId(String cJieanId) {
        this.cJieanId = cJieanId == null ? null : cJieanId.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
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

    public String getcCertcardNo() {
        return cCertcardNo;
    }

    public void setcCertcardNo(String cCertcardNo) {
        this.cCertcardNo = cCertcardNo == null ? null : cCertcardNo.trim();
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus == null ? null : cStatus.trim();
    }

    public String getcResult() {
        return cResult;
    }

    public void setcResult(String cResult) {
        this.cResult = cResult == null ? null : cResult.trim();
    }

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue == null ? null : cValue.trim();
    }

    public Date getDtUpdateTime() {
        return dtUpdateTime;
    }

    public void setDtUpdateTime(Date dtUpdateTime) {
        this.dtUpdateTime = dtUpdateTime;
    }
}