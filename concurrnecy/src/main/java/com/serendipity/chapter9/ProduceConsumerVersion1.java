package com.serendipity.chapter9;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/9 20:37
 */
public class ProduceConsumerVersion1 {
    private int i = 1;

   final private Object LOCK =  new Object();

   private void produce(){
       synchronized (LOCK){
           while (true){
               System.out.println("P->"+(i++));
           }

       }
   }

   private void consume(){
       synchronized (LOCK){
           while (true){
               System.out.println("c->"+i);
           }

       }
   }

    public static void main(String[] args) {
        ProduceConsumerVersion1 pc = new ProduceConsumerVersion1();
        new Thread("P"){
            @Override
            public void run() {
                pc.produce();
            }
        }.start();
        new Thread("c"){
            @Override
            public void run() {
                pc.consume();
            }
        }.start();
   }
}
