package com.serendipity.chapter5;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/8 10:47
 */
public class ThreadJoin {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            IntStream.range(1,1000).forEach(i-> System.out.println(Thread.currentThread().getName()+"->"+i));
        });
        Thread t2 = new Thread(()->{
            IntStream.range(1,1000).forEach(i-> System.out.println(Thread.currentThread().getName()+"->"+i));
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Optional.of("All of tasks finish done").ifPresent(System.out::println);
        IntStream.range(1,1000).forEach(i-> System.out.println(Thread.currentThread().getName()+"->"+i));

    }
}
