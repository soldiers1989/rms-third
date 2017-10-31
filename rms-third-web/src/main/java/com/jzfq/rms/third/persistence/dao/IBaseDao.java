package com.jzfq.rms.third.persistence.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public interface IBaseDao<T, PK extends Serializable> {

    /**
     * 根据主键值获取实体
     * @param pk 主键值
     * @return 实体
     */
    T getByPK(PK pk);

    /**
     * 获取全部实体
     * @return 全部实体
     */
    List<T> getAll();


    /**
     * 根据条件获取列表
     * @param condition 条件   多个条件可以封装成javabean或者map
     * @return 列表
     */
    List<T> getAllByCondition(Object condition);

    /**
     * 根据条件获取总条数
     * @param condition 条件   多个条件可以封装成javabean或者map
     * @return 总条数
     */
    long getCountByCondition(Object condition);

    /**
     * 增加实体
     * @param t 实体
     * @return 插入条数
     */
    int insert(T t);

    /**
     * 更新实体
     * @param t 实体
     * @return 更新条数
     */
    int update(T t);

    /**
     * 根据主键值删除实体
     * @param pk 主键值
     * @return 删除条数
     */
    int deleteByPK(PK pk);

    /**
     * 删除实体
     * @param t 实体
     * @return 删除条数
     */
    int delete(T t);

    /**
     * 批量增加实体
     * @param lists 实体列表
     * @param everyCommitSize 每次提交条数
     */
    void batchInsert(List<T> lists, int everyCommitSize);

    /**
     * 批量更新实体
     * @param lists 实体列表
     * @param everyCommitSize 每次提交条数
     */
    void batchUpdate(List<T> lists, int everyCommitSize);

    /**
     * 根据主键值批量删除实体
     * @param pks 主键数组
     * @param everyCommitSize 每次提交条数
     */
    void batchDeleteByPK(PK[] pks, int everyCommitSize);

    /**
     * 删除全部实体
     * @return 删除条数
     */
    int deleteAll();
}