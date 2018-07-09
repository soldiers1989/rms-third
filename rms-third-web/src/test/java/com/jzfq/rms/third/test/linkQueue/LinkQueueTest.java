//package com.jzfq.rms.third.test.linkQueue;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.LinkedBlockingQueue;
//
//public class LinkQueueTest {
//
//    public static void main(String[] args) throws Exception {
//
//
//        //500ms之后 我
//
//
//        //
//        // 当队列是空的话，消费者就等待，生产者生产出商品后，等待的恢复，将商品消费掉
//        // 当队列是满的情况下，生产者就不能往队列中放了，只有消费者消费掉部分商品后，队列有空位了，生产者才可以继续生产
//        // 来看个小例子，生产者生成酒，酒鬼消费掉酒
//
//        // 队列只能存放1000瓶酒，
//        LinkedBlockingQueue<DemoObject> queue = new LinkedBlockingQueue<DemoObject>(10);
//
//
//        ExecutorService service = Executors.newCachedThreadPool();
//
//
//        // 12个生产线程，因为队列大小只有10，所以会有两个线程会阻塞
//        for (int i = 0; i < 12; i++) {
//            service.submit(new Producer(queue, new DemoObject("" + i, "黄金酒", "1111")));
//        }
//
//        System.out.println("第一个：当前生产者队列个数:" + queue.size());
////
////        //300ms 后消费一批队列数据
////        Thread.sleep(300);
////        //消费了一个，看看，生成线程会不会恢复生产
////        service.submit(new Consumer(queue, "酒鬼"));
//
//
//        System.out.println("第二个：当前生产者队列个数:" + queue.size());
//
//        // 一个阻塞的线程恢复生产
////
////        Thread.sleep(3000);
////        //又消费了一个，
////        service.submit(new Consumer(queue, "酒鬼"));
//
//
//        System.out.println("第三个：当前生产者队列个数:" + queue.size());
//
//
//        // 最后一个阻塞的线程恢复生产
////
//        Thread.sleep(3000);
//        // 队列中只剩10个，12个酒鬼去消费，所以有两个酒鬼在等待
//        for (int i = 0; i < 12; i++) {
//            service.submit(new Consumer(queue, "酒鬼" + i));
//        }
//        Thread.sleep(3000);
//
//
//        System.out.println("第四个：当前生产者队列个数:" + queue.size());
//
//
////
////        // 命令行中，可以看到程序没有退出，因为有两个酒鬼在等待
////
//        // 再生成两瓶酒，等待的两个酒鬼可喝到酒了
//        for (int i = 0; i < 2; i++) {
//            service.submit(new Producer(queue, "黄金酒" + i));
//        }
//
//
//        System.out.println("第五个：当前生产者队列个数:" + queue.size());
//
//
////
////
//
//        service.shutdown();
//
//    }
//
//
//}
