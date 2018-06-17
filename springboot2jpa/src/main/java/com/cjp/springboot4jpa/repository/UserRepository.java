package com.cjp.springboot4jpa.repository;

import com.cjp.springboot4jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承 JpaRepository<操作实例的类型,操作实例的主键的类型> 来实现对数据库的操作
public interface UserRepository extends JpaRepository<User, Integer> {
}
