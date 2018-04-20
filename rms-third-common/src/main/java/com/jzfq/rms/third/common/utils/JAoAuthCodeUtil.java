package com.jzfq.rms.third.common.utils;

import java.util.UUID;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/4/20 13:28.
 **/

public class JAoAuthCodeUtil {

    public static String lpad(String str, int strLength, char chr) {
        String authCode = "";
        int strLen = str.length();
        if (strLen < strLength) {
            while (strLen < strLength) {
                str = chr + str; // 左补0
                strLen = str.length();
            }
        }
        long time = System.currentTimeMillis()/1000;
        String uuid = UUID.randomUUID().toString().replaceAll("-", ""); // 该处为示意，应该为能关联上用户授权信息的ID左补全成32位
        authCode = time + str + uuid;
        return authCode;
    }





}
