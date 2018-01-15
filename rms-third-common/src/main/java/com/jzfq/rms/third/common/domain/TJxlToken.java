package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TJxlToken {
    private String cId;

    private String cIdNumber;

    private String cType;

    private String cToken;

    private Date dtCreateTime;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcIdNumber() {
        return cIdNumber;
    }

    public void setcIdNumber(String cIdNumber) {
        this.cIdNumber = cIdNumber == null ? null : cIdNumber.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String getcToken() {
        return cToken;
    }

    public void setcToken(String cToken) {
        this.cToken = cToken == null ? null : cToken.trim();
    }

    public Date getDtCreateTime() {
        return dtCreateTime;
    }

    public void setDtCreateTime(Date dtCreateTime) {
        this.dtCreateTime = dtCreateTime;
    }
}