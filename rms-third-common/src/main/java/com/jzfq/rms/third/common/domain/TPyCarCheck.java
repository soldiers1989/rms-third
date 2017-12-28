package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TPyCarCheck {
    private String cId;

    private String cPengyuanId;

    private String cLicenseNo;

    private String cName;

    private String cCertcardNo;

    private String cCarType;

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

    public String getcPengyuanId() {
        return cPengyuanId;
    }

    public void setcPengyuanId(String cPengyuanId) {
        this.cPengyuanId = cPengyuanId == null ? null : cPengyuanId.trim();
    }

    public String getcLicenseNo() {
        return cLicenseNo;
    }

    public void setcLicenseNo(String cLicenseNo) {
        this.cLicenseNo = cLicenseNo == null ? null : cLicenseNo.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcCertcardNo() {
        return cCertcardNo;
    }

    public void setcCertcardNo(String cCertcardNo) {
        this.cCertcardNo = cCertcardNo == null ? null : cCertcardNo.trim();
    }

    public String getcCarType() {
        return cCarType;
    }

    public void setcCarType(String cCarType) {
        this.cCarType = cCarType == null ? null : cCarType.trim();
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