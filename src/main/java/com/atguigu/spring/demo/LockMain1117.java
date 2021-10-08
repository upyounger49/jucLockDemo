package com.atguigu.spring.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.System.out;

public class LockMain1117 {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            out.println(Thread.currentThread().getName()+"\t ------come in");
            LockSupport.park();
            out.println(Thread.currentThread().getName()+"\t ------我行了");
        },"a");
        thread.start();


        new Thread(() -> {
            LockSupport.unpark(thread);
            out.println(Thread.currentThread().getName()+"\t ------通知了");
        },"b").start();

        ReentrantLock lock =new ReentrantLock();
        //tryLock()尝试获取锁，如果获取不到，就去干别的事情
        try {
            if(lock.tryLock(3,TimeUnit.SECONDS)){
                //todo
            }else{
                //todo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

        lock.lock();
        try {

        }finally {
            lock.unlock();
        }

    }
}
