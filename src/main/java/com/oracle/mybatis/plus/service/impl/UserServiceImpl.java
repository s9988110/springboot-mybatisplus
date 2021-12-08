package com.oracle.mybatis.plus.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oracle.mybatis.plus.mapper.UserMapper;
import com.oracle.mybatis.plus.po.User;
import com.oracle.mybatis.plus.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
