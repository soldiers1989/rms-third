package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.domain.SysTask;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;

import java.util.List;

/**
 *
 * @description 公平价服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IGongPingjiaService {

    /**
     * 公平价估值信息查询
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    List<EvaluationInfoVo> queryGaopingjiaEvalation(String vin, String licensePlatHeader);

    /**
     * 批量更新车型库-全量
     */
    void insertAllCarDetailModels(SysTask task);
    /**
     * 批量更新车型库-局部
     */
    void updateCarDetailModels(SysTask task);
    /**
     * 批量更新车型库-现存
     */
    int getCountCarDetailModels();
}
