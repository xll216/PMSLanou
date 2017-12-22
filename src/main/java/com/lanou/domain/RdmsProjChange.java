package com.lanou.domain;

import java.util.Date;

public class RdmsProjChange {
    private String pmsChange;

    private String projId;

    private String projName;

    private String projAssumeStaffNo;

    private String projAssumeStaffName;

    private String assumeDeptId;

    private String assumeDeptName;

    private String chgReason;

    private String chgContent;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public RdmsProjChange(String pmsChange, String projId, String projName, String projAssumeStaffNo, String projAssumeStaffName, String assumeDeptId, String assumeDeptName, String chgReason, String chgContent, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.pmsChange = pmsChange;
        this.projId = projId;
        this.projName = projName;
        this.projAssumeStaffNo = projAssumeStaffNo;
        this.projAssumeStaffName = projAssumeStaffName;
        this.assumeDeptId = assumeDeptId;
        this.assumeDeptName = assumeDeptName;
        this.chgReason = chgReason;
        this.chgContent = chgContent;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public RdmsProjChange() {
        super();
    }

    public String getPmsChange() {
        return pmsChange;
    }

    public void setPmsChange(String pmsChange) {
        this.pmsChange = pmsChange == null ? null : pmsChange.trim();
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId == null ? null : projId.trim();
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName == null ? null : projName.trim();
    }

    public String getProjAssumeStaffNo() {
        return projAssumeStaffNo;
    }

    public void setProjAssumeStaffNo(String projAssumeStaffNo) {
        this.projAssumeStaffNo = projAssumeStaffNo == null ? null : projAssumeStaffNo.trim();
    }

    public String getProjAssumeStaffName() {
        return projAssumeStaffName;
    }

    public void setProjAssumeStaffName(String projAssumeStaffName) {
        this.projAssumeStaffName = projAssumeStaffName == null ? null : projAssumeStaffName.trim();
    }

    public String getAssumeDeptId() {
        return assumeDeptId;
    }

    public void setAssumeDeptId(String assumeDeptId) {
        this.assumeDeptId = assumeDeptId == null ? null : assumeDeptId.trim();
    }

    public String getAssumeDeptName() {
        return assumeDeptName;
    }

    public void setAssumeDeptName(String assumeDeptName) {
        this.assumeDeptName = assumeDeptName == null ? null : assumeDeptName.trim();
    }

    public String getChgReason() {
        return chgReason;
    }

    public void setChgReason(String chgReason) {
        this.chgReason = chgReason == null ? null : chgReason.trim();
    }

    public String getChgContent() {
        return chgContent;
    }

    public void setChgContent(String chgContent) {
        this.chgContent = chgContent == null ? null : chgContent.trim();
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