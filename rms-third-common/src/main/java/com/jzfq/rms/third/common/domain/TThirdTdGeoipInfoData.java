package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TThirdTdGeoipInfoData {
    private String cId;

    private String cSeqId;

    private String cCity;

    private String cCityId;

    private String cCountry;

    private String cCountryId;

    private String cProvince;

    private String cProvinceId;

    private String cCounty;

    private String cStreet;

    private String cIsp;

    private String cLatitude;

    private String cLongitude;

    private String cLip;

    private Date cCreattime;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcSeqId() {
        return cSeqId;
    }

    public void setcSeqId(String cSeqId) {
        this.cSeqId = cSeqId == null ? null : cSeqId.trim();
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity == null ? null : cCity.trim();
    }

    public String getcCityId() {
        return cCityId;
    }

    public void setcCityId(String cCityId) {
        this.cCityId = cCityId == null ? null : cCityId.trim();
    }

    public String getcCountry() {
        return cCountry;
    }

    public void setcCountry(String cCountry) {
        this.cCountry = cCountry == null ? null : cCountry.trim();
    }

    public String getcCountryId() {
        return cCountryId;
    }

    public void setcCountryId(String cCountryId) {
        this.cCountryId = cCountryId == null ? null : cCountryId.trim();
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince == null ? null : cProvince.trim();
    }

    public String getcProvinceId() {
        return cProvinceId;
    }

    public void setcProvinceId(String cProvinceId) {
        this.cProvinceId = cProvinceId == null ? null : cProvinceId.trim();
    }

    public String getcCounty() {
        return cCounty;
    }

    public void setcCounty(String cCounty) {
        this.cCounty = cCounty == null ? null : cCounty.trim();
    }

    public String getcStreet() {
        return cStreet;
    }

    public void setcStreet(String cStreet) {
        this.cStreet = cStreet == null ? null : cStreet.trim();
    }

    public String getcIsp() {
        return cIsp;
    }

    public void setcIsp(String cIsp) {
        this.cIsp = cIsp == null ? null : cIsp.trim();
    }

    public String getcLatitude() {
        return cLatitude;
    }

    public void setcLatitude(String cLatitude) {
        this.cLatitude = cLatitude == null ? null : cLatitude.trim();
    }

    public String getcLongitude() {
        return cLongitude;
    }

    public void setcLongitude(String cLongitude) {
        this.cLongitude = cLongitude == null ? null : cLongitude.trim();
    }

    public String getcLip() {
        return cLip;
    }

    public void setcLip(String cLip) {
        this.cLip = cLip == null ? null : cLip.trim();
    }

    public Date getcCreattime() {
        return cCreattime;
    }

    public void setcCreattime(Date cCreattime) {
        this.cCreattime = cCreattime;
    }
}