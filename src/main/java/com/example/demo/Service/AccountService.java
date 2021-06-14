package com.example.demo.Service;

import com.example.demo.Base.BaseServiceImpl;
import com.example.demo.Dao.AccountDao;
import com.example.demo.Model.Account;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService extends BaseServiceImpl<Account> {

    @Resource
    private AccountDao accountDao;

    @Override
    public Mapper<Account> getMapper() {
        return accountDao;
    }

    /**
     * 查询所有商品
     */
    public List<Account> showAllAccount() {

        return accountDao.selectAll();
    }

    public void deleteAccount(long aid) {
        accountDao.deleteByAid(aid);
    }

    public  void insertAccount(Account account) {
        accountDao.insertAccount(account);
    }
}
