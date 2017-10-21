package com.jzfq.rms.third.test.main;

import com.jzfq.rms.third.common.utils.UniformInterfaceUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/21 16:27.
 **/
public class TokenTester {
    public static void main(String[] argc){
        Long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        // appId + appSecret + apiId + timestamp
        String token = UniformInterfaceUtils.getToken("1","1001","93dd7a6468807ade",timestamp);
        System.out.println(token);
    }
}
