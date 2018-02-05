package com.jzfq.rms.third.common.mongo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 请求百融返回的数据
 * @author 大连桔子分期科技有限公司
 * @date   9/29/16. 下午4:04:55
 */
@Document(collection = "bairong_data")
public class BairongData {
    @Id
    @JsonIgnore
    protected ObjectId id;
    //接口类型 非工薪 or 白领
    private String type;
    //进件编号 也就是商城推送过来的
    @Indexed
    private String name;
    @Indexed
    private String certCardNo;
    @Indexed
    private String mobile;
    @Indexed
    private String strategyId;

    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    private Date createTime;

    private String data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertCardNo() {
        return certCardNo;
    }

    public void setCertCardNo(String certCardNo) {
        this.certCardNo = certCardNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BairongData() {
    }

    public BairongData(String type, String name, String certCardNo, String mobile, String strategyId, String data, Date createTime) {
        this.type = type;
        this.name = name;
        this.certCardNo = certCardNo;
        this.mobile = mobile;
        this.strategyId = strategyId;
        this.data = data;
        this.createTime = createTime;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static class BairongDataBuild {
        //接口类型 非工薪 or 白领
        private String type;
        private String name;
        private String certCardNo;
        private String mobile;
        private String data;
        private Date createTime;
        private String strategyId;

        public BairongDataBuild strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        public BairongDataBuild createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public BairongDataBuild type(String type) {
            this.type = type;
            return this;
        }

        public BairongDataBuild name(String name) {
            this.name = name;
            return this;
        }

        public BairongDataBuild certCardNo(String certCardNo) {
            this.certCardNo = certCardNo;
            return this;
        }

        public BairongDataBuild mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public BairongDataBuild data(String data) {
            this.data = data;
            return this;
        }

        public BairongData build() {
            return new BairongData(type, name, certCardNo, mobile, strategyId, data, createTime);
        }
    }
}
