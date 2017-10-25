package com.jzfq.rms.third.common.pojo;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 18:41.
 **/
public class Monitor {

    private String frontID;
    private String traceID;
    private Integer productConfigID;
    private Integer sourceID;
    private Integer targetID;
    private Integer sendType;
    private String sendURL;
    private String creator;
    private String returnState;
    private String returnResult;
    private String sendParam;
    private String systemIP;

    public String getSystemIP() {
        return systemIP;
    }

    public void setSystemIP(String systemIP) {
        this.systemIP = systemIP;
    }


    public Integer getProductConfigID() {
        return productConfigID;
    }

    public void setProductConfigID(Integer productConfigID) {
        this.productConfigID = productConfigID;
    }

    public String getFrontID() {
        return frontID;
    }

    public void setFrontID(String frontID) {
        this.frontID = frontID;
    }

    public String getTraceID() {
        return traceID;
    }

    public void setTraceID(String traceID) {
        this.traceID = traceID;
    }

    public Integer getSourceID() {
        return sourceID;
    }

    public void setSourceID(Integer sourceID) {
        this.sourceID = sourceID;
    }

    public Integer getTargetID() {
        return targetID;
    }

    public void setTargetID(Integer targetID) {
        this.targetID = targetID;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public String getSendURL() {
        return sendURL;
    }

    public void setSendURL(String sendURL) {
        this.sendURL = sendURL;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getReturnState() {
        return returnState;
    }

    public void setReturnState(String returnState) {
        this.returnState = returnState;
    }

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult;
    }

    public String getSendParam() {
        return sendParam;
    }

    public void setSendParam(String sendParam) {
        this.sendParam = sendParam;
    }
}
