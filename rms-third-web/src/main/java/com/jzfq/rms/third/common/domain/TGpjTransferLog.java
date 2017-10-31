package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TGpjTransferLog {
    private String cId;

    private String cInterfaceKey;

    private String cTraceid;

    private String cSystemId;

    private String cProLine;

    private String cChannel;

    private String cParams;

    private String cStatus;

    private String cMsg;

    private Integer nDel;

    private String cIp;

    private Date dtCreateTime;

    private String cMsgDetail;

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

    public String getcTraceid() {
        return cTraceid;
    }

    public void setcTraceid(String cTraceid) {
        this.cTraceid = cTraceid == null ? null : cTraceid.trim();
    }

    public String getcSystemId() {
        return cSystemId;
    }

    public void setcSystemId(String cSystemId) {
        this.cSystemId = cSystemId == null ? null : cSystemId.trim();
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

    public String getcMsg() {
        return cMsg;
    }

    public void setcMsg(String cMsg) {
        this.cMsg = cMsg == null ? null : cMsg.trim();
    }

    public Integer getnDel() {
        return nDel;
    }

    public void setnDel(Integer nDel) {
        this.nDel = nDel;
    }

    public String getcIp() {
        return cIp;
    }

    public void setcIp(String cIp) {
        this.cIp = cIp == null ? null : cIp.trim();
    }

    public Date getDtCreateTime() {
        return dtCreateTime;
    }

    public void setDtCreateTime(Date dtCreateTime) {
        this.dtCreateTime = dtCreateTime;
    }

    public String getcMsgDetail() {
        return cMsgDetail;
    }

    public void setcMsgDetail(String cMsgDetail) {
        this.cMsgDetail = cMsgDetail == null ? null : cMsgDetail.trim();
    }
}