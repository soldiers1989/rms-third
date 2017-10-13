package com.jzfq.rms.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


/**
 * 星辰数据
 * @author 大连桔子分期科技有限公司
 * @date 2016/12/2. 下午3:58:45
 */
@Document(collection = "xc_get_data")
public class XcData {

    @Id
    @JsonIgnore
    protected ObjectId id;

    //进件编号 也就是商城推送过来的
    @Indexed
    private String taskId;

    // 此接口描述
    private String desc;

    // type  区分 同盾
    @SuppressWarnings("unused")
	private String type;

    //接口返回的数据
    private String data;

    private Date createTime;

    public XcData(){

    }

    public XcData(String taskId, String data, String desc, Date createTime) {
        this.taskId = taskId;
        this.data = data;
        this.type = "td";
        this.desc = desc;
        this.createTime = createTime;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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
}
