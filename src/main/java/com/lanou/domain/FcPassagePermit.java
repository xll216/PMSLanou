package com.lanou.domain;

import java.util.Date;

public class FcPassagePermit {
    private String fcpassPerId;

    private String permitNo;

    private Date begDate;

    private Date endDate;

    private String workContent;

    private String appReason;

    private String workRange;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public FcPassagePermit(String fcpassPerId, String permitNo, Date begDate, Date endDate, String workContent, String appReason, String workRange, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.fcpassPerId = fcpassPerId;
        this.permitNo = permitNo;
        this.begDate = begDate;
        this.endDate = endDate;
        this.workContent = workContent;
        this.appReason = appReason;
        this.workRange = workRange;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public FcPassagePermit() {
        super();
    }

    public String getFcpassPerId() {
        return fcpassPerId;
    }

    public void setFcpassPerId(String fcpassPerId) {
        this.fcpassPerId = fcpassPerId == null ? null : fcpassPerId.trim();
    }

    public String getPermitNo() {
        return permitNo;
    }

    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo == null ? null : permitNo.trim();
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

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public String getAppReason() {
        return appReason;
    }

    public void setAppReason(String appReason) {
        this.appReason = appReason == null ? null : appReason.trim();
    }

    public String getWorkRange() {
        return workRange;
    }

    public void setWorkRange(String workRange) {
        this.workRange = workRange == null ? null : workRange.trim();
    }

    public String getEffectFlag() {
        return effectFlag;
    }

    public void setEffectFlag(String effectFlag) {
        this.effectFlag = effectFlag == null ? null : effectFlag.trim();
    }

    public String getCreateStaffNo() {
        return createStaffNo;
    }

    public void setCreateStaffNo(String createStaffNo) {
        this.createStaffNo = createStaffNo == null ? null : createStaffNo.trim();
    }

    public String getCreateStaffName() {
        return createStaffName;
    }

    public void setCreateStaffName(String createStaffName) {
        this.createStaffName = createStaffName == null ? null : createStaffName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}