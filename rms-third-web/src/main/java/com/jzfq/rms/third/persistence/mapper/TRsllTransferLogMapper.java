package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TRsllTransferLog;
import com.jzfq.rms.third.common.domain.example.TRsllTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TRsllTransferLogMapper {
    long countByExample(TRsllTransferLogExample example);

    int deleteByExample(TRsllTransferLogExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TRsllTransferLog record);

    int insertSelective(TRsllTransferLog record);

    List<TRsllTransferLog> selectByExampleWithBLOBs(TRsllTransferLogExample example);

    List<TRsllTransferLog> selectByExample(TRsllTransferLogExample example);

    TRsllTransferLog selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TRsllTransferLog record, @Param("example") TRsllTransferLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TRsllTransferLog record, @Param("example") TRsllTransferLogExample example);

    int updateByExample(@Param("record") TRsllTransferLog record, @Param("example") TRsllTransferLogExample example);

    int updateByPrimaryKeySelective(TRsllTransferLog record);

    int updateByPrimaryKeyWithBLOBs(TRsllTransferLog record);

    int updateByPrimaryKey(TRsllTransferLog record);
}