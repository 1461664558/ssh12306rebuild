package com.company.dao.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Journey {
    private int id;
    private int journeyfrom;
    private int journeyto;
    private int permile;
    private int number;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJourneyfrom() {
        return journeyfrom;
    }

    public void setJourneyfrom(int journeyfrom) {
        this.journeyfrom = journeyfrom;
    }

    public int getJourneyto() {
        return journeyto;
    }

    public void setJourneyto(int journeyto) {
        this.journeyto = journeyto;
    }

    public int getPermile() {
        return permile;
    }

    public void setPermile(int permile) {
        this.permile = permile;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
        Journey journey = (Journey) o;
        return id == journey.id &&
                journeyfrom == journey.journeyfrom &&
                journeyto == journey.journeyto &&
                permile == journey.permile &&
                number == journey.number &&
                Objects.equals(creatTime, journey.creatTime) &&
                Objects.equals(updataTime, journey.updataTime) &&
                Objects.equals(creatUser, journey.creatUser) &&
                Objects.equals(updataUser, journey.updataUser) &&
                Objects.equals(deleteTime, journey.deleteTime) &&
                Objects.equals(con1, journey.con1) &&
                Objects.equals(con2, journey.con2) &&
                Objects.equals(con3, journey.con3) &&
                Objects.equals(con4, journey.con4) &&
                Objects.equals(con5, journey.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, journeyfrom, journeyto, permile, number, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
