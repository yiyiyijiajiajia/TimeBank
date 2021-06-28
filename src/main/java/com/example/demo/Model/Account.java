package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "`account`")
@JSONType(orders = {"aid", "uid", "aname", "atime", "retime"})
public class Account extends BaseEntity {
    @Column(name = "`aid`")
    private long aid;

    @Column(name = "`uid`")
    private long uid;

    @Column(name = "`aname`")
    private String aname;

    //给account分配的时间
    @Column(name = "`atime`")
    private long atime;

    //account剩余的时间
    @Column(name = "`retime`")
    private Long retime;

    @Column(name = "`status`")
    private int status;

    public Account(long aid, long uid, String aname, long atime, Long retime,int status) {
        this.aid = aid;
        this.uid = uid;
        this.aname = aname;
        this.atime= atime;
        this.retime= retime;
        this.status = status;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAtime(long atime) {
        this.atime = atime;
    }
    public Long getRetime(){ return retime;}
    public void setRetime(Long retime) {
        this.retime = retime;
    }
}