package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdTdPolicySetDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdTdPolicySetDataExample() {
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

        public Criteria andCPolicyUuidIsNull() {
            addCriterion("c_policy_uuid is null");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidIsNotNull() {
            addCriterion("c_policy_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidEqualTo(String value) {
            addCriterion("c_policy_uuid =", value, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidNotEqualTo(String value) {
            addCriterion("c_policy_uuid <>", value, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidGreaterThan(String value) {
            addCriterion("c_policy_uuid >", value, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidGreaterThanOrEqualTo(String value) {
            addCriterion("c_policy_uuid >=", value, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidLessThan(String value) {
            addCriterion("c_policy_uuid <", value, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidLessThanOrEqualTo(String value) {
            addCriterion("c_policy_uuid <=", value, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidLike(String value) {
            addCriterion("c_policy_uuid like", value, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidNotLike(String value) {
            addCriterion("c_policy_uuid not like", value, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidIn(List<String> values) {
            addCriterion("c_policy_uuid in", values, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidNotIn(List<String> values) {
            addCriterion("c_policy_uuid not in", values, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidBetween(String value1, String value2) {
            addCriterion("c_policy_uuid between", value1, value2, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyUuidNotBetween(String value1, String value2) {
            addCriterion("c_policy_uuid not between", value1, value2, "cPolicyUuid");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionIsNull() {
            addCriterion("c_policy_decision is null");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionIsNotNull() {
            addCriterion("c_policy_decision is not null");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionEqualTo(String value) {
            addCriterion("c_policy_decision =", value, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionNotEqualTo(String value) {
            addCriterion("c_policy_decision <>", value, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionGreaterThan(String value) {
            addCriterion("c_policy_decision >", value, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionGreaterThanOrEqualTo(String value) {
            addCriterion("c_policy_decision >=", value, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionLessThan(String value) {
            addCriterion("c_policy_decision <", value, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionLessThanOrEqualTo(String value) {
            addCriterion("c_policy_decision <=", value, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionLike(String value) {
            addCriterion("c_policy_decision like", value, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionNotLike(String value) {
            addCriterion("c_policy_decision not like", value, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionIn(List<String> values) {
            addCriterion("c_policy_decision in", values, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionNotIn(List<String> values) {
            addCriterion("c_policy_decision not in", values, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionBetween(String value1, String value2) {
            addCriterion("c_policy_decision between", value1, value2, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyDecisionNotBetween(String value1, String value2) {
            addCriterion("c_policy_decision not between", value1, value2, "cPolicyDecision");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeIsNull() {
            addCriterion("c_policy_mode is null");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeIsNotNull() {
            addCriterion("c_policy_mode is not null");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeEqualTo(String value) {
            addCriterion("c_policy_mode =", value, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeNotEqualTo(String value) {
            addCriterion("c_policy_mode <>", value, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeGreaterThan(String value) {
            addCriterion("c_policy_mode >", value, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeGreaterThanOrEqualTo(String value) {
            addCriterion("c_policy_mode >=", value, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeLessThan(String value) {
            addCriterion("c_policy_mode <", value, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeLessThanOrEqualTo(String value) {
            addCriterion("c_policy_mode <=", value, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeLike(String value) {
            addCriterion("c_policy_mode like", value, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeNotLike(String value) {
            addCriterion("c_policy_mode not like", value, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeIn(List<String> values) {
            addCriterion("c_policy_mode in", values, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeNotIn(List<String> values) {
            addCriterion("c_policy_mode not in", values, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeBetween(String value1, String value2) {
            addCriterion("c_policy_mode between", value1, value2, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyModeNotBetween(String value1, String value2) {
            addCriterion("c_policy_mode not between", value1, value2, "cPolicyMode");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreIsNull() {
            addCriterion("c_policy_score is null");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreIsNotNull() {
            addCriterion("c_policy_score is not null");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreEqualTo(String value) {
            addCriterion("c_policy_score =", value, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreNotEqualTo(String value) {
            addCriterion("c_policy_score <>", value, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreGreaterThan(String value) {
            addCriterion("c_policy_score >", value, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_policy_score >=", value, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreLessThan(String value) {
            addCriterion("c_policy_score <", value, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreLessThanOrEqualTo(String value) {
            addCriterion("c_policy_score <=", value, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreLike(String value) {
            addCriterion("c_policy_score like", value, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreNotLike(String value) {
            addCriterion("c_policy_score not like", value, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreIn(List<String> values) {
            addCriterion("c_policy_score in", values, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreNotIn(List<String> values) {
            addCriterion("c_policy_score not in", values, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreBetween(String value1, String value2) {
            addCriterion("c_policy_score between", value1, value2, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyScoreNotBetween(String value1, String value2) {
            addCriterion("c_policy_score not between", value1, value2, "cPolicyScore");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameIsNull() {
            addCriterion("c_policy_name is null");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameIsNotNull() {
            addCriterion("c_policy_name is not null");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameEqualTo(String value) {
            addCriterion("c_policy_name =", value, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameNotEqualTo(String value) {
            addCriterion("c_policy_name <>", value, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameGreaterThan(String value) {
            addCriterion("c_policy_name >", value, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_policy_name >=", value, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameLessThan(String value) {
            addCriterion("c_policy_name <", value, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameLessThanOrEqualTo(String value) {
            addCriterion("c_policy_name <=", value, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameLike(String value) {
            addCriterion("c_policy_name like", value, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameNotLike(String value) {
            addCriterion("c_policy_name not like", value, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameIn(List<String> values) {
            addCriterion("c_policy_name in", values, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameNotIn(List<String> values) {
            addCriterion("c_policy_name not in", values, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameBetween(String value1, String value2) {
            addCriterion("c_policy_name between", value1, value2, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCPolicyNameNotBetween(String value1, String value2) {
            addCriterion("c_policy_name not between", value1, value2, "cPolicyName");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeIsNull() {
            addCriterion("c_risk_type is null");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeIsNotNull() {
            addCriterion("c_risk_type is not null");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeEqualTo(String value) {
            addCriterion("c_risk_type =", value, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeNotEqualTo(String value) {
            addCriterion("c_risk_type <>", value, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeGreaterThan(String value) {
            addCriterion("c_risk_type >", value, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_risk_type >=", value, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeLessThan(String value) {
            addCriterion("c_risk_type <", value, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeLessThanOrEqualTo(String value) {
            addCriterion("c_risk_type <=", value, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeLike(String value) {
            addCriterion("c_risk_type like", value, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeNotLike(String value) {
            addCriterion("c_risk_type not like", value, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeIn(List<String> values) {
            addCriterion("c_risk_type in", values, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeNotIn(List<String> values) {
            addCriterion("c_risk_type not in", values, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeBetween(String value1, String value2) {
            addCriterion("c_risk_type between", value1, value2, "cRiskType");
            return (Criteria) this;
        }

        public Criteria andCRiskTypeNotBetween(String value1, String value2) {
            addCriterion("c_risk_type not between", value1, value2, "cRiskType");
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