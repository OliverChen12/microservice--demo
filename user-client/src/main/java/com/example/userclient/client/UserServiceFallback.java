package com.example.userclient.client;

import com.example.userclient.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;
@Slf4j
@Component
public class UserServiceFallback implements UserServiceClient {
    @Override
    public User findUserByUsername(String username) {
        log.info("findUserByUsername callback");
        return null;
    }

    @Override
    public String login(User user) {
        log.info("login callback");
        return null;
    }
}
