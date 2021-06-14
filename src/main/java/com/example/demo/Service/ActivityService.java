package com.example.demo.Service;

import com.example.demo.Base.BaseServiceImpl;
import com.example.demo.Dao.ActivityDao;
import com.example.demo.Model.Activity;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import javax.annotation.Resource;
import java.util.List;


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

    public List<Activity> searchByAid(long aid) {
        return activityDao.searchByAid(aid);
    }
    public void deleteActivity(long actid) {
        activityDao.deleteByActid(actid);
    }
}