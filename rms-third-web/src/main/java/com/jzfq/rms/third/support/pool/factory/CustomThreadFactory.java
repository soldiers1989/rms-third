package com.jzfq.rms.third.support.pool.factory;

import com.jzfq.rms.third.support.pool.ThreadProvider;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 10:58.
 **/
public class CustomThreadFactory  implements ThreadFactory {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        String threadName = ThreadProvider.class.getSimpleName() + count.addAndGet(1);
        t.setName(threadName);
        return t;
    }
}
