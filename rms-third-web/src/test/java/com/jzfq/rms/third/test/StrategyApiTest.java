package com.jzfq.rms.third.test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;

import com.bfd.facade.MerchantServer;
import com.bfd.util.MD5Utils;

public class StrategyApiTest{
	
	private static volatile String tokenid;
	private static MerchantServer ms=new MerchantServer();
	
	public static String getTokenid(){
		if(StringUtils.isBlank(tokenid)){
			synchronized (StrategyApiTest.class) {
				if(StringUtils.isBlank(tokenid)){
					tokenid = generateTokenid();
				}
			}
		}
		return tokenid;
	}
	
	private static String generateTokenid(){
		String tokenid = "";
		try {
			//登陆
			String userName = "juziStr";
			String pwd = "juziStr";
			String loginName = "LoginApi";
			String apiCode = "3002020";
			String login_res_str = ms.login(userName, pwd, loginName, apiCode);
			System.out.println(login_res_str);
    		if(StringUtils.isNotBlank(login_res_str)){
    			JSONObject loginJson=JSONObject.fromObject(login_res_str);
    			if(loginJson.containsKey("tokenid")){
    				tokenid = loginJson.getString("tokenid");
    			}else{
    				System.out.println("返回结果异常，无tokenid！结果为："+login_res_str);
    			}
    		}
        } catch (Exception e) {
           	e.printStackTrace();
        }
		return tokenid;
	}
	
	public static String getBrData(String jsonData,String apicode){
		String res = "";
		try {
			res = ms.getApiData(jsonData, apicode);
			if(StringUtils.isNotBlank(res)){
				JSONObject json = JSONObject.fromObject(res);
				if(json.containsKey("code")){
					if(json.getString("code").equals("100007")){
						tokenid = null;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public static void main(String[] args) {
			JSONObject jso = new JSONObject();
			JSONObject reqData = new JSONObject();
			JSONArray cell=new JSONArray();
			jso.put("apiName", "strategyApi");
			jso.put("tokenid", StrategyApiTest.getTokenid());
			reqData.put("id","");			
			cell.add("");
			reqData.put("cell",cell);
			reqData.put("name","");
			reqData.put("strategy_id", "STR0000106");
//			reqData.put("event", "antifraud_register");
//			reqData.put("gid", "4a88dfca3d9fac3a_871166f4271e58fa_151642eca38");
			jso.put("reqData", reqData);
			String result = getBrData(jso.toString(),"3002020");
			if(StringUtils.isNotBlank(result)){
//				System.out.println(tokenid);
				JSONObject json = JSONObject.fromObject(result);
				if(json.containsKey("code")&&json.getString("code").equals("100007")){
					jso.put("tokenid", StrategyApiTest.getTokenid());
					result = getBrData(jso.toString(),"3002020");
				}
			}
			System.out.println(result);
	}
}
