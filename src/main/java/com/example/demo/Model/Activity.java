package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Time;


@Table(name = "`user`")
@JSONType(orders = {"uid","life","remain_life", "birthday", })
public class Activity extends BaseEntity {

    /**
     * uid
     */
    @Column(name = "`actid`")
    private long actid;

    /**
     * 密码
     */
    @Column(name = "`aid`")
    private long aid;

    /**
     * 描述
     */
    @Column(name = "`actname`")
    private String actname;

    /**
     * 描述
     */
    @Column(name = "`time`")
    private Time time;


    public Activity(long actid,long aid, String actname,Time time) {
        this.actid = actid;
        this.aid = aid;
        this.actname = actname;
        this.time = time;
    }


    public Activity() {

    }

    public long getActid() {
        return actid;
    }

    public void setActid(long actid) {
        this.actid = actid;
    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }


    public String getActname() {
        return actname;
    }

    public void setActname(String actname) {
        this.actname = actname;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


}