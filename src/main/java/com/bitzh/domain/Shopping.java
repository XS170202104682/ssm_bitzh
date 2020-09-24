package com.bitzh.domain;


import java.math.BigDecimal;

/*
*@庾君成
* @购物车实体类
 */
public class Shopping {
    private int cId;
    private String cName;
    private BigDecimal cPrice;
    private String cWeight;
    private double tMoney;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public BigDecimal getcPrice() {
        return cPrice;
    }

    public void setcPrice(BigDecimal cPrice) {
        this.cPrice = cPrice;
    }

    public String getcWeight() {
        return cWeight;
    }

    public void setcWeight(String cWeight) {
        this.cWeight = cWeight;
    }

    public double gettMoney() {
        return tMoney;
    }

    public void settMoney(double tMoney) {
        this.tMoney = tMoney;
    }
    @Override
    public String toString() {
        return "Shopping{" +
                "cID=" + cId +
                ", cName='" + cName + '\'' +
                ", cPrice=" + cPrice +
                ", cWeight='" + cWeight + '\'' +
                ", tMoney='" + tMoney + '\'' +
                '}';
    }
}
