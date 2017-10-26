package com.jzfq.rms.third.support.response;

import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 15:07.
 **/
public interface IResponseHandler {
    /**
     * 发送
     * @return
     */
    ResponseResult getResult() throws Exception;

    /**
     * 初始化
     * @param params
     */
    void init(Map<String, Object> params);
}
