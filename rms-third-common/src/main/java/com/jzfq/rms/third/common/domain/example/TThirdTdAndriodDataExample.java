package com.jzfq.rms.third.common.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TThirdTdAndriodDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TThirdTdAndriodDataExample() {
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

        public Criteria andCFmversionIsNull() {
            addCriterion("c_fmVersion is null");
            return (Criteria) this;
        }

        public Criteria andCFmversionIsNotNull() {
            addCriterion("c_fmVersion is not null");
            return (Criteria) this;
        }

        public Criteria andCFmversionEqualTo(String value) {
            addCriterion("c_fmVersion =", value, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionNotEqualTo(String value) {
            addCriterion("c_fmVersion <>", value, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionGreaterThan(String value) {
            addCriterion("c_fmVersion >", value, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionGreaterThanOrEqualTo(String value) {
            addCriterion("c_fmVersion >=", value, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionLessThan(String value) {
            addCriterion("c_fmVersion <", value, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionLessThanOrEqualTo(String value) {
            addCriterion("c_fmVersion <=", value, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionLike(String value) {
            addCriterion("c_fmVersion like", value, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionNotLike(String value) {
            addCriterion("c_fmVersion not like", value, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionIn(List<String> values) {
            addCriterion("c_fmVersion in", values, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionNotIn(List<String> values) {
            addCriterion("c_fmVersion not in", values, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionBetween(String value1, String value2) {
            addCriterion("c_fmVersion between", value1, value2, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCFmversionNotBetween(String value1, String value2) {
            addCriterion("c_fmVersion not between", value1, value2, "cFmversion");
            return (Criteria) this;
        }

        public Criteria andCSessionidIsNull() {
            addCriterion("c_sessionId is null");
            return (Criteria) this;
        }

        public Criteria andCSessionidIsNotNull() {
            addCriterion("c_sessionId is not null");
            return (Criteria) this;
        }

        public Criteria andCSessionidEqualTo(String value) {
            addCriterion("c_sessionId =", value, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidNotEqualTo(String value) {
            addCriterion("c_sessionId <>", value, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidGreaterThan(String value) {
            addCriterion("c_sessionId >", value, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidGreaterThanOrEqualTo(String value) {
            addCriterion("c_sessionId >=", value, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidLessThan(String value) {
            addCriterion("c_sessionId <", value, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidLessThanOrEqualTo(String value) {
            addCriterion("c_sessionId <=", value, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidLike(String value) {
            addCriterion("c_sessionId like", value, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidNotLike(String value) {
            addCriterion("c_sessionId not like", value, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidIn(List<String> values) {
            addCriterion("c_sessionId in", values, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidNotIn(List<String> values) {
            addCriterion("c_sessionId not in", values, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidBetween(String value1, String value2) {
            addCriterion("c_sessionId between", value1, value2, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCSessionidNotBetween(String value1, String value2) {
            addCriterion("c_sessionId not between", value1, value2, "cSessionid");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdIsNull() {
            addCriterion("c_device_id is null");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdIsNotNull() {
            addCriterion("c_device_id is not null");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdEqualTo(String value) {
            addCriterion("c_device_id =", value, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdNotEqualTo(String value) {
            addCriterion("c_device_id <>", value, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdGreaterThan(String value) {
            addCriterion("c_device_id >", value, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_device_id >=", value, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdLessThan(String value) {
            addCriterion("c_device_id <", value, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("c_device_id <=", value, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdLike(String value) {
            addCriterion("c_device_id like", value, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdNotLike(String value) {
            addCriterion("c_device_id not like", value, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdIn(List<String> values) {
            addCriterion("c_device_id in", values, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdNotIn(List<String> values) {
            addCriterion("c_device_id not in", values, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdBetween(String value1, String value2) {
            addCriterion("c_device_id between", value1, value2, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCDeviceIdNotBetween(String value1, String value2) {
            addCriterion("c_device_id not between", value1, value2, "cDeviceId");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeIsNull() {
            addCriterion("c_active_time is null");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeIsNotNull() {
            addCriterion("c_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeEqualTo(String value) {
            addCriterion("c_active_time =", value, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeNotEqualTo(String value) {
            addCriterion("c_active_time <>", value, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeGreaterThan(String value) {
            addCriterion("c_active_time >", value, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_active_time >=", value, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeLessThan(String value) {
            addCriterion("c_active_time <", value, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeLessThanOrEqualTo(String value) {
            addCriterion("c_active_time <=", value, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeLike(String value) {
            addCriterion("c_active_time like", value, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeNotLike(String value) {
            addCriterion("c_active_time not like", value, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeIn(List<String> values) {
            addCriterion("c_active_time in", values, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeNotIn(List<String> values) {
            addCriterion("c_active_time not in", values, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeBetween(String value1, String value2) {
            addCriterion("c_active_time between", value1, value2, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCActiveTimeNotBetween(String value1, String value2) {
            addCriterion("c_active_time not between", value1, value2, "cActiveTime");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryIsNull() {
            addCriterion("c_available_memery is null");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryIsNotNull() {
            addCriterion("c_available_memery is not null");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryEqualTo(String value) {
            addCriterion("c_available_memery =", value, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryNotEqualTo(String value) {
            addCriterion("c_available_memery <>", value, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryGreaterThan(String value) {
            addCriterion("c_available_memery >", value, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryGreaterThanOrEqualTo(String value) {
            addCriterion("c_available_memery >=", value, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryLessThan(String value) {
            addCriterion("c_available_memery <", value, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryLessThanOrEqualTo(String value) {
            addCriterion("c_available_memery <=", value, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryLike(String value) {
            addCriterion("c_available_memery like", value, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryNotLike(String value) {
            addCriterion("c_available_memery not like", value, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryIn(List<String> values) {
            addCriterion("c_available_memery in", values, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryNotIn(List<String> values) {
            addCriterion("c_available_memery not in", values, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryBetween(String value1, String value2) {
            addCriterion("c_available_memery between", value1, value2, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableMemeryNotBetween(String value1, String value2) {
            addCriterion("c_available_memery not between", value1, value2, "cAvailableMemery");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageIsNull() {
            addCriterion("c_available_storage is null");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageIsNotNull() {
            addCriterion("c_available_storage is not null");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageEqualTo(String value) {
            addCriterion("c_available_storage =", value, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageNotEqualTo(String value) {
            addCriterion("c_available_storage <>", value, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageGreaterThan(String value) {
            addCriterion("c_available_storage >", value, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageGreaterThanOrEqualTo(String value) {
            addCriterion("c_available_storage >=", value, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageLessThan(String value) {
            addCriterion("c_available_storage <", value, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageLessThanOrEqualTo(String value) {
            addCriterion("c_available_storage <=", value, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageLike(String value) {
            addCriterion("c_available_storage like", value, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageNotLike(String value) {
            addCriterion("c_available_storage not like", value, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageIn(List<String> values) {
            addCriterion("c_available_storage in", values, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageNotIn(List<String> values) {
            addCriterion("c_available_storage not in", values, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageBetween(String value1, String value2) {
            addCriterion("c_available_storage between", value1, value2, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCAvailableStorageNotBetween(String value1, String value2) {
            addCriterion("c_available_storage not between", value1, value2, "cAvailableStorage");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionIsNull() {
            addCriterion("c_baseband_version is null");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionIsNotNull() {
            addCriterion("c_baseband_version is not null");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionEqualTo(String value) {
            addCriterion("c_baseband_version =", value, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionNotEqualTo(String value) {
            addCriterion("c_baseband_version <>", value, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionGreaterThan(String value) {
            addCriterion("c_baseband_version >", value, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionGreaterThanOrEqualTo(String value) {
            addCriterion("c_baseband_version >=", value, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionLessThan(String value) {
            addCriterion("c_baseband_version <", value, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionLessThanOrEqualTo(String value) {
            addCriterion("c_baseband_version <=", value, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionLike(String value) {
            addCriterion("c_baseband_version like", value, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionNotLike(String value) {
            addCriterion("c_baseband_version not like", value, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionIn(List<String> values) {
            addCriterion("c_baseband_version in", values, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionNotIn(List<String> values) {
            addCriterion("c_baseband_version not in", values, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionBetween(String value1, String value2) {
            addCriterion("c_baseband_version between", value1, value2, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBasebandVersionNotBetween(String value1, String value2) {
            addCriterion("c_baseband_version not between", value1, value2, "cBasebandVersion");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelIsNull() {
            addCriterion("c_battery_level is null");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelIsNotNull() {
            addCriterion("c_battery_level is not null");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelEqualTo(String value) {
            addCriterion("c_battery_level =", value, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelNotEqualTo(String value) {
            addCriterion("c_battery_level <>", value, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelGreaterThan(String value) {
            addCriterion("c_battery_level >", value, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelGreaterThanOrEqualTo(String value) {
            addCriterion("c_battery_level >=", value, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelLessThan(String value) {
            addCriterion("c_battery_level <", value, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelLessThanOrEqualTo(String value) {
            addCriterion("c_battery_level <=", value, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelLike(String value) {
            addCriterion("c_battery_level like", value, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelNotLike(String value) {
            addCriterion("c_battery_level not like", value, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelIn(List<String> values) {
            addCriterion("c_battery_level in", values, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelNotIn(List<String> values) {
            addCriterion("c_battery_level not in", values, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelBetween(String value1, String value2) {
            addCriterion("c_battery_level between", value1, value2, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryLevelNotBetween(String value1, String value2) {
            addCriterion("c_battery_level not between", value1, value2, "cBatteryLevel");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusIsNull() {
            addCriterion("c_battery_status is null");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusIsNotNull() {
            addCriterion("c_battery_status is not null");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusEqualTo(String value) {
            addCriterion("c_battery_status =", value, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusNotEqualTo(String value) {
            addCriterion("c_battery_status <>", value, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusGreaterThan(String value) {
            addCriterion("c_battery_status >", value, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("c_battery_status >=", value, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusLessThan(String value) {
            addCriterion("c_battery_status <", value, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusLessThanOrEqualTo(String value) {
            addCriterion("c_battery_status <=", value, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusLike(String value) {
            addCriterion("c_battery_status like", value, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusNotLike(String value) {
            addCriterion("c_battery_status not like", value, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusIn(List<String> values) {
            addCriterion("c_battery_status in", values, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusNotIn(List<String> values) {
            addCriterion("c_battery_status not in", values, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusBetween(String value1, String value2) {
            addCriterion("c_battery_status between", value1, value2, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBatteryStatusNotBetween(String value1, String value2) {
            addCriterion("c_battery_status not between", value1, value2, "cBatteryStatus");
            return (Criteria) this;
        }

        public Criteria andCBlueMacIsNull() {
            addCriterion("c_blue_mac is null");
            return (Criteria) this;
        }

        public Criteria andCBlueMacIsNotNull() {
            addCriterion("c_blue_mac is not null");
            return (Criteria) this;
        }

        public Criteria andCBlueMacEqualTo(String value) {
            addCriterion("c_blue_mac =", value, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacNotEqualTo(String value) {
            addCriterion("c_blue_mac <>", value, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacGreaterThan(String value) {
            addCriterion("c_blue_mac >", value, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacGreaterThanOrEqualTo(String value) {
            addCriterion("c_blue_mac >=", value, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacLessThan(String value) {
            addCriterion("c_blue_mac <", value, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacLessThanOrEqualTo(String value) {
            addCriterion("c_blue_mac <=", value, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacLike(String value) {
            addCriterion("c_blue_mac like", value, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacNotLike(String value) {
            addCriterion("c_blue_mac not like", value, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacIn(List<String> values) {
            addCriterion("c_blue_mac in", values, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacNotIn(List<String> values) {
            addCriterion("c_blue_mac not in", values, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacBetween(String value1, String value2) {
            addCriterion("c_blue_mac between", value1, value2, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBlueMacNotBetween(String value1, String value2) {
            addCriterion("c_blue_mac not between", value1, value2, "cBlueMac");
            return (Criteria) this;
        }

        public Criteria andCBootTimeIsNull() {
            addCriterion("c_boot_time is null");
            return (Criteria) this;
        }

        public Criteria andCBootTimeIsNotNull() {
            addCriterion("c_boot_time is not null");
            return (Criteria) this;
        }

        public Criteria andCBootTimeEqualTo(String value) {
            addCriterion("c_boot_time =", value, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeNotEqualTo(String value) {
            addCriterion("c_boot_time <>", value, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeGreaterThan(String value) {
            addCriterion("c_boot_time >", value, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_boot_time >=", value, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeLessThan(String value) {
            addCriterion("c_boot_time <", value, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeLessThanOrEqualTo(String value) {
            addCriterion("c_boot_time <=", value, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeLike(String value) {
            addCriterion("c_boot_time like", value, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeNotLike(String value) {
            addCriterion("c_boot_time not like", value, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeIn(List<String> values) {
            addCriterion("c_boot_time in", values, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeNotIn(List<String> values) {
            addCriterion("c_boot_time not in", values, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeBetween(String value1, String value2) {
            addCriterion("c_boot_time between", value1, value2, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBootTimeNotBetween(String value1, String value2) {
            addCriterion("c_boot_time not between", value1, value2, "cBootTime");
            return (Criteria) this;
        }

        public Criteria andCBrandIsNull() {
            addCriterion("c_brand is null");
            return (Criteria) this;
        }

        public Criteria andCBrandIsNotNull() {
            addCriterion("c_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCBrandEqualTo(String value) {
            addCriterion("c_brand =", value, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandNotEqualTo(String value) {
            addCriterion("c_brand <>", value, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandGreaterThan(String value) {
            addCriterion("c_brand >", value, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandGreaterThanOrEqualTo(String value) {
            addCriterion("c_brand >=", value, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandLessThan(String value) {
            addCriterion("c_brand <", value, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandLessThanOrEqualTo(String value) {
            addCriterion("c_brand <=", value, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandLike(String value) {
            addCriterion("c_brand like", value, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandNotLike(String value) {
            addCriterion("c_brand not like", value, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandIn(List<String> values) {
            addCriterion("c_brand in", values, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandNotIn(List<String> values) {
            addCriterion("c_brand not in", values, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandBetween(String value1, String value2) {
            addCriterion("c_brand between", value1, value2, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCBrandNotBetween(String value1, String value2) {
            addCriterion("c_brand not between", value1, value2, "cBrand");
            return (Criteria) this;
        }

        public Criteria andCCarrierIsNull() {
            addCriterion("c_carrier is null");
            return (Criteria) this;
        }

        public Criteria andCCarrierIsNotNull() {
            addCriterion("c_carrier is not null");
            return (Criteria) this;
        }

        public Criteria andCCarrierEqualTo(String value) {
            addCriterion("c_carrier =", value, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierNotEqualTo(String value) {
            addCriterion("c_carrier <>", value, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierGreaterThan(String value) {
            addCriterion("c_carrier >", value, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierGreaterThanOrEqualTo(String value) {
            addCriterion("c_carrier >=", value, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierLessThan(String value) {
            addCriterion("c_carrier <", value, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierLessThanOrEqualTo(String value) {
            addCriterion("c_carrier <=", value, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierLike(String value) {
            addCriterion("c_carrier like", value, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierNotLike(String value) {
            addCriterion("c_carrier not like", value, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierIn(List<String> values) {
            addCriterion("c_carrier in", values, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierNotIn(List<String> values) {
            addCriterion("c_carrier not in", values, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierBetween(String value1, String value2) {
            addCriterion("c_carrier between", value1, value2, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCarrierNotBetween(String value1, String value2) {
            addCriterion("c_carrier not between", value1, value2, "cCarrier");
            return (Criteria) this;
        }

        public Criteria andCCellIpIsNull() {
            addCriterion("c_cell_ip is null");
            return (Criteria) this;
        }

        public Criteria andCCellIpIsNotNull() {
            addCriterion("c_cell_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCCellIpEqualTo(String value) {
            addCriterion("c_cell_ip =", value, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpNotEqualTo(String value) {
            addCriterion("c_cell_ip <>", value, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpGreaterThan(String value) {
            addCriterion("c_cell_ip >", value, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpGreaterThanOrEqualTo(String value) {
            addCriterion("c_cell_ip >=", value, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpLessThan(String value) {
            addCriterion("c_cell_ip <", value, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpLessThanOrEqualTo(String value) {
            addCriterion("c_cell_ip <=", value, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpLike(String value) {
            addCriterion("c_cell_ip like", value, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpNotLike(String value) {
            addCriterion("c_cell_ip not like", value, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpIn(List<String> values) {
            addCriterion("c_cell_ip in", values, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpNotIn(List<String> values) {
            addCriterion("c_cell_ip not in", values, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpBetween(String value1, String value2) {
            addCriterion("c_cell_ip between", value1, value2, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellIpNotBetween(String value1, String value2) {
            addCriterion("c_cell_ip not between", value1, value2, "cCellIp");
            return (Criteria) this;
        }

        public Criteria andCCellLocationIsNull() {
            addCriterion("c_cell_location is null");
            return (Criteria) this;
        }

        public Criteria andCCellLocationIsNotNull() {
            addCriterion("c_cell_location is not null");
            return (Criteria) this;
        }

        public Criteria andCCellLocationEqualTo(String value) {
            addCriterion("c_cell_location =", value, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationNotEqualTo(String value) {
            addCriterion("c_cell_location <>", value, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationGreaterThan(String value) {
            addCriterion("c_cell_location >", value, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationGreaterThanOrEqualTo(String value) {
            addCriterion("c_cell_location >=", value, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationLessThan(String value) {
            addCriterion("c_cell_location <", value, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationLessThanOrEqualTo(String value) {
            addCriterion("c_cell_location <=", value, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationLike(String value) {
            addCriterion("c_cell_location like", value, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationNotLike(String value) {
            addCriterion("c_cell_location not like", value, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationIn(List<String> values) {
            addCriterion("c_cell_location in", values, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationNotIn(List<String> values) {
            addCriterion("c_cell_location not in", values, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationBetween(String value1, String value2) {
            addCriterion("c_cell_location between", value1, value2, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCellLocationNotBetween(String value1, String value2) {
            addCriterion("c_cell_location not between", value1, value2, "cCellLocation");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoIsNull() {
            addCriterion("c_country_iso is null");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoIsNotNull() {
            addCriterion("c_country_iso is not null");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoEqualTo(String value) {
            addCriterion("c_country_iso =", value, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoNotEqualTo(String value) {
            addCriterion("c_country_iso <>", value, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoGreaterThan(String value) {
            addCriterion("c_country_iso >", value, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoGreaterThanOrEqualTo(String value) {
            addCriterion("c_country_iso >=", value, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoLessThan(String value) {
            addCriterion("c_country_iso <", value, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoLessThanOrEqualTo(String value) {
            addCriterion("c_country_iso <=", value, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoLike(String value) {
            addCriterion("c_country_iso like", value, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoNotLike(String value) {
            addCriterion("c_country_iso not like", value, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoIn(List<String> values) {
            addCriterion("c_country_iso in", values, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoNotIn(List<String> values) {
            addCriterion("c_country_iso not in", values, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoBetween(String value1, String value2) {
            addCriterion("c_country_iso between", value1, value2, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCountryIsoNotBetween(String value1, String value2) {
            addCriterion("c_country_iso not between", value1, value2, "cCountryIso");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareIsNull() {
            addCriterion("c_cpuHardware is null");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareIsNotNull() {
            addCriterion("c_cpuHardware is not null");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareEqualTo(String value) {
            addCriterion("c_cpuHardware =", value, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareNotEqualTo(String value) {
            addCriterion("c_cpuHardware <>", value, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareGreaterThan(String value) {
            addCriterion("c_cpuHardware >", value, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareGreaterThanOrEqualTo(String value) {
            addCriterion("c_cpuHardware >=", value, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareLessThan(String value) {
            addCriterion("c_cpuHardware <", value, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareLessThanOrEqualTo(String value) {
            addCriterion("c_cpuHardware <=", value, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareLike(String value) {
            addCriterion("c_cpuHardware like", value, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareNotLike(String value) {
            addCriterion("c_cpuHardware not like", value, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareIn(List<String> values) {
            addCriterion("c_cpuHardware in", values, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareNotIn(List<String> values) {
            addCriterion("c_cpuHardware not in", values, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareBetween(String value1, String value2) {
            addCriterion("c_cpuHardware between", value1, value2, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuhardwareNotBetween(String value1, String value2) {
            addCriterion("c_cpuHardware not between", value1, value2, "cCpuhardware");
            return (Criteria) this;
        }

        public Criteria andCCpuserialIsNull() {
            addCriterion("c_cpuSerial is null");
            return (Criteria) this;
        }

        public Criteria andCCpuserialIsNotNull() {
            addCriterion("c_cpuSerial is not null");
            return (Criteria) this;
        }

        public Criteria andCCpuserialEqualTo(String value) {
            addCriterion("c_cpuSerial =", value, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialNotEqualTo(String value) {
            addCriterion("c_cpuSerial <>", value, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialGreaterThan(String value) {
            addCriterion("c_cpuSerial >", value, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialGreaterThanOrEqualTo(String value) {
            addCriterion("c_cpuSerial >=", value, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialLessThan(String value) {
            addCriterion("c_cpuSerial <", value, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialLessThanOrEqualTo(String value) {
            addCriterion("c_cpuSerial <=", value, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialLike(String value) {
            addCriterion("c_cpuSerial like", value, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialNotLike(String value) {
            addCriterion("c_cpuSerial not like", value, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialIn(List<String> values) {
            addCriterion("c_cpuSerial in", values, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialNotIn(List<String> values) {
            addCriterion("c_cpuSerial not in", values, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialBetween(String value1, String value2) {
            addCriterion("c_cpuSerial between", value1, value2, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuserialNotBetween(String value1, String value2) {
            addCriterion("c_cpuSerial not between", value1, value2, "cCpuserial");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedIsNull() {
            addCriterion("c_cpuSpeed is null");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedIsNotNull() {
            addCriterion("c_cpuSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedEqualTo(String value) {
            addCriterion("c_cpuSpeed =", value, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedNotEqualTo(String value) {
            addCriterion("c_cpuSpeed <>", value, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedGreaterThan(String value) {
            addCriterion("c_cpuSpeed >", value, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedGreaterThanOrEqualTo(String value) {
            addCriterion("c_cpuSpeed >=", value, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedLessThan(String value) {
            addCriterion("c_cpuSpeed <", value, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedLessThanOrEqualTo(String value) {
            addCriterion("c_cpuSpeed <=", value, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedLike(String value) {
            addCriterion("c_cpuSpeed like", value, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedNotLike(String value) {
            addCriterion("c_cpuSpeed not like", value, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedIn(List<String> values) {
            addCriterion("c_cpuSpeed in", values, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedNotIn(List<String> values) {
            addCriterion("c_cpuSpeed not in", values, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedBetween(String value1, String value2) {
            addCriterion("c_cpuSpeed between", value1, value2, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCpuspeedNotBetween(String value1, String value2) {
            addCriterion("c_cpuSpeed not between", value1, value2, "cCpuspeed");
            return (Criteria) this;
        }

        public Criteria andCCputypeIsNull() {
            addCriterion("c_cpuType is null");
            return (Criteria) this;
        }

        public Criteria andCCputypeIsNotNull() {
            addCriterion("c_cpuType is not null");
            return (Criteria) this;
        }

        public Criteria andCCputypeEqualTo(String value) {
            addCriterion("c_cpuType =", value, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeNotEqualTo(String value) {
            addCriterion("c_cpuType <>", value, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeGreaterThan(String value) {
            addCriterion("c_cpuType >", value, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_cpuType >=", value, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeLessThan(String value) {
            addCriterion("c_cpuType <", value, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeLessThanOrEqualTo(String value) {
            addCriterion("c_cpuType <=", value, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeLike(String value) {
            addCriterion("c_cpuType like", value, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeNotLike(String value) {
            addCriterion("c_cpuType not like", value, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeIn(List<String> values) {
            addCriterion("c_cpuType in", values, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeNotIn(List<String> values) {
            addCriterion("c_cpuType not in", values, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeBetween(String value1, String value2) {
            addCriterion("c_cpuType between", value1, value2, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCCputypeNotBetween(String value1, String value2) {
            addCriterion("c_cpuType not between", value1, value2, "cCputype");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigIsNull() {
            addCriterion("c_deviceConfig is null");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigIsNotNull() {
            addCriterion("c_deviceConfig is not null");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigEqualTo(String value) {
            addCriterion("c_deviceConfig =", value, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigNotEqualTo(String value) {
            addCriterion("c_deviceConfig <>", value, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigGreaterThan(String value) {
            addCriterion("c_deviceConfig >", value, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigGreaterThanOrEqualTo(String value) {
            addCriterion("c_deviceConfig >=", value, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigLessThan(String value) {
            addCriterion("c_deviceConfig <", value, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigLessThanOrEqualTo(String value) {
            addCriterion("c_deviceConfig <=", value, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigLike(String value) {
            addCriterion("c_deviceConfig like", value, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigNotLike(String value) {
            addCriterion("c_deviceConfig not like", value, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigIn(List<String> values) {
            addCriterion("c_deviceConfig in", values, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigNotIn(List<String> values) {
            addCriterion("c_deviceConfig not in", values, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigBetween(String value1, String value2) {
            addCriterion("c_deviceConfig between", value1, value2, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDeviceconfigNotBetween(String value1, String value2) {
            addCriterion("c_deviceConfig not between", value1, value2, "cDeviceconfig");
            return (Criteria) this;
        }

        public Criteria andCDevicenameIsNull() {
            addCriterion("c_deviceName is null");
            return (Criteria) this;
        }

        public Criteria andCDevicenameIsNotNull() {
            addCriterion("c_deviceName is not null");
            return (Criteria) this;
        }

        public Criteria andCDevicenameEqualTo(String value) {
            addCriterion("c_deviceName =", value, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameNotEqualTo(String value) {
            addCriterion("c_deviceName <>", value, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameGreaterThan(String value) {
            addCriterion("c_deviceName >", value, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("c_deviceName >=", value, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameLessThan(String value) {
            addCriterion("c_deviceName <", value, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameLessThanOrEqualTo(String value) {
            addCriterion("c_deviceName <=", value, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameLike(String value) {
            addCriterion("c_deviceName like", value, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameNotLike(String value) {
            addCriterion("c_deviceName not like", value, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameIn(List<String> values) {
            addCriterion("c_deviceName in", values, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameNotIn(List<String> values) {
            addCriterion("c_deviceName not in", values, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameBetween(String value1, String value2) {
            addCriterion("c_deviceName between", value1, value2, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDevicenameNotBetween(String value1, String value2) {
            addCriterion("c_deviceName not between", value1, value2, "cDevicename");
            return (Criteria) this;
        }

        public Criteria andCDisplayIsNull() {
            addCriterion("c_display is null");
            return (Criteria) this;
        }

        public Criteria andCDisplayIsNotNull() {
            addCriterion("c_display is not null");
            return (Criteria) this;
        }

        public Criteria andCDisplayEqualTo(String value) {
            addCriterion("c_display =", value, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayNotEqualTo(String value) {
            addCriterion("c_display <>", value, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayGreaterThan(String value) {
            addCriterion("c_display >", value, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("c_display >=", value, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayLessThan(String value) {
            addCriterion("c_display <", value, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayLessThanOrEqualTo(String value) {
            addCriterion("c_display <=", value, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayLike(String value) {
            addCriterion("c_display like", value, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayNotLike(String value) {
            addCriterion("c_display not like", value, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayIn(List<String> values) {
            addCriterion("c_display in", values, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayNotIn(List<String> values) {
            addCriterion("c_display not in", values, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayBetween(String value1, String value2) {
            addCriterion("c_display between", value1, value2, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDisplayNotBetween(String value1, String value2) {
            addCriterion("c_display not between", value1, value2, "cDisplay");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressIsNull() {
            addCriterion("c_dnsAddress is null");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressIsNotNull() {
            addCriterion("c_dnsAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressEqualTo(String value) {
            addCriterion("c_dnsAddress =", value, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressNotEqualTo(String value) {
            addCriterion("c_dnsAddress <>", value, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressGreaterThan(String value) {
            addCriterion("c_dnsAddress >", value, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_dnsAddress >=", value, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressLessThan(String value) {
            addCriterion("c_dnsAddress <", value, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressLessThanOrEqualTo(String value) {
            addCriterion("c_dnsAddress <=", value, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressLike(String value) {
            addCriterion("c_dnsAddress like", value, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressNotLike(String value) {
            addCriterion("c_dnsAddress not like", value, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressIn(List<String> values) {
            addCriterion("c_dnsAddress in", values, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressNotIn(List<String> values) {
            addCriterion("c_dnsAddress not in", values, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressBetween(String value1, String value2) {
            addCriterion("c_dnsAddress between", value1, value2, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCDnsaddressNotBetween(String value1, String value2) {
            addCriterion("c_dnsAddress not between", value1, value2, "cDnsaddress");
            return (Criteria) this;
        }

        public Criteria andCFirmversionIsNull() {
            addCriterion("c_firmVersion is null");
            return (Criteria) this;
        }

        public Criteria andCFirmversionIsNotNull() {
            addCriterion("c_firmVersion is not null");
            return (Criteria) this;
        }

        public Criteria andCFirmversionEqualTo(String value) {
            addCriterion("c_firmVersion =", value, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionNotEqualTo(String value) {
            addCriterion("c_firmVersion <>", value, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionGreaterThan(String value) {
            addCriterion("c_firmVersion >", value, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionGreaterThanOrEqualTo(String value) {
            addCriterion("c_firmVersion >=", value, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionLessThan(String value) {
            addCriterion("c_firmVersion <", value, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionLessThanOrEqualTo(String value) {
            addCriterion("c_firmVersion <=", value, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionLike(String value) {
            addCriterion("c_firmVersion like", value, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionNotLike(String value) {
            addCriterion("c_firmVersion not like", value, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionIn(List<String> values) {
            addCriterion("c_firmVersion in", values, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionNotIn(List<String> values) {
            addCriterion("c_firmVersion not in", values, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionBetween(String value1, String value2) {
            addCriterion("c_firmVersion between", value1, value2, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCFirmversionNotBetween(String value1, String value2) {
            addCriterion("c_firmVersion not between", value1, value2, "cFirmversion");
            return (Criteria) this;
        }

        public Criteria andCGatewayIsNull() {
            addCriterion("c_gateway is null");
            return (Criteria) this;
        }

        public Criteria andCGatewayIsNotNull() {
            addCriterion("c_gateway is not null");
            return (Criteria) this;
        }

        public Criteria andCGatewayEqualTo(String value) {
            addCriterion("c_gateway =", value, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayNotEqualTo(String value) {
            addCriterion("c_gateway <>", value, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayGreaterThan(String value) {
            addCriterion("c_gateway >", value, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayGreaterThanOrEqualTo(String value) {
            addCriterion("c_gateway >=", value, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayLessThan(String value) {
            addCriterion("c_gateway <", value, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayLessThanOrEqualTo(String value) {
            addCriterion("c_gateway <=", value, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayLike(String value) {
            addCriterion("c_gateway like", value, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayNotLike(String value) {
            addCriterion("c_gateway not like", value, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayIn(List<String> values) {
            addCriterion("c_gateway in", values, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayNotIn(List<String> values) {
            addCriterion("c_gateway not in", values, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayBetween(String value1, String value2) {
            addCriterion("c_gateway between", value1, value2, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCGatewayNotBetween(String value1, String value2) {
            addCriterion("c_gateway not between", value1, value2, "cGateway");
            return (Criteria) this;
        }

        public Criteria andCHardwareIsNull() {
            addCriterion("c_hardware is null");
            return (Criteria) this;
        }

        public Criteria andCHardwareIsNotNull() {
            addCriterion("c_hardware is not null");
            return (Criteria) this;
        }

        public Criteria andCHardwareEqualTo(String value) {
            addCriterion("c_hardware =", value, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareNotEqualTo(String value) {
            addCriterion("c_hardware <>", value, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareGreaterThan(String value) {
            addCriterion("c_hardware >", value, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareGreaterThanOrEqualTo(String value) {
            addCriterion("c_hardware >=", value, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareLessThan(String value) {
            addCriterion("c_hardware <", value, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareLessThanOrEqualTo(String value) {
            addCriterion("c_hardware <=", value, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareLike(String value) {
            addCriterion("c_hardware like", value, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareNotLike(String value) {
            addCriterion("c_hardware not like", value, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareIn(List<String> values) {
            addCriterion("c_hardware in", values, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareNotIn(List<String> values) {
            addCriterion("c_hardware not in", values, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareBetween(String value1, String value2) {
            addCriterion("c_hardware between", value1, value2, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHardwareNotBetween(String value1, String value2) {
            addCriterion("c_hardware not between", value1, value2, "cHardware");
            return (Criteria) this;
        }

        public Criteria andCHostIsNull() {
            addCriterion("c_host is null");
            return (Criteria) this;
        }

        public Criteria andCHostIsNotNull() {
            addCriterion("c_host is not null");
            return (Criteria) this;
        }

        public Criteria andCHostEqualTo(String value) {
            addCriterion("c_host =", value, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostNotEqualTo(String value) {
            addCriterion("c_host <>", value, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostGreaterThan(String value) {
            addCriterion("c_host >", value, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostGreaterThanOrEqualTo(String value) {
            addCriterion("c_host >=", value, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostLessThan(String value) {
            addCriterion("c_host <", value, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostLessThanOrEqualTo(String value) {
            addCriterion("c_host <=", value, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostLike(String value) {
            addCriterion("c_host like", value, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostNotLike(String value) {
            addCriterion("c_host not like", value, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostIn(List<String> values) {
            addCriterion("c_host in", values, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostNotIn(List<String> values) {
            addCriterion("c_host not in", values, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostBetween(String value1, String value2) {
            addCriterion("c_host between", value1, value2, "cHost");
            return (Criteria) this;
        }

        public Criteria andCHostNotBetween(String value1, String value2) {
            addCriterion("c_host not between", value1, value2, "cHost");
            return (Criteria) this;
        }

        public Criteria andCImeiIsNull() {
            addCriterion("c_imei is null");
            return (Criteria) this;
        }

        public Criteria andCImeiIsNotNull() {
            addCriterion("c_imei is not null");
            return (Criteria) this;
        }

        public Criteria andCImeiEqualTo(String value) {
            addCriterion("c_imei =", value, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiNotEqualTo(String value) {
            addCriterion("c_imei <>", value, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiGreaterThan(String value) {
            addCriterion("c_imei >", value, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiGreaterThanOrEqualTo(String value) {
            addCriterion("c_imei >=", value, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiLessThan(String value) {
            addCriterion("c_imei <", value, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiLessThanOrEqualTo(String value) {
            addCriterion("c_imei <=", value, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiLike(String value) {
            addCriterion("c_imei like", value, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiNotLike(String value) {
            addCriterion("c_imei not like", value, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiIn(List<String> values) {
            addCriterion("c_imei in", values, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiNotIn(List<String> values) {
            addCriterion("c_imei not in", values, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiBetween(String value1, String value2) {
            addCriterion("c_imei between", value1, value2, "cImei");
            return (Criteria) this;
        }

        public Criteria andCImeiNotBetween(String value1, String value2) {
            addCriterion("c_imei not between", value1, value2, "cImei");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageIsNull() {
            addCriterion("c_isBatteryUsage is null");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageIsNotNull() {
            addCriterion("c_isBatteryUsage is not null");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageEqualTo(String value) {
            addCriterion("c_isBatteryUsage =", value, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageNotEqualTo(String value) {
            addCriterion("c_isBatteryUsage <>", value, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageGreaterThan(String value) {
            addCriterion("c_isBatteryUsage >", value, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageGreaterThanOrEqualTo(String value) {
            addCriterion("c_isBatteryUsage >=", value, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageLessThan(String value) {
            addCriterion("c_isBatteryUsage <", value, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageLessThanOrEqualTo(String value) {
            addCriterion("c_isBatteryUsage <=", value, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageLike(String value) {
            addCriterion("c_isBatteryUsage like", value, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageNotLike(String value) {
            addCriterion("c_isBatteryUsage not like", value, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageIn(List<String> values) {
            addCriterion("c_isBatteryUsage in", values, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageNotIn(List<String> values) {
            addCriterion("c_isBatteryUsage not in", values, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageBetween(String value1, String value2) {
            addCriterion("c_isBatteryUsage between", value1, value2, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsbatteryusageNotBetween(String value1, String value2) {
            addCriterion("c_isBatteryUsage not between", value1, value2, "cIsbatteryusage");
            return (Criteria) this;
        }

        public Criteria andCIsrootIsNull() {
            addCriterion("c_isRoot is null");
            return (Criteria) this;
        }

        public Criteria andCIsrootIsNotNull() {
            addCriterion("c_isRoot is not null");
            return (Criteria) this;
        }

        public Criteria andCIsrootEqualTo(String value) {
            addCriterion("c_isRoot =", value, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootNotEqualTo(String value) {
            addCriterion("c_isRoot <>", value, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootGreaterThan(String value) {
            addCriterion("c_isRoot >", value, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootGreaterThanOrEqualTo(String value) {
            addCriterion("c_isRoot >=", value, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootLessThan(String value) {
            addCriterion("c_isRoot <", value, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootLessThanOrEqualTo(String value) {
            addCriterion("c_isRoot <=", value, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootLike(String value) {
            addCriterion("c_isRoot like", value, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootNotLike(String value) {
            addCriterion("c_isRoot not like", value, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootIn(List<String> values) {
            addCriterion("c_isRoot in", values, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootNotIn(List<String> values) {
            addCriterion("c_isRoot not in", values, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootBetween(String value1, String value2) {
            addCriterion("c_isRoot between", value1, value2, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCIsrootNotBetween(String value1, String value2) {
            addCriterion("c_isRoot not between", value1, value2, "cIsroot");
            return (Criteria) this;
        }

        public Criteria andCLanguageIsNull() {
            addCriterion("c_language is null");
            return (Criteria) this;
        }

        public Criteria andCLanguageIsNotNull() {
            addCriterion("c_language is not null");
            return (Criteria) this;
        }

        public Criteria andCLanguageEqualTo(String value) {
            addCriterion("c_language =", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageNotEqualTo(String value) {
            addCriterion("c_language <>", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageGreaterThan(String value) {
            addCriterion("c_language >", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("c_language >=", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageLessThan(String value) {
            addCriterion("c_language <", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageLessThanOrEqualTo(String value) {
            addCriterion("c_language <=", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageLike(String value) {
            addCriterion("c_language like", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageNotLike(String value) {
            addCriterion("c_language not like", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageIn(List<String> values) {
            addCriterion("c_language in", values, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageNotIn(List<String> values) {
            addCriterion("c_language not in", values, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageBetween(String value1, String value2) {
            addCriterion("c_language between", value1, value2, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageNotBetween(String value1, String value2) {
            addCriterion("c_language not between", value1, value2, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCMccIsNull() {
            addCriterion("c_mcc is null");
            return (Criteria) this;
        }

        public Criteria andCMccIsNotNull() {
            addCriterion("c_mcc is not null");
            return (Criteria) this;
        }

        public Criteria andCMccEqualTo(String value) {
            addCriterion("c_mcc =", value, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccNotEqualTo(String value) {
            addCriterion("c_mcc <>", value, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccGreaterThan(String value) {
            addCriterion("c_mcc >", value, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccGreaterThanOrEqualTo(String value) {
            addCriterion("c_mcc >=", value, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccLessThan(String value) {
            addCriterion("c_mcc <", value, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccLessThanOrEqualTo(String value) {
            addCriterion("c_mcc <=", value, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccLike(String value) {
            addCriterion("c_mcc like", value, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccNotLike(String value) {
            addCriterion("c_mcc not like", value, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccIn(List<String> values) {
            addCriterion("c_mcc in", values, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccNotIn(List<String> values) {
            addCriterion("c_mcc not in", values, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccBetween(String value1, String value2) {
            addCriterion("c_mcc between", value1, value2, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMccNotBetween(String value1, String value2) {
            addCriterion("c_mcc not between", value1, value2, "cMcc");
            return (Criteria) this;
        }

        public Criteria andCMncIsNull() {
            addCriterion("c_mnc is null");
            return (Criteria) this;
        }

        public Criteria andCMncIsNotNull() {
            addCriterion("c_mnc is not null");
            return (Criteria) this;
        }

        public Criteria andCMncEqualTo(String value) {
            addCriterion("c_mnc =", value, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncNotEqualTo(String value) {
            addCriterion("c_mnc <>", value, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncGreaterThan(String value) {
            addCriterion("c_mnc >", value, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncGreaterThanOrEqualTo(String value) {
            addCriterion("c_mnc >=", value, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncLessThan(String value) {
            addCriterion("c_mnc <", value, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncLessThanOrEqualTo(String value) {
            addCriterion("c_mnc <=", value, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncLike(String value) {
            addCriterion("c_mnc like", value, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncNotLike(String value) {
            addCriterion("c_mnc not like", value, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncIn(List<String> values) {
            addCriterion("c_mnc in", values, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncNotIn(List<String> values) {
            addCriterion("c_mnc not in", values, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncBetween(String value1, String value2) {
            addCriterion("c_mnc between", value1, value2, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCMncNotBetween(String value1, String value2) {
            addCriterion("c_mnc not between", value1, value2, "cMnc");
            return (Criteria) this;
        }

        public Criteria andCModelIsNull() {
            addCriterion("c_model is null");
            return (Criteria) this;
        }

        public Criteria andCModelIsNotNull() {
            addCriterion("c_model is not null");
            return (Criteria) this;
        }

        public Criteria andCModelEqualTo(String value) {
            addCriterion("c_model =", value, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelNotEqualTo(String value) {
            addCriterion("c_model <>", value, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelGreaterThan(String value) {
            addCriterion("c_model >", value, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelGreaterThanOrEqualTo(String value) {
            addCriterion("c_model >=", value, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelLessThan(String value) {
            addCriterion("c_model <", value, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelLessThanOrEqualTo(String value) {
            addCriterion("c_model <=", value, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelLike(String value) {
            addCriterion("c_model like", value, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelNotLike(String value) {
            addCriterion("c_model not like", value, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelIn(List<String> values) {
            addCriterion("c_model in", values, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelNotIn(List<String> values) {
            addCriterion("c_model not in", values, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelBetween(String value1, String value2) {
            addCriterion("c_model between", value1, value2, "cModel");
            return (Criteria) this;
        }

        public Criteria andCModelNotBetween(String value1, String value2) {
            addCriterion("c_model not between", value1, value2, "cModel");
            return (Criteria) this;
        }

        public Criteria andCMusichashIsNull() {
            addCriterion("c_musicHash is null");
            return (Criteria) this;
        }

        public Criteria andCMusichashIsNotNull() {
            addCriterion("c_musicHash is not null");
            return (Criteria) this;
        }

        public Criteria andCMusichashEqualTo(String value) {
            addCriterion("c_musicHash =", value, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashNotEqualTo(String value) {
            addCriterion("c_musicHash <>", value, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashGreaterThan(String value) {
            addCriterion("c_musicHash >", value, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashGreaterThanOrEqualTo(String value) {
            addCriterion("c_musicHash >=", value, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashLessThan(String value) {
            addCriterion("c_musicHash <", value, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashLessThanOrEqualTo(String value) {
            addCriterion("c_musicHash <=", value, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashLike(String value) {
            addCriterion("c_musicHash like", value, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashNotLike(String value) {
            addCriterion("c_musicHash not like", value, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashIn(List<String> values) {
            addCriterion("c_musicHash in", values, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashNotIn(List<String> values) {
            addCriterion("c_musicHash not in", values, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashBetween(String value1, String value2) {
            addCriterion("c_musicHash between", value1, value2, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCMusichashNotBetween(String value1, String value2) {
            addCriterion("c_musicHash not between", value1, value2, "cMusichash");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberIsNull() {
            addCriterion("c_phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberIsNotNull() {
            addCriterion("c_phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberEqualTo(String value) {
            addCriterion("c_phoneNumber =", value, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberNotEqualTo(String value) {
            addCriterion("c_phoneNumber <>", value, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberGreaterThan(String value) {
            addCriterion("c_phoneNumber >", value, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("c_phoneNumber >=", value, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberLessThan(String value) {
            addCriterion("c_phoneNumber <", value, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("c_phoneNumber <=", value, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberLike(String value) {
            addCriterion("c_phoneNumber like", value, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberNotLike(String value) {
            addCriterion("c_phoneNumber not like", value, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberIn(List<String> values) {
            addCriterion("c_phoneNumber in", values, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberNotIn(List<String> values) {
            addCriterion("c_phoneNumber not in", values, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberBetween(String value1, String value2) {
            addCriterion("c_phoneNumber between", value1, value2, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonenumberNotBetween(String value1, String value2) {
            addCriterion("c_phoneNumber not between", value1, value2, "cPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeIsNull() {
            addCriterion("c_phoneType is null");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeIsNotNull() {
            addCriterion("c_phoneType is not null");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeEqualTo(String value) {
            addCriterion("c_phoneType =", value, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeNotEqualTo(String value) {
            addCriterion("c_phoneType <>", value, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeGreaterThan(String value) {
            addCriterion("c_phoneType >", value, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_phoneType >=", value, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeLessThan(String value) {
            addCriterion("c_phoneType <", value, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeLessThanOrEqualTo(String value) {
            addCriterion("c_phoneType <=", value, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeLike(String value) {
            addCriterion("c_phoneType like", value, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeNotLike(String value) {
            addCriterion("c_phoneType not like", value, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeIn(List<String> values) {
            addCriterion("c_phoneType in", values, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeNotIn(List<String> values) {
            addCriterion("c_phoneType not in", values, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeBetween(String value1, String value2) {
            addCriterion("c_phoneType between", value1, value2, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCPhonetypeNotBetween(String value1, String value2) {
            addCriterion("c_phoneType not between", value1, value2, "cPhonetype");
            return (Criteria) this;
        }

        public Criteria andCProductIsNull() {
            addCriterion("c_product is null");
            return (Criteria) this;
        }

        public Criteria andCProductIsNotNull() {
            addCriterion("c_product is not null");
            return (Criteria) this;
        }

        public Criteria andCProductEqualTo(String value) {
            addCriterion("c_product =", value, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductNotEqualTo(String value) {
            addCriterion("c_product <>", value, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductGreaterThan(String value) {
            addCriterion("c_product >", value, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductGreaterThanOrEqualTo(String value) {
            addCriterion("c_product >=", value, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductLessThan(String value) {
            addCriterion("c_product <", value, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductLessThanOrEqualTo(String value) {
            addCriterion("c_product <=", value, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductLike(String value) {
            addCriterion("c_product like", value, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductNotLike(String value) {
            addCriterion("c_product not like", value, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductIn(List<String> values) {
            addCriterion("c_product in", values, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductNotIn(List<String> values) {
            addCriterion("c_product not in", values, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductBetween(String value1, String value2) {
            addCriterion("c_product between", value1, value2, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProductNotBetween(String value1, String value2) {
            addCriterion("c_product not between", value1, value2, "cProduct");
            return (Criteria) this;
        }

        public Criteria andCProxystrIsNull() {
            addCriterion("c_proxyStr is null");
            return (Criteria) this;
        }

        public Criteria andCProxystrIsNotNull() {
            addCriterion("c_proxyStr is not null");
            return (Criteria) this;
        }

        public Criteria andCProxystrEqualTo(String value) {
            addCriterion("c_proxyStr =", value, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrNotEqualTo(String value) {
            addCriterion("c_proxyStr <>", value, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrGreaterThan(String value) {
            addCriterion("c_proxyStr >", value, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrGreaterThanOrEqualTo(String value) {
            addCriterion("c_proxyStr >=", value, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrLessThan(String value) {
            addCriterion("c_proxyStr <", value, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrLessThanOrEqualTo(String value) {
            addCriterion("c_proxyStr <=", value, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrLike(String value) {
            addCriterion("c_proxyStr like", value, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrNotLike(String value) {
            addCriterion("c_proxyStr not like", value, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrIn(List<String> values) {
            addCriterion("c_proxyStr in", values, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrNotIn(List<String> values) {
            addCriterion("c_proxyStr not in", values, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrBetween(String value1, String value2) {
            addCriterion("c_proxyStr between", value1, value2, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCProxystrNotBetween(String value1, String value2) {
            addCriterion("c_proxyStr not between", value1, value2, "cProxystr");
            return (Criteria) this;
        }

        public Criteria andCRodeviceIsNull() {
            addCriterion("c_roDevice is null");
            return (Criteria) this;
        }

        public Criteria andCRodeviceIsNotNull() {
            addCriterion("c_roDevice is not null");
            return (Criteria) this;
        }

        public Criteria andCRodeviceEqualTo(String value) {
            addCriterion("c_roDevice =", value, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceNotEqualTo(String value) {
            addCriterion("c_roDevice <>", value, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceGreaterThan(String value) {
            addCriterion("c_roDevice >", value, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceGreaterThanOrEqualTo(String value) {
            addCriterion("c_roDevice >=", value, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceLessThan(String value) {
            addCriterion("c_roDevice <", value, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceLessThanOrEqualTo(String value) {
            addCriterion("c_roDevice <=", value, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceLike(String value) {
            addCriterion("c_roDevice like", value, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceNotLike(String value) {
            addCriterion("c_roDevice not like", value, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceIn(List<String> values) {
            addCriterion("c_roDevice in", values, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceNotIn(List<String> values) {
            addCriterion("c_roDevice not in", values, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceBetween(String value1, String value2) {
            addCriterion("c_roDevice between", value1, value2, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRodeviceNotBetween(String value1, String value2) {
            addCriterion("c_roDevice not between", value1, value2, "cRodevice");
            return (Criteria) this;
        }

        public Criteria andCRomodelIsNull() {
            addCriterion("c_roModel is null");
            return (Criteria) this;
        }

        public Criteria andCRomodelIsNotNull() {
            addCriterion("c_roModel is not null");
            return (Criteria) this;
        }

        public Criteria andCRomodelEqualTo(String value) {
            addCriterion("c_roModel =", value, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelNotEqualTo(String value) {
            addCriterion("c_roModel <>", value, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelGreaterThan(String value) {
            addCriterion("c_roModel >", value, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelGreaterThanOrEqualTo(String value) {
            addCriterion("c_roModel >=", value, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelLessThan(String value) {
            addCriterion("c_roModel <", value, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelLessThanOrEqualTo(String value) {
            addCriterion("c_roModel <=", value, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelLike(String value) {
            addCriterion("c_roModel like", value, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelNotLike(String value) {
            addCriterion("c_roModel not like", value, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelIn(List<String> values) {
            addCriterion("c_roModel in", values, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelNotIn(List<String> values) {
            addCriterion("c_roModel not in", values, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelBetween(String value1, String value2) {
            addCriterion("c_roModel between", value1, value2, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRomodelNotBetween(String value1, String value2) {
            addCriterion("c_roModel not between", value1, value2, "cRomodel");
            return (Criteria) this;
        }

        public Criteria andCRonameIsNull() {
            addCriterion("c_roName is null");
            return (Criteria) this;
        }

        public Criteria andCRonameIsNotNull() {
            addCriterion("c_roName is not null");
            return (Criteria) this;
        }

        public Criteria andCRonameEqualTo(String value) {
            addCriterion("c_roName =", value, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameNotEqualTo(String value) {
            addCriterion("c_roName <>", value, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameGreaterThan(String value) {
            addCriterion("c_roName >", value, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameGreaterThanOrEqualTo(String value) {
            addCriterion("c_roName >=", value, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameLessThan(String value) {
            addCriterion("c_roName <", value, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameLessThanOrEqualTo(String value) {
            addCriterion("c_roName <=", value, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameLike(String value) {
            addCriterion("c_roName like", value, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameNotLike(String value) {
            addCriterion("c_roName not like", value, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameIn(List<String> values) {
            addCriterion("c_roName in", values, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameNotIn(List<String> values) {
            addCriterion("c_roName not in", values, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameBetween(String value1, String value2) {
            addCriterion("c_roName between", value1, value2, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCRonameNotBetween(String value1, String value2) {
            addCriterion("c_roName not between", value1, value2, "cRoname");
            return (Criteria) this;
        }

        public Criteria andCScreenresIsNull() {
            addCriterion("c_screenRes is null");
            return (Criteria) this;
        }

        public Criteria andCScreenresIsNotNull() {
            addCriterion("c_screenRes is not null");
            return (Criteria) this;
        }

        public Criteria andCScreenresEqualTo(String value) {
            addCriterion("c_screenRes =", value, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresNotEqualTo(String value) {
            addCriterion("c_screenRes <>", value, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresGreaterThan(String value) {
            addCriterion("c_screenRes >", value, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresGreaterThanOrEqualTo(String value) {
            addCriterion("c_screenRes >=", value, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresLessThan(String value) {
            addCriterion("c_screenRes <", value, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresLessThanOrEqualTo(String value) {
            addCriterion("c_screenRes <=", value, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresLike(String value) {
            addCriterion("c_screenRes like", value, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresNotLike(String value) {
            addCriterion("c_screenRes not like", value, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresIn(List<String> values) {
            addCriterion("c_screenRes in", values, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresNotIn(List<String> values) {
            addCriterion("c_screenRes not in", values, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresBetween(String value1, String value2) {
            addCriterion("c_screenRes between", value1, value2, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCScreenresNotBetween(String value1, String value2) {
            addCriterion("c_screenRes not between", value1, value2, "cScreenres");
            return (Criteria) this;
        }

        public Criteria andCSdkversionIsNull() {
            addCriterion("c_sdkVersion is null");
            return (Criteria) this;
        }

        public Criteria andCSdkversionIsNotNull() {
            addCriterion("c_sdkVersion is not null");
            return (Criteria) this;
        }

        public Criteria andCSdkversionEqualTo(String value) {
            addCriterion("c_sdkVersion =", value, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionNotEqualTo(String value) {
            addCriterion("c_sdkVersion <>", value, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionGreaterThan(String value) {
            addCriterion("c_sdkVersion >", value, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionGreaterThanOrEqualTo(String value) {
            addCriterion("c_sdkVersion >=", value, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionLessThan(String value) {
            addCriterion("c_sdkVersion <", value, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionLessThanOrEqualTo(String value) {
            addCriterion("c_sdkVersion <=", value, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionLike(String value) {
            addCriterion("c_sdkVersion like", value, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionNotLike(String value) {
            addCriterion("c_sdkVersion not like", value, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionIn(List<String> values) {
            addCriterion("c_sdkVersion in", values, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionNotIn(List<String> values) {
            addCriterion("c_sdkVersion not in", values, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionBetween(String value1, String value2) {
            addCriterion("c_sdkVersion between", value1, value2, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSdkversionNotBetween(String value1, String value2) {
            addCriterion("c_sdkVersion not between", value1, value2, "cSdkversion");
            return (Criteria) this;
        }

        public Criteria andCSerialnoIsNull() {
            addCriterion("c_serialNo is null");
            return (Criteria) this;
        }

        public Criteria andCSerialnoIsNotNull() {
            addCriterion("c_serialNo is not null");
            return (Criteria) this;
        }

        public Criteria andCSerialnoEqualTo(String value) {
            addCriterion("c_serialNo =", value, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoNotEqualTo(String value) {
            addCriterion("c_serialNo <>", value, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoGreaterThan(String value) {
            addCriterion("c_serialNo >", value, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("c_serialNo >=", value, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoLessThan(String value) {
            addCriterion("c_serialNo <", value, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoLessThanOrEqualTo(String value) {
            addCriterion("c_serialNo <=", value, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoLike(String value) {
            addCriterion("c_serialNo like", value, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoNotLike(String value) {
            addCriterion("c_serialNo not like", value, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoIn(List<String> values) {
            addCriterion("c_serialNo in", values, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoNotIn(List<String> values) {
            addCriterion("c_serialNo not in", values, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoBetween(String value1, String value2) {
            addCriterion("c_serialNo between", value1, value2, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSerialnoNotBetween(String value1, String value2) {
            addCriterion("c_serialNo not between", value1, value2, "cSerialno");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorIsNull() {
            addCriterion("c_simOperator is null");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorIsNotNull() {
            addCriterion("c_simOperator is not null");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorEqualTo(String value) {
            addCriterion("c_simOperator =", value, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorNotEqualTo(String value) {
            addCriterion("c_simOperator <>", value, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorGreaterThan(String value) {
            addCriterion("c_simOperator >", value, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorGreaterThanOrEqualTo(String value) {
            addCriterion("c_simOperator >=", value, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorLessThan(String value) {
            addCriterion("c_simOperator <", value, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorLessThanOrEqualTo(String value) {
            addCriterion("c_simOperator <=", value, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorLike(String value) {
            addCriterion("c_simOperator like", value, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorNotLike(String value) {
            addCriterion("c_simOperator not like", value, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorIn(List<String> values) {
            addCriterion("c_simOperator in", values, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorNotIn(List<String> values) {
            addCriterion("c_simOperator not in", values, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorBetween(String value1, String value2) {
            addCriterion("c_simOperator between", value1, value2, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimoperatorNotBetween(String value1, String value2) {
            addCriterion("c_simOperator not between", value1, value2, "cSimoperator");
            return (Criteria) this;
        }

        public Criteria andCSimserialIsNull() {
            addCriterion("c_simSerial is null");
            return (Criteria) this;
        }

        public Criteria andCSimserialIsNotNull() {
            addCriterion("c_simSerial is not null");
            return (Criteria) this;
        }

        public Criteria andCSimserialEqualTo(String value) {
            addCriterion("c_simSerial =", value, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialNotEqualTo(String value) {
            addCriterion("c_simSerial <>", value, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialGreaterThan(String value) {
            addCriterion("c_simSerial >", value, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialGreaterThanOrEqualTo(String value) {
            addCriterion("c_simSerial >=", value, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialLessThan(String value) {
            addCriterion("c_simSerial <", value, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialLessThanOrEqualTo(String value) {
            addCriterion("c_simSerial <=", value, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialLike(String value) {
            addCriterion("c_simSerial like", value, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialNotLike(String value) {
            addCriterion("c_simSerial not like", value, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialIn(List<String> values) {
            addCriterion("c_simSerial in", values, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialNotIn(List<String> values) {
            addCriterion("c_simSerial not in", values, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialBetween(String value1, String value2) {
            addCriterion("c_simSerial between", value1, value2, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSimserialNotBetween(String value1, String value2) {
            addCriterion("c_simSerial not between", value1, value2, "cSimserial");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidIsNull() {
            addCriterion("c_subscriberId is null");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidIsNotNull() {
            addCriterion("c_subscriberId is not null");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidEqualTo(String value) {
            addCriterion("c_subscriberId =", value, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidNotEqualTo(String value) {
            addCriterion("c_subscriberId <>", value, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidGreaterThan(String value) {
            addCriterion("c_subscriberId >", value, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidGreaterThanOrEqualTo(String value) {
            addCriterion("c_subscriberId >=", value, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidLessThan(String value) {
            addCriterion("c_subscriberId <", value, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidLessThanOrEqualTo(String value) {
            addCriterion("c_subscriberId <=", value, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidLike(String value) {
            addCriterion("c_subscriberId like", value, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidNotLike(String value) {
            addCriterion("c_subscriberId not like", value, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidIn(List<String> values) {
            addCriterion("c_subscriberId in", values, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidNotIn(List<String> values) {
            addCriterion("c_subscriberId not in", values, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidBetween(String value1, String value2) {
            addCriterion("c_subscriberId between", value1, value2, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCSubscriberidNotBetween(String value1, String value2) {
            addCriterion("c_subscriberId not between", value1, value2, "cSubscriberid");
            return (Criteria) this;
        }

        public Criteria andCTagsIsNull() {
            addCriterion("c_tags is null");
            return (Criteria) this;
        }

        public Criteria andCTagsIsNotNull() {
            addCriterion("c_tags is not null");
            return (Criteria) this;
        }

        public Criteria andCTagsEqualTo(String value) {
            addCriterion("c_tags =", value, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsNotEqualTo(String value) {
            addCriterion("c_tags <>", value, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsGreaterThan(String value) {
            addCriterion("c_tags >", value, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsGreaterThanOrEqualTo(String value) {
            addCriterion("c_tags >=", value, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsLessThan(String value) {
            addCriterion("c_tags <", value, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsLessThanOrEqualTo(String value) {
            addCriterion("c_tags <=", value, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsLike(String value) {
            addCriterion("c_tags like", value, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsNotLike(String value) {
            addCriterion("c_tags not like", value, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsIn(List<String> values) {
            addCriterion("c_tags in", values, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsNotIn(List<String> values) {
            addCriterion("c_tags not in", values, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsBetween(String value1, String value2) {
            addCriterion("c_tags between", value1, value2, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTagsNotBetween(String value1, String value2) {
            addCriterion("c_tags not between", value1, value2, "cTags");
            return (Criteria) this;
        }

        public Criteria andCTdidIsNull() {
            addCriterion("c_tdid is null");
            return (Criteria) this;
        }

        public Criteria andCTdidIsNotNull() {
            addCriterion("c_tdid is not null");
            return (Criteria) this;
        }

        public Criteria andCTdidEqualTo(String value) {
            addCriterion("c_tdid =", value, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidNotEqualTo(String value) {
            addCriterion("c_tdid <>", value, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidGreaterThan(String value) {
            addCriterion("c_tdid >", value, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidGreaterThanOrEqualTo(String value) {
            addCriterion("c_tdid >=", value, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidLessThan(String value) {
            addCriterion("c_tdid <", value, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidLessThanOrEqualTo(String value) {
            addCriterion("c_tdid <=", value, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidLike(String value) {
            addCriterion("c_tdid like", value, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidNotLike(String value) {
            addCriterion("c_tdid not like", value, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidIn(List<String> values) {
            addCriterion("c_tdid in", values, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidNotIn(List<String> values) {
            addCriterion("c_tdid not in", values, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidBetween(String value1, String value2) {
            addCriterion("c_tdid between", value1, value2, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTdidNotBetween(String value1, String value2) {
            addCriterion("c_tdid not between", value1, value2, "cTdid");
            return (Criteria) this;
        }

        public Criteria andCTimezoneIsNull() {
            addCriterion("c_timeZone is null");
            return (Criteria) this;
        }

        public Criteria andCTimezoneIsNotNull() {
            addCriterion("c_timeZone is not null");
            return (Criteria) this;
        }

        public Criteria andCTimezoneEqualTo(String value) {
            addCriterion("c_timeZone =", value, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneNotEqualTo(String value) {
            addCriterion("c_timeZone <>", value, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneGreaterThan(String value) {
            addCriterion("c_timeZone >", value, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_timeZone >=", value, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneLessThan(String value) {
            addCriterion("c_timeZone <", value, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneLessThanOrEqualTo(String value) {
            addCriterion("c_timeZone <=", value, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneLike(String value) {
            addCriterion("c_timeZone like", value, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneNotLike(String value) {
            addCriterion("c_timeZone not like", value, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneIn(List<String> values) {
            addCriterion("c_timeZone in", values, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneNotIn(List<String> values) {
            addCriterion("c_timeZone not in", values, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneBetween(String value1, String value2) {
            addCriterion("c_timeZone between", value1, value2, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTimezoneNotBetween(String value1, String value2) {
            addCriterion("c_timeZone not between", value1, value2, "cTimezone");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryIsNull() {
            addCriterion("c_totalMemory is null");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryIsNotNull() {
            addCriterion("c_totalMemory is not null");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryEqualTo(String value) {
            addCriterion("c_totalMemory =", value, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryNotEqualTo(String value) {
            addCriterion("c_totalMemory <>", value, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryGreaterThan(String value) {
            addCriterion("c_totalMemory >", value, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryGreaterThanOrEqualTo(String value) {
            addCriterion("c_totalMemory >=", value, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryLessThan(String value) {
            addCriterion("c_totalMemory <", value, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryLessThanOrEqualTo(String value) {
            addCriterion("c_totalMemory <=", value, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryLike(String value) {
            addCriterion("c_totalMemory like", value, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryNotLike(String value) {
            addCriterion("c_totalMemory not like", value, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryIn(List<String> values) {
            addCriterion("c_totalMemory in", values, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryNotIn(List<String> values) {
            addCriterion("c_totalMemory not in", values, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryBetween(String value1, String value2) {
            addCriterion("c_totalMemory between", value1, value2, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalmemoryNotBetween(String value1, String value2) {
            addCriterion("c_totalMemory not between", value1, value2, "cTotalmemory");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageIsNull() {
            addCriterion("c_totalStorage is null");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageIsNotNull() {
            addCriterion("c_totalStorage is not null");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageEqualTo(String value) {
            addCriterion("c_totalStorage =", value, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageNotEqualTo(String value) {
            addCriterion("c_totalStorage <>", value, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageGreaterThan(String value) {
            addCriterion("c_totalStorage >", value, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageGreaterThanOrEqualTo(String value) {
            addCriterion("c_totalStorage >=", value, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageLessThan(String value) {
            addCriterion("c_totalStorage <", value, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageLessThanOrEqualTo(String value) {
            addCriterion("c_totalStorage <=", value, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageLike(String value) {
            addCriterion("c_totalStorage like", value, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageNotLike(String value) {
            addCriterion("c_totalStorage not like", value, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageIn(List<String> values) {
            addCriterion("c_totalStorage in", values, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageNotIn(List<String> values) {
            addCriterion("c_totalStorage not in", values, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageBetween(String value1, String value2) {
            addCriterion("c_totalStorage between", value1, value2, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTotalstorageNotBetween(String value1, String value2) {
            addCriterion("c_totalStorage not between", value1, value2, "cTotalstorage");
            return (Criteria) this;
        }

        public Criteria andCTrueipIsNull() {
            addCriterion("c_trueIp is null");
            return (Criteria) this;
        }

        public Criteria andCTrueipIsNotNull() {
            addCriterion("c_trueIp is not null");
            return (Criteria) this;
        }

        public Criteria andCTrueipEqualTo(String value) {
            addCriterion("c_trueIp =", value, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipNotEqualTo(String value) {
            addCriterion("c_trueIp <>", value, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipGreaterThan(String value) {
            addCriterion("c_trueIp >", value, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipGreaterThanOrEqualTo(String value) {
            addCriterion("c_trueIp >=", value, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipLessThan(String value) {
            addCriterion("c_trueIp <", value, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipLessThanOrEqualTo(String value) {
            addCriterion("c_trueIp <=", value, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipLike(String value) {
            addCriterion("c_trueIp like", value, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipNotLike(String value) {
            addCriterion("c_trueIp not like", value, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipIn(List<String> values) {
            addCriterion("c_trueIp in", values, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipNotIn(List<String> values) {
            addCriterion("c_trueIp not in", values, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipBetween(String value1, String value2) {
            addCriterion("c_trueIp between", value1, value2, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCTrueipNotBetween(String value1, String value2) {
            addCriterion("c_trueIp not between", value1, value2, "cTrueip");
            return (Criteria) this;
        }

        public Criteria andCUdidIsNull() {
            addCriterion("c_udid is null");
            return (Criteria) this;
        }

        public Criteria andCUdidIsNotNull() {
            addCriterion("c_udid is not null");
            return (Criteria) this;
        }

        public Criteria andCUdidEqualTo(String value) {
            addCriterion("c_udid =", value, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidNotEqualTo(String value) {
            addCriterion("c_udid <>", value, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidGreaterThan(String value) {
            addCriterion("c_udid >", value, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidGreaterThanOrEqualTo(String value) {
            addCriterion("c_udid >=", value, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidLessThan(String value) {
            addCriterion("c_udid <", value, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidLessThanOrEqualTo(String value) {
            addCriterion("c_udid <=", value, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidLike(String value) {
            addCriterion("c_udid like", value, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidNotLike(String value) {
            addCriterion("c_udid not like", value, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidIn(List<String> values) {
            addCriterion("c_udid in", values, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidNotIn(List<String> values) {
            addCriterion("c_udid not in", values, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidBetween(String value1, String value2) {
            addCriterion("c_udid between", value1, value2, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUdidNotBetween(String value1, String value2) {
            addCriterion("c_udid not between", value1, value2, "cUdid");
            return (Criteria) this;
        }

        public Criteria andCUptimeIsNull() {
            addCriterion("c_upTime is null");
            return (Criteria) this;
        }

        public Criteria andCUptimeIsNotNull() {
            addCriterion("c_upTime is not null");
            return (Criteria) this;
        }

        public Criteria andCUptimeEqualTo(String value) {
            addCriterion("c_upTime =", value, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeNotEqualTo(String value) {
            addCriterion("c_upTime <>", value, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeGreaterThan(String value) {
            addCriterion("c_upTime >", value, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_upTime >=", value, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeLessThan(String value) {
            addCriterion("c_upTime <", value, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeLessThanOrEqualTo(String value) {
            addCriterion("c_upTime <=", value, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeLike(String value) {
            addCriterion("c_upTime like", value, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeNotLike(String value) {
            addCriterion("c_upTime not like", value, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeIn(List<String> values) {
            addCriterion("c_upTime in", values, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeNotIn(List<String> values) {
            addCriterion("c_upTime not in", values, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeBetween(String value1, String value2) {
            addCriterion("c_upTime between", value1, value2, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUptimeNotBetween(String value1, String value2) {
            addCriterion("c_upTime not between", value1, value2, "cUptime");
            return (Criteria) this;
        }

        public Criteria andCUseragentIsNull() {
            addCriterion("c_userAgent is null");
            return (Criteria) this;
        }

        public Criteria andCUseragentIsNotNull() {
            addCriterion("c_userAgent is not null");
            return (Criteria) this;
        }

        public Criteria andCUseragentEqualTo(String value) {
            addCriterion("c_userAgent =", value, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentNotEqualTo(String value) {
            addCriterion("c_userAgent <>", value, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentGreaterThan(String value) {
            addCriterion("c_userAgent >", value, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentGreaterThanOrEqualTo(String value) {
            addCriterion("c_userAgent >=", value, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentLessThan(String value) {
            addCriterion("c_userAgent <", value, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentLessThanOrEqualTo(String value) {
            addCriterion("c_userAgent <=", value, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentLike(String value) {
            addCriterion("c_userAgent like", value, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentNotLike(String value) {
            addCriterion("c_userAgent not like", value, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentIn(List<String> values) {
            addCriterion("c_userAgent in", values, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentNotIn(List<String> values) {
            addCriterion("c_userAgent not in", values, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentBetween(String value1, String value2) {
            addCriterion("c_userAgent between", value1, value2, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCUseragentNotBetween(String value1, String value2) {
            addCriterion("c_userAgent not between", value1, value2, "cUseragent");
            return (Criteria) this;
        }

        public Criteria andCVoicemailIsNull() {
            addCriterion("c_voiceMail is null");
            return (Criteria) this;
        }

        public Criteria andCVoicemailIsNotNull() {
            addCriterion("c_voiceMail is not null");
            return (Criteria) this;
        }

        public Criteria andCVoicemailEqualTo(String value) {
            addCriterion("c_voiceMail =", value, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailNotEqualTo(String value) {
            addCriterion("c_voiceMail <>", value, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailGreaterThan(String value) {
            addCriterion("c_voiceMail >", value, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailGreaterThanOrEqualTo(String value) {
            addCriterion("c_voiceMail >=", value, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailLessThan(String value) {
            addCriterion("c_voiceMail <", value, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailLessThanOrEqualTo(String value) {
            addCriterion("c_voiceMail <=", value, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailLike(String value) {
            addCriterion("c_voiceMail like", value, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailNotLike(String value) {
            addCriterion("c_voiceMail not like", value, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailIn(List<String> values) {
            addCriterion("c_voiceMail in", values, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailNotIn(List<String> values) {
            addCriterion("c_voiceMail not in", values, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailBetween(String value1, String value2) {
            addCriterion("c_voiceMail between", value1, value2, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVoicemailNotBetween(String value1, String value2) {
            addCriterion("c_voiceMail not between", value1, value2, "cVoicemail");
            return (Criteria) this;
        }

        public Criteria andCVpnipIsNull() {
            addCriterion("c_vpnIp is null");
            return (Criteria) this;
        }

        public Criteria andCVpnipIsNotNull() {
            addCriterion("c_vpnIp is not null");
            return (Criteria) this;
        }

        public Criteria andCVpnipEqualTo(String value) {
            addCriterion("c_vpnIp =", value, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipNotEqualTo(String value) {
            addCriterion("c_vpnIp <>", value, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipGreaterThan(String value) {
            addCriterion("c_vpnIp >", value, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipGreaterThanOrEqualTo(String value) {
            addCriterion("c_vpnIp >=", value, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipLessThan(String value) {
            addCriterion("c_vpnIp <", value, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipLessThanOrEqualTo(String value) {
            addCriterion("c_vpnIp <=", value, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipLike(String value) {
            addCriterion("c_vpnIp like", value, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipNotLike(String value) {
            addCriterion("c_vpnIp not like", value, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipIn(List<String> values) {
            addCriterion("c_vpnIp in", values, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipNotIn(List<String> values) {
            addCriterion("c_vpnIp not in", values, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipBetween(String value1, String value2) {
            addCriterion("c_vpnIp between", value1, value2, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCVpnipNotBetween(String value1, String value2) {
            addCriterion("c_vpnIp not between", value1, value2, "cVpnip");
            return (Criteria) this;
        }

        public Criteria andCWifiipIsNull() {
            addCriterion("c_wifiIp is null");
            return (Criteria) this;
        }

        public Criteria andCWifiipIsNotNull() {
            addCriterion("c_wifiIp is not null");
            return (Criteria) this;
        }

        public Criteria andCWifiipEqualTo(String value) {
            addCriterion("c_wifiIp =", value, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipNotEqualTo(String value) {
            addCriterion("c_wifiIp <>", value, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipGreaterThan(String value) {
            addCriterion("c_wifiIp >", value, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipGreaterThanOrEqualTo(String value) {
            addCriterion("c_wifiIp >=", value, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipLessThan(String value) {
            addCriterion("c_wifiIp <", value, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipLessThanOrEqualTo(String value) {
            addCriterion("c_wifiIp <=", value, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipLike(String value) {
            addCriterion("c_wifiIp like", value, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipNotLike(String value) {
            addCriterion("c_wifiIp not like", value, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipIn(List<String> values) {
            addCriterion("c_wifiIp in", values, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipNotIn(List<String> values) {
            addCriterion("c_wifiIp not in", values, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipBetween(String value1, String value2) {
            addCriterion("c_wifiIp between", value1, value2, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifiipNotBetween(String value1, String value2) {
            addCriterion("c_wifiIp not between", value1, value2, "cWifiip");
            return (Criteria) this;
        }

        public Criteria andCWifimacIsNull() {
            addCriterion("c_wifiMac is null");
            return (Criteria) this;
        }

        public Criteria andCWifimacIsNotNull() {
            addCriterion("c_wifiMac is not null");
            return (Criteria) this;
        }

        public Criteria andCWifimacEqualTo(String value) {
            addCriterion("c_wifiMac =", value, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacNotEqualTo(String value) {
            addCriterion("c_wifiMac <>", value, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacGreaterThan(String value) {
            addCriterion("c_wifiMac >", value, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacGreaterThanOrEqualTo(String value) {
            addCriterion("c_wifiMac >=", value, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacLessThan(String value) {
            addCriterion("c_wifiMac <", value, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacLessThanOrEqualTo(String value) {
            addCriterion("c_wifiMac <=", value, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacLike(String value) {
            addCriterion("c_wifiMac like", value, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacNotLike(String value) {
            addCriterion("c_wifiMac not like", value, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacIn(List<String> values) {
            addCriterion("c_wifiMac in", values, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacNotIn(List<String> values) {
            addCriterion("c_wifiMac not in", values, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacBetween(String value1, String value2) {
            addCriterion("c_wifiMac between", value1, value2, "cWifimac");
            return (Criteria) this;
        }

        public Criteria andCWifimacNotBetween(String value1, String value2) {
            addCriterion("c_wifiMac not between", value1, value2, "cWifimac");
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