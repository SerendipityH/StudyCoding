package com.serendipity.chapter2;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 13:25
 */
public class TicketWindowRunnable implements Runnable {
    private static final int Max = 50 ;

    private static int index = 1;

    @Override
    public void run() {
        while (index <= Max){
            System.out.println(Thread.currentThread() + "当前的号码是:"+(index++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
