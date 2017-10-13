package com.jzfq.rms.third.common.utils;

import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * RSA相关工具类
 * @ClassName:  RSAUtils
 * @author 大连桔子分期科技有限公司
 * @date  2017年8月4日
 */
public class RSAUtils {

    /**
     * 私钥签名
     * <功能描述>
     * @param src
     * @param priKey
     * @return
     * @throws Exception 
     */
    public static byte[] generateSHA1withRSASigature(String src, String priKey, String charset) throws Exception
    {
    	Signature sigEng = Signature.getInstance("SHA1withRSA");
    	byte[] pribyte = Base64Utils.decode(priKey);
    	PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pribyte);
    	KeyFactory fac = KeyFactory.getInstance("RSA");
    	RSAPrivateKey privateKey = (RSAPrivateKey) fac.generatePrivate(keySpec);
    	sigEng.initSign(privateKey);
    	sigEng.update(src.getBytes(charset));
    	byte[] signature = sigEng.sign();
    	return signature;
    }




}