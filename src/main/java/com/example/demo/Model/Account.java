package com.example.demo.Model;

import com.example.demo.Base.BaseEntity;
import org.w3c.dom.Text;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@Table(name = "`account`")
public class Account extends BaseEntity {
    @Column(name = "`aid`")
    private long aid;

    @Column(name = "`uid`")
    private long uid;

    @Column(name = "`aname`")
    private String aname;

    @Column(name = "`state`")
    private long state;

    @Column(name = "`atime`")
    private Time atime;

    @Column(name = "`deadline`")
    private Date deadline;
    public Account(long aid, long uid,String aname, long state,Time atime,Date deadline) {
        this.aid = aid;
        this.uid = uid;
        this.state = state;
        this.aname = aname;
        this.atime= atime;
        this.deadline= deadline;

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
    public long getState(){ return state;}
    public void setState(long state) {
        this.state = state;
    }
    public Time getAtime(){ return atime;}
    public void setAtime(Time atime) {
        this.atime = atime;
    }
    public Date getDeadline(){ return deadline;}
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}