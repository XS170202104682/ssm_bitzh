package com.bitzh.domain;

public class Admin {
    private Integer aId;
    private String aName;
    private String aAccount;
    private String aPassword;
    private String aEmail;
    private String aPhone;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaAccount() {
        return aAccount;
    }

    public void setaAccount(String aAccount) {
        this.aAccount = aAccount;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aAccount='" + aAccount + '\'' +
                ", aPassword='" + aPassword + '\'' +
                ", aEmail='" + aEmail + '\'' +
                ", aPhone='" + aPhone + '\'' +
                '}';
    }
}
