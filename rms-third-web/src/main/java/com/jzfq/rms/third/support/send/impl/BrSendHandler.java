package com.jzfq.rms.third.support.send.impl;

import com.bfd.facade.MerchantServer;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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
            return getBrScore();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_BR02.getCode(),(String)this.getParams().get("interfaceId"))){
            return getBrFourItemsOfBank();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_BR03.getCode(),(String)this.getParams().get("interfaceId"))){
            return getBrLogin();
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

    /**
     * 登陆事件
     * @return
     * @throws Exception
     */
    private ResponseResult getBrLogin() throws Exception{
        MerchantServer ms = (MerchantServer)this.getParams().get("ms");
        String userName = (String)getBizParams().get("userName");
        String pwd = (String)getBizParams().get("pwd");
        String apicode = (String)getBizParams().get("apicode");
        String loginName = (String)getBizParams().get("loginName");
        String loginResult = ms.login(userName, pwd,loginName, apicode);
        return new ResponseResult(this.getParams().get("traceId").toString(), ReturnCode.REQUEST_SUCCESS,loginResult);
    }

    private ResponseResult getBrFourItemsOfBank(){
        return null;
    }

    private ResponseResult getBrScore() throws Exception{
        MerchantServer ms = (MerchantServer)this.getParams().get("ms");
        String apicode = (String)getBizParams().get("apicode");
        String data = ms.getApiData(getJsonData(), apicode);
        return new ResponseResult(this.getParams().get("traceId").toString(), ReturnCode.REQUEST_SUCCESS,data);
    }

    private String getJsonData(){
        String token = (String)getParams().get("token");
        RiskPersonalInfo personInfo = (RiskPersonalInfo)getParams().get("personInfo");
        JSONObject params = new JSONObject();
        JSONObject reqData = new JSONObject();
        JSONArray cells=new JSONArray();
        params.put("apiName", "strategyApi");
        params.put("tokenid", token);
        reqData.put("id",personInfo.getCertCardNo());
        cells.add(personInfo.getMobile());
        reqData.put("cell",cells);
        reqData.put("name",personInfo.getName());
        reqData.put("strategy_id", "STR0000106");
//			reqData.put("event", "antifraud_register");
//			reqData.put("gid", "4a88dfca3d9fac3a_871166f4271e58fa_151642eca38");
        params.put("reqData", reqData);
        return params.toString();
    }
}
