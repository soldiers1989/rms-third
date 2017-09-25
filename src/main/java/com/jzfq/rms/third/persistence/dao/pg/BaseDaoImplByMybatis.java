package com.jzfq.rms.third.persistence.dao.pg;

import com.jzfq.rms.third.persistence.dao.IBaseDao;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public class BaseDaoImplByMybatis<T, PK extends Serializable> implements IBaseDao<T, PK> {

    private String statementNamespace;
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public T getByPK(PK pk) {
        return sqlSessionTemplate.selectOne(statementNamespace + ".getByPK", pk);
    }

    @Override
    public List<T> getAll() {
        return sqlSessionTemplate.selectList(statementNamespace + ".getAll");
    }

    @Override
    public List<T> getAllByCondition(Object condition) {
        return sqlSessionTemplate.selectList(statementNamespace + ".getAllByCondition", condition);
    }

    @Override
    public long getCountByCondition(Object condition) {
        return sqlSessionTemplate.selectOne(statementNamespace + ".getCountByCondition", condition);
    }

    @Override
    public int insert(T t) {
        return sqlSessionTemplate.insert(statementNamespace + ".insert", t);
    }

    @Override
    public int update(T t) {
        return sqlSessionTemplate.update(statementNamespace + ".update", t);
    }

    @Override
    public int deleteByPK(PK pk) {
        return sqlSessionTemplate.delete(statementNamespace + ".deleteByPK", pk);
    }

    @Override
    public int delete(T t) {
        return sqlSessionTemplate.delete(statementNamespace + ".delete", t);
    }

    @Override
    public void batchInsert(List<T> lists, int everyCommitSize) {
        int commitCount = (int)Math.ceil(lists.size() / (double)everyCommitSize);
        SqlSession sqlSession =  sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);

        for (int i = 0; i < commitCount; i++) {

            int begin = everyCommitSize * (i - 1);
            int end = Math.min(begin + everyCommitSize, lists.size());

            List<T> subLists = lists.subList(begin, end);

            sqlSession.insert(statementNamespace + ".batchInsert", subLists);
            sqlSession.commit();
            sqlSession.clearCache();
        }
    }

    @Override
    public void batchUpdate(List<T> lists, int everyCommitSize) {
        int commitCount = (int)Math.ceil(lists.size() / (double)everyCommitSize);
        SqlSession sqlSession =  sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);

        for (int i = 0; i < commitCount; i++) {

            int begin = everyCommitSize * (i - 1);
            int end = Math.min(begin + everyCommitSize, lists.size());

            List<T> subLists = lists.subList(begin, end);
            for (T t: subLists) {
                sqlSession.update(statementNamespace + ".batchUpdate", t);
            }
            sqlSession.commit();
            sqlSession.clearCache();
        }
    }

    @Override
    public void batchDeleteByPK(PK[] pks, int everyCommitSize) {
        List<PK> lists = Arrays.asList(pks);
        int commitCount = (int)Math.ceil(lists.size() / (double)everyCommitSize);
        SqlSession sqlSession =  sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);

        for (int i = 0; i < commitCount; i++) {

            int begin = everyCommitSize * (i - 1);
            int end = Math.min(begin + everyCommitSize, lists.size());

            List<PK> subLists = lists.subList(begin, end);

            sqlSession.delete(statementNamespace + ".batchDeleteByPK", subLists);
            sqlSession.commit();
            sqlSession.clearCache();
        }
    }

    @Override
    public int deleteAll() {
        return sqlSessionTemplate.delete(statementNamespace + ".deleteAll");
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