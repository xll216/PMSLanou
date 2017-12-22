package com.lanou.domain;

import java.util.Date;

public class CargoTransPermit {
    private String transPertId;

    private String transType;

    private String macNo;

    private Date transDate;

    private String transDeptId;

    private String transDeptName;

    private String transStartp;

    private String transEndp;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public CargoTransPermit(String transPertId, String transType, String macNo, Date transDate, String transDeptId, String transDeptName, String transStartp, String transEndp, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.transPertId = transPertId;
        this.transType = transType;
        this.macNo = macNo;
        this.transDate = transDate;
        this.transDeptId = transDeptId;
        this.transDeptName = transDeptName;
        this.transStartp = transStartp;
        this.transEndp = transEndp;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public CargoTransPermit() {
        super();
    }

    public String getTransPertId() {
        return transPertId;
    }

    public void setTransPertId(String transPertId) {
        this.transPertId = transPertId == null ? null : transPertId.trim();
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo == null ? null : macNo.trim();
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getTransDeptId() {
        return transDeptId;
    }

    public void setTransDeptId(String transDeptId) {
        this.transDeptId = transDeptId == null ? null : transDeptId.trim();
    }

    public String getTransDeptName() {
        return transDeptName;
    }

    public void setTransDeptName(String transDeptName) {
        this.transDeptName = transDeptName == null ? null : transDeptName.trim();
    }

    public String getTransStartp() {
        return transStartp;
    }

    public void setTransStartp(String transStartp) {
        this.transStartp = transStartp == null ? null : transStartp.trim();
    }

    public String getTransEndp() {
        return transEndp;
    }

    public void setTransEndp(String transEndp) {
        this.transEndp = transEndp == null ? null : transEndp.trim();
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