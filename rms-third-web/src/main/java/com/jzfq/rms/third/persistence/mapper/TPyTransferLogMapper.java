package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TPyTransferLog;
import com.jzfq.rms.third.common.domain.example.TPyTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TPyTransferLogMapper {
    long countByExample(TPyTransferLogExample example);

    int deleteByExample(TPyTransferLogExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TPyTransferLog record);

    int insertSelective(TPyTransferLog record);

    List<TPyTransferLog> selectByExampleWithBLOBs(TPyTransferLogExample example);

    List<TPyTransferLog> selectByExample(TPyTransferLogExample example);

    TPyTransferLog selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TPyTransferLog record, @Param("example") TPyTransferLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TPyTransferLog record, @Param("example") TPyTransferLogExample example);

    int updateByExample(@Param("record") TPyTransferLog record, @Param("example") TPyTransferLogExample example);

    int updateByPrimaryKeySelective(TPyTransferLog record);

    int updateByPrimaryKeyWithBLOBs(TPyTransferLog record);

    int updateByPrimaryKey(TPyTransferLog record);
}