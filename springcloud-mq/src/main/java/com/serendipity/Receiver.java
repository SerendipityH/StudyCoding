package com.serendipity;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收者
 *
 */
@Component
public class Receiver {

    @RabbitListener(queues = "Hello-queue")
    public void process(String msg) {
        System.out.println("recevier:" + msg);
    }
}
