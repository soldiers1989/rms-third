package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdBrExecutInfo;
import com.jzfq.rms.third.common.domain.example.TThirdBrExecutInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdBrExecutInfoMapper {
    int countByExample(TThirdBrExecutInfoExample example);

    int deleteByExample(TThirdBrExecutInfoExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdBrExecutInfo record);

    int insertSelective(TThirdBrExecutInfo record);

    List<TThirdBrExecutInfo> selectByExample(TThirdBrExecutInfoExample example);

    TThirdBrExecutInfo selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdBrExecutInfo record, @Param("example") TThirdBrExecutInfoExample example);

    int updateByExample(@Param("record") TThirdBrExecutInfo record, @Param("example") TThirdBrExecutInfoExample example);

    int updateByPrimaryKeySelective(TThirdBrExecutInfo record);

    int updateByPrimaryKey(TThirdBrExecutInfo record);
}