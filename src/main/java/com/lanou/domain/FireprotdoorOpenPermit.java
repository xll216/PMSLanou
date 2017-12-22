package com.lanou.domain;

import java.util.Date;

public class FireprotdoorOpenPermit {
    private String openId;

    private String plantId;

    private String appReason;

    private Date appBegDate;

    private Date appEndDate;

    private String contiueMonitorFlag;

    private String workDeptId;

    private String workDeptName;

    private String workStaffNo;

    private String workStaffName;

    private String workstaffLinkPhone;

    private String invalMonitorFlag;

    private String monitorStaffNo;

    private String monitorStaffName;

    private String monitorStaffPhone;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public FireprotdoorOpenPermit(String openId, String plantId, String appReason, Date appBegDate, Date appEndDate, String contiueMonitorFlag, String workDeptId, String workDeptName, String workStaffNo, String workStaffName, String workstaffLinkPhone, String invalMonitorFlag, String monitorStaffNo, String monitorStaffName, String monitorStaffPhone, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.openId = openId;
        this.plantId = plantId;
        this.appReason = appReason;
        this.appBegDate = appBegDate;
        this.appEndDate = appEndDate;
        this.contiueMonitorFlag = contiueMonitorFlag;
        this.workDeptId = workDeptId;
        this.workDeptName = workDeptName;
        this.workStaffNo = workStaffNo;
        this.workStaffName = workStaffName;
        this.workstaffLinkPhone = workstaffLinkPhone;
        this.invalMonitorFlag = invalMonitorFlag;
        this.monitorStaffNo = monitorStaffNo;
        this.monitorStaffName = monitorStaffName;
        this.monitorStaffPhone = monitorStaffPhone;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public FireprotdoorOpenPermit() {
        super();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId == null ? null : plantId.trim();
    }

    public String getAppReason() {
        return appReason;
    }

    public void setAppReason(String appReason) {
        this.appReason = appReason == null ? null : appReason.trim();
    }

    public Date getAppBegDate() {
        return appBegDate;
    }

    public void setAppBegDate(Date appBegDate) {
        this.appBegDate = appBegDate;
    }

    public Date getAppEndDate() {
        return appEndDate;
    }

    public void setAppEndDate(Date appEndDate) {
        this.appEndDate = appEndDate;
    }

    public String getContiueMonitorFlag() {
        return contiueMonitorFlag;
    }

    public void setContiueMonitorFlag(String contiueMonitorFlag) {
        this.contiueMonitorFlag = contiueMonitorFlag == null ? null : contiueMonitorFlag.trim();
    }

    public String getWorkDeptId() {
        return workDeptId;
    }

    public void setWorkDeptId(String workDeptId) {
        this.workDeptId = workDeptId == null ? null : workDeptId.trim();
    }

    public String getWorkDeptName() {
        return workDeptName;
    }

    public void setWorkDeptName(String workDeptName) {
        this.workDeptName = workDeptName == null ? null : workDeptName.trim();
    }

    public String getWorkStaffNo() {
        return workStaffNo;
    }

    public void setWorkStaffNo(String workStaffNo) {
        this.workStaffNo = workStaffNo == null ? null : workStaffNo.trim();
    }

    public String getWorkStaffName() {
        return workStaffName;
    }

    public void setWorkStaffName(String workStaffName) {
        this.workStaffName = workStaffName == null ? null : workStaffName.trim();
    }

    public String getWorkstaffLinkPhone() {
        return workstaffLinkPhone;
    }

    public void setWorkstaffLinkPhone(String workstaffLinkPhone) {
        this.workstaffLinkPhone = workstaffLinkPhone == null ? null : workstaffLinkPhone.trim();
    }

    public String getInvalMonitorFlag() {
        return invalMonitorFlag;
    }

    public void setInvalMonitorFlag(String invalMonitorFlag) {
        this.invalMonitorFlag = invalMonitorFlag == null ? null : invalMonitorFlag.trim();
    }

    public String getMonitorStaffNo() {
        return monitorStaffNo;
    }

    public void setMonitorStaffNo(String monitorStaffNo) {
        this.monitorStaffNo = monitorStaffNo == null ? null : monitorStaffNo.trim();
    }

    public String getMonitorStaffName() {
        return monitorStaffName;
    }

    public void setMonitorStaffName(String monitorStaffName) {
        this.monitorStaffName = monitorStaffName == null ? null : monitorStaffName.trim();
    }

    public String getMonitorStaffPhone() {
        return monitorStaffPhone;
    }

    public void setMonitorStaffPhone(String monitorStaffPhone) {
        this.monitorStaffPhone = monitorStaffPhone == null ? null : monitorStaffPhone.trim();
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