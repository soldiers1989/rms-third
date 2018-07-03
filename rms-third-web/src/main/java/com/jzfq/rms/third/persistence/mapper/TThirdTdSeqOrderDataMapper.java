package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdSeqOrderData;
import com.jzfq.rms.third.common.domain.example.TThirdTdSeqOrderDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdSeqOrderDataMapper {
    int countByExample(TThirdTdSeqOrderDataExample example);

    int deleteByExample(TThirdTdSeqOrderDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdSeqOrderData record);

    int insertSelective(TThirdTdSeqOrderData record);

    List<TThirdTdSeqOrderData> selectByExample(TThirdTdSeqOrderDataExample example);

    TThirdTdSeqOrderData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdSeqOrderData record, @Param("example") TThirdTdSeqOrderDataExample example);

    int updateByExample(@Param("record") TThirdTdSeqOrderData record, @Param("example") TThirdTdSeqOrderDataExample example);

    int updateByPrimaryKeySelective(TThirdTdSeqOrderData record);

    int updateByPrimaryKey(TThirdTdSeqOrderData record);
}