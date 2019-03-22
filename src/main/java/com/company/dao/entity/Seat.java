package com.company.dao.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

public class Seat {
    private int route;
    private String tid;
    private String gnumber;
    private String gtype;
    private String seatnumberY;
    private String seatnumberx;
    private String seatstatus;
    private String seatstatuscode;
    private Time starttime;
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

    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getGnumber() {
        return gnumber;
    }

    public void setGnumber(String gnumber) {
        this.gnumber = gnumber;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public String getSeatnumberY() {
        return seatnumberY;
    }

    public void setSeatnumberY(String seatnumberY) {
        this.seatnumberY = seatnumberY;
    }

    public String getSeatnumberx() {
        return seatnumberx;
    }

    public void setSeatnumberx(String seatnumberx) {
        this.seatnumberx = seatnumberx;
    }

    public String getSeatstatus() {
        return seatstatus;
    }

    public void setSeatstatus(String seatstatus) {
        this.seatstatus = seatstatus;
    }

    public String getSeatstatuscode() {
        return seatstatuscode;
    }

    public void setSeatstatuscode(String seatstatuscode) {
        this.seatstatuscode = seatstatuscode;
    }

    public Time getStarttime() {
        return starttime;
    }

    public void setStarttime(Time starttime) {
        this.starttime = starttime;
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
        Seat seat = (Seat) o;
        return route == seat.route &&
                Objects.equals(tid, seat.tid) &&
                Objects.equals(gnumber, seat.gnumber) &&
                Objects.equals(gtype, seat.gtype) &&
                Objects.equals(seatnumberY, seat.seatnumberY) &&
                Objects.equals(seatnumberx, seat.seatnumberx) &&
                Objects.equals(seatstatus, seat.seatstatus) &&
                Objects.equals(seatstatuscode, seat.seatstatuscode) &&
                Objects.equals(starttime, seat.starttime) &&
                Objects.equals(creatTime, seat.creatTime) &&
                Objects.equals(updataTime, seat.updataTime) &&
                Objects.equals(creatUser, seat.creatUser) &&
                Objects.equals(updataUser, seat.updataUser) &&
                Objects.equals(deleteTime, seat.deleteTime) &&
                Objects.equals(con1, seat.con1) &&
                Objects.equals(con2, seat.con2) &&
                Objects.equals(con3, seat.con3) &&
                Objects.equals(con4, seat.con4) &&
                Objects.equals(con5, seat.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(route, tid, gnumber, gtype, seatnumberY, seatnumberx, seatstatus, seatstatuscode, starttime, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
