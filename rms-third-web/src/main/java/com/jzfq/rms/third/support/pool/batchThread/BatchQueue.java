package com.jzfq.rms.third.support.pool.batchThread;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.mongo.BaseData;
import com.jzfq.rms.third.common.mongo.DemoObject;
import com.jzfq.rms.third.service.IJaoService;
import com.jzfq.rms.third.service.IJiguangService;
import com.jzfq.rms.third.service.IMongoService;
import com.jzfq.rms.third.service.TestQueueService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/*
 * 多线程批处理存储数据库方案
 * 20180710
 * */
public class BatchQueue<T> {
    private final int batchSize;
    private final Consumer<List<T>> consumer;
    private final int timeoutInMs;

    private AtomicBoolean isLooping = new AtomicBoolean(false);//原子操作，使用线程安全,初始化设置从0开始
    private BlockingQueue<T> queue = new LinkedBlockingQueue<>();


    private AtomicLong start = new AtomicLong(System.currentTimeMillis());//原子操作，使用线程安全，使用当前秒作为预定值


    //测试队列服务接口
//    public TestQueueService service;

    //mongo服务接口
    private IMongoService mongoService;

    public BatchQueue(int batchSize, int timeoutInMs, Consumer<List<T>> consumer, IMongoService mongoService) {
        this.batchSize = batchSize;
        this.timeoutInMs = timeoutInMs;
        this.consumer = consumer;
        this.mongoService = mongoService;
    }

    public BatchQueue(int batchSize, Consumer<List<T>> consumer, IMongoService mongoService) {
        //设置1秒后批量插入数据库 每次插入数据batchSize条  如果当queue 中数据大于batchSize  直接 分段 插入数据库  如果数据没达到batchSize 条，则判断是否超时时间
        this(batchSize, 100, consumer, mongoService);
    }

    public boolean add(T t) {
        boolean result = queue.add(t);
        if (!isLooping.get() && result) {
            isLooping.set(true);
            startLoop();
        }
        return result;
    }

    public void completeAll() {
        while (!queue.isEmpty()) {
            drainToConsume();
        }
    }

    private void startLoop() {
        new Thread(() -> {
            start = new AtomicLong(System.currentTimeMillis());
            while (true) {
                long last = System.currentTimeMillis() - start.get();
                if (queue.size() >= batchSize || (!queue.isEmpty() && last > timeoutInMs)) {
                    //开始业务逻辑处理
                    drainToConsume();
                } else if (queue.isEmpty()) {
                    //如果队列中的元素为空，则isLooping 计数从0开始
                    isLooping.set(false);
                    break;
                }
            }
        }).start();
    }

    private void drainToConsume() {
        List<T> drained = new ArrayList<>();
        int num = queue.drainTo(drained, batchSize);
        if (num > 0) {
            consumer.accept(drained);
            System.out.println("当前线程：" + Thread.currentThread().getName() + "," + JSONObject.toJSON(drained));
            //开始进行批处理
            mongoService.save((List<BaseData>) drained);
            start.set(System.currentTimeMillis());
        }
    }
}
