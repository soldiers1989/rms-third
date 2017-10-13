package com.jzfq.rms.third.common.domain;

import java.util.Date;

/**
 * 车辆仓库实体
 * @author 大连桔子分期科技有限公司
 */
public class GpjCarDetailModel {
    private Integer bh;

    private Integer gpjId;

    private String emissionStandard;

    private float volume;

    private float priceBn;

    private int listedYear;

    private int delistedYear;

    private String detailModelSlug;

    private String detailModelName;

    private String brandName;

    private String brandSlug;

    private String modelName;

    private String modelSlug;

    private String modelMum;

    private Date updateTime;

    private String status;

    private Date optTime;

    private String optUser;

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public Integer getGpjId() {
        return gpjId;
    }

    public void setGpjId(Integer gpjId) {
        this.gpjId = gpjId;
    }

    public String getEmissionStandard() {
        return emissionStandard;
    }

    public void setEmissionStandard(String emissionStandard) {
        this.emissionStandard = emissionStandard;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getPriceBn() {
        return priceBn;
    }

    public void setPriceBn(float priceBn) {
        this.priceBn = priceBn;
    }

    public int getListedYear() {
        return listedYear;
    }

    public void setListedYear(int listedYear) {
        this.listedYear = listedYear;
    }

    public int getDelistedYear() {
        return delistedYear;
    }

    public void setDelistedYear(int delistedYear) {
        this.delistedYear = delistedYear;
    }

    public String getDetailModelSlug() {
        return detailModelSlug;
    }

    public void setDetailModelSlug(String detailModelSlug) {
        this.detailModelSlug = detailModelSlug;
    }

    public String getDetailModelName() {
        return detailModelName;
    }

    public void setDetailModelName(String detailModelName) {
        this.detailModelName = detailModelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandSlug() {
        return brandSlug;
    }

    public void setBrandSlug(String brandSlug) {
        this.brandSlug = brandSlug;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelSlug() {
        return modelSlug;
    }

    public void setModelSlug(String modelSlug) {
        this.modelSlug = modelSlug;
    }

    public String getModelMum() {
        return modelMum;
    }

    public void setModelMum(String modelMum) {
        this.modelMum = modelMum;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOptTime() {
        return optTime;
    }

    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }

    public String getOptUser() {
        return optUser;
    }

    public void setOptUser(String optUser) {
        this.optUser = optUser;
    }
}