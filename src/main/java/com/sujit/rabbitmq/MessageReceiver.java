package com.sujit.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @RabbitListener(queues = "product.queue.name")
    public void recievedMessage1(String data) {
        System.out.println("\nRecieved Message From  product RabbitMQ 111 : " + data);
    }

    @RabbitListener(queues = "sales.queue.name")
    public void recievedMessage2(String data) {
        System.out.println("\nRecieved Message From sales RabbitMQ: 222 " +data);
    }

    @RabbitListener(queues = "testsujt")
    public void recievedMessage3(String data) {
        System.out.println("\nRecieved Message From testsuit RabbitMQ: 333 " +data);
    }

    @RabbitListener(queues = "testtest")
    public void recievedMessage4(String data) {
        System.out.println("\nRecieved Message From testtest RabbitMQ: 444 " +data);
    }



}
