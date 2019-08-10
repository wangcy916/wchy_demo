package com.wchy.demo.srv;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo1 {

    public final static AtomicInteger totalNum = new AtomicInteger(5);

    public static void main(String args[]) {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> {
            if (totalNum.get() >= 10) {
                System.out.println("当前可执行总量: totalNum = " + totalNum.get());
                return;
            }
            int i = totalNum.incrementAndGet();
            System.out.println("当前可执行总量: totalNum = " + i);
        }, 0, 100, TimeUnit.MILLISECONDS);

        while (true) {
            int currentNum = totalNum.decrementAndGet();
            System.out.println("当前消费后总量：currentNum = " + currentNum);
            if (currentNum < 0) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

        System.out.println("已消费完，End！");
    }
}
