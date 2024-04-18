package com.example.userclient.client;

import com.example.userclient.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="user-service",fallback = UserServiceFallback.class)
public interface UserServiceClient {
    @GetMapping("/findUserByUsername/{username}")
    User findUserByUsername(@RequestParam(value = "username") String username);
    @PostMapping("/login")
    String login(@RequestBody User user);
}
