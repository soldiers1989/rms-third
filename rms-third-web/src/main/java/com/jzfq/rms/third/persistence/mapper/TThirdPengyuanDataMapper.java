package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdPengyuanData;
import com.jzfq.rms.third.common.domain.example.TThirdPengyuanDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdPengyuanDataMapper {
    int countByExample(TThirdPengyuanDataExample example);

    int deleteByExample(TThirdPengyuanDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdPengyuanData record);

    int insertSelective(TThirdPengyuanData record);

    List<TThirdPengyuanData> selectByExample(TThirdPengyuanDataExample example);

    TThirdPengyuanData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdPengyuanData record, @Param("example") TThirdPengyuanDataExample example);

    int updateByExample(@Param("record") TThirdPengyuanData record, @Param("example") TThirdPengyuanDataExample example);

    int updateByPrimaryKeySelective(TThirdPengyuanData record);

    int updateByPrimaryKey(TThirdPengyuanData record);
}