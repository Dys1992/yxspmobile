package com.yxsp.mobile.controller;

import com.yxsp.mobile.entity.UserEntity;
import com.yxsp.mobile.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/find")
    public UserEntity index(long id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Map<String,Object> addUser(UserEntity user){
        userService.addUser(user);

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","success");
        return map;
    }

}
