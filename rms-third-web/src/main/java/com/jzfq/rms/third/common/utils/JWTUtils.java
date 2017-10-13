package com.jzfq.rms.third.common.utils;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Date;

/**
 * jwt工具类
 *
 * @author 大连桔子分期科技有限公司
 * @ClassName: JWTUtils
 * @date: 2017年9月20日 下午2:09:18
 */
public class JWTUtils {


    /**
     * 生成token
     *
     * @param timeOut
     * @return
     */
    public static String createToken(String key, String secret, long timeOut) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowTime = System.currentTimeMillis();
        Date now = new Date(nowTime);
        Key signKey = new SecretKeySpec(secret.getBytes(), signatureAlgorithm.getJcaName());
        JwtBuilder builder = Jwts.builder().setHeaderParam("alg", "HS256")
                .setHeaderParam("typ", "JWT").setIssuer(key).signWith(signatureAlgorithm, signKey);
        if (timeOut >= 0) {
            long timeOutMillis = nowTime + timeOut;
            Date timeOutTime = new Date(timeOutMillis);
            builder.setExpiration(timeOutTime).setNotBefore(now);
        }
        //生成JWT
        return builder.compact();
    }

    /**
     * 获取接口数据
     *
     * @param url
     * @return
     */
    public static ResponseResult getData(String key, String secret, long timeOut, String url) {
        return HttpConnectionManager.doJwtGet(url, createToken(key,
                secret, timeOut), null);
    }
}
