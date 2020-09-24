package com.bitzh.domain;

import java.math.BigDecimal;

public class Caete {
    private Integer cId;

    private String cName;

    private Integer cCount;

    private BigDecimal cPrice;

    private String cWeight;

    private String cType;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getcCount() {
        return cCount;
    }

    public void setcCount(Integer cCount) {
        this.cCount = cCount;
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

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    @Override
    public String toString() {
        return "Caete{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cCount=" + cCount +
                ", cPrice=" + cPrice +
                ", cWeight='" + cWeight + '\'' +
                ", cType='" + cType + '\'' +
                '}';
    }
}