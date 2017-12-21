package com.jzfq.rms.third.service;

import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.mongo.BrPostData;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 15:20.
 **/
public interface IBrPostService {

    String getApiData(RiskPersonalInfo info, int type, Map<String, Object> commonParams) throws Exception;
}
