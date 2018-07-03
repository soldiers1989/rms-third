package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdAttributionData;
import com.jzfq.rms.third.common.domain.example.TThirdTdAttributionDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdAttributionDataMapper {
    int countByExample(TThirdTdAttributionDataExample example);

    int deleteByExample(TThirdTdAttributionDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdAttributionData record);

    int insertSelective(TThirdTdAttributionData record);

    List<TThirdTdAttributionData> selectByExample(TThirdTdAttributionDataExample example);

    TThirdTdAttributionData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdAttributionData record, @Param("example") TThirdTdAttributionDataExample example);

    int updateByExample(@Param("record") TThirdTdAttributionData record, @Param("example") TThirdTdAttributionDataExample example);

    int updateByPrimaryKeySelective(TThirdTdAttributionData record);

    int updateByPrimaryKey(TThirdTdAttributionData record);
}