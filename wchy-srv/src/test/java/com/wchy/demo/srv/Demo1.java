package com.wchy.demo.srv;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo1 {

    //滚动时间条 任意1秒内的可执行次数，初始化10次
    public final static AtomicInteger totalNum = new AtomicInteger(10);

    /**
     * 滚动时间条内的次数判断
     * 任意1秒中内不超过10次，超过10次退出
     */
    public static void main(String args[]) {

        //固定周期执行的线程池
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        //项目启动开始，每隔100毫秒，可执行次数+1，可执行总数不超过10
        executorService.scheduleAtFixedRate(() -> {
            if (totalNum.get() >= 10) {
                System.out.println("可执行总量: totalNum = " + totalNum.get());
                return;
            }
            int i = totalNum.incrementAndGet();
            System.out.println("可执行总量: totalNum = " + i);
        }, 0, 100, TimeUnit.MILLISECONDS);

        //逻辑处理
        for (int i = 1; ; i++) {
            int currentNum = totalNum.getAndDecrement();
            System.out.println("已执行" + (i - 1) + "次，当前总量：currentNum = " + currentNum);
            //可执行次数小于0，则退出
            if (currentNum <= 0) {
                break;
            }
            //逻辑处理消耗时间
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

        System.out.println("已消费完，End！");
    }
}
