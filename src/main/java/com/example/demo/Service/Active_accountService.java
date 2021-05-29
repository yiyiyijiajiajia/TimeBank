package com.example.demo.Service;

import com.example.demo.Base.BaseServiceImpl;
import com.example.demo.Dao.Active_accountDao;
import com.example.demo.Dao.ActivityDao;
import com.example.demo.Dao.UserDao;
import com.example.demo.Model.Active_account;
import com.example.demo.Model.Activity;
import com.example.demo.Model.User;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

//import com.space.movie.moviespacesimpleserver.contants.Constant;
//import com.space.movie.moviespacesimpleserver.util.EncryptUtil;
//import com.space.movie.moviespacesimpleserver.util.FastJsonUtils;

@Service
public class Active_accountService extends BaseServiceImpl<Active_account> {
    @Resource
    private Active_accountDao active_accountDao;

    @Override
    public Mapper<Active_account> getMapper() {
        return active_accountDao;
    }

    /**
     * 查询所有学生
     */
    public List<Active_account> showAllActive_account() {
        return active_accountDao.selectAll();
    }

    public void addActivity(Active_account active_account) {
        active_accountDao.insertActive_account(active_account);

    }

}