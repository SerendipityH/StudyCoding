package com.serendipity.chapter4;

import java.util.Optional;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/8 10:28
 */
public class ThreadSimpleAPI {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            Optional.of("Hello").ifPresent(System.out::println);
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1");

        thread.start();
        Optional.of(thread.getName()).ifPresent(System.out::println);
        Optional.of(thread.getId()).ifPresent(System.out::println);
        Optional.of(thread.getPriority()).ifPresent(System.out::println);
    }
}
