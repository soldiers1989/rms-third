package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.persistence.dao.IUserDao;
import com.jzfq.rms.third.common.pojo.User;
import com.jzfq.rms.third.service.IUserService;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public  class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    @Override
    public List<User> getUserList() throws BusinessException {
        return userDao.getUserList();
    }

    @Override
    public User getUser(long userID) throws BusinessException {
        return userDao.getUser(userID);
    }

    @Override
    public long insertUser(User user) throws BusinessException {
        userDao.insertUser(user);
        return user.getUserID();
    }

    @Override
    public void updateUser(User user) throws BusinessException {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(long userID) throws BusinessException {
        userDao.deleteUser(userID);
    }


    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}