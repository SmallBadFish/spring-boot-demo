package com.yin.spring.boot.tomcat7.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Eason on 2016/11/22.
 */
@SpringBootApplication
public class SampleTomcat7JspApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(SampleTomcat7JspApplication.class,args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SampleTomcat7JspApplication.class);
    }
}
