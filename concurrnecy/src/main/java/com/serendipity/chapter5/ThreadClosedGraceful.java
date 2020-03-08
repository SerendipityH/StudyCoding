package com.serendipity.chapter5;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/8 13:25
 */
public class ThreadClosedGraceful {
    private static class Worker extends Thread{
        private volatile boolean start = true;

        @Override
        public void run() {
            while (start){

            }
        }

        public void shutdown(){
            this.start = false;
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.shutdown();
    }
}
