package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;


@Table(name = "`activity`")
@JSONType(orders = {"actid", "aid", "actname", "time", "spenttime", "usedate"})
public class Activity extends BaseEntity {


    @Column(name = "`actid`")
    private long actid;

    @Column(name = "`aid`")
    private long aid;

    @Column(name = "`actname`")
    private String actname;

    @Column(name = "`time`")
    private String time;

    @Column(name = "`spenttime`")
    private String spenttime;

    @Column(name = "`usedate`")
    private String usedate;

    @Column(name = "`aname`")
    private String aname;

    public Activity(long actid, long aid, String actname, String time, String spenttime, String usedate,String aname) {
        this.actid = actid;
        this.aid = aid;
        this.actname = actname;
        this.time = time;
        this.spenttime = spenttime;
        this.usedate = usedate;
        this.aname = aname;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSpenttime() {
        return spenttime;
    }

    public void setSpenttime(String spenttime) {
        this.spenttime = spenttime;
    }

    public String getUsedate() {
        return usedate;
    }

    public void setUsedate(String usedate) {
        this.usedate = usedate;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}