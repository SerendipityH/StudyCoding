package com.serendipity.chapter5;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/8 10:57
 */
public class ThreadJoin2 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            try {
                System.out.println("t1 is running ..");
                Thread.sleep(10_000);
                System.out.println("t2 is done2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        try {
            thread.join(100,10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Optional.of("All of tasks finish done").ifPresent(System.out::println);
        IntStream.range(1,1000).forEach(i-> System.out.println(Thread.currentThread().getName()+"->"+i));

    }
}
