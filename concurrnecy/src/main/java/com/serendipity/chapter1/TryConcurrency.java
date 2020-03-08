package com.serendipity.chapter1;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 10:59
 */
public class TryConcurrency {
    public static void main(String[] args) {
        /*Thread t1 = new Thread("customer"){
             @Override
             public void run(){
                 for (int i = 0; i < 100; i++) {
                     println("Task i =>" + i);
                 }
             }
        };
        t1.start();
        for (int j = 0; j < 100; j++) {
            println("Task j =>" + j);
        }*/
       /* try {
            Thread.sleep(1000*30L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        /*readFromDataBase();
        writeDataToFile();*/

        new Thread("read"){
            @Override
            public void run() {
                readFromDataBase();
            }
        }.start();
        new Thread("write"){
            @Override
            public void run() {
                writeDataToFile();
            }
        }.start();
    }

    private static void readFromDataBase() {
        try {
            println("Begin read from db");
            Thread.sleep(1000 * 10L);
            println("Read data done and start handle it");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finish and successfully");
        System.out.println();
    }


    private static void writeDataToFile() {
        try {
            println("Begin write from db");
            Thread.sleep(1000 * 10L);
            println("write data done and start handle it");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finish and successfully");
        System.out.println();
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
