package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdGeoipInfoData;
import com.jzfq.rms.third.common.domain.example.TThirdTdGeoipInfoDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdGeoipInfoDataMapper {
    int countByExample(TThirdTdGeoipInfoDataExample example);

    int deleteByExample(TThirdTdGeoipInfoDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdGeoipInfoData record);

    int insertSelective(TThirdTdGeoipInfoData record);

    List<TThirdTdGeoipInfoData> selectByExample(TThirdTdGeoipInfoDataExample example);

    TThirdTdGeoipInfoData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdGeoipInfoData record, @Param("example") TThirdTdGeoipInfoDataExample example);

    int updateByExample(@Param("record") TThirdTdGeoipInfoData record, @Param("example") TThirdTdGeoipInfoDataExample example);

    int updateByPrimaryKeySelective(TThirdTdGeoipInfoData record);

    int updateByPrimaryKey(TThirdTdGeoipInfoData record);
}