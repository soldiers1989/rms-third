package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdJiaoDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdJiaoDataExample() {
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

        public Criteria andCOrderNoIsNull() {
            addCriterion("c_order_no is null");
            return (Criteria) this;
        }

        public Criteria andCOrderNoIsNotNull() {
            addCriterion("c_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderNoEqualTo(String value) {
            addCriterion("c_order_no =", value, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoNotEqualTo(String value) {
            addCriterion("c_order_no <>", value, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoGreaterThan(String value) {
            addCriterion("c_order_no >", value, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("c_order_no >=", value, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoLessThan(String value) {
            addCriterion("c_order_no <", value, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoLessThanOrEqualTo(String value) {
            addCriterion("c_order_no <=", value, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoLike(String value) {
            addCriterion("c_order_no like", value, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoNotLike(String value) {
            addCriterion("c_order_no not like", value, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoIn(List<String> values) {
            addCriterion("c_order_no in", values, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoNotIn(List<String> values) {
            addCriterion("c_order_no not in", values, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoBetween(String value1, String value2) {
            addCriterion("c_order_no between", value1, value2, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCOrderNoNotBetween(String value1, String value2) {
            addCriterion("c_order_no not between", value1, value2, "cOrderNo");
            return (Criteria) this;
        }

        public Criteria andCTraceIdIsNull() {
            addCriterion("c_trace_id is null");
            return (Criteria) this;
        }

        public Criteria andCTraceIdIsNotNull() {
            addCriterion("c_trace_id is not null");
            return (Criteria) this;
        }

        public Criteria andCTraceIdEqualTo(String value) {
            addCriterion("c_trace_id =", value, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdNotEqualTo(String value) {
            addCriterion("c_trace_id <>", value, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdGreaterThan(String value) {
            addCriterion("c_trace_id >", value, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_trace_id >=", value, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdLessThan(String value) {
            addCriterion("c_trace_id <", value, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdLessThanOrEqualTo(String value) {
            addCriterion("c_trace_id <=", value, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdLike(String value) {
            addCriterion("c_trace_id like", value, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdNotLike(String value) {
            addCriterion("c_trace_id not like", value, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdIn(List<String> values) {
            addCriterion("c_trace_id in", values, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdNotIn(List<String> values) {
            addCriterion("c_trace_id not in", values, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdBetween(String value1, String value2) {
            addCriterion("c_trace_id between", value1, value2, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCTraceIdNotBetween(String value1, String value2) {
            addCriterion("c_trace_id not between", value1, value2, "cTraceId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNull() {
            addCriterion("c_phone is null");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNotNull() {
            addCriterion("c_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCPhoneEqualTo(String value) {
            addCriterion("c_phone =", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotEqualTo(String value) {
            addCriterion("c_phone <>", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThan(String value) {
            addCriterion("c_phone >", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_phone >=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThan(String value) {
            addCriterion("c_phone <", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_phone <=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLike(String value) {
            addCriterion("c_phone like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotLike(String value) {
            addCriterion("c_phone not like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneIn(List<String> values) {
            addCriterion("c_phone in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotIn(List<String> values) {
            addCriterion("c_phone not in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneBetween(String value1, String value2) {
            addCriterion("c_phone between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotBetween(String value1, String value2) {
            addCriterion("c_phone not between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCIdCardIsNull() {
            addCriterion("c_id_card is null");
            return (Criteria) this;
        }

        public Criteria andCIdCardIsNotNull() {
            addCriterion("c_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andCIdCardEqualTo(String value) {
            addCriterion("c_id_card =", value, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardNotEqualTo(String value) {
            addCriterion("c_id_card <>", value, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardGreaterThan(String value) {
            addCriterion("c_id_card >", value, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("c_id_card >=", value, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardLessThan(String value) {
            addCriterion("c_id_card <", value, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardLessThanOrEqualTo(String value) {
            addCriterion("c_id_card <=", value, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardLike(String value) {
            addCriterion("c_id_card like", value, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardNotLike(String value) {
            addCriterion("c_id_card not like", value, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardIn(List<String> values) {
            addCriterion("c_id_card in", values, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardNotIn(List<String> values) {
            addCriterion("c_id_card not in", values, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardBetween(String value1, String value2) {
            addCriterion("c_id_card between", value1, value2, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCIdCardNotBetween(String value1, String value2) {
            addCriterion("c_id_card not between", value1, value2, "cIdCard");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeIsNull() {
            addCriterion("c_inner_type is null");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeIsNotNull() {
            addCriterion("c_inner_type is not null");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeEqualTo(String value) {
            addCriterion("c_inner_type =", value, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeNotEqualTo(String value) {
            addCriterion("c_inner_type <>", value, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeGreaterThan(String value) {
            addCriterion("c_inner_type >", value, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_inner_type >=", value, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeLessThan(String value) {
            addCriterion("c_inner_type <", value, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeLessThanOrEqualTo(String value) {
            addCriterion("c_inner_type <=", value, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeLike(String value) {
            addCriterion("c_inner_type like", value, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeNotLike(String value) {
            addCriterion("c_inner_type not like", value, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeIn(List<String> values) {
            addCriterion("c_inner_type in", values, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeNotIn(List<String> values) {
            addCriterion("c_inner_type not in", values, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeBetween(String value1, String value2) {
            addCriterion("c_inner_type between", value1, value2, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCInnerTypeNotBetween(String value1, String value2) {
            addCriterion("c_inner_type not between", value1, value2, "cInnerType");
            return (Criteria) this;
        }

        public Criteria andCCodeIsNull() {
            addCriterion("c_code is null");
            return (Criteria) this;
        }

        public Criteria andCCodeIsNotNull() {
            addCriterion("c_code is not null");
            return (Criteria) this;
        }

        public Criteria andCCodeEqualTo(String value) {
            addCriterion("c_code =", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeNotEqualTo(String value) {
            addCriterion("c_code <>", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeGreaterThan(String value) {
            addCriterion("c_code >", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_code >=", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeLessThan(String value) {
            addCriterion("c_code <", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeLessThanOrEqualTo(String value) {
            addCriterion("c_code <=", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeLike(String value) {
            addCriterion("c_code like", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeNotLike(String value) {
            addCriterion("c_code not like", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeIn(List<String> values) {
            addCriterion("c_code in", values, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeNotIn(List<String> values) {
            addCriterion("c_code not in", values, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeBetween(String value1, String value2) {
            addCriterion("c_code between", value1, value2, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeNotBetween(String value1, String value2) {
            addCriterion("c_code not between", value1, value2, "cCode");
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

        public Criteria andCRslCodeIsNull() {
            addCriterion("c_rsl_code is null");
            return (Criteria) this;
        }

        public Criteria andCRslCodeIsNotNull() {
            addCriterion("c_rsl_code is not null");
            return (Criteria) this;
        }

        public Criteria andCRslCodeEqualTo(String value) {
            addCriterion("c_rsl_code =", value, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeNotEqualTo(String value) {
            addCriterion("c_rsl_code <>", value, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeGreaterThan(String value) {
            addCriterion("c_rsl_code >", value, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_rsl_code >=", value, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeLessThan(String value) {
            addCriterion("c_rsl_code <", value, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeLessThanOrEqualTo(String value) {
            addCriterion("c_rsl_code <=", value, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeLike(String value) {
            addCriterion("c_rsl_code like", value, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeNotLike(String value) {
            addCriterion("c_rsl_code not like", value, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeIn(List<String> values) {
            addCriterion("c_rsl_code in", values, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeNotIn(List<String> values) {
            addCriterion("c_rsl_code not in", values, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeBetween(String value1, String value2) {
            addCriterion("c_rsl_code between", value1, value2, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslCodeNotBetween(String value1, String value2) {
            addCriterion("c_rsl_code not between", value1, value2, "cRslCode");
            return (Criteria) this;
        }

        public Criteria andCRslDescIsNull() {
            addCriterion("c_rsl_desc is null");
            return (Criteria) this;
        }

        public Criteria andCRslDescIsNotNull() {
            addCriterion("c_rsl_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCRslDescEqualTo(String value) {
            addCriterion("c_rsl_desc =", value, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescNotEqualTo(String value) {
            addCriterion("c_rsl_desc <>", value, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescGreaterThan(String value) {
            addCriterion("c_rsl_desc >", value, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescGreaterThanOrEqualTo(String value) {
            addCriterion("c_rsl_desc >=", value, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescLessThan(String value) {
            addCriterion("c_rsl_desc <", value, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescLessThanOrEqualTo(String value) {
            addCriterion("c_rsl_desc <=", value, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescLike(String value) {
            addCriterion("c_rsl_desc like", value, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescNotLike(String value) {
            addCriterion("c_rsl_desc not like", value, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescIn(List<String> values) {
            addCriterion("c_rsl_desc in", values, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescNotIn(List<String> values) {
            addCriterion("c_rsl_desc not in", values, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescBetween(String value1, String value2) {
            addCriterion("c_rsl_desc between", value1, value2, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCRslDescNotBetween(String value1, String value2) {
            addCriterion("c_rsl_desc not between", value1, value2, "cRslDesc");
            return (Criteria) this;
        }

        public Criteria andCMsgIsNull() {
            addCriterion("c_msg is null");
            return (Criteria) this;
        }

        public Criteria andCMsgIsNotNull() {
            addCriterion("c_msg is not null");
            return (Criteria) this;
        }

        public Criteria andCMsgEqualTo(String value) {
            addCriterion("c_msg =", value, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgNotEqualTo(String value) {
            addCriterion("c_msg <>", value, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgGreaterThan(String value) {
            addCriterion("c_msg >", value, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgGreaterThanOrEqualTo(String value) {
            addCriterion("c_msg >=", value, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgLessThan(String value) {
            addCriterion("c_msg <", value, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgLessThanOrEqualTo(String value) {
            addCriterion("c_msg <=", value, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgLike(String value) {
            addCriterion("c_msg like", value, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgNotLike(String value) {
            addCriterion("c_msg not like", value, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgIn(List<String> values) {
            addCriterion("c_msg in", values, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgNotIn(List<String> values) {
            addCriterion("c_msg not in", values, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgBetween(String value1, String value2) {
            addCriterion("c_msg between", value1, value2, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCMsgNotBetween(String value1, String value2) {
            addCriterion("c_msg not between", value1, value2, "cMsg");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNull() {
            addCriterion("c_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNotNull() {
            addCriterion("c_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeEqualTo(Date value) {
            addCriterion("c_create_time =", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotEqualTo(Date value) {
            addCriterion("c_create_time <>", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThan(Date value) {
            addCriterion("c_create_time >", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_create_time >=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThan(Date value) {
            addCriterion("c_create_time <", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_create_time <=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIn(List<Date> values) {
            addCriterion("c_create_time in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotIn(List<Date> values) {
            addCriterion("c_create_time not in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeBetween(Date value1, Date value2) {
            addCriterion("c_create_time between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_create_time not between", value1, value2, "cCreateTime");
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