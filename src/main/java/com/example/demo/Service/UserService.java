package com.example.demo.Service;

import com.example.demo.Base.BaseServiceImpl;
import com.example.demo.Dao.UserDao;
import com.example.demo.Model.User;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService extends BaseServiceImpl<User> {
    @Resource
    private UserDao userDao;

    @Override
    public Mapper<User> getMapper() {
        return userDao;
    }

    /**
     * 查询所有学生
     */
    public List<User> showAllUser() {
        return userDao.selectAll();
    }
    /**
     * 添加学生
     */
    public void addUser(User user) {
        userDao.insertUser(user);
    }
    /**
     * 更新学生信息
     */

    public boolean auth(User user) {
        return userDao.selectByPhoneAndPassword(user).size()==1;
    }
    public List<User> SelectByPhone(String phone) {
        return userDao.selectByPhone(phone);
    }
    public List<User> searchByUid(long uid) {
        return userDao.selectByUid(uid);
    }
    public void update(User newUser) {
        userDao.updateByUid(newUser);
    }
}
