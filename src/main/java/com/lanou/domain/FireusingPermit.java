package com.lanou.domain;

import java.util.Date;

public class FireusingPermit {
    private String fireusingId;

    private String macNo;

    private String busiNo;

    private String fireusingMac;

    private String fireusingArea;

    private Date workBeginDate;

    private Date workEndDate;

    private String workContent;

    private String ext1Deal;

    private String ext2Deal;

    private String ext3Deal;

    private String fireDetectarea;

    private String closeFireextiSystem;

    private String maxRisk;

    private String workPurpose;

    private String fireOperStaff;

    private String workDesc;

    private String quarStep;

    private String meterType;

    private String reqQuarStep;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public FireusingPermit(String fireusingId, String macNo, String busiNo, String fireusingMac, String fireusingArea, Date workBeginDate, Date workEndDate, String workContent, String ext1Deal, String ext2Deal, String ext3Deal, String fireDetectarea, String closeFireextiSystem, String maxRisk, String workPurpose, String fireOperStaff, String workDesc, String quarStep, String meterType, String reqQuarStep, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.fireusingId = fireusingId;
        this.macNo = macNo;
        this.busiNo = busiNo;
        this.fireusingMac = fireusingMac;
        this.fireusingArea = fireusingArea;
        this.workBeginDate = workBeginDate;
        this.workEndDate = workEndDate;
        this.workContent = workContent;
        this.ext1Deal = ext1Deal;
        this.ext2Deal = ext2Deal;
        this.ext3Deal = ext3Deal;
        this.fireDetectarea = fireDetectarea;
        this.closeFireextiSystem = closeFireextiSystem;
        this.maxRisk = maxRisk;
        this.workPurpose = workPurpose;
        this.fireOperStaff = fireOperStaff;
        this.workDesc = workDesc;
        this.quarStep = quarStep;
        this.meterType = meterType;
        this.reqQuarStep = reqQuarStep;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public FireusingPermit() {
        super();
    }

    public String getFireusingId() {
        return fireusingId;
    }

    public void setFireusingId(String fireusingId) {
        this.fireusingId = fireusingId == null ? null : fireusingId.trim();
    }

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo == null ? null : macNo.trim();
    }

    public String getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(String busiNo) {
        this.busiNo = busiNo == null ? null : busiNo.trim();
    }

    public String getFireusingMac() {
        return fireusingMac;
    }

    public void setFireusingMac(String fireusingMac) {
        this.fireusingMac = fireusingMac == null ? null : fireusingMac.trim();
    }

    public String getFireusingArea() {
        return fireusingArea;
    }

    public void setFireusingArea(String fireusingArea) {
        this.fireusingArea = fireusingArea == null ? null : fireusingArea.trim();
    }

    public Date getWorkBeginDate() {
        return workBeginDate;
    }

    public void setWorkBeginDate(Date workBeginDate) {
        this.workBeginDate = workBeginDate;
    }

    public Date getWorkEndDate() {
        return workEndDate;
    }

    public void setWorkEndDate(Date workEndDate) {
        this.workEndDate = workEndDate;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public String getExt1Deal() {
        return ext1Deal;
    }

    public void setExt1Deal(String ext1Deal) {
        this.ext1Deal = ext1Deal == null ? null : ext1Deal.trim();
    }

    public String getExt2Deal() {
        return ext2Deal;
    }

    public void setExt2Deal(String ext2Deal) {
        this.ext2Deal = ext2Deal == null ? null : ext2Deal.trim();
    }

    public String getExt3Deal() {
        return ext3Deal;
    }

    public void setExt3Deal(String ext3Deal) {
        this.ext3Deal = ext3Deal == null ? null : ext3Deal.trim();
    }

    public String getFireDetectarea() {
        return fireDetectarea;
    }

    public void setFireDetectarea(String fireDetectarea) {
        this.fireDetectarea = fireDetectarea == null ? null : fireDetectarea.trim();
    }

    public String getCloseFireextiSystem() {
        return closeFireextiSystem;
    }

    public void setCloseFireextiSystem(String closeFireextiSystem) {
        this.closeFireextiSystem = closeFireextiSystem == null ? null : closeFireextiSystem.trim();
    }

    public String getMaxRisk() {
        return maxRisk;
    }

    public void setMaxRisk(String maxRisk) {
        this.maxRisk = maxRisk == null ? null : maxRisk.trim();
    }

    public String getWorkPurpose() {
        return workPurpose;
    }

    public void setWorkPurpose(String workPurpose) {
        this.workPurpose = workPurpose == null ? null : workPurpose.trim();
    }

    public String getFireOperStaff() {
        return fireOperStaff;
    }

    public void setFireOperStaff(String fireOperStaff) {
        this.fireOperStaff = fireOperStaff == null ? null : fireOperStaff.trim();
    }

    public String getWorkDesc() {
        return workDesc;
    }

    public void setWorkDesc(String workDesc) {
        this.workDesc = workDesc == null ? null : workDesc.trim();
    }

    public String getQuarStep() {
        return quarStep;
    }

    public void setQuarStep(String quarStep) {
        this.quarStep = quarStep == null ? null : quarStep.trim();
    }

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType == null ? null : meterType.trim();
    }

    public String getReqQuarStep() {
        return reqQuarStep;
    }

    public void setReqQuarStep(String reqQuarStep) {
        this.reqQuarStep = reqQuarStep == null ? null : reqQuarStep.trim();
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