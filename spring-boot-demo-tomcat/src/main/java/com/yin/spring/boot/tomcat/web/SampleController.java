package com.yin.spring.boot.tomcat.web;

import com.yin.spring.boot.tomcat.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Eason on 2016/11/21.
 */
@Controller
public class SampleController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/")
    @ResponseBody
    public String helloWorld(){
        return this.helloWorldService.getHelloMessage();
    }
}
