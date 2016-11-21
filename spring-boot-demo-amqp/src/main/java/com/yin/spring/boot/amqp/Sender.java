package com.yin.spring.boot.amqp;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Eason on 2016/11/21.
 */
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Scheduled(fixedDelay = 1000L)
    public void send(){
        this.amqpTemplate.convertAndSend("foo","hello");
    }
}
