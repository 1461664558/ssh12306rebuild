package com.company.dao.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Journeyrate {
    private int id;
    private int journeyfrom;
    private int journeyto;
    private BigDecimal reducerate;
    private double pricerate;
    private double thisprice;
    private BigDecimal sumprice;
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

    public BigDecimal getReducerate() {
        return reducerate;
    }

    public void setReducerate(BigDecimal reducerate) {
        this.reducerate = reducerate;
    }

    public double getPricerate() {
        return pricerate;
    }

    public void setPricerate(double pricerate) {
        this.pricerate = pricerate;
    }

    public double getThisprice() {
        return thisprice;
    }

    public void setThisprice(double thisprice) {
        this.thisprice = thisprice;
    }

    public BigDecimal getSumprice() {
        return sumprice;
    }

    public void setSumprice(BigDecimal sumprice) {
        this.sumprice = sumprice;
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
        Journeyrate that = (Journeyrate) o;
        return id == that.id &&
                journeyfrom == that.journeyfrom &&
                journeyto == that.journeyto &&
                Double.compare(that.pricerate, pricerate) == 0 &&
                Double.compare(that.thisprice, thisprice) == 0 &&
                Objects.equals(reducerate, that.reducerate) &&
                Objects.equals(sumprice, that.sumprice) &&
                Objects.equals(creatTime, that.creatTime) &&
                Objects.equals(updataTime, that.updataTime) &&
                Objects.equals(creatUser, that.creatUser) &&
                Objects.equals(updataUser, that.updataUser) &&
                Objects.equals(deleteTime, that.deleteTime) &&
                Objects.equals(con1, that.con1) &&
                Objects.equals(con2, that.con2) &&
                Objects.equals(con3, that.con3) &&
                Objects.equals(con4, that.con4) &&
                Objects.equals(con5, that.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, journeyfrom, journeyto, reducerate, pricerate, thisprice, sumprice, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
