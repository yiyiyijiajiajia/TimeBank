package com.example.demo.Service;

import com.example.demo.Base.BaseServiceImpl;
import com.example.demo.Dao.ActivityDao;
import com.example.demo.Model.Activity;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

//import com.space.movie.moviespacesimpleserver.contants.Constant;
//import com.space.movie.moviespacesimpleserver.util.EncryptUtil;
//import com.space.movie.moviespacesimpleserver.util.FastJsonUtils;

@Service
public class ActivityService extends BaseServiceImpl<Activity> {
    @Resource
    private ActivityDao activityDao;

    @Override
    public Mapper<Activity> getMapper() {
        return activityDao;
    }

    /**
     * 查询所有学生
     */
    public List<Activity> showAllActivity() {
        return activityDao.selectAll();
    }

    public void insertActivity(Activity activity) {
        activityDao.insertActivity(activity);

    }

    public void update(Activity newAct) {
        activityDao.updateByActid(newAct);
    }
    //public PageInfo<Film> getFilmList(Film record) {
    //}

    public void insertActivicy(Activity activity) {
        activityDao.insertActivity(activity);
    }

    public List<Activity> searchByAid(long aid) {
        return activityDao.searchByAid(aid);
    }
}