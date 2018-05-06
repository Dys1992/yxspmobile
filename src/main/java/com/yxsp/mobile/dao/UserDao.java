package com.yxsp.mobile.dao;

import com.yxsp.mobile.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    UserEntity findById(long id);

    @Insert("insert into user (name,password) values(#{name},#{password})")
    void  addUser(UserEntity user);


}
