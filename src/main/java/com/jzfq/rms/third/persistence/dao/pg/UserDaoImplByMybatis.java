package com.jzfq.rms.third.persistence.dao.pg;

import com.jzfq.rms.third.bean.User;
import com.jzfq.rms.third.persistence.dao.IUserDao;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public class UserDaoImplByMybatis implements IUserDao {

    private String statementNamespace = "User";

    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<User> getUserList() {
        return sqlSessionTemplate.selectList(statementNamespace + ".getUserList");
    }

    @Override
    public User getUser(long userID) {
        return sqlSessionTemplate.selectOne(statementNamespace + ".getUser", userID);
    }

    @Override
    public long insertUser(User user) {
        return 0;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(long userID) {

    }

    public String getStatementNamespace() {
        return statementNamespace;
    }

    public void setStatementNamespace(String statementNamespace) {
        this.statementNamespace = statementNamespace;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}