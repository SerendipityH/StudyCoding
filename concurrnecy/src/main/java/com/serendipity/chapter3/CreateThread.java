package com.serendipity.chapter3;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 13:43
 */
public class CreateThread {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println(thread.getName());
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println("5555555555");
            }
        };
        thread2.start();
        System.out.println(thread2.getName());

        Thread thread3 =new Thread("MY");

        Thread thread4 =new Thread(()->{
            System.out.println("tttttt");
        });
        System.out.println(thread3.getName());
        System.out.println(thread4.getName());



        Thread thread5 =new Thread(()->{
            System.out.println("Runnable..."+Thread.currentThread().getName());
        },"RunnableThread");

        thread5.start();
    }



}
