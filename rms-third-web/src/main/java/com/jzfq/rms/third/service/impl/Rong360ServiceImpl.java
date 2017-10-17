package com.jzfq.rms.third.service.impl;


import com.jzfq.rms.third.common.utils.RequestUtil;
import com.jzfq.rms.third.service.IRong360Service;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @description 通过OpenApi访问Rong360服务实现
 * @author 大连桔子分期科技有限公司
 *
 */
@Service
public class Rong360ServiceImpl implements IRong360Service {
	/**
	 * 为机构分配的appid，通常是7位数字
	 */
	@Value("${rong360.appId}")
	private String appId;

	@Value("${rong360.sandbox.apiUrl}")
	private String sandboxApiUrl;

	@Value("${rong360.apiUrl}")
	private String apiUrl;

	@Value("${rong360.method.phoneNetworkLength}")
	private String method_phoneNetworkLength;

	@Value("${rong360.method.mobileCheck3item}")
	private String method_mobileCheck3item;

	@Value("${rong360.method.phoneStatus}")
	private String method_phoneStatus;
	@Value("${rong360.callback.address}")
	private String callback_Address;

	/**
	 * 机构的私钥，需要是pkcs8格式的
	 */
	@Value("${rong360.privateKey}")
	private String privateKey;

	/**
	 * 是否是测试环境，测试环境会连接测试环境并打印debug信息,false:生产环境；true：沙箱环境
	 */
	@Value("${rong360.isTestEnv}")
	private boolean isTestEnv;


	/**
	 * 请求OPENAPI接口
	 * @param method 必传参数，表示请求的真实接口，示例如tianji.api.tianjireport.detail等
	 * @param params 系统参数，请求tianji接口不必传
	 * @param bizData 业务参数
	 * @return 请求接口返回的json对象
	 * @throws Exception
	 */
	@Override
	public JSONObject doOpenApiRequest(String method, Map<String, String> params, Map<String, String> bizData) throws Exception {
//		appId="2010174";
//		privateKey="MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBALhedSkkKwkfKtv0"
//		+"USYggjZsmaRiBT3/M2MlPJE33w58G4Q0WoBsLjFRTbNdqeZPl6MPVHs2LpSPxXpk"
//				+"nFmAyDQPExTeUoisrxcaaVca7w5Hqw+NwpZRT6brxy1yY05Fyu5z2nsOQ4g7q8iE"
//				+"i12cQRLDFH6Qv9wISUr1XA1xdOlZAgMBAAECgYABZTWdyhhJSWMZpw+2KijSIKBJ"
//				+"DjTb80KATZfXwYR+p5HNvlexASCYXvUnll3i0FdldIg/JnnTxgLImlpUkxTwzKJ8"
//				+"GQWys3Dv8oV6wm7a6+IjsooqjYydTf/aoiBF0290VxjpP1JjMmQZ+pUnbzih/sX6"
//				+"TakFTj/E67uUNbEDAQJBANwX7AoS3WOPZ8acpwD6NHDeXTmg87+QCcgq55UMF0Pi"
//				+"m/CtjLPFrWF+TbxpypGPFjkUeL783Yz7TWzK3N+1ig0CQQDWcoX8nLcVspTEnIr8"
//				+"OEfo1SvI2NAiscDzh00Zxrk4/RVTC7iOSwGtHtZMtS2v0mQSRakaXl3ThiklNmF2"
//				+"R0V9AkEAmCzOHhT3D7x6kz+C1NEqaxPEP3FCtyOfL9BCeLJ4b46CJYHJdA7slyke"
//				+"FHTNA6F8SxEVf3AUu0KSQPNujhrWDQJAZ1JWbBe1vqaENxaVgGA9hVjv950+6vhp"
//				+"1uvhogG1TFfj5ldHXIeXDypEZkEE+imMPaGCkEnXOwrw2BUTcEF2oQJBANmw24on"
//				+"dENpOF06SFjyNeQ0bBlZRwxoCyuSG7aSL2S348sA08ox7o177HXijexVeR6x09m0"
//				+"imGZ6h87GWgj4XI=";
//		isTestEnv=false;

		String url="";
		if (isTestEnv) {
			url = sandboxApiUrl;
		} else {
			url = apiUrl;
		}
		String result = RequestUtil.request(method, params, bizData, appId, privateKey, isTestEnv, url);
		if (result == null || result.length() == 0) {
			throw new Exception("Request Rong360 api " + method + " returns null");
		}
		JSONObject jsonRet = JSONObject.fromObject(result);
		if (jsonRet == null) {
			throw new Exception("Request Rong360 api " + method + " got a non-json result");
		}
		return jsonRet;
	}

	private Map<String, String> getSysParams(String user_id) throws IOException {
		Map<String, String> sysParams = new HashMap<>();
		// sysParams.put("key", "value"); 天机接口可以不传系统参数
		sysParams.put("merchant_id", appId); //设置merchant_id与appid一致
		sysParams.put("app_name", "test_app"); //APP名称
		sysParams.put("app_version", "1.0"); // APP版本
		sysParams.put("platform", "iOS"); //APP平台
		sysParams.put("user_id", user_id); //重要，用户ID，本次抓取的唯一标识
		sysParams.put("notice_url", callback_Address); // 后台回调地址
		return sysParams;
	}

	/**
	 * 机构K入网时间查询接口
	 * bizData是业务参数
	 */
	@Override
	public JSONObject getPhoneNetworkLength(String user_id, Map<String, String> bizData) throws Exception {
		String method =method_phoneNetworkLength;
		Map<String, String> sysParams = getSysParams(user_id);
		JSONObject ret = doOpenApiRequest(method, sysParams, bizData);
		return ret;
	}
	/**
	 * 机构K手机号三项验证接口查询
	 * bizData是业务参数
	 */
	@Override
	public JSONObject getMobilecheck3item(String user_id, Map<String, String> bizData) throws Exception {
		String method =method_mobileCheck3item;
		Map<String, String> sysParams = getSysParams(user_id);
		JSONObject ret = doOpenApiRequest(method, sysParams, bizData);
		return ret;
	}
	/**
	 * 机构K手机号手机号码当前状态查询接口
	 * bizData是业务参数
	 */
	@Override
	public JSONObject getPhonestatus(String user_id, Map<String, String> bizData) throws Exception {
		String method =method_phoneStatus;
		Map<String, String> sysParams = getSysParams(user_id);
		JSONObject ret = doOpenApiRequest(method, sysParams, bizData);
		return ret;
	}

}
