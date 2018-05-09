package com.yxsp.mobile.service;

import com.yxsp.mobile.dao.MobileDao;
import com.yxsp.mobile.entity.MobileEntity;
import com.yxsp.mobile.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MobileService {
    @Resource
    private MobileDao mobileDao;

    public void addMobileService(MobileEntity mobile){
        mobileDao.addMobile(mobile);
    }

    public void updateMobileService( MobileEntity mobile){
        mobileDao.updateMobile(mobile);
    }

    public void deleteMobileService( long id ){
        mobileDao.deleteMobileService(id);
    }

    public MobileEntity findMobileByIdService( long id){
        return mobileDao.findMobileById(id);
    }

    public  MobileEntity findMobileByMibrwService( boolean Mibrw){
        return mobileDao.findMobileByMibrw(Mibrw);
    }

}
