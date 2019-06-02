package com.serendipity;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建消息队列
 * 
 * @author gqh
 *
 */
@Configuration
public class QueueConfig {
    @Bean
    public Queue creteQueue() {
        return new Queue("Hello-queue");
    }
}
