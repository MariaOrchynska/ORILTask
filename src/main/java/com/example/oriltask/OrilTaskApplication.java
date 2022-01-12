package com.example.oriltask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;
@EntityScan("com.example.oriltask")
@SpringBootApplication
public class OrilTaskApplication {



    public static void main(String[] args) {
        SpringApplication.run(OrilTaskApplication.class, args);


    }



}