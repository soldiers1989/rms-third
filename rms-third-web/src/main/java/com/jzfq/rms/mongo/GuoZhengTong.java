package com.jzfq.rms.mongo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 国政通
 * @author 大连桔子分期科技有限公司
 * @date   2017/3/13. 下午4:04:55
 */
@Document(collection = "guo_zheng_tong_data")
public class GuoZhengTong {

    @Id
    @JsonIgnore
    protected ObjectId id;

    @Indexed
    private Long taskId;

    //申请人身份证号
    @Indexed
    private String idCard;

    // 此接口描述
    private String desc;

    //接口返回的数据
    private JSONObject data;

    private Date createTime;

    public GuoZhengTong(){}

    public GuoZhengTong(Long taskId, String idCard, String desc, JSONObject data) {
        this.taskId = taskId;
        this.idCard = idCard;
        this.desc = desc;
        this.data = data;
        this.createTime = new Date();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
