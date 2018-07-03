package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdGongpingjiaData;
import com.jzfq.rms.third.common.domain.example.TThirdGongpingjiaDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TThirdGongpingjiaDataMapper {
    int countByExample(TThirdGongpingjiaDataExample example);

    int deleteByExample(TThirdGongpingjiaDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdGongpingjiaData record);

    int insertSelective(TThirdGongpingjiaData record);

    List<TThirdGongpingjiaData> selectByExample(TThirdGongpingjiaDataExample example);

    TThirdGongpingjiaData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdGongpingjiaData record, @Param("example") TThirdGongpingjiaDataExample example);

    int updateByExample(@Param("record") TThirdGongpingjiaData record, @Param("example") TThirdGongpingjiaDataExample example);

    int updateByPrimaryKeySelective(TThirdGongpingjiaData record);

    int updateByPrimaryKey(TThirdGongpingjiaData record);
}