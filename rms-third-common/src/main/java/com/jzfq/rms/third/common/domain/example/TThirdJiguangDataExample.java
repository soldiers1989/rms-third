package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdJiguangDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdJiguangDataExample() {
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

        public Criteria andCOverduescoreIsNull() {
            addCriterion("c_overdueScore is null");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreIsNotNull() {
            addCriterion("c_overdueScore is not null");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreEqualTo(String value) {
            addCriterion("c_overdueScore =", value, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreNotEqualTo(String value) {
            addCriterion("c_overdueScore <>", value, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreGreaterThan(String value) {
            addCriterion("c_overdueScore >", value, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_overdueScore >=", value, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreLessThan(String value) {
            addCriterion("c_overdueScore <", value, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreLessThanOrEqualTo(String value) {
            addCriterion("c_overdueScore <=", value, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreLike(String value) {
            addCriterion("c_overdueScore like", value, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreNotLike(String value) {
            addCriterion("c_overdueScore not like", value, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreIn(List<String> values) {
            addCriterion("c_overdueScore in", values, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreNotIn(List<String> values) {
            addCriterion("c_overdueScore not in", values, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreBetween(String value1, String value2) {
            addCriterion("c_overdueScore between", value1, value2, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCOverduescoreNotBetween(String value1, String value2) {
            addCriterion("c_overdueScore not between", value1, value2, "cOverduescore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreIsNull() {
            addCriterion("c_contractScore is null");
            return (Criteria) this;
        }

        public Criteria andCContractscoreIsNotNull() {
            addCriterion("c_contractScore is not null");
            return (Criteria) this;
        }

        public Criteria andCContractscoreEqualTo(String value) {
            addCriterion("c_contractScore =", value, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreNotEqualTo(String value) {
            addCriterion("c_contractScore <>", value, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreGreaterThan(String value) {
            addCriterion("c_contractScore >", value, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_contractScore >=", value, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreLessThan(String value) {
            addCriterion("c_contractScore <", value, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreLessThanOrEqualTo(String value) {
            addCriterion("c_contractScore <=", value, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreLike(String value) {
            addCriterion("c_contractScore like", value, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreNotLike(String value) {
            addCriterion("c_contractScore not like", value, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreIn(List<String> values) {
            addCriterion("c_contractScore in", values, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreNotIn(List<String> values) {
            addCriterion("c_contractScore not in", values, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreBetween(String value1, String value2) {
            addCriterion("c_contractScore between", value1, value2, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCContractscoreNotBetween(String value1, String value2) {
            addCriterion("c_contractScore not between", value1, value2, "cContractscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreIsNull() {
            addCriterion("c_riskScore is null");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreIsNotNull() {
            addCriterion("c_riskScore is not null");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreEqualTo(String value) {
            addCriterion("c_riskScore =", value, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreNotEqualTo(String value) {
            addCriterion("c_riskScore <>", value, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreGreaterThan(String value) {
            addCriterion("c_riskScore >", value, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_riskScore >=", value, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreLessThan(String value) {
            addCriterion("c_riskScore <", value, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreLessThanOrEqualTo(String value) {
            addCriterion("c_riskScore <=", value, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreLike(String value) {
            addCriterion("c_riskScore like", value, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreNotLike(String value) {
            addCriterion("c_riskScore not like", value, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreIn(List<String> values) {
            addCriterion("c_riskScore in", values, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreNotIn(List<String> values) {
            addCriterion("c_riskScore not in", values, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreBetween(String value1, String value2) {
            addCriterion("c_riskScore between", value1, value2, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCRiskscoreNotBetween(String value1, String value2) {
            addCriterion("c_riskScore not between", value1, value2, "cRiskscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreIsNull() {
            addCriterion("c_totalScore is null");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreIsNotNull() {
            addCriterion("c_totalScore is not null");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreEqualTo(String value) {
            addCriterion("c_totalScore =", value, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreNotEqualTo(String value) {
            addCriterion("c_totalScore <>", value, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreGreaterThan(String value) {
            addCriterion("c_totalScore >", value, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_totalScore >=", value, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreLessThan(String value) {
            addCriterion("c_totalScore <", value, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreLessThanOrEqualTo(String value) {
            addCriterion("c_totalScore <=", value, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreLike(String value) {
            addCriterion("c_totalScore like", value, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreNotLike(String value) {
            addCriterion("c_totalScore not like", value, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreIn(List<String> values) {
            addCriterion("c_totalScore in", values, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreNotIn(List<String> values) {
            addCriterion("c_totalScore not in", values, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreBetween(String value1, String value2) {
            addCriterion("c_totalScore between", value1, value2, "cTotalscore");
            return (Criteria) this;
        }

        public Criteria andCTotalscoreNotBetween(String value1, String value2) {
            addCriterion("c_totalScore not between", value1, value2, "cTotalscore");
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