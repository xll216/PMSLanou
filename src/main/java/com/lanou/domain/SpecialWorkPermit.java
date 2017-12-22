package com.lanou.domain;

import java.util.Date;

public class SpecialWorkPermit {
    private String speworkId;

    private String macNo;

    private String workAddr;

    private String workMac;

    private Date workBegDate;

    private String interfStaffNo;

    private String interfStaffName;

    private String workContent;

    private String riskDesc;

    private String disPoint;

    private String monitorProj;

    private String indiProtMeasure;

    private String monitorerMeasure;

    private String emergencyMeasure;

    private String tourPlan;

    private String maincontrolPhone;

    private String disPhone;

    private String maincontrolEmephone;

    private String supSafeMeasure;

    private String canImplementIso;

    private String supAttentionMater;

    private String noticeYsp;

    private String existRadFlag;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    private String deptManagerId;

    private String deptManagerName;

    public SpecialWorkPermit(String speworkId, String macNo, String workAddr, String workMac, Date workBegDate, String interfStaffNo, String interfStaffName, String workContent, String riskDesc, String disPoint, String monitorProj, String indiProtMeasure, String monitorerMeasure, String emergencyMeasure, String tourPlan, String maincontrolPhone, String disPhone, String maincontrolEmephone, String supSafeMeasure, String canImplementIso, String supAttentionMater, String noticeYsp, String existRadFlag, String effectFlag, String createStaffNo, String createStaffName, Date createDate, String deptManagerId, String deptManagerName) {
        this.speworkId = speworkId;
        this.macNo = macNo;
        this.workAddr = workAddr;
        this.workMac = workMac;
        this.workBegDate = workBegDate;
        this.interfStaffNo = interfStaffNo;
        this.interfStaffName = interfStaffName;
        this.workContent = workContent;
        this.riskDesc = riskDesc;
        this.disPoint = disPoint;
        this.monitorProj = monitorProj;
        this.indiProtMeasure = indiProtMeasure;
        this.monitorerMeasure = monitorerMeasure;
        this.emergencyMeasure = emergencyMeasure;
        this.tourPlan = tourPlan;
        this.maincontrolPhone = maincontrolPhone;
        this.disPhone = disPhone;
        this.maincontrolEmephone = maincontrolEmephone;
        this.supSafeMeasure = supSafeMeasure;
        this.canImplementIso = canImplementIso;
        this.supAttentionMater = supAttentionMater;
        this.noticeYsp = noticeYsp;
        this.existRadFlag = existRadFlag;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
        this.deptManagerId = deptManagerId;
        this.deptManagerName = deptManagerName;
    }

    public SpecialWorkPermit() {
        super();
    }

    public String getSpeworkId() {
        return speworkId;
    }

    public void setSpeworkId(String speworkId) {
        this.speworkId = speworkId == null ? null : speworkId.trim();
    }

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo == null ? null : macNo.trim();
    }

    public String getWorkAddr() {
        return workAddr;
    }

    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr == null ? null : workAddr.trim();
    }

    public String getWorkMac() {
        return workMac;
    }

    public void setWorkMac(String workMac) {
        this.workMac = workMac == null ? null : workMac.trim();
    }

    public Date getWorkBegDate() {
        return workBegDate;
    }

    public void setWorkBegDate(Date workBegDate) {
        this.workBegDate = workBegDate;
    }

    public String getInterfStaffNo() {
        return interfStaffNo;
    }

    public void setInterfStaffNo(String interfStaffNo) {
        this.interfStaffNo = interfStaffNo == null ? null : interfStaffNo.trim();
    }

    public String getInterfStaffName() {
        return interfStaffName;
    }

    public void setInterfStaffName(String interfStaffName) {
        this.interfStaffName = interfStaffName == null ? null : interfStaffName.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public String getRiskDesc() {
        return riskDesc;
    }

    public void setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc == null ? null : riskDesc.trim();
    }

    public String getDisPoint() {
        return disPoint;
    }

    public void setDisPoint(String disPoint) {
        this.disPoint = disPoint == null ? null : disPoint.trim();
    }

    public String getMonitorProj() {
        return monitorProj;
    }

    public void setMonitorProj(String monitorProj) {
        this.monitorProj = monitorProj == null ? null : monitorProj.trim();
    }

    public String getIndiProtMeasure() {
        return indiProtMeasure;
    }

    public void setIndiProtMeasure(String indiProtMeasure) {
        this.indiProtMeasure = indiProtMeasure == null ? null : indiProtMeasure.trim();
    }

    public String getMonitorerMeasure() {
        return monitorerMeasure;
    }

    public void setMonitorerMeasure(String monitorerMeasure) {
        this.monitorerMeasure = monitorerMeasure == null ? null : monitorerMeasure.trim();
    }

    public String getEmergencyMeasure() {
        return emergencyMeasure;
    }

    public void setEmergencyMeasure(String emergencyMeasure) {
        this.emergencyMeasure = emergencyMeasure == null ? null : emergencyMeasure.trim();
    }

    public String getTourPlan() {
        return tourPlan;
    }

    public void setTourPlan(String tourPlan) {
        this.tourPlan = tourPlan == null ? null : tourPlan.trim();
    }

    public String getMaincontrolPhone() {
        return maincontrolPhone;
    }

    public void setMaincontrolPhone(String maincontrolPhone) {
        this.maincontrolPhone = maincontrolPhone == null ? null : maincontrolPhone.trim();
    }

    public String getDisPhone() {
        return disPhone;
    }

    public void setDisPhone(String disPhone) {
        this.disPhone = disPhone == null ? null : disPhone.trim();
    }

    public String getMaincontrolEmephone() {
        return maincontrolEmephone;
    }

    public void setMaincontrolEmephone(String maincontrolEmephone) {
        this.maincontrolEmephone = maincontrolEmephone == null ? null : maincontrolEmephone.trim();
    }

    public String getSupSafeMeasure() {
        return supSafeMeasure;
    }

    public void setSupSafeMeasure(String supSafeMeasure) {
        this.supSafeMeasure = supSafeMeasure == null ? null : supSafeMeasure.trim();
    }

    public String getCanImplementIso() {
        return canImplementIso;
    }

    public void setCanImplementIso(String canImplementIso) {
        this.canImplementIso = canImplementIso == null ? null : canImplementIso.trim();
    }

    public String getSupAttentionMater() {
        return supAttentionMater;
    }

    public void setSupAttentionMater(String supAttentionMater) {
        this.supAttentionMater = supAttentionMater == null ? null : supAttentionMater.trim();
    }

    public String getNoticeYsp() {
        return noticeYsp;
    }

    public void setNoticeYsp(String noticeYsp) {
        this.noticeYsp = noticeYsp == null ? null : noticeYsp.trim();
    }

    public String getExistRadFlag() {
        return existRadFlag;
    }

    public void setExistRadFlag(String existRadFlag) {
        this.existRadFlag = existRadFlag == null ? null : existRadFlag.trim();
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

    public String getDeptManagerId() {
        return deptManagerId;
    }

    public void setDeptManagerId(String deptManagerId) {
        this.deptManagerId = deptManagerId == null ? null : deptManagerId.trim();
    }

    public String getDeptManagerName() {
        return deptManagerName;
    }

    public void setDeptManagerName(String deptManagerName) {
        this.deptManagerName = deptManagerName == null ? null : deptManagerName.trim();
    }
}