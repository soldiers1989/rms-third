package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TThirdTransferLog;
import com.jzfq.rms.third.common.domain.example.TThirdTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TThirdTransferLogMapper {
    long countByExample(TThirdTransferLogExample example);

    int deleteByExample(TThirdTransferLogExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TThirdTransferLog record);

    int insertSelective(TThirdTransferLog record);

    List<TThirdTransferLog> selectByExampleWithBLOBs(TThirdTransferLogExample example);

    List<TThirdTransferLog> selectByExample(TThirdTransferLogExample example);

    TThirdTransferLog selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TThirdTransferLog record, @Param("example") TThirdTransferLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TThirdTransferLog record, @Param("example") TThirdTransferLogExample example);

    int updateByExample(@Param("record") TThirdTransferLog record, @Param("example") TThirdTransferLogExample example);

    int updateByPrimaryKeySelective(TThirdTransferLog record);

    int updateByPrimaryKeyWithBLOBs(TThirdTransferLog record);

    int updateByPrimaryKey(TThirdTransferLog record);
}