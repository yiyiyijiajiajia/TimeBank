package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@Table(name = "`active_account`")
@JSONType(orders = {"aid","remain_time","percent", })
public class Active_account extends BaseEntity {

    /**
     * uid
     */
    @Column(name = "`aid`")
    private long aid;

    /**
     * 密码
     */
    @Column(name = "`remain_time`")
    private Time remain_time;

    /**
     * 描述
     */
    @Column(name = "`percent`")
    private long percent;

    /**
     * 描述
     */



    public Active_account(long aid,Time remain_life, long percent) {
        this.aid = aid;
        this.remain_time = remain_life;
        this.percent = percent;
    }


    public Active_account() {

    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public Time getRemain_time() {
        return remain_time;
    }

    public void setRemain_time(Time remain_time) {
        this.remain_time = remain_time;
    }


    public long getPercent() {
        return percent;
    }

    public void setPercent(long percent) {
        this.percent = percent;
    }

}
