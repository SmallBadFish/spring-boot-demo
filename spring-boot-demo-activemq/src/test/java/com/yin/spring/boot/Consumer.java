package com.yin.spring.boot;

import org.springframework.jms.annotation.JmsListener;

/**
 * Created by Eason on 2016/11/21.
 */
public class Consumer {

    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text){
        System.out.println(text);
    }
}
