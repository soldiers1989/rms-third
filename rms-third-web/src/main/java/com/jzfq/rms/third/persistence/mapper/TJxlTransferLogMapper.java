package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TJxlTransferLog;
import com.jzfq.rms.third.common.domain.example.TJxlTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJxlTransferLogMapper {
    long countByExample(TJxlTransferLogExample example);

    int deleteByExample(TJxlTransferLogExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TJxlTransferLog record);

    int insertSelective(TJxlTransferLog record);

    List<TJxlTransferLog> selectByExampleWithBLOBs(TJxlTransferLogExample example);

    List<TJxlTransferLog> selectByExample(TJxlTransferLogExample example);

    TJxlTransferLog selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TJxlTransferLog record, @Param("example") TJxlTransferLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TJxlTransferLog record, @Param("example") TJxlTransferLogExample example);

    int updateByExample(@Param("record") TJxlTransferLog record, @Param("example") TJxlTransferLogExample example);

    int updateByPrimaryKeySelective(TJxlTransferLog record);

    int updateByPrimaryKeyWithBLOBs(TJxlTransferLog record);

    int updateByPrimaryKey(TJxlTransferLog record);
}