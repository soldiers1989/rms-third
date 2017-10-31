package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.Map;

/**
 *
 * @description 聚信立数据服务
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IJxlDataService {
	/**
	 * 获取用户报告状态
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param category
	 * @return
	 */
	ResponseResult queryStatus(String customerName, String idCard, String phone, String category);
	/**
	 * 获取jxl所有用户报告数据
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param commonParams
	 * @return
	 */
	JSONObject queryJxlData(String customerName, String idCard, String phone,Map<String,Object> commonParams);

	/**
	 * 获取用户报告
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param commonParams
	 * @return
	 */
	JSONObject queryAccessReportData(String customerName, String idCard, String phone , Map<String,Object> commonParams );
}
