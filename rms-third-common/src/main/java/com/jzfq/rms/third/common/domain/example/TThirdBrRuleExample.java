package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdBrRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdBrRuleExample() {
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

        public Criteria andSwiftNumberIsNull() {
            addCriterion("swift_number is null");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberIsNotNull() {
            addCriterion("swift_number is not null");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberEqualTo(String value) {
            addCriterion("swift_number =", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberNotEqualTo(String value) {
            addCriterion("swift_number <>", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberGreaterThan(String value) {
            addCriterion("swift_number >", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberGreaterThanOrEqualTo(String value) {
            addCriterion("swift_number >=", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberLessThan(String value) {
            addCriterion("swift_number <", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberLessThanOrEqualTo(String value) {
            addCriterion("swift_number <=", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberLike(String value) {
            addCriterion("swift_number like", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberNotLike(String value) {
            addCriterion("swift_number not like", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberIn(List<String> values) {
            addCriterion("swift_number in", values, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberNotIn(List<String> values) {
            addCriterion("swift_number not in", values, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberBetween(String value1, String value2) {
            addCriterion("swift_number between", value1, value2, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberNotBetween(String value1, String value2) {
            addCriterion("swift_number not between", value1, value2, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistIsNull() {
            addCriterion("c_flag_rulespeciallist is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistIsNotNull() {
            addCriterion("c_flag_rulespeciallist is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistEqualTo(String value) {
            addCriterion("c_flag_rulespeciallist =", value, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistNotEqualTo(String value) {
            addCriterion("c_flag_rulespeciallist <>", value, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistGreaterThan(String value) {
            addCriterion("c_flag_rulespeciallist >", value, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_rulespeciallist >=", value, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistLessThan(String value) {
            addCriterion("c_flag_rulespeciallist <", value, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistLessThanOrEqualTo(String value) {
            addCriterion("c_flag_rulespeciallist <=", value, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistLike(String value) {
            addCriterion("c_flag_rulespeciallist like", value, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistNotLike(String value) {
            addCriterion("c_flag_rulespeciallist not like", value, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistIn(List<String> values) {
            addCriterion("c_flag_rulespeciallist in", values, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistNotIn(List<String> values) {
            addCriterion("c_flag_rulespeciallist not in", values, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistBetween(String value1, String value2) {
            addCriterion("c_flag_rulespeciallist between", value1, value2, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRulespeciallistNotBetween(String value1, String value2) {
            addCriterion("c_flag_rulespeciallist not between", value1, value2, "cFlagRulespeciallist");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanIsNull() {
            addCriterion("c_flag_ruleapplyloan_revoloan is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanIsNotNull() {
            addCriterion("c_flag_ruleapplyloan_revoloan is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_revoloan =", value, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanNotEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_revoloan <>", value, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanGreaterThan(String value) {
            addCriterion("c_flag_ruleapplyloan_revoloan >", value, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_revoloan >=", value, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanLessThan(String value) {
            addCriterion("c_flag_ruleapplyloan_revoloan <", value, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_revoloan <=", value, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanLike(String value) {
            addCriterion("c_flag_ruleapplyloan_revoloan like", value, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanNotLike(String value) {
            addCriterion("c_flag_ruleapplyloan_revoloan not like", value, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_revoloan in", values, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanNotIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_revoloan not in", values, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_revoloan between", value1, value2, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanRevoloanNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_revoloan not between", value1, value2, "cFlagRuleapplyloanRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinIsNull() {
            addCriterion("c_flag_RuleApplyLoan_autofin is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinIsNotNull() {
            addCriterion("c_flag_RuleApplyLoan_autofin is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinEqualTo(String value) {
            addCriterion("c_flag_RuleApplyLoan_autofin =", value, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinNotEqualTo(String value) {
            addCriterion("c_flag_RuleApplyLoan_autofin <>", value, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinGreaterThan(String value) {
            addCriterion("c_flag_RuleApplyLoan_autofin >", value, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_RuleApplyLoan_autofin >=", value, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinLessThan(String value) {
            addCriterion("c_flag_RuleApplyLoan_autofin <", value, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinLessThanOrEqualTo(String value) {
            addCriterion("c_flag_RuleApplyLoan_autofin <=", value, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinLike(String value) {
            addCriterion("c_flag_RuleApplyLoan_autofin like", value, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinNotLike(String value) {
            addCriterion("c_flag_RuleApplyLoan_autofin not like", value, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinIn(List<String> values) {
            addCriterion("c_flag_RuleApplyLoan_autofin in", values, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinNotIn(List<String> values) {
            addCriterion("c_flag_RuleApplyLoan_autofin not in", values, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinBetween(String value1, String value2) {
            addCriterion("c_flag_RuleApplyLoan_autofin between", value1, value2, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanAutofinNotBetween(String value1, String value2) {
            addCriterion("c_flag_RuleApplyLoan_autofin not between", value1, value2, "cFlagRuleapplyloanAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffIsNull() {
            addCriterion("c_flag_ruleapplyloan_consoff is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffIsNotNull() {
            addCriterion("c_flag_ruleapplyloan_consoff is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_consoff =", value, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffNotEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_consoff <>", value, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffGreaterThan(String value) {
            addCriterion("c_flag_ruleapplyloan_consoff >", value, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_consoff >=", value, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffLessThan(String value) {
            addCriterion("c_flag_ruleapplyloan_consoff <", value, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_consoff <=", value, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffLike(String value) {
            addCriterion("c_flag_ruleapplyloan_consoff like", value, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffNotLike(String value) {
            addCriterion("c_flag_ruleapplyloan_consoff not like", value, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_consoff in", values, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffNotIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_consoff not in", values, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_consoff between", value1, value2, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanConsoffNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_consoff not between", value1, value2, "cFlagRuleapplyloanConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonIsNull() {
            addCriterion("c_flag_ruleapplyloan_cashon is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonIsNotNull() {
            addCriterion("c_flag_ruleapplyloan_cashon is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_cashon =", value, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonNotEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_cashon <>", value, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonGreaterThan(String value) {
            addCriterion("c_flag_ruleapplyloan_cashon >", value, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_cashon >=", value, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonLessThan(String value) {
            addCriterion("c_flag_ruleapplyloan_cashon <", value, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_cashon <=", value, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonLike(String value) {
            addCriterion("c_flag_ruleapplyloan_cashon like", value, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonNotLike(String value) {
            addCriterion("c_flag_ruleapplyloan_cashon not like", value, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_cashon in", values, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonNotIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_cashon not in", values, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_cashon between", value1, value2, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashonNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_cashon not between", value1, value2, "cFlagRuleapplyloanCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlIsNull() {
            addCriterion("c_flag_ruleapplyloan_pdl is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlIsNotNull() {
            addCriterion("c_flag_ruleapplyloan_pdl is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_pdl =", value, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlNotEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_pdl <>", value, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlGreaterThan(String value) {
            addCriterion("c_flag_ruleapplyloan_pdl >", value, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_pdl >=", value, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlLessThan(String value) {
            addCriterion("c_flag_ruleapplyloan_pdl <", value, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_pdl <=", value, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlLike(String value) {
            addCriterion("c_flag_ruleapplyloan_pdl like", value, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlNotLike(String value) {
            addCriterion("c_flag_ruleapplyloan_pdl not like", value, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_pdl in", values, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlNotIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_pdl not in", values, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_pdl between", value1, value2, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanPdlNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_pdl not between", value1, value2, "cFlagRuleapplyloanPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffIsNull() {
            addCriterion("c_flag_ruleapplyloan_cashoff is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffIsNotNull() {
            addCriterion("c_flag_ruleapplyloan_cashoff is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_cashoff =", value, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffNotEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_cashoff <>", value, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffGreaterThan(String value) {
            addCriterion("c_flag_ruleapplyloan_cashoff >", value, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_cashoff >=", value, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffLessThan(String value) {
            addCriterion("c_flag_ruleapplyloan_cashoff <", value, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleapplyloan_cashoff <=", value, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffLike(String value) {
            addCriterion("c_flag_ruleapplyloan_cashoff like", value, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffNotLike(String value) {
            addCriterion("c_flag_ruleapplyloan_cashoff not like", value, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_cashoff in", values, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffNotIn(List<String> values) {
            addCriterion("c_flag_ruleapplyloan_cashoff not in", values, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_cashoff between", value1, value2, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleapplyloanCashoffNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleapplyloan_cashoff not between", value1, value2, "cFlagRuleapplyloanCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionIsNull() {
            addCriterion("c_flag_ruleexecution is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionIsNotNull() {
            addCriterion("c_flag_ruleexecution is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionEqualTo(String value) {
            addCriterion("c_flag_ruleexecution =", value, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionNotEqualTo(String value) {
            addCriterion("c_flag_ruleexecution <>", value, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionGreaterThan(String value) {
            addCriterion("c_flag_ruleexecution >", value, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleexecution >=", value, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionLessThan(String value) {
            addCriterion("c_flag_ruleexecution <", value, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleexecution <=", value, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionLike(String value) {
            addCriterion("c_flag_ruleexecution like", value, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionNotLike(String value) {
            addCriterion("c_flag_ruleexecution not like", value, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionIn(List<String> values) {
            addCriterion("c_flag_ruleexecution in", values, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionNotIn(List<String> values) {
            addCriterion("c_flag_ruleexecution not in", values, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionBetween(String value1, String value2) {
            addCriterion("c_flag_ruleexecution between", value1, value2, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleexecutionNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleexecution not between", value1, value2, "cFlagRuleexecution");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanIsNull() {
            addCriterion("c_flag_ruleinforelation_revoloan is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanIsNotNull() {
            addCriterion("c_flag_ruleinforelation_revoloan is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_revoloan =", value, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanNotEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_revoloan <>", value, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanGreaterThan(String value) {
            addCriterion("c_flag_ruleinforelation_revoloan >", value, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_revoloan >=", value, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanLessThan(String value) {
            addCriterion("c_flag_ruleinforelation_revoloan <", value, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_revoloan <=", value, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanLike(String value) {
            addCriterion("c_flag_ruleinforelation_revoloan like", value, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanNotLike(String value) {
            addCriterion("c_flag_ruleinforelation_revoloan not like", value, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_revoloan in", values, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanNotIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_revoloan not in", values, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_revoloan between", value1, value2, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationRevoloanNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_revoloan not between", value1, value2, "cFlagRuleinforelationRevoloan");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffIsNull() {
            addCriterion("c_flag_ruleinforelation_cashoff is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffIsNotNull() {
            addCriterion("c_flag_ruleinforelation_cashoff is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_cashoff =", value, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffNotEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_cashoff <>", value, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffGreaterThan(String value) {
            addCriterion("c_flag_ruleinforelation_cashoff >", value, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_cashoff >=", value, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffLessThan(String value) {
            addCriterion("c_flag_ruleinforelation_cashoff <", value, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_cashoff <=", value, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffLike(String value) {
            addCriterion("c_flag_ruleinforelation_cashoff like", value, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffNotLike(String value) {
            addCriterion("c_flag_ruleinforelation_cashoff not like", value, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_cashoff in", values, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffNotIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_cashoff not in", values, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_cashoff between", value1, value2, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashoffNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_cashoff not between", value1, value2, "cFlagRuleinforelationCashoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlIsNull() {
            addCriterion("c_flag_ruleinforelation_pdl is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlIsNotNull() {
            addCriterion("c_flag_ruleinforelation_pdl is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_pdl =", value, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlNotEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_pdl <>", value, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlGreaterThan(String value) {
            addCriterion("c_flag_ruleinforelation_pdl >", value, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_pdl >=", value, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlLessThan(String value) {
            addCriterion("c_flag_ruleinforelation_pdl <", value, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_pdl <=", value, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlLike(String value) {
            addCriterion("c_flag_ruleinforelation_pdl like", value, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlNotLike(String value) {
            addCriterion("c_flag_ruleinforelation_pdl not like", value, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_pdl in", values, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlNotIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_pdl not in", values, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_pdl between", value1, value2, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationPdlNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_pdl not between", value1, value2, "cFlagRuleinforelationPdl");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonIsNull() {
            addCriterion("c_flag_ruleinforelation_cashon is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonIsNotNull() {
            addCriterion("c_flag_ruleinforelation_cashon is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_cashon =", value, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonNotEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_cashon <>", value, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonGreaterThan(String value) {
            addCriterion("c_flag_ruleinforelation_cashon >", value, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_cashon >=", value, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonLessThan(String value) {
            addCriterion("c_flag_ruleinforelation_cashon <", value, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_cashon <=", value, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonLike(String value) {
            addCriterion("c_flag_ruleinforelation_cashon like", value, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonNotLike(String value) {
            addCriterion("c_flag_ruleinforelation_cashon not like", value, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_cashon in", values, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonNotIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_cashon not in", values, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_cashon between", value1, value2, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationCashonNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_cashon not between", value1, value2, "cFlagRuleinforelationCashon");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffIsNull() {
            addCriterion("c_flag_ruleinforelation_consoff is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffIsNotNull() {
            addCriterion("c_flag_ruleinforelation_consoff is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_consoff =", value, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffNotEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_consoff <>", value, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffGreaterThan(String value) {
            addCriterion("c_flag_ruleinforelation_consoff >", value, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_consoff >=", value, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffLessThan(String value) {
            addCriterion("c_flag_ruleinforelation_consoff <", value, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_consoff <=", value, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffLike(String value) {
            addCriterion("c_flag_ruleinforelation_consoff like", value, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffNotLike(String value) {
            addCriterion("c_flag_ruleinforelation_consoff not like", value, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_consoff in", values, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffNotIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_consoff not in", values, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_consoff between", value1, value2, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationConsoffNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_consoff not between", value1, value2, "cFlagRuleinforelationConsoff");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinIsNull() {
            addCriterion("c_flag_ruleinforelation_autofin is null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinIsNotNull() {
            addCriterion("c_flag_ruleinforelation_autofin is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_autofin =", value, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinNotEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_autofin <>", value, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinGreaterThan(String value) {
            addCriterion("c_flag_ruleinforelation_autofin >", value, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_autofin >=", value, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinLessThan(String value) {
            addCriterion("c_flag_ruleinforelation_autofin <", value, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinLessThanOrEqualTo(String value) {
            addCriterion("c_flag_ruleinforelation_autofin <=", value, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinLike(String value) {
            addCriterion("c_flag_ruleinforelation_autofin like", value, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinNotLike(String value) {
            addCriterion("c_flag_ruleinforelation_autofin not like", value, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_autofin in", values, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinNotIn(List<String> values) {
            addCriterion("c_flag_ruleinforelation_autofin not in", values, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_autofin between", value1, value2, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCFlagRuleinforelationAutofinNotBetween(String value1, String value2) {
            addCriterion("c_flag_ruleinforelation_autofin not between", value1, value2, "cFlagRuleinforelationAutofin");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionIsNull() {
            addCriterion("c_Rule_final_decision is null");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionIsNotNull() {
            addCriterion("c_Rule_final_decision is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionEqualTo(String value) {
            addCriterion("c_Rule_final_decision =", value, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionNotEqualTo(String value) {
            addCriterion("c_Rule_final_decision <>", value, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionGreaterThan(String value) {
            addCriterion("c_Rule_final_decision >", value, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionGreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_final_decision >=", value, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionLessThan(String value) {
            addCriterion("c_Rule_final_decision <", value, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionLessThanOrEqualTo(String value) {
            addCriterion("c_Rule_final_decision <=", value, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionLike(String value) {
            addCriterion("c_Rule_final_decision like", value, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionNotLike(String value) {
            addCriterion("c_Rule_final_decision not like", value, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionIn(List<String> values) {
            addCriterion("c_Rule_final_decision in", values, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionNotIn(List<String> values) {
            addCriterion("c_Rule_final_decision not in", values, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionBetween(String value1, String value2) {
            addCriterion("c_Rule_final_decision between", value1, value2, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalDecisionNotBetween(String value1, String value2) {
            addCriterion("c_Rule_final_decision not between", value1, value2, "cRuleFinalDecision");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightIsNull() {
            addCriterion("c_Rule_final_weight is null");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightIsNotNull() {
            addCriterion("c_Rule_final_weight is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightEqualTo(String value) {
            addCriterion("c_Rule_final_weight =", value, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightNotEqualTo(String value) {
            addCriterion("c_Rule_final_weight <>", value, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightGreaterThan(String value) {
            addCriterion("c_Rule_final_weight >", value, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightGreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_final_weight >=", value, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightLessThan(String value) {
            addCriterion("c_Rule_final_weight <", value, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightLessThanOrEqualTo(String value) {
            addCriterion("c_Rule_final_weight <=", value, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightLike(String value) {
            addCriterion("c_Rule_final_weight like", value, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightNotLike(String value) {
            addCriterion("c_Rule_final_weight not like", value, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightIn(List<String> values) {
            addCriterion("c_Rule_final_weight in", values, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightNotIn(List<String> values) {
            addCriterion("c_Rule_final_weight not in", values, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightBetween(String value1, String value2) {
            addCriterion("c_Rule_final_weight between", value1, value2, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleFinalWeightNotBetween(String value1, String value2) {
            addCriterion("c_Rule_final_weight not between", value1, value2, "cRuleFinalWeight");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010IsNull() {
            addCriterion("c_Rule_name_QJS010 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010IsNotNull() {
            addCriterion("c_Rule_name_QJS010 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010EqualTo(String value) {
            addCriterion("c_Rule_name_QJS010 =", value, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010NotEqualTo(String value) {
            addCriterion("c_Rule_name_QJS010 <>", value, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010GreaterThan(String value) {
            addCriterion("c_Rule_name_QJS010 >", value, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_QJS010 >=", value, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010LessThan(String value) {
            addCriterion("c_Rule_name_QJS010 <", value, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_QJS010 <=", value, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010Like(String value) {
            addCriterion("c_Rule_name_QJS010 like", value, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010NotLike(String value) {
            addCriterion("c_Rule_name_QJS010 not like", value, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010In(List<String> values) {
            addCriterion("c_Rule_name_QJS010 in", values, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010NotIn(List<String> values) {
            addCriterion("c_Rule_name_QJS010 not in", values, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010Between(String value1, String value2) {
            addCriterion("c_Rule_name_QJS010 between", value1, value2, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQjs010NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_QJS010 not between", value1, value2, "cRuleNameQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010IsNull() {
            addCriterion("c_Rule_weight_QJS010 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010IsNotNull() {
            addCriterion("c_Rule_weight_QJS010 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010EqualTo(String value) {
            addCriterion("c_Rule_weight_QJS010 =", value, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010NotEqualTo(String value) {
            addCriterion("c_Rule_weight_QJS010 <>", value, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010GreaterThan(String value) {
            addCriterion("c_Rule_weight_QJS010 >", value, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_QJS010 >=", value, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010LessThan(String value) {
            addCriterion("c_Rule_weight_QJS010 <", value, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_QJS010 <=", value, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010Like(String value) {
            addCriterion("c_Rule_weight_QJS010 like", value, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010NotLike(String value) {
            addCriterion("c_Rule_weight_QJS010 not like", value, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010In(List<String> values) {
            addCriterion("c_Rule_weight_QJS010 in", values, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010NotIn(List<String> values) {
            addCriterion("c_Rule_weight_QJS010 not in", values, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010Between(String value1, String value2) {
            addCriterion("c_Rule_weight_QJS010 between", value1, value2, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQjs010NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_QJS010 not between", value1, value2, "cRuleWeightQjs010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001IsNull() {
            addCriterion("c_Rule_name_CAB001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001IsNotNull() {
            addCriterion("c_Rule_name_CAB001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001EqualTo(String value) {
            addCriterion("c_Rule_name_CAB001 =", value, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CAB001 <>", value, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001GreaterThan(String value) {
            addCriterion("c_Rule_name_CAB001 >", value, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAB001 >=", value, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001LessThan(String value) {
            addCriterion("c_Rule_name_CAB001 <", value, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAB001 <=", value, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001Like(String value) {
            addCriterion("c_Rule_name_CAB001 like", value, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001NotLike(String value) {
            addCriterion("c_Rule_name_CAB001 not like", value, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001In(List<String> values) {
            addCriterion("c_Rule_name_CAB001 in", values, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CAB001 not in", values, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CAB001 between", value1, value2, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCab001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CAB001 not between", value1, value2, "cRuleNameCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001IsNull() {
            addCriterion("c_Rule_weight_CAB001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001IsNotNull() {
            addCriterion("c_Rule_weight_CAB001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001EqualTo(String value) {
            addCriterion("c_Rule_weight_CAB001 =", value, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CAB001 <>", value, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CAB001 >", value, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAB001 >=", value, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001LessThan(String value) {
            addCriterion("c_Rule_weight_CAB001 <", value, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAB001 <=", value, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001Like(String value) {
            addCriterion("c_Rule_weight_CAB001 like", value, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001NotLike(String value) {
            addCriterion("c_Rule_weight_CAB001 not like", value, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001In(List<String> values) {
            addCriterion("c_Rule_weight_CAB001 in", values, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CAB001 not in", values, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CAB001 between", value1, value2, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCab001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CAB001 not between", value1, value2, "cRuleWeightCab001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001IsNull() {
            addCriterion("c_Rule_name_CAC001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001IsNotNull() {
            addCriterion("c_Rule_name_CAC001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001EqualTo(String value) {
            addCriterion("c_Rule_name_CAC001 =", value, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CAC001 <>", value, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001GreaterThan(String value) {
            addCriterion("c_Rule_name_CAC001 >", value, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAC001 >=", value, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001LessThan(String value) {
            addCriterion("c_Rule_name_CAC001 <", value, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAC001 <=", value, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001Like(String value) {
            addCriterion("c_Rule_name_CAC001 like", value, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001NotLike(String value) {
            addCriterion("c_Rule_name_CAC001 not like", value, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001In(List<String> values) {
            addCriterion("c_Rule_name_CAC001 in", values, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CAC001 not in", values, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CAC001 between", value1, value2, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCac001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CAC001 not between", value1, value2, "cRuleNameCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001IsNull() {
            addCriterion("c_Rule_weight_CAC001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001IsNotNull() {
            addCriterion("c_Rule_weight_CAC001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001EqualTo(String value) {
            addCriterion("c_Rule_weight_CAC001 =", value, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CAC001 <>", value, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CAC001 >", value, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAC001 >=", value, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001LessThan(String value) {
            addCriterion("c_Rule_weight_CAC001 <", value, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAC001 <=", value, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001Like(String value) {
            addCriterion("c_Rule_weight_CAC001 like", value, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001NotLike(String value) {
            addCriterion("c_Rule_weight_CAC001 not like", value, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001In(List<String> values) {
            addCriterion("c_Rule_weight_CAC001 in", values, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CAC001 not in", values, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CAC001 between", value1, value2, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCac001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CAC001 not between", value1, value2, "cRuleWeightCac001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001IsNull() {
            addCriterion("c_Rule_name_CAD001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001IsNotNull() {
            addCriterion("c_Rule_name_CAD001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001EqualTo(String value) {
            addCriterion("c_Rule_name_CAD001 =", value, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CAD001 <>", value, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001GreaterThan(String value) {
            addCriterion("c_Rule_name_CAD001 >", value, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAD001 >=", value, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001LessThan(String value) {
            addCriterion("c_Rule_name_CAD001 <", value, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAD001 <=", value, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001Like(String value) {
            addCriterion("c_Rule_name_CAD001 like", value, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001NotLike(String value) {
            addCriterion("c_Rule_name_CAD001 not like", value, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001In(List<String> values) {
            addCriterion("c_Rule_name_CAD001 in", values, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CAD001 not in", values, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CAD001 between", value1, value2, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCad001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CAD001 not between", value1, value2, "cRuleNameCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001IsNull() {
            addCriterion("c_Rule_weight_CAD001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001IsNotNull() {
            addCriterion("c_Rule_weight_CAD001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001EqualTo(String value) {
            addCriterion("c_Rule_weight_CAD001 =", value, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CAD001 <>", value, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CAD001 >", value, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAD001 >=", value, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001LessThan(String value) {
            addCriterion("c_Rule_weight_CAD001 <", value, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAD001 <=", value, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001Like(String value) {
            addCriterion("c_Rule_weight_CAD001 like", value, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001NotLike(String value) {
            addCriterion("c_Rule_weight_CAD001 not like", value, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001In(List<String> values) {
            addCriterion("c_Rule_weight_CAD001 in", values, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CAD001 not in", values, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CAD001 between", value1, value2, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCad001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CAD001 not between", value1, value2, "cRuleWeightCad001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001IsNull() {
            addCriterion("c_Rule_name_CAE001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001IsNotNull() {
            addCriterion("c_Rule_name_CAE001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001EqualTo(String value) {
            addCriterion("c_Rule_name_CAE001 =", value, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CAE001 <>", value, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001GreaterThan(String value) {
            addCriterion("c_Rule_name_CAE001 >", value, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAE001 >=", value, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001LessThan(String value) {
            addCriterion("c_Rule_name_CAE001 <", value, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAE001 <=", value, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001Like(String value) {
            addCriterion("c_Rule_name_CAE001 like", value, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001NotLike(String value) {
            addCriterion("c_Rule_name_CAE001 not like", value, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001In(List<String> values) {
            addCriterion("c_Rule_name_CAE001 in", values, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CAE001 not in", values, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CAE001 between", value1, value2, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCae001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CAE001 not between", value1, value2, "cRuleNameCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001IsNull() {
            addCriterion("c_Rule_weight_CAE001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001IsNotNull() {
            addCriterion("c_Rule_weight_CAE001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001EqualTo(String value) {
            addCriterion("c_Rule_weight_CAE001 =", value, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CAE001 <>", value, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CAE001 >", value, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAE001 >=", value, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001LessThan(String value) {
            addCriterion("c_Rule_weight_CAE001 <", value, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAE001 <=", value, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001Like(String value) {
            addCriterion("c_Rule_weight_CAE001 like", value, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001NotLike(String value) {
            addCriterion("c_Rule_weight_CAE001 not like", value, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001In(List<String> values) {
            addCriterion("c_Rule_weight_CAE001 in", values, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CAE001 not in", values, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CAE001 between", value1, value2, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCae001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CAE001 not between", value1, value2, "cRuleWeightCae001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001IsNull() {
            addCriterion("c_Rule_name_CAF001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001IsNotNull() {
            addCriterion("c_Rule_name_CAF001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001EqualTo(String value) {
            addCriterion("c_Rule_name_CAF001 =", value, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CAF001 <>", value, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001GreaterThan(String value) {
            addCriterion("c_Rule_name_CAF001 >", value, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAF001 >=", value, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001LessThan(String value) {
            addCriterion("c_Rule_name_CAF001 <", value, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAF001 <=", value, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001Like(String value) {
            addCriterion("c_Rule_name_CAF001 like", value, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001NotLike(String value) {
            addCriterion("c_Rule_name_CAF001 not like", value, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001In(List<String> values) {
            addCriterion("c_Rule_name_CAF001 in", values, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CAF001 not in", values, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CAF001 between", value1, value2, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCaf001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CAF001 not between", value1, value2, "cRuleNameCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001IsNull() {
            addCriterion("c_Rule_weight_CAF001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001IsNotNull() {
            addCriterion("c_Rule_weight_CAF001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001EqualTo(String value) {
            addCriterion("c_Rule_weight_CAF001 =", value, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CAF001 <>", value, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CAF001 >", value, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAF001 >=", value, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001LessThan(String value) {
            addCriterion("c_Rule_weight_CAF001 <", value, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAF001 <=", value, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001Like(String value) {
            addCriterion("c_Rule_weight_CAF001 like", value, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001NotLike(String value) {
            addCriterion("c_Rule_weight_CAF001 not like", value, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001In(List<String> values) {
            addCriterion("c_Rule_weight_CAF001 in", values, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CAF001 not in", values, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CAF001 between", value1, value2, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCaf001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CAF001 not between", value1, value2, "cRuleWeightCaf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001IsNull() {
            addCriterion("c_Rule_name_CAG001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001IsNotNull() {
            addCriterion("c_Rule_name_CAG001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001EqualTo(String value) {
            addCriterion("c_Rule_name_CAG001 =", value, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CAG001 <>", value, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001GreaterThan(String value) {
            addCriterion("c_Rule_name_CAG001 >", value, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAG001 >=", value, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001LessThan(String value) {
            addCriterion("c_Rule_name_CAG001 <", value, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CAG001 <=", value, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001Like(String value) {
            addCriterion("c_Rule_name_CAG001 like", value, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001NotLike(String value) {
            addCriterion("c_Rule_name_CAG001 not like", value, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001In(List<String> values) {
            addCriterion("c_Rule_name_CAG001 in", values, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CAG001 not in", values, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CAG001 between", value1, value2, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCag001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CAG001 not between", value1, value2, "cRuleNameCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001IsNull() {
            addCriterion("c_Rule_weight_CAG001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001IsNotNull() {
            addCriterion("c_Rule_weight_CAG001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001EqualTo(String value) {
            addCriterion("c_Rule_weight_CAG001 =", value, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CAG001 <>", value, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CAG001 >", value, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAG001 >=", value, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001LessThan(String value) {
            addCriterion("c_Rule_weight_CAG001 <", value, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CAG001 <=", value, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001Like(String value) {
            addCriterion("c_Rule_weight_CAG001 like", value, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001NotLike(String value) {
            addCriterion("c_Rule_weight_CAG001 not like", value, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001In(List<String> values) {
            addCriterion("c_Rule_weight_CAG001 in", values, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CAG001 not in", values, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CAG001 between", value1, value2, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCag001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CAG001 not between", value1, value2, "cRuleWeightCag001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010IsNull() {
            addCriterion("c_Rule_name_QJE010 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010IsNotNull() {
            addCriterion("c_Rule_name_QJE010 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010EqualTo(String value) {
            addCriterion("c_Rule_name_QJE010 =", value, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010NotEqualTo(String value) {
            addCriterion("c_Rule_name_QJE010 <>", value, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010GreaterThan(String value) {
            addCriterion("c_Rule_name_QJE010 >", value, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_QJE010 >=", value, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010LessThan(String value) {
            addCriterion("c_Rule_name_QJE010 <", value, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_QJE010 <=", value, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010Like(String value) {
            addCriterion("c_Rule_name_QJE010 like", value, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010NotLike(String value) {
            addCriterion("c_Rule_name_QJE010 not like", value, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010In(List<String> values) {
            addCriterion("c_Rule_name_QJE010 in", values, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010NotIn(List<String> values) {
            addCriterion("c_Rule_name_QJE010 not in", values, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010Between(String value1, String value2) {
            addCriterion("c_Rule_name_QJE010 between", value1, value2, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje010NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_QJE010 not between", value1, value2, "cRuleNameQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010IsNull() {
            addCriterion("c_Rule_weight_QJE010 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010IsNotNull() {
            addCriterion("c_Rule_weight_QJE010 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010EqualTo(String value) {
            addCriterion("c_Rule_weight_QJE010 =", value, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010NotEqualTo(String value) {
            addCriterion("c_Rule_weight_QJE010 <>", value, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010GreaterThan(String value) {
            addCriterion("c_Rule_weight_QJE010 >", value, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_QJE010 >=", value, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010LessThan(String value) {
            addCriterion("c_Rule_weight_QJE010 <", value, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_QJE010 <=", value, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010Like(String value) {
            addCriterion("c_Rule_weight_QJE010 like", value, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010NotLike(String value) {
            addCriterion("c_Rule_weight_QJE010 not like", value, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010In(List<String> values) {
            addCriterion("c_Rule_weight_QJE010 in", values, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010NotIn(List<String> values) {
            addCriterion("c_Rule_weight_QJE010 not in", values, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010Between(String value1, String value2) {
            addCriterion("c_Rule_weight_QJE010 between", value1, value2, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje010NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_QJE010 not between", value1, value2, "cRuleWeightQje010");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020IsNull() {
            addCriterion("c_Rule_name_QJE020 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020IsNotNull() {
            addCriterion("c_Rule_name_QJE020 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020EqualTo(String value) {
            addCriterion("c_Rule_name_QJE020 =", value, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020NotEqualTo(String value) {
            addCriterion("c_Rule_name_QJE020 <>", value, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020GreaterThan(String value) {
            addCriterion("c_Rule_name_QJE020 >", value, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_QJE020 >=", value, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020LessThan(String value) {
            addCriterion("c_Rule_name_QJE020 <", value, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_QJE020 <=", value, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020Like(String value) {
            addCriterion("c_Rule_name_QJE020 like", value, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020NotLike(String value) {
            addCriterion("c_Rule_name_QJE020 not like", value, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020In(List<String> values) {
            addCriterion("c_Rule_name_QJE020 in", values, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020NotIn(List<String> values) {
            addCriterion("c_Rule_name_QJE020 not in", values, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020Between(String value1, String value2) {
            addCriterion("c_Rule_name_QJE020 between", value1, value2, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameQje020NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_QJE020 not between", value1, value2, "cRuleNameQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020IsNull() {
            addCriterion("c_Rule_weight_QJE020 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020IsNotNull() {
            addCriterion("c_Rule_weight_QJE020 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020EqualTo(String value) {
            addCriterion("c_Rule_weight_QJE020 =", value, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020NotEqualTo(String value) {
            addCriterion("c_Rule_weight_QJE020 <>", value, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020GreaterThan(String value) {
            addCriterion("c_Rule_weight_QJE020 >", value, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_QJE020 >=", value, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020LessThan(String value) {
            addCriterion("c_Rule_weight_QJE020 <", value, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_QJE020 <=", value, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020Like(String value) {
            addCriterion("c_Rule_weight_QJE020 like", value, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020NotLike(String value) {
            addCriterion("c_Rule_weight_QJE020 not like", value, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020In(List<String> values) {
            addCriterion("c_Rule_weight_QJE020 in", values, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020NotIn(List<String> values) {
            addCriterion("c_Rule_weight_QJE020 not in", values, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020Between(String value1, String value2) {
            addCriterion("c_Rule_weight_QJE020 between", value1, value2, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightQje020NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_QJE020 not between", value1, value2, "cRuleWeightQje020");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001IsNull() {
            addCriterion("c_Rule_name_CBB001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001IsNotNull() {
            addCriterion("c_Rule_name_CBB001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001EqualTo(String value) {
            addCriterion("c_Rule_name_CBB001 =", value, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CBB001 <>", value, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001GreaterThan(String value) {
            addCriterion("c_Rule_name_CBB001 >", value, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBB001 >=", value, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001LessThan(String value) {
            addCriterion("c_Rule_name_CBB001 <", value, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBB001 <=", value, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001Like(String value) {
            addCriterion("c_Rule_name_CBB001 like", value, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001NotLike(String value) {
            addCriterion("c_Rule_name_CBB001 not like", value, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001In(List<String> values) {
            addCriterion("c_Rule_name_CBB001 in", values, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CBB001 not in", values, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CBB001 between", value1, value2, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbb001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CBB001 not between", value1, value2, "cRuleNameCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001IsNull() {
            addCriterion("c_Rule_weight_CBB001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001IsNotNull() {
            addCriterion("c_Rule_weight_CBB001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001EqualTo(String value) {
            addCriterion("c_Rule_weight_CBB001 =", value, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CBB001 <>", value, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CBB001 >", value, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBB001 >=", value, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001LessThan(String value) {
            addCriterion("c_Rule_weight_CBB001 <", value, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBB001 <=", value, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001Like(String value) {
            addCriterion("c_Rule_weight_CBB001 like", value, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001NotLike(String value) {
            addCriterion("c_Rule_weight_CBB001 not like", value, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001In(List<String> values) {
            addCriterion("c_Rule_weight_CBB001 in", values, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CBB001 not in", values, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CBB001 between", value1, value2, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbb001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CBB001 not between", value1, value2, "cRuleWeightCbb001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003IsNull() {
            addCriterion("c_Rule_name_CBG003 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003IsNotNull() {
            addCriterion("c_Rule_name_CBG003 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003EqualTo(String value) {
            addCriterion("c_Rule_name_CBG003 =", value, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003NotEqualTo(String value) {
            addCriterion("c_Rule_name_CBG003 <>", value, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003GreaterThan(String value) {
            addCriterion("c_Rule_name_CBG003 >", value, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBG003 >=", value, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003LessThan(String value) {
            addCriterion("c_Rule_name_CBG003 <", value, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBG003 <=", value, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003Like(String value) {
            addCriterion("c_Rule_name_CBG003 like", value, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003NotLike(String value) {
            addCriterion("c_Rule_name_CBG003 not like", value, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003In(List<String> values) {
            addCriterion("c_Rule_name_CBG003 in", values, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003NotIn(List<String> values) {
            addCriterion("c_Rule_name_CBG003 not in", values, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003Between(String value1, String value2) {
            addCriterion("c_Rule_name_CBG003 between", value1, value2, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbg003NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CBG003 not between", value1, value2, "cRuleNameCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003IsNull() {
            addCriterion("c_Rule_weight_CBG003 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003IsNotNull() {
            addCriterion("c_Rule_weight_CBG003 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003EqualTo(String value) {
            addCriterion("c_Rule_weight_CBG003 =", value, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CBG003 <>", value, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003GreaterThan(String value) {
            addCriterion("c_Rule_weight_CBG003 >", value, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBG003 >=", value, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003LessThan(String value) {
            addCriterion("c_Rule_weight_CBG003 <", value, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBG003 <=", value, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003Like(String value) {
            addCriterion("c_Rule_weight_CBG003 like", value, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003NotLike(String value) {
            addCriterion("c_Rule_weight_CBG003 not like", value, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003In(List<String> values) {
            addCriterion("c_Rule_weight_CBG003 in", values, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CBG003 not in", values, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CBG003 between", value1, value2, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbg003NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CBG003 not between", value1, value2, "cRuleWeightCbg003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001IsNull() {
            addCriterion("c_Rule_name_CBF001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001IsNotNull() {
            addCriterion("c_Rule_name_CBF001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001EqualTo(String value) {
            addCriterion("c_Rule_name_CBF001 =", value, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CBF001 <>", value, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001GreaterThan(String value) {
            addCriterion("c_Rule_name_CBF001 >", value, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBF001 >=", value, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001LessThan(String value) {
            addCriterion("c_Rule_name_CBF001 <", value, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBF001 <=", value, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001Like(String value) {
            addCriterion("c_Rule_name_CBF001 like", value, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001NotLike(String value) {
            addCriterion("c_Rule_name_CBF001 not like", value, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001In(List<String> values) {
            addCriterion("c_Rule_name_CBF001 in", values, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CBF001 not in", values, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CBF001 between", value1, value2, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbf001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CBF001 not between", value1, value2, "cRuleNameCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001IsNull() {
            addCriterion("c_Rule_weight_CBF001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001IsNotNull() {
            addCriterion("c_Rule_weight_CBF001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001EqualTo(String value) {
            addCriterion("c_Rule_weight_CBF001 =", value, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CBF001 <>", value, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CBF001 >", value, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBF001 >=", value, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001LessThan(String value) {
            addCriterion("c_Rule_weight_CBF001 <", value, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBF001 <=", value, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001Like(String value) {
            addCriterion("c_Rule_weight_CBF001 like", value, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001NotLike(String value) {
            addCriterion("c_Rule_weight_CBF001 not like", value, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001In(List<String> values) {
            addCriterion("c_Rule_weight_CBF001 in", values, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CBF001 not in", values, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CBF001 between", value1, value2, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbf001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CBF001 not between", value1, value2, "cRuleWeightCbf001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001IsNull() {
            addCriterion("c_Rule_name_CBE001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001IsNotNull() {
            addCriterion("c_Rule_name_CBE001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001EqualTo(String value) {
            addCriterion("c_Rule_name_CBE001 =", value, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001NotEqualTo(String value) {
            addCriterion("c_Rule_name_CBE001 <>", value, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001GreaterThan(String value) {
            addCriterion("c_Rule_name_CBE001 >", value, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBE001 >=", value, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001LessThan(String value) {
            addCriterion("c_Rule_name_CBE001 <", value, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBE001 <=", value, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001Like(String value) {
            addCriterion("c_Rule_name_CBE001 like", value, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001NotLike(String value) {
            addCriterion("c_Rule_name_CBE001 not like", value, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001In(List<String> values) {
            addCriterion("c_Rule_name_CBE001 in", values, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001NotIn(List<String> values) {
            addCriterion("c_Rule_name_CBE001 not in", values, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001Between(String value1, String value2) {
            addCriterion("c_Rule_name_CBE001 between", value1, value2, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbe001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CBE001 not between", value1, value2, "cRuleNameCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001IsNull() {
            addCriterion("c_Rule_weight_CBE001 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001IsNotNull() {
            addCriterion("c_Rule_weight_CBE001 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001EqualTo(String value) {
            addCriterion("c_Rule_weight_CBE001 =", value, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CBE001 <>", value, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001GreaterThan(String value) {
            addCriterion("c_Rule_weight_CBE001 >", value, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBE001 >=", value, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001LessThan(String value) {
            addCriterion("c_Rule_weight_CBE001 <", value, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBE001 <=", value, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001Like(String value) {
            addCriterion("c_Rule_weight_CBE001 like", value, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001NotLike(String value) {
            addCriterion("c_Rule_weight_CBE001 not like", value, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001In(List<String> values) {
            addCriterion("c_Rule_weight_CBE001 in", values, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CBE001 not in", values, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CBE001 between", value1, value2, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbe001NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CBE001 not between", value1, value2, "cRuleWeightCbe001");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003IsNull() {
            addCriterion("c_Rule_name_CBD003 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003IsNotNull() {
            addCriterion("c_Rule_name_CBD003 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003EqualTo(String value) {
            addCriterion("c_Rule_name_CBD003 =", value, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003NotEqualTo(String value) {
            addCriterion("c_Rule_name_CBD003 <>", value, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003GreaterThan(String value) {
            addCriterion("c_Rule_name_CBD003 >", value, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBD003 >=", value, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003LessThan(String value) {
            addCriterion("c_Rule_name_CBD003 <", value, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBD003 <=", value, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003Like(String value) {
            addCriterion("c_Rule_name_CBD003 like", value, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003NotLike(String value) {
            addCriterion("c_Rule_name_CBD003 not like", value, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003In(List<String> values) {
            addCriterion("c_Rule_name_CBD003 in", values, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003NotIn(List<String> values) {
            addCriterion("c_Rule_name_CBD003 not in", values, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003Between(String value1, String value2) {
            addCriterion("c_Rule_name_CBD003 between", value1, value2, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbd003NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CBD003 not between", value1, value2, "cRuleNameCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003IsNull() {
            addCriterion("c_Rule_weight_CBD003 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003IsNotNull() {
            addCriterion("c_Rule_weight_CBD003 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003EqualTo(String value) {
            addCriterion("c_Rule_weight_CBD003 =", value, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CBD003 <>", value, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003GreaterThan(String value) {
            addCriterion("c_Rule_weight_CBD003 >", value, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBD003 >=", value, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003LessThan(String value) {
            addCriterion("c_Rule_weight_CBD003 <", value, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBD003 <=", value, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003Like(String value) {
            addCriterion("c_Rule_weight_CBD003 like", value, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003NotLike(String value) {
            addCriterion("c_Rule_weight_CBD003 not like", value, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003In(List<String> values) {
            addCriterion("c_Rule_weight_CBD003 in", values, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CBD003 not in", values, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CBD003 between", value1, value2, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbd003NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CBD003 not between", value1, value2, "cRuleWeightCbd003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003IsNull() {
            addCriterion("c_Rule_name_CBC003 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003IsNotNull() {
            addCriterion("c_Rule_name_CBC003 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003EqualTo(String value) {
            addCriterion("c_Rule_name_CBC003 =", value, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003NotEqualTo(String value) {
            addCriterion("c_Rule_name_CBC003 <>", value, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003GreaterThan(String value) {
            addCriterion("c_Rule_name_CBC003 >", value, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBC003 >=", value, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003LessThan(String value) {
            addCriterion("c_Rule_name_CBC003 <", value, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_name_CBC003 <=", value, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003Like(String value) {
            addCriterion("c_Rule_name_CBC003 like", value, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003NotLike(String value) {
            addCriterion("c_Rule_name_CBC003 not like", value, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003In(List<String> values) {
            addCriterion("c_Rule_name_CBC003 in", values, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003NotIn(List<String> values) {
            addCriterion("c_Rule_name_CBC003 not in", values, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003Between(String value1, String value2) {
            addCriterion("c_Rule_name_CBC003 between", value1, value2, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleNameCbc003NotBetween(String value1, String value2) {
            addCriterion("c_Rule_name_CBC003 not between", value1, value2, "cRuleNameCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003IsNull() {
            addCriterion("c_Rule_weight_CBC003 is null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003IsNotNull() {
            addCriterion("c_Rule_weight_CBC003 is not null");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003EqualTo(String value) {
            addCriterion("c_Rule_weight_CBC003 =", value, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003NotEqualTo(String value) {
            addCriterion("c_Rule_weight_CBC003 <>", value, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003GreaterThan(String value) {
            addCriterion("c_Rule_weight_CBC003 >", value, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003GreaterThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBC003 >=", value, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003LessThan(String value) {
            addCriterion("c_Rule_weight_CBC003 <", value, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003LessThanOrEqualTo(String value) {
            addCriterion("c_Rule_weight_CBC003 <=", value, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003Like(String value) {
            addCriterion("c_Rule_weight_CBC003 like", value, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003NotLike(String value) {
            addCriterion("c_Rule_weight_CBC003 not like", value, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003In(List<String> values) {
            addCriterion("c_Rule_weight_CBC003 in", values, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003NotIn(List<String> values) {
            addCriterion("c_Rule_weight_CBC003 not in", values, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003Between(String value1, String value2) {
            addCriterion("c_Rule_weight_CBC003 between", value1, value2, "cRuleWeightCbc003");
            return (Criteria) this;
        }

        public Criteria andCRuleWeightCbc003NotBetween(String value1, String value2) {
            addCriterion("c_Rule_weight_CBC003 not between", value1, value2, "cRuleWeightCbc003");
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