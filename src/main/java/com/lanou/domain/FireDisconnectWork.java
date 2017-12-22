package com.lanou.domain;

import java.util.Date;

public class FireDisconnectWork {
    private String firedisWorkId;

    private String disconnId;

    private Date begDate;

    private Date endDate;

    private String remark;

    public FireDisconnectWork(String firedisWorkId, String disconnId, Date begDate, Date endDate, String remark) {
        this.firedisWorkId = firedisWorkId;
        this.disconnId = disconnId;
        this.begDate = begDate;
        this.endDate = endDate;
        this.remark = remark;
    }

    public FireDisconnectWork() {
        super();
    }

    public String getFiredisWorkId() {
        return firedisWorkId;
    }

    public void setFiredisWorkId(String firedisWorkId) {
        this.firedisWorkId = firedisWorkId == null ? null : firedisWorkId.trim();
    }

    public String getDisconnId() {
        return disconnId;
    }

    public void setDisconnId(String disconnId) {
        this.disconnId = disconnId == null ? null : disconnId.trim();
    }

    public Date getBegDate() {
        return begDate;
    }

    public void setBegDate(Date begDate) {
        this.begDate = begDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}