package com.serendipity.chapter7;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/9 20:09
 */
public class SynchronizedStatic {

    static {
        synchronized (SynchronizedStatic.class) {
            System.out.println("static " + Thread.currentThread().getName());

            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized static void m1() {
        System.out.println("m1 " + Thread.currentThread().getName());
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void m2() {
        System.out.println("m2 " + Thread.currentThread().getName());
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void m3() {
        System.out.println("m3 " + Thread.currentThread().getName());
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
