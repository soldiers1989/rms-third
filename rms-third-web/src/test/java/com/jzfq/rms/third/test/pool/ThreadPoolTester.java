package com.jzfq.rms.third.test.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import static com.jzfq.rms.third.support.pool.ThreadProvider.getThreadPool;


/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 14:29.
 **/
public class ThreadPoolTester {
    // 测试构造的线程池
    public static void main(String[] args) {

//        ExecutorService pool = getThreadPool();
//        for(int i=1; i<11; i++) {
//            System.out.println("提交第" + i + "个任务!");
//            final Integer number = i;
//            pool.execute(() -> {
//                try {
//                    System.out.println(number+">>>task is running=====");
//                    TimeUnit.SECONDS.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//
//        // 2.销毁----此处不能销毁,因为任务没有提交执行完,如果销毁线程池,任务也就无法执行了
//        // exec.destory();
//
//        try {
//            Thread.sleep(11);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
