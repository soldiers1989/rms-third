package com.jzfq.rms.third.support.gpj.impl;

import com.jzfq.rms.third.common.dto.CarDetailModelConditionDTO;
import com.jzfq.rms.third.common.dto.ResponseDTO;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.support.gpj.IGPJSync;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CarDetailModelObservable extends Observable {
    private static final Logger log = LoggerFactory.getLogger("GongPingjiaSyncTask");
    /**
     * 监听器
     */
    private List<IGPJSync> observers;
    /**
     *
     */
    private IGongPingjiaService gongPingjiaService;

    public void setGongPingjiaService(IGongPingjiaService gongPingjiaService) {
        this.gongPingjiaService = gongPingjiaService;
    }

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

    public void sync() {

        long currentSyncTime = System.currentTimeMillis();
        try {
            log.info("开始执行案件同步任务");
            CarDetailModelConditionDTO params = new CarDetailModelConditionDTO();
            ResponseDTO dto = gongPingjiaService.queryCarDetailModels(params);
            doSyncronizeWork();
        } finally {
            log.info("案件同步任务执行完成");
        }
    }


    /**
     *
     */
    private void doSyncronizeWork() {

        Map<String,Object> map = new HashMap<>();
        map.put("heheh",1);
        setChanged();
        notifyObservers(map);
    }
}
