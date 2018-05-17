package com.yxsp.mobile.dao;

import com.yxsp.mobile.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    UserEntity findById(long id);

    @Insert("insert into user (name,password) values(#{name},#{password})")
    void  addUser(UserEntity user);

    @Update("update user set name=#{name} where id=#{id}")
    void updateUserNameById(UserEntity user);

    @Update("update user set password=#{password} where id=#{id}")
    void updateUserPasswordById(UserEntity user);

}
