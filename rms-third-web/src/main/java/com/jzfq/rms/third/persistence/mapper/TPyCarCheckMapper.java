package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TPyCarCheck;
import com.jzfq.rms.third.common.domain.example.TPyCarCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TPyCarCheckMapper {
    long countByExample(TPyCarCheckExample example);

    int deleteByExample(TPyCarCheckExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TPyCarCheck record);

    int insertSelective(TPyCarCheck record);

    List<TPyCarCheck> selectByExample(TPyCarCheckExample example);

    TPyCarCheck selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TPyCarCheck record, @Param("example") TPyCarCheckExample example);

    int updateByExample(@Param("record") TPyCarCheck record, @Param("example") TPyCarCheckExample example);

    int updateByPrimaryKeySelective(TPyCarCheck record);

    int updateByPrimaryKey(TPyCarCheck record);
}