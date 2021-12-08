package com.oracle.mybatis.plus.controller;

import com.oracle.mybatis.plus.po.User;
import com.oracle.mybatis.plus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/detail")
    public User detail(String id){
        return userService.getById(id);
    }
    @RequestMapping("/add")
    public boolean detail(User user){
        boolean flag=userService.save(user);
        if(flag){
            return true;
        }
        return false;
    }
}
