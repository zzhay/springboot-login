package com.ruanko.springboothelloworld.mapper;


import com.ruanko.springboothelloworld.pojo.User;

public interface UserMapper {

    User getInfo(String name, String password);
    int addUser(User user);
}
