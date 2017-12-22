package com.lanou.domain;

import java.util.Date;

public class PmsRayUser {
    private String rayStaffId;

    private String staffNo;

    private String staffName;

    private String passcardNo;

    private String orgId;

    private String orgName;

    private String rtRank;

    private String rtNo;

    private Date effectBegDate;

    private Date effectEndDate;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public PmsRayUser(String rayStaffId, String staffNo, String staffName, String passcardNo, String orgId, String orgName, String rtRank, String rtNo, Date effectBegDate, Date effectEndDate, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.rayStaffId = rayStaffId;
        this.staffNo = staffNo;
        this.staffName = staffName;
        this.passcardNo = passcardNo;
        this.orgId = orgId;
        this.orgName = orgName;
        this.rtRank = rtRank;
        this.rtNo = rtNo;
        this.effectBegDate = effectBegDate;
        this.effectEndDate = effectEndDate;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public PmsRayUser() {
        super();
    }

    public String getRayStaffId() {
        return rayStaffId;
    }

    public void setRayStaffId(String rayStaffId) {
        this.rayStaffId = rayStaffId == null ? null : rayStaffId.trim();
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo == null ? null : staffNo.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getPasscardNo() {
        return passcardNo;
    }

    public void setPasscardNo(String passcardNo) {
        this.passcardNo = passcardNo == null ? null : passcardNo.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getRtRank() {
        return rtRank;
    }

    public void setRtRank(String rtRank) {
        this.rtRank = rtRank == null ? null : rtRank.trim();
    }

    public String getRtNo() {
        return rtNo;
    }

    public void setRtNo(String rtNo) {
        this.rtNo = rtNo == null ? null : rtNo.trim();
    }

    public Date getEffectBegDate() {
        return effectBegDate;
    }

    public void setEffectBegDate(Date effectBegDate) {
        this.effectBegDate = effectBegDate;
    }

    public Date getEffectEndDate() {
        return effectEndDate;
    }

    public void setEffectEndDate(Date effectEndDate) {
        this.effectEndDate = effectEndDate;
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