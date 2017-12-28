package com.jzfq.rms.third.common.vo;

public class EvaluationInfoVo {

    // 品牌标识
    private String brandSlug;
    // 品牌名称
    private String brandName;
    // 型号标识
    private String modelSlug;
    // 型号名称
    private String modelName;
    // 款型名称
    private String detailModelName;
    // 款型标识
    private String detailModelSlug;
    // 上市年份
    private int listedYear;
    // 指导价格
    private float guidePrice;

    private String minSellPrice;// 车商收购价下限
    private String sellPrice;//  车商收购价
    private String maxSellPrice;//  车商收购价上限
    private String sellUrl;//  对应于车商收购价的公平价估值结果页面url
    private String minPrivatePrice;// 个人对个人交易价下限
    private String privatePrice;// 个人对个人交易价
    private String maxPrivatePrice;// 个人对个人交易价上限
    private String privateUrl;// 对应于个人对个人的交易价的公平价估值结果页面url
    private String minBuyPrice;// 车商卖车价下限
    private String buyPrice;// 车商卖车价
    private String maxBuyPrice;// 车商卖车价上限
    private String buyUrl;// 对应于车商卖车价的公平价估值结果页面url

    public String getMinSellPrice() {
        return minSellPrice;
    }

    public void setMinSellPrice(String minSellPrice) {
        this.minSellPrice = minSellPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getMaxSellPrice() {
        return maxSellPrice;
    }

    public void setMaxSellPrice(String maxSellPrice) {
        this.maxSellPrice = maxSellPrice;
    }

    public String getSellUrl() {
        return sellUrl;
    }

    public void setSellUrl(String sellUrl) {
        this.sellUrl = sellUrl;
    }

    public String getMinPrivatePrice() {
        return minPrivatePrice;
    }

    public void setMinPrivatePrice(String minPrivatePrice) {
        this.minPrivatePrice = minPrivatePrice;
    }

    public String getPrivatePrice() {
        return privatePrice;
    }

    public void setPrivatePrice(String privatePrice) {
        this.privatePrice = privatePrice;
    }

    public String getMaxPrivatePrice() {
        return maxPrivatePrice;
    }

    public void setMaxPrivatePrice(String maxPrivatePrice) {
        this.maxPrivatePrice = maxPrivatePrice;
    }

    public String getPrivateUrl() {
        return privateUrl;
    }

    public void setPrivateUrl(String privateUrl) {
        this.privateUrl = privateUrl;
    }

    public String getMinBuyPrice() {
        return minBuyPrice;
    }

    public void setMinBuyPrice(String minBuyPrice) {
        this.minBuyPrice = minBuyPrice;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getMaxBuyPrice() {
        return maxBuyPrice;
    }

    public void setMaxBuyPrice(String maxBuyPrice) {
        this.maxBuyPrice = maxBuyPrice;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public String getBrandSlug() {
        return brandSlug;
    }

    public void setBrandSlug(String brandSlug) {
        this.brandSlug = brandSlug;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelSlug() {
        return modelSlug;
    }

    public void setModelSlug(String modelSlug) {
        this.modelSlug = modelSlug;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDetailModelName() {
        return detailModelName;
    }

    public void setDetailModelName(String detailModelName) {
        this.detailModelName = detailModelName;
    }

    public String getDetailModelSlug() {
        return detailModelSlug;
    }

    public void setDetailModelSlug(String detailModelSlug) {
        this.detailModelSlug = detailModelSlug;
    }

    public int getListedYear() {
        return listedYear;
    }

    public void setListedYear(int listedYear) {
        this.listedYear = listedYear;
    }

    public float getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(float guidePrice) {
        this.guidePrice = guidePrice;
    }
}
