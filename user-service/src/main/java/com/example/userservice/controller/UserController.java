package com.example.userservice.controller;

import com.example.userservice.mapper.UserMapper;
import com.example.userservice.po.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Slf4j
public class UserController {
    private final UserMapper userMapper;
    @PostMapping("/login")
    public String login(@PathVariable User user){
        User userR = userMapper.findUserByUsername(user.getUsername());
        if(userR.getPassword().equals(user.getPassword())){
            return "登录成功！";
        } else {
            return "用户名或密码错误！";
        }
    }

    @GetMapping("/findUserByUsername/{username}")
    public User findUserByUsername(@PathVariable String username) {
        return userMapper.findUserByUsername(username);
    }

}
