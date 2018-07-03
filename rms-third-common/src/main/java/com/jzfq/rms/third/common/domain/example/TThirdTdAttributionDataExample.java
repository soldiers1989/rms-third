package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdTdAttributionDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdTdAttributionDataExample() {
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

        public Criteria andCIdcardProvinceIsNull() {
            addCriterion("c_idcard_province is null");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceIsNotNull() {
            addCriterion("c_idcard_province is not null");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceEqualTo(String value) {
            addCriterion("c_idcard_province =", value, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceNotEqualTo(String value) {
            addCriterion("c_idcard_province <>", value, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceGreaterThan(String value) {
            addCriterion("c_idcard_province >", value, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("c_idcard_province >=", value, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceLessThan(String value) {
            addCriterion("c_idcard_province <", value, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceLessThanOrEqualTo(String value) {
            addCriterion("c_idcard_province <=", value, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceLike(String value) {
            addCriterion("c_idcard_province like", value, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceNotLike(String value) {
            addCriterion("c_idcard_province not like", value, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceIn(List<String> values) {
            addCriterion("c_idcard_province in", values, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceNotIn(List<String> values) {
            addCriterion("c_idcard_province not in", values, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceBetween(String value1, String value2) {
            addCriterion("c_idcard_province between", value1, value2, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardProvinceNotBetween(String value1, String value2) {
            addCriterion("c_idcard_province not between", value1, value2, "cIdcardProvince");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityIsNull() {
            addCriterion("c_idcard_city is null");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityIsNotNull() {
            addCriterion("c_idcard_city is not null");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityEqualTo(String value) {
            addCriterion("c_idcard_city =", value, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityNotEqualTo(String value) {
            addCriterion("c_idcard_city <>", value, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityGreaterThan(String value) {
            addCriterion("c_idcard_city >", value, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityGreaterThanOrEqualTo(String value) {
            addCriterion("c_idcard_city >=", value, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityLessThan(String value) {
            addCriterion("c_idcard_city <", value, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityLessThanOrEqualTo(String value) {
            addCriterion("c_idcard_city <=", value, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityLike(String value) {
            addCriterion("c_idcard_city like", value, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityNotLike(String value) {
            addCriterion("c_idcard_city not like", value, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityIn(List<String> values) {
            addCriterion("c_idcard_city in", values, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityNotIn(List<String> values) {
            addCriterion("c_idcard_city not in", values, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityBetween(String value1, String value2) {
            addCriterion("c_idcard_city between", value1, value2, "cIdcardCity");
            return (Criteria) this;
        }

        public Criteria andCIdcardCityNotBetween(String value1, String value2) {
            addCriterion("c_idcard_city not between", value1, value2, "cIdcardCity");
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

        public Criteria andCMobileAddressProvinceIsNull() {
            addCriterion("c_mobile_address_province is null");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceIsNotNull() {
            addCriterion("c_mobile_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceEqualTo(String value) {
            addCriterion("c_mobile_address_province =", value, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceNotEqualTo(String value) {
            addCriterion("c_mobile_address_province <>", value, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceGreaterThan(String value) {
            addCriterion("c_mobile_address_province >", value, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("c_mobile_address_province >=", value, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceLessThan(String value) {
            addCriterion("c_mobile_address_province <", value, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("c_mobile_address_province <=", value, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceLike(String value) {
            addCriterion("c_mobile_address_province like", value, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceNotLike(String value) {
            addCriterion("c_mobile_address_province not like", value, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceIn(List<String> values) {
            addCriterion("c_mobile_address_province in", values, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceNotIn(List<String> values) {
            addCriterion("c_mobile_address_province not in", values, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceBetween(String value1, String value2) {
            addCriterion("c_mobile_address_province between", value1, value2, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("c_mobile_address_province not between", value1, value2, "cMobileAddressProvince");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityIsNull() {
            addCriterion("c_mobile_address_city is null");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityIsNotNull() {
            addCriterion("c_mobile_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityEqualTo(String value) {
            addCriterion("c_mobile_address_city =", value, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityNotEqualTo(String value) {
            addCriterion("c_mobile_address_city <>", value, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityGreaterThan(String value) {
            addCriterion("c_mobile_address_city >", value, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("c_mobile_address_city >=", value, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityLessThan(String value) {
            addCriterion("c_mobile_address_city <", value, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityLessThanOrEqualTo(String value) {
            addCriterion("c_mobile_address_city <=", value, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityLike(String value) {
            addCriterion("c_mobile_address_city like", value, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityNotLike(String value) {
            addCriterion("c_mobile_address_city not like", value, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityIn(List<String> values) {
            addCriterion("c_mobile_address_city in", values, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityNotIn(List<String> values) {
            addCriterion("c_mobile_address_city not in", values, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityBetween(String value1, String value2) {
            addCriterion("c_mobile_address_city between", value1, value2, "cMobileAddressCity");
            return (Criteria) this;
        }

        public Criteria andCMobileAddressCityNotBetween(String value1, String value2) {
            addCriterion("c_mobile_address_city not between", value1, value2, "cMobileAddressCity");
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