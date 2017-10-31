package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/19 21:49.
 **/
public interface ISendMessageService {
    /**
     * 发送的数据
     * @param method 调用的发送协议方法
     * @param params 需要记录的信息
     * @param bizParams 发送的数据
     * @return
     */
    ResponseResult sendByThreeChance( String method, Map<String, Object> params,Map<String, Object> bizParams);
}
