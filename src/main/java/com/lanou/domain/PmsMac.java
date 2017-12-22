package com.lanou.domain;

import java.util.Date;

public class PmsMac {
    private String macId;

    private String macNo;

    private String macName;

    private String macManageStaffNo;

    private String macManageStaffName;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public PmsMac(String macId, String macNo, String macName, String macManageStaffNo, String macManageStaffName, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.macId = macId;
        this.macNo = macNo;
        this.macName = macName;
        this.macManageStaffNo = macManageStaffNo;
        this.macManageStaffName = macManageStaffName;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public PmsMac() {
        super();
    }

    public String getMacId() {
        return macId;
    }

    public void setMacId(String macId) {
        this.macId = macId == null ? null : macId.trim();
    }

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo == null ? null : macNo.trim();
    }

    public String getMacName() {
        return macName;
    }

    public void setMacName(String macName) {
        this.macName = macName == null ? null : macName.trim();
    }

    public String getMacManageStaffNo() {
        return macManageStaffNo;
    }

    public void setMacManageStaffNo(String macManageStaffNo) {
        this.macManageStaffNo = macManageStaffNo == null ? null : macManageStaffNo.trim();
    }

    public String getMacManageStaffName() {
        return macManageStaffName;
    }

    public void setMacManageStaffName(String macManageStaffName) {
        this.macManageStaffName = macManageStaffName == null ? null : macManageStaffName.trim();
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