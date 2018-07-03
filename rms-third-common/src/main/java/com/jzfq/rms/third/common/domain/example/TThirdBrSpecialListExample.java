package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdBrSpecialListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdBrSpecialListExample() {
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

        public Criteria andCLinkmanCellIsNull() {
            addCriterion("c_linkman_cell is null");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellIsNotNull() {
            addCriterion("c_linkman_cell is not null");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellEqualTo(String value) {
            addCriterion("c_linkman_cell =", value, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellNotEqualTo(String value) {
            addCriterion("c_linkman_cell <>", value, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellGreaterThan(String value) {
            addCriterion("c_linkman_cell >", value, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellGreaterThanOrEqualTo(String value) {
            addCriterion("c_linkman_cell >=", value, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellLessThan(String value) {
            addCriterion("c_linkman_cell <", value, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellLessThanOrEqualTo(String value) {
            addCriterion("c_linkman_cell <=", value, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellLike(String value) {
            addCriterion("c_linkman_cell like", value, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellNotLike(String value) {
            addCriterion("c_linkman_cell not like", value, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellIn(List<String> values) {
            addCriterion("c_linkman_cell in", values, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellNotIn(List<String> values) {
            addCriterion("c_linkman_cell not in", values, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellBetween(String value1, String value2) {
            addCriterion("c_linkman_cell between", value1, value2, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCLinkmanCellNotBetween(String value1, String value2) {
            addCriterion("c_linkman_cell not between", value1, value2, "cLinkmanCell");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeIsNull() {
            addCriterion("c_time_range is null");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeIsNotNull() {
            addCriterion("c_time_range is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeEqualTo(String value) {
            addCriterion("c_time_range =", value, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeNotEqualTo(String value) {
            addCriterion("c_time_range <>", value, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeGreaterThan(String value) {
            addCriterion("c_time_range >", value, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeGreaterThanOrEqualTo(String value) {
            addCriterion("c_time_range >=", value, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeLessThan(String value) {
            addCriterion("c_time_range <", value, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeLessThanOrEqualTo(String value) {
            addCriterion("c_time_range <=", value, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeLike(String value) {
            addCriterion("c_time_range like", value, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeNotLike(String value) {
            addCriterion("c_time_range not like", value, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeIn(List<String> values) {
            addCriterion("c_time_range in", values, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeNotIn(List<String> values) {
            addCriterion("c_time_range not in", values, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeBetween(String value1, String value2) {
            addCriterion("c_time_range between", value1, value2, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCTimeRangeNotBetween(String value1, String value2) {
            addCriterion("c_time_range not between", value1, value2, "cTimeRange");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCIsNull() {
            addCriterion("c_flag_specialList_c is null");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCIsNotNull() {
            addCriterion("c_flag_specialList_c is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCEqualTo(String value) {
            addCriterion("c_flag_specialList_c =", value, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCNotEqualTo(String value) {
            addCriterion("c_flag_specialList_c <>", value, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCGreaterThan(String value) {
            addCriterion("c_flag_specialList_c >", value, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_specialList_c >=", value, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCLessThan(String value) {
            addCriterion("c_flag_specialList_c <", value, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCLessThanOrEqualTo(String value) {
            addCriterion("c_flag_specialList_c <=", value, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCLike(String value) {
            addCriterion("c_flag_specialList_c like", value, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCNotLike(String value) {
            addCriterion("c_flag_specialList_c not like", value, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCIn(List<String> values) {
            addCriterion("c_flag_specialList_c in", values, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCNotIn(List<String> values) {
            addCriterion("c_flag_specialList_c not in", values, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCBetween(String value1, String value2) {
            addCriterion("c_flag_specialList_c between", value1, value2, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCFlagSpeciallistCNotBetween(String value1, String value2) {
            addCriterion("c_flag_specialList_c not between", value1, value2, "cFlagSpeciallistC");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalIsNull() {
            addCriterion("c_sl_id_abnormal is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalIsNotNull() {
            addCriterion("c_sl_id_abnormal is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalEqualTo(String value) {
            addCriterion("c_sl_id_abnormal =", value, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalNotEqualTo(String value) {
            addCriterion("c_sl_id_abnormal <>", value, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalGreaterThan(String value) {
            addCriterion("c_sl_id_abnormal >", value, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_abnormal >=", value, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalLessThan(String value) {
            addCriterion("c_sl_id_abnormal <", value, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_abnormal <=", value, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalLike(String value) {
            addCriterion("c_sl_id_abnormal like", value, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalNotLike(String value) {
            addCriterion("c_sl_id_abnormal not like", value, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalIn(List<String> values) {
            addCriterion("c_sl_id_abnormal in", values, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalNotIn(List<String> values) {
            addCriterion("c_sl_id_abnormal not in", values, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalBetween(String value1, String value2) {
            addCriterion("c_sl_id_abnormal between", value1, value2, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdAbnormalNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_abnormal not between", value1, value2, "cSlIdAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueIsNull() {
            addCriterion("c_sl_id_phone_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueIsNotNull() {
            addCriterion("c_sl_id_phone_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueEqualTo(String value) {
            addCriterion("c_sl_id_phone_overdue =", value, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_phone_overdue <>", value, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_phone_overdue >", value, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_phone_overdue >=", value, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueLessThan(String value) {
            addCriterion("c_sl_id_phone_overdue <", value, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_phone_overdue <=", value, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueLike(String value) {
            addCriterion("c_sl_id_phone_overdue like", value, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueNotLike(String value) {
            addCriterion("c_sl_id_phone_overdue not like", value, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueIn(List<String> values) {
            addCriterion("c_sl_id_phone_overdue in", values, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_phone_overdue not in", values, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_phone_overdue between", value1, value2, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdPhoneOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_phone_overdue not between", value1, value2, "cSlIdPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadIsNull() {
            addCriterion("c_sl_id_court_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadIsNotNull() {
            addCriterion("c_sl_id_court_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadEqualTo(String value) {
            addCriterion("c_sl_id_court_bad =", value, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadNotEqualTo(String value) {
            addCriterion("c_sl_id_court_bad <>", value, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadGreaterThan(String value) {
            addCriterion("c_sl_id_court_bad >", value, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_court_bad >=", value, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadLessThan(String value) {
            addCriterion("c_sl_id_court_bad <", value, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_court_bad <=", value, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadLike(String value) {
            addCriterion("c_sl_id_court_bad like", value, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadNotLike(String value) {
            addCriterion("c_sl_id_court_bad not like", value, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadIn(List<String> values) {
            addCriterion("c_sl_id_court_bad in", values, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadNotIn(List<String> values) {
            addCriterion("c_sl_id_court_bad not in", values, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_court_bad between", value1, value2, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_court_bad not between", value1, value2, "cSlIdCourtBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedIsNull() {
            addCriterion("c_sl_id_court_executed is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedIsNotNull() {
            addCriterion("c_sl_id_court_executed is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedEqualTo(String value) {
            addCriterion("c_sl_id_court_executed =", value, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedNotEqualTo(String value) {
            addCriterion("c_sl_id_court_executed <>", value, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedGreaterThan(String value) {
            addCriterion("c_sl_id_court_executed >", value, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_court_executed >=", value, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedLessThan(String value) {
            addCriterion("c_sl_id_court_executed <", value, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_court_executed <=", value, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedLike(String value) {
            addCriterion("c_sl_id_court_executed like", value, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedNotLike(String value) {
            addCriterion("c_sl_id_court_executed not like", value, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedIn(List<String> values) {
            addCriterion("c_sl_id_court_executed in", values, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedNotIn(List<String> values) {
            addCriterion("c_sl_id_court_executed not in", values, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedBetween(String value1, String value2) {
            addCriterion("c_sl_id_court_executed between", value1, value2, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdCourtExecutedNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_court_executed not between", value1, value2, "cSlIdCourtExecuted");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadIsNull() {
            addCriterion("c_sl_id_bank_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadIsNotNull() {
            addCriterion("c_sl_id_bank_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadEqualTo(String value) {
            addCriterion("c_sl_id_bank_bad =", value, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadNotEqualTo(String value) {
            addCriterion("c_sl_id_bank_bad <>", value, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadGreaterThan(String value) {
            addCriterion("c_sl_id_bank_bad >", value, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_bad >=", value, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadLessThan(String value) {
            addCriterion("c_sl_id_bank_bad <", value, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_bad <=", value, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadLike(String value) {
            addCriterion("c_sl_id_bank_bad like", value, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadNotLike(String value) {
            addCriterion("c_sl_id_bank_bad not like", value, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadIn(List<String> values) {
            addCriterion("c_sl_id_bank_bad in", values, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadNotIn(List<String> values) {
            addCriterion("c_sl_id_bank_bad not in", values, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_bad between", value1, value2, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_bad not between", value1, value2, "cSlIdBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueIsNull() {
            addCriterion("c_sl_id_bank_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueIsNotNull() {
            addCriterion("c_sl_id_bank_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueEqualTo(String value) {
            addCriterion("c_sl_id_bank_overdue =", value, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_bank_overdue <>", value, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_bank_overdue >", value, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_overdue >=", value, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueLessThan(String value) {
            addCriterion("c_sl_id_bank_overdue <", value, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_overdue <=", value, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueLike(String value) {
            addCriterion("c_sl_id_bank_overdue like", value, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueNotLike(String value) {
            addCriterion("c_sl_id_bank_overdue not like", value, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueIn(List<String> values) {
            addCriterion("c_sl_id_bank_overdue in", values, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_bank_overdue not in", values, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_overdue between", value1, value2, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_overdue not between", value1, value2, "cSlIdBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudIsNull() {
            addCriterion("c_sl_id_bank_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudIsNotNull() {
            addCriterion("c_sl_id_bank_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudEqualTo(String value) {
            addCriterion("c_sl_id_bank_fraud =", value, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudNotEqualTo(String value) {
            addCriterion("c_sl_id_bank_fraud <>", value, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudGreaterThan(String value) {
            addCriterion("c_sl_id_bank_fraud >", value, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_fraud >=", value, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudLessThan(String value) {
            addCriterion("c_sl_id_bank_fraud <", value, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_fraud <=", value, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudLike(String value) {
            addCriterion("c_sl_id_bank_fraud like", value, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudNotLike(String value) {
            addCriterion("c_sl_id_bank_fraud not like", value, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudIn(List<String> values) {
            addCriterion("c_sl_id_bank_fraud in", values, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudNotIn(List<String> values) {
            addCriterion("c_sl_id_bank_fraud not in", values, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_fraud between", value1, value2, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_fraud not between", value1, value2, "cSlIdBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostIsNull() {
            addCriterion("c_sl_id_bank_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostIsNotNull() {
            addCriterion("c_sl_id_bank_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostEqualTo(String value) {
            addCriterion("c_sl_id_bank_lost =", value, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostNotEqualTo(String value) {
            addCriterion("c_sl_id_bank_lost <>", value, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostGreaterThan(String value) {
            addCriterion("c_sl_id_bank_lost >", value, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_lost >=", value, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostLessThan(String value) {
            addCriterion("c_sl_id_bank_lost <", value, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_lost <=", value, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostLike(String value) {
            addCriterion("c_sl_id_bank_lost like", value, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostNotLike(String value) {
            addCriterion("c_sl_id_bank_lost not like", value, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostIn(List<String> values) {
            addCriterion("c_sl_id_bank_lost in", values, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostNotIn(List<String> values) {
            addCriterion("c_sl_id_bank_lost not in", values, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_lost between", value1, value2, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_lost not between", value1, value2, "cSlIdBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseIsNull() {
            addCriterion("c_sl_id_bank_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseIsNotNull() {
            addCriterion("c_sl_id_bank_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseEqualTo(String value) {
            addCriterion("c_sl_id_bank_refuse =", value, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseNotEqualTo(String value) {
            addCriterion("c_sl_id_bank_refuse <>", value, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseGreaterThan(String value) {
            addCriterion("c_sl_id_bank_refuse >", value, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_refuse >=", value, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseLessThan(String value) {
            addCriterion("c_sl_id_bank_refuse <", value, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_bank_refuse <=", value, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseLike(String value) {
            addCriterion("c_sl_id_bank_refuse like", value, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseNotLike(String value) {
            addCriterion("c_sl_id_bank_refuse not like", value, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseIn(List<String> values) {
            addCriterion("c_sl_id_bank_refuse in", values, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseNotIn(List<String> values) {
            addCriterion("c_sl_id_bank_refuse not in", values, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_refuse between", value1, value2, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdBankRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_bank_refuse not between", value1, value2, "cSlIdBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadIsNull() {
            addCriterion("c_sl_id_p2p_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadIsNotNull() {
            addCriterion("c_sl_id_p2p_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadEqualTo(String value) {
            addCriterion("c_sl_id_p2p_bad =", value, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadNotEqualTo(String value) {
            addCriterion("c_sl_id_p2p_bad <>", value, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadGreaterThan(String value) {
            addCriterion("c_sl_id_p2p_bad >", value, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_bad >=", value, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadLessThan(String value) {
            addCriterion("c_sl_id_p2p_bad <", value, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_bad <=", value, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadLike(String value) {
            addCriterion("c_sl_id_p2p_bad like", value, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadNotLike(String value) {
            addCriterion("c_sl_id_p2p_bad not like", value, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadIn(List<String> values) {
            addCriterion("c_sl_id_p2p_bad in", values, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadNotIn(List<String> values) {
            addCriterion("c_sl_id_p2p_bad not in", values, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_bad between", value1, value2, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_bad not between", value1, value2, "cSlIdP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueIsNull() {
            addCriterion("c_sl_id_p2p_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueIsNotNull() {
            addCriterion("c_sl_id_p2p_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueEqualTo(String value) {
            addCriterion("c_sl_id_p2p_overdue =", value, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_p2p_overdue <>", value, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_p2p_overdue >", value, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_overdue >=", value, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueLessThan(String value) {
            addCriterion("c_sl_id_p2p_overdue <", value, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_overdue <=", value, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueLike(String value) {
            addCriterion("c_sl_id_p2p_overdue like", value, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueNotLike(String value) {
            addCriterion("c_sl_id_p2p_overdue not like", value, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueIn(List<String> values) {
            addCriterion("c_sl_id_p2p_overdue in", values, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_p2p_overdue not in", values, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_overdue between", value1, value2, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_overdue not between", value1, value2, "cSlIdP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudIsNull() {
            addCriterion("c_sl_id_p2p_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudIsNotNull() {
            addCriterion("c_sl_id_p2p_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudEqualTo(String value) {
            addCriterion("c_sl_id_p2p_fraud =", value, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudNotEqualTo(String value) {
            addCriterion("c_sl_id_p2p_fraud <>", value, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudGreaterThan(String value) {
            addCriterion("c_sl_id_p2p_fraud >", value, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_fraud >=", value, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudLessThan(String value) {
            addCriterion("c_sl_id_p2p_fraud <", value, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_fraud <=", value, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudLike(String value) {
            addCriterion("c_sl_id_p2p_fraud like", value, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudNotLike(String value) {
            addCriterion("c_sl_id_p2p_fraud not like", value, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudIn(List<String> values) {
            addCriterion("c_sl_id_p2p_fraud in", values, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudNotIn(List<String> values) {
            addCriterion("c_sl_id_p2p_fraud not in", values, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_fraud between", value1, value2, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_fraud not between", value1, value2, "cSlIdP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostIsNull() {
            addCriterion("c_sl_id_p2p_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostIsNotNull() {
            addCriterion("c_sl_id_p2p_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostEqualTo(String value) {
            addCriterion("c_sl_id_p2p_lost =", value, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostNotEqualTo(String value) {
            addCriterion("c_sl_id_p2p_lost <>", value, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostGreaterThan(String value) {
            addCriterion("c_sl_id_p2p_lost >", value, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_lost >=", value, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostLessThan(String value) {
            addCriterion("c_sl_id_p2p_lost <", value, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_lost <=", value, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostLike(String value) {
            addCriterion("c_sl_id_p2p_lost like", value, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostNotLike(String value) {
            addCriterion("c_sl_id_p2p_lost not like", value, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostIn(List<String> values) {
            addCriterion("c_sl_id_p2p_lost in", values, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostNotIn(List<String> values) {
            addCriterion("c_sl_id_p2p_lost not in", values, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_lost between", value1, value2, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_lost not between", value1, value2, "cSlIdP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseIsNull() {
            addCriterion("c_sl_id_p2p_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseIsNotNull() {
            addCriterion("c_sl_id_p2p_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseEqualTo(String value) {
            addCriterion("c_sl_id_p2p_refuse =", value, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseNotEqualTo(String value) {
            addCriterion("c_sl_id_p2p_refuse <>", value, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseGreaterThan(String value) {
            addCriterion("c_sl_id_p2p_refuse >", value, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_refuse >=", value, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseLessThan(String value) {
            addCriterion("c_sl_id_p2p_refuse <", value, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_p2p_refuse <=", value, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseLike(String value) {
            addCriterion("c_sl_id_p2p_refuse like", value, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseNotLike(String value) {
            addCriterion("c_sl_id_p2p_refuse not like", value, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseIn(List<String> values) {
            addCriterion("c_sl_id_p2p_refuse in", values, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseNotIn(List<String> values) {
            addCriterion("c_sl_id_p2p_refuse not in", values, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_refuse between", value1, value2, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdP2pRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_p2p_refuse not between", value1, value2, "cSlIdP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadIsNull() {
            addCriterion("c_sl_id_nbank_p2p_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadIsNotNull() {
            addCriterion("c_sl_id_nbank_p2p_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_bad =", value, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_bad <>", value, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_bad >", value, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_bad >=", value, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadLessThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_bad <", value, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_bad <=", value, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_bad like", value, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadNotLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_bad not like", value, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_bad in", values, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_bad not in", values, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_bad between", value1, value2, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_bad not between", value1, value2, "cSlIdNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueIsNull() {
            addCriterion("c_sl_id_nbank_p2p_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueIsNotNull() {
            addCriterion("c_sl_id_nbank_p2p_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_overdue =", value, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_overdue <>", value, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_overdue >", value, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_overdue >=", value, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueLessThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_overdue <", value, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_overdue <=", value, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_overdue like", value, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueNotLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_overdue not like", value, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_overdue in", values, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_overdue not in", values, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_overdue between", value1, value2, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_overdue not between", value1, value2, "cSlIdNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudIsNull() {
            addCriterion("c_sl_id_nbank_p2p_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudIsNotNull() {
            addCriterion("c_sl_id_nbank_p2p_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_fraud =", value, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_fraud <>", value, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_fraud >", value, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_fraud >=", value, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudLessThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_fraud <", value, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_fraud <=", value, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_fraud like", value, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudNotLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_fraud not like", value, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_fraud in", values, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_fraud not in", values, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_fraud between", value1, value2, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_fraud not between", value1, value2, "cSlIdNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostIsNull() {
            addCriterion("c_sl_id_nbank_p2p_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostIsNotNull() {
            addCriterion("c_sl_id_nbank_p2p_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_lost =", value, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_lost <>", value, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_lost >", value, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_lost >=", value, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostLessThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_lost <", value, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_lost <=", value, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_lost like", value, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostNotLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_lost not like", value, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_lost in", values, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_lost not in", values, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_lost between", value1, value2, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_lost not between", value1, value2, "cSlIdNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseIsNull() {
            addCriterion("c_sl_id_nbank_p2p_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseIsNotNull() {
            addCriterion("c_sl_id_nbank_p2p_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_refuse =", value, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_refuse <>", value, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_refuse >", value, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_refuse >=", value, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseLessThan(String value) {
            addCriterion("c_sl_id_nbank_p2p_refuse <", value, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_p2p_refuse <=", value, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_refuse like", value, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseNotLike(String value) {
            addCriterion("c_sl_id_nbank_p2p_refuse not like", value, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_refuse in", values, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_p2p_refuse not in", values, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_refuse between", value1, value2, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankP2pRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_p2p_refuse not between", value1, value2, "cSlIdNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadIsNull() {
            addCriterion("c_sl_id_nbank_mc_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadIsNotNull() {
            addCriterion("c_sl_id_nbank_mc_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_bad =", value, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_bad <>", value, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_mc_bad >", value, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_bad >=", value, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadLessThan(String value) {
            addCriterion("c_sl_id_nbank_mc_bad <", value, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_bad <=", value, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadLike(String value) {
            addCriterion("c_sl_id_nbank_mc_bad like", value, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadNotLike(String value) {
            addCriterion("c_sl_id_nbank_mc_bad not like", value, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_bad in", values, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_bad not in", values, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_bad between", value1, value2, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_bad not between", value1, value2, "cSlIdNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueIsNull() {
            addCriterion("c_sl_id_nbank_mc_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueIsNotNull() {
            addCriterion("c_sl_id_nbank_mc_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_overdue =", value, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_overdue <>", value, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_mc_overdue >", value, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_overdue >=", value, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueLessThan(String value) {
            addCriterion("c_sl_id_nbank_mc_overdue <", value, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_overdue <=", value, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueLike(String value) {
            addCriterion("c_sl_id_nbank_mc_overdue like", value, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueNotLike(String value) {
            addCriterion("c_sl_id_nbank_mc_overdue not like", value, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_overdue in", values, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_overdue not in", values, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_overdue between", value1, value2, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_overdue not between", value1, value2, "cSlIdNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudIsNull() {
            addCriterion("c_sl_id_nbank_mc_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudIsNotNull() {
            addCriterion("c_sl_id_nbank_mc_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_fraud =", value, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_fraud <>", value, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_mc_fraud >", value, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_fraud >=", value, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudLessThan(String value) {
            addCriterion("c_sl_id_nbank_mc_fraud <", value, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_fraud <=", value, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudLike(String value) {
            addCriterion("c_sl_id_nbank_mc_fraud like", value, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudNotLike(String value) {
            addCriterion("c_sl_id_nbank_mc_fraud not like", value, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_fraud in", values, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_fraud not in", values, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_fraud between", value1, value2, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_fraud not between", value1, value2, "cSlIdNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostIsNull() {
            addCriterion("c_sl_id_nbank_mc_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostIsNotNull() {
            addCriterion("c_sl_id_nbank_mc_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_lost =", value, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_lost <>", value, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_mc_lost >", value, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_lost >=", value, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostLessThan(String value) {
            addCriterion("c_sl_id_nbank_mc_lost <", value, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_lost <=", value, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostLike(String value) {
            addCriterion("c_sl_id_nbank_mc_lost like", value, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostNotLike(String value) {
            addCriterion("c_sl_id_nbank_mc_lost not like", value, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_lost in", values, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_lost not in", values, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_lost between", value1, value2, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_lost not between", value1, value2, "cSlIdNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseIsNull() {
            addCriterion("c_sl_id_nbank_mc_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseIsNotNull() {
            addCriterion("c_sl_id_nbank_mc_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_refuse =", value, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_refuse <>", value, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_mc_refuse >", value, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_refuse >=", value, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseLessThan(String value) {
            addCriterion("c_sl_id_nbank_mc_refuse <", value, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_mc_refuse <=", value, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseLike(String value) {
            addCriterion("c_sl_id_nbank_mc_refuse like", value, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseNotLike(String value) {
            addCriterion("c_sl_id_nbank_mc_refuse not like", value, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_refuse in", values, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_mc_refuse not in", values, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_refuse between", value1, value2, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankMcRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_mc_refuse not between", value1, value2, "cSlIdNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadIsNull() {
            addCriterion("c_sl_id_nbank_ca_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadIsNotNull() {
            addCriterion("c_sl_id_nbank_ca_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_bad =", value, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_bad <>", value, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_ca_bad >", value, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_bad >=", value, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadLessThan(String value) {
            addCriterion("c_sl_id_nbank_ca_bad <", value, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_bad <=", value, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadLike(String value) {
            addCriterion("c_sl_id_nbank_ca_bad like", value, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadNotLike(String value) {
            addCriterion("c_sl_id_nbank_ca_bad not like", value, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_bad in", values, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_bad not in", values, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_bad between", value1, value2, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_bad not between", value1, value2, "cSlIdNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueIsNull() {
            addCriterion("c_sl_id_nbank_ca_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueIsNotNull() {
            addCriterion("c_sl_id_nbank_ca_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_overdue =", value, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_overdue <>", value, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_ca_overdue >", value, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_overdue >=", value, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueLessThan(String value) {
            addCriterion("c_sl_id_nbank_ca_overdue <", value, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_overdue <=", value, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueLike(String value) {
            addCriterion("c_sl_id_nbank_ca_overdue like", value, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueNotLike(String value) {
            addCriterion("c_sl_id_nbank_ca_overdue not like", value, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_overdue in", values, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_overdue not in", values, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_overdue between", value1, value2, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_overdue not between", value1, value2, "cSlIdNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudIsNull() {
            addCriterion("c_sl_id_nbank_ca_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudIsNotNull() {
            addCriterion("c_sl_id_nbank_ca_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_fraud =", value, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_fraud <>", value, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_ca_fraud >", value, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_fraud >=", value, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudLessThan(String value) {
            addCriterion("c_sl_id_nbank_ca_fraud <", value, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_fraud <=", value, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudLike(String value) {
            addCriterion("c_sl_id_nbank_ca_fraud like", value, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudNotLike(String value) {
            addCriterion("c_sl_id_nbank_ca_fraud not like", value, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_fraud in", values, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_fraud not in", values, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_fraud between", value1, value2, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_fraud not between", value1, value2, "cSlIdNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostIsNull() {
            addCriterion("c_sl_id_nbank_ca_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostIsNotNull() {
            addCriterion("c_sl_id_nbank_ca_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_lost =", value, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_lost <>", value, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_ca_lost >", value, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_lost >=", value, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostLessThan(String value) {
            addCriterion("c_sl_id_nbank_ca_lost <", value, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_lost <=", value, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostLike(String value) {
            addCriterion("c_sl_id_nbank_ca_lost like", value, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostNotLike(String value) {
            addCriterion("c_sl_id_nbank_ca_lost not like", value, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_lost in", values, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_lost not in", values, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_lost between", value1, value2, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_lost not between", value1, value2, "cSlIdNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseIsNull() {
            addCriterion("c_sl_id_nbank_ca_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseIsNotNull() {
            addCriterion("c_sl_id_nbank_ca_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_refuse =", value, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_refuse <>", value, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_ca_refuse >", value, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_refuse >=", value, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseLessThan(String value) {
            addCriterion("c_sl_id_nbank_ca_refuse <", value, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_ca_refuse <=", value, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseLike(String value) {
            addCriterion("c_sl_id_nbank_ca_refuse like", value, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseNotLike(String value) {
            addCriterion("c_sl_id_nbank_ca_refuse not like", value, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_refuse in", values, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_ca_refuse not in", values, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_refuse between", value1, value2, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCaRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_ca_refuse not between", value1, value2, "cSlIdNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadIsNull() {
            addCriterion("c_sl_id_nbank_com_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadIsNotNull() {
            addCriterion("c_sl_id_nbank_com_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_bad =", value, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_bad <>", value, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_com_bad >", value, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_bad >=", value, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadLessThan(String value) {
            addCriterion("c_sl_id_nbank_com_bad <", value, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_bad <=", value, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadLike(String value) {
            addCriterion("c_sl_id_nbank_com_bad like", value, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadNotLike(String value) {
            addCriterion("c_sl_id_nbank_com_bad not like", value, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_bad in", values, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_bad not in", values, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_bad between", value1, value2, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_bad not between", value1, value2, "cSlIdNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueIsNull() {
            addCriterion("c_sl_id_nbank_com_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueIsNotNull() {
            addCriterion("c_sl_id_nbank_com_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_overdue =", value, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_overdue <>", value, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_com_overdue >", value, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_overdue >=", value, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueLessThan(String value) {
            addCriterion("c_sl_id_nbank_com_overdue <", value, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_overdue <=", value, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueLike(String value) {
            addCriterion("c_sl_id_nbank_com_overdue like", value, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueNotLike(String value) {
            addCriterion("c_sl_id_nbank_com_overdue not like", value, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_overdue in", values, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_overdue not in", values, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_overdue between", value1, value2, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_overdue not between", value1, value2, "cSlIdNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudIsNull() {
            addCriterion("c_sl_id_nbank_com_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudIsNotNull() {
            addCriterion("c_sl_id_nbank_com_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_fraud =", value, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_fraud <>", value, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_com_fraud >", value, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_fraud >=", value, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudLessThan(String value) {
            addCriterion("c_sl_id_nbank_com_fraud <", value, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_fraud <=", value, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudLike(String value) {
            addCriterion("c_sl_id_nbank_com_fraud like", value, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudNotLike(String value) {
            addCriterion("c_sl_id_nbank_com_fraud not like", value, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_fraud in", values, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_fraud not in", values, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_fraud between", value1, value2, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_fraud not between", value1, value2, "cSlIdNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostIsNull() {
            addCriterion("c_sl_id_nbank_com_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostIsNotNull() {
            addCriterion("c_sl_id_nbank_com_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_lost =", value, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_lost <>", value, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_com_lost >", value, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_lost >=", value, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostLessThan(String value) {
            addCriterion("c_sl_id_nbank_com_lost <", value, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_lost <=", value, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostLike(String value) {
            addCriterion("c_sl_id_nbank_com_lost like", value, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostNotLike(String value) {
            addCriterion("c_sl_id_nbank_com_lost not like", value, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_lost in", values, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_lost not in", values, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_lost between", value1, value2, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_lost not between", value1, value2, "cSlIdNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseIsNull() {
            addCriterion("c_sl_id_nbank_com_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseIsNotNull() {
            addCriterion("c_sl_id_nbank_com_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_refuse =", value, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_refuse <>", value, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_com_refuse >", value, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_refuse >=", value, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseLessThan(String value) {
            addCriterion("c_sl_id_nbank_com_refuse <", value, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_com_refuse <=", value, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseLike(String value) {
            addCriterion("c_sl_id_nbank_com_refuse like", value, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseNotLike(String value) {
            addCriterion("c_sl_id_nbank_com_refuse not like", value, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_refuse in", values, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_com_refuse not in", values, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_refuse between", value1, value2, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankComRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_com_refuse not between", value1, value2, "cSlIdNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadIsNull() {
            addCriterion("c_sl_id_nbank_cf_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadIsNotNull() {
            addCriterion("c_sl_id_nbank_cf_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_bad =", value, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_bad <>", value, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_cf_bad >", value, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_bad >=", value, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadLessThan(String value) {
            addCriterion("c_sl_id_nbank_cf_bad <", value, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_bad <=", value, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadLike(String value) {
            addCriterion("c_sl_id_nbank_cf_bad like", value, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadNotLike(String value) {
            addCriterion("c_sl_id_nbank_cf_bad not like", value, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_bad in", values, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_bad not in", values, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_bad between", value1, value2, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_bad not between", value1, value2, "cSlIdNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueIsNull() {
            addCriterion("c_sl_id_nbank_cf_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueIsNotNull() {
            addCriterion("c_sl_id_nbank_cf_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_overdue =", value, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_overdue <>", value, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_cf_overdue >", value, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_overdue >=", value, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueLessThan(String value) {
            addCriterion("c_sl_id_nbank_cf_overdue <", value, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_overdue <=", value, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueLike(String value) {
            addCriterion("c_sl_id_nbank_cf_overdue like", value, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueNotLike(String value) {
            addCriterion("c_sl_id_nbank_cf_overdue not like", value, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_overdue in", values, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_overdue not in", values, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_overdue between", value1, value2, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_overdue not between", value1, value2, "cSlIdNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudIsNull() {
            addCriterion("c_sl_id_nbank_cf_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudIsNotNull() {
            addCriterion("c_sl_id_nbank_cf_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_fraud =", value, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_fraud <>", value, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_cf_fraud >", value, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_fraud >=", value, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudLessThan(String value) {
            addCriterion("c_sl_id_nbank_cf_fraud <", value, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_fraud <=", value, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudLike(String value) {
            addCriterion("c_sl_id_nbank_cf_fraud like", value, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudNotLike(String value) {
            addCriterion("c_sl_id_nbank_cf_fraud not like", value, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_fraud in", values, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_fraud not in", values, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_fraud between", value1, value2, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_fraud not between", value1, value2, "cSlIdNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostIsNull() {
            addCriterion("c_sl_id_nbank_cf_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostIsNotNull() {
            addCriterion("c_sl_id_nbank_cf_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_lost =", value, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_lost <>", value, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_cf_lost >", value, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_lost >=", value, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostLessThan(String value) {
            addCriterion("c_sl_id_nbank_cf_lost <", value, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_lost <=", value, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostLike(String value) {
            addCriterion("c_sl_id_nbank_cf_lost like", value, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostNotLike(String value) {
            addCriterion("c_sl_id_nbank_cf_lost not like", value, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_lost in", values, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_lost not in", values, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_lost between", value1, value2, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_lost not between", value1, value2, "cSlIdNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseIsNull() {
            addCriterion("c_sl_id_nbank_cf_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseIsNotNull() {
            addCriterion("c_sl_id_nbank_cf_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_refuse =", value, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_refuse <>", value, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_cf_refuse >", value, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_refuse >=", value, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseLessThan(String value) {
            addCriterion("c_sl_id_nbank_cf_refuse <", value, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_cf_refuse <=", value, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseLike(String value) {
            addCriterion("c_sl_id_nbank_cf_refuse like", value, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseNotLike(String value) {
            addCriterion("c_sl_id_nbank_cf_refuse not like", value, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_refuse in", values, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_cf_refuse not in", values, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_refuse between", value1, value2, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankCfRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_cf_refuse not between", value1, value2, "cSlIdNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadIsNull() {
            addCriterion("c_sl_id_nbank_other_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadIsNotNull() {
            addCriterion("c_sl_id_nbank_other_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_bad =", value, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_bad <>", value, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_other_bad >", value, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_bad >=", value, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadLessThan(String value) {
            addCriterion("c_sl_id_nbank_other_bad <", value, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_bad <=", value, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadLike(String value) {
            addCriterion("c_sl_id_nbank_other_bad like", value, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadNotLike(String value) {
            addCriterion("c_sl_id_nbank_other_bad not like", value, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_bad in", values, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_bad not in", values, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_bad between", value1, value2, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_bad not between", value1, value2, "cSlIdNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueIsNull() {
            addCriterion("c_sl_id_nbank_other_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueIsNotNull() {
            addCriterion("c_sl_id_nbank_other_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_overdue =", value, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_overdue <>", value, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_other_overdue >", value, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_overdue >=", value, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueLessThan(String value) {
            addCriterion("c_sl_id_nbank_other_overdue <", value, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_overdue <=", value, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueLike(String value) {
            addCriterion("c_sl_id_nbank_other_overdue like", value, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueNotLike(String value) {
            addCriterion("c_sl_id_nbank_other_overdue not like", value, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_overdue in", values, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_overdue not in", values, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_overdue between", value1, value2, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_overdue not between", value1, value2, "cSlIdNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudIsNull() {
            addCriterion("c_sl_id_nbank_other_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudIsNotNull() {
            addCriterion("c_sl_id_nbank_other_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_fraud =", value, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_fraud <>", value, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_other_fraud >", value, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_fraud >=", value, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudLessThan(String value) {
            addCriterion("c_sl_id_nbank_other_fraud <", value, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_fraud <=", value, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudLike(String value) {
            addCriterion("c_sl_id_nbank_other_fraud like", value, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudNotLike(String value) {
            addCriterion("c_sl_id_nbank_other_fraud not like", value, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_fraud in", values, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_fraud not in", values, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_fraud between", value1, value2, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_fraud not between", value1, value2, "cSlIdNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostIsNull() {
            addCriterion("c_sl_id_nbank_other_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostIsNotNull() {
            addCriterion("c_sl_id_nbank_other_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_lost =", value, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_lost <>", value, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_other_lost >", value, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_lost >=", value, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostLessThan(String value) {
            addCriterion("c_sl_id_nbank_other_lost <", value, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_lost <=", value, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostLike(String value) {
            addCriterion("c_sl_id_nbank_other_lost like", value, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostNotLike(String value) {
            addCriterion("c_sl_id_nbank_other_lost not like", value, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_lost in", values, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_lost not in", values, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_lost between", value1, value2, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_lost not between", value1, value2, "cSlIdNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseIsNull() {
            addCriterion("c_sl_id_nbank_other_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseIsNotNull() {
            addCriterion("c_sl_id_nbank_other_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_refuse =", value, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseNotEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_refuse <>", value, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseGreaterThan(String value) {
            addCriterion("c_sl_id_nbank_other_refuse >", value, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_refuse >=", value, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseLessThan(String value) {
            addCriterion("c_sl_id_nbank_other_refuse <", value, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_id_nbank_other_refuse <=", value, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseLike(String value) {
            addCriterion("c_sl_id_nbank_other_refuse like", value, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseNotLike(String value) {
            addCriterion("c_sl_id_nbank_other_refuse not like", value, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_refuse in", values, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseNotIn(List<String> values) {
            addCriterion("c_sl_id_nbank_other_refuse not in", values, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_refuse between", value1, value2, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlIdNbankOtherRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_id_nbank_other_refuse not between", value1, value2, "cSlIdNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalIsNull() {
            addCriterion("c_sl_cell_abnormal is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalIsNotNull() {
            addCriterion("c_sl_cell_abnormal is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalEqualTo(String value) {
            addCriterion("c_sl_cell_abnormal =", value, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalNotEqualTo(String value) {
            addCriterion("c_sl_cell_abnormal <>", value, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalGreaterThan(String value) {
            addCriterion("c_sl_cell_abnormal >", value, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_abnormal >=", value, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalLessThan(String value) {
            addCriterion("c_sl_cell_abnormal <", value, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_abnormal <=", value, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalLike(String value) {
            addCriterion("c_sl_cell_abnormal like", value, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalNotLike(String value) {
            addCriterion("c_sl_cell_abnormal not like", value, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalIn(List<String> values) {
            addCriterion("c_sl_cell_abnormal in", values, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalNotIn(List<String> values) {
            addCriterion("c_sl_cell_abnormal not in", values, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalBetween(String value1, String value2) {
            addCriterion("c_sl_cell_abnormal between", value1, value2, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellAbnormalNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_abnormal not between", value1, value2, "cSlCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueIsNull() {
            addCriterion("c_sl_cell_phone_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueIsNotNull() {
            addCriterion("c_sl_cell_phone_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_phone_overdue =", value, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_phone_overdue <>", value, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_phone_overdue >", value, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_phone_overdue >=", value, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueLessThan(String value) {
            addCriterion("c_sl_cell_phone_overdue <", value, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_phone_overdue <=", value, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueLike(String value) {
            addCriterion("c_sl_cell_phone_overdue like", value, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueNotLike(String value) {
            addCriterion("c_sl_cell_phone_overdue not like", value, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_phone_overdue in", values, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_phone_overdue not in", values, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_phone_overdue between", value1, value2, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellPhoneOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_phone_overdue not between", value1, value2, "cSlCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadIsNull() {
            addCriterion("c_sl_cell_bank_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadIsNotNull() {
            addCriterion("c_sl_cell_bank_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadEqualTo(String value) {
            addCriterion("c_sl_cell_bank_bad =", value, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadNotEqualTo(String value) {
            addCriterion("c_sl_cell_bank_bad <>", value, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadGreaterThan(String value) {
            addCriterion("c_sl_cell_bank_bad >", value, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_bad >=", value, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadLessThan(String value) {
            addCriterion("c_sl_cell_bank_bad <", value, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_bad <=", value, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadLike(String value) {
            addCriterion("c_sl_cell_bank_bad like", value, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadNotLike(String value) {
            addCriterion("c_sl_cell_bank_bad not like", value, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadIn(List<String> values) {
            addCriterion("c_sl_cell_bank_bad in", values, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadNotIn(List<String> values) {
            addCriterion("c_sl_cell_bank_bad not in", values, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_bad between", value1, value2, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_bad not between", value1, value2, "cSlCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueIsNull() {
            addCriterion("c_sl_cell_bank_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueIsNotNull() {
            addCriterion("c_sl_cell_bank_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_bank_overdue =", value, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_bank_overdue <>", value, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_bank_overdue >", value, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_overdue >=", value, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueLessThan(String value) {
            addCriterion("c_sl_cell_bank_overdue <", value, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_overdue <=", value, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueLike(String value) {
            addCriterion("c_sl_cell_bank_overdue like", value, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueNotLike(String value) {
            addCriterion("c_sl_cell_bank_overdue not like", value, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_bank_overdue in", values, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_bank_overdue not in", values, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_overdue between", value1, value2, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_overdue not between", value1, value2, "cSlCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudIsNull() {
            addCriterion("c_sl_cell_bank_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudIsNotNull() {
            addCriterion("c_sl_cell_bank_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudEqualTo(String value) {
            addCriterion("c_sl_cell_bank_fraud =", value, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudNotEqualTo(String value) {
            addCriterion("c_sl_cell_bank_fraud <>", value, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudGreaterThan(String value) {
            addCriterion("c_sl_cell_bank_fraud >", value, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_fraud >=", value, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudLessThan(String value) {
            addCriterion("c_sl_cell_bank_fraud <", value, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_fraud <=", value, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudLike(String value) {
            addCriterion("c_sl_cell_bank_fraud like", value, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudNotLike(String value) {
            addCriterion("c_sl_cell_bank_fraud not like", value, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudIn(List<String> values) {
            addCriterion("c_sl_cell_bank_fraud in", values, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudNotIn(List<String> values) {
            addCriterion("c_sl_cell_bank_fraud not in", values, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_fraud between", value1, value2, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_fraud not between", value1, value2, "cSlCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostIsNull() {
            addCriterion("c_sl_cell_bank_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostIsNotNull() {
            addCriterion("c_sl_cell_bank_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostEqualTo(String value) {
            addCriterion("c_sl_cell_bank_lost =", value, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostNotEqualTo(String value) {
            addCriterion("c_sl_cell_bank_lost <>", value, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostGreaterThan(String value) {
            addCriterion("c_sl_cell_bank_lost >", value, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_lost >=", value, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostLessThan(String value) {
            addCriterion("c_sl_cell_bank_lost <", value, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_lost <=", value, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostLike(String value) {
            addCriterion("c_sl_cell_bank_lost like", value, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostNotLike(String value) {
            addCriterion("c_sl_cell_bank_lost not like", value, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostIn(List<String> values) {
            addCriterion("c_sl_cell_bank_lost in", values, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostNotIn(List<String> values) {
            addCriterion("c_sl_cell_bank_lost not in", values, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_lost between", value1, value2, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_lost not between", value1, value2, "cSlCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseIsNull() {
            addCriterion("c_sl_cell_bank_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseIsNotNull() {
            addCriterion("c_sl_cell_bank_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseEqualTo(String value) {
            addCriterion("c_sl_cell_bank_refuse =", value, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseNotEqualTo(String value) {
            addCriterion("c_sl_cell_bank_refuse <>", value, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseGreaterThan(String value) {
            addCriterion("c_sl_cell_bank_refuse >", value, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_refuse >=", value, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseLessThan(String value) {
            addCriterion("c_sl_cell_bank_refuse <", value, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_bank_refuse <=", value, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseLike(String value) {
            addCriterion("c_sl_cell_bank_refuse like", value, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseNotLike(String value) {
            addCriterion("c_sl_cell_bank_refuse not like", value, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseIn(List<String> values) {
            addCriterion("c_sl_cell_bank_refuse in", values, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseNotIn(List<String> values) {
            addCriterion("c_sl_cell_bank_refuse not in", values, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_refuse between", value1, value2, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellBankRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_bank_refuse not between", value1, value2, "cSlCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadIsNull() {
            addCriterion("c_sl_cell_p2p_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadIsNotNull() {
            addCriterion("c_sl_cell_p2p_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_bad =", value, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadNotEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_bad <>", value, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadGreaterThan(String value) {
            addCriterion("c_sl_cell_p2p_bad >", value, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_bad >=", value, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadLessThan(String value) {
            addCriterion("c_sl_cell_p2p_bad <", value, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_bad <=", value, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadLike(String value) {
            addCriterion("c_sl_cell_p2p_bad like", value, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadNotLike(String value) {
            addCriterion("c_sl_cell_p2p_bad not like", value, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_bad in", values, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadNotIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_bad not in", values, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_bad between", value1, value2, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_bad not between", value1, value2, "cSlCellP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueIsNull() {
            addCriterion("c_sl_cell_p2p_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueIsNotNull() {
            addCriterion("c_sl_cell_p2p_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_overdue =", value, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_overdue <>", value, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_p2p_overdue >", value, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_overdue >=", value, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueLessThan(String value) {
            addCriterion("c_sl_cell_p2p_overdue <", value, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_overdue <=", value, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueLike(String value) {
            addCriterion("c_sl_cell_p2p_overdue like", value, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueNotLike(String value) {
            addCriterion("c_sl_cell_p2p_overdue not like", value, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_overdue in", values, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_overdue not in", values, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_overdue between", value1, value2, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_overdue not between", value1, value2, "cSlCellP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudIsNull() {
            addCriterion("c_sl_cell_p2p_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudIsNotNull() {
            addCriterion("c_sl_cell_p2p_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_fraud =", value, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudNotEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_fraud <>", value, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudGreaterThan(String value) {
            addCriterion("c_sl_cell_p2p_fraud >", value, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_fraud >=", value, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudLessThan(String value) {
            addCriterion("c_sl_cell_p2p_fraud <", value, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_fraud <=", value, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudLike(String value) {
            addCriterion("c_sl_cell_p2p_fraud like", value, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudNotLike(String value) {
            addCriterion("c_sl_cell_p2p_fraud not like", value, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_fraud in", values, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudNotIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_fraud not in", values, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_fraud between", value1, value2, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_fraud not between", value1, value2, "cSlCellP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostIsNull() {
            addCriterion("c_sl_cell_p2p_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostIsNotNull() {
            addCriterion("c_sl_cell_p2p_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_lost =", value, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostNotEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_lost <>", value, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostGreaterThan(String value) {
            addCriterion("c_sl_cell_p2p_lost >", value, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_lost >=", value, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostLessThan(String value) {
            addCriterion("c_sl_cell_p2p_lost <", value, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_lost <=", value, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostLike(String value) {
            addCriterion("c_sl_cell_p2p_lost like", value, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostNotLike(String value) {
            addCriterion("c_sl_cell_p2p_lost not like", value, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_lost in", values, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostNotIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_lost not in", values, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_lost between", value1, value2, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_lost not between", value1, value2, "cSlCellP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseIsNull() {
            addCriterion("c_sl_cell_p2p_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseIsNotNull() {
            addCriterion("c_sl_cell_p2p_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_refuse =", value, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseNotEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_refuse <>", value, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseGreaterThan(String value) {
            addCriterion("c_sl_cell_p2p_refuse >", value, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_refuse >=", value, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseLessThan(String value) {
            addCriterion("c_sl_cell_p2p_refuse <", value, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_p2p_refuse <=", value, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseLike(String value) {
            addCriterion("c_sl_cell_p2p_refuse like", value, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseNotLike(String value) {
            addCriterion("c_sl_cell_p2p_refuse not like", value, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_refuse in", values, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseNotIn(List<String> values) {
            addCriterion("c_sl_cell_p2p_refuse not in", values, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_refuse between", value1, value2, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellP2pRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_p2p_refuse not between", value1, value2, "cSlCellP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadIsNull() {
            addCriterion("c_sl_cell_nbank_p2p_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadIsNotNull() {
            addCriterion("c_sl_cell_nbank_p2p_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_bad =", value, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_bad <>", value, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_bad >", value, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_bad >=", value, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadLessThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_bad <", value, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_bad <=", value, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_bad like", value, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadNotLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_bad not like", value, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_bad in", values, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_bad not in", values, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_bad between", value1, value2, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_bad not between", value1, value2, "cSlCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueIsNull() {
            addCriterion("c_sl_cell_nbank_p2p_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueIsNotNull() {
            addCriterion("c_sl_cell_nbank_p2p_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_overdue =", value, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_overdue <>", value, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_overdue >", value, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_overdue >=", value, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueLessThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_overdue <", value, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_overdue <=", value, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_overdue like", value, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueNotLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_overdue not like", value, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_overdue in", values, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_overdue not in", values, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_overdue between", value1, value2, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_overdue not between", value1, value2, "cSlCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudIsNull() {
            addCriterion("c_sl_cell_nbank_p2p_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudIsNotNull() {
            addCriterion("c_sl_cell_nbank_p2p_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_fraud =", value, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_fraud <>", value, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_fraud >", value, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_fraud >=", value, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudLessThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_fraud <", value, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_fraud <=", value, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_fraud like", value, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudNotLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_fraud not like", value, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_fraud in", values, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_fraud not in", values, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_fraud between", value1, value2, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_fraud not between", value1, value2, "cSlCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostIsNull() {
            addCriterion("c_sl_cell_nbank_p2p_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostIsNotNull() {
            addCriterion("c_sl_cell_nbank_p2p_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_lost =", value, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_lost <>", value, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_lost >", value, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_lost >=", value, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostLessThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_lost <", value, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_lost <=", value, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_lost like", value, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostNotLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_lost not like", value, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_lost in", values, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_lost not in", values, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_lost between", value1, value2, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_lost not between", value1, value2, "cSlCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseIsNull() {
            addCriterion("c_sl_cell_nbank_p2p_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseIsNotNull() {
            addCriterion("c_sl_cell_nbank_p2p_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_refuse =", value, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_refuse <>", value, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_refuse >", value, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_refuse >=", value, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseLessThan(String value) {
            addCriterion("c_sl_cell_nbank_p2p_refuse <", value, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_p2p_refuse <=", value, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_refuse like", value, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseNotLike(String value) {
            addCriterion("c_sl_cell_nbank_p2p_refuse not like", value, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_refuse in", values, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_p2p_refuse not in", values, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_refuse between", value1, value2, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankP2pRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_p2p_refuse not between", value1, value2, "cSlCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadIsNull() {
            addCriterion("c_sl_cell_nbank_mc_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadIsNotNull() {
            addCriterion("c_sl_cell_nbank_mc_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_bad =", value, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_bad <>", value, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_bad >", value, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_bad >=", value, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadLessThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_bad <", value, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_bad <=", value, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_bad like", value, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadNotLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_bad not like", value, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_bad in", values, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_bad not in", values, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_bad between", value1, value2, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_bad not between", value1, value2, "cSlCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueIsNull() {
            addCriterion("c_sl_cell_nbank_mc_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueIsNotNull() {
            addCriterion("c_sl_cell_nbank_mc_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_overdue =", value, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_overdue <>", value, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_overdue >", value, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_overdue >=", value, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueLessThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_overdue <", value, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_overdue <=", value, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_overdue like", value, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueNotLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_overdue not like", value, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_overdue in", values, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_overdue not in", values, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_overdue between", value1, value2, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_overdue not between", value1, value2, "cSlCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudIsNull() {
            addCriterion("c_sl_cell_nbank_mc_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudIsNotNull() {
            addCriterion("c_sl_cell_nbank_mc_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_fraud =", value, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_fraud <>", value, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_fraud >", value, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_fraud >=", value, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudLessThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_fraud <", value, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_fraud <=", value, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_fraud like", value, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudNotLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_fraud not like", value, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_fraud in", values, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_fraud not in", values, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_fraud between", value1, value2, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_fraud not between", value1, value2, "cSlCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostIsNull() {
            addCriterion("c_sl_cell_nbank_mc_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostIsNotNull() {
            addCriterion("c_sl_cell_nbank_mc_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_lost =", value, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_lost <>", value, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_lost >", value, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_lost >=", value, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostLessThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_lost <", value, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_lost <=", value, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_lost like", value, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostNotLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_lost not like", value, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_lost in", values, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_lost not in", values, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_lost between", value1, value2, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_lost not between", value1, value2, "cSlCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseIsNull() {
            addCriterion("c_sl_cell_nbank_mc_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseIsNotNull() {
            addCriterion("c_sl_cell_nbank_mc_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_refuse =", value, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_refuse <>", value, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_refuse >", value, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_refuse >=", value, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseLessThan(String value) {
            addCriterion("c_sl_cell_nbank_mc_refuse <", value, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_mc_refuse <=", value, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_refuse like", value, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseNotLike(String value) {
            addCriterion("c_sl_cell_nbank_mc_refuse not like", value, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_refuse in", values, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_mc_refuse not in", values, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_refuse between", value1, value2, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankMcRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_mc_refuse not between", value1, value2, "cSlCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadIsNull() {
            addCriterion("c_sl_cell_nbank_ca_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadIsNotNull() {
            addCriterion("c_sl_cell_nbank_ca_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_bad =", value, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_bad <>", value, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_bad >", value, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_bad >=", value, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadLessThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_bad <", value, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_bad <=", value, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_bad like", value, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadNotLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_bad not like", value, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_bad in", values, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_bad not in", values, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_bad between", value1, value2, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_bad not between", value1, value2, "cSlCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueIsNull() {
            addCriterion("c_sl_cell_nbank_ca_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueIsNotNull() {
            addCriterion("c_sl_cell_nbank_ca_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_overdue =", value, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_overdue <>", value, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_overdue >", value, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_overdue >=", value, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueLessThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_overdue <", value, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_overdue <=", value, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_overdue like", value, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueNotLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_overdue not like", value, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_overdue in", values, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_overdue not in", values, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_overdue between", value1, value2, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_overdue not between", value1, value2, "cSlCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudIsNull() {
            addCriterion("c_sl_cell_nbank_ca_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudIsNotNull() {
            addCriterion("c_sl_cell_nbank_ca_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_fraud =", value, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_fraud <>", value, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_fraud >", value, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_fraud >=", value, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudLessThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_fraud <", value, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_fraud <=", value, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_fraud like", value, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudNotLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_fraud not like", value, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_fraud in", values, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_fraud not in", values, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_fraud between", value1, value2, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_fraud not between", value1, value2, "cSlCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostIsNull() {
            addCriterion("c_sl_cell_nbank_ca_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostIsNotNull() {
            addCriterion("c_sl_cell_nbank_ca_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_lost =", value, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_lost <>", value, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_lost >", value, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_lost >=", value, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostLessThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_lost <", value, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_lost <=", value, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_lost like", value, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostNotLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_lost not like", value, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_lost in", values, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_lost not in", values, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_lost between", value1, value2, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_lost not between", value1, value2, "cSlCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseIsNull() {
            addCriterion("c_sl_cell_nbank_ca_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseIsNotNull() {
            addCriterion("c_sl_cell_nbank_ca_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_refuse =", value, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_refuse <>", value, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_refuse >", value, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_refuse >=", value, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseLessThan(String value) {
            addCriterion("c_sl_cell_nbank_ca_refuse <", value, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_ca_refuse <=", value, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_refuse like", value, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseNotLike(String value) {
            addCriterion("c_sl_cell_nbank_ca_refuse not like", value, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_refuse in", values, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_ca_refuse not in", values, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_refuse between", value1, value2, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCaRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_ca_refuse not between", value1, value2, "cSlCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadIsNull() {
            addCriterion("c_sl_cell_nbank_com_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadIsNotNull() {
            addCriterion("c_sl_cell_nbank_com_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_bad =", value, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_bad <>", value, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_com_bad >", value, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_bad >=", value, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadLessThan(String value) {
            addCriterion("c_sl_cell_nbank_com_bad <", value, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_bad <=", value, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadLike(String value) {
            addCriterion("c_sl_cell_nbank_com_bad like", value, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadNotLike(String value) {
            addCriterion("c_sl_cell_nbank_com_bad not like", value, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_bad in", values, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_bad not in", values, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_bad between", value1, value2, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_bad not between", value1, value2, "cSlCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueIsNull() {
            addCriterion("c_sl_cell_nbank_com_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueIsNotNull() {
            addCriterion("c_sl_cell_nbank_com_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_overdue =", value, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_overdue <>", value, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_com_overdue >", value, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_overdue >=", value, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueLessThan(String value) {
            addCriterion("c_sl_cell_nbank_com_overdue <", value, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_overdue <=", value, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueLike(String value) {
            addCriterion("c_sl_cell_nbank_com_overdue like", value, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueNotLike(String value) {
            addCriterion("c_sl_cell_nbank_com_overdue not like", value, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_overdue in", values, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_overdue not in", values, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_overdue between", value1, value2, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_overdue not between", value1, value2, "cSlCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudIsNull() {
            addCriterion("c_sl_cell_nbank_com_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudIsNotNull() {
            addCriterion("c_sl_cell_nbank_com_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_fraud =", value, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_fraud <>", value, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_com_fraud >", value, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_fraud >=", value, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudLessThan(String value) {
            addCriterion("c_sl_cell_nbank_com_fraud <", value, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_fraud <=", value, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudLike(String value) {
            addCriterion("c_sl_cell_nbank_com_fraud like", value, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudNotLike(String value) {
            addCriterion("c_sl_cell_nbank_com_fraud not like", value, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_fraud in", values, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_fraud not in", values, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_fraud between", value1, value2, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_fraud not between", value1, value2, "cSlCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostIsNull() {
            addCriterion("c_sl_cell_nbank_com_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostIsNotNull() {
            addCriterion("c_sl_cell_nbank_com_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_lost =", value, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_lost <>", value, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_com_lost >", value, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_lost >=", value, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostLessThan(String value) {
            addCriterion("c_sl_cell_nbank_com_lost <", value, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_lost <=", value, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostLike(String value) {
            addCriterion("c_sl_cell_nbank_com_lost like", value, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostNotLike(String value) {
            addCriterion("c_sl_cell_nbank_com_lost not like", value, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_lost in", values, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_lost not in", values, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_lost between", value1, value2, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_lost not between", value1, value2, "cSlCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseIsNull() {
            addCriterion("c_sl_cell_nbank_com_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseIsNotNull() {
            addCriterion("c_sl_cell_nbank_com_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_refuse =", value, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_refuse <>", value, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_com_refuse >", value, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_refuse >=", value, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseLessThan(String value) {
            addCriterion("c_sl_cell_nbank_com_refuse <", value, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_com_refuse <=", value, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseLike(String value) {
            addCriterion("c_sl_cell_nbank_com_refuse like", value, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseNotLike(String value) {
            addCriterion("c_sl_cell_nbank_com_refuse not like", value, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_refuse in", values, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_com_refuse not in", values, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_refuse between", value1, value2, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankComRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_com_refuse not between", value1, value2, "cSlCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadIsNull() {
            addCriterion("c_sl_cell_nbank_cf_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadIsNotNull() {
            addCriterion("c_sl_cell_nbank_cf_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_bad =", value, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_bad <>", value, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_bad >", value, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_bad >=", value, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadLessThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_bad <", value, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_bad <=", value, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_bad like", value, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadNotLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_bad not like", value, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_bad in", values, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_bad not in", values, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_bad between", value1, value2, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_bad not between", value1, value2, "cSlCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueIsNull() {
            addCriterion("c_sl_cell_nbank_cf_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueIsNotNull() {
            addCriterion("c_sl_cell_nbank_cf_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_overdue =", value, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_overdue <>", value, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_overdue >", value, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_overdue >=", value, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueLessThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_overdue <", value, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_overdue <=", value, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_overdue like", value, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueNotLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_overdue not like", value, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_overdue in", values, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_overdue not in", values, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_overdue between", value1, value2, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_overdue not between", value1, value2, "cSlCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudIsNull() {
            addCriterion("c_sl_cell_nbank_cf_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudIsNotNull() {
            addCriterion("c_sl_cell_nbank_cf_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_fraud =", value, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_fraud <>", value, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_fraud >", value, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_fraud >=", value, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudLessThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_fraud <", value, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_fraud <=", value, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_fraud like", value, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudNotLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_fraud not like", value, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_fraud in", values, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_fraud not in", values, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_fraud between", value1, value2, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_fraud not between", value1, value2, "cSlCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostIsNull() {
            addCriterion("c_sl_cell_nbank_cf_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostIsNotNull() {
            addCriterion("c_sl_cell_nbank_cf_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_lost =", value, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_lost <>", value, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_lost >", value, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_lost >=", value, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostLessThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_lost <", value, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_lost <=", value, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_lost like", value, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostNotLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_lost not like", value, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_lost in", values, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_lost not in", values, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_lost between", value1, value2, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_lost not between", value1, value2, "cSlCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseIsNull() {
            addCriterion("c_sl_cell_nbank_cf_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseIsNotNull() {
            addCriterion("c_sl_cell_nbank_cf_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_refuse =", value, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_refuse <>", value, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_refuse >", value, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_refuse >=", value, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseLessThan(String value) {
            addCriterion("c_sl_cell_nbank_cf_refuse <", value, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_cf_refuse <=", value, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_refuse like", value, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseNotLike(String value) {
            addCriterion("c_sl_cell_nbank_cf_refuse not like", value, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_refuse in", values, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_cf_refuse not in", values, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_refuse between", value1, value2, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankCfRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_cf_refuse not between", value1, value2, "cSlCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadIsNull() {
            addCriterion("c_sl_cell_nbank_other_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadIsNotNull() {
            addCriterion("c_sl_cell_nbank_other_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_bad =", value, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_bad <>", value, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_other_bad >", value, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_bad >=", value, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadLessThan(String value) {
            addCriterion("c_sl_cell_nbank_other_bad <", value, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_bad <=", value, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadLike(String value) {
            addCriterion("c_sl_cell_nbank_other_bad like", value, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadNotLike(String value) {
            addCriterion("c_sl_cell_nbank_other_bad not like", value, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_bad in", values, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_bad not in", values, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_bad between", value1, value2, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_bad not between", value1, value2, "cSlCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueIsNull() {
            addCriterion("c_sl_cell_nbank_other_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueIsNotNull() {
            addCriterion("c_sl_cell_nbank_other_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_overdue =", value, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_overdue <>", value, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_other_overdue >", value, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_overdue >=", value, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueLessThan(String value) {
            addCriterion("c_sl_cell_nbank_other_overdue <", value, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_overdue <=", value, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueLike(String value) {
            addCriterion("c_sl_cell_nbank_other_overdue like", value, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueNotLike(String value) {
            addCriterion("c_sl_cell_nbank_other_overdue not like", value, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_overdue in", values, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_overdue not in", values, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_overdue between", value1, value2, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_overdue not between", value1, value2, "cSlCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudIsNull() {
            addCriterion("c_sl_cell_nbank_other_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudIsNotNull() {
            addCriterion("c_sl_cell_nbank_other_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_fraud =", value, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_fraud <>", value, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_other_fraud >", value, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_fraud >=", value, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudLessThan(String value) {
            addCriterion("c_sl_cell_nbank_other_fraud <", value, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_fraud <=", value, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudLike(String value) {
            addCriterion("c_sl_cell_nbank_other_fraud like", value, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudNotLike(String value) {
            addCriterion("c_sl_cell_nbank_other_fraud not like", value, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_fraud in", values, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_fraud not in", values, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_fraud between", value1, value2, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_fraud not between", value1, value2, "cSlCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostIsNull() {
            addCriterion("c_sl_cell_nbank_other_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostIsNotNull() {
            addCriterion("c_sl_cell_nbank_other_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_lost =", value, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_lost <>", value, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_other_lost >", value, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_lost >=", value, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostLessThan(String value) {
            addCriterion("c_sl_cell_nbank_other_lost <", value, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_lost <=", value, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostLike(String value) {
            addCriterion("c_sl_cell_nbank_other_lost like", value, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostNotLike(String value) {
            addCriterion("c_sl_cell_nbank_other_lost not like", value, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_lost in", values, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_lost not in", values, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_lost between", value1, value2, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_lost not between", value1, value2, "cSlCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseIsNull() {
            addCriterion("c_sl_cell_nbank_other_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseIsNotNull() {
            addCriterion("c_sl_cell_nbank_other_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_refuse =", value, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseNotEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_refuse <>", value, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseGreaterThan(String value) {
            addCriterion("c_sl_cell_nbank_other_refuse >", value, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_refuse >=", value, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseLessThan(String value) {
            addCriterion("c_sl_cell_nbank_other_refuse <", value, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_cell_nbank_other_refuse <=", value, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseLike(String value) {
            addCriterion("c_sl_cell_nbank_other_refuse like", value, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseNotLike(String value) {
            addCriterion("c_sl_cell_nbank_other_refuse not like", value, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_refuse in", values, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseNotIn(List<String> values) {
            addCriterion("c_sl_cell_nbank_other_refuse not in", values, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_refuse between", value1, value2, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlCellNbankOtherRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_cell_nbank_other_refuse not between", value1, value2, "cSlCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalIsNull() {
            addCriterion("c_sl_lm_cell_abnormal is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalIsNotNull() {
            addCriterion("c_sl_lm_cell_abnormal is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalEqualTo(String value) {
            addCriterion("c_sl_lm_cell_abnormal =", value, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_abnormal <>", value, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_abnormal >", value, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_abnormal >=", value, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalLessThan(String value) {
            addCriterion("c_sl_lm_cell_abnormal <", value, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_abnormal <=", value, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalLike(String value) {
            addCriterion("c_sl_lm_cell_abnormal like", value, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalNotLike(String value) {
            addCriterion("c_sl_lm_cell_abnormal not like", value, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalIn(List<String> values) {
            addCriterion("c_sl_lm_cell_abnormal in", values, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_abnormal not in", values, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_abnormal between", value1, value2, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellAbnormalNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_abnormal not between", value1, value2, "cSlLmCellAbnormal");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueIsNull() {
            addCriterion("c_sl_lm_cell_phone_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueIsNotNull() {
            addCriterion("c_sl_lm_cell_phone_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueEqualTo(String value) {
            addCriterion("c_sl_lm_cell_phone_overdue =", value, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_phone_overdue <>", value, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_phone_overdue >", value, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_phone_overdue >=", value, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueLessThan(String value) {
            addCriterion("c_sl_lm_cell_phone_overdue <", value, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_phone_overdue <=", value, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueLike(String value) {
            addCriterion("c_sl_lm_cell_phone_overdue like", value, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueNotLike(String value) {
            addCriterion("c_sl_lm_cell_phone_overdue not like", value, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueIn(List<String> values) {
            addCriterion("c_sl_lm_cell_phone_overdue in", values, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_phone_overdue not in", values, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_phone_overdue between", value1, value2, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellPhoneOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_phone_overdue not between", value1, value2, "cSlLmCellPhoneOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadIsNull() {
            addCriterion("c_sl_lm_cell_bank_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadIsNotNull() {
            addCriterion("c_sl_lm_cell_bank_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_bad =", value, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_bad <>", value, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_bank_bad >", value, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_bad >=", value, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadLessThan(String value) {
            addCriterion("c_sl_lm_cell_bank_bad <", value, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_bad <=", value, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadLike(String value) {
            addCriterion("c_sl_lm_cell_bank_bad like", value, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadNotLike(String value) {
            addCriterion("c_sl_lm_cell_bank_bad not like", value, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_bad in", values, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_bad not in", values, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_bad between", value1, value2, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_bad not between", value1, value2, "cSlLmCellBankBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueIsNull() {
            addCriterion("c_sl_lm_cell_bank_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueIsNotNull() {
            addCriterion("c_sl_lm_cell_bank_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_overdue =", value, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_overdue <>", value, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_bank_overdue >", value, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_overdue >=", value, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueLessThan(String value) {
            addCriterion("c_sl_lm_cell_bank_overdue <", value, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_overdue <=", value, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueLike(String value) {
            addCriterion("c_sl_lm_cell_bank_overdue like", value, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueNotLike(String value) {
            addCriterion("c_sl_lm_cell_bank_overdue not like", value, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_overdue in", values, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_overdue not in", values, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_overdue between", value1, value2, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_overdue not between", value1, value2, "cSlLmCellBankOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudIsNull() {
            addCriterion("c_sl_lm_cell_bank_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudIsNotNull() {
            addCriterion("c_sl_lm_cell_bank_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_fraud =", value, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_fraud <>", value, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_bank_fraud >", value, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_fraud >=", value, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudLessThan(String value) {
            addCriterion("c_sl_lm_cell_bank_fraud <", value, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_fraud <=", value, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudLike(String value) {
            addCriterion("c_sl_lm_cell_bank_fraud like", value, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudNotLike(String value) {
            addCriterion("c_sl_lm_cell_bank_fraud not like", value, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_fraud in", values, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_fraud not in", values, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_fraud between", value1, value2, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_fraud not between", value1, value2, "cSlLmCellBankFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostIsNull() {
            addCriterion("c_sl_lm_cell_bank_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostIsNotNull() {
            addCriterion("c_sl_lm_cell_bank_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_lost =", value, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_lost <>", value, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_bank_lost >", value, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_lost >=", value, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostLessThan(String value) {
            addCriterion("c_sl_lm_cell_bank_lost <", value, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_lost <=", value, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostLike(String value) {
            addCriterion("c_sl_lm_cell_bank_lost like", value, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostNotLike(String value) {
            addCriterion("c_sl_lm_cell_bank_lost not like", value, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_lost in", values, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_lost not in", values, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_lost between", value1, value2, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_lost not between", value1, value2, "cSlLmCellBankLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseIsNull() {
            addCriterion("c_sl_lm_cell_bank_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseIsNotNull() {
            addCriterion("c_sl_lm_cell_bank_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_refuse =", value, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_refuse <>", value, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_bank_refuse >", value, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_refuse >=", value, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseLessThan(String value) {
            addCriterion("c_sl_lm_cell_bank_refuse <", value, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_bank_refuse <=", value, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseLike(String value) {
            addCriterion("c_sl_lm_cell_bank_refuse like", value, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseNotLike(String value) {
            addCriterion("c_sl_lm_cell_bank_refuse not like", value, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_refuse in", values, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_bank_refuse not in", values, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_refuse between", value1, value2, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellBankRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_bank_refuse not between", value1, value2, "cSlLmCellBankRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadIsNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad =", value, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad <>", value, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad >", value, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad >=", value, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad <", value, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad <=", value, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad like", value, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad not like", value, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad in", values, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad not in", values, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad between", value1, value2, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_bad not between", value1, value2, "cSlLmCellNbankP2pBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueIsNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue =", value, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue <>", value, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue >", value, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue >=", value, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue <", value, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue <=", value, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue like", value, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue not like", value, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue in", values, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue not in", values, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue between", value1, value2, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_overdue not between", value1, value2, "cSlLmCellNbankP2pOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudIsNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud =", value, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud <>", value, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud >", value, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud >=", value, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud <", value, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud <=", value, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud like", value, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud not like", value, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud in", values, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud not in", values, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud between", value1, value2, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_fraud not between", value1, value2, "cSlLmCellNbankP2pFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostIsNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost =", value, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost <>", value, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost >", value, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost >=", value, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost <", value, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost <=", value, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost like", value, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost not like", value, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost in", values, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost not in", values, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost between", value1, value2, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_lost not between", value1, value2, "cSlLmCellNbankP2pLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseIsNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse =", value, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse <>", value, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse >", value, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse >=", value, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse <", value, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse <=", value, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse like", value, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse not like", value, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse in", values, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse not in", values, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse between", value1, value2, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankP2pRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_p2p_refuse not between", value1, value2, "cSlLmCellNbankP2pRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadIsNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad =", value, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad <>", value, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad >", value, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad >=", value, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad <", value, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad <=", value, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad like", value, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad not like", value, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad in", values, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad not in", values, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad between", value1, value2, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_bad not between", value1, value2, "cSlLmCellNbankMcBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueIsNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue =", value, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue <>", value, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue >", value, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue >=", value, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue <", value, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue <=", value, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue like", value, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue not like", value, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue in", values, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue not in", values, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue between", value1, value2, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_overdue not between", value1, value2, "cSlLmCellNbankMcOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudIsNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud =", value, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud <>", value, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud >", value, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud >=", value, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud <", value, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud <=", value, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud like", value, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud not like", value, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud in", values, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud not in", values, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud between", value1, value2, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_fraud not between", value1, value2, "cSlLmCellNbankMcFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostIsNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost =", value, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost <>", value, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost >", value, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost >=", value, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost <", value, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost <=", value, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost like", value, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost not like", value, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost in", values, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost not in", values, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost between", value1, value2, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_lost not between", value1, value2, "cSlLmCellNbankMcLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseIsNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse =", value, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse <>", value, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse >", value, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse >=", value, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse <", value, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse <=", value, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse like", value, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse not like", value, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse in", values, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse not in", values, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse between", value1, value2, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankMcRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_mc_refuse not between", value1, value2, "cSlLmCellNbankMcRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadIsNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad =", value, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad <>", value, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad >", value, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad >=", value, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad <", value, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad <=", value, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad like", value, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad not like", value, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad in", values, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad not in", values, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad between", value1, value2, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_bad not between", value1, value2, "cSlLmCellNbankCaBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueIsNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue =", value, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue <>", value, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue >", value, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue >=", value, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue <", value, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue <=", value, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue like", value, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue not like", value, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue in", values, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue not in", values, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue between", value1, value2, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_overdue not between", value1, value2, "cSlLmCellNbankCaOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudIsNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud =", value, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud <>", value, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud >", value, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud >=", value, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud <", value, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud <=", value, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud like", value, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud not like", value, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud in", values, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud not in", values, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud between", value1, value2, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_fraud not between", value1, value2, "cSlLmCellNbankCaFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostIsNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost =", value, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost <>", value, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost >", value, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost >=", value, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost <", value, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost <=", value, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost like", value, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost not like", value, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost in", values, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost not in", values, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost between", value1, value2, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_lost not between", value1, value2, "cSlLmCellNbankCaLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseIsNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse =", value, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse <>", value, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse >", value, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse >=", value, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse <", value, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse <=", value, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse like", value, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse not like", value, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse in", values, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse not in", values, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse between", value1, value2, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCaRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_ca_refuse not between", value1, value2, "cSlLmCellNbankCaRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadIsNull() {
            addCriterion("c_sl_lm_cell_nbank_com_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_com_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_bad =", value, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_bad <>", value, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_bad >", value, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_bad >=", value, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_bad <", value, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_bad <=", value, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_bad like", value, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_bad not like", value, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_bad in", values, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_bad not in", values, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_bad between", value1, value2, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_bad not between", value1, value2, "cSlLmCellNbankComBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueIsNull() {
            addCriterion("c_sl_lm_cell_nbank_com_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_com_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue =", value, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue <>", value, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue >", value, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue >=", value, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue <", value, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue <=", value, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue like", value, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue not like", value, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue in", values, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue not in", values, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue between", value1, value2, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_overdue not between", value1, value2, "cSlLmCellNbankComOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudIsNull() {
            addCriterion("c_sl_lm_cell_nbank_com_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_com_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud =", value, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud <>", value, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud >", value, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud >=", value, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud <", value, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud <=", value, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud like", value, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud not like", value, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud in", values, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud not in", values, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud between", value1, value2, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_fraud not between", value1, value2, "cSlLmCellNbankComFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostIsNull() {
            addCriterion("c_sl_lm_cell_nbank_com_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_com_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_lost =", value, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_lost <>", value, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_lost >", value, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_lost >=", value, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_lost <", value, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_lost <=", value, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_lost like", value, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_lost not like", value, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_lost in", values, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_lost not in", values, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_lost between", value1, value2, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_lost not between", value1, value2, "cSlLmCellNbankComLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseIsNull() {
            addCriterion("c_sl_lm_cell_nbank_com_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_com_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse =", value, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse <>", value, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse >", value, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse >=", value, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse <", value, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse <=", value, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse like", value, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse not like", value, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse in", values, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse not in", values, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse between", value1, value2, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankComRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_com_refuse not between", value1, value2, "cSlLmCellNbankComRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadIsNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad =", value, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad <>", value, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad >", value, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad >=", value, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad <", value, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad <=", value, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad like", value, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad not like", value, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad in", values, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad not in", values, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad between", value1, value2, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_bad not between", value1, value2, "cSlLmCellNbankCfBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueIsNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue =", value, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue <>", value, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue >", value, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue >=", value, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue <", value, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue <=", value, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue like", value, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue not like", value, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue in", values, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue not in", values, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue between", value1, value2, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_overdue not between", value1, value2, "cSlLmCellNbankCfOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudIsNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud =", value, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud <>", value, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud >", value, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud >=", value, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud <", value, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud <=", value, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud like", value, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud not like", value, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud in", values, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud not in", values, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud between", value1, value2, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_fraud not between", value1, value2, "cSlLmCellNbankCfFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostIsNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost =", value, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost <>", value, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost >", value, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost >=", value, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost <", value, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost <=", value, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost like", value, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost not like", value, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost in", values, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost not in", values, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost between", value1, value2, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_lost not between", value1, value2, "cSlLmCellNbankCfLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseIsNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse =", value, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse <>", value, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse >", value, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse >=", value, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse <", value, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse <=", value, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse like", value, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse not like", value, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse in", values, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse not in", values, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse between", value1, value2, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankCfRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_cf_refuse not between", value1, value2, "cSlLmCellNbankCfRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadIsNull() {
            addCriterion("c_sl_lm_cell_nbank_other_bad is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_other_bad is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_bad =", value, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_bad <>", value, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_bad >", value, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_bad >=", value, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_bad <", value, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_bad <=", value, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_bad like", value, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_bad not like", value, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_bad in", values, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_bad not in", values, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_bad between", value1, value2, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherBadNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_bad not between", value1, value2, "cSlLmCellNbankOtherBad");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueIsNull() {
            addCriterion("c_sl_lm_cell_nbank_other_overdue is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_other_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue =", value, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue <>", value, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue >", value, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue >=", value, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue <", value, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue <=", value, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue like", value, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue not like", value, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue in", values, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue not in", values, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue between", value1, value2, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherOverdueNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_overdue not between", value1, value2, "cSlLmCellNbankOtherOverdue");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudIsNull() {
            addCriterion("c_sl_lm_cell_nbank_other_fraud is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_other_fraud is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud =", value, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud <>", value, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud >", value, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud >=", value, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud <", value, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud <=", value, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud like", value, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud not like", value, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud in", values, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud not in", values, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud between", value1, value2, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherFraudNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_fraud not between", value1, value2, "cSlLmCellNbankOtherFraud");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostIsNull() {
            addCriterion("c_sl_lm_cell_nbank_other_lost is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_other_lost is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_lost =", value, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_lost <>", value, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_lost >", value, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_lost >=", value, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_lost <", value, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_lost <=", value, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_lost like", value, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_lost not like", value, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_lost in", values, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_lost not in", values, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_lost between", value1, value2, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherLostNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_lost not between", value1, value2, "cSlLmCellNbankOtherLost");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseIsNull() {
            addCriterion("c_sl_lm_cell_nbank_other_refuse is null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseIsNotNull() {
            addCriterion("c_sl_lm_cell_nbank_other_refuse is not null");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse =", value, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseNotEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse <>", value, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseGreaterThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse >", value, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse >=", value, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseLessThan(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse <", value, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseLessThanOrEqualTo(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse <=", value, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse like", value, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseNotLike(String value) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse not like", value, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse in", values, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseNotIn(List<String> values) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse not in", values, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse between", value1, value2, "cSlLmCellNbankOtherRefuse");
            return (Criteria) this;
        }

        public Criteria andCSlLmCellNbankOtherRefuseNotBetween(String value1, String value2) {
            addCriterion("c_sl_lm_cell_nbank_other_refuse not between", value1, value2, "cSlLmCellNbankOtherRefuse");
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