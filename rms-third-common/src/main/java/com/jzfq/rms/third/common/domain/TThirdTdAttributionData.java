package com.jzfq.rms.third.common.domain;

import java.util.Date;

public class TThirdTdAttributionData {
    private String cId;

    private String cSeqId;

    private String cIdcardProvince;

    private String cIdcardCity;

    private String cCounty;

    private String cMobileAddressProvince;

    private String cMobileAddressCity;

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

    public String getcIdcardProvince() {
        return cIdcardProvince;
    }

    public void setcIdcardProvince(String cIdcardProvince) {
        this.cIdcardProvince = cIdcardProvince == null ? null : cIdcardProvince.trim();
    }

    public String getcIdcardCity() {
        return cIdcardCity;
    }

    public void setcIdcardCity(String cIdcardCity) {
        this.cIdcardCity = cIdcardCity == null ? null : cIdcardCity.trim();
    }

    public String getcCounty() {
        return cCounty;
    }

    public void setcCounty(String cCounty) {
        this.cCounty = cCounty == null ? null : cCounty.trim();
    }

    public String getcMobileAddressProvince() {
        return cMobileAddressProvince;
    }

    public void setcMobileAddressProvince(String cMobileAddressProvince) {
        this.cMobileAddressProvince = cMobileAddressProvince == null ? null : cMobileAddressProvince.trim();
    }

    public String getcMobileAddressCity() {
        return cMobileAddressCity;
    }

    public void setcMobileAddressCity(String cMobileAddressCity) {
        this.cMobileAddressCity = cMobileAddressCity == null ? null : cMobileAddressCity.trim();
    }

    public Date getcCreattime() {
        return cCreattime;
    }

    public void setcCreattime(Date cCreattime) {
        this.cCreattime = cCreattime;
    }
}