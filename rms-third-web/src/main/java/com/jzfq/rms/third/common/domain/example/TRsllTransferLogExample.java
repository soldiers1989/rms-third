package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRsllTransferLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRsllTransferLogExample() {
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

        public Criteria andCInterfaceKeyIsNull() {
            addCriterion("c_interface_key is null");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyIsNotNull() {
            addCriterion("c_interface_key is not null");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyEqualTo(String value) {
            addCriterion("c_interface_key =", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyNotEqualTo(String value) {
            addCriterion("c_interface_key <>", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyGreaterThan(String value) {
            addCriterion("c_interface_key >", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("c_interface_key >=", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyLessThan(String value) {
            addCriterion("c_interface_key <", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyLessThanOrEqualTo(String value) {
            addCriterion("c_interface_key <=", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyLike(String value) {
            addCriterion("c_interface_key like", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyNotLike(String value) {
            addCriterion("c_interface_key not like", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyIn(List<String> values) {
            addCriterion("c_interface_key in", values, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyNotIn(List<String> values) {
            addCriterion("c_interface_key not in", values, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyBetween(String value1, String value2) {
            addCriterion("c_interface_key between", value1, value2, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyNotBetween(String value1, String value2) {
            addCriterion("c_interface_key not between", value1, value2, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCProLineIsNull() {
            addCriterion("c_pro_line is null");
            return (Criteria) this;
        }

        public Criteria andCProLineIsNotNull() {
            addCriterion("c_pro_line is not null");
            return (Criteria) this;
        }

        public Criteria andCProLineEqualTo(String value) {
            addCriterion("c_pro_line =", value, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineNotEqualTo(String value) {
            addCriterion("c_pro_line <>", value, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineGreaterThan(String value) {
            addCriterion("c_pro_line >", value, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineGreaterThanOrEqualTo(String value) {
            addCriterion("c_pro_line >=", value, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineLessThan(String value) {
            addCriterion("c_pro_line <", value, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineLessThanOrEqualTo(String value) {
            addCriterion("c_pro_line <=", value, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineLike(String value) {
            addCriterion("c_pro_line like", value, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineNotLike(String value) {
            addCriterion("c_pro_line not like", value, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineIn(List<String> values) {
            addCriterion("c_pro_line in", values, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineNotIn(List<String> values) {
            addCriterion("c_pro_line not in", values, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineBetween(String value1, String value2) {
            addCriterion("c_pro_line between", value1, value2, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCProLineNotBetween(String value1, String value2) {
            addCriterion("c_pro_line not between", value1, value2, "cProLine");
            return (Criteria) this;
        }

        public Criteria andCChannelIsNull() {
            addCriterion("c_channel is null");
            return (Criteria) this;
        }

        public Criteria andCChannelIsNotNull() {
            addCriterion("c_channel is not null");
            return (Criteria) this;
        }

        public Criteria andCChannelEqualTo(String value) {
            addCriterion("c_channel =", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotEqualTo(String value) {
            addCriterion("c_channel <>", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelGreaterThan(String value) {
            addCriterion("c_channel >", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelGreaterThanOrEqualTo(String value) {
            addCriterion("c_channel >=", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLessThan(String value) {
            addCriterion("c_channel <", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLessThanOrEqualTo(String value) {
            addCriterion("c_channel <=", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLike(String value) {
            addCriterion("c_channel like", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotLike(String value) {
            addCriterion("c_channel not like", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelIn(List<String> values) {
            addCriterion("c_channel in", values, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotIn(List<String> values) {
            addCriterion("c_channel not in", values, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelBetween(String value1, String value2) {
            addCriterion("c_channel between", value1, value2, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotBetween(String value1, String value2) {
            addCriterion("c_channel not between", value1, value2, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCParamsIsNull() {
            addCriterion("c_params is null");
            return (Criteria) this;
        }

        public Criteria andCParamsIsNotNull() {
            addCriterion("c_params is not null");
            return (Criteria) this;
        }

        public Criteria andCParamsEqualTo(String value) {
            addCriterion("c_params =", value, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsNotEqualTo(String value) {
            addCriterion("c_params <>", value, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsGreaterThan(String value) {
            addCriterion("c_params >", value, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsGreaterThanOrEqualTo(String value) {
            addCriterion("c_params >=", value, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsLessThan(String value) {
            addCriterion("c_params <", value, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsLessThanOrEqualTo(String value) {
            addCriterion("c_params <=", value, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsLike(String value) {
            addCriterion("c_params like", value, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsNotLike(String value) {
            addCriterion("c_params not like", value, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsIn(List<String> values) {
            addCriterion("c_params in", values, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsNotIn(List<String> values) {
            addCriterion("c_params not in", values, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsBetween(String value1, String value2) {
            addCriterion("c_params between", value1, value2, "cParams");
            return (Criteria) this;
        }

        public Criteria andCParamsNotBetween(String value1, String value2) {
            addCriterion("c_params not between", value1, value2, "cParams");
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

        public Criteria andNDelIsNull() {
            addCriterion("n_del is null");
            return (Criteria) this;
        }

        public Criteria andNDelIsNotNull() {
            addCriterion("n_del is not null");
            return (Criteria) this;
        }

        public Criteria andNDelEqualTo(Integer value) {
            addCriterion("n_del =", value, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelNotEqualTo(Integer value) {
            addCriterion("n_del <>", value, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelGreaterThan(Integer value) {
            addCriterion("n_del >", value, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_del >=", value, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelLessThan(Integer value) {
            addCriterion("n_del <", value, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelLessThanOrEqualTo(Integer value) {
            addCriterion("n_del <=", value, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelIn(List<Integer> values) {
            addCriterion("n_del in", values, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelNotIn(List<Integer> values) {
            addCriterion("n_del not in", values, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelBetween(Integer value1, Integer value2) {
            addCriterion("n_del between", value1, value2, "nDel");
            return (Criteria) this;
        }

        public Criteria andNDelNotBetween(Integer value1, Integer value2) {
            addCriterion("n_del not between", value1, value2, "nDel");
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