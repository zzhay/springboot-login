package com.ruanko.springboothelloworld.controller;

import com.ruanko.springboothelloworld.service.UserService;
import com.ruanko.springboothelloworld.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 73776
 */
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/loginIn")
    public JsonResult login(String name, String password){
        JsonResult result = userService.loginIn(name, password);
        System.out.print("test3");
        return result;
    }
}
