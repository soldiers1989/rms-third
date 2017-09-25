package com.jzfq.rms.third.service;

import com.jzfq.rms.third.exception.BusinessException;

import java.io.Serializable;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public interface IBaseService<T, PK extends Serializable> {

    /**
     * 根据主键值获取实体
     * @param pk 主键值
     * @return 实体
     * @throws BusinessException 业务异常
     */
    T getByPK(PK pk) throws BusinessException;

    /**
     * 获取全部实体
     * @return 全部实体
     * @throws BusinessException 业务异常
     */
    List<T> getAll() throws BusinessException;

    /**
     * 根据条件获取列表
     * @param condition 条件   多个条件可以封装成javabean或者map
     * @return 列表
     * @throws BusinessException 业务异常
     */
    List<T> getAllByCondition(Object condition) throws BusinessException;

    /**
     * 根据条件获取总条数
     * @param condition 条件   多个条件可以封装成javabean或者map
     * @return 总条数
     * @throws BusinessException 业务异常
     */
    long getCountByCondition(Object condition) throws BusinessException;

    /**
     * 增加实体
     * @param t 实体
     * @return 插入条数
     * @throws BusinessException 业务异常
     */
    int insert(T t) throws BusinessException;

    /**
     * 更新实体
     * @param t 实体
     * @return 更新条数
     * @throws BusinessException 业务异常
     */
    int update(T t) throws BusinessException;

    /**
     * 根据主键值删除实体
     * @param pk 主键值
     * @return 删除条数
     * @throws BusinessException 业务异常
     */
    int deleteByPK(PK pk) throws BusinessException;

    /**
     * 删除实体
     * @param t 实体
     * @return 删除条数
     * @throws BusinessException 业务异常
     */
    int delete(T t) throws BusinessException;

    /**
     * 批量增加实体
     * @param lists 实体列表
     * @throws BusinessException 业务异常
     */
    void batchInsert(List<T> lists) throws BusinessException;

    /**
     * 批量更新实体
     * @param lists 实体列表
     * @throws BusinessException 业务异常
     */
    void batchUpdate(List<T> lists) throws BusinessException;

    /**
     * 根据主键值批量删除实体
     * @param pks 主键数组
     * @throws BusinessException 业务异常
     */
    void batchDeleteByPK(PK[] pks) throws BusinessException;

    /**
     * 删除全部实体
     * @return 删除条数
     * @throws BusinessException 业务异常
     */
    int deleteAll() throws BusinessException;
}