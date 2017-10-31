package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TSysConfig {
    private String cId;

    private String cKey;

    private String cDescription;

    private String cValue;

    private String cLevel;

    private String cOwner;

    private String cDel;

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

    public String getcKey() {
        return cKey;
    }

    public void setcKey(String cKey) {
        this.cKey = cKey == null ? null : cKey.trim();
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription == null ? null : cDescription.trim();
    }

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue == null ? null : cValue.trim();
    }

    public String getcLevel() {
        return cLevel;
    }

    public void setcLevel(String cLevel) {
        this.cLevel = cLevel == null ? null : cLevel.trim();
    }

    public String getcOwner() {
        return cOwner;
    }

    public void setcOwner(String cOwner) {
        this.cOwner = cOwner == null ? null : cOwner.trim();
    }

    public String getcDel() {
        return cDel;
    }

    public void setcDel(String cDel) {
        this.cDel = cDel == null ? null : cDel.trim();
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