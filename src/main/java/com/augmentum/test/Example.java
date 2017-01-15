package com.augmentum.test;

/**
 * Created by Leo on 2017/1/15.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Example {

    @RequestMapping("/")
    String home() {
        System.out.printf("hhhhhh");
        System.out.printf("ssssss");
        System.out.printf("ssssss");
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
