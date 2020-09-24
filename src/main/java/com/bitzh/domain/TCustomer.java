package com.bitzh.domain;

import java.io.Serializable;
import java.util.Date;

public class TCustomer implements Serializable {
    /**
    * 顾客id
    */
    private Integer uId;

    /**
    * 顾客昵称
    */
    private String uName;

    /**
    * 用户名
    */
    private String uAgentname;

    /**
    * 密码
    */
    private String uPassword;

    /**
    * 顾客性别
    */
    private String uSex;

    /**
    * 顾客生日
    */
    private Date uBirthday;

    /**
    * 电话
    */
    private Long uTelephone;

    /**
    * 电子邮箱
    */
    private String uEmail;

    /**
    * 积分
    */
    private Integer uIntegral;

    private static final long serialVersionUID = 1L;

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

    public String getuAgentname() {
        return uAgentname;
    }

    public void setuAgentname(String uAgentname) {
        this.uAgentname = uAgentname;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
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

    public Long getuTelephone() {
        return uTelephone;
    }

    public void setuTelephone(Long uTelephone) {
        this.uTelephone = uTelephone;
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", uName=").append(uName);
        sb.append(", uAgentname=").append(uAgentname);
        sb.append(", uPassword=").append(uPassword);
        sb.append(", uSex=").append(uSex);
        sb.append(", uBirthday=").append(uBirthday);
        sb.append(", uTelephone=").append(uTelephone);
        sb.append(", uEmail=").append(uEmail);
        sb.append(", uIntegral=").append(uIntegral);
        sb.append("]");
        return sb.toString();
    }
}