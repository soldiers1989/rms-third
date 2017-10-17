package com.jzfq.rms.third.persistence.dao;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 17:47.
 **/
public interface IThirdTransferLogDao {
    void insertLog(String thirdKey,String interKye,String proLine,String channel,
                   String code, String status, String msg);
}
