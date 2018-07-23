package com.jzfq.rms.third.test.batchThread;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/*
 * 多线程批处理方案
 *
 * */
public class BatchQueue<T> {
    private final int batchSize;
    private final Consumer<List<T>> consumer;
    private final int timeoutInMs;

    private AtomicBoolean isLooping = new AtomicBoolean(false);//原子操作，使用线程安全,初始化设置从0开始
    private BlockingQueue<T> queue = new LinkedBlockingQueue<>();

    private AtomicLong start = new AtomicLong(System.currentTimeMillis());//原子操作，使用线程安全，使用当前秒作为预定值

    public BatchQueue(int batchSize, int timeoutInMs, Consumer<List<T>> consumer) {
        this.batchSize = batchSize;
        this.timeoutInMs = timeoutInMs;
        this.consumer = consumer;
    }

    public BatchQueue(int batchSize, Consumer<List<T>> consumer) {
        //设置1秒后批量插入数据库 每次插入数据batchSize条  如果当queue 中数据大于batchSize  直接 分段 插入数据库  如果数据没达到batchSize 条，则判断是否超时时间
        this(batchSize, 1000, consumer);
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
            start.set(System.currentTimeMillis());
        }
    }


}