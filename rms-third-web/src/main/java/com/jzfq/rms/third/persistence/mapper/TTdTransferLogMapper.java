package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TTdTransferLog;
import com.jzfq.rms.third.common.domain.example.TTdTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTdTransferLogMapper {
    long countByExample(TTdTransferLogExample example);

    int deleteByExample(TTdTransferLogExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TTdTransferLog record);

    int insertSelective(TTdTransferLog record);

    List<TTdTransferLog> selectByExampleWithBLOBs(TTdTransferLogExample example);

    List<TTdTransferLog> selectByExample(TTdTransferLogExample example);

    TTdTransferLog selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TTdTransferLog record, @Param("example") TTdTransferLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TTdTransferLog record, @Param("example") TTdTransferLogExample example);

    int updateByExample(@Param("record") TTdTransferLog record, @Param("example") TTdTransferLogExample example);

    int updateByPrimaryKeySelective(TTdTransferLog record);

    int updateByPrimaryKeyWithBLOBs(TTdTransferLog record);

    int updateByPrimaryKey(TTdTransferLog record);
}