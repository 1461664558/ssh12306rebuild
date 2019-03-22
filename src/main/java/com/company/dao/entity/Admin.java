package com.company.dao.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Admin {
    private int adminid;
    private String adminname;
    private String adminpassword;
    private Timestamp creatTime;
    private Timestamp updataTime;
    private String creatUser;
    private String updataUser;
    private Timestamp deleteTime;
    private String con1;
    private String con2;
    private String con3;
    private String con4;
    private String con5;

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    public Timestamp getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Timestamp updataTime) {
        this.updataTime = updataTime;
    }

    public String getCreatUser() {
        return creatUser;
    }

    public void setCreatUser(String creatUser) {
        this.creatUser = creatUser;
    }

    public String getUpdataUser() {
        return updataUser;
    }

    public void setUpdataUser(String updataUser) {
        this.updataUser = updataUser;
    }

    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getCon1() {
        return con1;
    }

    public void setCon1(String con1) {
        this.con1 = con1;
    }

    public String getCon2() {
        return con2;
    }

    public void setCon2(String con2) {
        this.con2 = con2;
    }

    public String getCon3() {
        return con3;
    }

    public void setCon3(String con3) {
        this.con3 = con3;
    }

    public String getCon4() {
        return con4;
    }

    public void setCon4(String con4) {
        this.con4 = con4;
    }

    public String getCon5() {
        return con5;
    }

    public void setCon5(String con5) {
        this.con5 = con5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return adminid == admin.adminid &&
                Objects.equals(adminname, admin.adminname) &&
                Objects.equals(adminpassword, admin.adminpassword) &&
                Objects.equals(creatTime, admin.creatTime) &&
                Objects.equals(updataTime, admin.updataTime) &&
                Objects.equals(creatUser, admin.creatUser) &&
                Objects.equals(updataUser, admin.updataUser) &&
                Objects.equals(deleteTime, admin.deleteTime) &&
                Objects.equals(con1, admin.con1) &&
                Objects.equals(con2, admin.con2) &&
                Objects.equals(con3, admin.con3) &&
                Objects.equals(con4, admin.con4) &&
                Objects.equals(con5, admin.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminid, adminname, adminpassword, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
