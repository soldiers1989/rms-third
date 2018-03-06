package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.dto.ResponseResult;

public interface IPushDataService {


    void  pushData(String traceId,String type, String score, String mobile,String orderNo);


}
