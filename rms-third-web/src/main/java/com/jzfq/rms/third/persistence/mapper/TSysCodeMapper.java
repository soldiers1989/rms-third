package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TSysCode;
import com.jzfq.rms.third.common.domain.example.TSysCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TSysCodeMapper {
    long countByExample(TSysCodeExample example);

    int deleteByExample(TSysCodeExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TSysCode record);

    int insertSelective(TSysCode record);

    List<TSysCode> selectByExample(TSysCodeExample example);

    TSysCode selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TSysCode record, @Param("example") TSysCodeExample example);

    int updateByExample(@Param("record") TSysCode record, @Param("example") TSysCodeExample example);

    int updateByPrimaryKeySelective(TSysCode record);

    int updateByPrimaryKey(TSysCode record);
}