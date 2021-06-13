package com.example.demo.Dao;

import com.example.demo.Model.Account;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao extends MyMapper<Account> {
    @Select(value = "select * from account")
    List<Account> selectAll();

    void deleteAccount(long aid);

}
