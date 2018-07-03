package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdTdMainDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdTdMainDataExample() {
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

        public Criteria andCSuccessIsNull() {
            addCriterion("c_success is null");
            return (Criteria) this;
        }

        public Criteria andCSuccessIsNotNull() {
            addCriterion("c_success is not null");
            return (Criteria) this;
        }

        public Criteria andCSuccessEqualTo(String value) {
            addCriterion("c_success =", value, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessNotEqualTo(String value) {
            addCriterion("c_success <>", value, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessGreaterThan(String value) {
            addCriterion("c_success >", value, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("c_success >=", value, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessLessThan(String value) {
            addCriterion("c_success <", value, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessLessThanOrEqualTo(String value) {
            addCriterion("c_success <=", value, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessLike(String value) {
            addCriterion("c_success like", value, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessNotLike(String value) {
            addCriterion("c_success not like", value, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessIn(List<String> values) {
            addCriterion("c_success in", values, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessNotIn(List<String> values) {
            addCriterion("c_success not in", values, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessBetween(String value1, String value2) {
            addCriterion("c_success between", value1, value2, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCSuccessNotBetween(String value1, String value2) {
            addCriterion("c_success not between", value1, value2, "cSuccess");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeIsNull() {
            addCriterion("c_reason_code is null");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeIsNotNull() {
            addCriterion("c_reason_code is not null");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeEqualTo(String value) {
            addCriterion("c_reason_code =", value, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeNotEqualTo(String value) {
            addCriterion("c_reason_code <>", value, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeGreaterThan(String value) {
            addCriterion("c_reason_code >", value, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_reason_code >=", value, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeLessThan(String value) {
            addCriterion("c_reason_code <", value, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeLessThanOrEqualTo(String value) {
            addCriterion("c_reason_code <=", value, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeLike(String value) {
            addCriterion("c_reason_code like", value, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeNotLike(String value) {
            addCriterion("c_reason_code not like", value, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeIn(List<String> values) {
            addCriterion("c_reason_code in", values, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeNotIn(List<String> values) {
            addCriterion("c_reason_code not in", values, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeBetween(String value1, String value2) {
            addCriterion("c_reason_code between", value1, value2, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCReasonCodeNotBetween(String value1, String value2) {
            addCriterion("c_reason_code not between", value1, value2, "cReasonCode");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeIsNull() {
            addCriterion("c_spend_time is null");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeIsNotNull() {
            addCriterion("c_spend_time is not null");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeEqualTo(String value) {
            addCriterion("c_spend_time =", value, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeNotEqualTo(String value) {
            addCriterion("c_spend_time <>", value, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeGreaterThan(String value) {
            addCriterion("c_spend_time >", value, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_spend_time >=", value, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeLessThan(String value) {
            addCriterion("c_spend_time <", value, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeLessThanOrEqualTo(String value) {
            addCriterion("c_spend_time <=", value, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeLike(String value) {
            addCriterion("c_spend_time like", value, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeNotLike(String value) {
            addCriterion("c_spend_time not like", value, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeIn(List<String> values) {
            addCriterion("c_spend_time in", values, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeNotIn(List<String> values) {
            addCriterion("c_spend_time not in", values, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeBetween(String value1, String value2) {
            addCriterion("c_spend_time between", value1, value2, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCSpendTimeNotBetween(String value1, String value2) {
            addCriterion("c_spend_time not between", value1, value2, "cSpendTime");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameIsNull() {
            addCriterion("c_policy_set_name is null");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameIsNotNull() {
            addCriterion("c_policy_set_name is not null");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameEqualTo(String value) {
            addCriterion("c_policy_set_name =", value, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameNotEqualTo(String value) {
            addCriterion("c_policy_set_name <>", value, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameGreaterThan(String value) {
            addCriterion("c_policy_set_name >", value, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_policy_set_name >=", value, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameLessThan(String value) {
            addCriterion("c_policy_set_name <", value, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameLessThanOrEqualTo(String value) {
            addCriterion("c_policy_set_name <=", value, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameLike(String value) {
            addCriterion("c_policy_set_name like", value, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameNotLike(String value) {
            addCriterion("c_policy_set_name not like", value, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameIn(List<String> values) {
            addCriterion("c_policy_set_name in", values, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameNotIn(List<String> values) {
            addCriterion("c_policy_set_name not in", values, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameBetween(String value1, String value2) {
            addCriterion("c_policy_set_name between", value1, value2, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCPolicySetNameNotBetween(String value1, String value2) {
            addCriterion("c_policy_set_name not between", value1, value2, "cPolicySetName");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreIsNull() {
            addCriterion("c_final_score is null");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreIsNotNull() {
            addCriterion("c_final_score is not null");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreEqualTo(String value) {
            addCriterion("c_final_score =", value, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreNotEqualTo(String value) {
            addCriterion("c_final_score <>", value, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreGreaterThan(String value) {
            addCriterion("c_final_score >", value, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_final_score >=", value, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreLessThan(String value) {
            addCriterion("c_final_score <", value, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreLessThanOrEqualTo(String value) {
            addCriterion("c_final_score <=", value, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreLike(String value) {
            addCriterion("c_final_score like", value, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreNotLike(String value) {
            addCriterion("c_final_score not like", value, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreIn(List<String> values) {
            addCriterion("c_final_score in", values, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreNotIn(List<String> values) {
            addCriterion("c_final_score not in", values, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreBetween(String value1, String value2) {
            addCriterion("c_final_score between", value1, value2, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalScoreNotBetween(String value1, String value2) {
            addCriterion("c_final_score not between", value1, value2, "cFinalScore");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionIsNull() {
            addCriterion("c_final_decision is null");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionIsNotNull() {
            addCriterion("c_final_decision is not null");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionEqualTo(String value) {
            addCriterion("c_final_decision =", value, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionNotEqualTo(String value) {
            addCriterion("c_final_decision <>", value, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionGreaterThan(String value) {
            addCriterion("c_final_decision >", value, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionGreaterThanOrEqualTo(String value) {
            addCriterion("c_final_decision >=", value, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionLessThan(String value) {
            addCriterion("c_final_decision <", value, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionLessThanOrEqualTo(String value) {
            addCriterion("c_final_decision <=", value, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionLike(String value) {
            addCriterion("c_final_decision like", value, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionNotLike(String value) {
            addCriterion("c_final_decision not like", value, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionIn(List<String> values) {
            addCriterion("c_final_decision in", values, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionNotIn(List<String> values) {
            addCriterion("c_final_decision not in", values, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionBetween(String value1, String value2) {
            addCriterion("c_final_decision between", value1, value2, "cFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCFinalDecisionNotBetween(String value1, String value2) {
            addCriterion("c_final_decision not between", value1, value2, "cFinalDecision");
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