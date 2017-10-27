package com.jzfq.rms.third.support.response.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:43.
 **/
public class JieanResponseHandler extends AbstractResponseHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult getResult() {
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String interfaceId = StringUtil.getString(commonParams,"interfaceId");
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN01.getCode(),interfaceId)){
            return handle01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN02.getCode(),interfaceId)){
            return handle02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN03.getCode(),interfaceId)){
            return handle03();
        }
        return (ResponseResult)params.get("response");
    }

    /**
     * 初始化
     *
     * @param params
     */
    @Override
    public void init(Map<String, Object> params) {
        this.params = params;
    }

    private ResponseResult handle01(){
        return null;
    }
    private ResponseResult handle02(){
        return null;
    }
    private ResponseResult handle03(){
        return null;
    }
}
