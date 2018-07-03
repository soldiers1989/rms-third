package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdBrStabInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdBrStabInfoExample() {
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

        public Criteria andCTelBizIsNull() {
            addCriterion("c_tel_biz is null");
            return (Criteria) this;
        }

        public Criteria andCTelBizIsNotNull() {
            addCriterion("c_tel_biz is not null");
            return (Criteria) this;
        }

        public Criteria andCTelBizEqualTo(String value) {
            addCriterion("c_tel_biz =", value, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizNotEqualTo(String value) {
            addCriterion("c_tel_biz <>", value, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizGreaterThan(String value) {
            addCriterion("c_tel_biz >", value, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizGreaterThanOrEqualTo(String value) {
            addCriterion("c_tel_biz >=", value, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizLessThan(String value) {
            addCriterion("c_tel_biz <", value, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizLessThanOrEqualTo(String value) {
            addCriterion("c_tel_biz <=", value, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizLike(String value) {
            addCriterion("c_tel_biz like", value, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizNotLike(String value) {
            addCriterion("c_tel_biz not like", value, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizIn(List<String> values) {
            addCriterion("c_tel_biz in", values, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizNotIn(List<String> values) {
            addCriterion("c_tel_biz not in", values, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizBetween(String value1, String value2) {
            addCriterion("c_tel_biz between", value1, value2, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelBizNotBetween(String value1, String value2) {
            addCriterion("c_tel_biz not between", value1, value2, "cTelBiz");
            return (Criteria) this;
        }

        public Criteria andCTelHomeIsNull() {
            addCriterion("c_tel_home is null");
            return (Criteria) this;
        }

        public Criteria andCTelHomeIsNotNull() {
            addCriterion("c_tel_home is not null");
            return (Criteria) this;
        }

        public Criteria andCTelHomeEqualTo(String value) {
            addCriterion("c_tel_home =", value, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeNotEqualTo(String value) {
            addCriterion("c_tel_home <>", value, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeGreaterThan(String value) {
            addCriterion("c_tel_home >", value, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeGreaterThanOrEqualTo(String value) {
            addCriterion("c_tel_home >=", value, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeLessThan(String value) {
            addCriterion("c_tel_home <", value, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeLessThanOrEqualTo(String value) {
            addCriterion("c_tel_home <=", value, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeLike(String value) {
            addCriterion("c_tel_home like", value, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeNotLike(String value) {
            addCriterion("c_tel_home not like", value, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeIn(List<String> values) {
            addCriterion("c_tel_home in", values, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeNotIn(List<String> values) {
            addCriterion("c_tel_home not in", values, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeBetween(String value1, String value2) {
            addCriterion("c_tel_home between", value1, value2, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCTelHomeNotBetween(String value1, String value2) {
            addCriterion("c_tel_home not between", value1, value2, "cTelHome");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCIsNull() {
            addCriterion("c_flag_stability_c is null");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCIsNotNull() {
            addCriterion("c_flag_stability_c is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCEqualTo(String value) {
            addCriterion("c_flag_stability_c =", value, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCNotEqualTo(String value) {
            addCriterion("c_flag_stability_c <>", value, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCGreaterThan(String value) {
            addCriterion("c_flag_stability_c >", value, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_stability_c >=", value, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCLessThan(String value) {
            addCriterion("c_flag_stability_c <", value, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCLessThanOrEqualTo(String value) {
            addCriterion("c_flag_stability_c <=", value, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCLike(String value) {
            addCriterion("c_flag_stability_c like", value, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCNotLike(String value) {
            addCriterion("c_flag_stability_c not like", value, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCIn(List<String> values) {
            addCriterion("c_flag_stability_c in", values, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCNotIn(List<String> values) {
            addCriterion("c_flag_stability_c not in", values, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCBetween(String value1, String value2) {
            addCriterion("c_flag_stability_c between", value1, value2, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCFlagStabilityCNotBetween(String value1, String value2) {
            addCriterion("c_flag_stability_c not between", value1, value2, "cFlagStabilityC");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdIsNull() {
            addCriterion("c_stab_auth_id is null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdIsNotNull() {
            addCriterion("c_stab_auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdEqualTo(String value) {
            addCriterion("c_stab_auth_id =", value, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNotEqualTo(String value) {
            addCriterion("c_stab_auth_id <>", value, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdGreaterThan(String value) {
            addCriterion("c_stab_auth_id >", value, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_id >=", value, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdLessThan(String value) {
            addCriterion("c_stab_auth_id <", value, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdLessThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_id <=", value, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdLike(String value) {
            addCriterion("c_stab_auth_id like", value, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNotLike(String value) {
            addCriterion("c_stab_auth_id not like", value, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdIn(List<String> values) {
            addCriterion("c_stab_auth_id in", values, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNotIn(List<String> values) {
            addCriterion("c_stab_auth_id not in", values, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdBetween(String value1, String value2) {
            addCriterion("c_stab_auth_id between", value1, value2, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNotBetween(String value1, String value2) {
            addCriterion("c_stab_auth_id not between", value1, value2, "cStabAuthId");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellIsNull() {
            addCriterion("c_stab_auth_cell is null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellIsNotNull() {
            addCriterion("c_stab_auth_cell is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellEqualTo(String value) {
            addCriterion("c_stab_auth_cell =", value, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellNotEqualTo(String value) {
            addCriterion("c_stab_auth_cell <>", value, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellGreaterThan(String value) {
            addCriterion("c_stab_auth_cell >", value, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_cell >=", value, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellLessThan(String value) {
            addCriterion("c_stab_auth_cell <", value, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellLessThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_cell <=", value, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellLike(String value) {
            addCriterion("c_stab_auth_cell like", value, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellNotLike(String value) {
            addCriterion("c_stab_auth_cell not like", value, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellIn(List<String> values) {
            addCriterion("c_stab_auth_cell in", values, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellNotIn(List<String> values) {
            addCriterion("c_stab_auth_cell not in", values, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellBetween(String value1, String value2) {
            addCriterion("c_stab_auth_cell between", value1, value2, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthCellNotBetween(String value1, String value2) {
            addCriterion("c_stab_auth_cell not between", value1, value2, "cStabAuthCell");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailIsNull() {
            addCriterion("c_stab_auth_mail is null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailIsNotNull() {
            addCriterion("c_stab_auth_mail is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailEqualTo(String value) {
            addCriterion("c_stab_auth_mail =", value, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailNotEqualTo(String value) {
            addCriterion("c_stab_auth_mail <>", value, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailGreaterThan(String value) {
            addCriterion("c_stab_auth_mail >", value, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_mail >=", value, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailLessThan(String value) {
            addCriterion("c_stab_auth_mail <", value, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailLessThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_mail <=", value, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailLike(String value) {
            addCriterion("c_stab_auth_mail like", value, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailNotLike(String value) {
            addCriterion("c_stab_auth_mail not like", value, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailIn(List<String> values) {
            addCriterion("c_stab_auth_mail in", values, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailNotIn(List<String> values) {
            addCriterion("c_stab_auth_mail not in", values, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailBetween(String value1, String value2) {
            addCriterion("c_stab_auth_mail between", value1, value2, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthMailNotBetween(String value1, String value2) {
            addCriterion("c_stab_auth_mail not between", value1, value2, "cStabAuthMail");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationIsNull() {
            addCriterion("c_stab_auth_key_relation is null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationIsNotNull() {
            addCriterion("c_stab_auth_key_relation is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationEqualTo(String value) {
            addCriterion("c_stab_auth_key_relation =", value, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationNotEqualTo(String value) {
            addCriterion("c_stab_auth_key_relation <>", value, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationGreaterThan(String value) {
            addCriterion("c_stab_auth_key_relation >", value, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_key_relation >=", value, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationLessThan(String value) {
            addCriterion("c_stab_auth_key_relation <", value, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationLessThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_key_relation <=", value, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationLike(String value) {
            addCriterion("c_stab_auth_key_relation like", value, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationNotLike(String value) {
            addCriterion("c_stab_auth_key_relation not like", value, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationIn(List<String> values) {
            addCriterion("c_stab_auth_key_relation in", values, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationNotIn(List<String> values) {
            addCriterion("c_stab_auth_key_relation not in", values, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationBetween(String value1, String value2) {
            addCriterion("c_stab_auth_key_relation between", value1, value2, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthKeyRelationNotBetween(String value1, String value2) {
            addCriterion("c_stab_auth_key_relation not between", value1, value2, "cStabAuthKeyRelation");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameIsNull() {
            addCriterion("c_stab_auth_name is null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameIsNotNull() {
            addCriterion("c_stab_auth_name is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameEqualTo(String value) {
            addCriterion("c_stab_auth_name =", value, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameNotEqualTo(String value) {
            addCriterion("c_stab_auth_name <>", value, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameGreaterThan(String value) {
            addCriterion("c_stab_auth_name >", value, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_name >=", value, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameLessThan(String value) {
            addCriterion("c_stab_auth_name <", value, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameLessThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_name <=", value, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameLike(String value) {
            addCriterion("c_stab_auth_name like", value, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameNotLike(String value) {
            addCriterion("c_stab_auth_name not like", value, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameIn(List<String> values) {
            addCriterion("c_stab_auth_name in", values, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameNotIn(List<String> values) {
            addCriterion("c_stab_auth_name not in", values, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameBetween(String value1, String value2) {
            addCriterion("c_stab_auth_name between", value1, value2, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthNameNotBetween(String value1, String value2) {
            addCriterion("c_stab_auth_name not between", value1, value2, "cStabAuthName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameIsNull() {
            addCriterion("c_stab_auth_id_name is null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameIsNotNull() {
            addCriterion("c_stab_auth_id_name is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameEqualTo(String value) {
            addCriterion("c_stab_auth_id_name =", value, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameNotEqualTo(String value) {
            addCriterion("c_stab_auth_id_name <>", value, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameGreaterThan(String value) {
            addCriterion("c_stab_auth_id_name >", value, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_id_name >=", value, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameLessThan(String value) {
            addCriterion("c_stab_auth_id_name <", value, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameLessThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_id_name <=", value, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameLike(String value) {
            addCriterion("c_stab_auth_id_name like", value, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameNotLike(String value) {
            addCriterion("c_stab_auth_id_name not like", value, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameIn(List<String> values) {
            addCriterion("c_stab_auth_id_name in", values, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameNotIn(List<String> values) {
            addCriterion("c_stab_auth_id_name not in", values, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameBetween(String value1, String value2) {
            addCriterion("c_stab_auth_id_name between", value1, value2, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthIdNameNotBetween(String value1, String value2) {
            addCriterion("c_stab_auth_id_name not between", value1, value2, "cStabAuthIdName");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelIsNull() {
            addCriterion("c_stab_auth_biz_tel is null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelIsNotNull() {
            addCriterion("c_stab_auth_biz_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelEqualTo(String value) {
            addCriterion("c_stab_auth_biz_tel =", value, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelNotEqualTo(String value) {
            addCriterion("c_stab_auth_biz_tel <>", value, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelGreaterThan(String value) {
            addCriterion("c_stab_auth_biz_tel >", value, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_biz_tel >=", value, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelLessThan(String value) {
            addCriterion("c_stab_auth_biz_tel <", value, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelLessThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_biz_tel <=", value, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelLike(String value) {
            addCriterion("c_stab_auth_biz_tel like", value, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelNotLike(String value) {
            addCriterion("c_stab_auth_biz_tel not like", value, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelIn(List<String> values) {
            addCriterion("c_stab_auth_biz_tel in", values, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelNotIn(List<String> values) {
            addCriterion("c_stab_auth_biz_tel not in", values, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelBetween(String value1, String value2) {
            addCriterion("c_stab_auth_biz_tel between", value1, value2, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthBizTelNotBetween(String value1, String value2) {
            addCriterion("c_stab_auth_biz_tel not between", value1, value2, "cStabAuthBizTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelIsNull() {
            addCriterion("c_stab_auth_home_tel is null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelIsNotNull() {
            addCriterion("c_stab_auth_home_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelEqualTo(String value) {
            addCriterion("c_stab_auth_home_tel =", value, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelNotEqualTo(String value) {
            addCriterion("c_stab_auth_home_tel <>", value, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelGreaterThan(String value) {
            addCriterion("c_stab_auth_home_tel >", value, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_home_tel >=", value, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelLessThan(String value) {
            addCriterion("c_stab_auth_home_tel <", value, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelLessThanOrEqualTo(String value) {
            addCriterion("c_stab_auth_home_tel <=", value, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelLike(String value) {
            addCriterion("c_stab_auth_home_tel like", value, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelNotLike(String value) {
            addCriterion("c_stab_auth_home_tel not like", value, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelIn(List<String> values) {
            addCriterion("c_stab_auth_home_tel in", values, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelNotIn(List<String> values) {
            addCriterion("c_stab_auth_home_tel not in", values, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelBetween(String value1, String value2) {
            addCriterion("c_stab_auth_home_tel between", value1, value2, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabAuthHomeTelNotBetween(String value1, String value2) {
            addCriterion("c_stab_auth_home_tel not between", value1, value2, "cStabAuthHomeTel");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumIsNull() {
            addCriterion("c_stab_id_num is null");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumIsNotNull() {
            addCriterion("c_stab_id_num is not null");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumEqualTo(String value) {
            addCriterion("c_stab_id_num =", value, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumNotEqualTo(String value) {
            addCriterion("c_stab_id_num <>", value, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumGreaterThan(String value) {
            addCriterion("c_stab_id_num >", value, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_id_num >=", value, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumLessThan(String value) {
            addCriterion("c_stab_id_num <", value, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumLessThanOrEqualTo(String value) {
            addCriterion("c_stab_id_num <=", value, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumLike(String value) {
            addCriterion("c_stab_id_num like", value, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumNotLike(String value) {
            addCriterion("c_stab_id_num not like", value, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumIn(List<String> values) {
            addCriterion("c_stab_id_num in", values, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumNotIn(List<String> values) {
            addCriterion("c_stab_id_num not in", values, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumBetween(String value1, String value2) {
            addCriterion("c_stab_id_num between", value1, value2, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabIdNumNotBetween(String value1, String value2) {
            addCriterion("c_stab_id_num not between", value1, value2, "cStabIdNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumIsNull() {
            addCriterion("c_stab_cell_num is null");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumIsNotNull() {
            addCriterion("c_stab_cell_num is not null");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumEqualTo(String value) {
            addCriterion("c_stab_cell_num =", value, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumNotEqualTo(String value) {
            addCriterion("c_stab_cell_num <>", value, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumGreaterThan(String value) {
            addCriterion("c_stab_cell_num >", value, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_cell_num >=", value, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumLessThan(String value) {
            addCriterion("c_stab_cell_num <", value, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumLessThanOrEqualTo(String value) {
            addCriterion("c_stab_cell_num <=", value, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumLike(String value) {
            addCriterion("c_stab_cell_num like", value, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumNotLike(String value) {
            addCriterion("c_stab_cell_num not like", value, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumIn(List<String> values) {
            addCriterion("c_stab_cell_num in", values, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumNotIn(List<String> values) {
            addCriterion("c_stab_cell_num not in", values, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumBetween(String value1, String value2) {
            addCriterion("c_stab_cell_num between", value1, value2, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellNumNotBetween(String value1, String value2) {
            addCriterion("c_stab_cell_num not between", value1, value2, "cStabCellNum");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeIsNull() {
            addCriterion("c_stab_cell_firsttime is null");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeIsNotNull() {
            addCriterion("c_stab_cell_firsttime is not null");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeEqualTo(String value) {
            addCriterion("c_stab_cell_firsttime =", value, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeNotEqualTo(String value) {
            addCriterion("c_stab_cell_firsttime <>", value, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeGreaterThan(String value) {
            addCriterion("c_stab_cell_firsttime >", value, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_cell_firsttime >=", value, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeLessThan(String value) {
            addCriterion("c_stab_cell_firsttime <", value, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeLessThanOrEqualTo(String value) {
            addCriterion("c_stab_cell_firsttime <=", value, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeLike(String value) {
            addCriterion("c_stab_cell_firsttime like", value, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeNotLike(String value) {
            addCriterion("c_stab_cell_firsttime not like", value, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeIn(List<String> values) {
            addCriterion("c_stab_cell_firsttime in", values, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeNotIn(List<String> values) {
            addCriterion("c_stab_cell_firsttime not in", values, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeBetween(String value1, String value2) {
            addCriterion("c_stab_cell_firsttime between", value1, value2, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabCellFirsttimeNotBetween(String value1, String value2) {
            addCriterion("c_stab_cell_firsttime not between", value1, value2, "cStabCellFirsttime");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumIsNull() {
            addCriterion("c_stab_mail_num is null");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumIsNotNull() {
            addCriterion("c_stab_mail_num is not null");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumEqualTo(String value) {
            addCriterion("c_stab_mail_num =", value, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumNotEqualTo(String value) {
            addCriterion("c_stab_mail_num <>", value, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumGreaterThan(String value) {
            addCriterion("c_stab_mail_num >", value, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_mail_num >=", value, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumLessThan(String value) {
            addCriterion("c_stab_mail_num <", value, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumLessThanOrEqualTo(String value) {
            addCriterion("c_stab_mail_num <=", value, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumLike(String value) {
            addCriterion("c_stab_mail_num like", value, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumNotLike(String value) {
            addCriterion("c_stab_mail_num not like", value, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumIn(List<String> values) {
            addCriterion("c_stab_mail_num in", values, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumNotIn(List<String> values) {
            addCriterion("c_stab_mail_num not in", values, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumBetween(String value1, String value2) {
            addCriterion("c_stab_mail_num between", value1, value2, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabMailNumNotBetween(String value1, String value2) {
            addCriterion("c_stab_mail_num not between", value1, value2, "cStabMailNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumIsNull() {
            addCriterion("c_stab_name_num is null");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumIsNotNull() {
            addCriterion("c_stab_name_num is not null");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumEqualTo(String value) {
            addCriterion("c_stab_name_num =", value, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumNotEqualTo(String value) {
            addCriterion("c_stab_name_num <>", value, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumGreaterThan(String value) {
            addCriterion("c_stab_name_num >", value, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_name_num >=", value, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumLessThan(String value) {
            addCriterion("c_stab_name_num <", value, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumLessThanOrEqualTo(String value) {
            addCriterion("c_stab_name_num <=", value, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumLike(String value) {
            addCriterion("c_stab_name_num like", value, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumNotLike(String value) {
            addCriterion("c_stab_name_num not like", value, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumIn(List<String> values) {
            addCriterion("c_stab_name_num in", values, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumNotIn(List<String> values) {
            addCriterion("c_stab_name_num not in", values, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumBetween(String value1, String value2) {
            addCriterion("c_stab_name_num between", value1, value2, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabNameNumNotBetween(String value1, String value2) {
            addCriterion("c_stab_name_num not between", value1, value2, "cStabNameNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumIsNull() {
            addCriterion("c_stab_tel_num is null");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumIsNotNull() {
            addCriterion("c_stab_tel_num is not null");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumEqualTo(String value) {
            addCriterion("c_stab_tel_num =", value, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumNotEqualTo(String value) {
            addCriterion("c_stab_tel_num <>", value, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumGreaterThan(String value) {
            addCriterion("c_stab_tel_num >", value, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_tel_num >=", value, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumLessThan(String value) {
            addCriterion("c_stab_tel_num <", value, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumLessThanOrEqualTo(String value) {
            addCriterion("c_stab_tel_num <=", value, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumLike(String value) {
            addCriterion("c_stab_tel_num like", value, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumNotLike(String value) {
            addCriterion("c_stab_tel_num not like", value, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumIn(List<String> values) {
            addCriterion("c_stab_tel_num in", values, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumNotIn(List<String> values) {
            addCriterion("c_stab_tel_num not in", values, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumBetween(String value1, String value2) {
            addCriterion("c_stab_tel_num between", value1, value2, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabTelNumNotBetween(String value1, String value2) {
            addCriterion("c_stab_tel_num not between", value1, value2, "cStabTelNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumIsNull() {
            addCriterion("c_stab_addr_num is null");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumIsNotNull() {
            addCriterion("c_stab_addr_num is not null");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumEqualTo(String value) {
            addCriterion("c_stab_addr_num =", value, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumNotEqualTo(String value) {
            addCriterion("c_stab_addr_num <>", value, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumGreaterThan(String value) {
            addCriterion("c_stab_addr_num >", value, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_stab_addr_num >=", value, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumLessThan(String value) {
            addCriterion("c_stab_addr_num <", value, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumLessThanOrEqualTo(String value) {
            addCriterion("c_stab_addr_num <=", value, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumLike(String value) {
            addCriterion("c_stab_addr_num like", value, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumNotLike(String value) {
            addCriterion("c_stab_addr_num not like", value, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumIn(List<String> values) {
            addCriterion("c_stab_addr_num in", values, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumNotIn(List<String> values) {
            addCriterion("c_stab_addr_num not in", values, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumBetween(String value1, String value2) {
            addCriterion("c_stab_addr_num between", value1, value2, "cStabAddrNum");
            return (Criteria) this;
        }

        public Criteria andCStabAddrNumNotBetween(String value1, String value2) {
            addCriterion("c_stab_addr_num not between", value1, value2, "cStabAddrNum");
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