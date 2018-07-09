package com.jzfq.rms.third.test.batchThread;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        BatchQueue<String> batchQueue = new BatchQueue<>(3, System.out::println);
        while (true) {
            String line = new Scanner(System.in).nextLine();
            if (line.equals("done")) {
                batchQueue.completeAll();
                break;
            }
            batchQueue.add(line);
        }
    }


}
