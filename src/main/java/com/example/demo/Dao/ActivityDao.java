package com.example.demo.Dao;

import com.example.demo.Model.Activity;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ActivityDao extends MyMapper<Activity> {

    @Select(value = "select * from activity")
    List<Activity> selectAll();

    void insertActivity(Activity activity);

    @Select(value = "select * from activity where actid=#{actid}")
    List<Activity> selectByActid(@Param(value = "actid") long actid);

    List<Activity> searchByAid(long aid);



    @Update(value = "update activity set actid=#{actid}, aid=#{aid}, actname=#{actname} where time=#{time}")
    void updateByActid(Activity newAct);
    //List<Student> selectByYearInterval(@Param("left") Integer left,@Param("right") Integer right);

}