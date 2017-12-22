package com.lanou.domain;

import java.util.Date;

public class VehiclePermit {
    private String vehiclepermitId;

    private String plantId;

    private Date entDate;

    private Date exitDate;

    private String workContent;

    private String safeMeasures;

    private String diverName;

    private String otherReq;

    private String otherSafeMeasure;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public VehiclePermit(String vehiclepermitId, String plantId, Date entDate, Date exitDate, String workContent, String safeMeasures, String diverName, String otherReq, String otherSafeMeasure, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.vehiclepermitId = vehiclepermitId;
        this.plantId = plantId;
        this.entDate = entDate;
        this.exitDate = exitDate;
        this.workContent = workContent;
        this.safeMeasures = safeMeasures;
        this.diverName = diverName;
        this.otherReq = otherReq;
        this.otherSafeMeasure = otherSafeMeasure;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public VehiclePermit() {
        super();
    }

    public String getVehiclepermitId() {
        return vehiclepermitId;
    }

    public void setVehiclepermitId(String vehiclepermitId) {
        this.vehiclepermitId = vehiclepermitId == null ? null : vehiclepermitId.trim();
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId == null ? null : plantId.trim();
    }

    public Date getEntDate() {
        return entDate;
    }

    public void setEntDate(Date entDate) {
        this.entDate = entDate;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public String getSafeMeasures() {
        return safeMeasures;
    }

    public void setSafeMeasures(String safeMeasures) {
        this.safeMeasures = safeMeasures == null ? null : safeMeasures.trim();
    }

    public String getDiverName() {
        return diverName;
    }

    public void setDiverName(String diverName) {
        this.diverName = diverName == null ? null : diverName.trim();
    }

    public String getOtherReq() {
        return otherReq;
    }

    public void setOtherReq(String otherReq) {
        this.otherReq = otherReq == null ? null : otherReq.trim();
    }

    public String getOtherSafeMeasure() {
        return otherSafeMeasure;
    }

    public void setOtherSafeMeasure(String otherSafeMeasure) {
        this.otherSafeMeasure = otherSafeMeasure == null ? null : otherSafeMeasure.trim();
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