package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdBrConsInfo;
import com.jzfq.rms.third.common.domain.example.TThirdBrConsInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdBrConsInfoMapper {
    int countByExample(TThirdBrConsInfoExample example);

    int deleteByExample(TThirdBrConsInfoExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdBrConsInfo record);

    int insertSelective(TThirdBrConsInfo record);

    List<TThirdBrConsInfo> selectByExample(TThirdBrConsInfoExample example);

    TThirdBrConsInfo selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdBrConsInfo record, @Param("example") TThirdBrConsInfoExample example);

    int updateByExample(@Param("record") TThirdBrConsInfo record, @Param("example") TThirdBrConsInfoExample example);

    int updateByPrimaryKeySelective(TThirdBrConsInfo record);

    int updateByPrimaryKey(TThirdBrConsInfo record);
}