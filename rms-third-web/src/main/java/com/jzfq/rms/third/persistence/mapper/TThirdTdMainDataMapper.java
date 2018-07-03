package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdMainData;
import com.jzfq.rms.third.common.domain.example.TThirdTdMainDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdMainDataMapper {
    int countByExample(TThirdTdMainDataExample example);

    int deleteByExample(TThirdTdMainDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdMainData record);

    int insertSelective(TThirdTdMainData record);

    List<TThirdTdMainData> selectByExample(TThirdTdMainDataExample example);

    TThirdTdMainData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdMainData record, @Param("example") TThirdTdMainDataExample example);

    int updateByExample(@Param("record") TThirdTdMainData record, @Param("example") TThirdTdMainDataExample example);

    int updateByPrimaryKeySelective(TThirdTdMainData record);

    int updateByPrimaryKey(TThirdTdMainData record);
}