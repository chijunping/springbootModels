package com.cjp.springboot4jpa.service.impl;

import com.cjp.springboot4jpa.entity.User;
import com.cjp.springboot4jpa.repository.UserRepository;
import com.cjp.springboot4jpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    public User getUserById(Integer id) {
        //int a = 1 / 0;//测试声明式事物
        User user = userRepository.getOne(id);
        return user;
    }

    @Override
    public User insertUser(User user) {
        try {
            int a = 1 / 0;//测试声明式事物
        } catch (Exception e) {
            e.printStackTrace();
        }

        User save = userRepository.save(user);
        return save;
    }
}
