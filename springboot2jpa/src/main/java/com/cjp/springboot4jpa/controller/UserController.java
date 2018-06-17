package com.cjp.springboot4jpa.controller;

import com.cjp.springboot4jpa.entity.User;
import com.cjp.springboot4jpa.service.IUserService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserService userService;


    @RequestMapping("getUserById")
    public User getUserById(Integer id) {
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("insertUser")
    public User insertUser(@RequestBody User user) {
        User save = userService.insertUser(user);
        return save;
    }

}
