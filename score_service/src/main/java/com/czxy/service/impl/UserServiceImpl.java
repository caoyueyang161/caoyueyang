package com.czxy.service.impl;

import com.czxy.dao.UserMapper;
import com.czxy.domain.User;
import com.czxy.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

}
