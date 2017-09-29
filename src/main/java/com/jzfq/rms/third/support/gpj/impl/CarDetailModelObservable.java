package com.jzfq.rms.third.support.gpj.impl;

import com.jzfq.rms.third.support.gpj.IGPJSync;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.*;

public class CarDetailModelObservable extends Observable {
    private static final Logger log = LoggerFactory.getLogger("GongPingjiaSyncTask");
    /**
     * 监听器
     */
    private List<IGPJSync> observers;

    @Value("${develop.debug}")
    private boolean debug ;


    /**
     * @param observers 要初始化的监听器
     */
    public void setObservers(List<IGPJSync> observers) {
        this.observers = observers;
    }

    //线程池，大小为threadCount，队列大小ObserverConstant.SYNC_PAGE_SIZE
//    private static final ExecutorService executor;
//    static {
//
//        int threadCount = Runtime.getRuntime().availableProcessors() - 1;
//        threadCount = threadCount > 20 ? 20 : threadCount;
//        LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>(1000);
//        executor = new ThreadPoolExecutor(threadCount, threadCount, 0L, TimeUnit.MILLISECONDS, workQueue);
//    }
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

    public void sync() {
        if(debug){
            log.info("开发环境禁止同步");
            return ;
        }
        try {
            log.info("开始执行同步任务");
            work();
        } catch (Exception e){
            log.error("同步任务出错：",e);
        }finally {
            log.info("同步任务执行完成");
        }
    }


    /**
     *
     */
    private void work() {

        Map<String,Object> map = new HashMap<>();
        setChanged();
        notifyObservers(map);
    }


}
