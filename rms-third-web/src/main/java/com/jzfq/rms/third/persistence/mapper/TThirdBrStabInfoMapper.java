package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdBrStabInfo;
import com.jzfq.rms.third.common.domain.example.TThirdBrStabInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdBrStabInfoMapper {
    int countByExample(TThirdBrStabInfoExample example);

    int deleteByExample(TThirdBrStabInfoExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdBrStabInfo record);

    int insertSelective(TThirdBrStabInfo record);

    List<TThirdBrStabInfo> selectByExample(TThirdBrStabInfoExample example);

    TThirdBrStabInfo selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdBrStabInfo record, @Param("example") TThirdBrStabInfoExample example);

    int updateByExample(@Param("record") TThirdBrStabInfo record, @Param("example") TThirdBrStabInfoExample example);

    int updateByPrimaryKeySelective(TThirdBrStabInfo record);

    int updateByPrimaryKey(TThirdBrStabInfo record);
}