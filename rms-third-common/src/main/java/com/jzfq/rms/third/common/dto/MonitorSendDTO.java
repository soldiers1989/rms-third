package com.jzfq.rms.third.common.dto;

import com.jzfq.rms.third.common.pojo.Monitor;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 18:07.
 **/
public class MonitorSendDTO {
    private String traceID;
    private String systemID;

    private List<Monitor> params;

    public String getTraceID() {
        return traceID;
    }

    public void setTraceID(String traceID) {
        this.traceID = traceID;
    }

    public List<Monitor> getParams() {
        return params;
    }

    public void setParams(List<Monitor> params) {
        this.params = params;
    }

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }
}
