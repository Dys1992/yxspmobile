package com.yxsp.mobile.controller;

import com.yxsp.mobile.entity.MobileEntity;
import com.yxsp.mobile.service.MobileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mobile")
public class MobilecController {

    @Resource
    private MobileService mobileService;


    @RequestMapping("/find")
    public MobileEntity index(long id){
        return mobileService.findMobileByIdServer(id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Map<String,Object> addUser(MobileEntity mobile){
        mobileService.addMobileService(mobile);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","success");
        return map;
    }

    @RequestMapping("/delete")
    public Map<String,Object> deleteMobile(long id){
        mobileService.deleteMobileService(id);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","success");
        return map;
    }

    @RequestMapping("/update")
    public Map<String,Object> updateMobile(MobileEntity mobile){
        mobileService.updateMobileService(mobile);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","success");
        return map;
    }
}
