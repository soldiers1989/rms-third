package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.mongo.DemoObject;


import java.util.List;

public interface TestQueueService {

    void save(List<DemoObject> list);

    void produce(DemoObject object,TestQueueService service);



    void consu(TestQueueService service);

}
