package com.jzfq.rms.third.test.linkQueue;

import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Consumer implements Runnable {



    private BlockingQueue<DemoObject> queue;
    private DemoObject consumer;
    private CopyOnWriteArrayList<DemoObject> list = new CopyOnWriteArrayList<DemoObject>();

    public Consumer(BlockingQueue<DemoObject> queue, DemoObject consumer) {
        this.queue = queue;
        if (null != consumer)
            this.consumer = consumer;
        else
            this.consumer = null;
    }

    @Override
    public void run() {
        try {
            if (queue.size() > 0) {
                for (DemoObject obj:queue) {
                    list.add(obj);
                }
            }
            //开始进行批处理

//          System.out.println(consumer + "\t 喝掉了 " + uuid + " " + Thread.currentThread());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
