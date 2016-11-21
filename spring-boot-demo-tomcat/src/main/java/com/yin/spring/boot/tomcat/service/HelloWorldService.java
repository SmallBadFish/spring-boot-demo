package com.yin.spring.boot.tomcat.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Eason on 2016/11/21.
 */
@Component
public class HelloWorldService {
    @Value("${name:World}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }
}
