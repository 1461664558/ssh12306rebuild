package com.company.dao.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Ticket {
    private int tkid;
    private String tid;
    private Timestamp date;
    private String gnumber;
    private String seatnumber;
    private String type;
    private String startstation;
    private String endstation;
    private BigDecimal price;
    private String name;
    private String utype;
    private String uidnumber;
    private String saletype;
    private String datailedsales;
    private Timestamp saletime;
    private String status;
    private String statusmodifier;
    private String modifystation;
    private Timestamp modifytime;
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

    public int getTkid() {
        return tkid;
    }

    public void setTkid(int tkid) {
        this.tkid = tkid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getGnumber() {
        return gnumber;
    }

    public void setGnumber(String gnumber) {
        this.gnumber = gnumber;
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    public String getUidnumber() {
        return uidnumber;
    }

    public void setUidnumber(String uidnumber) {
        this.uidnumber = uidnumber;
    }

    public String getSaletype() {
        return saletype;
    }

    public void setSaletype(String saletype) {
        this.saletype = saletype;
    }

    public String getDatailedsales() {
        return datailedsales;
    }

    public void setDatailedsales(String datailedsales) {
        this.datailedsales = datailedsales;
    }

    public Timestamp getSaletime() {
        return saletime;
    }

    public void setSaletime(Timestamp saletime) {
        this.saletime = saletime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusmodifier() {
        return statusmodifier;
    }

    public void setStatusmodifier(String statusmodifier) {
        this.statusmodifier = statusmodifier;
    }

    public String getModifystation() {
        return modifystation;
    }

    public void setModifystation(String modifystation) {
        this.modifystation = modifystation;
    }

    public Timestamp getModifytime() {
        return modifytime;
    }

    public void setModifytime(Timestamp modifytime) {
        this.modifytime = modifytime;
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
        Ticket ticket = (Ticket) o;
        return tkid == ticket.tkid &&
                Objects.equals(tid, ticket.tid) &&
                Objects.equals(date, ticket.date) &&
                Objects.equals(gnumber, ticket.gnumber) &&
                Objects.equals(seatnumber, ticket.seatnumber) &&
                Objects.equals(type, ticket.type) &&
                Objects.equals(startstation, ticket.startstation) &&
                Objects.equals(endstation, ticket.endstation) &&
                Objects.equals(price, ticket.price) &&
                Objects.equals(name, ticket.name) &&
                Objects.equals(utype, ticket.utype) &&
                Objects.equals(uidnumber, ticket.uidnumber) &&
                Objects.equals(saletype, ticket.saletype) &&
                Objects.equals(datailedsales, ticket.datailedsales) &&
                Objects.equals(saletime, ticket.saletime) &&
                Objects.equals(status, ticket.status) &&
                Objects.equals(statusmodifier, ticket.statusmodifier) &&
                Objects.equals(modifystation, ticket.modifystation) &&
                Objects.equals(modifytime, ticket.modifytime) &&
                Objects.equals(creatTime, ticket.creatTime) &&
                Objects.equals(updataTime, ticket.updataTime) &&
                Objects.equals(creatUser, ticket.creatUser) &&
                Objects.equals(updataUser, ticket.updataUser) &&
                Objects.equals(deleteTime, ticket.deleteTime) &&
                Objects.equals(con1, ticket.con1) &&
                Objects.equals(con2, ticket.con2) &&
                Objects.equals(con3, ticket.con3) &&
                Objects.equals(con4, ticket.con4) &&
                Objects.equals(con5, ticket.con5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tkid, tid, date, gnumber, seatnumber, type, startstation, endstation, price, name, utype, uidnumber, saletype, datailedsales, saletime, status, statusmodifier, modifystation, modifytime, creatTime, updataTime, creatUser, updataUser, deleteTime, con1, con2, con3, con4, con5);
    }
}
