package com.ruanko.springboothelloworld.service;


import com.ruanko.springboothelloworld.utils.JsonResult;

/**
 * @author 73776
 */
public interface UserService {

    JsonResult loginIn(String name, String password);

}
