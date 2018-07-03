package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TThirdJiaoData {
    private String cId;

    private String cOrderNo;

    private String cTraceId;

    private String cName;

    private String cPhone;

    private String cIdCard;

    private String cInnerType;

    private String cCode;

    private String cProvince;

    private String cCity;

    private String cIsp;

    private String cRslCode;

    private String cRslDesc;

    private String cMsg;

    private Date cCreateTime;

    private String errorCode;//错误码

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

    public String getcInnerType() {
        return cInnerType;
    }

    public void setcInnerType(String cInnerType) {
        this.cInnerType = cInnerType == null ? null : cInnerType.trim();
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince == null ? null : cProvince.trim();
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity == null ? null : cCity.trim();
    }

    public String getcIsp() {
        return cIsp;
    }

    public void setcIsp(String cIsp) {
        this.cIsp = cIsp == null ? null : cIsp.trim();
    }

    public String getcRslCode() {
        return cRslCode;
    }

    public void setcRslCode(String cRslCode) {
        this.cRslCode = cRslCode == null ? null : cRslCode.trim();
    }

    public String getcRslDesc() {
        return cRslDesc;
    }

    public void setcRslDesc(String cRslDesc) {
        this.cRslDesc = cRslDesc == null ? null : cRslDesc.trim();
    }

    public String getcMsg() {
        return cMsg;
    }

    public void setcMsg(String cMsg) {
        this.cMsg = cMsg == null ? null : cMsg.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}