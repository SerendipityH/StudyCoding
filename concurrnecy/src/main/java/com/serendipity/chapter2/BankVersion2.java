package com.serendipity.chapter2;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 13:28
 */
public class BankVersion2 {
    public static void main(String[] args) {
        final TicketWindowRunnable ticketWindow = new TicketWindowRunnable();
        Thread thread1 = new Thread(ticketWindow, "一号窗口");
        Thread thread2 = new Thread(ticketWindow, "二号窗口");
        Thread thread3 = new Thread(ticketWindow, "三号窗口");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
