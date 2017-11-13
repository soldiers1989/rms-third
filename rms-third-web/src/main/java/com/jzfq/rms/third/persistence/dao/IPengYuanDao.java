package com.jzfq.rms.third.persistence.dao;

import com.jzfq.rms.third.common.domain.TPyCarCheck;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 14:29.
 **/
public interface IPengYuanDao {

    String getPyUrl();

    /**
     * 车辆信息审查数据
     * @param name
     * @param documentNo
     * @param lisence
     * @param carType
     * @param outTime
     * @return
     */
    List<TPyCarCheck> getPengYuanData(String name, String documentNo, String lisence, String carType,Integer outTime);
}
