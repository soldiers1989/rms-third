package com.jzfq.rms.third.test.queue;

import java.util.concurrent.locks.Lock;

public class Test {


    public static void main(String[] args) {

        try {
            PollingThread pollingThread = new PollingThread();
            pollingThread.start();
            int i = 1;
            while (true) {
                System.out.println(Thread.currentThread().getName() + "准备放数据!");
                PollingThread.queue.put(new Message("新消息" + i));
                System.out.println(Thread.currentThread().getName() + "已经放了数据，" +
                        "队列目前有" + PollingThread.queue.size() + "个数据");
                i++;
                if (PollingThread.queue.size() >= 10) {
                    //当数量超过10个 发起通知
                    //有消息入队后激活轮询线程
                    synchronized (Lock.class) {
                        Lock.class.notify();
                        System.out.println("当前队列个数：" + PollingThread.queue.size() + "，释放阻塞，发起数据通知。。。");
//                        i = 0;
                    }
                }

//                try {
////                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
