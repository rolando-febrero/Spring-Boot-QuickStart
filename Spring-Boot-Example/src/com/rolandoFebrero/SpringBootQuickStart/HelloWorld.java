package com.rolandoFebrero.SpringBootQuickStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * @author Rolando 'rOLo' Febrero
 * @Project Spring Boot Quick Start by rOlo
 */

@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/")
    String hello() {
        return "Hello World! Congratulations, you just created your Spring Boot application";
    }
    
    @RequestMapping("/hello/{name}")
    String helloThere(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }
}