package com.company.dao.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Carriage {
    private int carriageid;
    private String tid;
    private String number;
    private String seatnumber;
    private int type;
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

    public int getCarriageid() {
        return carriageid;
    }

    public void setCarriageid(int carriageid) {
        this.carriageid = carriageid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        Carriage carriage = (Carriage) o;
        return carriageid == carriage.carriageid &&
                type == carriage.type &&
                Objects.equals(tid, carriage.tid) &&
                Objects.equals(number, carriage.number) &&
                Objects.equals(seatnumber, carriage.seatnumber) &&
                Objects.equals(creatTime, carriage.creatTime) &&
                Objects.equals(updataTime, carriage.updataTime) &&
                Objects.equals(creatUser, carriage.creatUser) &&
                Objects.equals(updataUser, carriage.updataUser) &&
                Objects.equals(deleteTime, carriage.deleteTime) &&
                Objects.equals(con1, carriage.con1) &&
                Objects.equals(con2, carriage.con2) &&
                Objects.equals(con3, carriage.con3) &&
                Objects.equals(con4, carriage.con4) &&
                Objects.equals(con5, carriage.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carriageid, tid, number, seatnumber, type, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
