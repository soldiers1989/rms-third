package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdTdH5DataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdTdH5DataExample() {
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

        public Criteria andCCookieEnabledIsNull() {
            addCriterion("c_cookie_enabled is null");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledIsNotNull() {
            addCriterion("c_cookie_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledEqualTo(String value) {
            addCriterion("c_cookie_enabled =", value, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledNotEqualTo(String value) {
            addCriterion("c_cookie_enabled <>", value, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledGreaterThan(String value) {
            addCriterion("c_cookie_enabled >", value, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("c_cookie_enabled >=", value, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledLessThan(String value) {
            addCriterion("c_cookie_enabled <", value, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledLessThanOrEqualTo(String value) {
            addCriterion("c_cookie_enabled <=", value, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledLike(String value) {
            addCriterion("c_cookie_enabled like", value, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledNotLike(String value) {
            addCriterion("c_cookie_enabled not like", value, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledIn(List<String> values) {
            addCriterion("c_cookie_enabled in", values, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledNotIn(List<String> values) {
            addCriterion("c_cookie_enabled not in", values, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledBetween(String value1, String value2) {
            addCriterion("c_cookie_enabled between", value1, value2, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCCookieEnabledNotBetween(String value1, String value2) {
            addCriterion("c_cookie_enabled not between", value1, value2, "cCookieEnabled");
            return (Criteria) this;
        }

        public Criteria andCOsIsNull() {
            addCriterion("c_os is null");
            return (Criteria) this;
        }

        public Criteria andCOsIsNotNull() {
            addCriterion("c_os is not null");
            return (Criteria) this;
        }

        public Criteria andCOsEqualTo(String value) {
            addCriterion("c_os =", value, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsNotEqualTo(String value) {
            addCriterion("c_os <>", value, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsGreaterThan(String value) {
            addCriterion("c_os >", value, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsGreaterThanOrEqualTo(String value) {
            addCriterion("c_os >=", value, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsLessThan(String value) {
            addCriterion("c_os <", value, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsLessThanOrEqualTo(String value) {
            addCriterion("c_os <=", value, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsLike(String value) {
            addCriterion("c_os like", value, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsNotLike(String value) {
            addCriterion("c_os not like", value, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsIn(List<String> values) {
            addCriterion("c_os in", values, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsNotIn(List<String> values) {
            addCriterion("c_os not in", values, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsBetween(String value1, String value2) {
            addCriterion("c_os between", value1, value2, "cOs");
            return (Criteria) this;
        }

        public Criteria andCOsNotBetween(String value1, String value2) {
            addCriterion("c_os not between", value1, value2, "cOs");
            return (Criteria) this;
        }

        public Criteria andCTrueIpIsNull() {
            addCriterion("c_true_ip is null");
            return (Criteria) this;
        }

        public Criteria andCTrueIpIsNotNull() {
            addCriterion("c_true_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCTrueIpEqualTo(String value) {
            addCriterion("c_true_ip =", value, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpNotEqualTo(String value) {
            addCriterion("c_true_ip <>", value, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpGreaterThan(String value) {
            addCriterion("c_true_ip >", value, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpGreaterThanOrEqualTo(String value) {
            addCriterion("c_true_ip >=", value, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpLessThan(String value) {
            addCriterion("c_true_ip <", value, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpLessThanOrEqualTo(String value) {
            addCriterion("c_true_ip <=", value, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpLike(String value) {
            addCriterion("c_true_ip like", value, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpNotLike(String value) {
            addCriterion("c_true_ip not like", value, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpIn(List<String> values) {
            addCriterion("c_true_ip in", values, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpNotIn(List<String> values) {
            addCriterion("c_true_ip not in", values, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpBetween(String value1, String value2) {
            addCriterion("c_true_ip between", value1, value2, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCTrueIpNotBetween(String value1, String value2) {
            addCriterion("c_true_ip not between", value1, value2, "cTrueIp");
            return (Criteria) this;
        }

        public Criteria andCUserAgentIsNull() {
            addCriterion("c_user_agent is null");
            return (Criteria) this;
        }

        public Criteria andCUserAgentIsNotNull() {
            addCriterion("c_user_agent is not null");
            return (Criteria) this;
        }

        public Criteria andCUserAgentEqualTo(String value) {
            addCriterion("c_user_agent =", value, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentNotEqualTo(String value) {
            addCriterion("c_user_agent <>", value, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentGreaterThan(String value) {
            addCriterion("c_user_agent >", value, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_agent >=", value, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentLessThan(String value) {
            addCriterion("c_user_agent <", value, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentLessThanOrEqualTo(String value) {
            addCriterion("c_user_agent <=", value, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentLike(String value) {
            addCriterion("c_user_agent like", value, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentNotLike(String value) {
            addCriterion("c_user_agent not like", value, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentIn(List<String> values) {
            addCriterion("c_user_agent in", values, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentNotIn(List<String> values) {
            addCriterion("c_user_agent not in", values, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentBetween(String value1, String value2) {
            addCriterion("c_user_agent between", value1, value2, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCUserAgentNotBetween(String value1, String value2) {
            addCriterion("c_user_agent not between", value1, value2, "cUserAgent");
            return (Criteria) this;
        }

        public Criteria andCSmartIdIsNull() {
            addCriterion("c_smart_id is null");
            return (Criteria) this;
        }

        public Criteria andCSmartIdIsNotNull() {
            addCriterion("c_smart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCSmartIdEqualTo(String value) {
            addCriterion("c_smart_id =", value, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdNotEqualTo(String value) {
            addCriterion("c_smart_id <>", value, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdGreaterThan(String value) {
            addCriterion("c_smart_id >", value, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_smart_id >=", value, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdLessThan(String value) {
            addCriterion("c_smart_id <", value, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdLessThanOrEqualTo(String value) {
            addCriterion("c_smart_id <=", value, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdLike(String value) {
            addCriterion("c_smart_id like", value, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdNotLike(String value) {
            addCriterion("c_smart_id not like", value, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdIn(List<String> values) {
            addCriterion("c_smart_id in", values, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdNotIn(List<String> values) {
            addCriterion("c_smart_id not in", values, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdBetween(String value1, String value2) {
            addCriterion("c_smart_id between", value1, value2, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCSmartIdNotBetween(String value1, String value2) {
            addCriterion("c_smart_id not between", value1, value2, "cSmartId");
            return (Criteria) this;
        }

        public Criteria andCCanvasIsNull() {
            addCriterion("c_canvas is null");
            return (Criteria) this;
        }

        public Criteria andCCanvasIsNotNull() {
            addCriterion("c_canvas is not null");
            return (Criteria) this;
        }

        public Criteria andCCanvasEqualTo(String value) {
            addCriterion("c_canvas =", value, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasNotEqualTo(String value) {
            addCriterion("c_canvas <>", value, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasGreaterThan(String value) {
            addCriterion("c_canvas >", value, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasGreaterThanOrEqualTo(String value) {
            addCriterion("c_canvas >=", value, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasLessThan(String value) {
            addCriterion("c_canvas <", value, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasLessThanOrEqualTo(String value) {
            addCriterion("c_canvas <=", value, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasLike(String value) {
            addCriterion("c_canvas like", value, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasNotLike(String value) {
            addCriterion("c_canvas not like", value, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasIn(List<String> values) {
            addCriterion("c_canvas in", values, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasNotIn(List<String> values) {
            addCriterion("c_canvas not in", values, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasBetween(String value1, String value2) {
            addCriterion("c_canvas between", value1, value2, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCCanvasNotBetween(String value1, String value2) {
            addCriterion("c_canvas not between", value1, value2, "cCanvas");
            return (Criteria) this;
        }

        public Criteria andCLanguageResIsNull() {
            addCriterion("c_language_res is null");
            return (Criteria) this;
        }

        public Criteria andCLanguageResIsNotNull() {
            addCriterion("c_language_res is not null");
            return (Criteria) this;
        }

        public Criteria andCLanguageResEqualTo(String value) {
            addCriterion("c_language_res =", value, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResNotEqualTo(String value) {
            addCriterion("c_language_res <>", value, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResGreaterThan(String value) {
            addCriterion("c_language_res >", value, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResGreaterThanOrEqualTo(String value) {
            addCriterion("c_language_res >=", value, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResLessThan(String value) {
            addCriterion("c_language_res <", value, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResLessThanOrEqualTo(String value) {
            addCriterion("c_language_res <=", value, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResLike(String value) {
            addCriterion("c_language_res like", value, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResNotLike(String value) {
            addCriterion("c_language_res not like", value, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResIn(List<String> values) {
            addCriterion("c_language_res in", values, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResNotIn(List<String> values) {
            addCriterion("c_language_res not in", values, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResBetween(String value1, String value2) {
            addCriterion("c_language_res between", value1, value2, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCLanguageResNotBetween(String value1, String value2) {
            addCriterion("c_language_res not between", value1, value2, "cLanguageRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResIsNull() {
            addCriterion("c_screen_res is null");
            return (Criteria) this;
        }

        public Criteria andCScreenResIsNotNull() {
            addCriterion("c_screen_res is not null");
            return (Criteria) this;
        }

        public Criteria andCScreenResEqualTo(String value) {
            addCriterion("c_screen_res =", value, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResNotEqualTo(String value) {
            addCriterion("c_screen_res <>", value, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResGreaterThan(String value) {
            addCriterion("c_screen_res >", value, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResGreaterThanOrEqualTo(String value) {
            addCriterion("c_screen_res >=", value, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResLessThan(String value) {
            addCriterion("c_screen_res <", value, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResLessThanOrEqualTo(String value) {
            addCriterion("c_screen_res <=", value, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResLike(String value) {
            addCriterion("c_screen_res like", value, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResNotLike(String value) {
            addCriterion("c_screen_res not like", value, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResIn(List<String> values) {
            addCriterion("c_screen_res in", values, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResNotIn(List<String> values) {
            addCriterion("c_screen_res not in", values, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResBetween(String value1, String value2) {
            addCriterion("c_screen_res between", value1, value2, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCScreenResNotBetween(String value1, String value2) {
            addCriterion("c_screen_res not between", value1, value2, "cScreenRes");
            return (Criteria) this;
        }

        public Criteria andCVersionIsNull() {
            addCriterion("c_version is null");
            return (Criteria) this;
        }

        public Criteria andCVersionIsNotNull() {
            addCriterion("c_version is not null");
            return (Criteria) this;
        }

        public Criteria andCVersionEqualTo(String value) {
            addCriterion("c_version =", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionNotEqualTo(String value) {
            addCriterion("c_version <>", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionGreaterThan(String value) {
            addCriterion("c_version >", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionGreaterThanOrEqualTo(String value) {
            addCriterion("c_version >=", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionLessThan(String value) {
            addCriterion("c_version <", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionLessThanOrEqualTo(String value) {
            addCriterion("c_version <=", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionLike(String value) {
            addCriterion("c_version like", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionNotLike(String value) {
            addCriterion("c_version not like", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionIn(List<String> values) {
            addCriterion("c_version in", values, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionNotIn(List<String> values) {
            addCriterion("c_version not in", values, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionBetween(String value1, String value2) {
            addCriterion("c_version between", value1, value2, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionNotBetween(String value1, String value2) {
            addCriterion("c_version not between", value1, value2, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCPluginListIsNull() {
            addCriterion("c_plugin_list is null");
            return (Criteria) this;
        }

        public Criteria andCPluginListIsNotNull() {
            addCriterion("c_plugin_list is not null");
            return (Criteria) this;
        }

        public Criteria andCPluginListEqualTo(String value) {
            addCriterion("c_plugin_list =", value, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListNotEqualTo(String value) {
            addCriterion("c_plugin_list <>", value, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListGreaterThan(String value) {
            addCriterion("c_plugin_list >", value, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListGreaterThanOrEqualTo(String value) {
            addCriterion("c_plugin_list >=", value, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListLessThan(String value) {
            addCriterion("c_plugin_list <", value, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListLessThanOrEqualTo(String value) {
            addCriterion("c_plugin_list <=", value, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListLike(String value) {
            addCriterion("c_plugin_list like", value, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListNotLike(String value) {
            addCriterion("c_plugin_list not like", value, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListIn(List<String> values) {
            addCriterion("c_plugin_list in", values, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListNotIn(List<String> values) {
            addCriterion("c_plugin_list not in", values, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListBetween(String value1, String value2) {
            addCriterion("c_plugin_list between", value1, value2, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCPluginListNotBetween(String value1, String value2) {
            addCriterion("c_plugin_list not between", value1, value2, "cPluginList");
            return (Criteria) this;
        }

        public Criteria andCTokenIdIsNull() {
            addCriterion("c_token_id is null");
            return (Criteria) this;
        }

        public Criteria andCTokenIdIsNotNull() {
            addCriterion("c_token_id is not null");
            return (Criteria) this;
        }

        public Criteria andCTokenIdEqualTo(String value) {
            addCriterion("c_token_id =", value, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdNotEqualTo(String value) {
            addCriterion("c_token_id <>", value, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdGreaterThan(String value) {
            addCriterion("c_token_id >", value, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_token_id >=", value, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdLessThan(String value) {
            addCriterion("c_token_id <", value, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdLessThanOrEqualTo(String value) {
            addCriterion("c_token_id <=", value, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdLike(String value) {
            addCriterion("c_token_id like", value, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdNotLike(String value) {
            addCriterion("c_token_id not like", value, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdIn(List<String> values) {
            addCriterion("c_token_id in", values, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdNotIn(List<String> values) {
            addCriterion("c_token_id not in", values, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdBetween(String value1, String value2) {
            addCriterion("c_token_id between", value1, value2, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCTokenIdNotBetween(String value1, String value2) {
            addCriterion("c_token_id not between", value1, value2, "cTokenId");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeIsNull() {
            addCriterion("c_device_type is null");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeIsNotNull() {
            addCriterion("c_device_type is not null");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeEqualTo(String value) {
            addCriterion("c_device_type =", value, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeNotEqualTo(String value) {
            addCriterion("c_device_type <>", value, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeGreaterThan(String value) {
            addCriterion("c_device_type >", value, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_device_type >=", value, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeLessThan(String value) {
            addCriterion("c_device_type <", value, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("c_device_type <=", value, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeLike(String value) {
            addCriterion("c_device_type like", value, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeNotLike(String value) {
            addCriterion("c_device_type not like", value, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeIn(List<String> values) {
            addCriterion("c_device_type in", values, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeNotIn(List<String> values) {
            addCriterion("c_device_type not in", values, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeBetween(String value1, String value2) {
            addCriterion("c_device_type between", value1, value2, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("c_device_type not between", value1, value2, "cDeviceType");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledIsNull() {
            addCriterion("c_flash_enabled is null");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledIsNotNull() {
            addCriterion("c_flash_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledEqualTo(String value) {
            addCriterion("c_flash_enabled =", value, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledNotEqualTo(String value) {
            addCriterion("c_flash_enabled <>", value, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledGreaterThan(String value) {
            addCriterion("c_flash_enabled >", value, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("c_flash_enabled >=", value, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledLessThan(String value) {
            addCriterion("c_flash_enabled <", value, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledLessThanOrEqualTo(String value) {
            addCriterion("c_flash_enabled <=", value, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledLike(String value) {
            addCriterion("c_flash_enabled like", value, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledNotLike(String value) {
            addCriterion("c_flash_enabled not like", value, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledIn(List<String> values) {
            addCriterion("c_flash_enabled in", values, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledNotIn(List<String> values) {
            addCriterion("c_flash_enabled not in", values, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledBetween(String value1, String value2) {
            addCriterion("c_flash_enabled between", value1, value2, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCFlashEnabledNotBetween(String value1, String value2) {
            addCriterion("c_flash_enabled not between", value1, value2, "cFlashEnabled");
            return (Criteria) this;
        }

        public Criteria andCRefererIsNull() {
            addCriterion("c_referer is null");
            return (Criteria) this;
        }

        public Criteria andCRefererIsNotNull() {
            addCriterion("c_referer is not null");
            return (Criteria) this;
        }

        public Criteria andCRefererEqualTo(String value) {
            addCriterion("c_referer =", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererNotEqualTo(String value) {
            addCriterion("c_referer <>", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererGreaterThan(String value) {
            addCriterion("c_referer >", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererGreaterThanOrEqualTo(String value) {
            addCriterion("c_referer >=", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererLessThan(String value) {
            addCriterion("c_referer <", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererLessThanOrEqualTo(String value) {
            addCriterion("c_referer <=", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererLike(String value) {
            addCriterion("c_referer like", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererNotLike(String value) {
            addCriterion("c_referer not like", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererIn(List<String> values) {
            addCriterion("c_referer in", values, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererNotIn(List<String> values) {
            addCriterion("c_referer not in", values, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererBetween(String value1, String value2) {
            addCriterion("c_referer between", value1, value2, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererNotBetween(String value1, String value2) {
            addCriterion("c_referer not between", value1, value2, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCFontidIsNull() {
            addCriterion("c_fontId is null");
            return (Criteria) this;
        }

        public Criteria andCFontidIsNotNull() {
            addCriterion("c_fontId is not null");
            return (Criteria) this;
        }

        public Criteria andCFontidEqualTo(String value) {
            addCriterion("c_fontId =", value, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidNotEqualTo(String value) {
            addCriterion("c_fontId <>", value, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidGreaterThan(String value) {
            addCriterion("c_fontId >", value, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidGreaterThanOrEqualTo(String value) {
            addCriterion("c_fontId >=", value, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidLessThan(String value) {
            addCriterion("c_fontId <", value, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidLessThanOrEqualTo(String value) {
            addCriterion("c_fontId <=", value, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidLike(String value) {
            addCriterion("c_fontId like", value, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidNotLike(String value) {
            addCriterion("c_fontId not like", value, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidIn(List<String> values) {
            addCriterion("c_fontId in", values, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidNotIn(List<String> values) {
            addCriterion("c_fontId not in", values, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidBetween(String value1, String value2) {
            addCriterion("c_fontId between", value1, value2, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCFontidNotBetween(String value1, String value2) {
            addCriterion("c_fontId not between", value1, value2, "cFontid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidIsNull() {
            addCriterion("c_deviceId is null");
            return (Criteria) this;
        }

        public Criteria andCDeviceidIsNotNull() {
            addCriterion("c_deviceId is not null");
            return (Criteria) this;
        }

        public Criteria andCDeviceidEqualTo(String value) {
            addCriterion("c_deviceId =", value, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidNotEqualTo(String value) {
            addCriterion("c_deviceId <>", value, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidGreaterThan(String value) {
            addCriterion("c_deviceId >", value, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("c_deviceId >=", value, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidLessThan(String value) {
            addCriterion("c_deviceId <", value, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidLessThanOrEqualTo(String value) {
            addCriterion("c_deviceId <=", value, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidLike(String value) {
            addCriterion("c_deviceId like", value, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidNotLike(String value) {
            addCriterion("c_deviceId not like", value, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidIn(List<String> values) {
            addCriterion("c_deviceId in", values, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidNotIn(List<String> values) {
            addCriterion("c_deviceId not in", values, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidBetween(String value1, String value2) {
            addCriterion("c_deviceId between", value1, value2, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCDeviceidNotBetween(String value1, String value2) {
            addCriterion("c_deviceId not between", value1, value2, "cDeviceid");
            return (Criteria) this;
        }

        public Criteria andCBrowserIsNull() {
            addCriterion("c_browser is null");
            return (Criteria) this;
        }

        public Criteria andCBrowserIsNotNull() {
            addCriterion("c_browser is not null");
            return (Criteria) this;
        }

        public Criteria andCBrowserEqualTo(String value) {
            addCriterion("c_browser =", value, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserNotEqualTo(String value) {
            addCriterion("c_browser <>", value, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserGreaterThan(String value) {
            addCriterion("c_browser >", value, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("c_browser >=", value, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserLessThan(String value) {
            addCriterion("c_browser <", value, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserLessThanOrEqualTo(String value) {
            addCriterion("c_browser <=", value, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserLike(String value) {
            addCriterion("c_browser like", value, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserNotLike(String value) {
            addCriterion("c_browser not like", value, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserIn(List<String> values) {
            addCriterion("c_browser in", values, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserNotIn(List<String> values) {
            addCriterion("c_browser not in", values, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserBetween(String value1, String value2) {
            addCriterion("c_browser between", value1, value2, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserNotBetween(String value1, String value2) {
            addCriterion("c_browser not between", value1, value2, "cBrowser");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeIsNull() {
            addCriterion("c_browser_type is null");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeIsNotNull() {
            addCriterion("c_browser_type is not null");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeEqualTo(String value) {
            addCriterion("c_browser_type =", value, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeNotEqualTo(String value) {
            addCriterion("c_browser_type <>", value, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeGreaterThan(String value) {
            addCriterion("c_browser_type >", value, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_browser_type >=", value, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeLessThan(String value) {
            addCriterion("c_browser_type <", value, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeLessThanOrEqualTo(String value) {
            addCriterion("c_browser_type <=", value, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeLike(String value) {
            addCriterion("c_browser_type like", value, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeNotLike(String value) {
            addCriterion("c_browser_type not like", value, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeIn(List<String> values) {
            addCriterion("c_browser_type in", values, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeNotIn(List<String> values) {
            addCriterion("c_browser_type not in", values, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeBetween(String value1, String value2) {
            addCriterion("c_browser_type between", value1, value2, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCBrowserTypeNotBetween(String value1, String value2) {
            addCriterion("c_browser_type not between", value1, value2, "cBrowserType");
            return (Criteria) this;
        }

        public Criteria andCTcpOsIsNull() {
            addCriterion("c_tcp_os is null");
            return (Criteria) this;
        }

        public Criteria andCTcpOsIsNotNull() {
            addCriterion("c_tcp_os is not null");
            return (Criteria) this;
        }

        public Criteria andCTcpOsEqualTo(String value) {
            addCriterion("c_tcp_os =", value, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsNotEqualTo(String value) {
            addCriterion("c_tcp_os <>", value, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsGreaterThan(String value) {
            addCriterion("c_tcp_os >", value, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsGreaterThanOrEqualTo(String value) {
            addCriterion("c_tcp_os >=", value, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsLessThan(String value) {
            addCriterion("c_tcp_os <", value, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsLessThanOrEqualTo(String value) {
            addCriterion("c_tcp_os <=", value, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsLike(String value) {
            addCriterion("c_tcp_os like", value, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsNotLike(String value) {
            addCriterion("c_tcp_os not like", value, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsIn(List<String> values) {
            addCriterion("c_tcp_os in", values, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsNotIn(List<String> values) {
            addCriterion("c_tcp_os not in", values, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsBetween(String value1, String value2) {
            addCriterion("c_tcp_os between", value1, value2, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCTcpOsNotBetween(String value1, String value2) {
            addCriterion("c_tcp_os not between", value1, value2, "cTcpOs");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionIsNull() {
            addCriterion("c_browser_version is null");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionIsNotNull() {
            addCriterion("c_browser_version is not null");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionEqualTo(String value) {
            addCriterion("c_browser_version =", value, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionNotEqualTo(String value) {
            addCriterion("c_browser_version <>", value, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionGreaterThan(String value) {
            addCriterion("c_browser_version >", value, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionGreaterThanOrEqualTo(String value) {
            addCriterion("c_browser_version >=", value, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionLessThan(String value) {
            addCriterion("c_browser_version <", value, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionLessThanOrEqualTo(String value) {
            addCriterion("c_browser_version <=", value, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionLike(String value) {
            addCriterion("c_browser_version like", value, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionNotLike(String value) {
            addCriterion("c_browser_version not like", value, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionIn(List<String> values) {
            addCriterion("c_browser_version in", values, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionNotIn(List<String> values) {
            addCriterion("c_browser_version not in", values, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionBetween(String value1, String value2) {
            addCriterion("c_browser_version between", value1, value2, "cBrowserVersion");
            return (Criteria) this;
        }

        public Criteria andCBrowserVersionNotBetween(String value1, String value2) {
            addCriterion("c_browser_version not between", value1, value2, "cBrowserVersion");
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