package com.jzfq.rms.third.web.action;


import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.mongo.DemoObject;
import com.jzfq.rms.third.service.TestQueueService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import com.jzfq.rms.third.support.pool.batchThread.BatchQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月29日 20:04:55
 */
@RestController
@RequestMapping(value = "/linkQueue")
public class LinkQueueAction {


    @Autowired
    TestQueueService service;


    /**
     * 消费数据信息方法
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "linkQueue.json", method = RequestMethod.POST)
    public ResponseResult linkQueue(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        for (int i = 0; i < 12; i++) {
//            service.produce(new DemoObject("黄金酒:" + i, "1982"), service);
//        }
//        Thread.sleep(300);//300 毫秒后 消费队列  批量处理
//        System.out.println("剩余队列数据量：" + ThreadProvider.queue.size());
//        //用10 个线程去消费 队列数据
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(50);//五十ms  监听一遍
//            service.consu(service);
//        }
//        System.out.println("剩余队列数据量：" + ThreadProvider.queue.size());
////        System.n.println("剩余队列数据量：" + ThreadProvider.queue.size());


        BatchQueue<DemoObject> batchQueue = new BatchQueue<>(100, System.out::println,service);
//        while (true) {
//            String line = new Scanner(System.in).nextLine();
//            if (line.equals("done")) {
//                batchQueue.completeAll();
//                break;
//            }
//            batchQueue.add(line);
//        }

        //模拟500个任务数据
        for (int i = 0; i < 1000; i++) {
//            String str = "str" + i;
            batchQueue.add(new DemoObject("黄金酒:" + i, "1982"));
        }

        return new ResponseResult();
    }


}
