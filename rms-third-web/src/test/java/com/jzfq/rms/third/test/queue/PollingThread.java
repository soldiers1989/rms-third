package com.jzfq.rms.third.test.queue;

import sun.misc.Lock;
import sun.misc.Queue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

public class PollingThread extends Thread implements Runnable {


//    public static java.util.Queue<Message> queue = new LinkedTransferQueue<Message>();


    // 队列只能存放1000瓶酒，
    static LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<Object>(10);

    @Override
    public void run() {
        try {
            while (true) {
                while (!queue.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + "准备取数据!" + "队列目前有" + queue.size() + "个数据");
                    queue.take();
                    System.out.println(Thread.currentThread().getName() + "已经取走数据，" +
                            "队列目前有" + queue.size() + "个数据");
                }
                //把队列中的消息全部打印完之后让线程阻塞
                synchronized (Lock.class) {
                    try {
                        System.out.println("阻塞，等待数据通知。。。");
                        Lock.class.wait();

                        System.out.println("收到通知。。。。。");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            ;
        }


    }


}
