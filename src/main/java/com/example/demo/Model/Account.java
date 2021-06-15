package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "`account`")
@JSONType(orders = {"aid", "uid", "aname", "atime", "retime"})
public class Account extends BaseEntity {
    @Column(name = "`aid`")
    private long aid;

    @Column(name = "`uid`")
    private long uid;

    @Column(name = "`aname`")
    private String aname;

    @Column(name = "`atime`")
    private long atime;

    @Column(name = "`retime`")
    private long retime;

    public Account(long aid, long uid, String aname, long atime, long retime) {
        this.aid = aid;
        this.uid = uid;
        this.aname = aname;
        this.atime= atime;
        this.retime= retime;

    }

    public Account() {

    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getAname(){ return aname;}

    public void setAname(String aname) {
        this.aname = aname;
    }

    public long getAtime(){ return atime;}

    public void setAtime(long atime) {
        this.atime = atime;
    }
    public long getRetime(){ return retime;}
    public void setRetime(long retime) {
        this.retime = retime;
    }
}