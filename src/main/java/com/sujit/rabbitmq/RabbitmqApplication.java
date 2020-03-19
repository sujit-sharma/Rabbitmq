package com.sujit.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqApplication {


    public static void main(String[] args) {

        SpringApplication.run(RabbitmqApplication.class, args);

    }
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Bean
    public void  StartApp() {
    new Thread(new Runnable () {
        @Override
        public void run() {
            Product messageBuilder = new Product();
            messageBuilder.sendMessage(rabbitTemplate);

        }
    }).start();







    }


}
