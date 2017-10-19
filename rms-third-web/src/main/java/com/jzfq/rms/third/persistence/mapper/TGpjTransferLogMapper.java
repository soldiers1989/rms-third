package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TGpjTransferLog;
import com.jzfq.rms.third.common.domain.example.TGpjTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGpjTransferLogMapper {
    long countByExample(TGpjTransferLogExample example);

    int deleteByExample(TGpjTransferLogExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TGpjTransferLog record);

    int insertSelective(TGpjTransferLog record);

    List<TGpjTransferLog> selectByExampleWithBLOBs(TGpjTransferLogExample example);

    List<TGpjTransferLog> selectByExample(TGpjTransferLogExample example);

    TGpjTransferLog selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TGpjTransferLog record, @Param("example") TGpjTransferLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TGpjTransferLog record, @Param("example") TGpjTransferLogExample example);

    int updateByExample(@Param("record") TGpjTransferLog record, @Param("example") TGpjTransferLogExample example);

    int updateByPrimaryKeySelective(TGpjTransferLog record);

    int updateByPrimaryKeyWithBLOBs(TGpjTransferLog record);

    int updateByPrimaryKey(TGpjTransferLog record);
}