package com.example.productclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication(scanBasePackages = {"com.example.productclient.controller"}, exclude = SecurityAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients("com.example.productclient.client")
public class ProductClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductClientApplication.class, args);
    }
}