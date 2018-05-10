package com.jzfq.rms.third.common.mongo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/05/07 15:25.
 **/
@Document(collection = "jiao_error_data")
public class JiaoErrorData {
    @Id
    @JsonIgnore
    protected String id;

    @Indexed
    private String name;

    @Indexed
    private String idCard;

    @Indexed
    private String phone;

    private String type;

    private String desc;

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private JSONObject data;

    private Date createTime;

    public JiaoErrorData(){

    }

    public JiaoErrorData(String name, String idCard, String phone, String value, PhoneDataTypeEnum type, JSONObject data){
        this.name = name;
        this.idCard = idCard;
        this.phone = phone;
        this.value = value;
        this.type = type.getCode();
        this.desc = type.getName();
        this.data = data;
        this.createTime  = new Date();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
