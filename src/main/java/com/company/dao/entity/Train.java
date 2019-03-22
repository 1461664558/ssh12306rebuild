package com.company.dao.entity;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

public class Train {
    private String tid;
    private int route;
    private String startstation;
    private String endstation;
    private Timestamp starttime;
    private Timestamp endtime;
    private Time last;
    private String noseatnumber;
    private BigDecimal mile;
    private String bodytype;
    private String type;
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

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    public String getStartstation() {
        return startstation;
    }

    public void setStartstation(String startstation) {
        this.startstation = startstation;
    }

    public String getEndstation() {
        return endstation;
    }

    public void setEndstation(String endstation) {
        this.endstation = endstation;
    }

    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public Time getLast() {
        return last;
    }

    public void setLast(Time last) {
        this.last = last;
    }

    public String getNoseatnumber() {
        return noseatnumber;
    }

    public void setNoseatnumber(String noseatnumber) {
        this.noseatnumber = noseatnumber;
    }

    public BigDecimal getMile() {
        return mile;
    }

    public void setMile(BigDecimal mile) {
        this.mile = mile;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
        Train train = (Train) o;
        return route == train.route &&
                Objects.equals(tid, train.tid) &&
                Objects.equals(startstation, train.startstation) &&
                Objects.equals(endstation, train.endstation) &&
                Objects.equals(starttime, train.starttime) &&
                Objects.equals(endtime, train.endtime) &&
                Objects.equals(last, train.last) &&
                Objects.equals(noseatnumber, train.noseatnumber) &&
                Objects.equals(mile, train.mile) &&
                Objects.equals(bodytype, train.bodytype) &&
                Objects.equals(type, train.type) &&
                Objects.equals(creatTime, train.creatTime) &&
                Objects.equals(updataTime, train.updataTime) &&
                Objects.equals(creatUser, train.creatUser) &&
                Objects.equals(updataUser, train.updataUser) &&
                Objects.equals(deleteTime, train.deleteTime) &&
                Objects.equals(con1, train.con1) &&
                Objects.equals(con2, train.con2) &&
                Objects.equals(con3, train.con3) &&
                Objects.equals(con4, train.con4) &&
                Objects.equals(con5, train.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, route, startstation, endstation, starttime, endtime, last, noseatnumber, mile, bodytype, type, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
