package com.jzfq.rms.third.common.utils.jao;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 集奥数据请求client
 * wushujia
 */
public class Client {

	private  static  final Logger logger = LoggerFactory.getLogger(Client.class);

	/*
	 * 静态内部类   保证初始化instance时只有一个线程 没有性能损耗
	 *
	 * */
	private static class LazyHolder {
		private static final Client INSTANCE = new Client();
	}

//	private String server = "http://yz.geotmt.com" ; // http://yz.geotmt.com、https://yz.geotmt.com

	private Client() {

	}

	public static final Client getInstance() {
		return LazyHolder.INSTANCE;
	}

	private static JaoParamsRequestModel jaoParamsRequestModel;


	private static final int httpConnectTimeout = 10000 ;
	private static final int httpReadTimeout = 10000 ;
	private final Map<String,String> tokenIdMap = Token.getInstance().getTokenIdMap() ;
	private final Map<String,Long> getTokenTimeMap = Token.getInstance().getGetTokenTimeMap() ;
	private final Map<String,String> digitalSignatureKeyMap = Token.getInstance().getDigitalSignatureKeyMap() ;

	private static final long tokenCycle = 86400000l ;
	private static final long tokenCyc = 35000l ;  // 避免高并发时刚好token过期造成同时多个线程一起申请新token，如果在此时间内有过更新那么直接返回内存里面的token
	public static void main(String[] args){
//		Client client = new Client();
//		String path = client.server+"/civp/getview/api/u/queryUnify" ;
//		Map<String,String> params = new HashMap<String,String>();
//		params.put("innerIfType", "B8,A2") ;
//		params.put("cid", "17702166519") ;
//		params.put("idNumber", "460006198912180030") ;
//		params.put("realName", "张三") ;
//		params.put("authCode", "11111111111111111111111111111111") ;
//		String data = client.getData(path,params,"civp") ;
//		System.out.println(data);
	}
	public String getData(String path,Map<String,Object> params,Map<String,Object> bizParam,String sys){
//		this.encrypted= Integer.parseInt(bizParam.get("encrypted").toString());

		jaoParamsRequestModel = new JaoParamsRequestModel(bizParam);
		return getData(path,params,sys,httpConnectTimeout,httpReadTimeout) ;
	}
	/**
	 * 
	 * @param params
	 * @param sys
	 * @return
	 */
	public Map<String,Object> encryptAndDigitalSignature(Map<String,String> params,String sys){
		Map<String,String> headers = new HashMap<String,String>() ;
		TreeMap<String,String> paraMap = new TreeMap<String,String>() ;
		String tokenId = getToken(true) ;
		StringBuilder sb = new StringBuilder() ;
		if (params != null) {
			Set<String> set = params.keySet() ;
			for (String k : set) {
				String value = params.get(k) ;
				if(jaoParamsRequestModel.getDsign()==1){
					paraMap.put(k, value) ;
				}
				if(jaoParamsRequestModel.getEncrypted() == 1){
					// value = Secret.encrypt(encryptionType,value, encryptionKey)  ; // 加密
					value = encrypt(value, sys) ; // 加密
				}
				sb.append(k).append("=").append(value).append("&") ;
			}
		}
		String sbStr = sb.toString() ;
		if(sb!=null&&sb.length()>0) {
			sbStr = sb.substring(0, sb.length()-1) ;
		}
		if(jaoParamsRequestModel.getDsign()==1){
			paraMap.put("tokenId", tokenId) ;
			String digitalSignature = DigitalSignature.clientDigitalSignature(paraMap, null, "", digitalSignatureKeyMap.get(jaoParamsRequestModel.getUsername())) ;
			headers.put("digitalSignature", digitalSignature) ;
		}
		String newParams = sbStr+"&tokenId="+tokenId ;
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("para", newParams) ;
		result.put("headers", headers) ;
		return result ;
	}
	/**
	 * 该方法可以通过用户名密码直接调用数据接口，且token过期会自动重新获取
	 * @param path
	 * @param params
	 * @param sys 
	 * @param httpConnectTimeout 毫秒
	 * @param httpReadTimeout 毫秒
	 * @return
	 */
	public String getData(String path,Map<String,Object> params,String sys,int httpConnectTimeout,int httpReadTimeout){
		Map<String,String> headers = new HashMap<String,String>() ;
		TreeMap<String,String> paraMap = new TreeMap<String,String>() ;
		String tokenId = getToken(true) ;  // 等计费功能上线后第三个参数才能填RSA不然都只能是空
		StringBuilder sb = new StringBuilder() ;
		if (params != null) {
			Set<String> set = params.keySet() ;
			for (String k : set) {
				String value = params.get(k).toString() ;
				if(jaoParamsRequestModel.getDsign()==1){
					paraMap.put(k, value) ;
				}
				if(jaoParamsRequestModel.getEncrypted() == 1){
					// value = Secret.encrypt(encryptionType,value, encryptionKey)  ; // 加密
					value = encrypt(value, sys) ; // 加密
				}
				sb.append(k).append("=").append(value).append("&") ;
			}
		}
		String sbStr = sb.toString() ;
		if(sb!=null&&sb.length()>0) {
			sbStr = sb.substring(0, sb.length()-1) ;
		}
		if(jaoParamsRequestModel.getDsign()==1){
			paraMap.put("tokenId", tokenId) ;
			String digitalSignature = DigitalSignature.clientDigitalSignature(paraMap, null, "", digitalSignatureKeyMap.get(jaoParamsRequestModel.getUsername())) ;
			headers.put("digitalSignature", digitalSignature) ;
		}
		String newParams = sbStr+"&tokenId="+tokenId ;
		String data = getDataByTokenId(path,newParams,headers,sys,httpConnectTimeout,httpReadTimeout) ;
		if(data!=null&&!"".equals(data)){
			Map<String,Object> map = JSON.parseObject(data, Map.class) ;
			String code = map.get("code")+"" ;
			if("-100".equals(code)||"-200".equals(code)||"-300".equals(code)){
				logger.info("集奥tokenId无效重新获取tokenId");
				tokenId = getToken(false) ;  // 等计费功能上线后第三个参数才能填RSA不然都只能是空
				if(jaoParamsRequestModel.getDsign()==1){
					paraMap.put("tokenId", tokenId) ;
					String digitalSignature = DigitalSignature.clientDigitalSignature(paraMap, null, "", digitalSignatureKeyMap.get(jaoParamsRequestModel.getUsername())) ;
					headers.put("digitalSignature", digitalSignature) ;
				}
				newParams = sbStr+"&tokenId="+tokenId ;
				data = getDataByTokenId(path,newParams,headers,sys,httpConnectTimeout,httpReadTimeout) ;
			}
		}
		return data ;
	}
	
