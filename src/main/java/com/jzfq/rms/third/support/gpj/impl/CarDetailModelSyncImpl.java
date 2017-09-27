package com.jzfq.rms.third.support.gpj.impl;

import com.jzfq.rms.third.support.gpj.IGPJSync;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Observable;

public class CarDetailModelSyncImpl implements IGPJSync {
    private static final Logger log = LoggerFactory.getLogger("CarDetailModelSync");
    /*
     * (non-Javadoc)
     *
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    @Override
    public void update(Observable o, Object arg) {
        log.info("开始同步信息"+((Map<String,Object>)arg).get("heheh"));
    }
}
