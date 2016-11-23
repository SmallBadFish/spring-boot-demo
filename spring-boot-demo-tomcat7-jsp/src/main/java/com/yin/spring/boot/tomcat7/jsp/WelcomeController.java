package com.yin.spring.boot.tomcat7.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by Eason on 2016/11/22.
 */
@Controller
public class WelcomeController {
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message",this.message);
        return "welcome";
    }
}
