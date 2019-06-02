package com.serendipity;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 *
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(String msg) {
        // 向消息队列发送消息
        // 参数一:队列名称
        // 参数二:消息
        amqpTemplate.convertAndSend("Hello-queue",msg);
    }
}
