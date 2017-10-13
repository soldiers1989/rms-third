package com.jzfq.rms.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 聚信立拉取数据
 * @author 大连桔子分期科技有限公司
 * @date 2016年11月15日 下午3:58:45
 */
@Document(collection = "jxl_get_data")
public class JxlData {
    @Id
    @JsonIgnore
    protected ObjectId id;
    
    //接口类型  0用户报告 1运营商数据
    private Byte interfaceType;
    
    //申请人姓名
    @Indexed
    private String name;
    
    //申请人身份证号
    @Indexed
    private String idCard;
    
    //申请人电话号码
    @Indexed
    private String phone;
    
    // 此接口描述
    private String desc;
    
    //接口返回的数据
    private String data;

    private Date createTime;

    public JxlData(){}

    public JxlData(Byte interfaceType, String name, String idCard,
			String phone, String desc, String data) {
		this.interfaceType = interfaceType;
		this.name = name;
		this.idCard = idCard;
		this.phone = phone;
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

    public Byte getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(Byte interfaceType) {
        this.interfaceType = interfaceType;
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
