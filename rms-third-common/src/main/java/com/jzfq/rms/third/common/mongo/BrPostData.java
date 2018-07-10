//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jzfq.rms.third.common.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(
        collection = "br_post_data"
)
public class BrPostData extends BaseData{
    @Id
    @JsonIgnore
    protected ObjectId id;
    private String interfaceType;
    @Indexed
    private String taskId;
    private String desc;
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
        return this.id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getInterfaceType() {
        return this.interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static class BrDataBuild {
        private String interfaceType;
        private String taskId;
        private String desc;
        private String data;
        private Date createTime;

        public BrDataBuild() {
        }

        public BrPostData.BrDataBuild createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public BrPostData.BrDataBuild interfaceType(String type) {
            this.interfaceType = type;
            return this;
        }

        public BrPostData.BrDataBuild taskId(String id) {
            this.taskId = id;
            return this;
        }

        public BrPostData.BrDataBuild desc(String desc) {
            this.desc = desc;
            return this;
        }

        public BrPostData.BrDataBuild data(String data) {
            this.data = data;
            return this;
        }

        public BrPostData build() {
            return new BrPostData(this.interfaceType, this.taskId, this.desc, this.data, this.createTime);
        }
    }
}
