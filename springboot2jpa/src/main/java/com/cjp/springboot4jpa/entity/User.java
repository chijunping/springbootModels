package com.cjp.springboot4jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

//使用jpa注解配置映射关系
@Entity
@Table(name = "tb_user")//默认表明为类名小写
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增策略
    private Integer id;
    @Column(name = "last_name",length = 50) //默认为属性名
    private String lastName;
    @Column
    private String email;
}
