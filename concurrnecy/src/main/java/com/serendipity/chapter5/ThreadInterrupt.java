package com.serendipity.chapter5;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/8 11:23
 */
public class ThreadInterrupt {
    public static void main(String[] args){
      /*  Thread t = new Thread(){
            @Override
            public void run() {
                while (true){
                   // System.out.println(">>>>>>>."+this.isInterrupted());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println("收到打断信号。。");
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        Thread.sleep(1_00);
        System.out.println(t.isInterrupted());

        t.interrupt();
        System.out.println(t.isInterrupted());
*/
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {

                }
            }
        };
        t1.start();
        Thread main = Thread.currentThread();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                main.interrupt();
                System.out.println("innnnnnnn");
            }
        };
        t2.start();


        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
