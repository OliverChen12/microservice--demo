package com.example.inoutstoreclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.example.inoutstoreclient.controller"}, exclude = SecurityAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients("com.example.inoutstoreclient.client")
public class InoutStoreClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(InoutStoreClientApplication.class, args);
    }

}
