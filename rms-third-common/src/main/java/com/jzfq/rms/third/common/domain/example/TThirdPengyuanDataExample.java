package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdPengyuanDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdPengyuanDataExample() {
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

        public Criteria andCLicenseNoIsNull() {
            addCriterion("c_license_no is null");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoIsNotNull() {
            addCriterion("c_license_no is not null");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoEqualTo(String value) {
            addCriterion("c_license_no =", value, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoNotEqualTo(String value) {
            addCriterion("c_license_no <>", value, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoGreaterThan(String value) {
            addCriterion("c_license_no >", value, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("c_license_no >=", value, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoLessThan(String value) {
            addCriterion("c_license_no <", value, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("c_license_no <=", value, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoLike(String value) {
            addCriterion("c_license_no like", value, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoNotLike(String value) {
            addCriterion("c_license_no not like", value, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoIn(List<String> values) {
            addCriterion("c_license_no in", values, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoNotIn(List<String> values) {
            addCriterion("c_license_no not in", values, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoBetween(String value1, String value2) {
            addCriterion("c_license_no between", value1, value2, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoNotBetween(String value1, String value2) {
            addCriterion("c_license_no not between", value1, value2, "cLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCCarTypeIsNull() {
            addCriterion("c_car_type is null");
            return (Criteria) this;
        }

        public Criteria andCCarTypeIsNotNull() {
            addCriterion("c_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCCarTypeEqualTo(String value) {
            addCriterion("c_car_type =", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeNotEqualTo(String value) {
            addCriterion("c_car_type <>", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeGreaterThan(String value) {
            addCriterion("c_car_type >", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_car_type >=", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeLessThan(String value) {
            addCriterion("c_car_type <", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeLessThanOrEqualTo(String value) {
            addCriterion("c_car_type <=", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeLike(String value) {
            addCriterion("c_car_type like", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeNotLike(String value) {
            addCriterion("c_car_type not like", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeIn(List<String> values) {
            addCriterion("c_car_type in", values, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeNotIn(List<String> values) {
            addCriterion("c_car_type not in", values, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeBetween(String value1, String value2) {
            addCriterion("c_car_type between", value1, value2, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeNotBetween(String value1, String value2) {
            addCriterion("c_car_type not between", value1, value2, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdIsNull() {
            addCriterion("c_query_reason_id is null");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdIsNotNull() {
            addCriterion("c_query_reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdEqualTo(String value) {
            addCriterion("c_query_reason_id =", value, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdNotEqualTo(String value) {
            addCriterion("c_query_reason_id <>", value, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdGreaterThan(String value) {
            addCriterion("c_query_reason_id >", value, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_query_reason_id >=", value, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdLessThan(String value) {
            addCriterion("c_query_reason_id <", value, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdLessThanOrEqualTo(String value) {
            addCriterion("c_query_reason_id <=", value, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdLike(String value) {
            addCriterion("c_query_reason_id like", value, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdNotLike(String value) {
            addCriterion("c_query_reason_id not like", value, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdIn(List<String> values) {
            addCriterion("c_query_reason_id in", values, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdNotIn(List<String> values) {
            addCriterion("c_query_reason_id not in", values, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdBetween(String value1, String value2) {
            addCriterion("c_query_reason_id between", value1, value2, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCQueryReasonIdNotBetween(String value1, String value2) {
            addCriterion("c_query_reason_id not between", value1, value2, "cQueryReasonId");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsIsNull() {
            addCriterion("c_subreport_ids is null");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsIsNotNull() {
            addCriterion("c_subreport_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsEqualTo(String value) {
            addCriterion("c_subreport_ids =", value, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsNotEqualTo(String value) {
            addCriterion("c_subreport_ids <>", value, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsGreaterThan(String value) {
            addCriterion("c_subreport_ids >", value, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsGreaterThanOrEqualTo(String value) {
            addCriterion("c_subreport_ids >=", value, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsLessThan(String value) {
            addCriterion("c_subreport_ids <", value, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsLessThanOrEqualTo(String value) {
            addCriterion("c_subreport_ids <=", value, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsLike(String value) {
            addCriterion("c_subreport_ids like", value, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsNotLike(String value) {
            addCriterion("c_subreport_ids not like", value, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsIn(List<String> values) {
            addCriterion("c_subreport_ids in", values, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsNotIn(List<String> values) {
            addCriterion("c_subreport_ids not in", values, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsBetween(String value1, String value2) {
            addCriterion("c_subreport_ids between", value1, value2, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCSubreportIdsNotBetween(String value1, String value2) {
            addCriterion("c_subreport_ids not between", value1, value2, "cSubreportIds");
            return (Criteria) this;
        }

        public Criteria andCRefIdIsNull() {
            addCriterion("c_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andCRefIdIsNotNull() {
            addCriterion("c_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andCRefIdEqualTo(String value) {
            addCriterion("c_ref_id =", value, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdNotEqualTo(String value) {
            addCriterion("c_ref_id <>", value, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdGreaterThan(String value) {
            addCriterion("c_ref_id >", value, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_ref_id >=", value, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdLessThan(String value) {
            addCriterion("c_ref_id <", value, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdLessThanOrEqualTo(String value) {
            addCriterion("c_ref_id <=", value, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdLike(String value) {
            addCriterion("c_ref_id like", value, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdNotLike(String value) {
            addCriterion("c_ref_id not like", value, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdIn(List<String> values) {
            addCriterion("c_ref_id in", values, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdNotIn(List<String> values) {
            addCriterion("c_ref_id not in", values, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdBetween(String value1, String value2) {
            addCriterion("c_ref_id between", value1, value2, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCRefIdNotBetween(String value1, String value2) {
            addCriterion("c_ref_id not between", value1, value2, "cRefId");
            return (Criteria) this;
        }

        public Criteria andCBatNoIsNull() {
            addCriterion("c_bat_no is null");
            return (Criteria) this;
        }

        public Criteria andCBatNoIsNotNull() {
            addCriterion("c_bat_no is not null");
            return (Criteria) this;
        }

        public Criteria andCBatNoEqualTo(String value) {
            addCriterion("c_bat_no =", value, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoNotEqualTo(String value) {
            addCriterion("c_bat_no <>", value, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoGreaterThan(String value) {
            addCriterion("c_bat_no >", value, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoGreaterThanOrEqualTo(String value) {
            addCriterion("c_bat_no >=", value, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoLessThan(String value) {
            addCriterion("c_bat_no <", value, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoLessThanOrEqualTo(String value) {
            addCriterion("c_bat_no <=", value, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoLike(String value) {
            addCriterion("c_bat_no like", value, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoNotLike(String value) {
            addCriterion("c_bat_no not like", value, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoIn(List<String> values) {
            addCriterion("c_bat_no in", values, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoNotIn(List<String> values) {
            addCriterion("c_bat_no not in", values, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoBetween(String value1, String value2) {
            addCriterion("c_bat_no between", value1, value2, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCBatNoNotBetween(String value1, String value2) {
            addCriterion("c_bat_no not between", value1, value2, "cBatNo");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultIsNull() {
            addCriterion("c_treat_esult is null");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultIsNotNull() {
            addCriterion("c_treat_esult is not null");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultEqualTo(String value) {
            addCriterion("c_treat_esult =", value, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultNotEqualTo(String value) {
            addCriterion("c_treat_esult <>", value, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultGreaterThan(String value) {
            addCriterion("c_treat_esult >", value, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultGreaterThanOrEqualTo(String value) {
            addCriterion("c_treat_esult >=", value, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultLessThan(String value) {
            addCriterion("c_treat_esult <", value, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultLessThanOrEqualTo(String value) {
            addCriterion("c_treat_esult <=", value, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultLike(String value) {
            addCriterion("c_treat_esult like", value, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultNotLike(String value) {
            addCriterion("c_treat_esult not like", value, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultIn(List<String> values) {
            addCriterion("c_treat_esult in", values, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultNotIn(List<String> values) {
            addCriterion("c_treat_esult not in", values, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultBetween(String value1, String value2) {
            addCriterion("c_treat_esult between", value1, value2, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCTreatEsultNotBetween(String value1, String value2) {
            addCriterion("c_treat_esult not between", value1, value2, "cTreatEsult");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageIsNull() {
            addCriterion("c_error_message is null");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageIsNotNull() {
            addCriterion("c_error_message is not null");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageEqualTo(String value) {
            addCriterion("c_error_message =", value, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageNotEqualTo(String value) {
            addCriterion("c_error_message <>", value, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageGreaterThan(String value) {
            addCriterion("c_error_message >", value, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("c_error_message >=", value, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageLessThan(String value) {
            addCriterion("c_error_message <", value, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("c_error_message <=", value, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageLike(String value) {
            addCriterion("c_error_message like", value, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageNotLike(String value) {
            addCriterion("c_error_message not like", value, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageIn(List<String> values) {
            addCriterion("c_error_message in", values, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageNotIn(List<String> values) {
            addCriterion("c_error_message not in", values, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageBetween(String value1, String value2) {
            addCriterion("c_error_message between", value1, value2, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCErrorMessageNotBetween(String value1, String value2) {
            addCriterion("c_error_message not between", value1, value2, "cErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeIsNull() {
            addCriterion("c_treat_errorCode is null");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeIsNotNull() {
            addCriterion("c_treat_errorCode is not null");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeEqualTo(String value) {
            addCriterion("c_treat_errorCode =", value, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeNotEqualTo(String value) {
            addCriterion("c_treat_errorCode <>", value, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeGreaterThan(String value) {
            addCriterion("c_treat_errorCode >", value, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_treat_errorCode >=", value, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeLessThan(String value) {
            addCriterion("c_treat_errorCode <", value, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeLessThanOrEqualTo(String value) {
            addCriterion("c_treat_errorCode <=", value, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeLike(String value) {
            addCriterion("c_treat_errorCode like", value, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeNotLike(String value) {
            addCriterion("c_treat_errorCode not like", value, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeIn(List<String> values) {
            addCriterion("c_treat_errorCode in", values, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeNotIn(List<String> values) {
            addCriterion("c_treat_errorCode not in", values, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeBetween(String value1, String value2) {
            addCriterion("c_treat_errorCode between", value1, value2, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCTreatErrorcodeNotBetween(String value1, String value2) {
            addCriterion("c_treat_errorCode not between", value1, value2, "cTreatErrorcode");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultIsNull() {
            addCriterion("c_name_check_result is null");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultIsNotNull() {
            addCriterion("c_name_check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultEqualTo(String value) {
            addCriterion("c_name_check_result =", value, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultNotEqualTo(String value) {
            addCriterion("c_name_check_result <>", value, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultGreaterThan(String value) {
            addCriterion("c_name_check_result >", value, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("c_name_check_result >=", value, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultLessThan(String value) {
            addCriterion("c_name_check_result <", value, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultLessThanOrEqualTo(String value) {
            addCriterion("c_name_check_result <=", value, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultLike(String value) {
            addCriterion("c_name_check_result like", value, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultNotLike(String value) {
            addCriterion("c_name_check_result not like", value, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultIn(List<String> values) {
            addCriterion("c_name_check_result in", values, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultNotIn(List<String> values) {
            addCriterion("c_name_check_result not in", values, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultBetween(String value1, String value2) {
            addCriterion("c_name_check_result between", value1, value2, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCNameCheckResultNotBetween(String value1, String value2) {
            addCriterion("c_name_check_result not between", value1, value2, "cNameCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultIsNull() {
            addCriterion("c_document_no_check_result is null");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultIsNotNull() {
            addCriterion("c_document_no_check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultEqualTo(String value) {
            addCriterion("c_document_no_check_result =", value, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultNotEqualTo(String value) {
            addCriterion("c_document_no_check_result <>", value, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultGreaterThan(String value) {
            addCriterion("c_document_no_check_result >", value, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("c_document_no_check_result >=", value, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultLessThan(String value) {
            addCriterion("c_document_no_check_result <", value, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultLessThanOrEqualTo(String value) {
            addCriterion("c_document_no_check_result <=", value, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultLike(String value) {
            addCriterion("c_document_no_check_result like", value, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultNotLike(String value) {
            addCriterion("c_document_no_check_result not like", value, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultIn(List<String> values) {
            addCriterion("c_document_no_check_result in", values, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultNotIn(List<String> values) {
            addCriterion("c_document_no_check_result not in", values, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultBetween(String value1, String value2) {
            addCriterion("c_document_no_check_result between", value1, value2, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCDocumentNoCheckResultNotBetween(String value1, String value2) {
            addCriterion("c_document_no_check_result not between", value1, value2, "cDocumentNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultIsNull() {
            addCriterion("c_license_no_check_result is null");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultIsNotNull() {
            addCriterion("c_license_no_check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultEqualTo(String value) {
            addCriterion("c_license_no_check_result =", value, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultNotEqualTo(String value) {
            addCriterion("c_license_no_check_result <>", value, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultGreaterThan(String value) {
            addCriterion("c_license_no_check_result >", value, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("c_license_no_check_result >=", value, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultLessThan(String value) {
            addCriterion("c_license_no_check_result <", value, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultLessThanOrEqualTo(String value) {
            addCriterion("c_license_no_check_result <=", value, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultLike(String value) {
            addCriterion("c_license_no_check_result like", value, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultNotLike(String value) {
            addCriterion("c_license_no_check_result not like", value, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultIn(List<String> values) {
            addCriterion("c_license_no_check_result in", values, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultNotIn(List<String> values) {
            addCriterion("c_license_no_check_result not in", values, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultBetween(String value1, String value2) {
            addCriterion("c_license_no_check_result between", value1, value2, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCLicenseNoCheckResultNotBetween(String value1, String value2) {
            addCriterion("c_license_no_check_result not between", value1, value2, "cLicenseNoCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultIsNull() {
            addCriterion("c_car_type_check_result is null");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultIsNotNull() {
            addCriterion("c_car_type_check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultEqualTo(String value) {
            addCriterion("c_car_type_check_result =", value, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultNotEqualTo(String value) {
            addCriterion("c_car_type_check_result <>", value, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultGreaterThan(String value) {
            addCriterion("c_car_type_check_result >", value, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("c_car_type_check_result >=", value, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultLessThan(String value) {
            addCriterion("c_car_type_check_result <", value, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultLessThanOrEqualTo(String value) {
            addCriterion("c_car_type_check_result <=", value, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultLike(String value) {
            addCriterion("c_car_type_check_result like", value, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultNotLike(String value) {
            addCriterion("c_car_type_check_result not like", value, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultIn(List<String> values) {
            addCriterion("c_car_type_check_result in", values, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultNotIn(List<String> values) {
            addCriterion("c_car_type_check_result not in", values, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultBetween(String value1, String value2) {
            addCriterion("c_car_type_check_result between", value1, value2, "cCarTypeCheckResult");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCheckResultNotBetween(String value1, String value2) {
            addCriterion("c_car_type_check_result not between", value1, value2, "cCarTypeCheckResult");
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