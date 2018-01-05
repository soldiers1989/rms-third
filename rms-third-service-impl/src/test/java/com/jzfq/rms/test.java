package com.jzfq.rms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/1/4 15:44.
 **/
public class test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
