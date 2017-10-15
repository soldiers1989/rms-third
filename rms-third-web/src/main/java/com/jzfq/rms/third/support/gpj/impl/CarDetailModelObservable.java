package com.jzfq.rms.third.support.gpj.impl;

import com.jzfq.rms.third.support.gpj.IGPJSync;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class CarDetailModelObservable extends Observable {
    private static final Logger log = LoggerFactory.getLogger("GongPingjiaSyncTask");
    /**
     * 监听器
     */
    private List<IGPJSync> observers;

    @Value("${develop.debug}")
    private boolean debug ;
    /**
     * 正在同步
     */
    private static final AtomicBoolean syncronizing = new AtomicBoolean(false);

    /**
     * @param observers 要初始化的监听器
     */
    public void setObservers(List<IGPJSync> observers) {
        this.observers = observers;
    }

    //线程池，大小为threadCount，队列大小ObserverConstant.SYNC_PAGE_SIZE
    private static final ExecutorService executor;
    static {
        int threadCount = Runtime.getRuntime().availableProcessors() - 1;
        threadCount = threadCount > 20 ? 20 : threadCount;
        LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>(1000);
        executor = new ThreadPoolExecutor(threadCount, threadCount, 0L, TimeUnit.MILLISECONDS, workQueue);
    }
    /**
     * 初始化
     */
    public void init() {
        if (this.observers == null) {
            return;
        }
        for (Observer o : observers) {
            addObserver(o);
        }
    }


    private volatile AtomicInteger RUNNING_SYNC_PROCESS = new AtomicInteger(0);
    public void sync() {
        if(debug){
            log.info("开发环境禁止同步");
            return ;
        }
        if (!syncronizing.compareAndSet(false, true)) {
            log.debug("有车型库同步任务正在执行，取消本次任务");
            return;
        }
        if (RUNNING_SYNC_PROCESS.get() > 0) {
            log.debug("上次车型库同步任务没有完成，取消本次任务");
            syncronizing.set(false);
            return;
        }
        try {
            log.info("开始执行同步任务");
            work();
        } catch (Exception e){
            log.error("同步任务出错：",e);
        }finally {
            syncronizing.set(false);
            log.info("同步任务执行结束");
        }
    }


    /**
     *
     */
    private void work() {
        RUNNING_SYNC_PROCESS.incrementAndGet();
        Map<String,Object> taskInfo = new HashMap<>();
        executor.execute(new sysDataTask(taskInfo));
    }


    /**
     *
     */
    private class sysDataTask implements Runnable {
        private Map<String,Object> taskInfo;

        public sysDataTask(Map<String,Object> taskInfo) {
            super();
            this.taskInfo = taskInfo;
        }

        @Override
        public void run() {
            try {
                setChanged();
                notifyObservers(taskInfo);
            } catch (Exception e) {
                if (taskInfo != null) {
                    log.error(String.format("车型库信息同步出现错误"), e);
                }
            } finally {
                RUNNING_SYNC_PROCESS.decrementAndGet();
            }
        }

    }


}
