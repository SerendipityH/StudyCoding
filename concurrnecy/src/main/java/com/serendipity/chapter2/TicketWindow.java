package com.serendipity.chapter2;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 13:14
 */
public class TicketWindow extends Thread{
    private final String name;

    private static final int Max = 50 ;

    private static int index = 1;
    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= Max){
            System.out.println("柜台:" + name + "当前的号码是:"+(index++));
        }
    }
}
