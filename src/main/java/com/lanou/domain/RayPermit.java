package com.lanou.domain;

import java.util.Date;

public class RayPermit {
    private String raypermitId;

    private String busiNo;

    private Date appBegDate;

    private Date appEndDate;

    private Date approveBegDate;

    private Date approveEndDate;

    private String operObjDesc;

    private String assistUser;

    private String otherWorkFlag;

    private String otherReq;

    private String influMacFlag;

    private String influDesc;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public RayPermit(String raypermitId, String busiNo, Date appBegDate, Date appEndDate, Date approveBegDate, Date approveEndDate, String operObjDesc, String assistUser, String otherWorkFlag, String otherReq, String influMacFlag, String influDesc, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.raypermitId = raypermitId;
        this.busiNo = busiNo;
        this.appBegDate = appBegDate;
        this.appEndDate = appEndDate;
        this.approveBegDate = approveBegDate;
        this.approveEndDate = approveEndDate;
        this.operObjDesc = operObjDesc;
        this.assistUser = assistUser;
        this.otherWorkFlag = otherWorkFlag;
        this.otherReq = otherReq;
        this.influMacFlag = influMacFlag;
        this.influDesc = influDesc;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public RayPermit() {
        super();
    }

    public String getRaypermitId() {
        return raypermitId;
    }

    public void setRaypermitId(String raypermitId) {
        this.raypermitId = raypermitId == null ? null : raypermitId.trim();
    }

    public String getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(String busiNo) {
        this.busiNo = busiNo == null ? null : busiNo.trim();
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

    public Date getApproveBegDate() {
        return approveBegDate;
    }

    public void setApproveBegDate(Date approveBegDate) {
        this.approveBegDate = approveBegDate;
    }

    public Date getApproveEndDate() {
        return approveEndDate;
    }

    public void setApproveEndDate(Date approveEndDate) {
        this.approveEndDate = approveEndDate;
    }

    public String getOperObjDesc() {
        return operObjDesc;
    }

    public void setOperObjDesc(String operObjDesc) {
        this.operObjDesc = operObjDesc == null ? null : operObjDesc.trim();
    }

    public String getAssistUser() {
        return assistUser;
    }

    public void setAssistUser(String assistUser) {
        this.assistUser = assistUser == null ? null : assistUser.trim();
    }

    public String getOtherWorkFlag() {
        return otherWorkFlag;
    }

    public void setOtherWorkFlag(String otherWorkFlag) {
        this.otherWorkFlag = otherWorkFlag == null ? null : otherWorkFlag.trim();
    }

    public String getOtherReq() {
        return otherReq;
    }

    public void setOtherReq(String otherReq) {
        this.otherReq = otherReq == null ? null : otherReq.trim();
    }

    public String getInfluMacFlag() {
        return influMacFlag;
    }

    public void setInfluMacFlag(String influMacFlag) {
        this.influMacFlag = influMacFlag == null ? null : influMacFlag.trim();
    }

    public String getInfluDesc() {
        return influDesc;
    }

    public void setInfluDesc(String influDesc) {
        this.influDesc = influDesc == null ? null : influDesc.trim();
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