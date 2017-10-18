package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bfd.facade.MerchantServer;
import com.br.bean.MerchantBean;
import com.jzfq.rms.third.constant.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    /**
     * 登录百融系统 传入类型
     *
     * @param type
     * @return
     */
    private String login(int type) {
        String loginResult = Constants.EMPTY_STR;
        try {
            if (OFFICE_TYPE == type) {
                loginResult = ms.login(officeUser, officePwd, officeApiCode);
            } else if (STU_TYPE == type) {
                loginResult = ms.login(stuUser, stuPwd, stuApiCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("登录失败{}", e);
        }
        return loginResult;

    }

    /**
     * 根据类型 获取token
     *
     * @param type
     * @return token
     */
    private String getToken(int type) {
        if (OFFICE_TYPE == type) {
            if (StringUtils.isEmpty(office_token)) {
                String result = login(type);
                if (StringUtils.isEmpty(result)) {
                    //登录失败
                    return Constants.EMPTY_STR;
                }
                office_token = jsonGetKey(result, TOKEN_KEY);
                return office_token;
            }
        } else if (STU_TYPE == type) {
            if (StringUtils.isEmpty(stu_token)) {
                String result = login(type);
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
    public String getApiData(MerchantBean bean, int type) {
        getToken(type);
        if (OFFICE_TYPE == type) {
            bean.setTokenid(office_token);
        } else if (STU_TYPE == type) {
            bean.setTokenid(stu_token);
        }
        String data = Constants.EMPTY_STR;
        log.info("请求百融接口参数：{}", JSONObject.toJSON(bean));
        try {
            data = ms.getApiData(bean);
            log.info("百融返回结果：[ "+data+" ]");
            String code = jsonGetKey(data, CODE_KEY);
            if (Constants.EMPTY_STR.equals(data)) {
                //登录失败如何处理
            } else if (RETRY_CODE.equals(code)) {
                //只重新登录一次，如果还失败，不做处理
                if (OFFICE_TYPE == type) {
                    office_token = Constants.EMPTY_STR;
                    getToken(type);
                    bean.setTokenid(office_token);
                } else if (STU_TYPE == type) {
                    stu_token = Constants.EMPTY_STR;
                    getToken(type);
                    bean.setTokenid(stu_token);
                }
                log.info("token失效后再次请求百融接口参数：{}", JSONObject.toJSON(bean));
                log.info("请求百融接口参数：{}",data);
                data = ms.getApiData(bean);
            }

        } catch (Exception e) {
            e.printStackTrace();
            log.error("调用API时失败{}", e);
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
