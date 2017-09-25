package com.jzfq.rms.third.service;

import com.jzfq.rms.third.bean.User;
import com.jzfq.rms.third.exception.BusinessException;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public interface IUserService {

    /**
     * 获取用户列表
     * @return 用户列表
     * @throws BusinessException 业务异常
     */
    List<User> getUserList() throws BusinessException;

    /**
     * 获取单个用户
     * @param userID 用户ID
     * @return 用户
     * @throws BusinessException 业务异常
     */
    User getUser(long userID) throws BusinessException;

    /**
     * 插入用户
     * @param user 用户
     * @return 用户ID
     * @throws BusinessException 业务异常
     */
    long insertUser(User user) throws BusinessException;

    /**
     * 更新用户
     * @param user 用户
     * @throws BusinessException 业务异常
     */
    void updateUser(User user) throws BusinessException;

    /**
     * 删除用户
     * @param userID 用户ID
     * @throws BusinessException 业务异常
     */
    void deleteUser(long userID) throws BusinessException;
}