package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdBrRealInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdBrRealInfoExample() {
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

        public Criteria andCHomeAddrIsNull() {
            addCriterion("c_home_addr is null");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrIsNotNull() {
            addCriterion("c_home_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrEqualTo(String value) {
            addCriterion("c_home_addr =", value, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrNotEqualTo(String value) {
            addCriterion("c_home_addr <>", value, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrGreaterThan(String value) {
            addCriterion("c_home_addr >", value, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrGreaterThanOrEqualTo(String value) {
            addCriterion("c_home_addr >=", value, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrLessThan(String value) {
            addCriterion("c_home_addr <", value, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrLessThanOrEqualTo(String value) {
            addCriterion("c_home_addr <=", value, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrLike(String value) {
            addCriterion("c_home_addr like", value, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrNotLike(String value) {
            addCriterion("c_home_addr not like", value, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrIn(List<String> values) {
            addCriterion("c_home_addr in", values, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrNotIn(List<String> values) {
            addCriterion("c_home_addr not in", values, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrBetween(String value1, String value2) {
            addCriterion("c_home_addr between", value1, value2, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCHomeAddrNotBetween(String value1, String value2) {
            addCriterion("c_home_addr not between", value1, value2, "cHomeAddr");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationIsNull() {
            addCriterion("c_flag_inforelation is null");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationIsNotNull() {
            addCriterion("c_flag_inforelation is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationEqualTo(String value) {
            addCriterion("c_flag_inforelation =", value, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationNotEqualTo(String value) {
            addCriterion("c_flag_inforelation <>", value, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationGreaterThan(String value) {
            addCriterion("c_flag_inforelation >", value, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_inforelation >=", value, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationLessThan(String value) {
            addCriterion("c_flag_inforelation <", value, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationLessThanOrEqualTo(String value) {
            addCriterion("c_flag_inforelation <=", value, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationLike(String value) {
            addCriterion("c_flag_inforelation like", value, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationNotLike(String value) {
            addCriterion("c_flag_inforelation not like", value, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationIn(List<String> values) {
            addCriterion("c_flag_inforelation in", values, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationNotIn(List<String> values) {
            addCriterion("c_flag_inforelation not in", values, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationBetween(String value1, String value2) {
            addCriterion("c_flag_inforelation between", value1, value2, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCFlagInforelationNotBetween(String value1, String value2) {
            addCriterion("c_flag_inforelation not between", value1, value2, "cFlagInforelation");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntIsNull() {
            addCriterion("c_ir_id_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntIsNotNull() {
            addCriterion("c_ir_id_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_cnt =", value, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_cnt <>", value, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntGreaterThan(String value) {
            addCriterion("c_ir_id_x_cell_cnt >", value, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_cnt >=", value, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntLessThan(String value) {
            addCriterion("c_ir_id_x_cell_cnt <", value, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_cnt <=", value, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntLike(String value) {
            addCriterion("c_ir_id_x_cell_cnt like", value, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntNotLike(String value) {
            addCriterion("c_ir_id_x_cell_cnt not like", value, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntIn(List<String> values) {
            addCriterion("c_ir_id_x_cell_cnt in", values, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_id_x_cell_cnt not in", values, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_cell_cnt between", value1, value2, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_cell_cnt not between", value1, value2, "cIrIdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntIsNull() {
            addCriterion("c_ir_id_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntIsNotNull() {
            addCriterion("c_ir_id_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntEqualTo(String value) {
            addCriterion("c_ir_id_x_mail_cnt =", value, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_id_x_mail_cnt <>", value, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntGreaterThan(String value) {
            addCriterion("c_ir_id_x_mail_cnt >", value, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_mail_cnt >=", value, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntLessThan(String value) {
            addCriterion("c_ir_id_x_mail_cnt <", value, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_mail_cnt <=", value, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntLike(String value) {
            addCriterion("c_ir_id_x_mail_cnt like", value, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntNotLike(String value) {
            addCriterion("c_ir_id_x_mail_cnt not like", value, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntIn(List<String> values) {
            addCriterion("c_ir_id_x_mail_cnt in", values, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_id_x_mail_cnt not in", values, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_mail_cnt between", value1, value2, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_mail_cnt not between", value1, value2, "cIrIdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntIsNull() {
            addCriterion("c_ir_id_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntIsNotNull() {
            addCriterion("c_ir_id_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntEqualTo(String value) {
            addCriterion("c_ir_id_x_name_cnt =", value, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_id_x_name_cnt <>", value, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntGreaterThan(String value) {
            addCriterion("c_ir_id_x_name_cnt >", value, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_name_cnt >=", value, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntLessThan(String value) {
            addCriterion("c_ir_id_x_name_cnt <", value, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_name_cnt <=", value, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntLike(String value) {
            addCriterion("c_ir_id_x_name_cnt like", value, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntNotLike(String value) {
            addCriterion("c_ir_id_x_name_cnt not like", value, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntIn(List<String> values) {
            addCriterion("c_ir_id_x_name_cnt in", values, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_id_x_name_cnt not in", values, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_name_cnt between", value1, value2, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_name_cnt not between", value1, value2, "cIrIdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntIsNull() {
            addCriterion("c_ir_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntIsNotNull() {
            addCriterion("c_ir_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_cnt =", value, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_cnt <>", value, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_cell_x_id_cnt >", value, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_cnt >=", value, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntLessThan(String value) {
            addCriterion("c_ir_cell_x_id_cnt <", value, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_cnt <=", value, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntLike(String value) {
            addCriterion("c_ir_cell_x_id_cnt like", value, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntNotLike(String value) {
            addCriterion("c_ir_cell_x_id_cnt not like", value, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntIn(List<String> values) {
            addCriterion("c_ir_cell_x_id_cnt in", values, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_cell_x_id_cnt not in", values, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_id_cnt between", value1, value2, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_id_cnt not between", value1, value2, "cIrCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntIsNull() {
            addCriterion("c_ir_cell_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntIsNotNull() {
            addCriterion("c_ir_cell_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntEqualTo(String value) {
            addCriterion("c_ir_cell_x_mail_cnt =", value, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_cell_x_mail_cnt <>", value, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntGreaterThan(String value) {
            addCriterion("c_ir_cell_x_mail_cnt >", value, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_mail_cnt >=", value, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntLessThan(String value) {
            addCriterion("c_ir_cell_x_mail_cnt <", value, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_mail_cnt <=", value, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntLike(String value) {
            addCriterion("c_ir_cell_x_mail_cnt like", value, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntNotLike(String value) {
            addCriterion("c_ir_cell_x_mail_cnt not like", value, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntIn(List<String> values) {
            addCriterion("c_ir_cell_x_mail_cnt in", values, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_cell_x_mail_cnt not in", values, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_mail_cnt between", value1, value2, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_mail_cnt not between", value1, value2, "cIrCellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntIsNull() {
            addCriterion("c_ir_cell_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntIsNotNull() {
            addCriterion("c_ir_cell_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntEqualTo(String value) {
            addCriterion("c_ir_cell_x_name_cnt =", value, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_cell_x_name_cnt <>", value, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntGreaterThan(String value) {
            addCriterion("c_ir_cell_x_name_cnt >", value, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_name_cnt >=", value, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntLessThan(String value) {
            addCriterion("c_ir_cell_x_name_cnt <", value, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_name_cnt <=", value, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntLike(String value) {
            addCriterion("c_ir_cell_x_name_cnt like", value, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntNotLike(String value) {
            addCriterion("c_ir_cell_x_name_cnt not like", value, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntIn(List<String> values) {
            addCriterion("c_ir_cell_x_name_cnt in", values, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_cell_x_name_cnt not in", values, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_name_cnt between", value1, value2, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrCellXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_name_cnt not between", value1, value2, "cIrCellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellIsNull() {
            addCriterion("c_ir_id_inlistwith_cell is null");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellIsNotNull() {
            addCriterion("c_ir_id_inlistwith_cell is not null");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellEqualTo(String value) {
            addCriterion("c_ir_id_inlistwith_cell =", value, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellNotEqualTo(String value) {
            addCriterion("c_ir_id_inlistwith_cell <>", value, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellGreaterThan(String value) {
            addCriterion("c_ir_id_inlistwith_cell >", value, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_id_inlistwith_cell >=", value, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellLessThan(String value) {
            addCriterion("c_ir_id_inlistwith_cell <", value, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellLessThanOrEqualTo(String value) {
            addCriterion("c_ir_id_inlistwith_cell <=", value, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellLike(String value) {
            addCriterion("c_ir_id_inlistwith_cell like", value, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellNotLike(String value) {
            addCriterion("c_ir_id_inlistwith_cell not like", value, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellIn(List<String> values) {
            addCriterion("c_ir_id_inlistwith_cell in", values, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellNotIn(List<String> values) {
            addCriterion("c_ir_id_inlistwith_cell not in", values, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellBetween(String value1, String value2) {
            addCriterion("c_ir_id_inlistwith_cell between", value1, value2, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrIdInlistwithCellNotBetween(String value1, String value2) {
            addCriterion("c_ir_id_inlistwith_cell not between", value1, value2, "cIrIdInlistwithCell");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdIsNull() {
            addCriterion("c_ir_cell_inlistwith_id is null");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdIsNotNull() {
            addCriterion("c_ir_cell_inlistwith_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdEqualTo(String value) {
            addCriterion("c_ir_cell_inlistwith_id =", value, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdNotEqualTo(String value) {
            addCriterion("c_ir_cell_inlistwith_id <>", value, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdGreaterThan(String value) {
            addCriterion("c_ir_cell_inlistwith_id >", value, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_inlistwith_id >=", value, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdLessThan(String value) {
            addCriterion("c_ir_cell_inlistwith_id <", value, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdLessThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_inlistwith_id <=", value, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdLike(String value) {
            addCriterion("c_ir_cell_inlistwith_id like", value, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdNotLike(String value) {
            addCriterion("c_ir_cell_inlistwith_id not like", value, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdIn(List<String> values) {
            addCriterion("c_ir_cell_inlistwith_id in", values, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdNotIn(List<String> values) {
            addCriterion("c_ir_cell_inlistwith_id not in", values, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdBetween(String value1, String value2) {
            addCriterion("c_ir_cell_inlistwith_id between", value1, value2, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrCellInlistwithIdNotBetween(String value1, String value2) {
            addCriterion("c_ir_cell_inlistwith_id not between", value1, value2, "cIrCellInlistwithId");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysIsNull() {
            addCriterion("c_ir_allmatch_days is null");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysIsNotNull() {
            addCriterion("c_ir_allmatch_days is not null");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysEqualTo(String value) {
            addCriterion("c_ir_allmatch_days =", value, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysNotEqualTo(String value) {
            addCriterion("c_ir_allmatch_days <>", value, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysGreaterThan(String value) {
            addCriterion("c_ir_allmatch_days >", value, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_allmatch_days >=", value, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysLessThan(String value) {
            addCriterion("c_ir_allmatch_days <", value, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysLessThanOrEqualTo(String value) {
            addCriterion("c_ir_allmatch_days <=", value, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysLike(String value) {
            addCriterion("c_ir_allmatch_days like", value, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysNotLike(String value) {
            addCriterion("c_ir_allmatch_days not like", value, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysIn(List<String> values) {
            addCriterion("c_ir_allmatch_days in", values, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysNotIn(List<String> values) {
            addCriterion("c_ir_allmatch_days not in", values, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysBetween(String value1, String value2) {
            addCriterion("c_ir_allmatch_days between", value1, value2, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrAllmatchDaysNotBetween(String value1, String value2) {
            addCriterion("c_ir_allmatch_days not between", value1, value2, "cIrAllmatchDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysIsNull() {
            addCriterion("c_ir_id_x_cell_notmat_days is null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysIsNotNull() {
            addCriterion("c_ir_id_x_cell_notmat_days is not null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_notmat_days =", value, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysNotEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_notmat_days <>", value, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysGreaterThan(String value) {
            addCriterion("c_ir_id_x_cell_notmat_days >", value, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_notmat_days >=", value, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysLessThan(String value) {
            addCriterion("c_ir_id_x_cell_notmat_days <", value, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysLessThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_notmat_days <=", value, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysLike(String value) {
            addCriterion("c_ir_id_x_cell_notmat_days like", value, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysNotLike(String value) {
            addCriterion("c_ir_id_x_cell_notmat_days not like", value, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysIn(List<String> values) {
            addCriterion("c_ir_id_x_cell_notmat_days in", values, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysNotIn(List<String> values) {
            addCriterion("c_ir_id_x_cell_notmat_days not in", values, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_cell_notmat_days between", value1, value2, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellNotmatDaysNotBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_cell_notmat_days not between", value1, value2, "cIrIdXCellNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysIsNull() {
            addCriterion("c_ir_cell_x_id_notmat_days is null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysIsNotNull() {
            addCriterion("c_ir_cell_x_id_notmat_days is not null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_notmat_days =", value, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysNotEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_notmat_days <>", value, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysGreaterThan(String value) {
            addCriterion("c_ir_cell_x_id_notmat_days >", value, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_notmat_days >=", value, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysLessThan(String value) {
            addCriterion("c_ir_cell_x_id_notmat_days <", value, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysLessThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_notmat_days <=", value, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysLike(String value) {
            addCriterion("c_ir_cell_x_id_notmat_days like", value, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysNotLike(String value) {
            addCriterion("c_ir_cell_x_id_notmat_days not like", value, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysIn(List<String> values) {
            addCriterion("c_ir_cell_x_id_notmat_days in", values, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysNotIn(List<String> values) {
            addCriterion("c_ir_cell_x_id_notmat_days not in", values, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_id_notmat_days between", value1, value2, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdNotmatDaysNotBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_id_notmat_days not between", value1, value2, "cIrCellXIdNotmatDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysIsNull() {
            addCriterion("c_ir_id_x_cell_lastchg_days is null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysIsNotNull() {
            addCriterion("c_ir_id_x_cell_lastchg_days is not null");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_lastchg_days =", value, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysNotEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_lastchg_days <>", value, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysGreaterThan(String value) {
            addCriterion("c_ir_id_x_cell_lastchg_days >", value, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_lastchg_days >=", value, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysLessThan(String value) {
            addCriterion("c_ir_id_x_cell_lastchg_days <", value, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysLessThanOrEqualTo(String value) {
            addCriterion("c_ir_id_x_cell_lastchg_days <=", value, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysLike(String value) {
            addCriterion("c_ir_id_x_cell_lastchg_days like", value, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysNotLike(String value) {
            addCriterion("c_ir_id_x_cell_lastchg_days not like", value, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysIn(List<String> values) {
            addCriterion("c_ir_id_x_cell_lastchg_days in", values, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysNotIn(List<String> values) {
            addCriterion("c_ir_id_x_cell_lastchg_days not in", values, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_cell_lastchg_days between", value1, value2, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdXCellLastchgDaysNotBetween(String value1, String value2) {
            addCriterion("c_ir_id_x_cell_lastchg_days not between", value1, value2, "cIrIdXCellLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysIsNull() {
            addCriterion("c_ir_cell_x_id_lastchg_days is null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysIsNotNull() {
            addCriterion("c_ir_cell_x_id_lastchg_days is not null");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_lastchg_days =", value, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysNotEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_lastchg_days <>", value, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysGreaterThan(String value) {
            addCriterion("c_ir_cell_x_id_lastchg_days >", value, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_lastchg_days >=", value, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysLessThan(String value) {
            addCriterion("c_ir_cell_x_id_lastchg_days <", value, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysLessThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_x_id_lastchg_days <=", value, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysLike(String value) {
            addCriterion("c_ir_cell_x_id_lastchg_days like", value, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysNotLike(String value) {
            addCriterion("c_ir_cell_x_id_lastchg_days not like", value, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysIn(List<String> values) {
            addCriterion("c_ir_cell_x_id_lastchg_days in", values, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysNotIn(List<String> values) {
            addCriterion("c_ir_cell_x_id_lastchg_days not in", values, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_id_lastchg_days between", value1, value2, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrCellXIdLastchgDaysNotBetween(String value1, String value2) {
            addCriterion("c_ir_cell_x_id_lastchg_days not between", value1, value2, "cIrCellXIdLastchgDays");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalIsNull() {
            addCriterion("c_ir_id_is_reabnormal is null");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalIsNotNull() {
            addCriterion("c_ir_id_is_reabnormal is not null");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalEqualTo(String value) {
            addCriterion("c_ir_id_is_reabnormal =", value, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalNotEqualTo(String value) {
            addCriterion("c_ir_id_is_reabnormal <>", value, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalGreaterThan(String value) {
            addCriterion("c_ir_id_is_reabnormal >", value, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_id_is_reabnormal >=", value, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalLessThan(String value) {
            addCriterion("c_ir_id_is_reabnormal <", value, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalLessThanOrEqualTo(String value) {
            addCriterion("c_ir_id_is_reabnormal <=", value, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalLike(String value) {
            addCriterion("c_ir_id_is_reabnormal like", value, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalNotLike(String value) {
            addCriterion("c_ir_id_is_reabnormal not like", value, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalIn(List<String> values) {
            addCriterion("c_ir_id_is_reabnormal in", values, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalNotIn(List<String> values) {
            addCriterion("c_ir_id_is_reabnormal not in", values, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalBetween(String value1, String value2) {
            addCriterion("c_ir_id_is_reabnormal between", value1, value2, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrIdIsReabnormalNotBetween(String value1, String value2) {
            addCriterion("c_ir_id_is_reabnormal not between", value1, value2, "cIrIdIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalIsNull() {
            addCriterion("c_ir_cell_is_reabnormal is null");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalIsNotNull() {
            addCriterion("c_ir_cell_is_reabnormal is not null");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalEqualTo(String value) {
            addCriterion("c_ir_cell_is_reabnormal =", value, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalNotEqualTo(String value) {
            addCriterion("c_ir_cell_is_reabnormal <>", value, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalGreaterThan(String value) {
            addCriterion("c_ir_cell_is_reabnormal >", value, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_is_reabnormal >=", value, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalLessThan(String value) {
            addCriterion("c_ir_cell_is_reabnormal <", value, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalLessThanOrEqualTo(String value) {
            addCriterion("c_ir_cell_is_reabnormal <=", value, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalLike(String value) {
            addCriterion("c_ir_cell_is_reabnormal like", value, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalNotLike(String value) {
            addCriterion("c_ir_cell_is_reabnormal not like", value, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalIn(List<String> values) {
            addCriterion("c_ir_cell_is_reabnormal in", values, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalNotIn(List<String> values) {
            addCriterion("c_ir_cell_is_reabnormal not in", values, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalBetween(String value1, String value2) {
            addCriterion("c_ir_cell_is_reabnormal between", value1, value2, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrCellIsReabnormalNotBetween(String value1, String value2) {
            addCriterion("c_ir_cell_is_reabnormal not between", value1, value2, "cIrCellIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalIsNull() {
            addCriterion("c_ir_mail_is_reabnormal is null");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalIsNotNull() {
            addCriterion("c_ir_mail_is_reabnormal is not null");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalEqualTo(String value) {
            addCriterion("c_ir_mail_is_reabnormal =", value, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalNotEqualTo(String value) {
            addCriterion("c_ir_mail_is_reabnormal <>", value, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalGreaterThan(String value) {
            addCriterion("c_ir_mail_is_reabnormal >", value, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_mail_is_reabnormal >=", value, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalLessThan(String value) {
            addCriterion("c_ir_mail_is_reabnormal <", value, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalLessThanOrEqualTo(String value) {
            addCriterion("c_ir_mail_is_reabnormal <=", value, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalLike(String value) {
            addCriterion("c_ir_mail_is_reabnormal like", value, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalNotLike(String value) {
            addCriterion("c_ir_mail_is_reabnormal not like", value, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalIn(List<String> values) {
            addCriterion("c_ir_mail_is_reabnormal in", values, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalNotIn(List<String> values) {
            addCriterion("c_ir_mail_is_reabnormal not in", values, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalBetween(String value1, String value2) {
            addCriterion("c_ir_mail_is_reabnormal between", value1, value2, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrMailIsReabnormalNotBetween(String value1, String value2) {
            addCriterion("c_ir_mail_is_reabnormal not between", value1, value2, "cIrMailIsReabnormal");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntIsNull() {
            addCriterion("c_ir_m1_id_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntIsNotNull() {
            addCriterion("c_ir_m1_id_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_cell_cnt =", value, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_cell_cnt <>", value, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m1_id_x_cell_cnt >", value, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_cell_cnt >=", value, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntLessThan(String value) {
            addCriterion("c_ir_m1_id_x_cell_cnt <", value, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_cell_cnt <=", value, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntLike(String value) {
            addCriterion("c_ir_m1_id_x_cell_cnt like", value, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntNotLike(String value) {
            addCriterion("c_ir_m1_id_x_cell_cnt not like", value, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_cell_cnt in", values, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_cell_cnt not in", values, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_cell_cnt between", value1, value2, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_cell_cnt not between", value1, value2, "cIrM1IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntIsNull() {
            addCriterion("c_ir_m1_id_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntIsNotNull() {
            addCriterion("c_ir_m1_id_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_mail_cnt =", value, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_mail_cnt <>", value, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntGreaterThan(String value) {
            addCriterion("c_ir_m1_id_x_mail_cnt >", value, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_mail_cnt >=", value, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntLessThan(String value) {
            addCriterion("c_ir_m1_id_x_mail_cnt <", value, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_mail_cnt <=", value, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntLike(String value) {
            addCriterion("c_ir_m1_id_x_mail_cnt like", value, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntNotLike(String value) {
            addCriterion("c_ir_m1_id_x_mail_cnt not like", value, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_mail_cnt in", values, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_mail_cnt not in", values, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_mail_cnt between", value1, value2, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_mail_cnt not between", value1, value2, "cIrM1IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntIsNull() {
            addCriterion("c_ir_m1_id_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntIsNotNull() {
            addCriterion("c_ir_m1_id_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_name_cnt =", value, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_name_cnt <>", value, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntGreaterThan(String value) {
            addCriterion("c_ir_m1_id_x_name_cnt >", value, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_name_cnt >=", value, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntLessThan(String value) {
            addCriterion("c_ir_m1_id_x_name_cnt <", value, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_name_cnt <=", value, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntLike(String value) {
            addCriterion("c_ir_m1_id_x_name_cnt like", value, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntNotLike(String value) {
            addCriterion("c_ir_m1_id_x_name_cnt not like", value, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_name_cnt in", values, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_name_cnt not in", values, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_name_cnt between", value1, value2, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_name_cnt not between", value1, value2, "cIrM1IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntIsNull() {
            addCriterion("c_ir_m1_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntIsNotNull() {
            addCriterion("c_ir_m1_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_id_cnt =", value, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_id_cnt <>", value, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m1_cell_x_id_cnt >", value, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_id_cnt >=", value, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntLessThan(String value) {
            addCriterion("c_ir_m1_cell_x_id_cnt <", value, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_id_cnt <=", value, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntLike(String value) {
            addCriterion("c_ir_m1_cell_x_id_cnt like", value, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntNotLike(String value) {
            addCriterion("c_ir_m1_cell_x_id_cnt not like", value, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_id_cnt in", values, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_id_cnt not in", values, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_id_cnt between", value1, value2, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_id_cnt not between", value1, value2, "cIrM1CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntIsNull() {
            addCriterion("c_ir_m1_cell_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntIsNotNull() {
            addCriterion("c_ir_m1_cell_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_mail_cnt =", value, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_mail_cnt <>", value, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntGreaterThan(String value) {
            addCriterion("c_ir_m1_cell_x_mail_cnt >", value, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_mail_cnt >=", value, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntLessThan(String value) {
            addCriterion("c_ir_m1_cell_x_mail_cnt <", value, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_mail_cnt <=", value, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntLike(String value) {
            addCriterion("c_ir_m1_cell_x_mail_cnt like", value, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntNotLike(String value) {
            addCriterion("c_ir_m1_cell_x_mail_cnt not like", value, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_mail_cnt in", values, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_mail_cnt not in", values, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_mail_cnt between", value1, value2, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_mail_cnt not between", value1, value2, "cIrM1CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntIsNull() {
            addCriterion("c_ir_m1_cell_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntIsNotNull() {
            addCriterion("c_ir_m1_cell_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_name_cnt =", value, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_name_cnt <>", value, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntGreaterThan(String value) {
            addCriterion("c_ir_m1_cell_x_name_cnt >", value, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_name_cnt >=", value, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntLessThan(String value) {
            addCriterion("c_ir_m1_cell_x_name_cnt <", value, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_name_cnt <=", value, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntLike(String value) {
            addCriterion("c_ir_m1_cell_x_name_cnt like", value, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntNotLike(String value) {
            addCriterion("c_ir_m1_cell_x_name_cnt not like", value, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_name_cnt in", values, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_name_cnt not in", values, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_name_cnt between", value1, value2, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_name_cnt not between", value1, value2, "cIrM1CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntIsNull() {
            addCriterion("c_ir_m1_id_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m1_id_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt =", value, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt <>", value, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt >", value, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt >=", value, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt <", value, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt <=", value, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntLike(String value) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt like", value, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt not like", value, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt in", values, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt not in", values, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt between", value1, value2, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_tel_home_cnt not between", value1, value2, "cIrM1IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntIsNull() {
            addCriterion("c_ir_m1_id_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m1_id_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt =", value, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt <>", value, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt >", value, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt >=", value, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt <", value, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt <=", value, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt like", value, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt not like", value, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt in", values, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt not in", values, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt between", value1, value2, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_home_addr_cnt not between", value1, value2, "cIrM1IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntIsNull() {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntIsNotNull() {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt =", value, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt <>", value, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt >", value, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt >=", value, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntLessThan(String value) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt <", value, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt <=", value, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntLike(String value) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt like", value, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntNotLike(String value) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt not like", value, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt in", values, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt not in", values, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt between", value1, value2, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1IdXBizAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_id_x_biz_addr_cnt not between", value1, value2, "cIrM1IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntIsNull() {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt =", value, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt <>", value, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt >", value, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt >=", value, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt <", value, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt <=", value, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntLike(String value) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt like", value, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt not like", value, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt in", values, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt not in", values, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt between", value1, value2, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_tel_home_cnt not between", value1, value2, "cIrM1CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntIsNull() {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt =", value, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt <>", value, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt >", value, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt >=", value, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt <", value, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt <=", value, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt like", value, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt not like", value, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt in", values, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt not in", values, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt between", value1, value2, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_home_addr_cnt not between", value1, value2, "cIrM1CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntIsNull() {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntIsNotNull() {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt =", value, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt <>", value, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt >", value, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt >=", value, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntLessThan(String value) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt <", value, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt <=", value, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntLike(String value) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt like", value, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntNotLike(String value) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt not like", value, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt in", values, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt not in", values, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt between", value1, value2, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1CellXBizAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_cell_x_biz_addr_cnt not between", value1, value2, "cIrM1CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntIsNull() {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntIsNotNull() {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt =", value, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt <>", value, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt >", value, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt >=", value, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntLessThan(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt <", value, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt <=", value, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntLike(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt like", value, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntNotLike(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt not like", value, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntIn(List<String> values) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt in", values, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt not in", values, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt between", value1, value2, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_linkman_cell_x_id_cnt not between", value1, value2, "cIrM1LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntIsNull() {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntIsNotNull() {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt =", value, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt <>", value, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt >", value, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt >=", value, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntLessThan(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt <", value, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt <=", value, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntLike(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt like", value, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntNotLike(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt not like", value, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntIn(List<String> values) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt in", values, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt not in", values, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt between", value1, value2, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_linkman_cell_x_cell_cnt not between", value1, value2, "cIrM1LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntIsNull() {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt =", value, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt <>", value, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt >", value, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt >=", value, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt <", value, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt <=", value, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntLike(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt like", value, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt not like", value, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt in", values, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt not in", values, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt between", value1, value2, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1LinkmanCellXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_linkman_cell_x_tel_home_cnt not between", value1, value2, "cIrM1LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntIsNull() {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntIsNotNull() {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt =", value, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt <>", value, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt >", value, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt >=", value, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntLessThan(String value) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt <", value, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt <=", value, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntLike(String value) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt like", value, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntNotLike(String value) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt not like", value, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntIn(List<String> values) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt in", values, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt not in", values, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt between", value1, value2, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_tel_home_x_cell_cnt not between", value1, value2, "cIrM1TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntIsNull() {
            addCriterion("c_ir_m1_tel_home_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntIsNotNull() {
            addCriterion("c_ir_m1_tel_home_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt =", value, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt <>", value, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt >", value, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt >=", value, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntLessThan(String value) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt <", value, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt <=", value, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntLike(String value) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt like", value, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntNotLike(String value) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt not like", value, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntIn(List<String> values) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt in", values, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt not in", values, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt between", value1, value2, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_tel_home_x_id_cnt not between", value1, value2, "cIrM1TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntIsNull() {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntIsNotNull() {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt =", value, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt <>", value, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt >", value, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt >=", value, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntLessThan(String value) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt <", value, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt <=", value, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntLike(String value) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt like", value, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntNotLike(String value) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt not like", value, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntIn(List<String> values) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt in", values, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt not in", values, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt between", value1, value2, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_home_addr_x_cell_cnt not between", value1, value2, "cIrM1HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntIsNull() {
            addCriterion("c_ir_m1_home_addr_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntIsNotNull() {
            addCriterion("c_ir_m1_home_addr_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt =", value, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt <>", value, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt >", value, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt >=", value, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntLessThan(String value) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt <", value, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt <=", value, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntLike(String value) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt like", value, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntNotLike(String value) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt not like", value, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntIn(List<String> values) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt in", values, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt not in", values, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt between", value1, value2, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_home_addr_x_id_cnt not between", value1, value2, "cIrM1HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntIsNull() {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt =", value, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt <>", value, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt >", value, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt >=", value, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt <", value, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt <=", value, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt like", value, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt not like", value, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt in", values, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt not in", values, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt between", value1, value2, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1TelHomeXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_tel_home_x_home_addr_cnt not between", value1, value2, "cIrM1TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntIsNull() {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt =", value, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt <>", value, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt >", value, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt >=", value, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt <", value, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt <=", value, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntLike(String value) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt like", value, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt not like", value, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt in", values, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt not in", values, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt between", value1, value2, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM1HomeAddrXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m1_home_addr_x_tel_home_cnt not between", value1, value2, "cIrM1HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntIsNull() {
            addCriterion("c_ir_m3_id_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntIsNotNull() {
            addCriterion("c_ir_m3_id_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_cell_cnt =", value, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_cell_cnt <>", value, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m3_id_x_cell_cnt >", value, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_cell_cnt >=", value, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntLessThan(String value) {
            addCriterion("c_ir_m3_id_x_cell_cnt <", value, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_cell_cnt <=", value, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntLike(String value) {
            addCriterion("c_ir_m3_id_x_cell_cnt like", value, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntNotLike(String value) {
            addCriterion("c_ir_m3_id_x_cell_cnt not like", value, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_cell_cnt in", values, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_cell_cnt not in", values, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_cell_cnt between", value1, value2, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_cell_cnt not between", value1, value2, "cIrM3IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntIsNull() {
            addCriterion("c_ir_m3_id_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntIsNotNull() {
            addCriterion("c_ir_m3_id_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_mail_cnt =", value, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_mail_cnt <>", value, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntGreaterThan(String value) {
            addCriterion("c_ir_m3_id_x_mail_cnt >", value, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_mail_cnt >=", value, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntLessThan(String value) {
            addCriterion("c_ir_m3_id_x_mail_cnt <", value, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_mail_cnt <=", value, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntLike(String value) {
            addCriterion("c_ir_m3_id_x_mail_cnt like", value, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntNotLike(String value) {
            addCriterion("c_ir_m3_id_x_mail_cnt not like", value, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_mail_cnt in", values, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_mail_cnt not in", values, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_mail_cnt between", value1, value2, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_mail_cnt not between", value1, value2, "cIrM3IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntIsNull() {
            addCriterion("c_ir_m3_id_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntIsNotNull() {
            addCriterion("c_ir_m3_id_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_name_cnt =", value, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_name_cnt <>", value, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntGreaterThan(String value) {
            addCriterion("c_ir_m3_id_x_name_cnt >", value, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_name_cnt >=", value, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntLessThan(String value) {
            addCriterion("c_ir_m3_id_x_name_cnt <", value, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_name_cnt <=", value, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntLike(String value) {
            addCriterion("c_ir_m3_id_x_name_cnt like", value, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntNotLike(String value) {
            addCriterion("c_ir_m3_id_x_name_cnt not like", value, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_name_cnt in", values, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_name_cnt not in", values, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_name_cnt between", value1, value2, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_name_cnt not between", value1, value2, "cIrM3IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntIsNull() {
            addCriterion("c_ir_m3_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntIsNotNull() {
            addCriterion("c_ir_m3_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_id_cnt =", value, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_id_cnt <>", value, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m3_cell_x_id_cnt >", value, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_id_cnt >=", value, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntLessThan(String value) {
            addCriterion("c_ir_m3_cell_x_id_cnt <", value, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_id_cnt <=", value, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntLike(String value) {
            addCriterion("c_ir_m3_cell_x_id_cnt like", value, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntNotLike(String value) {
            addCriterion("c_ir_m3_cell_x_id_cnt not like", value, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_id_cnt in", values, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_id_cnt not in", values, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_id_cnt between", value1, value2, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_id_cnt not between", value1, value2, "cIrM3CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntIsNull() {
            addCriterion("c_ir_m3_cell_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntIsNotNull() {
            addCriterion("c_ir_m3_cell_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_mail_cnt =", value, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_mail_cnt <>", value, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntGreaterThan(String value) {
            addCriterion("c_ir_m3_cell_x_mail_cnt >", value, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_mail_cnt >=", value, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntLessThan(String value) {
            addCriterion("c_ir_m3_cell_x_mail_cnt <", value, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_mail_cnt <=", value, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntLike(String value) {
            addCriterion("c_ir_m3_cell_x_mail_cnt like", value, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntNotLike(String value) {
            addCriterion("c_ir_m3_cell_x_mail_cnt not like", value, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_mail_cnt in", values, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_mail_cnt not in", values, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_mail_cnt between", value1, value2, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_mail_cnt not between", value1, value2, "cIrM3CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntIsNull() {
            addCriterion("c_ir_m3_cell_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntIsNotNull() {
            addCriterion("c_ir_m3_cell_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_name_cnt =", value, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_name_cnt <>", value, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntGreaterThan(String value) {
            addCriterion("c_ir_m3_cell_x_name_cnt >", value, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_name_cnt >=", value, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntLessThan(String value) {
            addCriterion("c_ir_m3_cell_x_name_cnt <", value, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_name_cnt <=", value, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntLike(String value) {
            addCriterion("c_ir_m3_cell_x_name_cnt like", value, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntNotLike(String value) {
            addCriterion("c_ir_m3_cell_x_name_cnt not like", value, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_name_cnt in", values, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_name_cnt not in", values, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_name_cnt between", value1, value2, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_name_cnt not between", value1, value2, "cIrM3CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntIsNull() {
            addCriterion("c_ir_m3_id_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m3_id_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt =", value, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt <>", value, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt >", value, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt >=", value, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt <", value, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt <=", value, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntLike(String value) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt like", value, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt not like", value, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt in", values, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt not in", values, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt between", value1, value2, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_tel_home_cnt not between", value1, value2, "cIrM3IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntIsNull() {
            addCriterion("c_ir_m3_id_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m3_id_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt =", value, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt <>", value, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt >", value, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt >=", value, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt <", value, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt <=", value, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt like", value, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt not like", value, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt in", values, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt not in", values, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt between", value1, value2, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_home_addr_cnt not between", value1, value2, "cIrM3IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntIsNull() {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntIsNotNull() {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt =", value, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt <>", value, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt >", value, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt >=", value, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntLessThan(String value) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt <", value, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt <=", value, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntLike(String value) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt like", value, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntNotLike(String value) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt not like", value, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt in", values, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt not in", values, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt between", value1, value2, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3IdXBizAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_id_x_biz_addr_cnt not between", value1, value2, "cIrM3IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntIsNull() {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt =", value, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt <>", value, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt >", value, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt >=", value, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt <", value, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt <=", value, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntLike(String value) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt like", value, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt not like", value, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt in", values, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt not in", values, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt between", value1, value2, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_tel_home_cnt not between", value1, value2, "cIrM3CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntIsNull() {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt =", value, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt <>", value, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt >", value, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt >=", value, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt <", value, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt <=", value, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt like", value, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt not like", value, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt in", values, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt not in", values, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt between", value1, value2, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_home_addr_cnt not between", value1, value2, "cIrM3CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntIsNull() {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntIsNotNull() {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt =", value, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt <>", value, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt >", value, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt >=", value, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntLessThan(String value) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt <", value, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt <=", value, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntLike(String value) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt like", value, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntNotLike(String value) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt not like", value, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt in", values, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt not in", values, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt between", value1, value2, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3CellXBizAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_cell_x_biz_addr_cnt not between", value1, value2, "cIrM3CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntIsNull() {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntIsNotNull() {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt =", value, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt <>", value, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt >", value, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt >=", value, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntLessThan(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt <", value, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt <=", value, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntLike(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt like", value, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntNotLike(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt not like", value, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntIn(List<String> values) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt in", values, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt not in", values, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt between", value1, value2, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_linkman_cell_x_id_cnt not between", value1, value2, "cIrM3LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntIsNull() {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntIsNotNull() {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt =", value, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt <>", value, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt >", value, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt >=", value, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntLessThan(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt <", value, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt <=", value, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntLike(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt like", value, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntNotLike(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt not like", value, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntIn(List<String> values) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt in", values, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt not in", values, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt between", value1, value2, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_linkman_cell_x_cell_cnt not between", value1, value2, "cIrM3LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntIsNull() {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt =", value, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt <>", value, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt >", value, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt >=", value, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt <", value, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt <=", value, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntLike(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt like", value, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt not like", value, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt in", values, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt not in", values, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt between", value1, value2, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3LinkmanCellXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_linkman_cell_x_tel_home_cnt not between", value1, value2, "cIrM3LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntIsNull() {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntIsNotNull() {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt =", value, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt <>", value, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt >", value, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt >=", value, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntLessThan(String value) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt <", value, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt <=", value, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntLike(String value) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt like", value, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntNotLike(String value) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt not like", value, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntIn(List<String> values) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt in", values, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt not in", values, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt between", value1, value2, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_tel_home_x_cell_cnt not between", value1, value2, "cIrM3TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntIsNull() {
            addCriterion("c_ir_m3_tel_home_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntIsNotNull() {
            addCriterion("c_ir_m3_tel_home_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt =", value, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt <>", value, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt >", value, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt >=", value, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntLessThan(String value) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt <", value, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt <=", value, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntLike(String value) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt like", value, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntNotLike(String value) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt not like", value, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntIn(List<String> values) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt in", values, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt not in", values, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt between", value1, value2, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_tel_home_x_id_cnt not between", value1, value2, "cIrM3TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntIsNull() {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntIsNotNull() {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt =", value, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt <>", value, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt >", value, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt >=", value, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntLessThan(String value) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt <", value, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt <=", value, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntLike(String value) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt like", value, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntNotLike(String value) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt not like", value, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntIn(List<String> values) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt in", values, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt not in", values, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt between", value1, value2, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_home_addr_x_cell_cnt not between", value1, value2, "cIrM3HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntIsNull() {
            addCriterion("c_ir_m3_home_addr_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntIsNotNull() {
            addCriterion("c_ir_m3_home_addr_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt =", value, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt <>", value, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt >", value, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt >=", value, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntLessThan(String value) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt <", value, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt <=", value, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntLike(String value) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt like", value, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntNotLike(String value) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt not like", value, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntIn(List<String> values) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt in", values, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt not in", values, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt between", value1, value2, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_home_addr_x_id_cnt not between", value1, value2, "cIrM3HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntIsNull() {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt =", value, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt <>", value, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt >", value, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt >=", value, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt <", value, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt <=", value, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt like", value, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt not like", value, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt in", values, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt not in", values, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt between", value1, value2, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3TelHomeXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_tel_home_x_home_addr_cnt not between", value1, value2, "cIrM3TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntIsNull() {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt =", value, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt <>", value, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt >", value, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt >=", value, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt <", value, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt <=", value, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntLike(String value) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt like", value, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt not like", value, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt in", values, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt not in", values, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt between", value1, value2, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM3HomeAddrXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m3_home_addr_x_tel_home_cnt not between", value1, value2, "cIrM3HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntIsNull() {
            addCriterion("c_ir_m6_id_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntIsNotNull() {
            addCriterion("c_ir_m6_id_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_cell_cnt =", value, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_cell_cnt <>", value, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m6_id_x_cell_cnt >", value, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_cell_cnt >=", value, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntLessThan(String value) {
            addCriterion("c_ir_m6_id_x_cell_cnt <", value, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_cell_cnt <=", value, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntLike(String value) {
            addCriterion("c_ir_m6_id_x_cell_cnt like", value, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntNotLike(String value) {
            addCriterion("c_ir_m6_id_x_cell_cnt not like", value, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_cell_cnt in", values, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_cell_cnt not in", values, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_cell_cnt between", value1, value2, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_cell_cnt not between", value1, value2, "cIrM6IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntIsNull() {
            addCriterion("c_ir_m6_id_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntIsNotNull() {
            addCriterion("c_ir_m6_id_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_mail_cnt =", value, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_mail_cnt <>", value, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntGreaterThan(String value) {
            addCriterion("c_ir_m6_id_x_mail_cnt >", value, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_mail_cnt >=", value, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntLessThan(String value) {
            addCriterion("c_ir_m6_id_x_mail_cnt <", value, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_mail_cnt <=", value, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntLike(String value) {
            addCriterion("c_ir_m6_id_x_mail_cnt like", value, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntNotLike(String value) {
            addCriterion("c_ir_m6_id_x_mail_cnt not like", value, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_mail_cnt in", values, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_mail_cnt not in", values, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_mail_cnt between", value1, value2, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_mail_cnt not between", value1, value2, "cIrM6IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntIsNull() {
            addCriterion("c_ir_m6_id_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntIsNotNull() {
            addCriterion("c_ir_m6_id_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_name_cnt =", value, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_name_cnt <>", value, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntGreaterThan(String value) {
            addCriterion("c_ir_m6_id_x_name_cnt >", value, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_name_cnt >=", value, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntLessThan(String value) {
            addCriterion("c_ir_m6_id_x_name_cnt <", value, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_name_cnt <=", value, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntLike(String value) {
            addCriterion("c_ir_m6_id_x_name_cnt like", value, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntNotLike(String value) {
            addCriterion("c_ir_m6_id_x_name_cnt not like", value, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_name_cnt in", values, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_name_cnt not in", values, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_name_cnt between", value1, value2, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_name_cnt not between", value1, value2, "cIrM6IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntIsNull() {
            addCriterion("c_ir_m6_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntIsNotNull() {
            addCriterion("c_ir_m6_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_id_cnt =", value, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_id_cnt <>", value, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m6_cell_x_id_cnt >", value, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_id_cnt >=", value, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntLessThan(String value) {
            addCriterion("c_ir_m6_cell_x_id_cnt <", value, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_id_cnt <=", value, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntLike(String value) {
            addCriterion("c_ir_m6_cell_x_id_cnt like", value, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntNotLike(String value) {
            addCriterion("c_ir_m6_cell_x_id_cnt not like", value, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_id_cnt in", values, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_id_cnt not in", values, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_id_cnt between", value1, value2, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_id_cnt not between", value1, value2, "cIrM6CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntIsNull() {
            addCriterion("c_ir_m6_cell_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntIsNotNull() {
            addCriterion("c_ir_m6_cell_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_mail_cnt =", value, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_mail_cnt <>", value, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntGreaterThan(String value) {
            addCriterion("c_ir_m6_cell_x_mail_cnt >", value, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_mail_cnt >=", value, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntLessThan(String value) {
            addCriterion("c_ir_m6_cell_x_mail_cnt <", value, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_mail_cnt <=", value, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntLike(String value) {
            addCriterion("c_ir_m6_cell_x_mail_cnt like", value, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntNotLike(String value) {
            addCriterion("c_ir_m6_cell_x_mail_cnt not like", value, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_mail_cnt in", values, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_mail_cnt not in", values, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_mail_cnt between", value1, value2, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_mail_cnt not between", value1, value2, "cIrM6CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntIsNull() {
            addCriterion("c_ir_m6_cell_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntIsNotNull() {
            addCriterion("c_ir_m6_cell_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_name_cnt =", value, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_name_cnt <>", value, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntGreaterThan(String value) {
            addCriterion("c_ir_m6_cell_x_name_cnt >", value, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_name_cnt >=", value, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntLessThan(String value) {
            addCriterion("c_ir_m6_cell_x_name_cnt <", value, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_name_cnt <=", value, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntLike(String value) {
            addCriterion("c_ir_m6_cell_x_name_cnt like", value, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntNotLike(String value) {
            addCriterion("c_ir_m6_cell_x_name_cnt not like", value, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_name_cnt in", values, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_name_cnt not in", values, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_name_cnt between", value1, value2, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_name_cnt not between", value1, value2, "cIrM6CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntIsNull() {
            addCriterion("c_ir_m6_id_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m6_id_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt =", value, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt <>", value, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt >", value, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt >=", value, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt <", value, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt <=", value, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntLike(String value) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt like", value, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt not like", value, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt in", values, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt not in", values, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt between", value1, value2, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_tel_home_cnt not between", value1, value2, "cIrM6IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntIsNull() {
            addCriterion("c_ir_m6_id_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m6_id_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt =", value, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt <>", value, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt >", value, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt >=", value, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt <", value, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt <=", value, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt like", value, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt not like", value, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt in", values, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt not in", values, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt between", value1, value2, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_home_addr_cnt not between", value1, value2, "cIrM6IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntIsNull() {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntIsNotNull() {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt =", value, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt <>", value, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt >", value, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt >=", value, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntLessThan(String value) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt <", value, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt <=", value, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntLike(String value) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt like", value, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntNotLike(String value) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt not like", value, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt in", values, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt not in", values, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt between", value1, value2, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6IdXBizAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_id_x_biz_addr_cnt not between", value1, value2, "cIrM6IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntIsNull() {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt =", value, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt <>", value, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt >", value, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt >=", value, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt <", value, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt <=", value, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntLike(String value) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt like", value, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt not like", value, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt in", values, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt not in", values, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt between", value1, value2, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_tel_home_cnt not between", value1, value2, "cIrM6CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntIsNull() {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt =", value, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt <>", value, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt >", value, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt >=", value, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt <", value, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt <=", value, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt like", value, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt not like", value, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt in", values, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt not in", values, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt between", value1, value2, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_home_addr_cnt not between", value1, value2, "cIrM6CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntIsNull() {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntIsNotNull() {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt =", value, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt <>", value, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt >", value, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt >=", value, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntLessThan(String value) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt <", value, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt <=", value, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntLike(String value) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt like", value, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntNotLike(String value) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt not like", value, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt in", values, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt not in", values, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt between", value1, value2, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6CellXBizAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_cell_x_biz_addr_cnt not between", value1, value2, "cIrM6CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntIsNull() {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntIsNotNull() {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt =", value, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt <>", value, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt >", value, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt >=", value, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntLessThan(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt <", value, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt <=", value, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntLike(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt like", value, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntNotLike(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt not like", value, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntIn(List<String> values) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt in", values, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt not in", values, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt between", value1, value2, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_linkman_cell_x_id_cnt not between", value1, value2, "cIrM6LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntIsNull() {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntIsNotNull() {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt =", value, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt <>", value, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt >", value, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt >=", value, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntLessThan(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt <", value, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt <=", value, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntLike(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt like", value, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntNotLike(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt not like", value, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntIn(List<String> values) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt in", values, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt not in", values, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt between", value1, value2, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_linkman_cell_x_cell_cnt not between", value1, value2, "cIrM6LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntIsNull() {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt =", value, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt <>", value, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt >", value, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt >=", value, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt <", value, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt <=", value, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntLike(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt like", value, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt not like", value, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt in", values, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt not in", values, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt between", value1, value2, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6LinkmanCellXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_linkman_cell_x_tel_home_cnt not between", value1, value2, "cIrM6LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntIsNull() {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntIsNotNull() {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt =", value, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt <>", value, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt >", value, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt >=", value, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntLessThan(String value) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt <", value, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt <=", value, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntLike(String value) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt like", value, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntNotLike(String value) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt not like", value, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntIn(List<String> values) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt in", values, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt not in", values, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt between", value1, value2, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_tel_home_x_cell_cnt not between", value1, value2, "cIrM6TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntIsNull() {
            addCriterion("c_ir_m6_tel_home_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntIsNotNull() {
            addCriterion("c_ir_m6_tel_home_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt =", value, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt <>", value, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt >", value, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt >=", value, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntLessThan(String value) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt <", value, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt <=", value, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntLike(String value) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt like", value, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntNotLike(String value) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt not like", value, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntIn(List<String> values) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt in", values, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt not in", values, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt between", value1, value2, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_tel_home_x_id_cnt not between", value1, value2, "cIrM6TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntIsNull() {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntIsNotNull() {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt =", value, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt <>", value, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt >", value, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt >=", value, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntLessThan(String value) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt <", value, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt <=", value, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntLike(String value) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt like", value, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntNotLike(String value) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt not like", value, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntIn(List<String> values) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt in", values, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt not in", values, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt between", value1, value2, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_home_addr_x_cell_cnt not between", value1, value2, "cIrM6HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntIsNull() {
            addCriterion("c_ir_m6_home_addr_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntIsNotNull() {
            addCriterion("c_ir_m6_home_addr_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt =", value, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt <>", value, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt >", value, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt >=", value, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntLessThan(String value) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt <", value, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt <=", value, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntLike(String value) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt like", value, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntNotLike(String value) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt not like", value, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntIn(List<String> values) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt in", values, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt not in", values, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt between", value1, value2, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_home_addr_x_id_cnt not between", value1, value2, "cIrM6HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntIsNull() {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt =", value, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt <>", value, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt >", value, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt >=", value, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt <", value, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt <=", value, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt like", value, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt not like", value, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt in", values, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt not in", values, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt between", value1, value2, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6TelHomeXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_tel_home_x_home_addr_cnt not between", value1, value2, "cIrM6TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntIsNull() {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt =", value, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt <>", value, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt >", value, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt >=", value, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt <", value, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt <=", value, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntLike(String value) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt like", value, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt not like", value, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt in", values, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt not in", values, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt between", value1, value2, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM6HomeAddrXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m6_home_addr_x_tel_home_cnt not between", value1, value2, "cIrM6HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntIsNull() {
            addCriterion("c_ir_m12_id_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntIsNotNull() {
            addCriterion("c_ir_m12_id_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_cell_cnt =", value, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_cell_cnt <>", value, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m12_id_x_cell_cnt >", value, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_cell_cnt >=", value, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntLessThan(String value) {
            addCriterion("c_ir_m12_id_x_cell_cnt <", value, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_cell_cnt <=", value, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntLike(String value) {
            addCriterion("c_ir_m12_id_x_cell_cnt like", value, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntNotLike(String value) {
            addCriterion("c_ir_m12_id_x_cell_cnt not like", value, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_cell_cnt in", values, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_cell_cnt not in", values, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_cell_cnt between", value1, value2, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_cell_cnt not between", value1, value2, "cIrM12IdXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntIsNull() {
            addCriterion("c_ir_m12_id_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntIsNotNull() {
            addCriterion("c_ir_m12_id_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_mail_cnt =", value, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_mail_cnt <>", value, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntGreaterThan(String value) {
            addCriterion("c_ir_m12_id_x_mail_cnt >", value, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_mail_cnt >=", value, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntLessThan(String value) {
            addCriterion("c_ir_m12_id_x_mail_cnt <", value, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_mail_cnt <=", value, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntLike(String value) {
            addCriterion("c_ir_m12_id_x_mail_cnt like", value, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntNotLike(String value) {
            addCriterion("c_ir_m12_id_x_mail_cnt not like", value, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_mail_cnt in", values, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_mail_cnt not in", values, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_mail_cnt between", value1, value2, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_mail_cnt not between", value1, value2, "cIrM12IdXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntIsNull() {
            addCriterion("c_ir_m12_id_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntIsNotNull() {
            addCriterion("c_ir_m12_id_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_name_cnt =", value, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_name_cnt <>", value, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntGreaterThan(String value) {
            addCriterion("c_ir_m12_id_x_name_cnt >", value, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_name_cnt >=", value, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntLessThan(String value) {
            addCriterion("c_ir_m12_id_x_name_cnt <", value, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_name_cnt <=", value, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntLike(String value) {
            addCriterion("c_ir_m12_id_x_name_cnt like", value, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntNotLike(String value) {
            addCriterion("c_ir_m12_id_x_name_cnt not like", value, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_name_cnt in", values, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_name_cnt not in", values, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_name_cnt between", value1, value2, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_name_cnt not between", value1, value2, "cIrM12IdXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntIsNull() {
            addCriterion("c_ir_m12_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntIsNotNull() {
            addCriterion("c_ir_m12_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_id_cnt =", value, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_id_cnt <>", value, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m12_cell_x_id_cnt >", value, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_id_cnt >=", value, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntLessThan(String value) {
            addCriterion("c_ir_m12_cell_x_id_cnt <", value, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_id_cnt <=", value, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntLike(String value) {
            addCriterion("c_ir_m12_cell_x_id_cnt like", value, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntNotLike(String value) {
            addCriterion("c_ir_m12_cell_x_id_cnt not like", value, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_id_cnt in", values, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_id_cnt not in", values, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_id_cnt between", value1, value2, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_id_cnt not between", value1, value2, "cIrM12CellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntIsNull() {
            addCriterion("c_ir_m12_cell_x_mail_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntIsNotNull() {
            addCriterion("c_ir_m12_cell_x_mail_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_mail_cnt =", value, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_mail_cnt <>", value, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntGreaterThan(String value) {
            addCriterion("c_ir_m12_cell_x_mail_cnt >", value, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_mail_cnt >=", value, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntLessThan(String value) {
            addCriterion("c_ir_m12_cell_x_mail_cnt <", value, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_mail_cnt <=", value, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntLike(String value) {
            addCriterion("c_ir_m12_cell_x_mail_cnt like", value, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntNotLike(String value) {
            addCriterion("c_ir_m12_cell_x_mail_cnt not like", value, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_mail_cnt in", values, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_mail_cnt not in", values, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_mail_cnt between", value1, value2, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXMailCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_mail_cnt not between", value1, value2, "cIrM12CellXMailCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntIsNull() {
            addCriterion("c_ir_m12_cell_x_name_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntIsNotNull() {
            addCriterion("c_ir_m12_cell_x_name_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_name_cnt =", value, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_name_cnt <>", value, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntGreaterThan(String value) {
            addCriterion("c_ir_m12_cell_x_name_cnt >", value, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_name_cnt >=", value, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntLessThan(String value) {
            addCriterion("c_ir_m12_cell_x_name_cnt <", value, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_name_cnt <=", value, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntLike(String value) {
            addCriterion("c_ir_m12_cell_x_name_cnt like", value, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntNotLike(String value) {
            addCriterion("c_ir_m12_cell_x_name_cnt not like", value, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_name_cnt in", values, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_name_cnt not in", values, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_name_cnt between", value1, value2, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXNameCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_name_cnt not between", value1, value2, "cIrM12CellXNameCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntIsNull() {
            addCriterion("c_ir_m12_id_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m12_id_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt =", value, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt <>", value, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt >", value, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt >=", value, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt <", value, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt <=", value, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntLike(String value) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt like", value, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt not like", value, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt in", values, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt not in", values, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt between", value1, value2, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_tel_home_cnt not between", value1, value2, "cIrM12IdXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntIsNull() {
            addCriterion("c_ir_m12_id_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m12_id_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt =", value, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt <>", value, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt >", value, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt >=", value, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt <", value, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt <=", value, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt like", value, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt not like", value, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt in", values, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt not in", values, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt between", value1, value2, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_home_addr_cnt not between", value1, value2, "cIrM12IdXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntIsNull() {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntIsNotNull() {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt =", value, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt <>", value, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt >", value, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt >=", value, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntLessThan(String value) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt <", value, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt <=", value, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntLike(String value) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt like", value, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntNotLike(String value) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt not like", value, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt in", values, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt not in", values, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt between", value1, value2, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12IdXBizAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_id_x_biz_addr_cnt not between", value1, value2, "cIrM12IdXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntIsNull() {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt =", value, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt <>", value, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt >", value, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt >=", value, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt <", value, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt <=", value, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntLike(String value) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt like", value, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt not like", value, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt in", values, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt not in", values, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt between", value1, value2, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_tel_home_cnt not between", value1, value2, "cIrM12CellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntIsNull() {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt =", value, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt <>", value, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt >", value, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt >=", value, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt <", value, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt <=", value, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt like", value, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt not like", value, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt in", values, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt not in", values, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt between", value1, value2, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_home_addr_cnt not between", value1, value2, "cIrM12CellXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntIsNull() {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntIsNotNull() {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt =", value, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt <>", value, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt >", value, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt >=", value, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntLessThan(String value) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt <", value, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt <=", value, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntLike(String value) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt like", value, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntNotLike(String value) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt not like", value, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt in", values, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt not in", values, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt between", value1, value2, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12CellXBizAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_cell_x_biz_addr_cnt not between", value1, value2, "cIrM12CellXBizAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntIsNull() {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntIsNotNull() {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt =", value, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt <>", value, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt >", value, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt >=", value, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntLessThan(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt <", value, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt <=", value, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntLike(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt like", value, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntNotLike(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt not like", value, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntIn(List<String> values) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt in", values, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt not in", values, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt between", value1, value2, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_linkman_cell_x_id_cnt not between", value1, value2, "cIrM12LinkmanCellXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntIsNull() {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntIsNotNull() {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt =", value, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt <>", value, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt >", value, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt >=", value, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntLessThan(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt <", value, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt <=", value, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntLike(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt like", value, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntNotLike(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt not like", value, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntIn(List<String> values) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt in", values, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt not in", values, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt between", value1, value2, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_linkman_cell_x_cell_cnt not between", value1, value2, "cIrM12LinkmanCellXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntIsNull() {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt =", value, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt <>", value, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt >", value, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt >=", value, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt <", value, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt <=", value, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntLike(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt like", value, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt not like", value, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt in", values, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt not in", values, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt between", value1, value2, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12LinkmanCellXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_linkman_cell_x_tel_home_cnt not between", value1, value2, "cIrM12LinkmanCellXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntIsNull() {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntIsNotNull() {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt =", value, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt <>", value, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt >", value, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt >=", value, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntLessThan(String value) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt <", value, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt <=", value, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntLike(String value) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt like", value, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntNotLike(String value) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt not like", value, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntIn(List<String> values) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt in", values, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt not in", values, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt between", value1, value2, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_tel_home_x_cell_cnt not between", value1, value2, "cIrM12TelHomeXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntIsNull() {
            addCriterion("c_ir_m12_tel_home_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntIsNotNull() {
            addCriterion("c_ir_m12_tel_home_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt =", value, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt <>", value, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt >", value, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt >=", value, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntLessThan(String value) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt <", value, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt <=", value, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntLike(String value) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt like", value, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntNotLike(String value) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt not like", value, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntIn(List<String> values) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt in", values, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt not in", values, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt between", value1, value2, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_tel_home_x_id_cnt not between", value1, value2, "cIrM12TelHomeXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntIsNull() {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntIsNotNull() {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt =", value, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt <>", value, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntGreaterThan(String value) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt >", value, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt >=", value, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntLessThan(String value) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt <", value, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt <=", value, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntLike(String value) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt like", value, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntNotLike(String value) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt not like", value, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntIn(List<String> values) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt in", values, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt not in", values, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt between", value1, value2, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXCellCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_home_addr_x_cell_cnt not between", value1, value2, "cIrM12HomeAddrXCellCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntIsNull() {
            addCriterion("c_ir_m12_home_addr_x_id_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntIsNotNull() {
            addCriterion("c_ir_m12_home_addr_x_id_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt =", value, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt <>", value, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntGreaterThan(String value) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt >", value, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt >=", value, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntLessThan(String value) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt <", value, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt <=", value, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntLike(String value) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt like", value, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntNotLike(String value) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt not like", value, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntIn(List<String> values) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt in", values, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt not in", values, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt between", value1, value2, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXIdCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_home_addr_x_id_cnt not between", value1, value2, "cIrM12HomeAddrXIdCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntIsNull() {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntIsNotNull() {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt =", value, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt <>", value, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntGreaterThan(String value) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt >", value, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt >=", value, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntLessThan(String value) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt <", value, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt <=", value, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntLike(String value) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt like", value, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntNotLike(String value) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt not like", value, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntIn(List<String> values) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt in", values, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt not in", values, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt between", value1, value2, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12TelHomeXHomeAddrCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_tel_home_x_home_addr_cnt not between", value1, value2, "cIrM12TelHomeXHomeAddrCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntIsNull() {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntIsNotNull() {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt =", value, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntNotEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt <>", value, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntGreaterThan(String value) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt >", value, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntGreaterThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt >=", value, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntLessThan(String value) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt <", value, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntLessThanOrEqualTo(String value) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt <=", value, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntLike(String value) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt like", value, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntNotLike(String value) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt not like", value, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntIn(List<String> values) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt in", values, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntNotIn(List<String> values) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt not in", values, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntBetween(String value1, String value2) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt between", value1, value2, "cIrM12HomeAddrXTelHomeCnt");
            return (Criteria) this;
        }

        public Criteria andCIrM12HomeAddrXTelHomeCntNotBetween(String value1, String value2) {
            addCriterion("c_ir_m12_home_addr_x_tel_home_cnt not between", value1, value2, "cIrM12HomeAddrXTelHomeCnt");
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