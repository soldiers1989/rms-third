package com.jzfq.rms.third.support.pool;

import com.jzfq.rms.third.common.mongo.DemoObject;
import com.jzfq.rms.third.support.pool.factory.CustomThreadFactory;
import com.jzfq.rms.third.support.pool.handler.CustomHandler;

import java.util.concurrent.*;

/**
 * 返回线程池对象
 */
public class ThreadProvider {
    public static ExecutorService getThreadPool() {
        return executor;
    }

    //线程池，大小为threadCount
    private static final ExecutorService executor;

    private static final Integer queueSize = 10;

    private static final Integer threadCount = 20;

    public static LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>(queueSize);

    // 队列只能存放1000瓶酒，
    public static LinkedBlockingQueue<DemoObject> queue = new LinkedBlockingQueue<DemoObject>(1000);


    static {
//        int threadCount = Runtime.getRuntime().availableProcessors() - 1;
//        threadCount = threadCount > 20 ? 20 : threadCount;

        executor = new ThreadPoolExecutor(threadCount, threadCount, 0L, TimeUnit.MILLISECONDS,
                workQueue, new CustomThreadFactory(), new CustomHandler());
    }
}
