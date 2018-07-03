package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdBrSwiftOrderData;
import com.jzfq.rms.third.common.domain.example.TThirdBrSwiftOrderDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdBrSwiftOrderDataMapper {
    int countByExample(TThirdBrSwiftOrderDataExample example);

    int deleteByExample(TThirdBrSwiftOrderDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdBrSwiftOrderData record);

    int insertSelective(TThirdBrSwiftOrderData record);

    List<TThirdBrSwiftOrderData> selectByExample(TThirdBrSwiftOrderDataExample example);

    TThirdBrSwiftOrderData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdBrSwiftOrderData record, @Param("example") TThirdBrSwiftOrderDataExample example);

    int updateByExample(@Param("record") TThirdBrSwiftOrderData record, @Param("example") TThirdBrSwiftOrderDataExample example);

    int updateByPrimaryKeySelective(TThirdBrSwiftOrderData record);

    int updateByPrimaryKey(TThirdBrSwiftOrderData record);
}