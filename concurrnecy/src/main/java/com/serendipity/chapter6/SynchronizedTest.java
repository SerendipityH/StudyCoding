package com.serendipity.chapter6;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/8 14:17
 */
public class SynchronizedTest {
    private final static Object LOCK = new Object();

    public static void main(String[] args) {
        Runnable runnable = ()->{
            synchronized (LOCK){
                try {
                    Thread.sleep(200_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
