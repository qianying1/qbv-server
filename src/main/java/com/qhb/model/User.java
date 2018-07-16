package com.qhb.model;

import java.io.Serializable;
import java.util.Set;

public class User extends BaseModel implements Serializable {

    private String userName;

    private String password;

    private String phone;

    private Role role;

    private Set<Adminstrator> adminstrators;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Adminstrator> getAdminstrators() {
        return adminstrators;
    }

    public void setAdminstrators(Set<Adminstrator> adminstrators) {
        this.adminstrators = adminstrators;
    }
}