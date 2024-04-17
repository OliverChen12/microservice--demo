package com.example.userclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.example.userclient.controller"}, exclude = SecurityAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients("com.example.userclient.client")
public class UserClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserClientApplication.class, args);
    }

}
