package com.bw.domain;

/**
 * 实体类
 */

import com.mysql.fabric.xmlrpc.base.Data;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer role_id;
    private String userCode;
    private String password;
    private Data createtime;
    private String userAddress;
    private String userTel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Data getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Data createtime) {
        this.createtime = createtime;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", role_id=" + role_id +
                ", userCode='" + userCode + '\'' +
                ", password='" + password + '\'' +
                ", createtime=" + createtime +
                ", userAddress='" + userAddress + '\'' +
                ", userTel='" + userTel + '\'' +
                '}';
    }
}
