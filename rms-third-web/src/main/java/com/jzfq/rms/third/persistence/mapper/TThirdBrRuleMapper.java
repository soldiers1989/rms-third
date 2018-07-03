package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdBrRule;
import com.jzfq.rms.third.common.domain.example.TThirdBrRuleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdBrRuleMapper {
    int countByExample(TThirdBrRuleExample example);

    int deleteByExample(TThirdBrRuleExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdBrRule record);

    int insertSelective(TThirdBrRule record);

    List<TThirdBrRule> selectByExample(TThirdBrRuleExample example);

    TThirdBrRule selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdBrRule record, @Param("example") TThirdBrRuleExample example);

    int updateByExample(@Param("record") TThirdBrRule record, @Param("example") TThirdBrRuleExample example);

    int updateByPrimaryKeySelective(TThirdBrRule record);

    int updateByPrimaryKey(TThirdBrRule record);
}