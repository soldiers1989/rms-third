package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdBrSpecialList;
import com.jzfq.rms.third.common.domain.example.TThirdBrSpecialListExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdBrSpecialListMapper {
    int countByExample(TThirdBrSpecialListExample example);

    int deleteByExample(TThirdBrSpecialListExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdBrSpecialList record);

    int insertSelective(TThirdBrSpecialList record);

    List<TThirdBrSpecialList> selectByExample(TThirdBrSpecialListExample example);

    TThirdBrSpecialList selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdBrSpecialList record, @Param("example") TThirdBrSpecialListExample example);

    int updateByExample(@Param("record") TThirdBrSpecialList record, @Param("example") TThirdBrSpecialListExample example);

    int updateByPrimaryKeySelective(TThirdBrSpecialList record);

    int updateByPrimaryKey(TThirdBrSpecialList record);
}