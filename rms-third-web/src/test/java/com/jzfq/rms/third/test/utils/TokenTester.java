package com.jzfq.rms.third.test.utils;

import com.alibaba.druid.support.json.JSONUtils;
import com.jzfq.rms.third.common.utils.IPUtils;
import com.jzfq.rms.third.common.utils.UniformInterfaceUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/21 16:27.
 **/
public class TokenTester {
    public static void main(String[] argc){
//        Long timestamp = System.currentTimeMillis();
//        System.out.println(timestamp);
//        // appId + appSecret + apiId + timestamp
//        String token = UniformInterfaceUtils.getToken(null,"1001","93dd7a6468807ade",timestamp);
//        System.out.println(token);
//        System.out.println(null+"1001");
        System.out.println(IPUtils.getLocalHostIP());
    }
}
