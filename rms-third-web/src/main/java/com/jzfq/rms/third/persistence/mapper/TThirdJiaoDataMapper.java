package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdJiaoData;
import com.jzfq.rms.third.common.domain.example.TThirdJiaoDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdJiaoDataMapper {
    int countByExample(TThirdJiaoDataExample example);

    int deleteByExample(TThirdJiaoDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdJiaoData record);

    int insertSelective(TThirdJiaoData record);

    List<TThirdJiaoData> selectByExample(TThirdJiaoDataExample example);

    TThirdJiaoData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdJiaoData record, @Param("example") TThirdJiaoDataExample example);

    int updateByExample(@Param("record") TThirdJiaoData record, @Param("example") TThirdJiaoDataExample example);

    int updateByPrimaryKeySelective(TThirdJiaoData record);

    int updateByPrimaryKey(TThirdJiaoData record);
}