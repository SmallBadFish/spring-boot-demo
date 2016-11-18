package com.yin.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Eason on 2016/11/17 16:33.
 */
@SpringBootApplication
public class SampleSimpleAppliction implements CommandLineRunner {

    @Autowired
    private HelloWorldService helloWorldService;

    public void run(String... args) throws Exception {
        System.out.println(this.helloWorldService.getHelloMessage());
        if (args.length > 0 && args[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleSimpleAppliction.class, args);
    }
}
