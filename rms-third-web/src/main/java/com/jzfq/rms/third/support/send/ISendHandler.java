package com.jzfq.rms.third.support.send;

import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 15:07.
 **/
public interface ISendHandler {
    /**
     * 发送
     * @return
     */
    ResponseResult send();

    /**
     * 初始化
     * @param params
     * @param bizParams
     */
    void init(Map<String, Object> params, Map<String, Object> bizParams);
}
