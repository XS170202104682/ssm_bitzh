package com.bitzh.domain;

public class OrderCustom extends Order{
    private String uName;
    private String cName;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "OrderCustom{" +
                "uName='" + uName + '\'' +
                ", cName='" + cName + '\'' +
                '}';
    }
}
