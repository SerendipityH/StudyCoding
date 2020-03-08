package com.serendipity.chapter4;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 20:03
 */
public class DaemonThread {
    public static void main(String[] args) {
       Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+"running");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+"done");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
       t.start();;

        System.out.println(Thread.currentThread().getName());
    }
}
