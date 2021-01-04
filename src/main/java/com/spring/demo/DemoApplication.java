package com.spring.demo;

import com.spring.demo.repositories.PersonalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private PersonalDataRepository personalDataRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
