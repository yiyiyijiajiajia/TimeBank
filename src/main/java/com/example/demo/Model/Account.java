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

    @Column(name = "`atime`")
    private String atime;

    @Column(name = "`retime`")
    private String retime;

    public Account(long aid, long uid, String aname, String atime, String retime) {
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

    public String getAtime(){ return atime;}

    public void setAtime(String atime) {
        this.atime = atime;
    }
    public String getRetime(){ return retime;}
    public void setRetime(String retime) {
        this.retime = retime;
    }
}