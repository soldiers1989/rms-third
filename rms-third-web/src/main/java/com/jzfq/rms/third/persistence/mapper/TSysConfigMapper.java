package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TSysConfig;
import com.jzfq.rms.third.common.domain.example.TSysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysConfigMapper {
    long countByExample(TSysConfigExample example);

    int deleteByExample(TSysConfigExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TSysConfig record);

    int insertSelective(TSysConfig record);

    List<TSysConfig> selectByExample(TSysConfigExample example);

    TSysConfig selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TSysConfig record, @Param("example") TSysConfigExample example);

    int updateByExample(@Param("record") TSysConfig record, @Param("example") TSysConfigExample example);

    int updateByPrimaryKeySelective(TSysConfig record);

    int updateByPrimaryKey(TSysConfig record);
}