package com.company.dao.entity;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

public class Route {
    private int routeid;
    private String tid;
    private String stationid;
    private String stationname;
    private Time endstation;
    private Time startstation;
    private BigDecimal mile;
    private Time staytime;
    private Time last;
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

    public int getRouteid() {
        return routeid;
    }

    public void setRouteid(int routeid) {
        this.routeid = routeid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public Time getEndstation() {
        return endstation;
    }

    public void setEndstation(Time endstation) {
        this.endstation = endstation;
    }

    public Time getStartstation() {
        return startstation;
    }

    public void setStartstation(Time startstation) {
        this.startstation = startstation;
    }

    public BigDecimal getMile() {
        return mile;
    }

    public void setMile(BigDecimal mile) {
        this.mile = mile;
    }

    public Time getStaytime() {
        return staytime;
    }

    public void setStaytime(Time staytime) {
        this.staytime = staytime;
    }

    public Time getLast() {
        return last;
    }

    public void setLast(Time last) {
        this.last = last;
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
        Route route = (Route) o;
        return routeid == route.routeid &&
                Objects.equals(tid, route.tid) &&
                Objects.equals(stationid, route.stationid) &&
                Objects.equals(stationname, route.stationname) &&
                Objects.equals(endstation, route.endstation) &&
                Objects.equals(startstation, route.startstation) &&
                Objects.equals(mile, route.mile) &&
                Objects.equals(staytime, route.staytime) &&
                Objects.equals(last, route.last) &&
                Objects.equals(creatTime, route.creatTime) &&
                Objects.equals(updataTime, route.updataTime) &&
                Objects.equals(creatUser, route.creatUser) &&
                Objects.equals(updataUser, route.updataUser) &&
                Objects.equals(deleteTime, route.deleteTime) &&
                Objects.equals(con1, route.con1) &&
                Objects.equals(con2, route.con2) &&
                Objects.equals(con3, route.con3) &&
                Objects.equals(con4, route.con4) &&
                Objects.equals(con5, route.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeid, tid, stationid, stationname, endstation, startstation, mile, staytime, last, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
