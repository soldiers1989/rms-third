package com.jzfq.rms.third.persistence.dao.impl;

import com.jzfq.rms.third.common.domain.TThirdTransferLog;
import com.jzfq.rms.third.persistence.dao.IThirdTransferLogDao;
import com.jzfq.rms.third.persistence.mapper.TThirdTransferLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 17:55.
 **/
@Component("thirdTransferLogDao")
public class ThirdTransferLogDao implements IThirdTransferLogDao {
    @Autowired
    TThirdTransferLogMapper thirdTransferLogMapper;
    @Override
    public void insertLog(String thirdKey, String interKey, String proLine, String channel,
                          String params, String status, String msg) {
        TThirdTransferLog transferLog = new TThirdTransferLog();
        transferLog.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        transferLog.setcThirdKey(thirdKey);
        transferLog.setcInterfaceKey(interKey);
        transferLog.setcProLine(proLine);
        transferLog.setcParams(params);
        transferLog.setcChannel(channel);
        transferLog.setcStatus(status);
        transferLog.setcMsg(msg);
        transferLog.setDtCreateTime(new Date());
        thirdTransferLogMapper.insert(transferLog);
    }
}
