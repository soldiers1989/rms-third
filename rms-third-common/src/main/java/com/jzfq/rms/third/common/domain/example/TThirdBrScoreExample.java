package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TThirdBrScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdBrScoreExample() {
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

        public Criteria andCFlagScoreIsNull() {
            addCriterion("c_flag_score is null");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreIsNotNull() {
            addCriterion("c_flag_score is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreEqualTo(String value) {
            addCriterion("c_flag_score =", value, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreNotEqualTo(String value) {
            addCriterion("c_flag_score <>", value, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreGreaterThan(String value) {
            addCriterion("c_flag_score >", value, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_score >=", value, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreLessThan(String value) {
            addCriterion("c_flag_score <", value, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreLessThanOrEqualTo(String value) {
            addCriterion("c_flag_score <=", value, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreLike(String value) {
            addCriterion("c_flag_score like", value, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreNotLike(String value) {
            addCriterion("c_flag_score not like", value, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreIn(List<String> values) {
            addCriterion("c_flag_score in", values, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreNotIn(List<String> values) {
            addCriterion("c_flag_score not in", values, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreBetween(String value1, String value2) {
            addCriterion("c_flag_score between", value1, value2, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCFlagScoreNotBetween(String value1, String value2) {
            addCriterion("c_flag_score not between", value1, value2, "cFlagScore");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlIsNull() {
            addCriterion("c_scoreafpdl is null");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlIsNotNull() {
            addCriterion("c_scoreafpdl is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlEqualTo(String value) {
            addCriterion("c_scoreafpdl =", value, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlNotEqualTo(String value) {
            addCriterion("c_scoreafpdl <>", value, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlGreaterThan(String value) {
            addCriterion("c_scoreafpdl >", value, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlGreaterThanOrEqualTo(String value) {
            addCriterion("c_scoreafpdl >=", value, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlLessThan(String value) {
            addCriterion("c_scoreafpdl <", value, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlLessThanOrEqualTo(String value) {
            addCriterion("c_scoreafpdl <=", value, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlLike(String value) {
            addCriterion("c_scoreafpdl like", value, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlNotLike(String value) {
            addCriterion("c_scoreafpdl not like", value, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlIn(List<String> values) {
            addCriterion("c_scoreafpdl in", values, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlNotIn(List<String> values) {
            addCriterion("c_scoreafpdl not in", values, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlBetween(String value1, String value2) {
            addCriterion("c_scoreafpdl between", value1, value2, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafpdlNotBetween(String value1, String value2) {
            addCriterion("c_scoreafpdl not between", value1, value2, "cScoreafpdl");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonIsNull() {
            addCriterion("c_scoreafcashon is null");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonIsNotNull() {
            addCriterion("c_scoreafcashon is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonEqualTo(String value) {
            addCriterion("c_scoreafcashon =", value, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonNotEqualTo(String value) {
            addCriterion("c_scoreafcashon <>", value, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonGreaterThan(String value) {
            addCriterion("c_scoreafcashon >", value, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonGreaterThanOrEqualTo(String value) {
            addCriterion("c_scoreafcashon >=", value, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonLessThan(String value) {
            addCriterion("c_scoreafcashon <", value, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonLessThanOrEqualTo(String value) {
            addCriterion("c_scoreafcashon <=", value, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonLike(String value) {
            addCriterion("c_scoreafcashon like", value, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonNotLike(String value) {
            addCriterion("c_scoreafcashon not like", value, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonIn(List<String> values) {
            addCriterion("c_scoreafcashon in", values, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonNotIn(List<String> values) {
            addCriterion("c_scoreafcashon not in", values, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonBetween(String value1, String value2) {
            addCriterion("c_scoreafcashon between", value1, value2, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashonNotBetween(String value1, String value2) {
            addCriterion("c_scoreafcashon not between", value1, value2, "cScoreafcashon");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinIsNull() {
            addCriterion("c_scoreafautofin is null");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinIsNotNull() {
            addCriterion("c_scoreafautofin is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinEqualTo(String value) {
            addCriterion("c_scoreafautofin =", value, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinNotEqualTo(String value) {
            addCriterion("c_scoreafautofin <>", value, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinGreaterThan(String value) {
            addCriterion("c_scoreafautofin >", value, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinGreaterThanOrEqualTo(String value) {
            addCriterion("c_scoreafautofin >=", value, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinLessThan(String value) {
            addCriterion("c_scoreafautofin <", value, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinLessThanOrEqualTo(String value) {
            addCriterion("c_scoreafautofin <=", value, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinLike(String value) {
            addCriterion("c_scoreafautofin like", value, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinNotLike(String value) {
            addCriterion("c_scoreafautofin not like", value, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinIn(List<String> values) {
            addCriterion("c_scoreafautofin in", values, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinNotIn(List<String> values) {
            addCriterion("c_scoreafautofin not in", values, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinBetween(String value1, String value2) {
            addCriterion("c_scoreafautofin between", value1, value2, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafautofinNotBetween(String value1, String value2) {
            addCriterion("c_scoreafautofin not between", value1, value2, "cScoreafautofin");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffIsNull() {
            addCriterion("c_scoreafcashoff is null");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffIsNotNull() {
            addCriterion("c_scoreafcashoff is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffEqualTo(String value) {
            addCriterion("c_scoreafcashoff =", value, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffNotEqualTo(String value) {
            addCriterion("c_scoreafcashoff <>", value, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffGreaterThan(String value) {
            addCriterion("c_scoreafcashoff >", value, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffGreaterThanOrEqualTo(String value) {
            addCriterion("c_scoreafcashoff >=", value, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffLessThan(String value) {
            addCriterion("c_scoreafcashoff <", value, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffLessThanOrEqualTo(String value) {
            addCriterion("c_scoreafcashoff <=", value, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffLike(String value) {
            addCriterion("c_scoreafcashoff like", value, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffNotLike(String value) {
            addCriterion("c_scoreafcashoff not like", value, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffIn(List<String> values) {
            addCriterion("c_scoreafcashoff in", values, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffNotIn(List<String> values) {
            addCriterion("c_scoreafcashoff not in", values, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffBetween(String value1, String value2) {
            addCriterion("c_scoreafcashoff between", value1, value2, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafcashoffNotBetween(String value1, String value2) {
            addCriterion("c_scoreafcashoff not between", value1, value2, "cScoreafcashoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffIsNull() {
            addCriterion("c_scoreafconsoff is null");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffIsNotNull() {
            addCriterion("c_scoreafconsoff is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffEqualTo(String value) {
            addCriterion("c_scoreafconsoff =", value, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffNotEqualTo(String value) {
            addCriterion("c_scoreafconsoff <>", value, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffGreaterThan(String value) {
            addCriterion("c_scoreafconsoff >", value, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffGreaterThanOrEqualTo(String value) {
            addCriterion("c_scoreafconsoff >=", value, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffLessThan(String value) {
            addCriterion("c_scoreafconsoff <", value, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffLessThanOrEqualTo(String value) {
            addCriterion("c_scoreafconsoff <=", value, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffLike(String value) {
            addCriterion("c_scoreafconsoff like", value, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffNotLike(String value) {
            addCriterion("c_scoreafconsoff not like", value, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffIn(List<String> values) {
            addCriterion("c_scoreafconsoff in", values, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffNotIn(List<String> values) {
            addCriterion("c_scoreafconsoff not in", values, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffBetween(String value1, String value2) {
            addCriterion("c_scoreafconsoff between", value1, value2, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafconsoffNotBetween(String value1, String value2) {
            addCriterion("c_scoreafconsoff not between", value1, value2, "cScoreafconsoff");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanIsNull() {
            addCriterion("c_scoreafrevoloan is null");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanIsNotNull() {
            addCriterion("c_scoreafrevoloan is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanEqualTo(String value) {
            addCriterion("c_scoreafrevoloan =", value, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanNotEqualTo(String value) {
            addCriterion("c_scoreafrevoloan <>", value, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanGreaterThan(String value) {
            addCriterion("c_scoreafrevoloan >", value, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanGreaterThanOrEqualTo(String value) {
            addCriterion("c_scoreafrevoloan >=", value, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanLessThan(String value) {
            addCriterion("c_scoreafrevoloan <", value, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanLessThanOrEqualTo(String value) {
            addCriterion("c_scoreafrevoloan <=", value, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanLike(String value) {
            addCriterion("c_scoreafrevoloan like", value, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanNotLike(String value) {
            addCriterion("c_scoreafrevoloan not like", value, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanIn(List<String> values) {
            addCriterion("c_scoreafrevoloan in", values, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanNotIn(List<String> values) {
            addCriterion("c_scoreafrevoloan not in", values, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanBetween(String value1, String value2) {
            addCriterion("c_scoreafrevoloan between", value1, value2, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreafrevoloanNotBetween(String value1, String value2) {
            addCriterion("c_scoreafrevoloan not between", value1, value2, "cScoreafrevoloan");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustIsNull() {
            addCriterion("c_Score_scoreafcust is null");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustIsNotNull() {
            addCriterion("c_Score_scoreafcust is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustEqualTo(String value) {
            addCriterion("c_Score_scoreafcust =", value, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustNotEqualTo(String value) {
            addCriterion("c_Score_scoreafcust <>", value, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustGreaterThan(String value) {
            addCriterion("c_Score_scoreafcust >", value, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustGreaterThanOrEqualTo(String value) {
            addCriterion("c_Score_scoreafcust >=", value, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustLessThan(String value) {
            addCriterion("c_Score_scoreafcust <", value, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustLessThanOrEqualTo(String value) {
            addCriterion("c_Score_scoreafcust <=", value, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustLike(String value) {
            addCriterion("c_Score_scoreafcust like", value, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustNotLike(String value) {
            addCriterion("c_Score_scoreafcust not like", value, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustIn(List<String> values) {
            addCriterion("c_Score_scoreafcust in", values, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustNotIn(List<String> values) {
            addCriterion("c_Score_scoreafcust not in", values, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustBetween(String value1, String value2) {
            addCriterion("c_Score_scoreafcust between", value1, value2, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScoreScoreafcustNotBetween(String value1, String value2) {
            addCriterion("c_Score_scoreafcust not between", value1, value2, "cScoreScoreafcust");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2IsNull() {
            addCriterion("c_scorebankv2 is null");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2IsNotNull() {
            addCriterion("c_scorebankv2 is not null");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2EqualTo(String value) {
            addCriterion("c_scorebankv2 =", value, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2NotEqualTo(String value) {
            addCriterion("c_scorebankv2 <>", value, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2GreaterThan(String value) {
            addCriterion("c_scorebankv2 >", value, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2GreaterThanOrEqualTo(String value) {
            addCriterion("c_scorebankv2 >=", value, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2LessThan(String value) {
            addCriterion("c_scorebankv2 <", value, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2LessThanOrEqualTo(String value) {
            addCriterion("c_scorebankv2 <=", value, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2Like(String value) {
            addCriterion("c_scorebankv2 like", value, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2NotLike(String value) {
            addCriterion("c_scorebankv2 not like", value, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2In(List<String> values) {
            addCriterion("c_scorebankv2 in", values, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2NotIn(List<String> values) {
            addCriterion("c_scorebankv2 not in", values, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2Between(String value1, String value2) {
            addCriterion("c_scorebankv2 between", value1, value2, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScorebankv2NotBetween(String value1, String value2) {
            addCriterion("c_scorebankv2 not between", value1, value2, "cScorebankv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2IsNull() {
            addCriterion("c_scoreconsoffv2 is null");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2IsNotNull() {
            addCriterion("c_scoreconsoffv2 is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2EqualTo(String value) {
            addCriterion("c_scoreconsoffv2 =", value, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2NotEqualTo(String value) {
            addCriterion("c_scoreconsoffv2 <>", value, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2GreaterThan(String value) {
            addCriterion("c_scoreconsoffv2 >", value, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2GreaterThanOrEqualTo(String value) {
            addCriterion("c_scoreconsoffv2 >=", value, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2LessThan(String value) {
            addCriterion("c_scoreconsoffv2 <", value, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2LessThanOrEqualTo(String value) {
            addCriterion("c_scoreconsoffv2 <=", value, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2Like(String value) {
            addCriterion("c_scoreconsoffv2 like", value, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2NotLike(String value) {
            addCriterion("c_scoreconsoffv2 not like", value, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2In(List<String> values) {
            addCriterion("c_scoreconsoffv2 in", values, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2NotIn(List<String> values) {
            addCriterion("c_scoreconsoffv2 not in", values, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2Between(String value1, String value2) {
            addCriterion("c_scoreconsoffv2 between", value1, value2, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScoreconsoffv2NotBetween(String value1, String value2) {
            addCriterion("c_scoreconsoffv2 not between", value1, value2, "cScoreconsoffv2");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1IsNull() {
            addCriterion("c_scorepettycashv1 is null");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1IsNotNull() {
            addCriterion("c_scorepettycashv1 is not null");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1EqualTo(String value) {
            addCriterion("c_scorepettycashv1 =", value, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1NotEqualTo(String value) {
            addCriterion("c_scorepettycashv1 <>", value, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1GreaterThan(String value) {
            addCriterion("c_scorepettycashv1 >", value, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1GreaterThanOrEqualTo(String value) {
            addCriterion("c_scorepettycashv1 >=", value, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1LessThan(String value) {
            addCriterion("c_scorepettycashv1 <", value, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1LessThanOrEqualTo(String value) {
            addCriterion("c_scorepettycashv1 <=", value, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1Like(String value) {
            addCriterion("c_scorepettycashv1 like", value, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1NotLike(String value) {
            addCriterion("c_scorepettycashv1 not like", value, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1In(List<String> values) {
            addCriterion("c_scorepettycashv1 in", values, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1NotIn(List<String> values) {
            addCriterion("c_scorepettycashv1 not in", values, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1Between(String value1, String value2) {
            addCriterion("c_scorepettycashv1 between", value1, value2, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorepettycashv1NotBetween(String value1, String value2) {
            addCriterion("c_scorepettycashv1 not between", value1, value2, "cScorepettycashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1IsNull() {
            addCriterion("c_scorelargecashv1 is null");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1IsNotNull() {
            addCriterion("c_scorelargecashv1 is not null");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1EqualTo(String value) {
            addCriterion("c_scorelargecashv1 =", value, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1NotEqualTo(String value) {
            addCriterion("c_scorelargecashv1 <>", value, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1GreaterThan(String value) {
            addCriterion("c_scorelargecashv1 >", value, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1GreaterThanOrEqualTo(String value) {
            addCriterion("c_scorelargecashv1 >=", value, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1LessThan(String value) {
            addCriterion("c_scorelargecashv1 <", value, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1LessThanOrEqualTo(String value) {
            addCriterion("c_scorelargecashv1 <=", value, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1Like(String value) {
            addCriterion("c_scorelargecashv1 like", value, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1NotLike(String value) {
            addCriterion("c_scorelargecashv1 not like", value, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1In(List<String> values) {
            addCriterion("c_scorelargecashv1 in", values, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1NotIn(List<String> values) {
            addCriterion("c_scorelargecashv1 not in", values, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1Between(String value1, String value2) {
            addCriterion("c_scorelargecashv1 between", value1, value2, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv1NotBetween(String value1, String value2) {
            addCriterion("c_scorelargecashv1 not between", value1, value2, "cScorelargecashv1");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2IsNull() {
            addCriterion("c_scorelargecashv2 is null");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2IsNotNull() {
            addCriterion("c_scorelargecashv2 is not null");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2EqualTo(String value) {
            addCriterion("c_scorelargecashv2 =", value, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2NotEqualTo(String value) {
            addCriterion("c_scorelargecashv2 <>", value, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2GreaterThan(String value) {
            addCriterion("c_scorelargecashv2 >", value, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2GreaterThanOrEqualTo(String value) {
            addCriterion("c_scorelargecashv2 >=", value, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2LessThan(String value) {
            addCriterion("c_scorelargecashv2 <", value, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2LessThanOrEqualTo(String value) {
            addCriterion("c_scorelargecashv2 <=", value, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2Like(String value) {
            addCriterion("c_scorelargecashv2 like", value, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2NotLike(String value) {
            addCriterion("c_scorelargecashv2 not like", value, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2In(List<String> values) {
            addCriterion("c_scorelargecashv2 in", values, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2NotIn(List<String> values) {
            addCriterion("c_scorelargecashv2 not in", values, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2Between(String value1, String value2) {
            addCriterion("c_scorelargecashv2 between", value1, value2, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorelargecashv2NotBetween(String value1, String value2) {
            addCriterion("c_scorelargecashv2 not between", value1, value2, "cScorelargecashv2");
            return (Criteria) this;
        }

        public Criteria andCScorecustIsNull() {
            addCriterion("c_scorecust is null");
            return (Criteria) this;
        }

        public Criteria andCScorecustIsNotNull() {
            addCriterion("c_scorecust is not null");
            return (Criteria) this;
        }

        public Criteria andCScorecustEqualTo(String value) {
            addCriterion("c_scorecust =", value, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustNotEqualTo(String value) {
            addCriterion("c_scorecust <>", value, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustGreaterThan(String value) {
            addCriterion("c_scorecust >", value, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustGreaterThanOrEqualTo(String value) {
            addCriterion("c_scorecust >=", value, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustLessThan(String value) {
            addCriterion("c_scorecust <", value, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustLessThanOrEqualTo(String value) {
            addCriterion("c_scorecust <=", value, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustLike(String value) {
            addCriterion("c_scorecust like", value, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustNotLike(String value) {
            addCriterion("c_scorecust not like", value, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustIn(List<String> values) {
            addCriterion("c_scorecust in", values, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustNotIn(List<String> values) {
            addCriterion("c_scorecust not in", values, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustBetween(String value1, String value2) {
            addCriterion("c_scorecust between", value1, value2, "cScorecust");
            return (Criteria) this;
        }

        public Criteria andCScorecustNotBetween(String value1, String value2) {
            addCriterion("c_scorecust not between", value1, value2, "cScorecust");
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