package com.example.demo.Service;

import com.example.demo.Base.BaseServiceImpl;
import com.example.demo.Dao.Expired_accountDao;
import com.example.demo.Dao.UserDao;
import com.example.demo.Model.Activity;
import com.example.demo.Model.Expired_account;
import com.example.demo.Model.User;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Expired_accountService extends BaseServiceImpl<Expired_account> {
    @Resource
    private Expired_accountDao expired_accountDao;

    @Override
    public Mapper<Expired_account> getMapper() {
        return expired_accountDao;
    }

    /**
     * 查询所有学生
     */
    public List<Expired_account> showAllExpired_account() {
        return expired_accountDao.selectAll();
    }

    public void addExpired_account(Expired_account expired_account) {
        expired_accountDao.insertExpired_account(expired_account);

    }

}
