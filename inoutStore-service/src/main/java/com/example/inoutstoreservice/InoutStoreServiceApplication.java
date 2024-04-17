package com.example.inoutstoreservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.example.inoutstoreservice.controller", exclude = SecurityAutoConfiguration.class)
@MapperScan(basePackages = "com.example.inoutstoreservice.mapper")
public class InoutStoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InoutStoreServiceApplication.class, args);
    }

}
