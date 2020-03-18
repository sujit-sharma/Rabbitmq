package com.sujit.rabbitmq.rabbitmqConfig;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

    @Bean
    public Queue productQueue(@Value("${product.queue.name}") final String queueName) {
        return new Queue(queueName);
    }
}
