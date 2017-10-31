package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.exception.BusinessException;
import com.jzfq.rms.third.persistence.dao.IBaseDao;
import com.jzfq.rms.third.service.IBaseService;

import java.io.Serializable;
import java.util.List;

/**
 * 继承类必须实现setDao4BaseService方法，把dao注入baseService
 * 通过调用setBaseDao完成对dao的注入
 * 具体实现参考：
 * public void setDao4BaseService() {
 *     super.setBaseDao(childDao);
 * }
 * childDao 继承BaseDao
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public abstract class BaseServiceAbstract<T, PK extends Serializable> implements IBaseService<T, PK> {

    private IBaseDao<T, PK> baseDao;
    private int everyCommitSize = 1000;

    @Override
    public T getByPK(PK pk) throws BusinessException {
        setDao4BaseService();
        return baseDao.getByPK(pk);
    }

    @Override
    public List<T> getAll() throws BusinessException {
        setDao4BaseService();
        return baseDao.getAll();
    }

    @Override
    public List<T> getAllByCondition(Object condition) throws BusinessException {
        setDao4BaseService();
        return baseDao.getAllByCondition(condition);
    }

    @Override
    public long getCountByCondition(Object condition) throws BusinessException {
        setDao4BaseService();
        return baseDao.getCountByCondition(condition);
    }

    @Override
    public int insert(T t) throws BusinessException {
        setDao4BaseService();
        return baseDao.insert(t);
    }

    @Override
    public int update(T t) throws BusinessException {
        setDao4BaseService();
        return baseDao.update(t);
    }

    @Override
    public int deleteByPK(PK pk) throws BusinessException {
        setDao4BaseService();
        return baseDao.deleteByPK(pk);
    }

    @Override
    public int delete(T t) throws BusinessException {
        setDao4BaseService();
        return baseDao.delete(t);
    }

    @Override
    public void batchInsert(List<T> lists) throws BusinessException {
        setDao4BaseService();
        baseDao.batchInsert(lists, everyCommitSize);
    }

    @Override
    public void batchUpdate(List<T> lists) throws BusinessException {
        setDao4BaseService();
        baseDao.batchUpdate(lists, everyCommitSize);
    }

    @Override
    public void batchDeleteByPK(PK[] pks) throws BusinessException {
        setDao4BaseService();
        baseDao.batchDeleteByPK(pks, everyCommitSize);
    }

    @Override
    public int deleteAll() throws BusinessException {
        setDao4BaseService();
        return baseDao.deleteAll();
    }

    /**
     * 用具体的Dao注入基础类Dao
     */
    public abstract void setDao4BaseService();

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