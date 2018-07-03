package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdTdIosDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdTdIosDataExample() {
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

        public Criteria andCTokenidIsNull() {
            addCriterion("c_tokenId is null");
            return (Criteria) this;
        }

        public Criteria andCTokenidIsNotNull() {
            addCriterion("c_tokenId is not null");
            return (Criteria) this;
        }

        public Criteria andCTokenidEqualTo(String value) {
            addCriterion("c_tokenId =", value, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidNotEqualTo(String value) {
            addCriterion("c_tokenId <>", value, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidGreaterThan(String value) {
            addCriterion("c_tokenId >", value, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidGreaterThanOrEqualTo(String value) {
            addCriterion("c_tokenId >=", value, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidLessThan(String value) {
            addCriterion("c_tokenId <", value, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidLessThanOrEqualTo(String value) {
            addCriterion("c_tokenId <=", value, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidLike(String value) {
            addCriterion("c_tokenId like", value, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidNotLike(String value) {
            addCriterion("c_tokenId not like", value, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidIn(List<String> values) {
            addCriterion("c_tokenId in", values, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidNotIn(List<String> values) {
            addCriterion("c_tokenId not in", values, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidBetween(String value1, String value2) {
            addCriterion("c_tokenId between", value1, value2, "cTokenid");
            return (Criteria) this;
        }

        public Criteria andCTokenidNotBetween(String value1, String value2) {
            addCriterion("c_tokenId not between", value1, value2, "cTokenid");
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

        public Criteria andCIdfaIsNull() {
            addCriterion("c_idfa is null");
            return (Criteria) this;
        }

        public Criteria andCIdfaIsNotNull() {
            addCriterion("c_idfa is not null");
            return (Criteria) this;
        }

        public Criteria andCIdfaEqualTo(String value) {
            addCriterion("c_idfa =", value, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaNotEqualTo(String value) {
            addCriterion("c_idfa <>", value, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaGreaterThan(String value) {
            addCriterion("c_idfa >", value, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaGreaterThanOrEqualTo(String value) {
            addCriterion("c_idfa >=", value, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaLessThan(String value) {
            addCriterion("c_idfa <", value, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaLessThanOrEqualTo(String value) {
            addCriterion("c_idfa <=", value, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaLike(String value) {
            addCriterion("c_idfa like", value, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaNotLike(String value) {
            addCriterion("c_idfa not like", value, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaIn(List<String> values) {
            addCriterion("c_idfa in", values, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaNotIn(List<String> values) {
            addCriterion("c_idfa not in", values, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaBetween(String value1, String value2) {
            addCriterion("c_idfa between", value1, value2, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfaNotBetween(String value1, String value2) {
            addCriterion("c_idfa not between", value1, value2, "cIdfa");
            return (Criteria) this;
        }

        public Criteria andCIdfvIsNull() {
            addCriterion("c_idfv is null");
            return (Criteria) this;
        }

        public Criteria andCIdfvIsNotNull() {
            addCriterion("c_idfv is not null");
            return (Criteria) this;
        }

        public Criteria andCIdfvEqualTo(String value) {
            addCriterion("c_idfv =", value, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvNotEqualTo(String value) {
            addCriterion("c_idfv <>", value, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvGreaterThan(String value) {
            addCriterion("c_idfv >", value, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvGreaterThanOrEqualTo(String value) {
            addCriterion("c_idfv >=", value, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvLessThan(String value) {
            addCriterion("c_idfv <", value, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvLessThanOrEqualTo(String value) {
            addCriterion("c_idfv <=", value, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvLike(String value) {
            addCriterion("c_idfv like", value, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvNotLike(String value) {
            addCriterion("c_idfv not like", value, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvIn(List<String> values) {
            addCriterion("c_idfv in", values, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvNotIn(List<String> values) {
            addCriterion("c_idfv not in", values, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvBetween(String value1, String value2) {
            addCriterion("c_idfv between", value1, value2, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCIdfvNotBetween(String value1, String value2) {
            addCriterion("c_idfv not between", value1, value2, "cIdfv");
            return (Criteria) this;
        }

        public Criteria andCUuidIsNull() {
            addCriterion("c_uuid is null");
            return (Criteria) this;
        }

        public Criteria andCUuidIsNotNull() {
            addCriterion("c_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andCUuidEqualTo(String value) {
            addCriterion("c_uuid =", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidNotEqualTo(String value) {
            addCriterion("c_uuid <>", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidGreaterThan(String value) {
            addCriterion("c_uuid >", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidGreaterThanOrEqualTo(String value) {
            addCriterion("c_uuid >=", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidLessThan(String value) {
            addCriterion("c_uuid <", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidLessThanOrEqualTo(String value) {
            addCriterion("c_uuid <=", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidLike(String value) {
            addCriterion("c_uuid like", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidNotLike(String value) {
            addCriterion("c_uuid not like", value, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidIn(List<String> values) {
            addCriterion("c_uuid in", values, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidNotIn(List<String> values) {
            addCriterion("c_uuid not in", values, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidBetween(String value1, String value2) {
            addCriterion("c_uuid between", value1, value2, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCUuidNotBetween(String value1, String value2) {
            addCriterion("c_uuid not between", value1, value2, "cUuid");
            return (Criteria) this;
        }

        public Criteria andCBoottimeIsNull() {
            addCriterion("c_bootTime is null");
            return (Criteria) this;
        }

        public Criteria andCBoottimeIsNotNull() {
            addCriterion("c_bootTime is not null");
            return (Criteria) this;
        }

        public Criteria andCBoottimeEqualTo(String value) {
            addCriterion("c_bootTime =", value, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeNotEqualTo(String value) {
            addCriterion("c_bootTime <>", value, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeGreaterThan(String value) {
            addCriterion("c_bootTime >", value, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_bootTime >=", value, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeLessThan(String value) {
            addCriterion("c_bootTime <", value, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeLessThanOrEqualTo(String value) {
            addCriterion("c_bootTime <=", value, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeLike(String value) {
            addCriterion("c_bootTime like", value, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeNotLike(String value) {
            addCriterion("c_bootTime not like", value, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeIn(List<String> values) {
            addCriterion("c_bootTime in", values, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeNotIn(List<String> values) {
            addCriterion("c_bootTime not in", values, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeBetween(String value1, String value2) {
            addCriterion("c_bootTime between", value1, value2, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCBoottimeNotBetween(String value1, String value2) {
            addCriterion("c_bootTime not between", value1, value2, "cBoottime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeIsNull() {
            addCriterion("c_currentTime is null");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeIsNotNull() {
            addCriterion("c_currentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeEqualTo(String value) {
            addCriterion("c_currentTime =", value, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeNotEqualTo(String value) {
            addCriterion("c_currentTime <>", value, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeGreaterThan(String value) {
            addCriterion("c_currentTime >", value, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_currentTime >=", value, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeLessThan(String value) {
            addCriterion("c_currentTime <", value, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeLessThanOrEqualTo(String value) {
            addCriterion("c_currentTime <=", value, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeLike(String value) {
            addCriterion("c_currentTime like", value, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeNotLike(String value) {
            addCriterion("c_currentTime not like", value, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeIn(List<String> values) {
            addCriterion("c_currentTime in", values, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeNotIn(List<String> values) {
            addCriterion("c_currentTime not in", values, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeBetween(String value1, String value2) {
            addCriterion("c_currentTime between", value1, value2, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCCurrenttimeNotBetween(String value1, String value2) {
            addCriterion("c_currentTime not between", value1, value2, "cCurrenttime");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceIsNull() {
            addCriterion("c_totalSpace is null");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceIsNotNull() {
            addCriterion("c_totalSpace is not null");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceEqualTo(String value) {
            addCriterion("c_totalSpace =", value, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceNotEqualTo(String value) {
            addCriterion("c_totalSpace <>", value, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceGreaterThan(String value) {
            addCriterion("c_totalSpace >", value, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceGreaterThanOrEqualTo(String value) {
            addCriterion("c_totalSpace >=", value, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceLessThan(String value) {
            addCriterion("c_totalSpace <", value, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceLessThanOrEqualTo(String value) {
            addCriterion("c_totalSpace <=", value, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceLike(String value) {
            addCriterion("c_totalSpace like", value, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceNotLike(String value) {
            addCriterion("c_totalSpace not like", value, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceIn(List<String> values) {
            addCriterion("c_totalSpace in", values, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceNotIn(List<String> values) {
            addCriterion("c_totalSpace not in", values, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceBetween(String value1, String value2) {
            addCriterion("c_totalSpace between", value1, value2, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCTotalspaceNotBetween(String value1, String value2) {
            addCriterion("c_totalSpace not between", value1, value2, "cTotalspace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceIsNull() {
            addCriterion("c_freeSpace is null");
            return (Criteria) this;
        }

        public Criteria andCFreespaceIsNotNull() {
            addCriterion("c_freeSpace is not null");
            return (Criteria) this;
        }

        public Criteria andCFreespaceEqualTo(String value) {
            addCriterion("c_freeSpace =", value, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceNotEqualTo(String value) {
            addCriterion("c_freeSpace <>", value, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceGreaterThan(String value) {
            addCriterion("c_freeSpace >", value, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceGreaterThanOrEqualTo(String value) {
            addCriterion("c_freeSpace >=", value, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceLessThan(String value) {
            addCriterion("c_freeSpace <", value, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceLessThanOrEqualTo(String value) {
            addCriterion("c_freeSpace <=", value, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceLike(String value) {
            addCriterion("c_freeSpace like", value, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceNotLike(String value) {
            addCriterion("c_freeSpace not like", value, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceIn(List<String> values) {
            addCriterion("c_freeSpace in", values, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceNotIn(List<String> values) {
            addCriterion("c_freeSpace not in", values, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceBetween(String value1, String value2) {
            addCriterion("c_freeSpace between", value1, value2, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCFreespaceNotBetween(String value1, String value2) {
            addCriterion("c_freeSpace not between", value1, value2, "cFreespace");
            return (Criteria) this;
        }

        public Criteria andCMemoryIsNull() {
            addCriterion("c_memory is null");
            return (Criteria) this;
        }

        public Criteria andCMemoryIsNotNull() {
            addCriterion("c_memory is not null");
            return (Criteria) this;
        }

        public Criteria andCMemoryEqualTo(String value) {
            addCriterion("c_memory =", value, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryNotEqualTo(String value) {
            addCriterion("c_memory <>", value, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryGreaterThan(String value) {
            addCriterion("c_memory >", value, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("c_memory >=", value, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryLessThan(String value) {
            addCriterion("c_memory <", value, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryLessThanOrEqualTo(String value) {
            addCriterion("c_memory <=", value, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryLike(String value) {
            addCriterion("c_memory like", value, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryNotLike(String value) {
            addCriterion("c_memory not like", value, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryIn(List<String> values) {
            addCriterion("c_memory in", values, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryNotIn(List<String> values) {
            addCriterion("c_memory not in", values, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryBetween(String value1, String value2) {
            addCriterion("c_memory between", value1, value2, "cMemory");
            return (Criteria) this;
        }

        public Criteria andCMemoryNotBetween(String value1, String value2) {
            addCriterion("c_memory not between", value1, value2, "cMemory");
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

        public Criteria andBrightnessIsNull() {
            addCriterion("brightness is null");
            return (Criteria) this;
        }

        public Criteria andBrightnessIsNotNull() {
            addCriterion("brightness is not null");
            return (Criteria) this;
        }

        public Criteria andBrightnessEqualTo(String value) {
            addCriterion("brightness =", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessNotEqualTo(String value) {
            addCriterion("brightness <>", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessGreaterThan(String value) {
            addCriterion("brightness >", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessGreaterThanOrEqualTo(String value) {
            addCriterion("brightness >=", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessLessThan(String value) {
            addCriterion("brightness <", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessLessThanOrEqualTo(String value) {
            addCriterion("brightness <=", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessLike(String value) {
            addCriterion("brightness like", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessNotLike(String value) {
            addCriterion("brightness not like", value, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessIn(List<String> values) {
            addCriterion("brightness in", values, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessNotIn(List<String> values) {
            addCriterion("brightness not in", values, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessBetween(String value1, String value2) {
            addCriterion("brightness between", value1, value2, "brightness");
            return (Criteria) this;
        }

        public Criteria andBrightnessNotBetween(String value1, String value2) {
            addCriterion("brightness not between", value1, value2, "brightness");
            return (Criteria) this;
        }

        public Criteria andBatteryIsNull() {
            addCriterion("battery is null");
            return (Criteria) this;
        }

        public Criteria andBatteryIsNotNull() {
            addCriterion("battery is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryEqualTo(String value) {
            addCriterion("battery =", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotEqualTo(String value) {
            addCriterion("battery <>", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThan(String value) {
            addCriterion("battery >", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryGreaterThanOrEqualTo(String value) {
            addCriterion("battery >=", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThan(String value) {
            addCriterion("battery <", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLessThanOrEqualTo(String value) {
            addCriterion("battery <=", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryLike(String value) {
            addCriterion("battery like", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotLike(String value) {
            addCriterion("battery not like", value, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryIn(List<String> values) {
            addCriterion("battery in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotIn(List<String> values) {
            addCriterion("battery not in", values, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryBetween(String value1, String value2) {
            addCriterion("battery between", value1, value2, "battery");
            return (Criteria) this;
        }

        public Criteria andBatteryNotBetween(String value1, String value2) {
            addCriterion("battery not between", value1, value2, "battery");
            return (Criteria) this;
        }

        public Criteria andCellipIsNull() {
            addCriterion("cellIp is null");
            return (Criteria) this;
        }

        public Criteria andCellipIsNotNull() {
            addCriterion("cellIp is not null");
            return (Criteria) this;
        }

        public Criteria andCellipEqualTo(String value) {
            addCriterion("cellIp =", value, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipNotEqualTo(String value) {
            addCriterion("cellIp <>", value, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipGreaterThan(String value) {
            addCriterion("cellIp >", value, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipGreaterThanOrEqualTo(String value) {
            addCriterion("cellIp >=", value, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipLessThan(String value) {
            addCriterion("cellIp <", value, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipLessThanOrEqualTo(String value) {
            addCriterion("cellIp <=", value, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipLike(String value) {
            addCriterion("cellIp like", value, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipNotLike(String value) {
            addCriterion("cellIp not like", value, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipIn(List<String> values) {
            addCriterion("cellIp in", values, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipNotIn(List<String> values) {
            addCriterion("cellIp not in", values, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipBetween(String value1, String value2) {
            addCriterion("cellIp between", value1, value2, "cellip");
            return (Criteria) this;
        }

        public Criteria andCellipNotBetween(String value1, String value2) {
            addCriterion("cellIp not between", value1, value2, "cellip");
            return (Criteria) this;
        }

        public Criteria andWifiipIsNull() {
            addCriterion("wifiIp is null");
            return (Criteria) this;
        }

        public Criteria andWifiipIsNotNull() {
            addCriterion("wifiIp is not null");
            return (Criteria) this;
        }

        public Criteria andWifiipEqualTo(String value) {
            addCriterion("wifiIp =", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipNotEqualTo(String value) {
            addCriterion("wifiIp <>", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipGreaterThan(String value) {
            addCriterion("wifiIp >", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipGreaterThanOrEqualTo(String value) {
            addCriterion("wifiIp >=", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipLessThan(String value) {
            addCriterion("wifiIp <", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipLessThanOrEqualTo(String value) {
            addCriterion("wifiIp <=", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipLike(String value) {
            addCriterion("wifiIp like", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipNotLike(String value) {
            addCriterion("wifiIp not like", value, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipIn(List<String> values) {
            addCriterion("wifiIp in", values, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipNotIn(List<String> values) {
            addCriterion("wifiIp not in", values, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipBetween(String value1, String value2) {
            addCriterion("wifiIp between", value1, value2, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifiipNotBetween(String value1, String value2) {
            addCriterion("wifiIp not between", value1, value2, "wifiip");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskIsNull() {
            addCriterion("wifiNetmask is null");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskIsNotNull() {
            addCriterion("wifiNetmask is not null");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskEqualTo(String value) {
            addCriterion("wifiNetmask =", value, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskNotEqualTo(String value) {
            addCriterion("wifiNetmask <>", value, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskGreaterThan(String value) {
            addCriterion("wifiNetmask >", value, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskGreaterThanOrEqualTo(String value) {
            addCriterion("wifiNetmask >=", value, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskLessThan(String value) {
            addCriterion("wifiNetmask <", value, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskLessThanOrEqualTo(String value) {
            addCriterion("wifiNetmask <=", value, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskLike(String value) {
            addCriterion("wifiNetmask like", value, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskNotLike(String value) {
            addCriterion("wifiNetmask not like", value, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskIn(List<String> values) {
            addCriterion("wifiNetmask in", values, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskNotIn(List<String> values) {
            addCriterion("wifiNetmask not in", values, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskBetween(String value1, String value2) {
            addCriterion("wifiNetmask between", value1, value2, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andWifinetmaskNotBetween(String value1, String value2) {
            addCriterion("wifiNetmask not between", value1, value2, "wifinetmask");
            return (Criteria) this;
        }

        public Criteria andVpnipIsNull() {
            addCriterion("vpnIp is null");
            return (Criteria) this;
        }

        public Criteria andVpnipIsNotNull() {
            addCriterion("vpnIp is not null");
            return (Criteria) this;
        }

        public Criteria andVpnipEqualTo(String value) {
            addCriterion("vpnIp =", value, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipNotEqualTo(String value) {
            addCriterion("vpnIp <>", value, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipGreaterThan(String value) {
            addCriterion("vpnIp >", value, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipGreaterThanOrEqualTo(String value) {
            addCriterion("vpnIp >=", value, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipLessThan(String value) {
            addCriterion("vpnIp <", value, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipLessThanOrEqualTo(String value) {
            addCriterion("vpnIp <=", value, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipLike(String value) {
            addCriterion("vpnIp like", value, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipNotLike(String value) {
            addCriterion("vpnIp not like", value, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipIn(List<String> values) {
            addCriterion("vpnIp in", values, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipNotIn(List<String> values) {
            addCriterion("vpnIp not in", values, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipBetween(String value1, String value2) {
            addCriterion("vpnIp between", value1, value2, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnipNotBetween(String value1, String value2) {
            addCriterion("vpnIp not between", value1, value2, "vpnip");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskIsNull() {
            addCriterion("vpnNetmask is null");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskIsNotNull() {
            addCriterion("vpnNetmask is not null");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskEqualTo(String value) {
            addCriterion("vpnNetmask =", value, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskNotEqualTo(String value) {
            addCriterion("vpnNetmask <>", value, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskGreaterThan(String value) {
            addCriterion("vpnNetmask >", value, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskGreaterThanOrEqualTo(String value) {
            addCriterion("vpnNetmask >=", value, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskLessThan(String value) {
            addCriterion("vpnNetmask <", value, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskLessThanOrEqualTo(String value) {
            addCriterion("vpnNetmask <=", value, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskLike(String value) {
            addCriterion("vpnNetmask like", value, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskNotLike(String value) {
            addCriterion("vpnNetmask not like", value, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskIn(List<String> values) {
            addCriterion("vpnNetmask in", values, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskNotIn(List<String> values) {
            addCriterion("vpnNetmask not in", values, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskBetween(String value1, String value2) {
            addCriterion("vpnNetmask between", value1, value2, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andVpnnetmaskNotBetween(String value1, String value2) {
            addCriterion("vpnNetmask not between", value1, value2, "vpnnetmask");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andNetworktypeIsNull() {
            addCriterion("networkType is null");
            return (Criteria) this;
        }

        public Criteria andNetworktypeIsNotNull() {
            addCriterion("networkType is not null");
            return (Criteria) this;
        }

        public Criteria andNetworktypeEqualTo(String value) {
            addCriterion("networkType =", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeNotEqualTo(String value) {
            addCriterion("networkType <>", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeGreaterThan(String value) {
            addCriterion("networkType >", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeGreaterThanOrEqualTo(String value) {
            addCriterion("networkType >=", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeLessThan(String value) {
            addCriterion("networkType <", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeLessThanOrEqualTo(String value) {
            addCriterion("networkType <=", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeLike(String value) {
            addCriterion("networkType like", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeNotLike(String value) {
            addCriterion("networkType not like", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeIn(List<String> values) {
            addCriterion("networkType in", values, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeNotIn(List<String> values) {
            addCriterion("networkType not in", values, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeBetween(String value1, String value2) {
            addCriterion("networkType between", value1, value2, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeNotBetween(String value1, String value2) {
            addCriterion("networkType not between", value1, value2, "networktype");
            return (Criteria) this;
        }

        public Criteria andSsidIsNull() {
            addCriterion("ssid is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("ssid is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(String value) {
            addCriterion("ssid =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(String value) {
            addCriterion("ssid <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(String value) {
            addCriterion("ssid >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(String value) {
            addCriterion("ssid >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(String value) {
            addCriterion("ssid <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(String value) {
            addCriterion("ssid <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLike(String value) {
            addCriterion("ssid like", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotLike(String value) {
            addCriterion("ssid not like", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<String> values) {
            addCriterion("ssid in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<String> values) {
            addCriterion("ssid not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(String value1, String value2) {
            addCriterion("ssid between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(String value1, String value2) {
            addCriterion("ssid not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andBssidIsNull() {
            addCriterion("bssid is null");
            return (Criteria) this;
        }

        public Criteria andBssidIsNotNull() {
            addCriterion("bssid is not null");
            return (Criteria) this;
        }

        public Criteria andBssidEqualTo(String value) {
            addCriterion("bssid =", value, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidNotEqualTo(String value) {
            addCriterion("bssid <>", value, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidGreaterThan(String value) {
            addCriterion("bssid >", value, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidGreaterThanOrEqualTo(String value) {
            addCriterion("bssid >=", value, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidLessThan(String value) {
            addCriterion("bssid <", value, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidLessThanOrEqualTo(String value) {
            addCriterion("bssid <=", value, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidLike(String value) {
            addCriterion("bssid like", value, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidNotLike(String value) {
            addCriterion("bssid not like", value, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidIn(List<String> values) {
            addCriterion("bssid in", values, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidNotIn(List<String> values) {
            addCriterion("bssid not in", values, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidBetween(String value1, String value2) {
            addCriterion("bssid between", value1, value2, "bssid");
            return (Criteria) this;
        }

        public Criteria andBssidNotBetween(String value1, String value2) {
            addCriterion("bssid not between", value1, value2, "bssid");
            return (Criteria) this;
        }

        public Criteria andProxytypeIsNull() {
            addCriterion("proxyType is null");
            return (Criteria) this;
        }

        public Criteria andProxytypeIsNotNull() {
            addCriterion("proxyType is not null");
            return (Criteria) this;
        }

        public Criteria andProxytypeEqualTo(String value) {
            addCriterion("proxyType =", value, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeNotEqualTo(String value) {
            addCriterion("proxyType <>", value, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeGreaterThan(String value) {
            addCriterion("proxyType >", value, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeGreaterThanOrEqualTo(String value) {
            addCriterion("proxyType >=", value, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeLessThan(String value) {
            addCriterion("proxyType <", value, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeLessThanOrEqualTo(String value) {
            addCriterion("proxyType <=", value, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeLike(String value) {
            addCriterion("proxyType like", value, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeNotLike(String value) {
            addCriterion("proxyType not like", value, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeIn(List<String> values) {
            addCriterion("proxyType in", values, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeNotIn(List<String> values) {
            addCriterion("proxyType not in", values, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeBetween(String value1, String value2) {
            addCriterion("proxyType between", value1, value2, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxytypeNotBetween(String value1, String value2) {
            addCriterion("proxyType not between", value1, value2, "proxytype");
            return (Criteria) this;
        }

        public Criteria andProxyurlIsNull() {
            addCriterion("proxyUrl is null");
            return (Criteria) this;
        }

        public Criteria andProxyurlIsNotNull() {
            addCriterion("proxyUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProxyurlEqualTo(String value) {
            addCriterion("proxyUrl =", value, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlNotEqualTo(String value) {
            addCriterion("proxyUrl <>", value, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlGreaterThan(String value) {
            addCriterion("proxyUrl >", value, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlGreaterThanOrEqualTo(String value) {
            addCriterion("proxyUrl >=", value, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlLessThan(String value) {
            addCriterion("proxyUrl <", value, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlLessThanOrEqualTo(String value) {
            addCriterion("proxyUrl <=", value, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlLike(String value) {
            addCriterion("proxyUrl like", value, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlNotLike(String value) {
            addCriterion("proxyUrl not like", value, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlIn(List<String> values) {
            addCriterion("proxyUrl in", values, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlNotIn(List<String> values) {
            addCriterion("proxyUrl not in", values, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlBetween(String value1, String value2) {
            addCriterion("proxyUrl between", value1, value2, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andProxyurlNotBetween(String value1, String value2) {
            addCriterion("proxyUrl not between", value1, value2, "proxyurl");
            return (Criteria) this;
        }

        public Criteria andDnsIsNull() {
            addCriterion("dns is null");
            return (Criteria) this;
        }

        public Criteria andDnsIsNotNull() {
            addCriterion("dns is not null");
            return (Criteria) this;
        }

        public Criteria andDnsEqualTo(String value) {
            addCriterion("dns =", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotEqualTo(String value) {
            addCriterion("dns <>", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsGreaterThan(String value) {
            addCriterion("dns >", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsGreaterThanOrEqualTo(String value) {
            addCriterion("dns >=", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLessThan(String value) {
            addCriterion("dns <", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLessThanOrEqualTo(String value) {
            addCriterion("dns <=", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsLike(String value) {
            addCriterion("dns like", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotLike(String value) {
            addCriterion("dns not like", value, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsIn(List<String> values) {
            addCriterion("dns in", values, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotIn(List<String> values) {
            addCriterion("dns not in", values, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsBetween(String value1, String value2) {
            addCriterion("dns between", value1, value2, "dns");
            return (Criteria) this;
        }

        public Criteria andDnsNotBetween(String value1, String value2) {
            addCriterion("dns not between", value1, value2, "dns");
            return (Criteria) this;
        }

        public Criteria andJailbreakIsNull() {
            addCriterion("jailbreak is null");
            return (Criteria) this;
        }

        public Criteria andJailbreakIsNotNull() {
            addCriterion("jailbreak is not null");
            return (Criteria) this;
        }

        public Criteria andJailbreakEqualTo(String value) {
            addCriterion("jailbreak =", value, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakNotEqualTo(String value) {
            addCriterion("jailbreak <>", value, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakGreaterThan(String value) {
            addCriterion("jailbreak >", value, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakGreaterThanOrEqualTo(String value) {
            addCriterion("jailbreak >=", value, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakLessThan(String value) {
            addCriterion("jailbreak <", value, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakLessThanOrEqualTo(String value) {
            addCriterion("jailbreak <=", value, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakLike(String value) {
            addCriterion("jailbreak like", value, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakNotLike(String value) {
            addCriterion("jailbreak not like", value, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakIn(List<String> values) {
            addCriterion("jailbreak in", values, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakNotIn(List<String> values) {
            addCriterion("jailbreak not in", values, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakBetween(String value1, String value2) {
            addCriterion("jailbreak between", value1, value2, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andJailbreakNotBetween(String value1, String value2) {
            addCriterion("jailbreak not between", value1, value2, "jailbreak");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andOsversionIsNull() {
            addCriterion("osVersion is null");
            return (Criteria) this;
        }

        public Criteria andOsversionIsNotNull() {
            addCriterion("osVersion is not null");
            return (Criteria) this;
        }

        public Criteria andOsversionEqualTo(String value) {
            addCriterion("osVersion =", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotEqualTo(String value) {
            addCriterion("osVersion <>", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionGreaterThan(String value) {
            addCriterion("osVersion >", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionGreaterThanOrEqualTo(String value) {
            addCriterion("osVersion >=", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLessThan(String value) {
            addCriterion("osVersion <", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLessThanOrEqualTo(String value) {
            addCriterion("osVersion <=", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLike(String value) {
            addCriterion("osVersion like", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotLike(String value) {
            addCriterion("osVersion not like", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionIn(List<String> values) {
            addCriterion("osVersion in", values, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotIn(List<String> values) {
            addCriterion("osVersion not in", values, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionBetween(String value1, String value2) {
            addCriterion("osVersion between", value1, value2, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotBetween(String value1, String value2) {
            addCriterion("osVersion not between", value1, value2, "osversion");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNull() {
            addCriterion("deviceName is null");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNotNull() {
            addCriterion("deviceName is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenameEqualTo(String value) {
            addCriterion("deviceName =", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotEqualTo(String value) {
            addCriterion("deviceName <>", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThan(String value) {
            addCriterion("deviceName >", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("deviceName >=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThan(String value) {
            addCriterion("deviceName <", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThanOrEqualTo(String value) {
            addCriterion("deviceName <=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLike(String value) {
            addCriterion("deviceName like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotLike(String value) {
            addCriterion("deviceName not like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameIn(List<String> values) {
            addCriterion("deviceName in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotIn(List<String> values) {
            addCriterion("deviceName not in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameBetween(String value1, String value2) {
            addCriterion("deviceName between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotBetween(String value1, String value2) {
            addCriterion("deviceName not between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNull() {
            addCriterion("carrier is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNotNull() {
            addCriterion("carrier is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierEqualTo(String value) {
            addCriterion("carrier =", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotEqualTo(String value) {
            addCriterion("carrier <>", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThan(String value) {
            addCriterion("carrier >", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThanOrEqualTo(String value) {
            addCriterion("carrier >=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThan(String value) {
            addCriterion("carrier <", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThanOrEqualTo(String value) {
            addCriterion("carrier <=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLike(String value) {
            addCriterion("carrier like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotLike(String value) {
            addCriterion("carrier not like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierIn(List<String> values) {
            addCriterion("carrier in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotIn(List<String> values) {
            addCriterion("carrier not in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierBetween(String value1, String value2) {
            addCriterion("carrier between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotBetween(String value1, String value2) {
            addCriterion("carrier not between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andCountryisoIsNull() {
            addCriterion("countryIso is null");
            return (Criteria) this;
        }

        public Criteria andCountryisoIsNotNull() {
            addCriterion("countryIso is not null");
            return (Criteria) this;
        }

        public Criteria andCountryisoEqualTo(String value) {
            addCriterion("countryIso =", value, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoNotEqualTo(String value) {
            addCriterion("countryIso <>", value, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoGreaterThan(String value) {
            addCriterion("countryIso >", value, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoGreaterThanOrEqualTo(String value) {
            addCriterion("countryIso >=", value, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoLessThan(String value) {
            addCriterion("countryIso <", value, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoLessThanOrEqualTo(String value) {
            addCriterion("countryIso <=", value, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoLike(String value) {
            addCriterion("countryIso like", value, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoNotLike(String value) {
            addCriterion("countryIso not like", value, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoIn(List<String> values) {
            addCriterion("countryIso in", values, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoNotIn(List<String> values) {
            addCriterion("countryIso not in", values, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoBetween(String value1, String value2) {
            addCriterion("countryIso between", value1, value2, "countryiso");
            return (Criteria) this;
        }

        public Criteria andCountryisoNotBetween(String value1, String value2) {
            addCriterion("countryIso not between", value1, value2, "countryiso");
            return (Criteria) this;
        }

        public Criteria andMccIsNull() {
            addCriterion("mcc is null");
            return (Criteria) this;
        }

        public Criteria andMccIsNotNull() {
            addCriterion("mcc is not null");
            return (Criteria) this;
        }

        public Criteria andMccEqualTo(String value) {
            addCriterion("mcc =", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotEqualTo(String value) {
            addCriterion("mcc <>", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThan(String value) {
            addCriterion("mcc >", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThanOrEqualTo(String value) {
            addCriterion("mcc >=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThan(String value) {
            addCriterion("mcc <", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThanOrEqualTo(String value) {
            addCriterion("mcc <=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLike(String value) {
            addCriterion("mcc like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotLike(String value) {
            addCriterion("mcc not like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccIn(List<String> values) {
            addCriterion("mcc in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotIn(List<String> values) {
            addCriterion("mcc not in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccBetween(String value1, String value2) {
            addCriterion("mcc between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotBetween(String value1, String value2) {
            addCriterion("mcc not between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMncIsNull() {
            addCriterion("mnc is null");
            return (Criteria) this;
        }

        public Criteria andMncIsNotNull() {
            addCriterion("mnc is not null");
            return (Criteria) this;
        }

        public Criteria andMncEqualTo(String value) {
            addCriterion("mnc =", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotEqualTo(String value) {
            addCriterion("mnc <>", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncGreaterThan(String value) {
            addCriterion("mnc >", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncGreaterThanOrEqualTo(String value) {
            addCriterion("mnc >=", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLessThan(String value) {
            addCriterion("mnc <", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLessThanOrEqualTo(String value) {
            addCriterion("mnc <=", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLike(String value) {
            addCriterion("mnc like", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotLike(String value) {
            addCriterion("mnc not like", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncIn(List<String> values) {
            addCriterion("mnc in", values, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotIn(List<String> values) {
            addCriterion("mnc not in", values, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncBetween(String value1, String value2) {
            addCriterion("mnc between", value1, value2, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotBetween(String value1, String value2) {
            addCriterion("mnc not between", value1, value2, "mnc");
            return (Criteria) this;
        }

        public Criteria andBundleidIsNull() {
            addCriterion("bundleId is null");
            return (Criteria) this;
        }

        public Criteria andBundleidIsNotNull() {
            addCriterion("bundleId is not null");
            return (Criteria) this;
        }

        public Criteria andBundleidEqualTo(String value) {
            addCriterion("bundleId =", value, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidNotEqualTo(String value) {
            addCriterion("bundleId <>", value, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidGreaterThan(String value) {
            addCriterion("bundleId >", value, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidGreaterThanOrEqualTo(String value) {
            addCriterion("bundleId >=", value, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidLessThan(String value) {
            addCriterion("bundleId <", value, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidLessThanOrEqualTo(String value) {
            addCriterion("bundleId <=", value, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidLike(String value) {
            addCriterion("bundleId like", value, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidNotLike(String value) {
            addCriterion("bundleId not like", value, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidIn(List<String> values) {
            addCriterion("bundleId in", values, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidNotIn(List<String> values) {
            addCriterion("bundleId not in", values, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidBetween(String value1, String value2) {
            addCriterion("bundleId between", value1, value2, "bundleid");
            return (Criteria) this;
        }

        public Criteria andBundleidNotBetween(String value1, String value2) {
            addCriterion("bundleId not between", value1, value2, "bundleid");
            return (Criteria) this;
        }

        public Criteria andLanguagesIsNull() {
            addCriterion("languages is null");
            return (Criteria) this;
        }

        public Criteria andLanguagesIsNotNull() {
            addCriterion("languages is not null");
            return (Criteria) this;
        }

        public Criteria andLanguagesEqualTo(String value) {
            addCriterion("languages =", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotEqualTo(String value) {
            addCriterion("languages <>", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesGreaterThan(String value) {
            addCriterion("languages >", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesGreaterThanOrEqualTo(String value) {
            addCriterion("languages >=", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesLessThan(String value) {
            addCriterion("languages <", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesLessThanOrEqualTo(String value) {
            addCriterion("languages <=", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesLike(String value) {
            addCriterion("languages like", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotLike(String value) {
            addCriterion("languages not like", value, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesIn(List<String> values) {
            addCriterion("languages in", values, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotIn(List<String> values) {
            addCriterion("languages not in", values, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesBetween(String value1, String value2) {
            addCriterion("languages between", value1, value2, "languages");
            return (Criteria) this;
        }

        public Criteria andLanguagesNotBetween(String value1, String value2) {
            addCriterion("languages not between", value1, value2, "languages");
            return (Criteria) this;
        }

        public Criteria andTrueipIsNull() {
            addCriterion("trueIp is null");
            return (Criteria) this;
        }

        public Criteria andTrueipIsNotNull() {
            addCriterion("trueIp is not null");
            return (Criteria) this;
        }

        public Criteria andTrueipEqualTo(String value) {
            addCriterion("trueIp =", value, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipNotEqualTo(String value) {
            addCriterion("trueIp <>", value, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipGreaterThan(String value) {
            addCriterion("trueIp >", value, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipGreaterThanOrEqualTo(String value) {
            addCriterion("trueIp >=", value, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipLessThan(String value) {
            addCriterion("trueIp <", value, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipLessThanOrEqualTo(String value) {
            addCriterion("trueIp <=", value, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipLike(String value) {
            addCriterion("trueIp like", value, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipNotLike(String value) {
            addCriterion("trueIp not like", value, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipIn(List<String> values) {
            addCriterion("trueIp in", values, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipNotIn(List<String> values) {
            addCriterion("trueIp not in", values, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipBetween(String value1, String value2) {
            addCriterion("trueIp between", value1, value2, "trueip");
            return (Criteria) this;
        }

        public Criteria andTrueipNotBetween(String value1, String value2) {
            addCriterion("trueIp not between", value1, value2, "trueip");
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