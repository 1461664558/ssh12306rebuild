package com.company.dao.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Station {
    private int station;
    private String stationname;
    private String pinyin;
    private String region;
    private String airconditioning;
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

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAirconditioning() {
        return airconditioning;
    }

    public void setAirconditioning(String airconditioning) {
        this.airconditioning = airconditioning;
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
        Station station1 = (Station) o;
        return station == station1.station &&
                Objects.equals(stationname, station1.stationname) &&
                Objects.equals(pinyin, station1.pinyin) &&
                Objects.equals(region, station1.region) &&
                Objects.equals(airconditioning, station1.airconditioning) &&
                Objects.equals(creatTime, station1.creatTime) &&
                Objects.equals(updataTime, station1.updataTime) &&
                Objects.equals(creatUser, station1.creatUser) &&
                Objects.equals(updataUser, station1.updataUser) &&
                Objects.equals(deleteTime, station1.deleteTime) &&
                Objects.equals(con1, station1.con1) &&
                Objects.equals(con2, station1.con2) &&
                Objects.equals(con3, station1.con3) &&
                Objects.equals(con4, station1.con4) &&
                Objects.equals(con5, station1.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(station, stationname, pinyin, region, airconditioning, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