	/**
	 *
	 * @param first
	 * @return
	 */
	public String getToken(boolean first){
		if(first){
			if(getNewToken()){
				// 走网络获取token需要同步
				synchronized (jaoParamsRequestModel.getUsername().intern()) {
					return getToken() ; 
				}
			}else{
				return tokenIdMap.get(jaoParamsRequestModel.getUsername()) ;
			}
		}else{
			synchronized (jaoParamsRequestModel.getUsername().intern()) {
				Long tokenTime = getTokenTimeMap.get(jaoParamsRequestModel.getUsername()) ;
				long getTokenTime = tokenTime==null ? 0l : tokenTime;
				if(System.currentTimeMillis()-getTokenTime>=tokenCyc){
					// 避免高并发
					tokenIdMap.put(jaoParamsRequestModel.getUsername(), "") ; // 使token失效
				}
				String tokenId = getToken() ;
				return tokenId ;
			}
		}
	}
    /**
     * 获取数据访问权限,该接口24小时请求一次即可！
     * @return token
     */
	public String getToken(){
		if(getNewToken()){
			// 加密用户名密码
			String eUsername = jaoParamsRequestModel.getUsername() ;
			String ePassword = jaoParamsRequestModel.getUsername() ;
			String eDsign = jaoParamsRequestModel.getDsign()+"" ;
			if(jaoParamsRequestModel.getEncrypted() == 1){
				/*
				eUsername = Secret.encrypt(encryptionType,username, encryptionKey) ;  
				ePassword = Secret.encrypt(encryptionType,password, encryptionKey) ;
				eDsign = Secret.encrypt(encryptionType,dsign+"", encryptionKey) ;
				*/
				eUsername = encrypt(jaoParamsRequestModel.getUsername()) ;
				ePassword = encrypt(jaoParamsRequestModel.getPassword()) ;
				eDsign = encrypt(jaoParamsRequestModel.getDsign()+"") ;
			}
			String params = "" ;
			if("RSA".equalsIgnoreCase(jaoParamsRequestModel.getEtype())){
				KeyPair keyPair = RSAUtils.getKeyPair();
				String paraEncryptionType = RSAUtils.encrypt(keyPair.getPublic(), jaoParamsRequestModel.getEncryptionType()) ;
				String paraEncryptionKey = RSAUtils.encrypt(keyPair.getPublic(), jaoParamsRequestModel.getEncryptionKey()) ;
				params = "username="+eUsername+"&password="+ePassword+"&etype="+jaoParamsRequestModel.getEtype()+"&encryptionType="+paraEncryptionType+"&encryptionKey="+paraEncryptionKey+"&encrypted="+jaoParamsRequestModel.getEncrypted()+"&dsign="+eDsign ;
			}else{
				params = "username="+eUsername+"&password="+ePassword+"&uno="+jaoParamsRequestModel.getUno()+"&encrypted="+jaoParamsRequestModel.getEncrypted()+"&dsign="+eDsign ;
			}
			String reqencoding = "UTF-8" ;
			String respencoding = "UTF-8" ;
			String requestMethod = "POST" ;
			Map<String,String> headerMap = null ;
			String rs = HttpClient.getRs(jaoParamsRequestModel.getLoginUrl(), params, reqencoding, respencoding, requestMethod, httpConnectTimeout, httpReadTimeout, headerMap) ;
			if(rs!=null&&!"".equals(rs)){
				// 解密返回值
				if(rs.startsWith("{")){
					logger.info("集奥未加密:"+rs);
				}else{
					// rs = Secret.decrypt(encryptionType,rs, encryptionKey) ;
					rs = decrypt(rs) ;
					logger.info("集奥解密:"+rs);
				}
				Map<String,Object> map = JSON.parseObject(rs, Map.class) ;
				if("200".equals(map.get("code")+"")){
					long getTokenTime = System.currentTimeMillis() ;
					String tokenId = map.get("tokenId")+"" ;
					tokenIdMap.put(jaoParamsRequestModel.getUsername(), tokenId) ;
					getTokenTimeMap.put(jaoParamsRequestModel.getUsername(), getTokenTime) ;
					Map data = (Map)map.get("data") ;
					if(data!=null){
						String digitalSignatureKey = (String)data.get("digitalSignatureKey") ;
						if(digitalSignatureKey!=null){
							digitalSignatureKeyMap.put(jaoParamsRequestModel.getUsername(), digitalSignatureKey) ;
						}
					}
					return tokenId ;
				}else{
					logger.info("集奥登录失败!code="+map.get("code"));
					return "" ;
				}
			}else{
				return "" ;
			}
		}else{
			return tokenIdMap.get(jaoParamsRequestModel.getUsername()) ;
		}
	}
	/**
	 * 获取数据
	 * @param path
	 * @param params
	 * @param headers
	 * @param sys
	 * @param httpConnectTimeout
	 * @param httpReadTimeout
	 * @return
	 */
	public String getDataByTokenId(String path,String params,Map<String,String> headers,String sys,int httpConnectTimeout,int httpReadTimeout){
		String reqencoding = "UTF-8" ;
		String respencoding = "UTF-8" ;
		String requestMethod = "POST" ;
		String rs = HttpClient.getRs(path, params, reqencoding, respencoding, requestMethod, httpConnectTimeout, httpReadTimeout, headers) ;
		if(rs!=null&&!"".equals(rs)){
			// 解密返回值
			if(rs.startsWith("{")){
				logger.info("集奥未加密:"+rs);
			}else{
				rs = decrypt(rs, sys) ;
				logger.info("集奥解密:"+rs);
			}
			Map<String,Object> map = JSON.parseObject(rs, Map.class) ;
			/*
			if(!"200".equals(map.get("code")+"")){
				System.out.println("数据请求失败!code="+map.get("code"));
			}
			*/
		}
		return rs ;
	}
	/**
	 * 登出接口
	 * @return
	 */
	public String loginOut(String sys){
		String tokenId = tokenIdMap.get(jaoParamsRequestModel.getUsername()) ;
		if(tokenId!=null&&!"".equals(tokenId)){
			String digitalSignatureKey = digitalSignatureKeyMap.get(jaoParamsRequestModel.getUsername());
			Map<String,String> headers = new HashMap<String,String>() ;
			if(digitalSignatureKey!=null&&!"".equals(digitalSignatureKey)){
				TreeMap<String,String> paraMap = new TreeMap<String,String>() ;
				paraMap.put("tokenId", tokenId) ;
				String digitalSignature = DigitalSignature.clientDigitalSignature(paraMap, null, "", digitalSignatureKeyMap.get(jaoParamsRequestModel.getUsername())) ;
				headers.put("digitalSignature", digitalSignature) ;
			}
			return loginOut(tokenId,headers,sys) ;
		}
		logger.info("集奥用户未登录");
		return "" ;
	}
	/**
	 * 登出(该token权限将被回收),该接口一般不需要调用
	 * @param tokenId
	 * @return
	 */
	public String loginOut(String tokenId,Map<String,String> headerMap,String sys){
		String params = "tokenId="+tokenId ;
		String reqencoding = "UTF-8" ;
		String respencoding = "UTF-8" ;
		String requestMethod = "POST" ;
		String rs = HttpClient.getRs(jaoParamsRequestModel.getDataUrl(), params, reqencoding, respencoding, requestMethod, httpConnectTimeout, httpReadTimeout, headerMap) ;
		if(rs!=null&&!"".equals(rs)){
			// 解密返回值
			if(rs.startsWith("{")){
				logger.info("集奥未加密:"+rs);
			}else{
				rs = decrypt(rs, sys) ;
				logger.info("集奥解密:"+rs);
			}
			Map<String,Object> map = JSON.parseObject(rs, Map.class) ;
			if("200".equals(map.get("code")+"")){
				logger.info("集奥退出成功");
				tokenIdMap.remove(jaoParamsRequestModel.getUsername()) ;
				getTokenTimeMap.remove(jaoParamsRequestModel.getUsername()) ;
				digitalSignatureKeyMap.remove(jaoParamsRequestModel.getUsername()) ;
			}else{
				logger.info("集奥退出失败");
			}
		}
		return rs ;
	}
	/**
	 * 加密,登陆接口
	 * @param text
	 * @return
	 */
	private String encrypt(String text){
		return encrypt(text,"civp") ;
	}
	/**
	 * 加密
	 * @param text
	 * @param sys
	 * @return
	 */
	private String encrypt(String text,String sys){
		if("civp".equalsIgnoreCase(sys)){
			text = Secret.encrypt(jaoParamsRequestModel.getEncryptionType(),text, jaoParamsRequestModel.getEncryptionKey()) ;
			return text ;
		}else{
			text = Secret.encrypt(jaoParamsRequestModel.getSpiderEncryptionType(),text, jaoParamsRequestModel.getSpiderEncryptionKey()) ;
			return text ;
		}
	}
	/**
	 * 解密,登陆接口
	 * @param rs
	 * @return
	 */
	private String decrypt(String rs){
		return decrypt(rs,"civp") ;
	}
	/**
	 * 解密
	 * @param rs
	 * @param sys
	 * @return
	 */
	private String decrypt(String rs,String sys){
		if("civp".equalsIgnoreCase(sys)){
			rs = Secret.decrypt(jaoParamsRequestModel.getEncryptionType(),rs, jaoParamsRequestModel.getEncryptionKey()) ;
			return rs ;
		}else{
			rs = Secret.decrypt(jaoParamsRequestModel.getSpiderEncryptionType(),rs, jaoParamsRequestModel.getSpiderEncryptionKey()) ;
			return rs ;
		}
	}
	
