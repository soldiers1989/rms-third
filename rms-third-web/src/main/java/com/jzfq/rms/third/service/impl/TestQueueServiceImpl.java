package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.mongo.DemoObject;
import com.jzfq.rms.third.service.TestQueueService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import com.jzfq.rms.third.web.action.util.linkQueue.Consumer;
import com.jzfq.rms.third.web.action.util.linkQueue.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestQueueServiceImpl implements TestQueueService{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(List<DemoObject> list) {
        mongoTemplate.insert(list, DemoObject.class);
    }

    @Override
    public void produce(DemoObject object, TestQueueService service) {
        try {
            ThreadProvider.getThreadPool().submit(new Producer(ThreadProvider.queue, object));
            Thread.sleep(300);//300 毫秒后 消费队列  批量处理
            System.out.println("300毫秒过：队列数据量为：" + ThreadProvider.queue.size());
            ThreadProvider.getThreadPool().submit(new Consumer(ThreadProvider.queue, service));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void consu(TestQueueService service) {
        try {
            ThreadProvider.getThreadPool().submit(new Consumer(ThreadProvider.queue, service));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
