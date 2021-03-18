package com.serendipity.chapter10;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/10 20:37
 */
public class LockTest {
    public static void main(String[] args) {
        BooleanLock lock = new BooleanLock();
        Stream.of("T1","T2","T3","T4").forEach(name ->{
            new Thread(()->{
                try {
                    lock.lock();
                    Optional.of(Thread.currentThread().getName()+"have the lock Monitor")
                            .ifPresent(System.out::println);
                    work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }).start();
        });
    }

    private static void work() throws InterruptedException {
        Optional.of(Thread.currentThread().getName()+"is working..")
                .ifPresent(System.out::println);
        Thread.sleep(10_000);
    }
}
