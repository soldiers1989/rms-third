package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TJxlToken;
import com.jzfq.rms.third.common.domain.example.TJxlTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TJxlTokenMapper {
    long countByExample(TJxlTokenExample example);

    int deleteByExample(TJxlTokenExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TJxlToken record);

    int insertSelective(TJxlToken record);

    List<TJxlToken> selectByExample(TJxlTokenExample example);

    TJxlToken selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TJxlToken record, @Param("example") TJxlTokenExample example);

    int updateByExample(@Param("record") TJxlToken record, @Param("example") TJxlTokenExample example);

    int updateByPrimaryKeySelective(TJxlToken record);

    int updateByPrimaryKey(TJxlToken record);
}