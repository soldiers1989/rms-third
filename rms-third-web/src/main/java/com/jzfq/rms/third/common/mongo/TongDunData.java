package com.jzfq.rms.third.common.mongo;

import cn.fraudmetrix.riskservice.RuleDetailResult;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/21 13:42.
 **/
@Document(collection = "tongdun_data")
public class TongDunData {
    @Id
    @JsonIgnore
    protected ObjectId id;

    @Indexed
    private String serialNo;

    @Indexed
    private String orderNo;

    private String name;

    private String mobile;

    private String certCardNo;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCertCardNo() {
        return certCardNo;
    }

    public void setCertCardNo(String certCardNo) {
        this.certCardNo = certCardNo;
    }

    private FraudApiResponse apiResp;

    private RuleDetailResult ruleDetailResult;

    private Date createTime;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public FraudApiResponse getApiResp() {
        return apiResp;
    }

    public void setApiResp(FraudApiResponse apiResp) {
        this.apiResp = apiResp;
    }

    public RuleDetailResult getRuleDetailResult() {
        return ruleDetailResult;
    }

    public void setRuleDetailResult(RuleDetailResult ruleDetailResult) {
        this.ruleDetailResult = ruleDetailResult;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
