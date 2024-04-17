package com.example.userservice.mapper;

import com.example.userservice.po.User;
import feign.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select u.username as username,u.password as password from user u where username = #{username}")
    User findUserByUsername(@Param("username") String username);
}
