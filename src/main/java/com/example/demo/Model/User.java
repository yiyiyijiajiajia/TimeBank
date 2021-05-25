package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "`user`")
@JSONType(orders = {"uid","life","remain_life", "birthday", })
public class User extends BaseEntity {

    /**
     * uid
     */
    @Column(name = "`uid`")
    private long uid;

    /**
     * 密码
     */
    @Column(name = "`life`")
    private long life;

    /**
     * 描述
     */
    @Column(name = "`remain_life`")
    private long remain_life;

    /**
     * 描述
     */
    @Column(name = "`birthday`")
    private Date birthday;


    public User(long uid,long life, long remain_life, Date birthday) {
        this.uid = uid;
        this.life = life;
        this.remain_life = remain_life;
        this.birthday = birthday;
    }


    public User() {

    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getLife() {
        return life;
    }

    public void setLife(long life) {
        this.life = life;
    }


    public long getRemain_life() {
        return remain_life;
    }

    public void setRemain_life(long remain_life) {
        this.remain_life = remain_life;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}