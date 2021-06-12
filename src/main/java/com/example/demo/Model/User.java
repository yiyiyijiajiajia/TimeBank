package com.example.demo.Model;

import com.alibaba.fastjson.annotation.JSONType;
import com.example.demo.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "`user`")
@JSONType(orders = {"uid", "life", "birthday", "relife", "spentlife", "phone", "password"})
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
    private int life;

    /**
     * 描述
     */
    @Column(name = "`birthday`")
    private String birthday;

    /**
     * 描述
     */
    @Column(name = "`relife`")
    private int relife;

    @Column(name = "`spentlife`")
    private int spentlife;

    @Column(name = "`phone`")
    private String phone;

    @Column(name = "`password`")
    private String password;

    public User(long uid, int life, String birthday, int relife, int spentlife, String phone, String password) {
        this.uid = uid;
        this.life = life;
        this.birthday = birthday;
        this.relife = relife;
        this.spentlife = spentlife;
        this.phone = phone;
        this.password = password;
    }


    public User() {

    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getRelife() {
        return relife;
    }

    public void setRelife(int relife) {
        this.relife = relife;
    }

    public int getSpentlife() {
        return spentlife;
    }

    public void setSpentlife(int spentlife) {
        this.spentlife = spentlife;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}