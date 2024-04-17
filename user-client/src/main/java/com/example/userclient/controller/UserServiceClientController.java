package com.example.userclient.controller;

import com.example.userclient.client.UserServiceClient;
import com.example.userclient.model.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Slf4j
public class UserServiceClientController {
    @Autowired
    private final UserServiceClient userServiceClient;

    @PostMapping("/login")
    public String login(User user){
        User userR = userServiceClient.findUserByUsername(user.getUsername());
        if(userR.getPassword().equals(user.getPassword())){
            return "登录成功！";
        } else {
            return "用户名或密码错误！";
        }
    }

    @GetMapping("/findUserByUsername/{username}")
    public User findUserByUsername(@PathVariable String username) {
        return userServiceClient.findUserByUsername(username);
    }
}