	/**
	 * 判定token是否还有效
	 * @return
	 */
	public boolean getNewToken(){
		Long tokenTime = getTokenTimeMap.get(jaoParamsRequestModel.getUsername()) ;
		long getTokenTime = tokenTime==null ? 0l : tokenTime;
		return tokenIdMap.get(jaoParamsRequestModel.getUsername())==null||"".equals(tokenIdMap.get(jaoParamsRequestModel.getUsername()))||System.currentTimeMillis()-getTokenTime>=tokenCycle ;
	}

	public String rpad(String str, int strLength, char chr) {
		int strLen = str.length();
		if (strLen < strLength) {
			StringBuffer sb = new StringBuffer(str);
			while (strLen < strLength) {
				sb.append(chr); // 右补0
				strLen = sb.length();
			}
			str = sb.toString();
		}else{
			str = str.substring(0, strLength) ;
		}
		return str;
	}

	public String rpad(String str, int strLength) {
		return rpad(str, strLength, '0');
	}
	
	public String lpad(String str, int strLength, char chr) {
		int strLen = str.length();
		if (strLen < strLength) {
			while (strLen < strLength) {
				str = chr + str; // 左补0
				strLen = str.length();
			}
		}
		return str;
	}

	public String lpad(String str, int strLength) {
		return lpad(str, strLength, '0');
	}
}
