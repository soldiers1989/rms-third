package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TBrTransferLog;
import com.jzfq.rms.third.common.domain.example.TBrTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TBrTransferLogMapper {
    long countByExample(TBrTransferLogExample example);

    int deleteByExample(TBrTransferLogExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TBrTransferLog record);

    int insertSelective(TBrTransferLog record);

    List<TBrTransferLog> selectByExampleWithBLOBs(TBrTransferLogExample example);

    List<TBrTransferLog> selectByExample(TBrTransferLogExample example);

    TBrTransferLog selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TBrTransferLog record, @Param("example") TBrTransferLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TBrTransferLog record, @Param("example") TBrTransferLogExample example);

    int updateByExample(@Param("record") TBrTransferLog record, @Param("example") TBrTransferLogExample example);

    int updateByPrimaryKeySelective(TBrTransferLog record);

    int updateByPrimaryKeyWithBLOBs(TBrTransferLog record);

    int updateByPrimaryKey(TBrTransferLog record);
}