package com.example.demo.Dao;

import com.example.demo.Model.User;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Collection;
import java.util.List;

public interface UserDao extends MyMapper<User> {

    @Select(value = "select * from user")
    List<User> selectAll();

    void insertUser(User user);

    @Select(value = "select * from user where uid=#{uid}")
    List<User> selectByUid(@Param(value = "uid") long uid);

    List<User> selectByLife(long life);



    @Update(value = "update user set birthday=#{birthday}, life=#{life}, remain_life=#{remain_life} where uid=#{uid}")
    void updateByUid(User newUser);
    //List<Student> selectByYearInterval(@Param("left") Integer left,@Param("right") Integer right);
}

