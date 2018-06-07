

package com.jzfq.rms.third.common.mongo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(
        collection = "peng_yuan_data"
)
public class PengYuan implements Serializable {
    @Id
    @JsonIgnore
    protected ObjectId id;
    @Indexed
    private Long taskId;
    @Indexed
    private String idCard;

    private String value;

    private String desc;
    private JSONObject data;
    private Date createTime;

    public PengYuan() {
    }

    public PengYuan(Long taskId, String idCard, String desc, JSONObject data,String value) {
        this.taskId = taskId;
        this.idCard = idCard;
        this.desc = desc;
        this.data = data;
        this.value=value;
        this.createTime = new Date();
    }

    public ObjectId getId() {
        return this.id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getTaskId() {
        return this.taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public JSONObject getData() {
        return this.data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
