package com.example.demo.Dao;

import com.example.demo.Model.User;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao extends MyMapper<User> {

    @Select(value = "select * from user")
    List<User> selectAll();

    void insertUser(User user);

    @Select(value = "select * from user where phone=#{phone}")
    List<User> selectByPhone(String phone);

    List<User> selectByPhoneAndPassword(User user);

    @Select(value = "select * from user where uid=#{uid}")
    List<User> selectByUid(@Param(value = "uid") long uid);

    @Update(value = "update student set life=#{life}, password=#{password}, birthday#{birthday} where uid=#{uid}")
    void updateByUid(User newUser);

}

