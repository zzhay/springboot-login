package com.ruanko.springboothelloworld;

import com.ruanko.springboothelloworld.mapper.UserMapper;
import com.ruanko.springboothelloworld.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHelloworldApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        User user = new User();
        user.setName("123");
        user.setPassword("123");
        userMapper.addUser(user);

    }

}
