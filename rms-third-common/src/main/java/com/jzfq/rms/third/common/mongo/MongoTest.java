package com.jzfq.rms.third.common.mongo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jzfq.rms.third.common.domain.TBrTransferLog;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/15 17:40.
 **/
@Document(collection = "mongo_test")
public class MongoTest {
    @Id
    @JsonIgnore
    protected ObjectId id;
    @Indexed
    private String taskId;
    // 此接口描述
    private String desc;

    private JSONObject json;

    private List<TBrTransferLog> list;

    public List<TBrTransferLog> getList() {
        return list;
    }

    public void setList(List<TBrTransferLog> list) {
        this.list = list;
    }

    public JSONObject getJson() {
        return json;
    }

    public void setJson(JSONObject json) {
        this.json = json;
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
}
