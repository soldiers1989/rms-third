package com.jzfq.rms.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 请求百融返回的数据
 * @author 大连桔子分期科技有限公司
 * @date   9/29/16. 下午4:04:55
 */
@Document(collection = "br_post_data")
public class BrPostData {
    @Id
    @JsonIgnore
    protected ObjectId id;
    //接口类型 非工薪 or 白领
    private String interfaceType;
    //进件编号 也就是商城推送过来的
    @Indexed
    private String taskId;
    // 此接口描述
    private String desc;
    //接口返回的数据
    private String data;

    private Date createTime;


    public BrPostData() {
    }

    public BrPostData(String interfaceType, String taskId, String desc, String data, Date createTime) {
        this.interfaceType = interfaceType;
        this.taskId = taskId;
        this.desc = desc;
        this.data = data;
        this.createTime = createTime;
    }


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public static class BrDataBuild {
        //接口类型 非工薪 or 白领
        private String interfaceType;
        //进件编号 也就是商城推送过来的
        private String taskId;
        // 此接口描述
        private String desc;
        //接口返回的数据
        private String data;

        private Date createTime;

        public BrDataBuild createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public BrDataBuild interfaceType(String type) {
            this.interfaceType = type;
            return this;
        }

        public BrDataBuild taskId(String id) {
            this.taskId = id;
            return this;
        }

        public BrDataBuild desc(String desc) {
            this.desc = desc;
            return this;
        }

        public BrDataBuild data(String data) {
            this.data = data;
            return this;
        }

        public BrPostData build() {
            return new BrPostData(interfaceType, taskId, desc, data, createTime);
        }

    }
}
