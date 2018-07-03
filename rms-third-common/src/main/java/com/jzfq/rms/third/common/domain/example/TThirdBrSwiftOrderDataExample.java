package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdBrSwiftOrderDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdBrSwiftOrderDataExample() {
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

        public Criteria andCSwiftNumberIsNull() {
            addCriterion("c_swift_number is null");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberIsNotNull() {
            addCriterion("c_swift_number is not null");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberEqualTo(String value) {
            addCriterion("c_swift_number =", value, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberNotEqualTo(String value) {
            addCriterion("c_swift_number <>", value, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberGreaterThan(String value) {
            addCriterion("c_swift_number >", value, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberGreaterThanOrEqualTo(String value) {
            addCriterion("c_swift_number >=", value, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberLessThan(String value) {
            addCriterion("c_swift_number <", value, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberLessThanOrEqualTo(String value) {
            addCriterion("c_swift_number <=", value, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberLike(String value) {
            addCriterion("c_swift_number like", value, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberNotLike(String value) {
            addCriterion("c_swift_number not like", value, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberIn(List<String> values) {
            addCriterion("c_swift_number in", values, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberNotIn(List<String> values) {
            addCriterion("c_swift_number not in", values, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberBetween(String value1, String value2) {
            addCriterion("c_swift_number between", value1, value2, "cSwiftNumber");
            return (Criteria) this;
        }

        public Criteria andCSwiftNumberNotBetween(String value1, String value2) {
            addCriterion("c_swift_number not between", value1, value2, "cSwiftNumber");
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