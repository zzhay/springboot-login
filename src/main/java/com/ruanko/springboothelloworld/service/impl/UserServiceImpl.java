package com.ruanko.springboothelloworld.service.impl;

import com.ruanko.springboothelloworld.mapper.UserMapper;
import com.ruanko.springboothelloworld.pojo.User;
import com.ruanko.springboothelloworld.service.UserService;
import com.ruanko.springboothelloworld.utils.JsonResult;
import com.ruanko.springboothelloworld.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 73776
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public JsonResult loginIn(String name, String password) {
        String md5Pasword = MD5Utils.md5(password);

        User user = userMapper.getInfo(name, md5Pasword);
        if(user!=null){
            return new JsonResult(true,"登录成功", user);
        }else {
            return new JsonResult(false,"登录失败", null);
        }
    }
}
