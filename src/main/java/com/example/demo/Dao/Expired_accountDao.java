package com.example.demo.Dao;

import com.example.demo.Model.Expired_account;
import com.example.demo.Model.User;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Collection;
import java.util.List;

public interface Expired_accountDao extends MyMapper<Expired_account> {

    @Select(value = "select * from expired_account")
    List<Expired_account> selectAll();

    void insertExpired_account(Expired_account expired_account);

    @Select(value = "select * from expired_account where aid=#{aid}")
    List<User> selectByExpired_account(@Param(value = "aid") long aid);





    @Update(value = "update user set birthday=#{birthday}, life=#{life}, remain_life=#{remain_life} where uid=#{uid}")
    void updateByUid(User newUser);
    //List<Student> selectByYearInterval(@Param("left") Integer left,@Param("right") Integer right);
}
