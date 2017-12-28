package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TJieanPhoneDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TJieanPhoneDataExample() {
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

        public Criteria andCJieanIdIsNull() {
            addCriterion("c_jiean_id is null");
            return (Criteria) this;
        }

        public Criteria andCJieanIdIsNotNull() {
            addCriterion("c_jiean_id is not null");
            return (Criteria) this;
        }

        public Criteria andCJieanIdEqualTo(String value) {
            addCriterion("c_jiean_id =", value, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdNotEqualTo(String value) {
            addCriterion("c_jiean_id <>", value, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdGreaterThan(String value) {
            addCriterion("c_jiean_id >", value, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_jiean_id >=", value, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdLessThan(String value) {
            addCriterion("c_jiean_id <", value, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdLessThanOrEqualTo(String value) {
            addCriterion("c_jiean_id <=", value, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdLike(String value) {
            addCriterion("c_jiean_id like", value, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdNotLike(String value) {
            addCriterion("c_jiean_id not like", value, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdIn(List<String> values) {
            addCriterion("c_jiean_id in", values, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdNotIn(List<String> values) {
            addCriterion("c_jiean_id not in", values, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdBetween(String value1, String value2) {
            addCriterion("c_jiean_id between", value1, value2, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCJieanIdNotBetween(String value1, String value2) {
            addCriterion("c_jiean_id not between", value1, value2, "cJieanId");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNull() {
            addCriterion("c_type is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("c_type is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(String value) {
            addCriterion("c_type =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("c_type <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("c_type >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_type >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(String value) {
            addCriterion("c_type <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("c_type <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLike(String value) {
            addCriterion("c_type like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotLike(String value) {
            addCriterion("c_type not like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<String> values) {
            addCriterion("c_type in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("c_type not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("c_type between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("c_type not between", value1, value2, "cType");
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

        public Criteria andCCertcardNoIsNull() {
            addCriterion("c_certcard_no is null");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoIsNotNull() {
            addCriterion("c_certcard_no is not null");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoEqualTo(String value) {
            addCriterion("c_certcard_no =", value, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoNotEqualTo(String value) {
            addCriterion("c_certcard_no <>", value, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoGreaterThan(String value) {
            addCriterion("c_certcard_no >", value, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("c_certcard_no >=", value, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoLessThan(String value) {
            addCriterion("c_certcard_no <", value, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoLessThanOrEqualTo(String value) {
            addCriterion("c_certcard_no <=", value, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoLike(String value) {
            addCriterion("c_certcard_no like", value, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoNotLike(String value) {
            addCriterion("c_certcard_no not like", value, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoIn(List<String> values) {
            addCriterion("c_certcard_no in", values, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoNotIn(List<String> values) {
            addCriterion("c_certcard_no not in", values, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoBetween(String value1, String value2) {
            addCriterion("c_certcard_no between", value1, value2, "cCertcardNo");
            return (Criteria) this;
        }

        public Criteria andCCertcardNoNotBetween(String value1, String value2) {
            addCriterion("c_certcard_no not between", value1, value2, "cCertcardNo");
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

        public Criteria andCResultIsNull() {
            addCriterion("c_result is null");
            return (Criteria) this;
        }

        public Criteria andCResultIsNotNull() {
            addCriterion("c_result is not null");
            return (Criteria) this;
        }

        public Criteria andCResultEqualTo(String value) {
            addCriterion("c_result =", value, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultNotEqualTo(String value) {
            addCriterion("c_result <>", value, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultGreaterThan(String value) {
            addCriterion("c_result >", value, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultGreaterThanOrEqualTo(String value) {
            addCriterion("c_result >=", value, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultLessThan(String value) {
            addCriterion("c_result <", value, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultLessThanOrEqualTo(String value) {
            addCriterion("c_result <=", value, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultLike(String value) {
            addCriterion("c_result like", value, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultNotLike(String value) {
            addCriterion("c_result not like", value, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultIn(List<String> values) {
            addCriterion("c_result in", values, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultNotIn(List<String> values) {
            addCriterion("c_result not in", values, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultBetween(String value1, String value2) {
            addCriterion("c_result between", value1, value2, "cResult");
            return (Criteria) this;
        }

        public Criteria andCResultNotBetween(String value1, String value2) {
            addCriterion("c_result not between", value1, value2, "cResult");
            return (Criteria) this;
        }

        public Criteria andCValueIsNull() {
            addCriterion("c_value is null");
            return (Criteria) this;
        }

        public Criteria andCValueIsNotNull() {
            addCriterion("c_value is not null");
            return (Criteria) this;
        }

        public Criteria andCValueEqualTo(String value) {
            addCriterion("c_value =", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotEqualTo(String value) {
            addCriterion("c_value <>", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueGreaterThan(String value) {
            addCriterion("c_value >", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueGreaterThanOrEqualTo(String value) {
            addCriterion("c_value >=", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLessThan(String value) {
            addCriterion("c_value <", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLessThanOrEqualTo(String value) {
            addCriterion("c_value <=", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLike(String value) {
            addCriterion("c_value like", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotLike(String value) {
            addCriterion("c_value not like", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueIn(List<String> values) {
            addCriterion("c_value in", values, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotIn(List<String> values) {
            addCriterion("c_value not in", values, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueBetween(String value1, String value2) {
            addCriterion("c_value between", value1, value2, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotBetween(String value1, String value2) {
            addCriterion("c_value not between", value1, value2, "cValue");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeIsNull() {
            addCriterion("dt_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeIsNotNull() {
            addCriterion("dt_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeEqualTo(Date value) {
            addCriterion("dt_update_time =", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeNotEqualTo(Date value) {
            addCriterion("dt_update_time <>", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeGreaterThan(Date value) {
            addCriterion("dt_update_time >", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_update_time >=", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeLessThan(Date value) {
            addCriterion("dt_update_time <", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dt_update_time <=", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeIn(List<Date> values) {
            addCriterion("dt_update_time in", values, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeNotIn(List<Date> values) {
            addCriterion("dt_update_time not in", values, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dt_update_time between", value1, value2, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dt_update_time not between", value1, value2, "dtUpdateTime");
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