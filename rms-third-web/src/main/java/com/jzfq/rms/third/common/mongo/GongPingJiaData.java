package com.jzfq.rms.third.common.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jzfq.rms.third.common.enums.GpjTypeEnum;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/28 11:10.
 **/
@Document(collection = "gongpingjia_data")
public class GongPingJiaData {
    @Id
    @JsonIgnore
    protected ObjectId id;

    private String type;

    private String desc;
    @Indexed
    private String vin;
    @Indexed
    private String plantNo;

    private Object data;

    private String value;

    private Date createTime;

    public GongPingJiaData(String vin, String plantNo, GpjTypeEnum type, String value, Object data, Date createTime){
        this.vin = vin;
        this.plantNo = plantNo;
        this.type = type.code();
        this.desc = type.msg();
        this.value = value;
        this.data = data;
        this.createTime = createTime;

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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPlantNo() {
        return plantNo;
    }

    public void setPlantNo(String plantNo) {
        this.plantNo = plantNo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Date getCreateTime() {
        return createTime;
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
