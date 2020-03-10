package com.serendipity.chapter8;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/9 20:27
 */
public class DeadLockTest {
    public static void main(String[] args) {
        OtherService otherService = new OtherService();

        DeadLock deadLock = new DeadLock(otherService);

        otherService.setDeadLock(deadLock);

        new Thread(){
            @Override
            public void run() {
                while (true){
                    deadLock.m1();
                }
            }
        }.start();



        new Thread(){
            @Override
            public void run() {
                while (true){
                    otherService.s2();
                }
            }
        }.start();
    }

}
