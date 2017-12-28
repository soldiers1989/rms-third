package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bfd.facade.MerchantServer;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.enums.BrPostUrl;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.ISendMessageService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @description 百融服务
 * @author 大连桔子分期科技有限公司
 *
 */
@Component("brPostService")
public class BrPostService {

    private static final Logger log = LoggerFactory.getLogger("postLogger");
    @Value("${br.office.user}")
    private String officeUser;

    @Value("${br.office.pwd}")
    private String officePwd;

    @Value("${br.office.apicode}")
    private String officeApiCode;

    @Value("${br.stu.user}")
    private String stuUser;

    @Value("${br.stu.pwd}")
    private String stuPwd;

    @Value("${br.stu.apicode}")
    private String stuApiCode;

    private String office_token;

    private String stu_token;

    public static final int OFFICE_TYPE = 0;

    public static final int STU_TYPE = 1;

    public static final int OFFICE_TYPE_XJD = 2;        //客群 还是0 只是现金贷 调用的 分 接口不通

    public static final int STU_TYPE_XJD = 3;        //客群 还是0 只是现金贷 调用的 分 接口不通

    //token失效
    private static final String RETRY_CODE = "100007";

//    private static final String TOKEN_KEY = "tokenid";

    private static final String CODE_KEY = "code";

    @Autowired
    ISendMessageService sendMessegeService;

    private static volatile String tokenid;
    private static MerchantServer ms=new MerchantServer();

    public String getTokenid(Map<String,Object> commonParams){
        if(StringUtils.isBlank(tokenid)){
            synchronized (BrPostService.class) {
                if(StringUtils.isBlank(tokenid)){
                    tokenid = login(commonParams);
                }
            }
        }
        return tokenid;
    }
    /**
     * 登录百融系统 传入类型
     *
     * @return
     */
    private String login(Map<String,Object> params) {
        Map<String,Object> commonParams = getLoginCommonParams();
        Map<String,Object> bizParams = getInterfaceInput();
        ResponseResult response = sendMessegeService
                .sendByThreeChance(SendMethodEnum.BR03.getCode(),commonParams,bizParams);
        if(response.getCode()== ReturnCode.REQUEST_SUCCESS.code()&&response.getData()!=null){
            return response.getData().toString();
        }
        return null;
    }

    /**
     * 登陆事件 公用参数
     * @return
     */
    private Map<String,Object> getLoginCommonParams(){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("url","百融客户端调用方法login");
        commonParams.put("targetId", SystemIdEnum.THIRD_BR.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR03.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        commonParams.put("ms",ms);
        return commonParams;
    }

    /**
     * 登陆事件 业务参数
     */
    private Map<String,Object> getInterfaceInput(){
        Map<String,Object> bizParams = new HashMap<>();
        bizParams.put("userName",stuUser);
        bizParams.put("pwd",stuPwd);
        bizParams.put("apicode",stuApiCode);
        return bizParams;
    }

    /**
     * 根据类型 获取token
     *
     * @return token
     */
    private String getToken(Map<String,Object> commonParams) {
        String result = login(commonParams);
        return result;
    }

    private String jsonGetKey(String json, String key) {
        JSONObject jsonObject = JSON.parseObject(json);
        if(jsonObject == null){
            return Constants.EMPTY_STR;
        }
        String value = jsonObject.getString(key);
        return value;
    }


    private String getEventId( String clientType){
        StringBuilder key = new StringBuilder("dictionary_prefix_");
//        key.append(eventRedisKey).append("_");
//        key.append(channelId).append("-").append(financialProductId)
//                .append("-").append(clientType).append("-").append(operationType);
        return "";
    }
    /**
     * 根据url 和类型 查询数据
     * @param type
     * @return
     */
    public String getApiData(RiskPersonalInfo info,int type,Integer loanType, Map<String,Object> commonParams) throws Exception{
        commonParams.put("url","百融客户端调用方法getApiData");
        commonParams.put("targetId", SystemIdEnum.THIRD_BR.getCode());
        commonParams.put("appId", "");
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        commonParams.put("ms",ms);
        // 登陆 获取token
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR03.getCode());
        String token = getTokenid(commonParams);
        //设置token
        commonParams.put("token",token);
        Map<String ,Object> bizParams = new HashMap<>();
        bizParams.put("channel",commonParams.get("channel"));
        bizParams.put("personInfo",commonParams.get("personInfo"));
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR01.getCode());
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.BR01.getCode(),commonParams,bizParams);
        String data = (String) response.getData();
        log.info("百融返回结果：[ "+data+" ]");
        if (StringUtils.equals(Constants.EMPTY_STR, data)) {
            throw new BusinessException(10,"登录失败",true);
        }
        String code = jsonGetKey(data, CODE_KEY);
        if (!StringUtils.equals(RETRY_CODE, code)) {
            return data;
        }
        //只重新登录一次，如果还失败，不做处理
        // 登陆 获取token
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR03.getCode());
        token = getTokenid(commonParams);
        //设置token
        if(StringUtils.isNotBlank(token)){
            //设置token
            commonParams.put("token",token);
            log.info("请求百融接口参数：{}",data);
            commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR01.getCode());
            response = sendMessegeService.sendByThreeChance(SendMethodEnum.BR01.getCode(),commonParams,bizParams);
            data = (String) response.getData();
        }
        return data;
    }
}
