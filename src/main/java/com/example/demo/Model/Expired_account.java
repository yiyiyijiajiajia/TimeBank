package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@Table(name = "`expired_account`")
@JSONType(orders = {"aid","time_spent","time_wasted", })
public class Expired_account extends BaseEntity {

    /**
     * uid
     */
    @Column(name = "`aid`")
    private long aid;

    /**
     * 密码
     */
    @Column(name = "`time_spent`")
    private Time time_spent;

    @Column(name = "`time_wasted`")
    private Time time_wasted;



    public Expired_account(long uid,Time time_spent, Time time_wasted) {
        this.aid = aid;
        this.time_spent = time_spent;
        this.time_wasted = time_wasted;

    }


    public Expired_account() {

    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

        public Time getTime_spent() {
        return time_spent;
    }

    public void setTime_spent(Time time_spent) {
        this.time_spent = time_spent;
    }


    public Time getTime_wasted() {
        return time_wasted;
    }

    public void setTime_wasted(Time time_wasted) {
        this.time_wasted = time_wasted;
    }

}