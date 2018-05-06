package com.yxsp.mobile.service;

import com.yxsp.mobile.dao.UserDao;
import com.yxsp.mobile.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public UserEntity getUserById(long id){
        return userDao.findById(id);
    }

    public void addUser( UserEntity userEntity){
        userDao.addUser(userEntity);
    }



}
