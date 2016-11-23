package com.yin.spring.boot.tomcat80.ssl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Eason on 2016/11/23.
 */
@Controller
public class SampleController {

    @GetMapping
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
