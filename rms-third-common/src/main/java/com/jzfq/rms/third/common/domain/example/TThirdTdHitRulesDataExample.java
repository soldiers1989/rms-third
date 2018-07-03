package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdTdHitRulesDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdTdHitRulesDataExample() {
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

        public Criteria andCDecisionIsNull() {
            addCriterion("c_decision is null");
            return (Criteria) this;
        }

        public Criteria andCDecisionIsNotNull() {
            addCriterion("c_decision is not null");
            return (Criteria) this;
        }

        public Criteria andCDecisionEqualTo(String value) {
            addCriterion("c_decision =", value, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionNotEqualTo(String value) {
            addCriterion("c_decision <>", value, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionGreaterThan(String value) {
            addCriterion("c_decision >", value, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionGreaterThanOrEqualTo(String value) {
            addCriterion("c_decision >=", value, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionLessThan(String value) {
            addCriterion("c_decision <", value, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionLessThanOrEqualTo(String value) {
            addCriterion("c_decision <=", value, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionLike(String value) {
            addCriterion("c_decision like", value, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionNotLike(String value) {
            addCriterion("c_decision not like", value, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionIn(List<String> values) {
            addCriterion("c_decision in", values, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionNotIn(List<String> values) {
            addCriterion("c_decision not in", values, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionBetween(String value1, String value2) {
            addCriterion("c_decision between", value1, value2, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCDecisionNotBetween(String value1, String value2) {
            addCriterion("c_decision not between", value1, value2, "cDecision");
            return (Criteria) this;
        }

        public Criteria andCScoreIsNull() {
            addCriterion("c_score is null");
            return (Criteria) this;
        }

        public Criteria andCScoreIsNotNull() {
            addCriterion("c_score is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreEqualTo(String value) {
            addCriterion("c_score =", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotEqualTo(String value) {
            addCriterion("c_score <>", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreGreaterThan(String value) {
            addCriterion("c_score >", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_score >=", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreLessThan(String value) {
            addCriterion("c_score <", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreLessThanOrEqualTo(String value) {
            addCriterion("c_score <=", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreLike(String value) {
            addCriterion("c_score like", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotLike(String value) {
            addCriterion("c_score not like", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreIn(List<String> values) {
            addCriterion("c_score in", values, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotIn(List<String> values) {
            addCriterion("c_score not in", values, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreBetween(String value1, String value2) {
            addCriterion("c_score between", value1, value2, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotBetween(String value1, String value2) {
            addCriterion("c_score not between", value1, value2, "cScore");
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

        public Criteria andCUuidIsNull() {
            addCriterion("c_uuid is null");
            return (Criteria) this;
        }

        public Criteria andCUuidIsNotNull() {
            addCriterion("c_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andCUuidEqualTo(String value) {
            addCriterion("c_uuid =", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidNotEqualTo(String value) {
            addCriterion("c_uuid <>", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidGreaterThan(String value) {
            addCriterion("c_uuid >", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidGreaterThanOrEqualTo(String value) {
            addCriterion("c_uuid >=", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidLessThan(String value) {
            addCriterion("c_uuid <", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidLessThanOrEqualTo(String value) {
            addCriterion("c_uuid <=", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidLike(String value) {
            addCriterion("c_uuid like", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidNotLike(String value) {
            addCriterion("c_uuid not like", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidIn(List<String> values) {
            addCriterion("c_uuid in", values, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidNotIn(List<String> values) {
            addCriterion("c_uuid not in", values, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidBetween(String value1, String value2) {
            addCriterion("c_uuid between", value1, value2, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidNotBetween(String value1, String value2) {
            addCriterion("c_uuid not between", value1, value2, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidIsNull() {
            addCriterion("c_parentUuid is null");
            return (Criteria) this;
        }

        public Criteria andCParentuuidIsNotNull() {
            addCriterion("c_parentUuid is not null");
            return (Criteria) this;
        }

        public Criteria andCParentuuidEqualTo(String value) {
            addCriterion("c_parentUuid =", value, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidNotEqualTo(String value) {
            addCriterion("c_parentUuid <>", value, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidGreaterThan(String value) {
            addCriterion("c_parentUuid >", value, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidGreaterThanOrEqualTo(String value) {
            addCriterion("c_parentUuid >=", value, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidLessThan(String value) {
            addCriterion("c_parentUuid <", value, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidLessThanOrEqualTo(String value) {
            addCriterion("c_parentUuid <=", value, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidLike(String value) {
            addCriterion("c_parentUuid like", value, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidNotLike(String value) {
            addCriterion("c_parentUuid not like", value, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidIn(List<String> values) {
            addCriterion("c_parentUuid in", values, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidNotIn(List<String> values) {
            addCriterion("c_parentUuid not in", values, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidBetween(String value1, String value2) {
            addCriterion("c_parentUuid between", value1, value2, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCParentuuidNotBetween(String value1, String value2) {
            addCriterion("c_parentUuid not between", value1, value2, "cParentuuid");
            return (Criteria) this;
        }

        public Criteria andCRuleIdIsNull() {
            addCriterion("c_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andCRuleIdIsNotNull() {
            addCriterion("c_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleIdEqualTo(String value) {
            addCriterion("c_rule_id =", value, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdNotEqualTo(String value) {
            addCriterion("c_rule_id <>", value, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdGreaterThan(String value) {
            addCriterion("c_rule_id >", value, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_rule_id >=", value, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdLessThan(String value) {
            addCriterion("c_rule_id <", value, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdLessThanOrEqualTo(String value) {
            addCriterion("c_rule_id <=", value, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdLike(String value) {
            addCriterion("c_rule_id like", value, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdNotLike(String value) {
            addCriterion("c_rule_id not like", value, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdIn(List<String> values) {
            addCriterion("c_rule_id in", values, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdNotIn(List<String> values) {
            addCriterion("c_rule_id not in", values, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdBetween(String value1, String value2) {
            addCriterion("c_rule_id between", value1, value2, "cRuleId");
            return (Criteria) this;
        }

        public Criteria andCRuleIdNotBetween(String value1, String value2) {
            addCriterion("c_rule_id not between", value1, value2, "cRuleId");
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