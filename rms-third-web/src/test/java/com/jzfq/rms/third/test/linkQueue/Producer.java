package com.jzfq.rms.third.test.linkQueue;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {


    private BlockingQueue<DemoObject> queue;
    private DemoObject produce;

    public Producer(BlockingQueue<DemoObject> queue, DemoObject produce) {
        this.queue = queue;
        if (null != produce)
            this.produce = produce;
        else this.produce = null;
    }

    @Override
    public void run() {
        String uuid = UUID.randomUUID().toString();
        try {
//            Thread.sleep(200);//生产需要时间 200millis后
            queue.put(produce);  //当队列里满的话，会阻塞
            System.out.println("生产者 \t" + produce + " : " + uuid + " " + Thread.currentThread());

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
