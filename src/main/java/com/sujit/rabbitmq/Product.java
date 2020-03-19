package com.sujit.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;


public class Product {




    @Value("${product.exchange.name}")
    private  String exchangeName;

    private String name = "marks" ;
    private String price = " 200";

    public Product() {

    }

    public Product(String name, String price){
        this.name =  name;
        this.price =  price;

    }

    public void sendMessage(RabbitTemplate rabbitTemplate) {
        System.out.println("Inside send message");
        int i = 0;

        while(true) {
            System.out.println("Inside send data sending to queue");

            i++;
            try {
                rabbitTemplate.convertAndSend("product.exchange.name", "","Hello world");
                System.out.println("Data send Successfully");


            }
            catch (Exception e) {
                System.out.println("Exception From rabbitmq " +e);
            }


            try {
                TimeUnit.SECONDS.sleep(2);

            }

            catch(Exception e) {
                System.out.println("Interrupted Exception " + e);
            }

        }


    }
}
