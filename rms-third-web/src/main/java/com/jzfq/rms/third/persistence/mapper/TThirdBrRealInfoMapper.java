package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdBrRealInfo;
import com.jzfq.rms.third.common.domain.example.TThirdBrRealInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdBrRealInfoMapper {
    int countByExample(TThirdBrRealInfoExample example);

    int deleteByExample(TThirdBrRealInfoExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdBrRealInfo record);

    int insertSelective(TThirdBrRealInfo record);

    List<TThirdBrRealInfo> selectByExample(TThirdBrRealInfoExample example);

    TThirdBrRealInfo selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdBrRealInfo record, @Param("example") TThirdBrRealInfoExample example);

    int updateByExample(@Param("record") TThirdBrRealInfo record, @Param("example") TThirdBrRealInfoExample example);

    int updateByPrimaryKeySelective(TThirdBrRealInfo record);

    int updateByPrimaryKey(TThirdBrRealInfo record);
}