package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TThirdBrSwiftOrderData {
    private String cId;

    private String cOrderNo;

    private String cTraceId;

    private String cSwiftNumber;

    private String cName;

    private String cPhone;

    private String cIdCard;

    private Date cCreattime;

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

    public String getcSwiftNumber() {
        return cSwiftNumber;
    }

    public void setcSwiftNumber(String cSwiftNumber) {
        this.cSwiftNumber = cSwiftNumber == null ? null : cSwiftNumber.trim();
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

    public Date getcCreattime() {
        return cCreattime;
    }

    public void setcCreattime(Date cCreattime) {
        this.cCreattime = cCreattime;
    }
}