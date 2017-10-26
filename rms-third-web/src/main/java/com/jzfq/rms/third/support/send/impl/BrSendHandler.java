package com.jzfq.rms.third.support.send.impl;

import cn.fraudmetrix.riskservice.object.Environment;
import com.bfd.facade.MerchantServer;
import com.br.bean.MerchantBean;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:47.
 **/
public class BrSendHandler extends AbstractSendHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() throws Exception{
        if(StringUtils.equals(InterfaceIdEnum.THIRD_BR01.getCode(),(String)this.getParams().get("interfaceId"))){
            return getBrData01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_BR02.getCode(),(String)this.getParams().get("interfaceId"))){
            return getBrData02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_BR03.getCode(),(String)this.getParams().get("interfaceId"))){
            return getBrData03();
        }
        return null;
    }

    /**
     * 初始化
     *
     * @param params
     * @param bizParams
     */
    @Override
    public void init(Map<String, Object> params, Map<String, Object> bizParams) {
        this.setParams(params);
        this.setBizParams(bizParams);
    }

    private ResponseResult getBrData01() throws Exception{
        MerchantServer ms = (MerchantServer)this.getParams().get("ms");
        MerchantBean bean = (MerchantBean)this.getBizParams().get("bean");
        String data = ms.getApiData(bean);
        return new ResponseResult(this.getParams().get("traceId").toString(), ReturnCode.REQUEST_SUCCESS,data);
    }

    private ResponseResult getBrData02(){
        return null;
    }

    private ResponseResult getBrData03() throws Exception{
        MerchantServer ms = (MerchantServer)this.getParams().get("ms");
        String userName = (String)getBizParams().get("userName");
        String pwd = (String)getBizParams().get("pwd");
        String apicode = (String)getBizParams().get("apicode");
        String loginResult = ms.login(userName, pwd, apicode);
        return new ResponseResult(this.getParams().get("traceId").toString(), ReturnCode.REQUEST_SUCCESS,loginResult);
    }
}