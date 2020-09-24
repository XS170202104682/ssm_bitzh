package com.bitzh.domain;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.format.annotation.DateTimeFormat;
import java.sql.Date;
import java.sql.Time;
import java.util.PrimitiveIterator;
import java.util.logging.SimpleFormatter;

public class Customer {
    private Integer uId;
    private String uName;
    private String uAgentName;
    private String uSex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uBirthday;

    public Long getuTelephone() {
        return uTelephone;
    }

    public void setuTelephone(Long uTelephone) {
        this.uTelephone = uTelephone;
    }

    private Long uTelephone;
    private String uEmail;
    private Integer uIntegral;
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAgentName() {
        return uAgentName;
    }

    public void setuAgentName(String uAgentName) {
        this.uAgentName = uAgentName;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }


    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public Integer getuIntegral() {
        return uIntegral;
    }

    public void setuIntegral(Integer uIntegral) {
        this.uIntegral = uIntegral;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uAgentName=" + uAgentName +
                ", uSex='" + uSex + '\'' +
                ", uBirthday=" + uBirthday +
                ", uTelephone=" + uTelephone +
                ", uEmail='" + uEmail + '\'' +
                ", uIntegral=" + uIntegral +
                '}';
    }
}
