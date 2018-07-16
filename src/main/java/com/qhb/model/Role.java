package com.qhb.model;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by qianying on 2018/7/15.
 */
public class Role extends BaseModel implements Serializable{

    private Set<User> users;

    private String description;

    private RoleType roleType;

    public enum RoleType{
        presidence,
        useragent,
        commond
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
