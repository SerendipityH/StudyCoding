package com.serendipity.chapter4;

import java.util.Optional;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/8 10:38
 */
public class ThreadSimpleAPI2 {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            for (int i = 0;i < 100;i++){
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(()->{
            for (int i = 0;i < 100;i++){
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);
            }
        });

        t2.setPriority(Thread.NORM_PRIORITY);

        Thread t3 = new Thread(()->{
            for (int i = 0;i < 100;i++){
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);
            }
        });


        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
