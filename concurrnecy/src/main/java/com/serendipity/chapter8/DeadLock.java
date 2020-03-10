package com.serendipity.chapter8;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/9 20:20
 */
public class DeadLock {
    private  OtherService otherService;
    public DeadLock(OtherService otherService){
        this.otherService = otherService;
    }
    private final Object lock = new Object();
    public void m1(){
        synchronized (lock){
            System.out.println("m1");
            otherService.s1();
        }
    }
    public void m2(){
        synchronized (lock){
            System.out.println("m2");
        }
    }
    public void setOtherService(OtherService otherService) {
        this.otherService = otherService;
    }
}
