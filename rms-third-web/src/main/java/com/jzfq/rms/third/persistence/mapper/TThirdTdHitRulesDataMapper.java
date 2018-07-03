package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdHitRulesData;
import com.jzfq.rms.third.common.domain.example.TThirdTdHitRulesDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdHitRulesDataMapper {
    int countByExample(TThirdTdHitRulesDataExample example);

    int deleteByExample(TThirdTdHitRulesDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdHitRulesData record);

    int insertSelective(TThirdTdHitRulesData record);

    List<TThirdTdHitRulesData> selectByExample(TThirdTdHitRulesDataExample example);

    TThirdTdHitRulesData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdHitRulesData record, @Param("example") TThirdTdHitRulesDataExample example);

    int updateByExample(@Param("record") TThirdTdHitRulesData record, @Param("example") TThirdTdHitRulesDataExample example);

    int updateByPrimaryKeySelective(TThirdTdHitRulesData record);

    int updateByPrimaryKey(TThirdTdHitRulesData record);
}