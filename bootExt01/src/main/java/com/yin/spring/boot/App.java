package com.yin.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController
public class App {

    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

}
