package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TSysCode {
    private String cId;

    private String cParentId;

    private String cKey;

    private String cValue;

    private String cDescription;

    private Integer nOrder;

    private String cStatus;

    private Date dtCreateTime;

    private String cCreateUser;

    private Date dtUpdateTime;

    private String cOptUser;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcParentId() {
        return cParentId;
    }

    public void setcParentId(String cParentId) {
        this.cParentId = cParentId == null ? null : cParentId.trim();
    }

    public String getcKey() {
        return cKey;
    }

    public void setcKey(String cKey) {
        this.cKey = cKey == null ? null : cKey.trim();
    }

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue == null ? null : cValue.trim();
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription == null ? null : cDescription.trim();
    }

    public Integer getnOrder() {
        return nOrder;
    }

    public void setnOrder(Integer nOrder) {
        this.nOrder = nOrder;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus == null ? null : cStatus.trim();
    }

    public Date getDtCreateTime() {
        return dtCreateTime;
    }

    public void setDtCreateTime(Date dtCreateTime) {
        this.dtCreateTime = dtCreateTime;
    }

    public String getcCreateUser() {
        return cCreateUser;
    }

    public void setcCreateUser(String cCreateUser) {
        this.cCreateUser = cCreateUser == null ? null : cCreateUser.trim();
    }

    public Date getDtUpdateTime() {
        return dtUpdateTime;
    }

    public void setDtUpdateTime(Date dtUpdateTime) {
        this.dtUpdateTime = dtUpdateTime;
    }

    public String getcOptUser() {
        return cOptUser;
    }

    public void setcOptUser(String cOptUser) {
        this.cOptUser = cOptUser == null ? null : cOptUser.trim();
    }
}