package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TJieanPhoneData;
import com.jzfq.rms.third.common.domain.example.TJieanPhoneDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TJieanPhoneDataMapper {
    long countByExample(TJieanPhoneDataExample example);

    int deleteByExample(TJieanPhoneDataExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TJieanPhoneData record);

    int insertSelective(TJieanPhoneData record);

    List<TJieanPhoneData> selectByExample(TJieanPhoneDataExample example);

    TJieanPhoneData selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TJieanPhoneData record, @Param("example") TJieanPhoneDataExample example);

    int updateByExample(@Param("record") TJieanPhoneData record, @Param("example") TJieanPhoneDataExample example);

    int updateByPrimaryKeySelective(TJieanPhoneData record);

    int updateByPrimaryKey(TJieanPhoneData record);
}