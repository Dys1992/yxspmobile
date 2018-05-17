package com.yxsp.mobile.dao;

import com.yxsp.mobile.entity.MobileEntity;
import org.apache.ibatis.annotations.*;

/**
 * @author fanyu
 * @date 2018/05/09
 */

@Mapper
public interface MobileDao {

    @Insert("insert into mobile(Mname,Mversion,Mibkn,Mibrw) values(#{Mname},#{Mversion},#{Mibkn},#{Mibrw})")
    void addMobile(MobileEntity mobile);

    @Update("update mobile set Mname=#{Mname},Mversion=#{Mversion},Mibkn=#{Mibkn} where id=#{id}")
    void updateMobile(MobileEntity mobile);

    @Delete("delete from mobile where id=#{id}")
     void deleteMobileService(long id);

    @Select("select * from mobile where id = #{id}")
    MobileEntity findMobileById(long id);

    @Select("select * from mobile where Mibrw = #{Mibrw}")
    MobileEntity findMobileByMibrw(boolean Mibrw);



}
