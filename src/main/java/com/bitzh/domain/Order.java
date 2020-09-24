package com.bitzh.domain;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class Order {
    private Integer oId;
    private Integer oUserID;
    private Integer oMenuID;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH：mm：ss")
    private String oTime;

    public String getoStatus() {
        return oStatus;
    }

    public void setoStatus(String oStatus) {
        this.oStatus = oStatus;
    }

    private String oStatus;



    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getoUserID() {
        return oUserID;
    }

    public void setoUserID(Integer oUserID) {
        this.oUserID = oUserID;
    }

    public Integer getoMenuID() {
        return oMenuID;
    }

    public void setoMenuID(Integer oMenuID) {
        this.oMenuID = oMenuID;
    }

    public String getoTime() {
        return oTime;
    }

    public void setoTime(String oTime) {
        this.oTime = oTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", oUserID=" + oUserID +
                ", oMenuID=" + oMenuID +
                ", oTime=" + oTime +
                ", oStatus='" + oStatus + '\'' +
                '}';
    }
}
