package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @description 聚信立数据服务
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IJxlDataService {

	public JSONObject queryJxlData(String customerName, String idCard, String phone);
	public String queryStatus(String customerName, String idCard, String phone, String category);
	public JSONObject queryAccessReportData(String customerName, String idCard, String phone);
}
