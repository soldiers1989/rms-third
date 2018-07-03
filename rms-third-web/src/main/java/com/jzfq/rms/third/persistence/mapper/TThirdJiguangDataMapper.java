package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdJiguangData;
import com.jzfq.rms.third.common.domain.example.TThirdJiguangDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdJiguangDataMapper {
    int countByExample(TThirdJiguangDataExample example);

    int deleteByExample(TThirdJiguangDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdJiguangData record);

    int insertSelective(TThirdJiguangData record);

    List<TThirdJiguangData> selectByExample(TThirdJiguangDataExample example);

    TThirdJiguangData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdJiguangData record, @Param("example") TThirdJiguangDataExample example);

    int updateByExample(@Param("record") TThirdJiguangData record, @Param("example") TThirdJiguangDataExample example);

    int updateByPrimaryKeySelective(TThirdJiguangData record);

    int updateByPrimaryKey(TThirdJiguangData record);
}