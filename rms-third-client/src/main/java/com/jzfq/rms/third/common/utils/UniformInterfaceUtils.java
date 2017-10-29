package com.jzfq.rms.third.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 19:50.
 **/
public class UniformInterfaceUtils {

    /**
     *
     * @param appId
     * @param apiId
     * @param appSecret
     * @param timestamp
     * @return
     */
    public static String getToken(String appId, String apiId, String appSecret,  long timestamp) {
        return MD5Helper.encrypt(appId + appSecret + apiId + timestamp);
    }
}

class MD5Helper {
    private static final int MD5_LENGTH = 32;

    public static String encrypt(String str) {
        String sRes;
        try {
            MessageDigest alg = MessageDigest.getInstance("MD5");
            alg.update(str.getBytes("UTF-8"));
            byte[] digesta = alg.digest();
            sRes = byteToHex(digesta).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5散列出错，不支持MD5算法！", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5散列出错，不支持UTF-8字符集！", e);
        }
        return sRes;
    }

    public static String byteToHex(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        StringBuilder hex = new StringBuilder(MD5_LENGTH);
        String temp;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0XFF);
            if (1 == temp.length()) {
                hex.append('0');
            }
            hex.append(temp);
        }
        return hex.toString();
    }
}
