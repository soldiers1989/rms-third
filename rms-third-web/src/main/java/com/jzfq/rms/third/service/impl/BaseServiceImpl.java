package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.persistence.dao.IBaseDao;
import com.jzfq.rms.third.service.IBaseService;

import java.io.Serializable;
import java.util.List;

/**
 * 这个类不能被继承，用于不需要定制service的情况
 * 如果这个service无法满足需求，请继承BaseServiceAbstract
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public final class BaseServiceImpl<T, PK extends Serializable> implements IBaseService<T, PK> {

    private IBaseDao<T, PK> baseDao;
    private int everyCommitSize = 1000;

    @Override
    public T getByPK(PK pk) throws BusinessException {
        return baseDao.getByPK(pk);
    }

    @Override
    public List<T> getAll() throws BusinessException {
        return baseDao.getAll();
    }

    @Override
    public List<T> getAllByCondition(Object condition) throws BusinessException {
        return baseDao.getAllByCondition(condition);
    }

    @Override
    public long getCountByCondition(Object condition) throws BusinessException {
        return baseDao.getCountByCondition(condition);
    }

    @Override
    public int insert(T t) throws BusinessException {
        return baseDao.insert(t);
    }

    @Override
    public int update(T t) throws BusinessException {
        return baseDao.update(t);
    }

    @Override
    public int deleteByPK(PK pk) throws BusinessException {
        return baseDao.deleteByPK(pk);
    }

    @Override
    public int delete(T t) throws BusinessException {
        return baseDao.delete(t);
    }

    @Override
    public void batchInsert(List<T> lists) throws BusinessException {
        baseDao.batchInsert(lists, everyCommitSize);
    }

    @Override
    public void batchUpdate(List<T> lists) throws BusinessException {
        baseDao.batchUpdate(lists, everyCommitSize);
    }

    @Override
    public void batchDeleteByPK(PK[] pks) throws BusinessException {
        baseDao.batchDeleteByPK(pks, everyCommitSize);
    }

    @Override
    public int deleteAll() throws BusinessException {
        return baseDao.deleteAll();
    }

    public IBaseDao<T, PK> getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(IBaseDao<T, PK> baseDao) {
        this.baseDao = baseDao;
    }

    public int getEveryCommitSize() {
        return everyCommitSize;
    }

    public void setEveryCommitSize(int everyCommitSize) {
        this.everyCommitSize = everyCommitSize;
    }
}