package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.TJieanTransferLog;
import com.jzfq.rms.third.common.domain.example.TJieanTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TJieanTransferLogMapper {
    long countByExample(TJieanTransferLogExample example);

    int deleteByExample(TJieanTransferLogExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TJieanTransferLog record);

    int insertSelective(TJieanTransferLog record);

    List<TJieanTransferLog> selectByExampleWithBLOBs(TJieanTransferLogExample example);

    List<TJieanTransferLog> selectByExample(TJieanTransferLogExample example);

    TJieanTransferLog selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TJieanTransferLog record, @Param("example") TJieanTransferLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TJieanTransferLog record, @Param("example") TJieanTransferLogExample example);

    int updateByExample(@Param("record") TJieanTransferLog record, @Param("example") TJieanTransferLogExample example);

    int updateByPrimaryKeySelective(TJieanTransferLog record);

    int updateByPrimaryKeyWithBLOBs(TJieanTransferLog record);

    int updateByPrimaryKey(TJieanTransferLog record);
}