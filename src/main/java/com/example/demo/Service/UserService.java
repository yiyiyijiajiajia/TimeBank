package com.example.demo.Service;

import com.example.demo.Base.BaseServiceImpl;
import com.example.demo.Dao.UserDao;
import com.example.demo.Model.User;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

//import com.space.movie.moviespacesimpleserver.contants.Constant;
//import com.space.movie.moviespacesimpleserver.util.EncryptUtil;
//import com.space.movie.moviespacesimpleserver.util.FastJsonUtils;

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

    public void addUser(User user) {
        userDao.insertUser(user);

    }

    public void update(User newUser) {
        userDao.updateByUid(newUser);
    }
    //public PageInfo<Film> getFilmList(Film record) {
    //}
}
