package com.example.demo.Dao;

import com.example.demo.Model.Active_account;
import com.example.demo.Model.Activity;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Active_accountDao extends MyMapper<Active_account> {

    @Select(value = "select * from active_account")
    List<Active_account> selectAll();

    void insertActive_account(Active_account active_account);

    @Select(value = "select * from active_account where active_account=#{active_account}")
    List<Active_account> selectByAid(@Param(value = "aid") long aid);




    @Update(value = "update activity set actid=#{actid}, aid=#{aid}, actname=#{actname} where time=#{time}")
    void updateByActid(Activity newAct);
    //List<Student> selectByYearInterval(@Param("left") Integer left,@Param("right") Integer right);
}