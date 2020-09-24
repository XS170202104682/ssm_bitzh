package com.bitzh.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff {
    private Integer sId;

    private String sName;

    private Integer sAge;

    private String sSex;

    private Integer sTelephone;

    private String sEmail;

    private Date sEntrytime;

    private Integer sSalary;

    private String sJob;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public Integer getsTelephone() {
        return sTelephone;
    }

    public void setsTelephone(Integer sTelephone) {
        this.sTelephone = sTelephone;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public Date getsEntrytime() {
        return sEntrytime;
    }

    public void setsEntrytime(Date sEntrytime) {
        this.sEntrytime = sEntrytime;
    }

    public Integer getsSalary() {
        return sSalary;
    }

    public void setsSalary(Integer sSalary) {
        this.sSalary = sSalary;
    }

    public String getsJob() {
        return sJob;
    }

    public void setsJob(String sJob) {
        this.sJob = sJob;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sSex='" + sSex + '\'' +
                ", sTelephone=" + sTelephone +
                ", sEmail='" + sEmail + '\'' +
                ", sEntrytime=" + sEntrytime +
                ", sSalary=" + sSalary +
                ", sJob='" + sJob + '\'' +
                '}';
    }

    public String formateTime(Date date){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(date);
    }
}