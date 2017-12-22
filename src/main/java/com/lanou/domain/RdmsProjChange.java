package com.lanou.domain;

import java.util.Date;

/**
 * 项目计划与成果调整的卡片
 **/
public class RdmsProjChange {
    private String pmsChange;//变更标识

    private String projId;//项目标识 外健

    private String projName;//项目名称

    private String projAssumeStaffNo;//项目负责人编号

    private String projAssumeStaffName;//项目负责人名称

    private String assumeDeptId;//承担部门编号

    private String assumeDeptName;//承担部门名称

    private String chgReason;//调整原因

    private String chgContent;//调整内容

    private String effectFlag;//是否有效

    private String createStaffNo;//创建人

    private String createStaffName;//创建人姓名

    private Date createDate;//创建时间

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

    @Override
    public String toString() {
        return "RdmsProjChange{" +
                "pmsChange='" + pmsChange + '\'' +
                ", projId='" + projId + '\'' +
                ", projName='" + projName + '\'' +
                ", projAssumeStaffNo='" + projAssumeStaffNo + '\'' +
                ", projAssumeStaffName='" + projAssumeStaffName + '\'' +
                ", assumeDeptId='" + assumeDeptId + '\'' +
                ", assumeDeptName='" + assumeDeptName + '\'' +
                ", chgReason='" + chgReason + '\'' +
                ", chgContent='" + chgContent + '\'' +
                ", effectFlag='" + effectFlag + '\'' +
                ", createStaffNo='" + createStaffNo + '\'' +
                ", createStaffName='" + createStaffName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}