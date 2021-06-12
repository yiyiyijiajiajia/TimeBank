package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;


@Table(name = "`activity`")
@JSONType(orders = {"actid", "aid", "actname", "time", "spenttime", "usedate"})
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
    private String time;

    @Column(name = "`spenttime`")
    private String spenttime;

    @Column(name = "`usedate`")
    private String usedate;

    public Activity(long actid, long aid, String actname, String time, String spenttime, String usedate) {
        this.actid = actid;
        this.aid = aid;
        this.actname = actname;
        this.time = time;
        this.spenttime = spenttime;
        this.usedate = usedate;
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
}