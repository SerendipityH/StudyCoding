package com.serendipity.chapter3;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 19:46
 */
public class CreateThread5 {
    private static int counter = 1;

    public static void main(String[] args) {
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                counter++;
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                    }
                });
            }
        } catch (Error e) {

        }
        System.out.println("Total "+ counter);
    }
}
