package com.lanou.domain;

public class PmsRelaStaff {
    private String relaId;

    private String relaBusiTable;

    private String relaBusiId;

    private String relaDesc;

    private String staffNo;

    private String staffName;

    private String cardNo;

    private String passcardNo;

    private String orgName;

    private String otherDesc;

    private String remark;

    public PmsRelaStaff(String relaId, String relaBusiTable, String relaBusiId, String relaDesc, String staffNo, String staffName, String cardNo, String passcardNo, String orgName, String otherDesc, String remark) {
        this.relaId = relaId;
        this.relaBusiTable = relaBusiTable;
        this.relaBusiId = relaBusiId;
        this.relaDesc = relaDesc;
        this.staffNo = staffNo;
        this.staffName = staffName;
        this.cardNo = cardNo;
        this.passcardNo = passcardNo;
        this.orgName = orgName;
        this.otherDesc = otherDesc;
        this.remark = remark;
    }

    public PmsRelaStaff() {
        super();
    }

    public String getRelaId() {
        return relaId;
    }

    public void setRelaId(String relaId) {
        this.relaId = relaId == null ? null : relaId.trim();
    }

    public String getRelaBusiTable() {
        return relaBusiTable;
    }

    public void setRelaBusiTable(String relaBusiTable) {
        this.relaBusiTable = relaBusiTable == null ? null : relaBusiTable.trim();
    }

    public String getRelaBusiId() {
        return relaBusiId;
    }

    public void setRelaBusiId(String relaBusiId) {
        this.relaBusiId = relaBusiId == null ? null : relaBusiId.trim();
    }

    public String getRelaDesc() {
        return relaDesc;
    }

    public void setRelaDesc(String relaDesc) {
        this.relaDesc = relaDesc == null ? null : relaDesc.trim();
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo == null ? null : staffNo.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getPasscardNo() {
        return passcardNo;
    }

    public void setPasscardNo(String passcardNo) {
        this.passcardNo = passcardNo == null ? null : passcardNo.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOtherDesc() {
        return otherDesc;
    }

    public void setOtherDesc(String otherDesc) {
        this.otherDesc = otherDesc == null ? null : otherDesc.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}