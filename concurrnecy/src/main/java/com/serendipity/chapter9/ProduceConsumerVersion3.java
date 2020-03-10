package com.serendipity.chapter9;

import java.util.stream.Stream;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/9 20:37
 */
public class ProduceConsumerVersion3 {
    private int i = 0;

    final private Object LOCK = new Object();

    private volatile boolean isProduced = false;

    private void produce() {
        synchronized (LOCK) {
            while (isProduced) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
            System.out.println("P->" + i);
            LOCK.notifyAll();
            isProduced = true;


        }
    }

    private void consume() {
        synchronized (LOCK) {
            while (!isProduced) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("c->" + i);
            LOCK.notifyAll();
            isProduced = false;

        }
    }

    public static void main(String[] args) {
        ProduceConsumerVersion3 pc = new ProduceConsumerVersion3();
        Stream.of("P1", "P2","P3","P4").forEach(n -> {
            new Thread("P") {
                @Override
                public void run() {
                    while (true) {
                        pc.produce();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }.start();
        });

        Stream.of("C1", "C2","C3","C4").forEach(n -> {
            new Thread("c") {
                @Override
                public void run() {
                    while (true) {
                        pc.consume();
                    }
                }
            }.start();
        });

    }
}
