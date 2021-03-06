package com.atguigu.huawei.test;

import java.util.concurrent.CountDownLatch;

/**
 * 缓存一致性 为了降低不同对象在同一缓存行的概率 扩大每个对象的大小为64bytes
 * 减少缓存一致性的同步时间 使效率提高
 */
public class CacheLinePadding {

    private static T[] arr = new T[2];
    private static int COUNT =10000000;
    static class T{
        private long p1,p2,p3,p4;
        private long x;//long 8bytes
        private long p5,p6,p7,p8;
    }

    static{
        arr[0] = new T();
        arr[1] = new T();
    }

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread(()->{
            for (int i = 0; i < COUNT; i++) {
                arr[0].x = i;
            }
            countDownLatch.countDown();

        }).start();

        new Thread(()->{
            for (int i = 0; i < COUNT; i++) {
                arr[1].x = i;
            }
            countDownLatch.countDown();
        }).start();

    }

}
