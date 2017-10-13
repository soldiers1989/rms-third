package com.jzfq.rms.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jzfq.rms.enums.CustomerTypeEnum;
import com.jzfq.rms.enums.FqzRuleEnum;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 风险分期规则
 * @author 大连桔子分期科技有限公司
 * @date 2016/12/1. 下午3:58:45
 */
@Document(collection = "risk_fqz_rule")
public class RiskFqzRule {

	@Id
    @JsonIgnore
    private ObjectId id;

	@Indexed
	private String uid;

    @Indexed
    private Long taskId;

    @Indexed
    private Byte ruleType;

    @Indexed
    private String orderNo;

    private Date applyTime;

    private String customerName;

    private String certCardNo;

    private Byte customerType;

    @Indexed
    private String phone;

    private Byte status;

    private String ip;
    private String device;

    private String ruleTypeName;
    private String customerTypeName;

    public RiskFqzRule() {}

    public RiskFqzRule(Long taskId,Byte ruleType,Date applyTime, String device, String phone, String ip) {
        this.taskId = taskId;
        this.ruleType = ruleType;
        this.status = 0;
        this.applyTime = applyTime;
        this.device = device;
        this.phone = phone;
        this.ip = ip;
        this.ruleTypeName = getRuleTypeName();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Byte getRuleType() {
        return ruleType;
    }

    public void setRuleType(Byte ruleType) {
        this.ruleType = ruleType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCertCardNo() {
        return certCardNo;
    }

    public void setCertCardNo(String certCardNo) {
        this.certCardNo = certCardNo == null ? null : certCardNo.trim();
    }

    public Byte getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Byte customerType) {
        this.customerType = customerType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getRuleTypeName() {
        if (getRuleType() != null) {
            return FqzRuleEnum.getName(getRuleType().intValue());
        }
        return ruleTypeName;
    }

    public void setRuleTypeName(String ruleTypeName) {
        this.ruleTypeName = ruleTypeName;
    }

    public String getCustomerTypeName() {
        if (getCustomerType() != null) {
            return CustomerTypeEnum.getName(getCustomerType().intValue());
        }
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}