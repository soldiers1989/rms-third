package com.jzfq.rms.third.common.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/23 15:15.
 **/
@Document(collection = "juxinli_data")
public class JuXinLiData {
    @Id
    @JsonIgnore
    private String id;

    @Indexed
    private String key;

    private String type;

    private String desc;

    private String data;

    private Date createTime;

    public JuXinLiData(String key,String type,String desc,String data){
        this.key = key;
        this.type = type;
        this.desc = desc;
        this.data = data;
        this.createTime = new Date();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
