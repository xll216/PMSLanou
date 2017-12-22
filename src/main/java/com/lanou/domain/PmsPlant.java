package com.lanou.domain;

import java.util.Date;

public class PmsPlant {
    private String plantId;

    private String macNo;

    private String plantName;

    private String plantAddr;

    private String plantManageStaffNo;

    private String plantManageStaffName;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public PmsPlant(String plantId, String macNo, String plantName, String plantAddr, String plantManageStaffNo, String plantManageStaffName, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.plantId = plantId;
        this.macNo = macNo;
        this.plantName = plantName;
        this.plantAddr = plantAddr;
        this.plantManageStaffNo = plantManageStaffNo;
        this.plantManageStaffName = plantManageStaffName;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public PmsPlant() {
        super();
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId == null ? null : plantId.trim();
    }

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo == null ? null : macNo.trim();
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName == null ? null : plantName.trim();
    }

    public String getPlantAddr() {
        return plantAddr;
    }

    public void setPlantAddr(String plantAddr) {
        this.plantAddr = plantAddr == null ? null : plantAddr.trim();
    }

    public String getPlantManageStaffNo() {
        return plantManageStaffNo;
    }

    public void setPlantManageStaffNo(String plantManageStaffNo) {
        this.plantManageStaffNo = plantManageStaffNo == null ? null : plantManageStaffNo.trim();
    }

    public String getPlantManageStaffName() {
        return plantManageStaffName;
    }

    public void setPlantManageStaffName(String plantManageStaffName) {
        this.plantManageStaffName = plantManageStaffName == null ? null : plantManageStaffName.trim();
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