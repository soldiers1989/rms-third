package com.jzfq.rms.third.test.impl;

import com.jzfq.rms.third.test.DemoService;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/4 15:54.
 **/
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
