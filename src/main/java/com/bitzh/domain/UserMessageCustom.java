package com.bitzh.domain;

public class UserMessageCustom extends UserMessage {

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    private String uName;

    @Override
    public String toString() {
        return "UserMessageCustom{" +
                "uName='" + uName + '\'' +
                '}';
    }
}
