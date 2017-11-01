package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bfd.facade.MerchantServer;
import com.br.bean.MerchantBean;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.ISendMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

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

    private static final String TOKEN_KEY = "tokenid";

    private static final String CODE_KEY = "code";

    @SuppressWarnings("unused")
	private static final String SUCCESS_CODE = "00";

    private static final MerchantServer ms = new MerchantServer();
    @Autowired
    MongoTemplate mongoTemplate;
    @Autowired
    ISendMessageService sendMessegeService;
    /**
     * 登录百融系统 传入类型
     *
     * @param type
     * @return
     */
    private String login(int type, Map<String,Object> params) {
        String loginResult = Constants.EMPTY_STR;
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("url","百融客户端调用方法login");
        commonParams.put("targetId", SystemIdEnum.THIRD_BR.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR03.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        commonParams.put("ms",ms);
        Map<String,Object> bizParams = new HashMap<>();
        if (OFFICE_TYPE == type) {
            bizParams.put("userName",officeUser);
            bizParams.put("pwd",officePwd);
            bizParams.put("apicode",officeApiCode);
        } else if (STU_TYPE == type) {
            bizParams.put("userName",stuUser);
            bizParams.put("pwd",stuPwd);
            bizParams.put("apicode",stuApiCode);
        }
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.BR03.getCode(),commonParams,bizParams);
        if(response.getCode()== ReturnCode.REQUEST_SUCCESS.code()&&response.getData()!=null){
            loginResult = response.getData().toString();
        }
        return loginResult;

    }

    /**
     * 根据类型 获取token
     *
     * @param type
     * @return token
     */
    private String getToken(int type,Map<String,Object> commonParams) {
        if (OFFICE_TYPE == type) {
            if (StringUtils.isEmpty(office_token)) {
                String result = login(type,commonParams);
                if (StringUtils.isEmpty(result)) {
                    //登录失败
                    return Constants.EMPTY_STR;
                }
                office_token = jsonGetKey(result, TOKEN_KEY);
                return office_token;
            }
        } else if (STU_TYPE == type) {
            if (StringUtils.isEmpty(stu_token)) {
                String result = login(type,commonParams);
                if (StringUtils.isEmpty(result)) {
                    //登录失败
                    return Constants.EMPTY_STR;
                }
                stu_token = jsonGetKey(result, TOKEN_KEY);
                return stu_token;
            }
        }
        return Constants.EMPTY_STR;
    }

    private String jsonGetKey(String json, String key) {
        JSONObject jsonObject = JSON.parseObject(json);
        String value = jsonObject.getString(key);
        return value;
    }

    /**
     * 根据url 和类型 查询数据
     *
     * @param bean
     * @param type
     * @return
     */
    public String getApiData(MerchantBean bean, int type,Map<String,Object> commonParams) throws Exception{
        getToken(type,commonParams);
        if (OFFICE_TYPE == type) {
            bean.setTokenid(office_token);
        } else if (STU_TYPE == type) {
            bean.setTokenid(stu_token);
        }
        String data = Constants.EMPTY_STR;
        log.info("请求百融接口参数：{}", JSONObject.toJSON(bean));


        commonParams.put("url","百融客户端调用方法getApiData");
        commonParams.put("targetId", SystemIdEnum.THIRD_BR.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_BR01.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        commonParams.put("ms",ms);
        commonParams.put("bean",bean);

        Map<String ,Object> bizParams = new HashMap<>();
        bizParams.put("customerType",commonParams.get("customerType"));
        bizParams.put("loanType",commonParams.get("loanType"));
        bizParams.put("personInfo",commonParams.get("personInfo"));
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.BR01.getCode(),commonParams,bizParams);
        data = (String) response.getData();
        log.info("百融返回结果：[ "+data+" ]");
        String code = jsonGetKey(data, CODE_KEY);
        if (Constants.EMPTY_STR.equals(data)) {
            throw new BusinessException(10,"登录失败如何处理",true);
        } else if (RETRY_CODE.equals(code)) {
            //只重新登录一次，如果还失败，不做处理
            if (OFFICE_TYPE == type) {
                office_token = Constants.EMPTY_STR;
                getToken(type,commonParams);
                bean.setTokenid(office_token);
            } else if (STU_TYPE == type) {
                stu_token = Constants.EMPTY_STR;
                getToken(type,commonParams);
                bean.setTokenid(stu_token);
            }
            log.info("token失效后再次请求百融接口参数：{}", JSONObject.toJSON(bean));
            log.info("请求百融接口参数：{}",data);
            response = sendMessegeService.sendByThreeChance(SendMethodEnum.BR01.getCode(),commonParams,bizParams);
            data = (String) response.getData();
        }
        return data;
    }

    public String getApiCode(int type) {
        if (OFFICE_TYPE == type) {
            return this.officeApiCode;
        } else if (STU_TYPE == type) {
            return this.stuApiCode;
        }
        return Constants.EMPTY_STR;
    }
}
