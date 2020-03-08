package com.serendipity.chapter6;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/8 14:32
 */
public class SynchronizedRunnable implements Runnable {

    private static final int Max = 500 ;

    private static int index = 1;
    @Override
    public void run() {
        while (true){
            if(ticket()){
                break;
            }

        }
    }

    private synchronized boolean ticket(){
        if(index > Max){
            return true;
        }
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread() + "当前的号码是:"+(index++));
        return  false;
    }
}
