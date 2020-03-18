package com.sujit.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.TimeUnit;

public class MessageBuilder {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired MessageBuilder messageBuilder;

    @Value("${product.exchange.name}")
    private  String exchangeName;


    public void createMessage() {
        int i = 0;

        while(true) {
            i++;
            try {
                rabbitTemplate.convertAndSend(exchangeName, "*","Hello World " + i);

            }
            catch (Exception e) {
                System.out.println("Exception From rabbitmq " +e);
            }


            try {
                TimeUnit.SECONDS.sleep(1);

            }

            catch(Exception e) {
                System.out.println("Interrupted Exception " + e);
            }

        }


    }
}
