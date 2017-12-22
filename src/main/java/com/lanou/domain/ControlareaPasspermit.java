package com.lanou.domain;

import java.util.Date;

public class ControlareaPasspermit {
    private String passId;

    private String passType;

    private String cardNo;

    private String magmCardNo;

    private Date appBegDate;

    private Date appEndDate;

    private Date approveBegDate;

    private Date approveEndDate;

    private String visitObjDesc;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    private String approveDept;

    private String appDeptman;

    public ControlareaPasspermit(String passId, String passType, String cardNo, String magmCardNo, Date appBegDate, Date appEndDate, Date approveBegDate, Date approveEndDate, String visitObjDesc, String effectFlag, String createStaffNo, String createStaffName, Date createDate, String approveDept, String appDeptman) {
        this.passId = passId;
        this.passType = passType;
        this.cardNo = cardNo;
        this.magmCardNo = magmCardNo;
        this.appBegDate = appBegDate;
        this.appEndDate = appEndDate;
        this.approveBegDate = approveBegDate;
        this.approveEndDate = approveEndDate;
        this.visitObjDesc = visitObjDesc;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
        this.approveDept = approveDept;
        this.appDeptman = appDeptman;
    }

    public ControlareaPasspermit() {
        super();
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId == null ? null : passId.trim();
    }

    public String getPassType() {
        return passType;
    }

    public void setPassType(String passType) {
        this.passType = passType == null ? null : passType.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getMagmCardNo() {
        return magmCardNo;
    }

    public void setMagmCardNo(String magmCardNo) {
        this.magmCardNo = magmCardNo == null ? null : magmCardNo.trim();
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

    public String getVisitObjDesc() {
        return visitObjDesc;
    }

    public void setVisitObjDesc(String visitObjDesc) {
        this.visitObjDesc = visitObjDesc == null ? null : visitObjDesc.trim();
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

    public String getApproveDept() {
        return approveDept;
    }

    public void setApproveDept(String approveDept) {
        this.approveDept = approveDept == null ? null : approveDept.trim();
    }

    public String getAppDeptman() {
        return appDeptman;
    }

    public void setAppDeptman(String appDeptman) {
        this.appDeptman = appDeptman == null ? null : appDeptman.trim();
    }
}