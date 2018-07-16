package com.qhb.model;

import java.util.Date;

/**
 * Created by qianying on 2018/7/15.
 */
public class BaseModel {

    private Long id;

    private Date insertTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
