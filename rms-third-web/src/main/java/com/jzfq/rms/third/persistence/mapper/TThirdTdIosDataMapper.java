package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdIosData;
import com.jzfq.rms.third.common.domain.example.TThirdTdIosDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdIosDataMapper {
    int countByExample(TThirdTdIosDataExample example);

    int deleteByExample(TThirdTdIosDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdIosData record);

    int insertSelective(TThirdTdIosData record);

    List<TThirdTdIosData> selectByExample(TThirdTdIosDataExample example);

    TThirdTdIosData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdIosData record, @Param("example") TThirdTdIosDataExample example);

    int updateByExample(@Param("record") TThirdTdIosData record, @Param("example") TThirdTdIosDataExample example);

    int updateByPrimaryKeySelective(TThirdTdIosData record);

    int updateByPrimaryKey(TThirdTdIosData record);
}