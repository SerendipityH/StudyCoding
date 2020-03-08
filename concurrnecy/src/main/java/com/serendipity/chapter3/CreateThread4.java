package com.serendipity.chapter3;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 14:43
 */
public class CreateThread4 {
    private static int counter = 1;

    public static void main(String[] args) {
        Thread thread = new Thread(null,new Runnable() {
            @Override
            public void run() {
                try {
                    add(1);
                } catch (Error e) {
                    System.out.println(counter);
                }
            }

            private void add(int i) {
                counter++;
                add(i + 1);
            }
        },"Test",1 << 24);
        thread.start();
    }
}
