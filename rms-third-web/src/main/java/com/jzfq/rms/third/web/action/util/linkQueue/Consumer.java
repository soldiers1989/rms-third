package com.jzfq.rms.third.web.action.util.linkQueue;

import com.jzfq.rms.third.common.mongo.DemoObject;
import com.jzfq.rms.third.service.TestQueueService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    public TestQueueService service;

    private BlockingQueue<DemoObject> queue;
    //    private DemoObject consumer;
    private List<DemoObject> list = new ArrayList<>();

    public Consumer(BlockingQueue<DemoObject> queue, TestQueueService service) {
        this.queue = queue;
        this.service = service;
//        if (null != consumer)
//            this.consumer = consumer;
//        else
//            this.consumer = null;
    }

    @Override
    public void run() {
        try {
            if (queue.size() > 0) {
                for (DemoObject obj : queue) {
                    list.add(obj);
                }
            }
            //开始进行批处理
//            service.save(list);
            System.out.println("消费者消费数据熟数量： " + list.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
