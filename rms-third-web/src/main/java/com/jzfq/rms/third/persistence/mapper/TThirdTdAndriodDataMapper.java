package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdAndriodData;
import com.jzfq.rms.third.common.domain.example.TThirdTdAndriodDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdAndriodDataMapper {
    int countByExample(TThirdTdAndriodDataExample example);

    int deleteByExample(TThirdTdAndriodDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdAndriodData record);

    int insertSelective(TThirdTdAndriodData record);

    List<TThirdTdAndriodData> selectByExample(TThirdTdAndriodDataExample example);

    TThirdTdAndriodData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdAndriodData record, @Param("example") TThirdTdAndriodDataExample example);

    int updateByExample(@Param("record") TThirdTdAndriodData record, @Param("example") TThirdTdAndriodDataExample example);

    int updateByPrimaryKeySelective(TThirdTdAndriodData record);

    int updateByPrimaryKey(TThirdTdAndriodData record);
}