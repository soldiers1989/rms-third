package com.jzfq.rms.third.common.mongo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "jiguang_data")
public class JiguangData {

    @Id
    @JsonIgnore
    protected String id;

    @Indexed
    private String name;

    @Indexed
    private String idCard;

    @Indexed
    private String phone;

    private String channel;


    private String yqScore;//逾期分

    private String wyScore;//违约分

    private String gxfxScore;//关系风险分\

    private String sumScore;//总分

    private String orderNo;//订单号

    private String traceId;//流水号

    private String description;//结果


    private JSONObject data;

    private Date createTime;

    public JiguangData() {

    }

    public JiguangData(String name, String idCard, String phone, String yqScore, String wyScore, String gxfxScore, String sumScore,
                       String channelid, JSONObject data, String orderNo, String traceId, String description) {
        this.name = name;
        this.idCard = idCard;
        this.phone = phone;
        this.yqScore = yqScore;
        this.wyScore = wyScore;
        this.gxfxScore = gxfxScore;
        this.sumScore = sumScore;
        this.channel = channelid;
        this.data = data;
        this.orderNo = orderNo;
        this.traceId = traceId;
        this.createTime = new Date();
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }


    public String getYqScore() {
        return yqScore;
    }

    public void setYqScore(String yqScore) {
        this.yqScore = yqScore;
    }

    public String getWyScore() {
        return wyScore;
    }

    public void setWyScore(String wyScore) {
        this.wyScore = wyScore;
    }

    public String getGxfxScore() {
        return gxfxScore;
    }

    public void setGxfxScore(String gxfxScore) {
        this.gxfxScore = gxfxScore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSumScore() {
        return sumScore;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }
}
