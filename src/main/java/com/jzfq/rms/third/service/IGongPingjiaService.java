package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.dto.CarDetailModelConditionDTO;
import com.jzfq.rms.third.common.dto.ResponseDTO;
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
     * 获取车型库数据
     * @param params
     * @return
     */
    ResponseDTO queryCarDetailModels(CarDetailModelConditionDTO params);
}
