package com.bitzh.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class UserMessage {
    private Integer mId;
    private Integer mUserId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:MM:SS")
    private Timestamp mTime;
    private String mDsc;
    private Integer mRid;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmUserId() {
        return mUserId;
    }

    public void setmUserId(Integer mUserId) {
        this.mUserId = mUserId;
    }

    public Timestamp getmTime() {
        return mTime;
    }

    public void setmTime(Timestamp mTime) {
        this.mTime = mTime;
    }

    public String getmDsc() {
        return mDsc;
    }

    public void setmDsc(String mDsc) {
        this.mDsc = mDsc;
    }

    public Integer getmRid() {
        return mRid;
    }

    public void setmRid(Integer mRid) {
        this.mRid = mRid;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "mId=" + mId +
                ", mUserId=" + mUserId +
                ", mTime=" + mTime +
                ", mDsc='" + mDsc + '\'' +
                ", mRid=" + mRid +
                '}';
    }
}
