package com.jmsweb.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.jmsweb.controller.home")
public class WebBootConfiguration extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebBootConfiguration.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebBootConfiguration.class);
    }
}
