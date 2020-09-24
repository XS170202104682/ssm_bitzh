package com.bitzh.domain;

import java.io.Serializable;
import java.util.Date;

public class TUserMessage implements Serializable {
    /**
     * 信息ID
     */
    private Integer mId;

    /**
     * 和用户表的id相关联
     */
    private Integer mUserid;

    /**
     * 留言时间
     */
    private Date mTime;

    /**
     * 留言内容
     */
    private String mDsc;

    /**
     * 权限ID
     */
    private Integer mRid;

    private static final long serialVersionUID = 1L;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmUserid() {
        return mUserid;
    }

    public void setmUserid(Integer mUserid) {
        this.mUserid = mUserid;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", mUserid=").append(mUserid);
        sb.append(", mTime=").append(mTime);
        sb.append(", mDsc=").append(mDsc);
        sb.append(", mRid=").append(mRid);
        sb.append("]");
        return sb.toString();
    }
}