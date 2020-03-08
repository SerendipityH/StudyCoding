package com.serendipity.chapter4;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 20:16
 */
public class DaemonThread2 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            Thread innerThread = new Thread(()->{
                try {
                    while (true){
                        System.out.println("health check");
                        Thread.sleep(1_000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

          //  innerThread.setDaemon(true);
            innerThread.start();
            try {
                Thread.sleep(1_000);
                System.out.println("T thread finish done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
    }
}
