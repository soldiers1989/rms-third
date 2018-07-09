package com.jzfq.rms.third.test.batchThread;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        BatchQueue<String> batchQueue = new BatchQueue<>(100, System.out::println);
//        while (true) {
//            String line = new Scanner(System.in).nextLine();
//            if (line.equals("done")) {
//                batchQueue.completeAll();
//                break;
//            }
//            batchQueue.add(line);
//        }

        //模拟500个任务数据
        for (int i = 0; i < 5001; i++) {
            String str = "str" + i;
            batchQueue.add(str);
        }


    }


}
