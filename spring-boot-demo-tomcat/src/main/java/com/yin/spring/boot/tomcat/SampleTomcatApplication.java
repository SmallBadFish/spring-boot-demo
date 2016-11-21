package com.yin.spring.boot.tomcat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Eason on 2016/11/21.
 */
@SpringBootApplication
public class SampleTomcatApplication {

    private static Log logger = LogFactory.getLog(SampleTomcatApplication.class);

    @Bean
    protected ServletContextListener listener() {
        return new ServletContextListener() {

            public void contextInitialized(ServletContextEvent sce) {
                logger.info("ServletContext initialized");
            }

            public void contextDestroyed(ServletContextEvent sce) {
                logger.info("ServletContext destroyed");
            }

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleTomcatApplication.class,args);
    }
}
