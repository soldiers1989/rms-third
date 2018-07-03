package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdBrExecutInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdBrExecutInfoExample() {
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

        public Criteria andCFlagExecutionIsNull() {
            addCriterion("c_flag_execution is null");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionIsNotNull() {
            addCriterion("c_flag_execution is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionEqualTo(String value) {
            addCriterion("c_flag_execution =", value, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionNotEqualTo(String value) {
            addCriterion("c_flag_execution <>", value, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionGreaterThan(String value) {
            addCriterion("c_flag_execution >", value, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionGreaterThanOrEqualTo(String value) {
            addCriterion("c_flag_execution >=", value, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionLessThan(String value) {
            addCriterion("c_flag_execution <", value, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionLessThanOrEqualTo(String value) {
            addCriterion("c_flag_execution <=", value, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionLike(String value) {
            addCriterion("c_flag_execution like", value, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionNotLike(String value) {
            addCriterion("c_flag_execution not like", value, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionIn(List<String> values) {
            addCriterion("c_flag_execution in", values, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionNotIn(List<String> values) {
            addCriterion("c_flag_execution not in", values, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionBetween(String value1, String value2) {
            addCriterion("c_flag_execution between", value1, value2, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCFlagExecutionNotBetween(String value1, String value2) {
            addCriterion("c_flag_execution not between", value1, value2, "cFlagExecution");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameIsNull() {
            addCriterion("c_ex_bad1_name is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameIsNotNull() {
            addCriterion("c_ex_bad1_name is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameEqualTo(String value) {
            addCriterion("c_ex_bad1_name =", value, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameNotEqualTo(String value) {
            addCriterion("c_ex_bad1_name <>", value, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameGreaterThan(String value) {
            addCriterion("c_ex_bad1_name >", value, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_name >=", value, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameLessThan(String value) {
            addCriterion("c_ex_bad1_name <", value, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_name <=", value, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameLike(String value) {
            addCriterion("c_ex_bad1_name like", value, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameNotLike(String value) {
            addCriterion("c_ex_bad1_name not like", value, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameIn(List<String> values) {
            addCriterion("c_ex_bad1_name in", values, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameNotIn(List<String> values) {
            addCriterion("c_ex_bad1_name not in", values, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_name between", value1, value2, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1NameNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_name not between", value1, value2, "cExBad1Name");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidIsNull() {
            addCriterion("c_ex_bad1_cid is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidIsNotNull() {
            addCriterion("c_ex_bad1_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidEqualTo(String value) {
            addCriterion("c_ex_bad1_cid =", value, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidNotEqualTo(String value) {
            addCriterion("c_ex_bad1_cid <>", value, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidGreaterThan(String value) {
            addCriterion("c_ex_bad1_cid >", value, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_cid >=", value, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidLessThan(String value) {
            addCriterion("c_ex_bad1_cid <", value, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_cid <=", value, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidLike(String value) {
            addCriterion("c_ex_bad1_cid like", value, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidNotLike(String value) {
            addCriterion("c_ex_bad1_cid not like", value, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidIn(List<String> values) {
            addCriterion("c_ex_bad1_cid in", values, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidNotIn(List<String> values) {
            addCriterion("c_ex_bad1_cid not in", values, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_cid between", value1, value2, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_cid not between", value1, value2, "cExBad1Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeIsNull() {
            addCriterion("c_ex_bad1_cidtype is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeIsNotNull() {
            addCriterion("c_ex_bad1_cidtype is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeEqualTo(String value) {
            addCriterion("c_ex_bad1_cidtype =", value, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeNotEqualTo(String value) {
            addCriterion("c_ex_bad1_cidtype <>", value, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeGreaterThan(String value) {
            addCriterion("c_ex_bad1_cidtype >", value, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_cidtype >=", value, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeLessThan(String value) {
            addCriterion("c_ex_bad1_cidtype <", value, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_cidtype <=", value, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeLike(String value) {
            addCriterion("c_ex_bad1_cidtype like", value, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeNotLike(String value) {
            addCriterion("c_ex_bad1_cidtype not like", value, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeIn(List<String> values) {
            addCriterion("c_ex_bad1_cidtype in", values, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeNotIn(List<String> values) {
            addCriterion("c_ex_bad1_cidtype not in", values, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_cidtype between", value1, value2, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1CidtypeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_cidtype not between", value1, value2, "cExBad1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeIsNull() {
            addCriterion("c_ex_bad1_datatime is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeIsNotNull() {
            addCriterion("c_ex_bad1_datatime is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeEqualTo(String value) {
            addCriterion("c_ex_bad1_datatime =", value, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeNotEqualTo(String value) {
            addCriterion("c_ex_bad1_datatime <>", value, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeGreaterThan(String value) {
            addCriterion("c_ex_bad1_datatime >", value, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_datatime >=", value, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeLessThan(String value) {
            addCriterion("c_ex_bad1_datatime <", value, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_datatime <=", value, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeLike(String value) {
            addCriterion("c_ex_bad1_datatime like", value, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeNotLike(String value) {
            addCriterion("c_ex_bad1_datatime not like", value, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeIn(List<String> values) {
            addCriterion("c_ex_bad1_datatime in", values, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeNotIn(List<String> values) {
            addCriterion("c_ex_bad1_datatime not in", values, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_datatime between", value1, value2, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_datatime not between", value1, value2, "cExBad1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidIsNull() {
            addCriterion("c_ex_bad1_datatypeid is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidIsNotNull() {
            addCriterion("c_ex_bad1_datatypeid is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidEqualTo(String value) {
            addCriterion("c_ex_bad1_datatypeid =", value, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidNotEqualTo(String value) {
            addCriterion("c_ex_bad1_datatypeid <>", value, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidGreaterThan(String value) {
            addCriterion("c_ex_bad1_datatypeid >", value, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_datatypeid >=", value, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidLessThan(String value) {
            addCriterion("c_ex_bad1_datatypeid <", value, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_datatypeid <=", value, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidLike(String value) {
            addCriterion("c_ex_bad1_datatypeid like", value, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidNotLike(String value) {
            addCriterion("c_ex_bad1_datatypeid not like", value, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidIn(List<String> values) {
            addCriterion("c_ex_bad1_datatypeid in", values, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidNotIn(List<String> values) {
            addCriterion("c_ex_bad1_datatypeid not in", values, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_datatypeid between", value1, value2, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeidNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_datatypeid not between", value1, value2, "cExBad1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeIsNull() {
            addCriterion("c_ex_bad1_datatype is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeIsNotNull() {
            addCriterion("c_ex_bad1_datatype is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeEqualTo(String value) {
            addCriterion("c_ex_bad1_datatype =", value, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeNotEqualTo(String value) {
            addCriterion("c_ex_bad1_datatype <>", value, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeGreaterThan(String value) {
            addCriterion("c_ex_bad1_datatype >", value, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_datatype >=", value, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeLessThan(String value) {
            addCriterion("c_ex_bad1_datatype <", value, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_datatype <=", value, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeLike(String value) {
            addCriterion("c_ex_bad1_datatype like", value, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeNotLike(String value) {
            addCriterion("c_ex_bad1_datatype not like", value, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeIn(List<String> values) {
            addCriterion("c_ex_bad1_datatype in", values, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeNotIn(List<String> values) {
            addCriterion("c_ex_bad1_datatype not in", values, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_datatype between", value1, value2, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1DatatypeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_datatype not between", value1, value2, "cExBad1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderIsNull() {
            addCriterion("c_ex_bad1_leader is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderIsNotNull() {
            addCriterion("c_ex_bad1_leader is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderEqualTo(String value) {
            addCriterion("c_ex_bad1_leader =", value, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderNotEqualTo(String value) {
            addCriterion("c_ex_bad1_leader <>", value, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderGreaterThan(String value) {
            addCriterion("c_ex_bad1_leader >", value, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_leader >=", value, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderLessThan(String value) {
            addCriterion("c_ex_bad1_leader <", value, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_leader <=", value, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderLike(String value) {
            addCriterion("c_ex_bad1_leader like", value, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderNotLike(String value) {
            addCriterion("c_ex_bad1_leader not like", value, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderIn(List<String> values) {
            addCriterion("c_ex_bad1_leader in", values, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderNotIn(List<String> values) {
            addCriterion("c_ex_bad1_leader not in", values, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_leader between", value1, value2, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1LeaderNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_leader not between", value1, value2, "cExBad1Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressIsNull() {
            addCriterion("c_ex_bad1_address is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressIsNotNull() {
            addCriterion("c_ex_bad1_address is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressEqualTo(String value) {
            addCriterion("c_ex_bad1_address =", value, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressNotEqualTo(String value) {
            addCriterion("c_ex_bad1_address <>", value, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressGreaterThan(String value) {
            addCriterion("c_ex_bad1_address >", value, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_address >=", value, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressLessThan(String value) {
            addCriterion("c_ex_bad1_address <", value, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_address <=", value, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressLike(String value) {
            addCriterion("c_ex_bad1_address like", value, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressNotLike(String value) {
            addCriterion("c_ex_bad1_address not like", value, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressIn(List<String> values) {
            addCriterion("c_ex_bad1_address in", values, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressNotIn(List<String> values) {
            addCriterion("c_ex_bad1_address not in", values, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_address between", value1, value2, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1AddressNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_address not between", value1, value2, "cExBad1Address");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtIsNull() {
            addCriterion("c_ex_bad1_court is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtIsNotNull() {
            addCriterion("c_ex_bad1_court is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtEqualTo(String value) {
            addCriterion("c_ex_bad1_court =", value, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtNotEqualTo(String value) {
            addCriterion("c_ex_bad1_court <>", value, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtGreaterThan(String value) {
            addCriterion("c_ex_bad1_court >", value, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_court >=", value, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtLessThan(String value) {
            addCriterion("c_ex_bad1_court <", value, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_court <=", value, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtLike(String value) {
            addCriterion("c_ex_bad1_court like", value, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtNotLike(String value) {
            addCriterion("c_ex_bad1_court not like", value, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtIn(List<String> values) {
            addCriterion("c_ex_bad1_court in", values, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtNotIn(List<String> values) {
            addCriterion("c_ex_bad1_court not in", values, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_court between", value1, value2, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1CourtNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_court not between", value1, value2, "cExBad1Court");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeIsNull() {
            addCriterion("c_ex_bad1_time is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeIsNotNull() {
            addCriterion("c_ex_bad1_time is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeEqualTo(String value) {
            addCriterion("c_ex_bad1_time =", value, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeNotEqualTo(String value) {
            addCriterion("c_ex_bad1_time <>", value, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeGreaterThan(String value) {
            addCriterion("c_ex_bad1_time >", value, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_time >=", value, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeLessThan(String value) {
            addCriterion("c_ex_bad1_time <", value, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_time <=", value, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeLike(String value) {
            addCriterion("c_ex_bad1_time like", value, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeNotLike(String value) {
            addCriterion("c_ex_bad1_time not like", value, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeIn(List<String> values) {
            addCriterion("c_ex_bad1_time in", values, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeNotIn(List<String> values) {
            addCriterion("c_ex_bad1_time not in", values, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_time between", value1, value2, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1TimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_time not between", value1, value2, "cExBad1Time");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumIsNull() {
            addCriterion("c_ex_bad1_casenum is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumIsNotNull() {
            addCriterion("c_ex_bad1_casenum is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumEqualTo(String value) {
            addCriterion("c_ex_bad1_casenum =", value, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumNotEqualTo(String value) {
            addCriterion("c_ex_bad1_casenum <>", value, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumGreaterThan(String value) {
            addCriterion("c_ex_bad1_casenum >", value, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_casenum >=", value, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumLessThan(String value) {
            addCriterion("c_ex_bad1_casenum <", value, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_casenum <=", value, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumLike(String value) {
            addCriterion("c_ex_bad1_casenum like", value, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumNotLike(String value) {
            addCriterion("c_ex_bad1_casenum not like", value, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumIn(List<String> values) {
            addCriterion("c_ex_bad1_casenum in", values, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumNotIn(List<String> values) {
            addCriterion("c_ex_bad1_casenum not in", values, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_casenum between", value1, value2, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1CasenumNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_casenum not between", value1, value2, "cExBad1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyIsNull() {
            addCriterion("c_ex_bad1_money is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyIsNotNull() {
            addCriterion("c_ex_bad1_money is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyEqualTo(String value) {
            addCriterion("c_ex_bad1_money =", value, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyNotEqualTo(String value) {
            addCriterion("c_ex_bad1_money <>", value, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyGreaterThan(String value) {
            addCriterion("c_ex_bad1_money >", value, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_money >=", value, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyLessThan(String value) {
            addCriterion("c_ex_bad1_money <", value, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_money <=", value, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyLike(String value) {
            addCriterion("c_ex_bad1_money like", value, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyNotLike(String value) {
            addCriterion("c_ex_bad1_money not like", value, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyIn(List<String> values) {
            addCriterion("c_ex_bad1_money in", values, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyNotIn(List<String> values) {
            addCriterion("c_ex_bad1_money not in", values, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_money between", value1, value2, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1MoneyNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_money not between", value1, value2, "cExBad1Money");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseIsNull() {
            addCriterion("c_ex_bad1_base is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseIsNotNull() {
            addCriterion("c_ex_bad1_base is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseEqualTo(String value) {
            addCriterion("c_ex_bad1_base =", value, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseNotEqualTo(String value) {
            addCriterion("c_ex_bad1_base <>", value, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseGreaterThan(String value) {
            addCriterion("c_ex_bad1_base >", value, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_base >=", value, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseLessThan(String value) {
            addCriterion("c_ex_bad1_base <", value, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_base <=", value, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseLike(String value) {
            addCriterion("c_ex_bad1_base like", value, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseNotLike(String value) {
            addCriterion("c_ex_bad1_base not like", value, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseIn(List<String> values) {
            addCriterion("c_ex_bad1_base in", values, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseNotIn(List<String> values) {
            addCriterion("c_ex_bad1_base not in", values, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_base between", value1, value2, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BaseNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_base not between", value1, value2, "cExBad1Base");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyIsNull() {
            addCriterion("c_ex_bad1_basecompany is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyIsNotNull() {
            addCriterion("c_ex_bad1_basecompany is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyEqualTo(String value) {
            addCriterion("c_ex_bad1_basecompany =", value, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyNotEqualTo(String value) {
            addCriterion("c_ex_bad1_basecompany <>", value, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyGreaterThan(String value) {
            addCriterion("c_ex_bad1_basecompany >", value, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_basecompany >=", value, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyLessThan(String value) {
            addCriterion("c_ex_bad1_basecompany <", value, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_basecompany <=", value, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyLike(String value) {
            addCriterion("c_ex_bad1_basecompany like", value, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyNotLike(String value) {
            addCriterion("c_ex_bad1_basecompany not like", value, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyIn(List<String> values) {
            addCriterion("c_ex_bad1_basecompany in", values, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyNotIn(List<String> values) {
            addCriterion("c_ex_bad1_basecompany not in", values, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_basecompany between", value1, value2, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1BasecompanyNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_basecompany not between", value1, value2, "cExBad1Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationIsNull() {
            addCriterion("c_ex_bad1_obligation is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationIsNotNull() {
            addCriterion("c_ex_bad1_obligation is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationEqualTo(String value) {
            addCriterion("c_ex_bad1_obligation =", value, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationNotEqualTo(String value) {
            addCriterion("c_ex_bad1_obligation <>", value, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationGreaterThan(String value) {
            addCriterion("c_ex_bad1_obligation >", value, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_obligation >=", value, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationLessThan(String value) {
            addCriterion("c_ex_bad1_obligation <", value, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_obligation <=", value, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationLike(String value) {
            addCriterion("c_ex_bad1_obligation like", value, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationNotLike(String value) {
            addCriterion("c_ex_bad1_obligation not like", value, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationIn(List<String> values) {
            addCriterion("c_ex_bad1_obligation in", values, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationNotIn(List<String> values) {
            addCriterion("c_ex_bad1_obligation not in", values, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_obligation between", value1, value2, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ObligationNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_obligation not between", value1, value2, "cExBad1Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeIsNull() {
            addCriterion("c_ex_bad1_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeIsNotNull() {
            addCriterion("c_ex_bad1_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeEqualTo(String value) {
            addCriterion("c_ex_bad1_lasttime =", value, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeNotEqualTo(String value) {
            addCriterion("c_ex_bad1_lasttime <>", value, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeGreaterThan(String value) {
            addCriterion("c_ex_bad1_lasttime >", value, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_lasttime >=", value, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeLessThan(String value) {
            addCriterion("c_ex_bad1_lasttime <", value, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_lasttime <=", value, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeLike(String value) {
            addCriterion("c_ex_bad1_lasttime like", value, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeNotLike(String value) {
            addCriterion("c_ex_bad1_lasttime not like", value, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeIn(List<String> values) {
            addCriterion("c_ex_bad1_lasttime in", values, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeNotIn(List<String> values) {
            addCriterion("c_ex_bad1_lasttime not in", values, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_lasttime between", value1, value2, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1LasttimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_lasttime not between", value1, value2, "cExBad1Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceIsNull() {
            addCriterion("c_ex_bad1_performance is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceIsNotNull() {
            addCriterion("c_ex_bad1_performance is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceEqualTo(String value) {
            addCriterion("c_ex_bad1_performance =", value, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceNotEqualTo(String value) {
            addCriterion("c_ex_bad1_performance <>", value, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceGreaterThan(String value) {
            addCriterion("c_ex_bad1_performance >", value, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_performance >=", value, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceLessThan(String value) {
            addCriterion("c_ex_bad1_performance <", value, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_performance <=", value, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceLike(String value) {
            addCriterion("c_ex_bad1_performance like", value, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceNotLike(String value) {
            addCriterion("c_ex_bad1_performance not like", value, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceIn(List<String> values) {
            addCriterion("c_ex_bad1_performance in", values, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceNotIn(List<String> values) {
            addCriterion("c_ex_bad1_performance not in", values, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_performance between", value1, value2, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformanceNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_performance not between", value1, value2, "cExBad1Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationIsNull() {
            addCriterion("c_ex_bad1_concretesituation is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationIsNotNull() {
            addCriterion("c_ex_bad1_concretesituation is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationEqualTo(String value) {
            addCriterion("c_ex_bad1_concretesituation =", value, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationNotEqualTo(String value) {
            addCriterion("c_ex_bad1_concretesituation <>", value, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationGreaterThan(String value) {
            addCriterion("c_ex_bad1_concretesituation >", value, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_concretesituation >=", value, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationLessThan(String value) {
            addCriterion("c_ex_bad1_concretesituation <", value, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_concretesituation <=", value, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationLike(String value) {
            addCriterion("c_ex_bad1_concretesituation like", value, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationNotLike(String value) {
            addCriterion("c_ex_bad1_concretesituation not like", value, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationIn(List<String> values) {
            addCriterion("c_ex_bad1_concretesituation in", values, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationNotIn(List<String> values) {
            addCriterion("c_ex_bad1_concretesituation not in", values, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_concretesituation between", value1, value2, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1ConcretesituationNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_concretesituation not between", value1, value2, "cExBad1Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeIsNull() {
            addCriterion("c_ex_bad1_breaktime is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeIsNotNull() {
            addCriterion("c_ex_bad1_breaktime is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeEqualTo(String value) {
            addCriterion("c_ex_bad1_breaktime =", value, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeNotEqualTo(String value) {
            addCriterion("c_ex_bad1_breaktime <>", value, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeGreaterThan(String value) {
            addCriterion("c_ex_bad1_breaktime >", value, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_breaktime >=", value, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeLessThan(String value) {
            addCriterion("c_ex_bad1_breaktime <", value, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_breaktime <=", value, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeLike(String value) {
            addCriterion("c_ex_bad1_breaktime like", value, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeNotLike(String value) {
            addCriterion("c_ex_bad1_breaktime not like", value, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeIn(List<String> values) {
            addCriterion("c_ex_bad1_breaktime in", values, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeNotIn(List<String> values) {
            addCriterion("c_ex_bad1_breaktime not in", values, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_breaktime between", value1, value2, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1BreaktimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_breaktime not between", value1, value2, "cExBad1Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeIsNull() {
            addCriterion("c_ex_bad1_posttime is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeIsNotNull() {
            addCriterion("c_ex_bad1_posttime is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeEqualTo(String value) {
            addCriterion("c_ex_bad1_posttime =", value, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeNotEqualTo(String value) {
            addCriterion("c_ex_bad1_posttime <>", value, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeGreaterThan(String value) {
            addCriterion("c_ex_bad1_posttime >", value, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_posttime >=", value, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeLessThan(String value) {
            addCriterion("c_ex_bad1_posttime <", value, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_posttime <=", value, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeLike(String value) {
            addCriterion("c_ex_bad1_posttime like", value, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeNotLike(String value) {
            addCriterion("c_ex_bad1_posttime not like", value, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeIn(List<String> values) {
            addCriterion("c_ex_bad1_posttime in", values, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeNotIn(List<String> values) {
            addCriterion("c_ex_bad1_posttime not in", values, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_posttime between", value1, value2, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PosttimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_posttime not between", value1, value2, "cExBad1Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartIsNull() {
            addCriterion("c_ex_bad1_performedpart is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartIsNotNull() {
            addCriterion("c_ex_bad1_performedpart is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartEqualTo(String value) {
            addCriterion("c_ex_bad1_performedpart =", value, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartNotEqualTo(String value) {
            addCriterion("c_ex_bad1_performedpart <>", value, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartGreaterThan(String value) {
            addCriterion("c_ex_bad1_performedpart >", value, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_performedpart >=", value, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartLessThan(String value) {
            addCriterion("c_ex_bad1_performedpart <", value, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_performedpart <=", value, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartLike(String value) {
            addCriterion("c_ex_bad1_performedpart like", value, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartNotLike(String value) {
            addCriterion("c_ex_bad1_performedpart not like", value, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartIn(List<String> values) {
            addCriterion("c_ex_bad1_performedpart in", values, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartNotIn(List<String> values) {
            addCriterion("c_ex_bad1_performedpart not in", values, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_performedpart between", value1, value2, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1PerformedpartNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_performedpart not between", value1, value2, "cExBad1Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartIsNull() {
            addCriterion("c_ex_bad1_unperformpart is null");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartIsNotNull() {
            addCriterion("c_ex_bad1_unperformpart is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartEqualTo(String value) {
            addCriterion("c_ex_bad1_unperformpart =", value, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartNotEqualTo(String value) {
            addCriterion("c_ex_bad1_unperformpart <>", value, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartGreaterThan(String value) {
            addCriterion("c_ex_bad1_unperformpart >", value, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_unperformpart >=", value, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartLessThan(String value) {
            addCriterion("c_ex_bad1_unperformpart <", value, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad1_unperformpart <=", value, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartLike(String value) {
            addCriterion("c_ex_bad1_unperformpart like", value, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartNotLike(String value) {
            addCriterion("c_ex_bad1_unperformpart not like", value, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartIn(List<String> values) {
            addCriterion("c_ex_bad1_unperformpart in", values, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartNotIn(List<String> values) {
            addCriterion("c_ex_bad1_unperformpart not in", values, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_unperformpart between", value1, value2, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad1UnperformpartNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad1_unperformpart not between", value1, value2, "cExBad1Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameIsNull() {
            addCriterion("c_ex_execut1_name is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameIsNotNull() {
            addCriterion("c_ex_execut1_name is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameEqualTo(String value) {
            addCriterion("c_ex_execut1_name =", value, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameNotEqualTo(String value) {
            addCriterion("c_ex_execut1_name <>", value, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameGreaterThan(String value) {
            addCriterion("c_ex_execut1_name >", value, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_name >=", value, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameLessThan(String value) {
            addCriterion("c_ex_execut1_name <", value, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_name <=", value, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameLike(String value) {
            addCriterion("c_ex_execut1_name like", value, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameNotLike(String value) {
            addCriterion("c_ex_execut1_name not like", value, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameIn(List<String> values) {
            addCriterion("c_ex_execut1_name in", values, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameNotIn(List<String> values) {
            addCriterion("c_ex_execut1_name not in", values, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_name between", value1, value2, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1NameNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_name not between", value1, value2, "cExExecut1Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidIsNull() {
            addCriterion("c_ex_execut1_cid is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidIsNotNull() {
            addCriterion("c_ex_execut1_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidEqualTo(String value) {
            addCriterion("c_ex_execut1_cid =", value, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidNotEqualTo(String value) {
            addCriterion("c_ex_execut1_cid <>", value, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidGreaterThan(String value) {
            addCriterion("c_ex_execut1_cid >", value, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_cid >=", value, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidLessThan(String value) {
            addCriterion("c_ex_execut1_cid <", value, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_cid <=", value, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidLike(String value) {
            addCriterion("c_ex_execut1_cid like", value, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidNotLike(String value) {
            addCriterion("c_ex_execut1_cid not like", value, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidIn(List<String> values) {
            addCriterion("c_ex_execut1_cid in", values, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidNotIn(List<String> values) {
            addCriterion("c_ex_execut1_cid not in", values, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_cid between", value1, value2, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_cid not between", value1, value2, "cExExecut1Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeIsNull() {
            addCriterion("c_ex_execut1_cidtype is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeIsNotNull() {
            addCriterion("c_ex_execut1_cidtype is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeEqualTo(String value) {
            addCriterion("c_ex_execut1_cidtype =", value, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeNotEqualTo(String value) {
            addCriterion("c_ex_execut1_cidtype <>", value, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeGreaterThan(String value) {
            addCriterion("c_ex_execut1_cidtype >", value, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_cidtype >=", value, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeLessThan(String value) {
            addCriterion("c_ex_execut1_cidtype <", value, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_cidtype <=", value, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeLike(String value) {
            addCriterion("c_ex_execut1_cidtype like", value, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeNotLike(String value) {
            addCriterion("c_ex_execut1_cidtype not like", value, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeIn(List<String> values) {
            addCriterion("c_ex_execut1_cidtype in", values, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeNotIn(List<String> values) {
            addCriterion("c_ex_execut1_cidtype not in", values, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_cidtype between", value1, value2, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CidtypeNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_cidtype not between", value1, value2, "cExExecut1Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeIsNull() {
            addCriterion("c_ex_execut1_datatime is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeIsNotNull() {
            addCriterion("c_ex_execut1_datatime is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeEqualTo(String value) {
            addCriterion("c_ex_execut1_datatime =", value, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeNotEqualTo(String value) {
            addCriterion("c_ex_execut1_datatime <>", value, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeGreaterThan(String value) {
            addCriterion("c_ex_execut1_datatime >", value, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_datatime >=", value, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeLessThan(String value) {
            addCriterion("c_ex_execut1_datatime <", value, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_datatime <=", value, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeLike(String value) {
            addCriterion("c_ex_execut1_datatime like", value, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeNotLike(String value) {
            addCriterion("c_ex_execut1_datatime not like", value, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeIn(List<String> values) {
            addCriterion("c_ex_execut1_datatime in", values, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeNotIn(List<String> values) {
            addCriterion("c_ex_execut1_datatime not in", values, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_datatime between", value1, value2, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_datatime not between", value1, value2, "cExExecut1Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidIsNull() {
            addCriterion("c_ex_execut1_datatypeid is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidIsNotNull() {
            addCriterion("c_ex_execut1_datatypeid is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidEqualTo(String value) {
            addCriterion("c_ex_execut1_datatypeid =", value, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidNotEqualTo(String value) {
            addCriterion("c_ex_execut1_datatypeid <>", value, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidGreaterThan(String value) {
            addCriterion("c_ex_execut1_datatypeid >", value, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_datatypeid >=", value, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidLessThan(String value) {
            addCriterion("c_ex_execut1_datatypeid <", value, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_datatypeid <=", value, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidLike(String value) {
            addCriterion("c_ex_execut1_datatypeid like", value, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidNotLike(String value) {
            addCriterion("c_ex_execut1_datatypeid not like", value, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidIn(List<String> values) {
            addCriterion("c_ex_execut1_datatypeid in", values, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidNotIn(List<String> values) {
            addCriterion("c_ex_execut1_datatypeid not in", values, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_datatypeid between", value1, value2, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeidNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_datatypeid not between", value1, value2, "cExExecut1Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeIsNull() {
            addCriterion("c_ex_execut1_datatype is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeIsNotNull() {
            addCriterion("c_ex_execut1_datatype is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeEqualTo(String value) {
            addCriterion("c_ex_execut1_datatype =", value, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeNotEqualTo(String value) {
            addCriterion("c_ex_execut1_datatype <>", value, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeGreaterThan(String value) {
            addCriterion("c_ex_execut1_datatype >", value, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_datatype >=", value, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeLessThan(String value) {
            addCriterion("c_ex_execut1_datatype <", value, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_datatype <=", value, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeLike(String value) {
            addCriterion("c_ex_execut1_datatype like", value, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeNotLike(String value) {
            addCriterion("c_ex_execut1_datatype not like", value, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeIn(List<String> values) {
            addCriterion("c_ex_execut1_datatype in", values, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeNotIn(List<String> values) {
            addCriterion("c_ex_execut1_datatype not in", values, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_datatype between", value1, value2, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1DatatypeNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_datatype not between", value1, value2, "cExExecut1Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtIsNull() {
            addCriterion("c_ex_execut1_court is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtIsNotNull() {
            addCriterion("c_ex_execut1_court is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtEqualTo(String value) {
            addCriterion("c_ex_execut1_court =", value, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtNotEqualTo(String value) {
            addCriterion("c_ex_execut1_court <>", value, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtGreaterThan(String value) {
            addCriterion("c_ex_execut1_court >", value, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_court >=", value, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtLessThan(String value) {
            addCriterion("c_ex_execut1_court <", value, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_court <=", value, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtLike(String value) {
            addCriterion("c_ex_execut1_court like", value, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtNotLike(String value) {
            addCriterion("c_ex_execut1_court not like", value, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtIn(List<String> values) {
            addCriterion("c_ex_execut1_court in", values, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtNotIn(List<String> values) {
            addCriterion("c_ex_execut1_court not in", values, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_court between", value1, value2, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CourtNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_court not between", value1, value2, "cExExecut1Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeIsNull() {
            addCriterion("c_ex_execut1_time is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeIsNotNull() {
            addCriterion("c_ex_execut1_time is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeEqualTo(String value) {
            addCriterion("c_ex_execut1_time =", value, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeNotEqualTo(String value) {
            addCriterion("c_ex_execut1_time <>", value, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeGreaterThan(String value) {
            addCriterion("c_ex_execut1_time >", value, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_time >=", value, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeLessThan(String value) {
            addCriterion("c_ex_execut1_time <", value, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_time <=", value, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeLike(String value) {
            addCriterion("c_ex_execut1_time like", value, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeNotLike(String value) {
            addCriterion("c_ex_execut1_time not like", value, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeIn(List<String> values) {
            addCriterion("c_ex_execut1_time in", values, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeNotIn(List<String> values) {
            addCriterion("c_ex_execut1_time not in", values, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_time between", value1, value2, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1TimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_time not between", value1, value2, "cExExecut1Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumIsNull() {
            addCriterion("c_ex_execut1_casenum is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumIsNotNull() {
            addCriterion("c_ex_execut1_casenum is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumEqualTo(String value) {
            addCriterion("c_ex_execut1_casenum =", value, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumNotEqualTo(String value) {
            addCriterion("c_ex_execut1_casenum <>", value, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumGreaterThan(String value) {
            addCriterion("c_ex_execut1_casenum >", value, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_casenum >=", value, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumLessThan(String value) {
            addCriterion("c_ex_execut1_casenum <", value, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_casenum <=", value, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumLike(String value) {
            addCriterion("c_ex_execut1_casenum like", value, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumNotLike(String value) {
            addCriterion("c_ex_execut1_casenum not like", value, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumIn(List<String> values) {
            addCriterion("c_ex_execut1_casenum in", values, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumNotIn(List<String> values) {
            addCriterion("c_ex_execut1_casenum not in", values, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_casenum between", value1, value2, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1CasenumNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_casenum not between", value1, value2, "cExExecut1Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyIsNull() {
            addCriterion("c_ex_execut1_money is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyIsNotNull() {
            addCriterion("c_ex_execut1_money is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyEqualTo(String value) {
            addCriterion("c_ex_execut1_money =", value, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyNotEqualTo(String value) {
            addCriterion("c_ex_execut1_money <>", value, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyGreaterThan(String value) {
            addCriterion("c_ex_execut1_money >", value, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_money >=", value, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyLessThan(String value) {
            addCriterion("c_ex_execut1_money <", value, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_money <=", value, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyLike(String value) {
            addCriterion("c_ex_execut1_money like", value, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyNotLike(String value) {
            addCriterion("c_ex_execut1_money not like", value, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyIn(List<String> values) {
            addCriterion("c_ex_execut1_money in", values, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyNotIn(List<String> values) {
            addCriterion("c_ex_execut1_money not in", values, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_money between", value1, value2, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1MoneyNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_money not between", value1, value2, "cExExecut1Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteIsNull() {
            addCriterion("c_ex_execut1_statute is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteIsNotNull() {
            addCriterion("c_ex_execut1_statute is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteEqualTo(String value) {
            addCriterion("c_ex_execut1_statute =", value, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteNotEqualTo(String value) {
            addCriterion("c_ex_execut1_statute <>", value, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteGreaterThan(String value) {
            addCriterion("c_ex_execut1_statute >", value, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_statute >=", value, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteLessThan(String value) {
            addCriterion("c_ex_execut1_statute <", value, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_statute <=", value, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteLike(String value) {
            addCriterion("c_ex_execut1_statute like", value, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteNotLike(String value) {
            addCriterion("c_ex_execut1_statute not like", value, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteIn(List<String> values) {
            addCriterion("c_ex_execut1_statute in", values, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteNotIn(List<String> values) {
            addCriterion("c_ex_execut1_statute not in", values, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_statute between", value1, value2, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1StatuteNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_statute not between", value1, value2, "cExExecut1Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicIsNull() {
            addCriterion("c_ex_execut1_basic is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicIsNotNull() {
            addCriterion("c_ex_execut1_basic is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicEqualTo(String value) {
            addCriterion("c_ex_execut1_basic =", value, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicNotEqualTo(String value) {
            addCriterion("c_ex_execut1_basic <>", value, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicGreaterThan(String value) {
            addCriterion("c_ex_execut1_basic >", value, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_basic >=", value, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicLessThan(String value) {
            addCriterion("c_ex_execut1_basic <", value, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_basic <=", value, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicLike(String value) {
            addCriterion("c_ex_execut1_basic like", value, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicNotLike(String value) {
            addCriterion("c_ex_execut1_basic not like", value, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicIn(List<String> values) {
            addCriterion("c_ex_execut1_basic in", values, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicNotIn(List<String> values) {
            addCriterion("c_ex_execut1_basic not in", values, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_basic between", value1, value2, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasicNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_basic not between", value1, value2, "cExExecut1Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtIsNull() {
            addCriterion("c_ex_execut1_basiccourt is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtIsNotNull() {
            addCriterion("c_ex_execut1_basiccourt is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtEqualTo(String value) {
            addCriterion("c_ex_execut1_basiccourt =", value, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtNotEqualTo(String value) {
            addCriterion("c_ex_execut1_basiccourt <>", value, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtGreaterThan(String value) {
            addCriterion("c_ex_execut1_basiccourt >", value, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_basiccourt >=", value, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtLessThan(String value) {
            addCriterion("c_ex_execut1_basiccourt <", value, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut1_basiccourt <=", value, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtLike(String value) {
            addCriterion("c_ex_execut1_basiccourt like", value, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtNotLike(String value) {
            addCriterion("c_ex_execut1_basiccourt not like", value, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtIn(List<String> values) {
            addCriterion("c_ex_execut1_basiccourt in", values, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtNotIn(List<String> values) {
            addCriterion("c_ex_execut1_basiccourt not in", values, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_basiccourt between", value1, value2, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut1BasiccourtNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut1_basiccourt not between", value1, value2, "cExExecut1Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameIsNull() {
            addCriterion("c_ex_bad10_name is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameIsNotNull() {
            addCriterion("c_ex_bad10_name is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameEqualTo(String value) {
            addCriterion("c_ex_bad10_name =", value, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameNotEqualTo(String value) {
            addCriterion("c_ex_bad10_name <>", value, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameGreaterThan(String value) {
            addCriterion("c_ex_bad10_name >", value, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_name >=", value, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameLessThan(String value) {
            addCriterion("c_ex_bad10_name <", value, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_name <=", value, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameLike(String value) {
            addCriterion("c_ex_bad10_name like", value, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameNotLike(String value) {
            addCriterion("c_ex_bad10_name not like", value, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameIn(List<String> values) {
            addCriterion("c_ex_bad10_name in", values, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameNotIn(List<String> values) {
            addCriterion("c_ex_bad10_name not in", values, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_name between", value1, value2, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10NameNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_name not between", value1, value2, "cExBad10Name");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidIsNull() {
            addCriterion("c_ex_bad10_cid is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidIsNotNull() {
            addCriterion("c_ex_bad10_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidEqualTo(String value) {
            addCriterion("c_ex_bad10_cid =", value, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidNotEqualTo(String value) {
            addCriterion("c_ex_bad10_cid <>", value, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidGreaterThan(String value) {
            addCriterion("c_ex_bad10_cid >", value, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_cid >=", value, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidLessThan(String value) {
            addCriterion("c_ex_bad10_cid <", value, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_cid <=", value, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidLike(String value) {
            addCriterion("c_ex_bad10_cid like", value, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidNotLike(String value) {
            addCriterion("c_ex_bad10_cid not like", value, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidIn(List<String> values) {
            addCriterion("c_ex_bad10_cid in", values, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidNotIn(List<String> values) {
            addCriterion("c_ex_bad10_cid not in", values, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_cid between", value1, value2, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_cid not between", value1, value2, "cExBad10Cid");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeIsNull() {
            addCriterion("c_ex_bad10_cidtype is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeIsNotNull() {
            addCriterion("c_ex_bad10_cidtype is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeEqualTo(String value) {
            addCriterion("c_ex_bad10_cidtype =", value, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeNotEqualTo(String value) {
            addCriterion("c_ex_bad10_cidtype <>", value, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeGreaterThan(String value) {
            addCriterion("c_ex_bad10_cidtype >", value, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_cidtype >=", value, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeLessThan(String value) {
            addCriterion("c_ex_bad10_cidtype <", value, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_cidtype <=", value, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeLike(String value) {
            addCriterion("c_ex_bad10_cidtype like", value, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeNotLike(String value) {
            addCriterion("c_ex_bad10_cidtype not like", value, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeIn(List<String> values) {
            addCriterion("c_ex_bad10_cidtype in", values, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeNotIn(List<String> values) {
            addCriterion("c_ex_bad10_cidtype not in", values, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_cidtype between", value1, value2, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10CidtypeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_cidtype not between", value1, value2, "cExBad10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeIsNull() {
            addCriterion("c_ex_bad10_datatime is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeIsNotNull() {
            addCriterion("c_ex_bad10_datatime is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeEqualTo(String value) {
            addCriterion("c_ex_bad10_datatime =", value, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeNotEqualTo(String value) {
            addCriterion("c_ex_bad10_datatime <>", value, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeGreaterThan(String value) {
            addCriterion("c_ex_bad10_datatime >", value, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_datatime >=", value, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeLessThan(String value) {
            addCriterion("c_ex_bad10_datatime <", value, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_datatime <=", value, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeLike(String value) {
            addCriterion("c_ex_bad10_datatime like", value, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeNotLike(String value) {
            addCriterion("c_ex_bad10_datatime not like", value, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeIn(List<String> values) {
            addCriterion("c_ex_bad10_datatime in", values, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeNotIn(List<String> values) {
            addCriterion("c_ex_bad10_datatime not in", values, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_datatime between", value1, value2, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_datatime not between", value1, value2, "cExBad10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidIsNull() {
            addCriterion("c_ex_bad10_datatypeid is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidIsNotNull() {
            addCriterion("c_ex_bad10_datatypeid is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidEqualTo(String value) {
            addCriterion("c_ex_bad10_datatypeid =", value, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidNotEqualTo(String value) {
            addCriterion("c_ex_bad10_datatypeid <>", value, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidGreaterThan(String value) {
            addCriterion("c_ex_bad10_datatypeid >", value, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_datatypeid >=", value, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidLessThan(String value) {
            addCriterion("c_ex_bad10_datatypeid <", value, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_datatypeid <=", value, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidLike(String value) {
            addCriterion("c_ex_bad10_datatypeid like", value, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidNotLike(String value) {
            addCriterion("c_ex_bad10_datatypeid not like", value, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidIn(List<String> values) {
            addCriterion("c_ex_bad10_datatypeid in", values, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidNotIn(List<String> values) {
            addCriterion("c_ex_bad10_datatypeid not in", values, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_datatypeid between", value1, value2, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeidNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_datatypeid not between", value1, value2, "cExBad10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeIsNull() {
            addCriterion("c_ex_bad10_datatype is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeIsNotNull() {
            addCriterion("c_ex_bad10_datatype is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeEqualTo(String value) {
            addCriterion("c_ex_bad10_datatype =", value, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeNotEqualTo(String value) {
            addCriterion("c_ex_bad10_datatype <>", value, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeGreaterThan(String value) {
            addCriterion("c_ex_bad10_datatype >", value, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_datatype >=", value, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeLessThan(String value) {
            addCriterion("c_ex_bad10_datatype <", value, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_datatype <=", value, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeLike(String value) {
            addCriterion("c_ex_bad10_datatype like", value, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeNotLike(String value) {
            addCriterion("c_ex_bad10_datatype not like", value, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeIn(List<String> values) {
            addCriterion("c_ex_bad10_datatype in", values, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeNotIn(List<String> values) {
            addCriterion("c_ex_bad10_datatype not in", values, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_datatype between", value1, value2, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10DatatypeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_datatype not between", value1, value2, "cExBad10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderIsNull() {
            addCriterion("c_ex_bad10_leader is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderIsNotNull() {
            addCriterion("c_ex_bad10_leader is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderEqualTo(String value) {
            addCriterion("c_ex_bad10_leader =", value, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderNotEqualTo(String value) {
            addCriterion("c_ex_bad10_leader <>", value, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderGreaterThan(String value) {
            addCriterion("c_ex_bad10_leader >", value, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_leader >=", value, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderLessThan(String value) {
            addCriterion("c_ex_bad10_leader <", value, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_leader <=", value, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderLike(String value) {
            addCriterion("c_ex_bad10_leader like", value, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderNotLike(String value) {
            addCriterion("c_ex_bad10_leader not like", value, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderIn(List<String> values) {
            addCriterion("c_ex_bad10_leader in", values, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderNotIn(List<String> values) {
            addCriterion("c_ex_bad10_leader not in", values, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_leader between", value1, value2, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10LeaderNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_leader not between", value1, value2, "cExBad10Leader");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressIsNull() {
            addCriterion("c_ex_bad10_address is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressIsNotNull() {
            addCriterion("c_ex_bad10_address is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressEqualTo(String value) {
            addCriterion("c_ex_bad10_address =", value, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressNotEqualTo(String value) {
            addCriterion("c_ex_bad10_address <>", value, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressGreaterThan(String value) {
            addCriterion("c_ex_bad10_address >", value, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_address >=", value, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressLessThan(String value) {
            addCriterion("c_ex_bad10_address <", value, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_address <=", value, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressLike(String value) {
            addCriterion("c_ex_bad10_address like", value, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressNotLike(String value) {
            addCriterion("c_ex_bad10_address not like", value, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressIn(List<String> values) {
            addCriterion("c_ex_bad10_address in", values, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressNotIn(List<String> values) {
            addCriterion("c_ex_bad10_address not in", values, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_address between", value1, value2, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10AddressNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_address not between", value1, value2, "cExBad10Address");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtIsNull() {
            addCriterion("c_ex_bad10_court is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtIsNotNull() {
            addCriterion("c_ex_bad10_court is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtEqualTo(String value) {
            addCriterion("c_ex_bad10_court =", value, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtNotEqualTo(String value) {
            addCriterion("c_ex_bad10_court <>", value, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtGreaterThan(String value) {
            addCriterion("c_ex_bad10_court >", value, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_court >=", value, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtLessThan(String value) {
            addCriterion("c_ex_bad10_court <", value, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_court <=", value, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtLike(String value) {
            addCriterion("c_ex_bad10_court like", value, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtNotLike(String value) {
            addCriterion("c_ex_bad10_court not like", value, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtIn(List<String> values) {
            addCriterion("c_ex_bad10_court in", values, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtNotIn(List<String> values) {
            addCriterion("c_ex_bad10_court not in", values, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_court between", value1, value2, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10CourtNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_court not between", value1, value2, "cExBad10Court");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeIsNull() {
            addCriterion("c_ex_bad10_time is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeIsNotNull() {
            addCriterion("c_ex_bad10_time is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeEqualTo(String value) {
            addCriterion("c_ex_bad10_time =", value, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeNotEqualTo(String value) {
            addCriterion("c_ex_bad10_time <>", value, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeGreaterThan(String value) {
            addCriterion("c_ex_bad10_time >", value, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_time >=", value, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeLessThan(String value) {
            addCriterion("c_ex_bad10_time <", value, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_time <=", value, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeLike(String value) {
            addCriterion("c_ex_bad10_time like", value, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeNotLike(String value) {
            addCriterion("c_ex_bad10_time not like", value, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeIn(List<String> values) {
            addCriterion("c_ex_bad10_time in", values, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeNotIn(List<String> values) {
            addCriterion("c_ex_bad10_time not in", values, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_time between", value1, value2, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10TimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_time not between", value1, value2, "cExBad10Time");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumIsNull() {
            addCriterion("c_ex_bad10_casenum is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumIsNotNull() {
            addCriterion("c_ex_bad10_casenum is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumEqualTo(String value) {
            addCriterion("c_ex_bad10_casenum =", value, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumNotEqualTo(String value) {
            addCriterion("c_ex_bad10_casenum <>", value, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumGreaterThan(String value) {
            addCriterion("c_ex_bad10_casenum >", value, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_casenum >=", value, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumLessThan(String value) {
            addCriterion("c_ex_bad10_casenum <", value, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_casenum <=", value, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumLike(String value) {
            addCriterion("c_ex_bad10_casenum like", value, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumNotLike(String value) {
            addCriterion("c_ex_bad10_casenum not like", value, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumIn(List<String> values) {
            addCriterion("c_ex_bad10_casenum in", values, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumNotIn(List<String> values) {
            addCriterion("c_ex_bad10_casenum not in", values, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_casenum between", value1, value2, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10CasenumNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_casenum not between", value1, value2, "cExBad10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyIsNull() {
            addCriterion("c_ex_bad10_money is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyIsNotNull() {
            addCriterion("c_ex_bad10_money is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyEqualTo(String value) {
            addCriterion("c_ex_bad10_money =", value, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyNotEqualTo(String value) {
            addCriterion("c_ex_bad10_money <>", value, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyGreaterThan(String value) {
            addCriterion("c_ex_bad10_money >", value, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_money >=", value, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyLessThan(String value) {
            addCriterion("c_ex_bad10_money <", value, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_money <=", value, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyLike(String value) {
            addCriterion("c_ex_bad10_money like", value, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyNotLike(String value) {
            addCriterion("c_ex_bad10_money not like", value, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyIn(List<String> values) {
            addCriterion("c_ex_bad10_money in", values, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyNotIn(List<String> values) {
            addCriterion("c_ex_bad10_money not in", values, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_money between", value1, value2, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10MoneyNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_money not between", value1, value2, "cExBad10Money");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseIsNull() {
            addCriterion("c_ex_bad10_base is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseIsNotNull() {
            addCriterion("c_ex_bad10_base is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseEqualTo(String value) {
            addCriterion("c_ex_bad10_base =", value, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseNotEqualTo(String value) {
            addCriterion("c_ex_bad10_base <>", value, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseGreaterThan(String value) {
            addCriterion("c_ex_bad10_base >", value, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_base >=", value, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseLessThan(String value) {
            addCriterion("c_ex_bad10_base <", value, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_base <=", value, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseLike(String value) {
            addCriterion("c_ex_bad10_base like", value, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseNotLike(String value) {
            addCriterion("c_ex_bad10_base not like", value, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseIn(List<String> values) {
            addCriterion("c_ex_bad10_base in", values, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseNotIn(List<String> values) {
            addCriterion("c_ex_bad10_base not in", values, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_base between", value1, value2, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BaseNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_base not between", value1, value2, "cExBad10Base");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyIsNull() {
            addCriterion("c_ex_bad10_basecompany is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyIsNotNull() {
            addCriterion("c_ex_bad10_basecompany is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyEqualTo(String value) {
            addCriterion("c_ex_bad10_basecompany =", value, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyNotEqualTo(String value) {
            addCriterion("c_ex_bad10_basecompany <>", value, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyGreaterThan(String value) {
            addCriterion("c_ex_bad10_basecompany >", value, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_basecompany >=", value, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyLessThan(String value) {
            addCriterion("c_ex_bad10_basecompany <", value, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_basecompany <=", value, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyLike(String value) {
            addCriterion("c_ex_bad10_basecompany like", value, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyNotLike(String value) {
            addCriterion("c_ex_bad10_basecompany not like", value, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyIn(List<String> values) {
            addCriterion("c_ex_bad10_basecompany in", values, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyNotIn(List<String> values) {
            addCriterion("c_ex_bad10_basecompany not in", values, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_basecompany between", value1, value2, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10BasecompanyNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_basecompany not between", value1, value2, "cExBad10Basecompany");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationIsNull() {
            addCriterion("c_ex_bad10_obligation is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationIsNotNull() {
            addCriterion("c_ex_bad10_obligation is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationEqualTo(String value) {
            addCriterion("c_ex_bad10_obligation =", value, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationNotEqualTo(String value) {
            addCriterion("c_ex_bad10_obligation <>", value, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationGreaterThan(String value) {
            addCriterion("c_ex_bad10_obligation >", value, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_obligation >=", value, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationLessThan(String value) {
            addCriterion("c_ex_bad10_obligation <", value, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_obligation <=", value, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationLike(String value) {
            addCriterion("c_ex_bad10_obligation like", value, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationNotLike(String value) {
            addCriterion("c_ex_bad10_obligation not like", value, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationIn(List<String> values) {
            addCriterion("c_ex_bad10_obligation in", values, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationNotIn(List<String> values) {
            addCriterion("c_ex_bad10_obligation not in", values, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_obligation between", value1, value2, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ObligationNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_obligation not between", value1, value2, "cExBad10Obligation");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeIsNull() {
            addCriterion("c_ex_bad10_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeIsNotNull() {
            addCriterion("c_ex_bad10_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeEqualTo(String value) {
            addCriterion("c_ex_bad10_lasttime =", value, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeNotEqualTo(String value) {
            addCriterion("c_ex_bad10_lasttime <>", value, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeGreaterThan(String value) {
            addCriterion("c_ex_bad10_lasttime >", value, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_lasttime >=", value, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeLessThan(String value) {
            addCriterion("c_ex_bad10_lasttime <", value, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_lasttime <=", value, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeLike(String value) {
            addCriterion("c_ex_bad10_lasttime like", value, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeNotLike(String value) {
            addCriterion("c_ex_bad10_lasttime not like", value, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeIn(List<String> values) {
            addCriterion("c_ex_bad10_lasttime in", values, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeNotIn(List<String> values) {
            addCriterion("c_ex_bad10_lasttime not in", values, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_lasttime between", value1, value2, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10LasttimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_lasttime not between", value1, value2, "cExBad10Lasttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceIsNull() {
            addCriterion("c_ex_bad10_performance is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceIsNotNull() {
            addCriterion("c_ex_bad10_performance is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceEqualTo(String value) {
            addCriterion("c_ex_bad10_performance =", value, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceNotEqualTo(String value) {
            addCriterion("c_ex_bad10_performance <>", value, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceGreaterThan(String value) {
            addCriterion("c_ex_bad10_performance >", value, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_performance >=", value, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceLessThan(String value) {
            addCriterion("c_ex_bad10_performance <", value, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_performance <=", value, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceLike(String value) {
            addCriterion("c_ex_bad10_performance like", value, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceNotLike(String value) {
            addCriterion("c_ex_bad10_performance not like", value, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceIn(List<String> values) {
            addCriterion("c_ex_bad10_performance in", values, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceNotIn(List<String> values) {
            addCriterion("c_ex_bad10_performance not in", values, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_performance between", value1, value2, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformanceNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_performance not between", value1, value2, "cExBad10Performance");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationIsNull() {
            addCriterion("c_ex_bad10_concretesituation is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationIsNotNull() {
            addCriterion("c_ex_bad10_concretesituation is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationEqualTo(String value) {
            addCriterion("c_ex_bad10_concretesituation =", value, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationNotEqualTo(String value) {
            addCriterion("c_ex_bad10_concretesituation <>", value, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationGreaterThan(String value) {
            addCriterion("c_ex_bad10_concretesituation >", value, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_concretesituation >=", value, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationLessThan(String value) {
            addCriterion("c_ex_bad10_concretesituation <", value, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_concretesituation <=", value, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationLike(String value) {
            addCriterion("c_ex_bad10_concretesituation like", value, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationNotLike(String value) {
            addCriterion("c_ex_bad10_concretesituation not like", value, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationIn(List<String> values) {
            addCriterion("c_ex_bad10_concretesituation in", values, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationNotIn(List<String> values) {
            addCriterion("c_ex_bad10_concretesituation not in", values, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_concretesituation between", value1, value2, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10ConcretesituationNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_concretesituation not between", value1, value2, "cExBad10Concretesituation");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeIsNull() {
            addCriterion("c_ex_bad10_breaktime is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeIsNotNull() {
            addCriterion("c_ex_bad10_breaktime is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeEqualTo(String value) {
            addCriterion("c_ex_bad10_breaktime =", value, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeNotEqualTo(String value) {
            addCriterion("c_ex_bad10_breaktime <>", value, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeGreaterThan(String value) {
            addCriterion("c_ex_bad10_breaktime >", value, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_breaktime >=", value, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeLessThan(String value) {
            addCriterion("c_ex_bad10_breaktime <", value, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_breaktime <=", value, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeLike(String value) {
            addCriterion("c_ex_bad10_breaktime like", value, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeNotLike(String value) {
            addCriterion("c_ex_bad10_breaktime not like", value, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeIn(List<String> values) {
            addCriterion("c_ex_bad10_breaktime in", values, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeNotIn(List<String> values) {
            addCriterion("c_ex_bad10_breaktime not in", values, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_breaktime between", value1, value2, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10BreaktimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_breaktime not between", value1, value2, "cExBad10Breaktime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeIsNull() {
            addCriterion("c_ex_bad10_posttime is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeIsNotNull() {
            addCriterion("c_ex_bad10_posttime is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeEqualTo(String value) {
            addCriterion("c_ex_bad10_posttime =", value, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeNotEqualTo(String value) {
            addCriterion("c_ex_bad10_posttime <>", value, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeGreaterThan(String value) {
            addCriterion("c_ex_bad10_posttime >", value, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_posttime >=", value, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeLessThan(String value) {
            addCriterion("c_ex_bad10_posttime <", value, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_posttime <=", value, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeLike(String value) {
            addCriterion("c_ex_bad10_posttime like", value, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeNotLike(String value) {
            addCriterion("c_ex_bad10_posttime not like", value, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeIn(List<String> values) {
            addCriterion("c_ex_bad10_posttime in", values, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeNotIn(List<String> values) {
            addCriterion("c_ex_bad10_posttime not in", values, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_posttime between", value1, value2, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PosttimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_posttime not between", value1, value2, "cExBad10Posttime");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartIsNull() {
            addCriterion("c_ex_bad10_performedpart is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartIsNotNull() {
            addCriterion("c_ex_bad10_performedpart is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartEqualTo(String value) {
            addCriterion("c_ex_bad10_performedpart =", value, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartNotEqualTo(String value) {
            addCriterion("c_ex_bad10_performedpart <>", value, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartGreaterThan(String value) {
            addCriterion("c_ex_bad10_performedpart >", value, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_performedpart >=", value, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartLessThan(String value) {
            addCriterion("c_ex_bad10_performedpart <", value, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_performedpart <=", value, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartLike(String value) {
            addCriterion("c_ex_bad10_performedpart like", value, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartNotLike(String value) {
            addCriterion("c_ex_bad10_performedpart not like", value, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartIn(List<String> values) {
            addCriterion("c_ex_bad10_performedpart in", values, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartNotIn(List<String> values) {
            addCriterion("c_ex_bad10_performedpart not in", values, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_performedpart between", value1, value2, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10PerformedpartNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_performedpart not between", value1, value2, "cExBad10Performedpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartIsNull() {
            addCriterion("c_ex_bad10_unperformpart is null");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartIsNotNull() {
            addCriterion("c_ex_bad10_unperformpart is not null");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartEqualTo(String value) {
            addCriterion("c_ex_bad10_unperformpart =", value, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartNotEqualTo(String value) {
            addCriterion("c_ex_bad10_unperformpart <>", value, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartGreaterThan(String value) {
            addCriterion("c_ex_bad10_unperformpart >", value, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_unperformpart >=", value, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartLessThan(String value) {
            addCriterion("c_ex_bad10_unperformpart <", value, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartLessThanOrEqualTo(String value) {
            addCriterion("c_ex_bad10_unperformpart <=", value, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartLike(String value) {
            addCriterion("c_ex_bad10_unperformpart like", value, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartNotLike(String value) {
            addCriterion("c_ex_bad10_unperformpart not like", value, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartIn(List<String> values) {
            addCriterion("c_ex_bad10_unperformpart in", values, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartNotIn(List<String> values) {
            addCriterion("c_ex_bad10_unperformpart not in", values, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_unperformpart between", value1, value2, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExBad10UnperformpartNotBetween(String value1, String value2) {
            addCriterion("c_ex_bad10_unperformpart not between", value1, value2, "cExBad10Unperformpart");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameIsNull() {
            addCriterion("c_ex_execut10_name is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameIsNotNull() {
            addCriterion("c_ex_execut10_name is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameEqualTo(String value) {
            addCriterion("c_ex_execut10_name =", value, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameNotEqualTo(String value) {
            addCriterion("c_ex_execut10_name <>", value, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameGreaterThan(String value) {
            addCriterion("c_ex_execut10_name >", value, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_name >=", value, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameLessThan(String value) {
            addCriterion("c_ex_execut10_name <", value, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_name <=", value, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameLike(String value) {
            addCriterion("c_ex_execut10_name like", value, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameNotLike(String value) {
            addCriterion("c_ex_execut10_name not like", value, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameIn(List<String> values) {
            addCriterion("c_ex_execut10_name in", values, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameNotIn(List<String> values) {
            addCriterion("c_ex_execut10_name not in", values, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_name between", value1, value2, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10NameNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_name not between", value1, value2, "cExExecut10Name");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidIsNull() {
            addCriterion("c_ex_execut10_cid is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidIsNotNull() {
            addCriterion("c_ex_execut10_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidEqualTo(String value) {
            addCriterion("c_ex_execut10_cid =", value, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidNotEqualTo(String value) {
            addCriterion("c_ex_execut10_cid <>", value, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidGreaterThan(String value) {
            addCriterion("c_ex_execut10_cid >", value, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_cid >=", value, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidLessThan(String value) {
            addCriterion("c_ex_execut10_cid <", value, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_cid <=", value, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidLike(String value) {
            addCriterion("c_ex_execut10_cid like", value, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidNotLike(String value) {
            addCriterion("c_ex_execut10_cid not like", value, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidIn(List<String> values) {
            addCriterion("c_ex_execut10_cid in", values, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidNotIn(List<String> values) {
            addCriterion("c_ex_execut10_cid not in", values, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_cid between", value1, value2, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_cid not between", value1, value2, "cExExecut10Cid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeIsNull() {
            addCriterion("c_ex_execut10_cidtype is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeIsNotNull() {
            addCriterion("c_ex_execut10_cidtype is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeEqualTo(String value) {
            addCriterion("c_ex_execut10_cidtype =", value, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeNotEqualTo(String value) {
            addCriterion("c_ex_execut10_cidtype <>", value, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeGreaterThan(String value) {
            addCriterion("c_ex_execut10_cidtype >", value, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_cidtype >=", value, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeLessThan(String value) {
            addCriterion("c_ex_execut10_cidtype <", value, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_cidtype <=", value, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeLike(String value) {
            addCriterion("c_ex_execut10_cidtype like", value, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeNotLike(String value) {
            addCriterion("c_ex_execut10_cidtype not like", value, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeIn(List<String> values) {
            addCriterion("c_ex_execut10_cidtype in", values, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeNotIn(List<String> values) {
            addCriterion("c_ex_execut10_cidtype not in", values, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_cidtype between", value1, value2, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CidtypeNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_cidtype not between", value1, value2, "cExExecut10Cidtype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeIsNull() {
            addCriterion("c_ex_execut10_datatime is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeIsNotNull() {
            addCriterion("c_ex_execut10_datatime is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeEqualTo(String value) {
            addCriterion("c_ex_execut10_datatime =", value, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeNotEqualTo(String value) {
            addCriterion("c_ex_execut10_datatime <>", value, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeGreaterThan(String value) {
            addCriterion("c_ex_execut10_datatime >", value, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_datatime >=", value, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeLessThan(String value) {
            addCriterion("c_ex_execut10_datatime <", value, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_datatime <=", value, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeLike(String value) {
            addCriterion("c_ex_execut10_datatime like", value, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeNotLike(String value) {
            addCriterion("c_ex_execut10_datatime not like", value, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeIn(List<String> values) {
            addCriterion("c_ex_execut10_datatime in", values, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeNotIn(List<String> values) {
            addCriterion("c_ex_execut10_datatime not in", values, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_datatime between", value1, value2, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_datatime not between", value1, value2, "cExExecut10Datatime");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidIsNull() {
            addCriterion("c_ex_execut10_datatypeid is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidIsNotNull() {
            addCriterion("c_ex_execut10_datatypeid is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidEqualTo(String value) {
            addCriterion("c_ex_execut10_datatypeid =", value, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidNotEqualTo(String value) {
            addCriterion("c_ex_execut10_datatypeid <>", value, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidGreaterThan(String value) {
            addCriterion("c_ex_execut10_datatypeid >", value, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_datatypeid >=", value, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidLessThan(String value) {
            addCriterion("c_ex_execut10_datatypeid <", value, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_datatypeid <=", value, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidLike(String value) {
            addCriterion("c_ex_execut10_datatypeid like", value, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidNotLike(String value) {
            addCriterion("c_ex_execut10_datatypeid not like", value, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidIn(List<String> values) {
            addCriterion("c_ex_execut10_datatypeid in", values, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidNotIn(List<String> values) {
            addCriterion("c_ex_execut10_datatypeid not in", values, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_datatypeid between", value1, value2, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeidNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_datatypeid not between", value1, value2, "cExExecut10Datatypeid");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeIsNull() {
            addCriterion("c_ex_execut10_datatype is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeIsNotNull() {
            addCriterion("c_ex_execut10_datatype is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeEqualTo(String value) {
            addCriterion("c_ex_execut10_datatype =", value, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeNotEqualTo(String value) {
            addCriterion("c_ex_execut10_datatype <>", value, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeGreaterThan(String value) {
            addCriterion("c_ex_execut10_datatype >", value, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_datatype >=", value, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeLessThan(String value) {
            addCriterion("c_ex_execut10_datatype <", value, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_datatype <=", value, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeLike(String value) {
            addCriterion("c_ex_execut10_datatype like", value, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeNotLike(String value) {
            addCriterion("c_ex_execut10_datatype not like", value, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeIn(List<String> values) {
            addCriterion("c_ex_execut10_datatype in", values, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeNotIn(List<String> values) {
            addCriterion("c_ex_execut10_datatype not in", values, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_datatype between", value1, value2, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10DatatypeNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_datatype not between", value1, value2, "cExExecut10Datatype");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtIsNull() {
            addCriterion("c_ex_execut10_court is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtIsNotNull() {
            addCriterion("c_ex_execut10_court is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtEqualTo(String value) {
            addCriterion("c_ex_execut10_court =", value, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtNotEqualTo(String value) {
            addCriterion("c_ex_execut10_court <>", value, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtGreaterThan(String value) {
            addCriterion("c_ex_execut10_court >", value, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_court >=", value, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtLessThan(String value) {
            addCriterion("c_ex_execut10_court <", value, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_court <=", value, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtLike(String value) {
            addCriterion("c_ex_execut10_court like", value, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtNotLike(String value) {
            addCriterion("c_ex_execut10_court not like", value, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtIn(List<String> values) {
            addCriterion("c_ex_execut10_court in", values, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtNotIn(List<String> values) {
            addCriterion("c_ex_execut10_court not in", values, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_court between", value1, value2, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CourtNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_court not between", value1, value2, "cExExecut10Court");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeIsNull() {
            addCriterion("c_ex_execut10_time is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeIsNotNull() {
            addCriterion("c_ex_execut10_time is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeEqualTo(String value) {
            addCriterion("c_ex_execut10_time =", value, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeNotEqualTo(String value) {
            addCriterion("c_ex_execut10_time <>", value, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeGreaterThan(String value) {
            addCriterion("c_ex_execut10_time >", value, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_time >=", value, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeLessThan(String value) {
            addCriterion("c_ex_execut10_time <", value, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_time <=", value, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeLike(String value) {
            addCriterion("c_ex_execut10_time like", value, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeNotLike(String value) {
            addCriterion("c_ex_execut10_time not like", value, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeIn(List<String> values) {
            addCriterion("c_ex_execut10_time in", values, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeNotIn(List<String> values) {
            addCriterion("c_ex_execut10_time not in", values, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_time between", value1, value2, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10TimeNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_time not between", value1, value2, "cExExecut10Time");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumIsNull() {
            addCriterion("c_ex_execut10_casenum is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumIsNotNull() {
            addCriterion("c_ex_execut10_casenum is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumEqualTo(String value) {
            addCriterion("c_ex_execut10_casenum =", value, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumNotEqualTo(String value) {
            addCriterion("c_ex_execut10_casenum <>", value, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumGreaterThan(String value) {
            addCriterion("c_ex_execut10_casenum >", value, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_casenum >=", value, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumLessThan(String value) {
            addCriterion("c_ex_execut10_casenum <", value, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_casenum <=", value, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumLike(String value) {
            addCriterion("c_ex_execut10_casenum like", value, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumNotLike(String value) {
            addCriterion("c_ex_execut10_casenum not like", value, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumIn(List<String> values) {
            addCriterion("c_ex_execut10_casenum in", values, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumNotIn(List<String> values) {
            addCriterion("c_ex_execut10_casenum not in", values, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_casenum between", value1, value2, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10CasenumNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_casenum not between", value1, value2, "cExExecut10Casenum");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyIsNull() {
            addCriterion("c_ex_execut10_money is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyIsNotNull() {
            addCriterion("c_ex_execut10_money is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyEqualTo(String value) {
            addCriterion("c_ex_execut10_money =", value, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyNotEqualTo(String value) {
            addCriterion("c_ex_execut10_money <>", value, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyGreaterThan(String value) {
            addCriterion("c_ex_execut10_money >", value, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_money >=", value, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyLessThan(String value) {
            addCriterion("c_ex_execut10_money <", value, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_money <=", value, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyLike(String value) {
            addCriterion("c_ex_execut10_money like", value, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyNotLike(String value) {
            addCriterion("c_ex_execut10_money not like", value, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyIn(List<String> values) {
            addCriterion("c_ex_execut10_money in", values, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyNotIn(List<String> values) {
            addCriterion("c_ex_execut10_money not in", values, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_money between", value1, value2, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10MoneyNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_money not between", value1, value2, "cExExecut10Money");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteIsNull() {
            addCriterion("c_ex_execut10_statute is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteIsNotNull() {
            addCriterion("c_ex_execut10_statute is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteEqualTo(String value) {
            addCriterion("c_ex_execut10_statute =", value, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteNotEqualTo(String value) {
            addCriterion("c_ex_execut10_statute <>", value, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteGreaterThan(String value) {
            addCriterion("c_ex_execut10_statute >", value, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_statute >=", value, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteLessThan(String value) {
            addCriterion("c_ex_execut10_statute <", value, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_statute <=", value, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteLike(String value) {
            addCriterion("c_ex_execut10_statute like", value, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteNotLike(String value) {
            addCriterion("c_ex_execut10_statute not like", value, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteIn(List<String> values) {
            addCriterion("c_ex_execut10_statute in", values, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteNotIn(List<String> values) {
            addCriterion("c_ex_execut10_statute not in", values, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_statute between", value1, value2, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10StatuteNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_statute not between", value1, value2, "cExExecut10Statute");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicIsNull() {
            addCriterion("c_ex_execut10_basic is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicIsNotNull() {
            addCriterion("c_ex_execut10_basic is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicEqualTo(String value) {
            addCriterion("c_ex_execut10_basic =", value, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicNotEqualTo(String value) {
            addCriterion("c_ex_execut10_basic <>", value, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicGreaterThan(String value) {
            addCriterion("c_ex_execut10_basic >", value, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_basic >=", value, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicLessThan(String value) {
            addCriterion("c_ex_execut10_basic <", value, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_basic <=", value, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicLike(String value) {
            addCriterion("c_ex_execut10_basic like", value, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicNotLike(String value) {
            addCriterion("c_ex_execut10_basic not like", value, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicIn(List<String> values) {
            addCriterion("c_ex_execut10_basic in", values, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicNotIn(List<String> values) {
            addCriterion("c_ex_execut10_basic not in", values, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_basic between", value1, value2, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasicNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_basic not between", value1, value2, "cExExecut10Basic");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtIsNull() {
            addCriterion("c_ex_execut10_basiccourt is null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtIsNotNull() {
            addCriterion("c_ex_execut10_basiccourt is not null");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtEqualTo(String value) {
            addCriterion("c_ex_execut10_basiccourt =", value, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtNotEqualTo(String value) {
            addCriterion("c_ex_execut10_basiccourt <>", value, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtGreaterThan(String value) {
            addCriterion("c_ex_execut10_basiccourt >", value, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtGreaterThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_basiccourt >=", value, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtLessThan(String value) {
            addCriterion("c_ex_execut10_basiccourt <", value, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtLessThanOrEqualTo(String value) {
            addCriterion("c_ex_execut10_basiccourt <=", value, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtLike(String value) {
            addCriterion("c_ex_execut10_basiccourt like", value, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtNotLike(String value) {
            addCriterion("c_ex_execut10_basiccourt not like", value, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtIn(List<String> values) {
            addCriterion("c_ex_execut10_basiccourt in", values, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtNotIn(List<String> values) {
            addCriterion("c_ex_execut10_basiccourt not in", values, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_basiccourt between", value1, value2, "cExExecut10Basiccourt");
            return (Criteria) this;
        }

        public Criteria andCExExecut10BasiccourtNotBetween(String value1, String value2) {
            addCriterion("c_ex_execut10_basiccourt not between", value1, value2, "cExExecut10Basiccourt");
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