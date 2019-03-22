package com.company.dao.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Intergal {
    private int intergalid;
    private String username;
    private int intergal;
    private Timestamp gettime;
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

    public int getIntergalid() {
        return intergalid;
    }

    public void setIntergalid(int intergalid) {
        this.intergalid = intergalid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIntergal() {
        return intergal;
    }

    public void setIntergal(int intergal) {
        this.intergal = intergal;
    }

    public Timestamp getGettime() {
        return gettime;
    }

    public void setGettime(Timestamp gettime) {
        this.gettime = gettime;
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
        Intergal intergal1 = (Intergal) o;
        return intergalid == intergal1.intergalid &&
                intergal == intergal1.intergal &&
                Objects.equals(username, intergal1.username) &&
                Objects.equals(gettime, intergal1.gettime) &&
                Objects.equals(creatTime, intergal1.creatTime) &&
                Objects.equals(updataTime, intergal1.updataTime) &&
                Objects.equals(creatUser, intergal1.creatUser) &&
                Objects.equals(updataUser, intergal1.updataUser) &&
                Objects.equals(deleteTime, intergal1.deleteTime) &&
                Objects.equals(con1, intergal1.con1) &&
                Objects.equals(con2, intergal1.con2) &&
                Objects.equals(con3, intergal1.con3) &&
                Objects.equals(con4, intergal1.con4) &&
                Objects.equals(con5, intergal1.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intergalid, username, intergal, gettime, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
