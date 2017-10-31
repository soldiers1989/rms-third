package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.List;
import java.util.Map;

/**
 *
 * @description 鹏元服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IPengYuanService {

    JSONObject queryPengYuanData(Long taskId,  Map<String,Object> carInfo);

    ResponseResult queryPyCarDatas(Map<String,Object> carInfo, Map<String,Object> commonParams)throws Exception;
}
