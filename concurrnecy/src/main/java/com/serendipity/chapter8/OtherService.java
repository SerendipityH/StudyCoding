package com.serendipity.chapter8;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/9 20:20
 */
public class OtherService {
    private final Object lock = new Object();

    private DeadLock deadLock;
    public void s1(){
        synchronized (lock){
            System.out.println("s1 ==========");
        }
    }
    public void s2(){
        synchronized (lock){
            System.out.println("s2==========");
            deadLock.m2();
        }
    }
    public void setDeadLock(DeadLock deadLock) {
        this.deadLock = deadLock;
    }
}
