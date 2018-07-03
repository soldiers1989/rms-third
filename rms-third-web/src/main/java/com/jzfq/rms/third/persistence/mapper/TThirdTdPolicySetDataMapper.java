package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdPolicySetData;
import com.jzfq.rms.third.common.domain.example.TThirdTdPolicySetDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdPolicySetDataMapper {
    int countByExample(TThirdTdPolicySetDataExample example);

    int deleteByExample(TThirdTdPolicySetDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdPolicySetData record);

    int insertSelective(TThirdTdPolicySetData record);

    List<TThirdTdPolicySetData> selectByExample(TThirdTdPolicySetDataExample example);

    TThirdTdPolicySetData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdPolicySetData record, @Param("example") TThirdTdPolicySetDataExample example);

    int updateByExample(@Param("record") TThirdTdPolicySetData record, @Param("example") TThirdTdPolicySetDataExample example);

    int updateByPrimaryKeySelective(TThirdTdPolicySetData record);

    int updateByPrimaryKey(TThirdTdPolicySetData record);
}