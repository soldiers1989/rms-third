package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TBrTransferLog {
    private String cId;

    private String cInterfaceKey;

    private String cProLine;

    private String cChannel;

    private String cParams;

    private String cStatus;

    private Integer nDel;

    private Date dtCreateTime;

    private String cMsg;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcInterfaceKey() {
        return cInterfaceKey;
    }

    public void setcInterfaceKey(String cInterfaceKey) {
        this.cInterfaceKey = cInterfaceKey == null ? null : cInterfaceKey.trim();
    }

    public String getcProLine() {
        return cProLine;
    }

    public void setcProLine(String cProLine) {
        this.cProLine = cProLine == null ? null : cProLine.trim();
    }

    public String getcChannel() {
        return cChannel;
    }

    public void setcChannel(String cChannel) {
        this.cChannel = cChannel == null ? null : cChannel.trim();
    }

    public String getcParams() {
        return cParams;
    }

    public void setcParams(String cParams) {
        this.cParams = cParams == null ? null : cParams.trim();
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus == null ? null : cStatus.trim();
    }

    public Integer getnDel() {
        return nDel;
    }

    public void setnDel(Integer nDel) {
        this.nDel = nDel;
    }

    public Date getDtCreateTime() {
        return dtCreateTime;
    }

    public void setDtCreateTime(Date dtCreateTime) {
        this.dtCreateTime = dtCreateTime;
    }

    public String getcMsg() {
        return cMsg;
    }

    public void setcMsg(String cMsg) {
        this.cMsg = cMsg == null ? null : cMsg.trim();
    }
}