package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TJxlTokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TJxlTokenExample() {
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

        public Criteria andCIdNumberIsNull() {
            addCriterion("c_id_number is null");
            return (Criteria) this;
        }

        public Criteria andCIdNumberIsNotNull() {
            addCriterion("c_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andCIdNumberEqualTo(String value) {
            addCriterion("c_id_number =", value, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberNotEqualTo(String value) {
            addCriterion("c_id_number <>", value, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberGreaterThan(String value) {
            addCriterion("c_id_number >", value, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("c_id_number >=", value, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberLessThan(String value) {
            addCriterion("c_id_number <", value, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberLessThanOrEqualTo(String value) {
            addCriterion("c_id_number <=", value, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberLike(String value) {
            addCriterion("c_id_number like", value, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberNotLike(String value) {
            addCriterion("c_id_number not like", value, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberIn(List<String> values) {
            addCriterion("c_id_number in", values, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberNotIn(List<String> values) {
            addCriterion("c_id_number not in", values, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberBetween(String value1, String value2) {
            addCriterion("c_id_number between", value1, value2, "cIdNumber");
            return (Criteria) this;
        }

        public Criteria andCIdNumberNotBetween(String value1, String value2) {
            addCriterion("c_id_number not between", value1, value2, "cIdNumber");
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

        public Criteria andCTokenIsNull() {
            addCriterion("c_token is null");
            return (Criteria) this;
        }

        public Criteria andCTokenIsNotNull() {
            addCriterion("c_token is not null");
            return (Criteria) this;
        }

        public Criteria andCTokenEqualTo(String value) {
            addCriterion("c_token =", value, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenNotEqualTo(String value) {
            addCriterion("c_token <>", value, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenGreaterThan(String value) {
            addCriterion("c_token >", value, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenGreaterThanOrEqualTo(String value) {
            addCriterion("c_token >=", value, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenLessThan(String value) {
            addCriterion("c_token <", value, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenLessThanOrEqualTo(String value) {
            addCriterion("c_token <=", value, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenLike(String value) {
            addCriterion("c_token like", value, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenNotLike(String value) {
            addCriterion("c_token not like", value, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenIn(List<String> values) {
            addCriterion("c_token in", values, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenNotIn(List<String> values) {
            addCriterion("c_token not in", values, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenBetween(String value1, String value2) {
            addCriterion("c_token between", value1, value2, "cToken");
            return (Criteria) this;
        }

        public Criteria andCTokenNotBetween(String value1, String value2) {
            addCriterion("c_token not between", value1, value2, "cToken");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeIsNull() {
            addCriterion("dt_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeIsNotNull() {
            addCriterion("dt_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeEqualTo(Date value) {
            addCriterion("dt_create_time =", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeNotEqualTo(Date value) {
            addCriterion("dt_create_time <>", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeGreaterThan(Date value) {
            addCriterion("dt_create_time >", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_create_time >=", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeLessThan(Date value) {
            addCriterion("dt_create_time <", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dt_create_time <=", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeIn(List<Date> values) {
            addCriterion("dt_create_time in", values, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeNotIn(List<Date> values) {
            addCriterion("dt_create_time not in", values, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dt_create_time between", value1, value2, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dt_create_time not between", value1, value2, "dtCreateTime");
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