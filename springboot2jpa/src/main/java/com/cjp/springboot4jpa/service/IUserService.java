package com.cjp.springboot4jpa.service;

import com.cjp.springboot4jpa.entity.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserService {

    public User getUserById(Integer id);

    public User insertUser(@RequestBody User user);
}
