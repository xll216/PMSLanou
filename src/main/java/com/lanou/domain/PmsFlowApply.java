package com.lanou.domain;

import java.util.Date;

public class PmsFlowApply {
    private String appId;

    private String appNo;

    private Integer processinstid;

    private String appType;

    private String theme;

    private Date applyDate;

    private String flowAppStaffNo;

    private String flowAppStaffName;

    private String appDeptId;

    private String appDeptName;

    private String busiappStaffNo;

    private String busiappStaffName;

    private String busiappDeptId;

    private String busiappDeptName;

    private String busiLinkDesc;

    private String dataOrgNo;

    private String appYm;

    private String printFlag;

    private String canPrintFlag;

    private String status;

    private String multiFlowFlag;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public PmsFlowApply(String appId, String appNo, Integer processinstid, String appType, String theme, Date applyDate, String flowAppStaffNo, String flowAppStaffName, String appDeptId, String appDeptName, String busiappStaffNo, String busiappStaffName, String busiappDeptId, String busiappDeptName, String busiLinkDesc, String dataOrgNo, String appYm, String printFlag, String canPrintFlag, String status, String multiFlowFlag, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.appId = appId;
        this.appNo = appNo;
        this.processinstid = processinstid;
        this.appType = appType;
        this.theme = theme;
        this.applyDate = applyDate;
        this.flowAppStaffNo = flowAppStaffNo;
        this.flowAppStaffName = flowAppStaffName;
        this.appDeptId = appDeptId;
        this.appDeptName = appDeptName;
        this.busiappStaffNo = busiappStaffNo;
        this.busiappStaffName = busiappStaffName;
        this.busiappDeptId = busiappDeptId;
        this.busiappDeptName = busiappDeptName;
        this.busiLinkDesc = busiLinkDesc;
        this.dataOrgNo = dataOrgNo;
        this.appYm = appYm;
        this.printFlag = printFlag;
        this.canPrintFlag = canPrintFlag;
        this.status = status;
        this.multiFlowFlag = multiFlowFlag;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public PmsFlowApply() {
        super();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public Integer getProcessinstid() {
        return processinstid;
    }

    public void setProcessinstid(Integer processinstid) {
        this.processinstid = processinstid;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getFlowAppStaffNo() {
        return flowAppStaffNo;
    }

    public void setFlowAppStaffNo(String flowAppStaffNo) {
        this.flowAppStaffNo = flowAppStaffNo == null ? null : flowAppStaffNo.trim();
    }

    public String getFlowAppStaffName() {
        return flowAppStaffName;
    }

    public void setFlowAppStaffName(String flowAppStaffName) {
        this.flowAppStaffName = flowAppStaffName == null ? null : flowAppStaffName.trim();
    }

    public String getAppDeptId() {
        return appDeptId;
    }

    public void setAppDeptId(String appDeptId) {
        this.appDeptId = appDeptId == null ? null : appDeptId.trim();
    }

    public String getAppDeptName() {
        return appDeptName;
    }

    public void setAppDeptName(String appDeptName) {
        this.appDeptName = appDeptName == null ? null : appDeptName.trim();
    }

    public String getBusiappStaffNo() {
        return busiappStaffNo;
    }

    public void setBusiappStaffNo(String busiappStaffNo) {
        this.busiappStaffNo = busiappStaffNo == null ? null : busiappStaffNo.trim();
    }

    public String getBusiappStaffName() {
        return busiappStaffName;
    }

    public void setBusiappStaffName(String busiappStaffName) {
        this.busiappStaffName = busiappStaffName == null ? null : busiappStaffName.trim();
    }

    public String getBusiappDeptId() {
        return busiappDeptId;
    }

    public void setBusiappDeptId(String busiappDeptId) {
        this.busiappDeptId = busiappDeptId == null ? null : busiappDeptId.trim();
    }

    public String getBusiappDeptName() {
        return busiappDeptName;
    }

    public void setBusiappDeptName(String busiappDeptName) {
        this.busiappDeptName = busiappDeptName == null ? null : busiappDeptName.trim();
    }

    public String getBusiLinkDesc() {
        return busiLinkDesc;
    }

    public void setBusiLinkDesc(String busiLinkDesc) {
        this.busiLinkDesc = busiLinkDesc == null ? null : busiLinkDesc.trim();
    }

    public String getDataOrgNo() {
        return dataOrgNo;
    }

    public void setDataOrgNo(String dataOrgNo) {
        this.dataOrgNo = dataOrgNo == null ? null : dataOrgNo.trim();
    }

    public String getAppYm() {
        return appYm;
    }

    public void setAppYm(String appYm) {
        this.appYm = appYm == null ? null : appYm.trim();
    }

    public String getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag == null ? null : printFlag.trim();
    }

    public String getCanPrintFlag() {
        return canPrintFlag;
    }

    public void setCanPrintFlag(String canPrintFlag) {
        this.canPrintFlag = canPrintFlag == null ? null : canPrintFlag.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMultiFlowFlag() {
        return multiFlowFlag;
    }

    public void setMultiFlowFlag(String multiFlowFlag) {
        this.multiFlowFlag = multiFlowFlag == null ? null : multiFlowFlag.trim();
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