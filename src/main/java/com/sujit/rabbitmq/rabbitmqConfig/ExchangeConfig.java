package com.sujit.rabbitmq.rabbitmqConfig;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {

    @Bean
    public Exchange productFanoutExchange(@Value("${product.exchange.name}") final String exchangeName) {
        return new FanoutExchange(exchangeName);
    }
}
