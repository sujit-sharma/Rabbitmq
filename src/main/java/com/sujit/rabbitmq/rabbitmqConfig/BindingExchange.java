package com.sujit.rabbitmq.rabbitmqConfig;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BindingExchange {

    @Bean
    public Binding bindingFanoutExchangeQueueProduct(final Queue productQueue, final Exchange productFanoutExchange) {
       return BindingBuilder.bind(productQueue).to(productFanoutExchange).with("*").noargs();
    }
}
