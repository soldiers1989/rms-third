package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTdH5Data;
import com.jzfq.rms.third.common.domain.example.TThirdTdH5DataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdTdH5DataMapper {
    int countByExample(TThirdTdH5DataExample example);

    int deleteByExample(TThirdTdH5DataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTdH5Data record);

    int insertSelective(TThirdTdH5Data record);

    List<TThirdTdH5Data> selectByExample(TThirdTdH5DataExample example);

    TThirdTdH5Data selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTdH5Data record, @Param("example") TThirdTdH5DataExample example);

    int updateByExample(@Param("record") TThirdTdH5Data record, @Param("example") TThirdTdH5DataExample example);

    int updateByPrimaryKeySelective(TThirdTdH5Data record);

    int updateByPrimaryKey(TThirdTdH5Data record);
}