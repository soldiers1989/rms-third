package com.jzfq.rms.third.common.domain;

import java.util.Date;
import java.util.UUID;

public class SysTask {

    private String id;
    private String taskSlug;
    private String taskDec;
    private Date excTime;
    private String status;
    private String taskParams;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SysTask(){
        id = UUID.randomUUID().toString().replaceAll("-", "");
    }

    public String getTaskParams() {
        return taskParams;
    }

    public void setTaskParams(String taskParams) {
        this.taskParams = taskParams;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskSlug() {
        return taskSlug;
    }

    public void setTaskSlug(String taskSlug) {
        this.taskSlug = taskSlug;
    }

    public String getTaskDec() {
        return taskDec;
    }

    public void setTaskDec(String taskDec) {
        this.taskDec = taskDec;
    }

    public Date getExcTime() {
        return excTime;
    }

    public void setExcTime(Date excTime) {
        this.excTime = excTime;
    }

}
