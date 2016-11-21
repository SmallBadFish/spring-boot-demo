package com.yin.spring.boot;

import org.apache.activemq.broker.region.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;

/**
 * Created by Eason on 2016/11/21.
 */
public class Producer implements CommandLineRunner {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void run(String... strings) throws Exception {
        send("Sample message");
        System.out.println("Message was sent to the Queue");
    }

    public void send(String message) {
        jmsMessagingTemplate.convertAndSend(message);
    }
}
