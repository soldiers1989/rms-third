package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSysConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSysConfigExample() {
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

        public Criteria andCKeyIsNull() {
            addCriterion("c_key is null");
            return (Criteria) this;
        }

        public Criteria andCKeyIsNotNull() {
            addCriterion("c_key is not null");
            return (Criteria) this;
        }

        public Criteria andCKeyEqualTo(String value) {
            addCriterion("c_key =", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotEqualTo(String value) {
            addCriterion("c_key <>", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyGreaterThan(String value) {
            addCriterion("c_key >", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyGreaterThanOrEqualTo(String value) {
            addCriterion("c_key >=", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyLessThan(String value) {
            addCriterion("c_key <", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyLessThanOrEqualTo(String value) {
            addCriterion("c_key <=", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyLike(String value) {
            addCriterion("c_key like", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotLike(String value) {
            addCriterion("c_key not like", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyIn(List<String> values) {
            addCriterion("c_key in", values, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotIn(List<String> values) {
            addCriterion("c_key not in", values, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyBetween(String value1, String value2) {
            addCriterion("c_key between", value1, value2, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotBetween(String value1, String value2) {
            addCriterion("c_key not between", value1, value2, "cKey");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNull() {
            addCriterion("c_description is null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNotNull() {
            addCriterion("c_description is not null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionEqualTo(String value) {
            addCriterion("c_description =", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotEqualTo(String value) {
            addCriterion("c_description <>", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThan(String value) {
            addCriterion("c_description >", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("c_description >=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThan(String value) {
            addCriterion("c_description <", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThanOrEqualTo(String value) {
            addCriterion("c_description <=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLike(String value) {
            addCriterion("c_description like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotLike(String value) {
            addCriterion("c_description not like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIn(List<String> values) {
            addCriterion("c_description in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotIn(List<String> values) {
            addCriterion("c_description not in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionBetween(String value1, String value2) {
            addCriterion("c_description between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotBetween(String value1, String value2) {
            addCriterion("c_description not between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCValueIsNull() {
            addCriterion("c_value is null");
            return (Criteria) this;
        }

        public Criteria andCValueIsNotNull() {
            addCriterion("c_value is not null");
            return (Criteria) this;
        }

        public Criteria andCValueEqualTo(String value) {
            addCriterion("c_value =", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotEqualTo(String value) {
            addCriterion("c_value <>", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueGreaterThan(String value) {
            addCriterion("c_value >", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueGreaterThanOrEqualTo(String value) {
            addCriterion("c_value >=", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLessThan(String value) {
            addCriterion("c_value <", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLessThanOrEqualTo(String value) {
            addCriterion("c_value <=", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLike(String value) {
            addCriterion("c_value like", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotLike(String value) {
            addCriterion("c_value not like", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueIn(List<String> values) {
            addCriterion("c_value in", values, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotIn(List<String> values) {
            addCriterion("c_value not in", values, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueBetween(String value1, String value2) {
            addCriterion("c_value between", value1, value2, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotBetween(String value1, String value2) {
            addCriterion("c_value not between", value1, value2, "cValue");
            return (Criteria) this;
        }

        public Criteria andCLevelIsNull() {
            addCriterion("c_level is null");
            return (Criteria) this;
        }

        public Criteria andCLevelIsNotNull() {
            addCriterion("c_level is not null");
            return (Criteria) this;
        }

        public Criteria andCLevelEqualTo(String value) {
            addCriterion("c_level =", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotEqualTo(String value) {
            addCriterion("c_level <>", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelGreaterThan(String value) {
            addCriterion("c_level >", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelGreaterThanOrEqualTo(String value) {
            addCriterion("c_level >=", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelLessThan(String value) {
            addCriterion("c_level <", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelLessThanOrEqualTo(String value) {
            addCriterion("c_level <=", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelLike(String value) {
            addCriterion("c_level like", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotLike(String value) {
            addCriterion("c_level not like", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelIn(List<String> values) {
            addCriterion("c_level in", values, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotIn(List<String> values) {
            addCriterion("c_level not in", values, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelBetween(String value1, String value2) {
            addCriterion("c_level between", value1, value2, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotBetween(String value1, String value2) {
            addCriterion("c_level not between", value1, value2, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCOwnerIsNull() {
            addCriterion("c_owner is null");
            return (Criteria) this;
        }

        public Criteria andCOwnerIsNotNull() {
            addCriterion("c_owner is not null");
            return (Criteria) this;
        }

        public Criteria andCOwnerEqualTo(String value) {
            addCriterion("c_owner =", value, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerNotEqualTo(String value) {
            addCriterion("c_owner <>", value, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerGreaterThan(String value) {
            addCriterion("c_owner >", value, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("c_owner >=", value, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerLessThan(String value) {
            addCriterion("c_owner <", value, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerLessThanOrEqualTo(String value) {
            addCriterion("c_owner <=", value, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerLike(String value) {
            addCriterion("c_owner like", value, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerNotLike(String value) {
            addCriterion("c_owner not like", value, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerIn(List<String> values) {
            addCriterion("c_owner in", values, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerNotIn(List<String> values) {
            addCriterion("c_owner not in", values, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerBetween(String value1, String value2) {
            addCriterion("c_owner between", value1, value2, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCOwnerNotBetween(String value1, String value2) {
            addCriterion("c_owner not between", value1, value2, "cOwner");
            return (Criteria) this;
        }

        public Criteria andCDelIsNull() {
            addCriterion("c_del is null");
            return (Criteria) this;
        }

        public Criteria andCDelIsNotNull() {
            addCriterion("c_del is not null");
            return (Criteria) this;
        }

        public Criteria andCDelEqualTo(String value) {
            addCriterion("c_del =", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelNotEqualTo(String value) {
            addCriterion("c_del <>", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelGreaterThan(String value) {
            addCriterion("c_del >", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelGreaterThanOrEqualTo(String value) {
            addCriterion("c_del >=", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelLessThan(String value) {
            addCriterion("c_del <", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelLessThanOrEqualTo(String value) {
            addCriterion("c_del <=", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelLike(String value) {
            addCriterion("c_del like", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelNotLike(String value) {
            addCriterion("c_del not like", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelIn(List<String> values) {
            addCriterion("c_del in", values, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelNotIn(List<String> values) {
            addCriterion("c_del not in", values, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelBetween(String value1, String value2) {
            addCriterion("c_del between", value1, value2, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelNotBetween(String value1, String value2) {
            addCriterion("c_del not between", value1, value2, "cDel");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeIsNull() {
            addCriterion("dt_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeIsNotNull() {
            addCriterion("dt_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeEqualTo(Date value) {
            addCriterion("dt_create_time =", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeNotEqualTo(Date value) {
            addCriterion("dt_create_time <>", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeGreaterThan(Date value) {
            addCriterion("dt_create_time >", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_create_time >=", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeLessThan(Date value) {
            addCriterion("dt_create_time <", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dt_create_time <=", value, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeIn(List<Date> values) {
            addCriterion("dt_create_time in", values, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeNotIn(List<Date> values) {
            addCriterion("dt_create_time not in", values, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dt_create_time between", value1, value2, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andDtCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dt_create_time not between", value1, value2, "dtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateUserIsNull() {
            addCriterion("c_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCCreateUserIsNotNull() {
            addCriterion("c_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateUserEqualTo(String value) {
            addCriterion("c_create_user =", value, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserNotEqualTo(String value) {
            addCriterion("c_create_user <>", value, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserGreaterThan(String value) {
            addCriterion("c_create_user >", value, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("c_create_user >=", value, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserLessThan(String value) {
            addCriterion("c_create_user <", value, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserLessThanOrEqualTo(String value) {
            addCriterion("c_create_user <=", value, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserLike(String value) {
            addCriterion("c_create_user like", value, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserNotLike(String value) {
            addCriterion("c_create_user not like", value, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserIn(List<String> values) {
            addCriterion("c_create_user in", values, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserNotIn(List<String> values) {
            addCriterion("c_create_user not in", values, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserBetween(String value1, String value2) {
            addCriterion("c_create_user between", value1, value2, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andCCreateUserNotBetween(String value1, String value2) {
            addCriterion("c_create_user not between", value1, value2, "cCreateUser");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeIsNull() {
            addCriterion("dt_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeIsNotNull() {
            addCriterion("dt_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeEqualTo(Date value) {
            addCriterion("dt_update_time =", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeNotEqualTo(Date value) {
            addCriterion("dt_update_time <>", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeGreaterThan(Date value) {
            addCriterion("dt_update_time >", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_update_time >=", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeLessThan(Date value) {
            addCriterion("dt_update_time <", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dt_update_time <=", value, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeIn(List<Date> values) {
            addCriterion("dt_update_time in", values, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeNotIn(List<Date> values) {
            addCriterion("dt_update_time not in", values, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dt_update_time between", value1, value2, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDtUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dt_update_time not between", value1, value2, "dtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCOptUserIsNull() {
            addCriterion("c_opt_user is null");
            return (Criteria) this;
        }

        public Criteria andCOptUserIsNotNull() {
            addCriterion("c_opt_user is not null");
            return (Criteria) this;
        }

        public Criteria andCOptUserEqualTo(String value) {
            addCriterion("c_opt_user =", value, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserNotEqualTo(String value) {
            addCriterion("c_opt_user <>", value, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserGreaterThan(String value) {
            addCriterion("c_opt_user >", value, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserGreaterThanOrEqualTo(String value) {
            addCriterion("c_opt_user >=", value, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserLessThan(String value) {
            addCriterion("c_opt_user <", value, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserLessThanOrEqualTo(String value) {
            addCriterion("c_opt_user <=", value, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserLike(String value) {
            addCriterion("c_opt_user like", value, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserNotLike(String value) {
            addCriterion("c_opt_user not like", value, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserIn(List<String> values) {
            addCriterion("c_opt_user in", values, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserNotIn(List<String> values) {
            addCriterion("c_opt_user not in", values, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserBetween(String value1, String value2) {
            addCriterion("c_opt_user between", value1, value2, "cOptUser");
            return (Criteria) this;
        }

        public Criteria andCOptUserNotBetween(String value1, String value2) {
            addCriterion("c_opt_user not between", value1, value2, "cOptUser");
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