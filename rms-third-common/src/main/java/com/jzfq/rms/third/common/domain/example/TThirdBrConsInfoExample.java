package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdBrConsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdBrConsInfoExample() {
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

        public Criteria andCMailIsNull() {
            addCriterion("c_mail is null");
            return (Criteria) this;
        }

        public Criteria andCMailIsNotNull() {
            addCriterion("c_mail is not null");
            return (Criteria) this;
        }

        public Criteria andCMailEqualTo(String value) {
            addCriterion("c_mail =", value, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailNotEqualTo(String value) {
            addCriterion("c_mail <>", value, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailGreaterThan(String value) {
            addCriterion("c_mail >", value, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailGreaterThanOrEqualTo(String value) {
            addCriterion("c_mail >=", value, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailLessThan(String value) {
            addCriterion("c_mail <", value, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailLessThanOrEqualTo(String value) {
            addCriterion("c_mail <=", value, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailLike(String value) {
            addCriterion("c_mail like", value, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailNotLike(String value) {
            addCriterion("c_mail not like", value, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailIn(List<String> values) {
            addCriterion("c_mail in", values, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailNotIn(List<String> values) {
            addCriterion("c_mail not in", values, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailBetween(String value1, String value2) {
            addCriterion("c_mail between", value1, value2, "cMail");
            return (Criteria) this;
        }

        public Criteria andCMailNotBetween(String value1, String value2) {
            addCriterion("c_mail not between", value1, value2, "cMail");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCIsNull() {
            addCriterion("c_flag_consumption_c is null");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCIsNotNull() {
            addCriterion("c_flag_consumption_c is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCEqualTo(String value) {
            addCriterion("c_flag_consumption_c =", value, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCNotEqualTo(String value) {
            addCriterion("c_flag_consumption_c <>", value, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCGreaterThan(String value) {
            addCriterion("c_flag_consumption_c >", value, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_consumption_c >=", value, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCLessThan(String value) {
            addCriterion("c_flag_consumption_c <", value, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCLessThanOrEqualTo(String value) {
            addCriterion("c_flag_consumption_c <=", value, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCLike(String value) {
            addCriterion("c_flag_consumption_c like", value, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCNotLike(String value) {
            addCriterion("c_flag_consumption_c not like", value, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCIn(List<String> values) {
            addCriterion("c_flag_consumption_c in", values, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCNotIn(List<String> values) {
            addCriterion("c_flag_consumption_c not in", values, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCBetween(String value1, String value2) {
            addCriterion("c_flag_consumption_c between", value1, value2, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCFlagConsumptionCNotBetween(String value1, String value2) {
            addCriterion("c_flag_consumption_c not between", value1, value2, "cFlagConsumptionC");
            return (Criteria) this;
        }

        public Criteria andCConsContIsNull() {
            addCriterion("c_cons_cont is null");
            return (Criteria) this;
        }

        public Criteria andCConsContIsNotNull() {
            addCriterion("c_cons_cont is not null");
            return (Criteria) this;
        }

        public Criteria andCConsContEqualTo(String value) {
            addCriterion("c_cons_cont =", value, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContNotEqualTo(String value) {
            addCriterion("c_cons_cont <>", value, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContGreaterThan(String value) {
            addCriterion("c_cons_cont >", value, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_cont >=", value, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContLessThan(String value) {
            addCriterion("c_cons_cont <", value, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContLessThanOrEqualTo(String value) {
            addCriterion("c_cons_cont <=", value, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContLike(String value) {
            addCriterion("c_cons_cont like", value, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContNotLike(String value) {
            addCriterion("c_cons_cont not like", value, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContIn(List<String> values) {
            addCriterion("c_cons_cont in", values, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContNotIn(List<String> values) {
            addCriterion("c_cons_cont not in", values, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContBetween(String value1, String value2) {
            addCriterion("c_cons_cont between", value1, value2, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsContNotBetween(String value1, String value2) {
            addCriterion("c_cons_cont not between", value1, value2, "cConsCont");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentIsNull() {
            addCriterion("c_cons_time_recent is null");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentIsNotNull() {
            addCriterion("c_cons_time_recent is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentEqualTo(String value) {
            addCriterion("c_cons_time_recent =", value, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentNotEqualTo(String value) {
            addCriterion("c_cons_time_recent <>", value, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentGreaterThan(String value) {
            addCriterion("c_cons_time_recent >", value, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_time_recent >=", value, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentLessThan(String value) {
            addCriterion("c_cons_time_recent <", value, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentLessThanOrEqualTo(String value) {
            addCriterion("c_cons_time_recent <=", value, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentLike(String value) {
            addCriterion("c_cons_time_recent like", value, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentNotLike(String value) {
            addCriterion("c_cons_time_recent not like", value, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentIn(List<String> values) {
            addCriterion("c_cons_time_recent in", values, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentNotIn(List<String> values) {
            addCriterion("c_cons_time_recent not in", values, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentBetween(String value1, String value2) {
            addCriterion("c_cons_time_recent between", value1, value2, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTimeRecentNotBetween(String value1, String value2) {
            addCriterion("c_cons_time_recent not between", value1, value2, "cConsTimeRecent");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsIsNull() {
            addCriterion("c_cons_tot_m3_visits is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsIsNotNull() {
            addCriterion("c_cons_tot_m3_visits is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsEqualTo(String value) {
            addCriterion("c_cons_tot_m3_visits =", value, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsNotEqualTo(String value) {
            addCriterion("c_cons_tot_m3_visits <>", value, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsGreaterThan(String value) {
            addCriterion("c_cons_tot_m3_visits >", value, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_visits >=", value, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsLessThan(String value) {
            addCriterion("c_cons_tot_m3_visits <", value, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_visits <=", value, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsLike(String value) {
            addCriterion("c_cons_tot_m3_visits like", value, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsNotLike(String value) {
            addCriterion("c_cons_tot_m3_visits not like", value, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsIn(List<String> values) {
            addCriterion("c_cons_tot_m3_visits in", values, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsNotIn(List<String> values) {
            addCriterion("c_cons_tot_m3_visits not in", values, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_visits between", value1, value2, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VisitsNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_visits not between", value1, value2, "cConsTotM3Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumIsNull() {
            addCriterion("c_cons_tot_m3_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumIsNotNull() {
            addCriterion("c_cons_tot_m3_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumEqualTo(String value) {
            addCriterion("c_cons_tot_m3_num =", value, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumNotEqualTo(String value) {
            addCriterion("c_cons_tot_m3_num <>", value, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumGreaterThan(String value) {
            addCriterion("c_cons_tot_m3_num >", value, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_num >=", value, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumLessThan(String value) {
            addCriterion("c_cons_tot_m3_num <", value, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_num <=", value, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumLike(String value) {
            addCriterion("c_cons_tot_m3_num like", value, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumNotLike(String value) {
            addCriterion("c_cons_tot_m3_num not like", value, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumIn(List<String> values) {
            addCriterion("c_cons_tot_m3_num in", values, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumNotIn(List<String> values) {
            addCriterion("c_cons_tot_m3_num not in", values, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_num between", value1, value2, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3NumNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_num not between", value1, value2, "cConsTotM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayIsNull() {
            addCriterion("c_cons_tot_m3_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayIsNotNull() {
            addCriterion("c_cons_tot_m3_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayEqualTo(String value) {
            addCriterion("c_cons_tot_m3_pay =", value, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayNotEqualTo(String value) {
            addCriterion("c_cons_tot_m3_pay <>", value, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayGreaterThan(String value) {
            addCriterion("c_cons_tot_m3_pay >", value, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_pay >=", value, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayLessThan(String value) {
            addCriterion("c_cons_tot_m3_pay <", value, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_pay <=", value, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayLike(String value) {
            addCriterion("c_cons_tot_m3_pay like", value, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayNotLike(String value) {
            addCriterion("c_cons_tot_m3_pay not like", value, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayIn(List<String> values) {
            addCriterion("c_cons_tot_m3_pay in", values, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayNotIn(List<String> values) {
            addCriterion("c_cons_tot_m3_pay not in", values, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_pay between", value1, value2, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PayNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_pay not between", value1, value2, "cConsTotM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumIsNull() {
            addCriterion("c_cons_tot_m3_p_catenum is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumIsNotNull() {
            addCriterion("c_cons_tot_m3_p_catenum is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumEqualTo(String value) {
            addCriterion("c_cons_tot_m3_p_catenum =", value, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumNotEqualTo(String value) {
            addCriterion("c_cons_tot_m3_p_catenum <>", value, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumGreaterThan(String value) {
            addCriterion("c_cons_tot_m3_p_catenum >", value, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_p_catenum >=", value, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumLessThan(String value) {
            addCriterion("c_cons_tot_m3_p_catenum <", value, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_p_catenum <=", value, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumLike(String value) {
            addCriterion("c_cons_tot_m3_p_catenum like", value, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumNotLike(String value) {
            addCriterion("c_cons_tot_m3_p_catenum not like", value, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumIn(List<String> values) {
            addCriterion("c_cons_tot_m3_p_catenum in", values, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumNotIn(List<String> values) {
            addCriterion("c_cons_tot_m3_p_catenum not in", values, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_p_catenum between", value1, value2, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3PCatenumNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_p_catenum not between", value1, value2, "cConsTotM3PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumIsNull() {
            addCriterion("c_cons_tot_m3_v_catenum is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumIsNotNull() {
            addCriterion("c_cons_tot_m3_v_catenum is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumEqualTo(String value) {
            addCriterion("c_cons_tot_m3_v_catenum =", value, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumNotEqualTo(String value) {
            addCriterion("c_cons_tot_m3_v_catenum <>", value, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumGreaterThan(String value) {
            addCriterion("c_cons_tot_m3_v_catenum >", value, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_v_catenum >=", value, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumLessThan(String value) {
            addCriterion("c_cons_tot_m3_v_catenum <", value, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m3_v_catenum <=", value, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumLike(String value) {
            addCriterion("c_cons_tot_m3_v_catenum like", value, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumNotLike(String value) {
            addCriterion("c_cons_tot_m3_v_catenum not like", value, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumIn(List<String> values) {
            addCriterion("c_cons_tot_m3_v_catenum in", values, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumNotIn(List<String> values) {
            addCriterion("c_cons_tot_m3_v_catenum not in", values, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_v_catenum between", value1, value2, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM3VCatenumNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m3_v_catenum not between", value1, value2, "cConsTotM3VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsIsNull() {
            addCriterion("c_cons_tot_m12_visits is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsIsNotNull() {
            addCriterion("c_cons_tot_m12_visits is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsEqualTo(String value) {
            addCriterion("c_cons_tot_m12_visits =", value, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsNotEqualTo(String value) {
            addCriterion("c_cons_tot_m12_visits <>", value, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsGreaterThan(String value) {
            addCriterion("c_cons_tot_m12_visits >", value, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_visits >=", value, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsLessThan(String value) {
            addCriterion("c_cons_tot_m12_visits <", value, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_visits <=", value, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsLike(String value) {
            addCriterion("c_cons_tot_m12_visits like", value, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsNotLike(String value) {
            addCriterion("c_cons_tot_m12_visits not like", value, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsIn(List<String> values) {
            addCriterion("c_cons_tot_m12_visits in", values, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsNotIn(List<String> values) {
            addCriterion("c_cons_tot_m12_visits not in", values, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_visits between", value1, value2, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VisitsNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_visits not between", value1, value2, "cConsTotM12Visits");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumIsNull() {
            addCriterion("c_cons_tot_m12_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumIsNotNull() {
            addCriterion("c_cons_tot_m12_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumEqualTo(String value) {
            addCriterion("c_cons_tot_m12_num =", value, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumNotEqualTo(String value) {
            addCriterion("c_cons_tot_m12_num <>", value, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumGreaterThan(String value) {
            addCriterion("c_cons_tot_m12_num >", value, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_num >=", value, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumLessThan(String value) {
            addCriterion("c_cons_tot_m12_num <", value, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_num <=", value, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumLike(String value) {
            addCriterion("c_cons_tot_m12_num like", value, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumNotLike(String value) {
            addCriterion("c_cons_tot_m12_num not like", value, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumIn(List<String> values) {
            addCriterion("c_cons_tot_m12_num in", values, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumNotIn(List<String> values) {
            addCriterion("c_cons_tot_m12_num not in", values, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_num between", value1, value2, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12NumNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_num not between", value1, value2, "cConsTotM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayIsNull() {
            addCriterion("c_cons_tot_m12_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayIsNotNull() {
            addCriterion("c_cons_tot_m12_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayEqualTo(String value) {
            addCriterion("c_cons_tot_m12_pay =", value, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayNotEqualTo(String value) {
            addCriterion("c_cons_tot_m12_pay <>", value, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayGreaterThan(String value) {
            addCriterion("c_cons_tot_m12_pay >", value, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_pay >=", value, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayLessThan(String value) {
            addCriterion("c_cons_tot_m12_pay <", value, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_pay <=", value, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayLike(String value) {
            addCriterion("c_cons_tot_m12_pay like", value, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayNotLike(String value) {
            addCriterion("c_cons_tot_m12_pay not like", value, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayIn(List<String> values) {
            addCriterion("c_cons_tot_m12_pay in", values, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayNotIn(List<String> values) {
            addCriterion("c_cons_tot_m12_pay not in", values, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_pay between", value1, value2, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PayNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_pay not between", value1, value2, "cConsTotM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumIsNull() {
            addCriterion("c_cons_tot_m12_p_catenum is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumIsNotNull() {
            addCriterion("c_cons_tot_m12_p_catenum is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumEqualTo(String value) {
            addCriterion("c_cons_tot_m12_p_catenum =", value, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumNotEqualTo(String value) {
            addCriterion("c_cons_tot_m12_p_catenum <>", value, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumGreaterThan(String value) {
            addCriterion("c_cons_tot_m12_p_catenum >", value, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_p_catenum >=", value, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumLessThan(String value) {
            addCriterion("c_cons_tot_m12_p_catenum <", value, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_p_catenum <=", value, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumLike(String value) {
            addCriterion("c_cons_tot_m12_p_catenum like", value, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumNotLike(String value) {
            addCriterion("c_cons_tot_m12_p_catenum not like", value, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumIn(List<String> values) {
            addCriterion("c_cons_tot_m12_p_catenum in", values, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumNotIn(List<String> values) {
            addCriterion("c_cons_tot_m12_p_catenum not in", values, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_p_catenum between", value1, value2, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12PCatenumNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_p_catenum not between", value1, value2, "cConsTotM12PCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumIsNull() {
            addCriterion("c_cons_tot_m12_v_catenum is null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumIsNotNull() {
            addCriterion("c_cons_tot_m12_v_catenum is not null");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumEqualTo(String value) {
            addCriterion("c_cons_tot_m12_v_catenum =", value, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumNotEqualTo(String value) {
            addCriterion("c_cons_tot_m12_v_catenum <>", value, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumGreaterThan(String value) {
            addCriterion("c_cons_tot_m12_v_catenum >", value, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_v_catenum >=", value, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumLessThan(String value) {
            addCriterion("c_cons_tot_m12_v_catenum <", value, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_tot_m12_v_catenum <=", value, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumLike(String value) {
            addCriterion("c_cons_tot_m12_v_catenum like", value, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumNotLike(String value) {
            addCriterion("c_cons_tot_m12_v_catenum not like", value, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumIn(List<String> values) {
            addCriterion("c_cons_tot_m12_v_catenum in", values, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumNotIn(List<String> values) {
            addCriterion("c_cons_tot_m12_v_catenum not in", values, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_v_catenum between", value1, value2, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsTotM12VCatenumNotBetween(String value1, String value2) {
            addCriterion("c_cons_tot_m12_v_catenum not between", value1, value2, "cConsTotM12VCatenum");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumIsNull() {
            addCriterion("c_cons_max_m3_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumIsNotNull() {
            addCriterion("c_cons_max_m3_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumEqualTo(String value) {
            addCriterion("c_cons_max_m3_num =", value, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumNotEqualTo(String value) {
            addCriterion("c_cons_max_m3_num <>", value, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumGreaterThan(String value) {
            addCriterion("c_cons_max_m3_num >", value, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m3_num >=", value, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumLessThan(String value) {
            addCriterion("c_cons_max_m3_num <", value, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m3_num <=", value, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumLike(String value) {
            addCriterion("c_cons_max_m3_num like", value, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumNotLike(String value) {
            addCriterion("c_cons_max_m3_num not like", value, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumIn(List<String> values) {
            addCriterion("c_cons_max_m3_num in", values, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumNotIn(List<String> values) {
            addCriterion("c_cons_max_m3_num not in", values, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumBetween(String value1, String value2) {
            addCriterion("c_cons_max_m3_num between", value1, value2, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3NumNotBetween(String value1, String value2) {
            addCriterion("c_cons_max_m3_num not between", value1, value2, "cConsMaxM3Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayIsNull() {
            addCriterion("c_cons_max_m3_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayIsNotNull() {
            addCriterion("c_cons_max_m3_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayEqualTo(String value) {
            addCriterion("c_cons_max_m3_pay =", value, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayNotEqualTo(String value) {
            addCriterion("c_cons_max_m3_pay <>", value, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayGreaterThan(String value) {
            addCriterion("c_cons_max_m3_pay >", value, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m3_pay >=", value, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayLessThan(String value) {
            addCriterion("c_cons_max_m3_pay <", value, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m3_pay <=", value, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayLike(String value) {
            addCriterion("c_cons_max_m3_pay like", value, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayNotLike(String value) {
            addCriterion("c_cons_max_m3_pay not like", value, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayIn(List<String> values) {
            addCriterion("c_cons_max_m3_pay in", values, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayNotIn(List<String> values) {
            addCriterion("c_cons_max_m3_pay not in", values, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayBetween(String value1, String value2) {
            addCriterion("c_cons_max_m3_pay between", value1, value2, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PayNotBetween(String value1, String value2) {
            addCriterion("c_cons_max_m3_pay not between", value1, value2, "cConsMaxM3Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateIsNull() {
            addCriterion("c_cons_max_m3_paycate is null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateIsNotNull() {
            addCriterion("c_cons_max_m3_paycate is not null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateEqualTo(String value) {
            addCriterion("c_cons_max_m3_paycate =", value, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateNotEqualTo(String value) {
            addCriterion("c_cons_max_m3_paycate <>", value, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateGreaterThan(String value) {
            addCriterion("c_cons_max_m3_paycate >", value, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m3_paycate >=", value, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateLessThan(String value) {
            addCriterion("c_cons_max_m3_paycate <", value, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateLessThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m3_paycate <=", value, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateLike(String value) {
            addCriterion("c_cons_max_m3_paycate like", value, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateNotLike(String value) {
            addCriterion("c_cons_max_m3_paycate not like", value, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateIn(List<String> values) {
            addCriterion("c_cons_max_m3_paycate in", values, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateNotIn(List<String> values) {
            addCriterion("c_cons_max_m3_paycate not in", values, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateBetween(String value1, String value2) {
            addCriterion("c_cons_max_m3_paycate between", value1, value2, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM3PaycateNotBetween(String value1, String value2) {
            addCriterion("c_cons_max_m3_paycate not between", value1, value2, "cConsMaxM3Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumIsNull() {
            addCriterion("c_cons_max_m12_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumIsNotNull() {
            addCriterion("c_cons_max_m12_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumEqualTo(String value) {
            addCriterion("c_cons_max_m12_num =", value, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumNotEqualTo(String value) {
            addCriterion("c_cons_max_m12_num <>", value, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumGreaterThan(String value) {
            addCriterion("c_cons_max_m12_num >", value, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m12_num >=", value, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumLessThan(String value) {
            addCriterion("c_cons_max_m12_num <", value, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m12_num <=", value, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumLike(String value) {
            addCriterion("c_cons_max_m12_num like", value, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumNotLike(String value) {
            addCriterion("c_cons_max_m12_num not like", value, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumIn(List<String> values) {
            addCriterion("c_cons_max_m12_num in", values, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumNotIn(List<String> values) {
            addCriterion("c_cons_max_m12_num not in", values, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumBetween(String value1, String value2) {
            addCriterion("c_cons_max_m12_num between", value1, value2, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12NumNotBetween(String value1, String value2) {
            addCriterion("c_cons_max_m12_num not between", value1, value2, "cConsMaxM12Num");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayIsNull() {
            addCriterion("c_cons_max_m12_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayIsNotNull() {
            addCriterion("c_cons_max_m12_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayEqualTo(String value) {
            addCriterion("c_cons_max_m12_pay =", value, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayNotEqualTo(String value) {
            addCriterion("c_cons_max_m12_pay <>", value, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayGreaterThan(String value) {
            addCriterion("c_cons_max_m12_pay >", value, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m12_pay >=", value, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayLessThan(String value) {
            addCriterion("c_cons_max_m12_pay <", value, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m12_pay <=", value, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayLike(String value) {
            addCriterion("c_cons_max_m12_pay like", value, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayNotLike(String value) {
            addCriterion("c_cons_max_m12_pay not like", value, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayIn(List<String> values) {
            addCriterion("c_cons_max_m12_pay in", values, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayNotIn(List<String> values) {
            addCriterion("c_cons_max_m12_pay not in", values, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayBetween(String value1, String value2) {
            addCriterion("c_cons_max_m12_pay between", value1, value2, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PayNotBetween(String value1, String value2) {
            addCriterion("c_cons_max_m12_pay not between", value1, value2, "cConsMaxM12Pay");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateIsNull() {
            addCriterion("c_cons_max_m12_paycate is null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateIsNotNull() {
            addCriterion("c_cons_max_m12_paycate is not null");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateEqualTo(String value) {
            addCriterion("c_cons_max_m12_paycate =", value, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateNotEqualTo(String value) {
            addCriterion("c_cons_max_m12_paycate <>", value, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateGreaterThan(String value) {
            addCriterion("c_cons_max_m12_paycate >", value, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m12_paycate >=", value, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateLessThan(String value) {
            addCriterion("c_cons_max_m12_paycate <", value, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateLessThanOrEqualTo(String value) {
            addCriterion("c_cons_max_m12_paycate <=", value, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateLike(String value) {
            addCriterion("c_cons_max_m12_paycate like", value, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateNotLike(String value) {
            addCriterion("c_cons_max_m12_paycate not like", value, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateIn(List<String> values) {
            addCriterion("c_cons_max_m12_paycate in", values, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateNotIn(List<String> values) {
            addCriterion("c_cons_max_m12_paycate not in", values, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateBetween(String value1, String value2) {
            addCriterion("c_cons_max_m12_paycate between", value1, value2, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsMaxM12PaycateNotBetween(String value1, String value2) {
            addCriterion("c_cons_max_m12_paycate not between", value1, value2, "cConsMaxM12Paycate");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumIsNull() {
            addCriterion("c_cons_m3_RYBH_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumIsNotNull() {
            addCriterion("c_cons_m3_RYBH_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumEqualTo(String value) {
            addCriterion("c_cons_m3_RYBH_num =", value, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumNotEqualTo(String value) {
            addCriterion("c_cons_m3_RYBH_num <>", value, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumGreaterThan(String value) {
            addCriterion("c_cons_m3_RYBH_num >", value, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_RYBH_num >=", value, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumLessThan(String value) {
            addCriterion("c_cons_m3_RYBH_num <", value, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_RYBH_num <=", value, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumLike(String value) {
            addCriterion("c_cons_m3_RYBH_num like", value, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumNotLike(String value) {
            addCriterion("c_cons_m3_RYBH_num not like", value, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumIn(List<String> values) {
            addCriterion("c_cons_m3_RYBH_num in", values, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumNotIn(List<String> values) {
            addCriterion("c_cons_m3_RYBH_num not in", values, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumBetween(String value1, String value2) {
            addCriterion("c_cons_m3_RYBH_num between", value1, value2, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhNumNotBetween(String value1, String value2) {
            addCriterion("c_cons_m3_RYBH_num not between", value1, value2, "cConsM3RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayIsNull() {
            addCriterion("c_cons_m3_RYBH_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayIsNotNull() {
            addCriterion("c_cons_m3_RYBH_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayEqualTo(String value) {
            addCriterion("c_cons_m3_RYBH_pay =", value, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayNotEqualTo(String value) {
            addCriterion("c_cons_m3_RYBH_pay <>", value, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayGreaterThan(String value) {
            addCriterion("c_cons_m3_RYBH_pay >", value, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_RYBH_pay >=", value, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayLessThan(String value) {
            addCriterion("c_cons_m3_RYBH_pay <", value, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_RYBH_pay <=", value, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayLike(String value) {
            addCriterion("c_cons_m3_RYBH_pay like", value, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayNotLike(String value) {
            addCriterion("c_cons_m3_RYBH_pay not like", value, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayIn(List<String> values) {
            addCriterion("c_cons_m3_RYBH_pay in", values, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayNotIn(List<String> values) {
            addCriterion("c_cons_m3_RYBH_pay not in", values, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayBetween(String value1, String value2) {
            addCriterion("c_cons_m3_RYBH_pay between", value1, value2, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3RybhPayNotBetween(String value1, String value2) {
            addCriterion("c_cons_m3_RYBH_pay not between", value1, value2, "cConsM3RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumIsNull() {
            addCriterion("c_cons_m3_JYDQ_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumIsNotNull() {
            addCriterion("c_cons_m3_JYDQ_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumEqualTo(String value) {
            addCriterion("c_cons_m3_JYDQ_num =", value, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumNotEqualTo(String value) {
            addCriterion("c_cons_m3_JYDQ_num <>", value, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumGreaterThan(String value) {
            addCriterion("c_cons_m3_JYDQ_num >", value, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_JYDQ_num >=", value, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumLessThan(String value) {
            addCriterion("c_cons_m3_JYDQ_num <", value, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_JYDQ_num <=", value, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumLike(String value) {
            addCriterion("c_cons_m3_JYDQ_num like", value, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumNotLike(String value) {
            addCriterion("c_cons_m3_JYDQ_num not like", value, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumIn(List<String> values) {
            addCriterion("c_cons_m3_JYDQ_num in", values, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumNotIn(List<String> values) {
            addCriterion("c_cons_m3_JYDQ_num not in", values, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumBetween(String value1, String value2) {
            addCriterion("c_cons_m3_JYDQ_num between", value1, value2, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqNumNotBetween(String value1, String value2) {
            addCriterion("c_cons_m3_JYDQ_num not between", value1, value2, "cConsM3JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayIsNull() {
            addCriterion("c_cons_m3_JYDQ_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayIsNotNull() {
            addCriterion("c_cons_m3_JYDQ_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayEqualTo(String value) {
            addCriterion("c_cons_m3_JYDQ_pay =", value, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayNotEqualTo(String value) {
            addCriterion("c_cons_m3_JYDQ_pay <>", value, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayGreaterThan(String value) {
            addCriterion("c_cons_m3_JYDQ_pay >", value, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_JYDQ_pay >=", value, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayLessThan(String value) {
            addCriterion("c_cons_m3_JYDQ_pay <", value, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_JYDQ_pay <=", value, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayLike(String value) {
            addCriterion("c_cons_m3_JYDQ_pay like", value, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayNotLike(String value) {
            addCriterion("c_cons_m3_JYDQ_pay not like", value, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayIn(List<String> values) {
            addCriterion("c_cons_m3_JYDQ_pay in", values, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayNotIn(List<String> values) {
            addCriterion("c_cons_m3_JYDQ_pay not in", values, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayBetween(String value1, String value2) {
            addCriterion("c_cons_m3_JYDQ_pay between", value1, value2, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3JydqPayNotBetween(String value1, String value2) {
            addCriterion("c_cons_m3_JYDQ_pay not between", value1, value2, "cConsM3JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumIsNull() {
            addCriterion("c_cons_m3_MYYP_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumIsNotNull() {
            addCriterion("c_cons_m3_MYYP_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumEqualTo(String value) {
            addCriterion("c_cons_m3_MYYP_num =", value, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumNotEqualTo(String value) {
            addCriterion("c_cons_m3_MYYP_num <>", value, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumGreaterThan(String value) {
            addCriterion("c_cons_m3_MYYP_num >", value, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_MYYP_num >=", value, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumLessThan(String value) {
            addCriterion("c_cons_m3_MYYP_num <", value, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_MYYP_num <=", value, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumLike(String value) {
            addCriterion("c_cons_m3_MYYP_num like", value, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumNotLike(String value) {
            addCriterion("c_cons_m3_MYYP_num not like", value, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumIn(List<String> values) {
            addCriterion("c_cons_m3_MYYP_num in", values, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumNotIn(List<String> values) {
            addCriterion("c_cons_m3_MYYP_num not in", values, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumBetween(String value1, String value2) {
            addCriterion("c_cons_m3_MYYP_num between", value1, value2, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypNumNotBetween(String value1, String value2) {
            addCriterion("c_cons_m3_MYYP_num not between", value1, value2, "cConsM3MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayIsNull() {
            addCriterion("c_cons_m3_MYYP_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayIsNotNull() {
            addCriterion("c_cons_m3_MYYP_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayEqualTo(String value) {
            addCriterion("c_cons_m3_MYYP_pay =", value, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayNotEqualTo(String value) {
            addCriterion("c_cons_m3_MYYP_pay <>", value, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayGreaterThan(String value) {
            addCriterion("c_cons_m3_MYYP_pay >", value, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_MYYP_pay >=", value, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayLessThan(String value) {
            addCriterion("c_cons_m3_MYYP_pay <", value, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m3_MYYP_pay <=", value, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayLike(String value) {
            addCriterion("c_cons_m3_MYYP_pay like", value, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayNotLike(String value) {
            addCriterion("c_cons_m3_MYYP_pay not like", value, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayIn(List<String> values) {
            addCriterion("c_cons_m3_MYYP_pay in", values, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayNotIn(List<String> values) {
            addCriterion("c_cons_m3_MYYP_pay not in", values, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayBetween(String value1, String value2) {
            addCriterion("c_cons_m3_MYYP_pay between", value1, value2, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM3MyypPayNotBetween(String value1, String value2) {
            addCriterion("c_cons_m3_MYYP_pay not between", value1, value2, "cConsM3MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumIsNull() {
            addCriterion("c_cons_m12_RYBH_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumIsNotNull() {
            addCriterion("c_cons_m12_RYBH_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumEqualTo(String value) {
            addCriterion("c_cons_m12_RYBH_num =", value, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumNotEqualTo(String value) {
            addCriterion("c_cons_m12_RYBH_num <>", value, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumGreaterThan(String value) {
            addCriterion("c_cons_m12_RYBH_num >", value, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_RYBH_num >=", value, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumLessThan(String value) {
            addCriterion("c_cons_m12_RYBH_num <", value, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_RYBH_num <=", value, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumLike(String value) {
            addCriterion("c_cons_m12_RYBH_num like", value, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumNotLike(String value) {
            addCriterion("c_cons_m12_RYBH_num not like", value, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumIn(List<String> values) {
            addCriterion("c_cons_m12_RYBH_num in", values, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumNotIn(List<String> values) {
            addCriterion("c_cons_m12_RYBH_num not in", values, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumBetween(String value1, String value2) {
            addCriterion("c_cons_m12_RYBH_num between", value1, value2, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhNumNotBetween(String value1, String value2) {
            addCriterion("c_cons_m12_RYBH_num not between", value1, value2, "cConsM12RybhNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayIsNull() {
            addCriterion("c_cons_m12_RYBH_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayIsNotNull() {
            addCriterion("c_cons_m12_RYBH_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayEqualTo(String value) {
            addCriterion("c_cons_m12_RYBH_pay =", value, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayNotEqualTo(String value) {
            addCriterion("c_cons_m12_RYBH_pay <>", value, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayGreaterThan(String value) {
            addCriterion("c_cons_m12_RYBH_pay >", value, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_RYBH_pay >=", value, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayLessThan(String value) {
            addCriterion("c_cons_m12_RYBH_pay <", value, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_RYBH_pay <=", value, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayLike(String value) {
            addCriterion("c_cons_m12_RYBH_pay like", value, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayNotLike(String value) {
            addCriterion("c_cons_m12_RYBH_pay not like", value, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayIn(List<String> values) {
            addCriterion("c_cons_m12_RYBH_pay in", values, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayNotIn(List<String> values) {
            addCriterion("c_cons_m12_RYBH_pay not in", values, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayBetween(String value1, String value2) {
            addCriterion("c_cons_m12_RYBH_pay between", value1, value2, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12RybhPayNotBetween(String value1, String value2) {
            addCriterion("c_cons_m12_RYBH_pay not between", value1, value2, "cConsM12RybhPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumIsNull() {
            addCriterion("c_cons_m12_JYDQ_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumIsNotNull() {
            addCriterion("c_cons_m12_JYDQ_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumEqualTo(String value) {
            addCriterion("c_cons_m12_JYDQ_num =", value, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumNotEqualTo(String value) {
            addCriterion("c_cons_m12_JYDQ_num <>", value, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumGreaterThan(String value) {
            addCriterion("c_cons_m12_JYDQ_num >", value, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_JYDQ_num >=", value, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumLessThan(String value) {
            addCriterion("c_cons_m12_JYDQ_num <", value, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_JYDQ_num <=", value, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumLike(String value) {
            addCriterion("c_cons_m12_JYDQ_num like", value, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumNotLike(String value) {
            addCriterion("c_cons_m12_JYDQ_num not like", value, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumIn(List<String> values) {
            addCriterion("c_cons_m12_JYDQ_num in", values, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumNotIn(List<String> values) {
            addCriterion("c_cons_m12_JYDQ_num not in", values, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumBetween(String value1, String value2) {
            addCriterion("c_cons_m12_JYDQ_num between", value1, value2, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqNumNotBetween(String value1, String value2) {
            addCriterion("c_cons_m12_JYDQ_num not between", value1, value2, "cConsM12JydqNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayIsNull() {
            addCriterion("c_cons_m12_JYDQ_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayIsNotNull() {
            addCriterion("c_cons_m12_JYDQ_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayEqualTo(String value) {
            addCriterion("c_cons_m12_JYDQ_pay =", value, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayNotEqualTo(String value) {
            addCriterion("c_cons_m12_JYDQ_pay <>", value, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayGreaterThan(String value) {
            addCriterion("c_cons_m12_JYDQ_pay >", value, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_JYDQ_pay >=", value, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayLessThan(String value) {
            addCriterion("c_cons_m12_JYDQ_pay <", value, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_JYDQ_pay <=", value, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayLike(String value) {
            addCriterion("c_cons_m12_JYDQ_pay like", value, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayNotLike(String value) {
            addCriterion("c_cons_m12_JYDQ_pay not like", value, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayIn(List<String> values) {
            addCriterion("c_cons_m12_JYDQ_pay in", values, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayNotIn(List<String> values) {
            addCriterion("c_cons_m12_JYDQ_pay not in", values, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayBetween(String value1, String value2) {
            addCriterion("c_cons_m12_JYDQ_pay between", value1, value2, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12JydqPayNotBetween(String value1, String value2) {
            addCriterion("c_cons_m12_JYDQ_pay not between", value1, value2, "cConsM12JydqPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumIsNull() {
            addCriterion("c_cons_m12_MYYP_num is null");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumIsNotNull() {
            addCriterion("c_cons_m12_MYYP_num is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumEqualTo(String value) {
            addCriterion("c_cons_m12_MYYP_num =", value, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumNotEqualTo(String value) {
            addCriterion("c_cons_m12_MYYP_num <>", value, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumGreaterThan(String value) {
            addCriterion("c_cons_m12_MYYP_num >", value, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_MYYP_num >=", value, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumLessThan(String value) {
            addCriterion("c_cons_m12_MYYP_num <", value, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_MYYP_num <=", value, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumLike(String value) {
            addCriterion("c_cons_m12_MYYP_num like", value, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumNotLike(String value) {
            addCriterion("c_cons_m12_MYYP_num not like", value, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumIn(List<String> values) {
            addCriterion("c_cons_m12_MYYP_num in", values, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumNotIn(List<String> values) {
            addCriterion("c_cons_m12_MYYP_num not in", values, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumBetween(String value1, String value2) {
            addCriterion("c_cons_m12_MYYP_num between", value1, value2, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypNumNotBetween(String value1, String value2) {
            addCriterion("c_cons_m12_MYYP_num not between", value1, value2, "cConsM12MyypNum");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayIsNull() {
            addCriterion("c_cons_m12_MYYP_pay is null");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayIsNotNull() {
            addCriterion("c_cons_m12_MYYP_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayEqualTo(String value) {
            addCriterion("c_cons_m12_MYYP_pay =", value, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayNotEqualTo(String value) {
            addCriterion("c_cons_m12_MYYP_pay <>", value, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayGreaterThan(String value) {
            addCriterion("c_cons_m12_MYYP_pay >", value, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayGreaterThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_MYYP_pay >=", value, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayLessThan(String value) {
            addCriterion("c_cons_m12_MYYP_pay <", value, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayLessThanOrEqualTo(String value) {
            addCriterion("c_cons_m12_MYYP_pay <=", value, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayLike(String value) {
            addCriterion("c_cons_m12_MYYP_pay like", value, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayNotLike(String value) {
            addCriterion("c_cons_m12_MYYP_pay not like", value, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayIn(List<String> values) {
            addCriterion("c_cons_m12_MYYP_pay in", values, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayNotIn(List<String> values) {
            addCriterion("c_cons_m12_MYYP_pay not in", values, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayBetween(String value1, String value2) {
            addCriterion("c_cons_m12_MYYP_pay between", value1, value2, "cConsM12MyypPay");
            return (Criteria) this;
        }

        public Criteria andCConsM12MyypPayNotBetween(String value1, String value2) {
            addCriterion("c_cons_m12_MYYP_pay not between", value1, value2, "cConsM12MyypPay");
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