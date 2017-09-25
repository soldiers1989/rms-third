package com.jzfq.rms.third.persistence.dao;

import com.jzfq.rms.third.bean.User;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public interface IUserDao {

    /**
     * 获取用户列表
     * @return 用户列表
     */
    List<User> getUserList();

    /**
     * 获取单个用户
     * @param userID 用户ID
     * @return 用户
     */
    User getUser(long userID);

    /**
     * 插入用户
     * @param user 用户
     * @return 用户ID
     */
    long insertUser(User user);

    /**
     * 更新用户
     * @param user 用户
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param userID 用户ID
     */
    void deleteUser(long userID);
}
