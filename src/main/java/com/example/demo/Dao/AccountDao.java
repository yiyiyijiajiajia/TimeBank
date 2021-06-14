package com.example.demo.Dao;

import com.example.demo.Model.Account;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao extends MyMapper<Account> {
    @Select(value = "select * from account")
    List<Account> selectAll();

    void deleteAccount(long aid);

    void insertAccount(Account account);

    @Select(value = "select * from account where aname=#{aname}")
    List<Account> selectByAname(@Param("aname") String aname);

    @Update(value = "update account set atime=#{atime} where aname=#{aname}")
    void updateByAname(Account newAcc);
}
