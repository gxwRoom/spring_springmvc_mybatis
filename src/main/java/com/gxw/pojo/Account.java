package com.gxw.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 账号实体类
 * 一个账号只属于一个用户，一对一模式
 * @author GXW工作室
 * @date 2020/6/2 0002 - 11:02
 */
@Component
public class Account implements Serializable{
    private Integer ID;
    private Integer UID;
    private Double MONEY;

    //关联用户信息
    private User user;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public Double getMONEY() {
        return MONEY;
    }

    public void setMONEY(Double MONEY) {
        this.MONEY = MONEY;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", UID=" + UID +
                ", MONEY=" + MONEY +
                ", user=" + user +
                '}';
    }
}
