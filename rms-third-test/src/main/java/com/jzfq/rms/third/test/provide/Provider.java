package com.jzfq.rms.third.test.provide;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/4 15:56.
 **/
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:dubbo.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
