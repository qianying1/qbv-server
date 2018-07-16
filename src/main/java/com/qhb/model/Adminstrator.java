package com.qhb.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by qianying on 2018/7/15.
 */
public class Adminstrator extends BaseModel implements Serializable{

    private User user;

    private String respMan;

    private Date updateTime;

    private AdminLevel adminsLevel;

    public enum AdminLevel{
        top,
        middle,
        mim
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRespMan() {
        return respMan;
    }

    public void setRespMan(String respMan) {
        this.respMan = respMan;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public AdminLevel getAdminsLevel() {
        return adminsLevel;
    }

    public void setAdminsLevel(AdminLevel adminsLevel) {
        this.adminsLevel = adminsLevel;
    }
}
