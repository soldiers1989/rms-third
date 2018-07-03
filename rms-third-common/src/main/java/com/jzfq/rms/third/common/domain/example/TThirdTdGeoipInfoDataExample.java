package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdTdGeoipInfoDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdTdGeoipInfoDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdIsNull() {
            addCriterion("c_seq_id is null");
            return (Criteria) this;
        }

        public Criteria andCSeqIdIsNotNull() {
            addCriterion("c_seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andCSeqIdEqualTo(String value) {
            addCriterion("c_seq_id =", value, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdNotEqualTo(String value) {
            addCriterion("c_seq_id <>", value, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdGreaterThan(String value) {
            addCriterion("c_seq_id >", value, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_seq_id >=", value, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdLessThan(String value) {
            addCriterion("c_seq_id <", value, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdLessThanOrEqualTo(String value) {
            addCriterion("c_seq_id <=", value, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdLike(String value) {
            addCriterion("c_seq_id like", value, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdNotLike(String value) {
            addCriterion("c_seq_id not like", value, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdIn(List<String> values) {
            addCriterion("c_seq_id in", values, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdNotIn(List<String> values) {
            addCriterion("c_seq_id not in", values, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdBetween(String value1, String value2) {
            addCriterion("c_seq_id between", value1, value2, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCSeqIdNotBetween(String value1, String value2) {
            addCriterion("c_seq_id not between", value1, value2, "cSeqId");
            return (Criteria) this;
        }

        public Criteria andCCityIsNull() {
            addCriterion("c_city is null");
            return (Criteria) this;
        }

        public Criteria andCCityIsNotNull() {
            addCriterion("c_city is not null");
            return (Criteria) this;
        }

        public Criteria andCCityEqualTo(String value) {
            addCriterion("c_city =", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotEqualTo(String value) {
            addCriterion("c_city <>", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThan(String value) {
            addCriterion("c_city >", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThanOrEqualTo(String value) {
            addCriterion("c_city >=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThan(String value) {
            addCriterion("c_city <", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThanOrEqualTo(String value) {
            addCriterion("c_city <=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLike(String value) {
            addCriterion("c_city like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotLike(String value) {
            addCriterion("c_city not like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityIn(List<String> values) {
            addCriterion("c_city in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotIn(List<String> values) {
            addCriterion("c_city not in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityBetween(String value1, String value2) {
            addCriterion("c_city between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotBetween(String value1, String value2) {
            addCriterion("c_city not between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityIdIsNull() {
            addCriterion("c_city_id is null");
            return (Criteria) this;
        }

        public Criteria andCCityIdIsNotNull() {
            addCriterion("c_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCityIdEqualTo(String value) {
            addCriterion("c_city_id =", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotEqualTo(String value) {
            addCriterion("c_city_id <>", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdGreaterThan(String value) {
            addCriterion("c_city_id >", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_city_id >=", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLessThan(String value) {
            addCriterion("c_city_id <", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLessThanOrEqualTo(String value) {
            addCriterion("c_city_id <=", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLike(String value) {
            addCriterion("c_city_id like", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotLike(String value) {
            addCriterion("c_city_id not like", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdIn(List<String> values) {
            addCriterion("c_city_id in", values, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotIn(List<String> values) {
            addCriterion("c_city_id not in", values, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdBetween(String value1, String value2) {
            addCriterion("c_city_id between", value1, value2, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotBetween(String value1, String value2) {
            addCriterion("c_city_id not between", value1, value2, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCountryIsNull() {
            addCriterion("c_country is null");
            return (Criteria) this;
        }

        public Criteria andCCountryIsNotNull() {
            addCriterion("c_country is not null");
            return (Criteria) this;
        }

        public Criteria andCCountryEqualTo(String value) {
            addCriterion("c_country =", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryNotEqualTo(String value) {
            addCriterion("c_country <>", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryGreaterThan(String value) {
            addCriterion("c_country >", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryGreaterThanOrEqualTo(String value) {
            addCriterion("c_country >=", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryLessThan(String value) {
            addCriterion("c_country <", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryLessThanOrEqualTo(String value) {
            addCriterion("c_country <=", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryLike(String value) {
            addCriterion("c_country like", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryNotLike(String value) {
            addCriterion("c_country not like", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryIn(List<String> values) {
            addCriterion("c_country in", values, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryNotIn(List<String> values) {
            addCriterion("c_country not in", values, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryBetween(String value1, String value2) {
            addCriterion("c_country between", value1, value2, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryNotBetween(String value1, String value2) {
            addCriterion("c_country not between", value1, value2, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryIdIsNull() {
            addCriterion("c_country_id is null");
            return (Criteria) this;
        }

        public Criteria andCCountryIdIsNotNull() {
            addCriterion("c_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCountryIdEqualTo(String value) {
            addCriterion("c_country_id =", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdNotEqualTo(String value) {
            addCriterion("c_country_id <>", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdGreaterThan(String value) {
            addCriterion("c_country_id >", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_country_id >=", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdLessThan(String value) {
            addCriterion("c_country_id <", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdLessThanOrEqualTo(String value) {
            addCriterion("c_country_id <=", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdLike(String value) {
            addCriterion("c_country_id like", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdNotLike(String value) {
            addCriterion("c_country_id not like", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdIn(List<String> values) {
            addCriterion("c_country_id in", values, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdNotIn(List<String> values) {
            addCriterion("c_country_id not in", values, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdBetween(String value1, String value2) {
            addCriterion("c_country_id between", value1, value2, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdNotBetween(String value1, String value2) {
            addCriterion("c_country_id not between", value1, value2, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNull() {
            addCriterion("c_province is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNotNull() {
            addCriterion("c_province is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceEqualTo(String value) {
            addCriterion("c_province =", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotEqualTo(String value) {
            addCriterion("c_province <>", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThan(String value) {
            addCriterion("c_province >", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("c_province >=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThan(String value) {
            addCriterion("c_province <", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThanOrEqualTo(String value) {
            addCriterion("c_province <=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLike(String value) {
            addCriterion("c_province like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotLike(String value) {
            addCriterion("c_province not like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceIn(List<String> values) {
            addCriterion("c_province in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotIn(List<String> values) {
            addCriterion("c_province not in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceBetween(String value1, String value2) {
            addCriterion("c_province between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotBetween(String value1, String value2) {
            addCriterion("c_province not between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdIsNull() {
            addCriterion("c_province_id is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdIsNotNull() {
            addCriterion("c_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdEqualTo(String value) {
            addCriterion("c_province_id =", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdNotEqualTo(String value) {
            addCriterion("c_province_id <>", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdGreaterThan(String value) {
            addCriterion("c_province_id >", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_province_id >=", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdLessThan(String value) {
            addCriterion("c_province_id <", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("c_province_id <=", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdLike(String value) {
            addCriterion("c_province_id like", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdNotLike(String value) {
            addCriterion("c_province_id not like", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdIn(List<String> values) {
            addCriterion("c_province_id in", values, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdNotIn(List<String> values) {
            addCriterion("c_province_id not in", values, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdBetween(String value1, String value2) {
            addCriterion("c_province_id between", value1, value2, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdNotBetween(String value1, String value2) {
            addCriterion("c_province_id not between", value1, value2, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCCountyIsNull() {
            addCriterion("c_county is null");
            return (Criteria) this;
        }

        public Criteria andCCountyIsNotNull() {
            addCriterion("c_county is not null");
            return (Criteria) this;
        }

        public Criteria andCCountyEqualTo(String value) {
            addCriterion("c_county =", value, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyNotEqualTo(String value) {
            addCriterion("c_county <>", value, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyGreaterThan(String value) {
            addCriterion("c_county >", value, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyGreaterThanOrEqualTo(String value) {
            addCriterion("c_county >=", value, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyLessThan(String value) {
            addCriterion("c_county <", value, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyLessThanOrEqualTo(String value) {
            addCriterion("c_county <=", value, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyLike(String value) {
            addCriterion("c_county like", value, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyNotLike(String value) {
            addCriterion("c_county not like", value, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyIn(List<String> values) {
            addCriterion("c_county in", values, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyNotIn(List<String> values) {
            addCriterion("c_county not in", values, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyBetween(String value1, String value2) {
            addCriterion("c_county between", value1, value2, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCCountyNotBetween(String value1, String value2) {
            addCriterion("c_county not between", value1, value2, "cCounty");
            return (Criteria) this;
        }

        public Criteria andCStreetIsNull() {
            addCriterion("c_street is null");
            return (Criteria) this;
        }

        public Criteria andCStreetIsNotNull() {
            addCriterion("c_street is not null");
            return (Criteria) this;
        }

        public Criteria andCStreetEqualTo(String value) {
            addCriterion("c_street =", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetNotEqualTo(String value) {
            addCriterion("c_street <>", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetGreaterThan(String value) {
            addCriterion("c_street >", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetGreaterThanOrEqualTo(String value) {
            addCriterion("c_street >=", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetLessThan(String value) {
            addCriterion("c_street <", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetLessThanOrEqualTo(String value) {
            addCriterion("c_street <=", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetLike(String value) {
            addCriterion("c_street like", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetNotLike(String value) {
            addCriterion("c_street not like", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetIn(List<String> values) {
            addCriterion("c_street in", values, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetNotIn(List<String> values) {
            addCriterion("c_street not in", values, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetBetween(String value1, String value2) {
            addCriterion("c_street between", value1, value2, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetNotBetween(String value1, String value2) {
            addCriterion("c_street not between", value1, value2, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCIspIsNull() {
            addCriterion("c_isp is null");
            return (Criteria) this;
        }

        public Criteria andCIspIsNotNull() {
            addCriterion("c_isp is not null");
            return (Criteria) this;
        }

        public Criteria andCIspEqualTo(String value) {
            addCriterion("c_isp =", value, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspNotEqualTo(String value) {
            addCriterion("c_isp <>", value, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspGreaterThan(String value) {
            addCriterion("c_isp >", value, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspGreaterThanOrEqualTo(String value) {
            addCriterion("c_isp >=", value, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspLessThan(String value) {
            addCriterion("c_isp <", value, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspLessThanOrEqualTo(String value) {
            addCriterion("c_isp <=", value, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspLike(String value) {
            addCriterion("c_isp like", value, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspNotLike(String value) {
            addCriterion("c_isp not like", value, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspIn(List<String> values) {
            addCriterion("c_isp in", values, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspNotIn(List<String> values) {
            addCriterion("c_isp not in", values, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspBetween(String value1, String value2) {
            addCriterion("c_isp between", value1, value2, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCIspNotBetween(String value1, String value2) {
            addCriterion("c_isp not between", value1, value2, "cIsp");
            return (Criteria) this;
        }

        public Criteria andCLatitudeIsNull() {
            addCriterion("c_latitude is null");
            return (Criteria) this;
        }

        public Criteria andCLatitudeIsNotNull() {
            addCriterion("c_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andCLatitudeEqualTo(String value) {
            addCriterion("c_latitude =", value, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeNotEqualTo(String value) {
            addCriterion("c_latitude <>", value, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeGreaterThan(String value) {
            addCriterion("c_latitude >", value, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("c_latitude >=", value, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeLessThan(String value) {
            addCriterion("c_latitude <", value, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeLessThanOrEqualTo(String value) {
            addCriterion("c_latitude <=", value, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeLike(String value) {
            addCriterion("c_latitude like", value, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeNotLike(String value) {
            addCriterion("c_latitude not like", value, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeIn(List<String> values) {
            addCriterion("c_latitude in", values, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeNotIn(List<String> values) {
            addCriterion("c_latitude not in", values, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeBetween(String value1, String value2) {
            addCriterion("c_latitude between", value1, value2, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLatitudeNotBetween(String value1, String value2) {
            addCriterion("c_latitude not between", value1, value2, "cLatitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeIsNull() {
            addCriterion("c_longitude is null");
            return (Criteria) this;
        }

        public Criteria andCLongitudeIsNotNull() {
            addCriterion("c_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andCLongitudeEqualTo(String value) {
            addCriterion("c_longitude =", value, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeNotEqualTo(String value) {
            addCriterion("c_longitude <>", value, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeGreaterThan(String value) {
            addCriterion("c_longitude >", value, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("c_longitude >=", value, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeLessThan(String value) {
            addCriterion("c_longitude <", value, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeLessThanOrEqualTo(String value) {
            addCriterion("c_longitude <=", value, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeLike(String value) {
            addCriterion("c_longitude like", value, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeNotLike(String value) {
            addCriterion("c_longitude not like", value, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeIn(List<String> values) {
            addCriterion("c_longitude in", values, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeNotIn(List<String> values) {
            addCriterion("c_longitude not in", values, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeBetween(String value1, String value2) {
            addCriterion("c_longitude between", value1, value2, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLongitudeNotBetween(String value1, String value2) {
            addCriterion("c_longitude not between", value1, value2, "cLongitude");
            return (Criteria) this;
        }

        public Criteria andCLipIsNull() {
            addCriterion("c_lip is null");
            return (Criteria) this;
        }

        public Criteria andCLipIsNotNull() {
            addCriterion("c_lip is not null");
            return (Criteria) this;
        }

        public Criteria andCLipEqualTo(String value) {
            addCriterion("c_lip =", value, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipNotEqualTo(String value) {
            addCriterion("c_lip <>", value, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipGreaterThan(String value) {
            addCriterion("c_lip >", value, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipGreaterThanOrEqualTo(String value) {
            addCriterion("c_lip >=", value, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipLessThan(String value) {
            addCriterion("c_lip <", value, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipLessThanOrEqualTo(String value) {
            addCriterion("c_lip <=", value, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipLike(String value) {
            addCriterion("c_lip like", value, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipNotLike(String value) {
            addCriterion("c_lip not like", value, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipIn(List<String> values) {
            addCriterion("c_lip in", values, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipNotIn(List<String> values) {
            addCriterion("c_lip not in", values, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipBetween(String value1, String value2) {
            addCriterion("c_lip between", value1, value2, "cLip");
            return (Criteria) this;
        }

        public Criteria andCLipNotBetween(String value1, String value2) {
            addCriterion("c_lip not between", value1, value2, "cLip");
            return (Criteria) this;
        }

        public Criteria andCCreattimeIsNull() {
            addCriterion("c_creatTime is null");
            return (Criteria) this;
        }

        public Criteria andCCreattimeIsNotNull() {
            addCriterion("c_creatTime is not null");
            return (Criteria) this;
        }

        public Criteria andCCreattimeEqualTo(Date value) {
            addCriterion("c_creatTime =", value, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeNotEqualTo(Date value) {
            addCriterion("c_creatTime <>", value, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeGreaterThan(Date value) {
            addCriterion("c_creatTime >", value, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_creatTime >=", value, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeLessThan(Date value) {
            addCriterion("c_creatTime <", value, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("c_creatTime <=", value, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeIn(List<Date> values) {
            addCriterion("c_creatTime in", values, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeNotIn(List<Date> values) {
            addCriterion("c_creatTime not in", values, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeBetween(Date value1, Date value2) {
            addCriterion("c_creatTime between", value1, value2, "cCreattime");
            return (Criteria) this;
        }

        public Criteria andCCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("c_creatTime not between", value1, value2, "cCreattime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}