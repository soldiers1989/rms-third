package com.jzfq.rms.third.support.gpj.impl;

import com.jzfq.rms.third.common.domain.SysTask;
import com.jzfq.rms.third.persistence.mapper.SysTaskMapper;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.support.gpj.IGPJSync;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Observable;

public class CarDetailModelSyncImpl implements IGPJSync {
    private static final Logger log = LoggerFactory.getLogger("CarDetailModelSync");


    @Autowired
    private SysTaskMapper sysTaskMapper;
    /**
     *
     */

    private IGongPingjiaService gongPingjiaService;

    public void setGongPingjiaService(IGongPingjiaService gongPingjiaService) {
        this.gongPingjiaService = gongPingjiaService;
    }
    /*
     * (non-Javadoc)
     *
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */

    private final static String STR_TASK_STATUS_SUCCESS = "1";
    private final static String STR_TASK_STATUS_FAILURE = "2";
    @Override
    public void update(Observable o, Object arg) {
        SysTask task = new SysTask();
        task.setTaskSlug("GPJgetCarDetailModel");
        task.setTaskDec("公平价车辆款型信息同步");
        task.setExcTime(new Date());
        sysTaskMapper.insertTask(task);
        int conut = gongPingjiaService.getCountCarDetailModels();
        try {
            task.setStatus(STR_TASK_STATUS_SUCCESS);
            if(conut<=0){
                gongPingjiaService.insertAllCarDetailModels(task);
            }else{
                gongPingjiaService.updateCarDetailModels(task);
            }
            sysTaskMapper.updateTask(task);
        } catch (Exception e){
            task.setStatus(STR_TASK_STATUS_FAILURE);
            sysTaskMapper.updateTask(task);
            log.error("执行同步任务失败：",e);
            new RuntimeException(e);
        }
    }
}
