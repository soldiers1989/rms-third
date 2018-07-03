package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdGongpingjiaDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdGongpingjiaDataExample() {
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

        public Criteria andCLicensePlateNumIsNull() {
            addCriterion("c_license_plate_num is null");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumIsNotNull() {
            addCriterion("c_license_plate_num is not null");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumEqualTo(String value) {
            addCriterion("c_license_plate_num =", value, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumNotEqualTo(String value) {
            addCriterion("c_license_plate_num <>", value, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumGreaterThan(String value) {
            addCriterion("c_license_plate_num >", value, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_license_plate_num >=", value, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumLessThan(String value) {
            addCriterion("c_license_plate_num <", value, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumLessThanOrEqualTo(String value) {
            addCriterion("c_license_plate_num <=", value, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumLike(String value) {
            addCriterion("c_license_plate_num like", value, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumNotLike(String value) {
            addCriterion("c_license_plate_num not like", value, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumIn(List<String> values) {
            addCriterion("c_license_plate_num in", values, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumNotIn(List<String> values) {
            addCriterion("c_license_plate_num not in", values, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumBetween(String value1, String value2) {
            addCriterion("c_license_plate_num between", value1, value2, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCLicensePlateNumNotBetween(String value1, String value2) {
            addCriterion("c_license_plate_num not between", value1, value2, "cLicensePlateNum");
            return (Criteria) this;
        }

        public Criteria andCVinIsNull() {
            addCriterion("c_vin is null");
            return (Criteria) this;
        }

        public Criteria andCVinIsNotNull() {
            addCriterion("c_vin is not null");
            return (Criteria) this;
        }

        public Criteria andCVinEqualTo(String value) {
            addCriterion("c_vin =", value, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinNotEqualTo(String value) {
            addCriterion("c_vin <>", value, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinGreaterThan(String value) {
            addCriterion("c_vin >", value, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinGreaterThanOrEqualTo(String value) {
            addCriterion("c_vin >=", value, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinLessThan(String value) {
            addCriterion("c_vin <", value, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinLessThanOrEqualTo(String value) {
            addCriterion("c_vin <=", value, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinLike(String value) {
            addCriterion("c_vin like", value, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinNotLike(String value) {
            addCriterion("c_vin not like", value, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinIn(List<String> values) {
            addCriterion("c_vin in", values, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinNotIn(List<String> values) {
            addCriterion("c_vin not in", values, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinBetween(String value1, String value2) {
            addCriterion("c_vin between", value1, value2, "cVin");
            return (Criteria) this;
        }

        public Criteria andCVinNotBetween(String value1, String value2) {
            addCriterion("c_vin not between", value1, value2, "cVin");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderIsNull() {
            addCriterion("c_license_plat_header is null");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderIsNotNull() {
            addCriterion("c_license_plat_header is not null");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderEqualTo(String value) {
            addCriterion("c_license_plat_header =", value, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderNotEqualTo(String value) {
            addCriterion("c_license_plat_header <>", value, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderGreaterThan(String value) {
            addCriterion("c_license_plat_header >", value, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("c_license_plat_header >=", value, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderLessThan(String value) {
            addCriterion("c_license_plat_header <", value, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderLessThanOrEqualTo(String value) {
            addCriterion("c_license_plat_header <=", value, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderLike(String value) {
            addCriterion("c_license_plat_header like", value, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderNotLike(String value) {
            addCriterion("c_license_plat_header not like", value, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderIn(List<String> values) {
            addCriterion("c_license_plat_header in", values, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderNotIn(List<String> values) {
            addCriterion("c_license_plat_header not in", values, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderBetween(String value1, String value2) {
            addCriterion("c_license_plat_header between", value1, value2, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCLicensePlatHeaderNotBetween(String value1, String value2) {
            addCriterion("c_license_plat_header not between", value1, value2, "cLicensePlatHeader");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNull() {
            addCriterion("c_status is null");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNotNull() {
            addCriterion("c_status is not null");
            return (Criteria) this;
        }

        public Criteria andCStatusEqualTo(String value) {
            addCriterion("c_status =", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotEqualTo(String value) {
            addCriterion("c_status <>", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThan(String value) {
            addCriterion("c_status >", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThanOrEqualTo(String value) {
            addCriterion("c_status >=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThan(String value) {
            addCriterion("c_status <", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThanOrEqualTo(String value) {
            addCriterion("c_status <=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLike(String value) {
            addCriterion("c_status like", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotLike(String value) {
            addCriterion("c_status not like", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusIn(List<String> values) {
            addCriterion("c_status in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotIn(List<String> values) {
            addCriterion("c_status not in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusBetween(String value1, String value2) {
            addCriterion("c_status between", value1, value2, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotBetween(String value1, String value2) {
            addCriterion("c_status not between", value1, value2, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCMessageIsNull() {
            addCriterion("c_message is null");
            return (Criteria) this;
        }

        public Criteria andCMessageIsNotNull() {
            addCriterion("c_message is not null");
            return (Criteria) this;
        }

        public Criteria andCMessageEqualTo(String value) {
            addCriterion("c_message =", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotEqualTo(String value) {
            addCriterion("c_message <>", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageGreaterThan(String value) {
            addCriterion("c_message >", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageGreaterThanOrEqualTo(String value) {
            addCriterion("c_message >=", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLessThan(String value) {
            addCriterion("c_message <", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLessThanOrEqualTo(String value) {
            addCriterion("c_message <=", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLike(String value) {
            addCriterion("c_message like", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotLike(String value) {
            addCriterion("c_message not like", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageIn(List<String> values) {
            addCriterion("c_message in", values, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotIn(List<String> values) {
            addCriterion("c_message not in", values, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageBetween(String value1, String value2) {
            addCriterion("c_message between", value1, value2, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotBetween(String value1, String value2) {
            addCriterion("c_message not between", value1, value2, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceIsNull() {
            addCriterion("c_min_sell_price is null");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceIsNotNull() {
            addCriterion("c_min_sell_price is not null");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceEqualTo(String value) {
            addCriterion("c_min_sell_price =", value, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceNotEqualTo(String value) {
            addCriterion("c_min_sell_price <>", value, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceGreaterThan(String value) {
            addCriterion("c_min_sell_price >", value, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_min_sell_price >=", value, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceLessThan(String value) {
            addCriterion("c_min_sell_price <", value, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceLessThanOrEqualTo(String value) {
            addCriterion("c_min_sell_price <=", value, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceLike(String value) {
            addCriterion("c_min_sell_price like", value, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceNotLike(String value) {
            addCriterion("c_min_sell_price not like", value, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceIn(List<String> values) {
            addCriterion("c_min_sell_price in", values, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceNotIn(List<String> values) {
            addCriterion("c_min_sell_price not in", values, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceBetween(String value1, String value2) {
            addCriterion("c_min_sell_price between", value1, value2, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMinSellPriceNotBetween(String value1, String value2) {
            addCriterion("c_min_sell_price not between", value1, value2, "cMinSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceIsNull() {
            addCriterion("c_sell_price is null");
            return (Criteria) this;
        }

        public Criteria andCSellPriceIsNotNull() {
            addCriterion("c_sell_price is not null");
            return (Criteria) this;
        }

        public Criteria andCSellPriceEqualTo(String value) {
            addCriterion("c_sell_price =", value, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceNotEqualTo(String value) {
            addCriterion("c_sell_price <>", value, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceGreaterThan(String value) {
            addCriterion("c_sell_price >", value, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_sell_price >=", value, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceLessThan(String value) {
            addCriterion("c_sell_price <", value, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceLessThanOrEqualTo(String value) {
            addCriterion("c_sell_price <=", value, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceLike(String value) {
            addCriterion("c_sell_price like", value, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceNotLike(String value) {
            addCriterion("c_sell_price not like", value, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceIn(List<String> values) {
            addCriterion("c_sell_price in", values, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceNotIn(List<String> values) {
            addCriterion("c_sell_price not in", values, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceBetween(String value1, String value2) {
            addCriterion("c_sell_price between", value1, value2, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellPriceNotBetween(String value1, String value2) {
            addCriterion("c_sell_price not between", value1, value2, "cSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceIsNull() {
            addCriterion("c_max_sell_price is null");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceIsNotNull() {
            addCriterion("c_max_sell_price is not null");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceEqualTo(String value) {
            addCriterion("c_max_sell_price =", value, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceNotEqualTo(String value) {
            addCriterion("c_max_sell_price <>", value, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceGreaterThan(String value) {
            addCriterion("c_max_sell_price >", value, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_max_sell_price >=", value, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceLessThan(String value) {
            addCriterion("c_max_sell_price <", value, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceLessThanOrEqualTo(String value) {
            addCriterion("c_max_sell_price <=", value, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceLike(String value) {
            addCriterion("c_max_sell_price like", value, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceNotLike(String value) {
            addCriterion("c_max_sell_price not like", value, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceIn(List<String> values) {
            addCriterion("c_max_sell_price in", values, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceNotIn(List<String> values) {
            addCriterion("c_max_sell_price not in", values, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceBetween(String value1, String value2) {
            addCriterion("c_max_sell_price between", value1, value2, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxSellPriceNotBetween(String value1, String value2) {
            addCriterion("c_max_sell_price not between", value1, value2, "cMaxSellPrice");
            return (Criteria) this;
        }

        public Criteria andCSellUrlIsNull() {
            addCriterion("c_sell_url is null");
            return (Criteria) this;
        }

        public Criteria andCSellUrlIsNotNull() {
            addCriterion("c_sell_url is not null");
            return (Criteria) this;
        }

        public Criteria andCSellUrlEqualTo(String value) {
            addCriterion("c_sell_url =", value, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlNotEqualTo(String value) {
            addCriterion("c_sell_url <>", value, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlGreaterThan(String value) {
            addCriterion("c_sell_url >", value, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_sell_url >=", value, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlLessThan(String value) {
            addCriterion("c_sell_url <", value, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlLessThanOrEqualTo(String value) {
            addCriterion("c_sell_url <=", value, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlLike(String value) {
            addCriterion("c_sell_url like", value, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlNotLike(String value) {
            addCriterion("c_sell_url not like", value, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlIn(List<String> values) {
            addCriterion("c_sell_url in", values, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlNotIn(List<String> values) {
            addCriterion("c_sell_url not in", values, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlBetween(String value1, String value2) {
            addCriterion("c_sell_url between", value1, value2, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCSellUrlNotBetween(String value1, String value2) {
            addCriterion("c_sell_url not between", value1, value2, "cSellUrl");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceIsNull() {
            addCriterion("c_min_private_price is null");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceIsNotNull() {
            addCriterion("c_min_private_price is not null");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceEqualTo(String value) {
            addCriterion("c_min_private_price =", value, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceNotEqualTo(String value) {
            addCriterion("c_min_private_price <>", value, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceGreaterThan(String value) {
            addCriterion("c_min_private_price >", value, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_min_private_price >=", value, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceLessThan(String value) {
            addCriterion("c_min_private_price <", value, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceLessThanOrEqualTo(String value) {
            addCriterion("c_min_private_price <=", value, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceLike(String value) {
            addCriterion("c_min_private_price like", value, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceNotLike(String value) {
            addCriterion("c_min_private_price not like", value, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceIn(List<String> values) {
            addCriterion("c_min_private_price in", values, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceNotIn(List<String> values) {
            addCriterion("c_min_private_price not in", values, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceBetween(String value1, String value2) {
            addCriterion("c_min_private_price between", value1, value2, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMinPrivatePriceNotBetween(String value1, String value2) {
            addCriterion("c_min_private_price not between", value1, value2, "cMinPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceIsNull() {
            addCriterion("c_private_price is null");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceIsNotNull() {
            addCriterion("c_private_price is not null");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceEqualTo(String value) {
            addCriterion("c_private_price =", value, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceNotEqualTo(String value) {
            addCriterion("c_private_price <>", value, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceGreaterThan(String value) {
            addCriterion("c_private_price >", value, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_private_price >=", value, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceLessThan(String value) {
            addCriterion("c_private_price <", value, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceLessThanOrEqualTo(String value) {
            addCriterion("c_private_price <=", value, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceLike(String value) {
            addCriterion("c_private_price like", value, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceNotLike(String value) {
            addCriterion("c_private_price not like", value, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceIn(List<String> values) {
            addCriterion("c_private_price in", values, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceNotIn(List<String> values) {
            addCriterion("c_private_price not in", values, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceBetween(String value1, String value2) {
            addCriterion("c_private_price between", value1, value2, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivatePriceNotBetween(String value1, String value2) {
            addCriterion("c_private_price not between", value1, value2, "cPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceIsNull() {
            addCriterion("c_max_private_price is null");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceIsNotNull() {
            addCriterion("c_max_private_price is not null");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceEqualTo(String value) {
            addCriterion("c_max_private_price =", value, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceNotEqualTo(String value) {
            addCriterion("c_max_private_price <>", value, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceGreaterThan(String value) {
            addCriterion("c_max_private_price >", value, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_max_private_price >=", value, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceLessThan(String value) {
            addCriterion("c_max_private_price <", value, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceLessThanOrEqualTo(String value) {
            addCriterion("c_max_private_price <=", value, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceLike(String value) {
            addCriterion("c_max_private_price like", value, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceNotLike(String value) {
            addCriterion("c_max_private_price not like", value, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceIn(List<String> values) {
            addCriterion("c_max_private_price in", values, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceNotIn(List<String> values) {
            addCriterion("c_max_private_price not in", values, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceBetween(String value1, String value2) {
            addCriterion("c_max_private_price between", value1, value2, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCMaxPrivatePriceNotBetween(String value1, String value2) {
            addCriterion("c_max_private_price not between", value1, value2, "cMaxPrivatePrice");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlIsNull() {
            addCriterion("c_private_url is null");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlIsNotNull() {
            addCriterion("c_private_url is not null");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlEqualTo(String value) {
            addCriterion("c_private_url =", value, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlNotEqualTo(String value) {
            addCriterion("c_private_url <>", value, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlGreaterThan(String value) {
            addCriterion("c_private_url >", value, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_private_url >=", value, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlLessThan(String value) {
            addCriterion("c_private_url <", value, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlLessThanOrEqualTo(String value) {
            addCriterion("c_private_url <=", value, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlLike(String value) {
            addCriterion("c_private_url like", value, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlNotLike(String value) {
            addCriterion("c_private_url not like", value, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlIn(List<String> values) {
            addCriterion("c_private_url in", values, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlNotIn(List<String> values) {
            addCriterion("c_private_url not in", values, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlBetween(String value1, String value2) {
            addCriterion("c_private_url between", value1, value2, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCPrivateUrlNotBetween(String value1, String value2) {
            addCriterion("c_private_url not between", value1, value2, "cPrivateUrl");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceIsNull() {
            addCriterion("c_min_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceIsNotNull() {
            addCriterion("c_min_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceEqualTo(String value) {
            addCriterion("c_min_buy_price =", value, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceNotEqualTo(String value) {
            addCriterion("c_min_buy_price <>", value, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceGreaterThan(String value) {
            addCriterion("c_min_buy_price >", value, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_min_buy_price >=", value, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceLessThan(String value) {
            addCriterion("c_min_buy_price <", value, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceLessThanOrEqualTo(String value) {
            addCriterion("c_min_buy_price <=", value, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceLike(String value) {
            addCriterion("c_min_buy_price like", value, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceNotLike(String value) {
            addCriterion("c_min_buy_price not like", value, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceIn(List<String> values) {
            addCriterion("c_min_buy_price in", values, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceNotIn(List<String> values) {
            addCriterion("c_min_buy_price not in", values, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceBetween(String value1, String value2) {
            addCriterion("c_min_buy_price between", value1, value2, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMinBuyPriceNotBetween(String value1, String value2) {
            addCriterion("c_min_buy_price not between", value1, value2, "cMinBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceIsNull() {
            addCriterion("c_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceIsNotNull() {
            addCriterion("c_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceEqualTo(String value) {
            addCriterion("c_buy_price =", value, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceNotEqualTo(String value) {
            addCriterion("c_buy_price <>", value, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceGreaterThan(String value) {
            addCriterion("c_buy_price >", value, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_buy_price >=", value, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceLessThan(String value) {
            addCriterion("c_buy_price <", value, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceLessThanOrEqualTo(String value) {
            addCriterion("c_buy_price <=", value, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceLike(String value) {
            addCriterion("c_buy_price like", value, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceNotLike(String value) {
            addCriterion("c_buy_price not like", value, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceIn(List<String> values) {
            addCriterion("c_buy_price in", values, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceNotIn(List<String> values) {
            addCriterion("c_buy_price not in", values, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceBetween(String value1, String value2) {
            addCriterion("c_buy_price between", value1, value2, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyPriceNotBetween(String value1, String value2) {
            addCriterion("c_buy_price not between", value1, value2, "cBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceIsNull() {
            addCriterion("c_max_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceIsNotNull() {
            addCriterion("c_max_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceEqualTo(String value) {
            addCriterion("c_max_buy_price =", value, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceNotEqualTo(String value) {
            addCriterion("c_max_buy_price <>", value, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceGreaterThan(String value) {
            addCriterion("c_max_buy_price >", value, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_max_buy_price >=", value, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceLessThan(String value) {
            addCriterion("c_max_buy_price <", value, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceLessThanOrEqualTo(String value) {
            addCriterion("c_max_buy_price <=", value, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceLike(String value) {
            addCriterion("c_max_buy_price like", value, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceNotLike(String value) {
            addCriterion("c_max_buy_price not like", value, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceIn(List<String> values) {
            addCriterion("c_max_buy_price in", values, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceNotIn(List<String> values) {
            addCriterion("c_max_buy_price not in", values, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceBetween(String value1, String value2) {
            addCriterion("c_max_buy_price between", value1, value2, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCMaxBuyPriceNotBetween(String value1, String value2) {
            addCriterion("c_max_buy_price not between", value1, value2, "cMaxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlIsNull() {
            addCriterion("c_buy_url is null");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlIsNotNull() {
            addCriterion("c_buy_url is not null");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlEqualTo(String value) {
            addCriterion("c_buy_url =", value, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlNotEqualTo(String value) {
            addCriterion("c_buy_url <>", value, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlGreaterThan(String value) {
            addCriterion("c_buy_url >", value, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_buy_url >=", value, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlLessThan(String value) {
            addCriterion("c_buy_url <", value, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlLessThanOrEqualTo(String value) {
            addCriterion("c_buy_url <=", value, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlLike(String value) {
            addCriterion("c_buy_url like", value, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlNotLike(String value) {
            addCriterion("c_buy_url not like", value, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlIn(List<String> values) {
            addCriterion("c_buy_url in", values, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlNotIn(List<String> values) {
            addCriterion("c_buy_url not in", values, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlBetween(String value1, String value2) {
            addCriterion("c_buy_url between", value1, value2, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCBuyUrlNotBetween(String value1, String value2) {
            addCriterion("c_buy_url not between", value1, value2, "cBuyUrl");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugIsNull() {
            addCriterion("c_model_detail_slug is null");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugIsNotNull() {
            addCriterion("c_model_detail_slug is not null");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugEqualTo(String value) {
            addCriterion("c_model_detail_slug =", value, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugNotEqualTo(String value) {
            addCriterion("c_model_detail_slug <>", value, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugGreaterThan(String value) {
            addCriterion("c_model_detail_slug >", value, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugGreaterThanOrEqualTo(String value) {
            addCriterion("c_model_detail_slug >=", value, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugLessThan(String value) {
            addCriterion("c_model_detail_slug <", value, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugLessThanOrEqualTo(String value) {
            addCriterion("c_model_detail_slug <=", value, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugLike(String value) {
            addCriterion("c_model_detail_slug like", value, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugNotLike(String value) {
            addCriterion("c_model_detail_slug not like", value, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugIn(List<String> values) {
            addCriterion("c_model_detail_slug in", values, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugNotIn(List<String> values) {
            addCriterion("c_model_detail_slug not in", values, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugBetween(String value1, String value2) {
            addCriterion("c_model_detail_slug between", value1, value2, "cModelDetailSlug");
            return (Criteria) this;
        }

        public Criteria andCModelDetailSlugNotBetween(String value1, String value2) {
            addCriterion("c_model_detail_slug not between", value1, value2, "cModelDetailSlug");
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