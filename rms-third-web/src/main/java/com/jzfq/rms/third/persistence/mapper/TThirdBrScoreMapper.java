package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdBrScore;
import com.jzfq.rms.third.common.domain.example.TThirdBrScoreExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdBrScoreMapper {
    int countByExample(TThirdBrScoreExample example);

    int deleteByExample(TThirdBrScoreExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdBrScore record);

    int insertSelective(TThirdBrScore record);

    List<TThirdBrScore> selectByExample(TThirdBrScoreExample example);

    TThirdBrScore selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdBrScore record, @Param("example") TThirdBrScoreExample example);

    int updateByExample(@Param("record") TThirdBrScore record, @Param("example") TThirdBrScoreExample example);

    int updateByPrimaryKeySelective(TThirdBrScore record);

    int updateByPrimaryKey(TThirdBrScore record);
}