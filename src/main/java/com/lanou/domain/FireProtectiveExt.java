package com.lanou.domain;

public class FireProtectiveExt {
    private String extId;

    private String firepId;

    private String barenessEleobjFlag;

    private String monitorFlag;

    private String jumpMacFlag;

    private String jumpMacFirepNo;

    private String jumpMacName;

    private String jumpStackFlag;

    private String jumpStackFirepNo;

    private String reduceChargeFlag;

    private String redChargeFirepNo;

    private String otherReq;

    private String cabVolGrade;

    public FireProtectiveExt(String extId, String firepId, String barenessEleobjFlag, String monitorFlag, String jumpMacFlag, String jumpMacFirepNo, String jumpMacName, String jumpStackFlag, String jumpStackFirepNo, String reduceChargeFlag, String redChargeFirepNo, String otherReq, String cabVolGrade) {
        this.extId = extId;
        this.firepId = firepId;
        this.barenessEleobjFlag = barenessEleobjFlag;
        this.monitorFlag = monitorFlag;
        this.jumpMacFlag = jumpMacFlag;
        this.jumpMacFirepNo = jumpMacFirepNo;
        this.jumpMacName = jumpMacName;
        this.jumpStackFlag = jumpStackFlag;
        this.jumpStackFirepNo = jumpStackFirepNo;
        this.reduceChargeFlag = reduceChargeFlag;
        this.redChargeFirepNo = redChargeFirepNo;
        this.otherReq = otherReq;
        this.cabVolGrade = cabVolGrade;
    }

    public FireProtectiveExt() {
        super();
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId == null ? null : extId.trim();
    }

    public String getFirepId() {
        return firepId;
    }

    public void setFirepId(String firepId) {
        this.firepId = firepId == null ? null : firepId.trim();
    }

    public String getBarenessEleobjFlag() {
        return barenessEleobjFlag;
    }

    public void setBarenessEleobjFlag(String barenessEleobjFlag) {
        this.barenessEleobjFlag = barenessEleobjFlag == null ? null : barenessEleobjFlag.trim();
    }

    public String getMonitorFlag() {
        return monitorFlag;
    }

    public void setMonitorFlag(String monitorFlag) {
        this.monitorFlag = monitorFlag == null ? null : monitorFlag.trim();
    }

    public String getJumpMacFlag() {
        return jumpMacFlag;
    }

    public void setJumpMacFlag(String jumpMacFlag) {
        this.jumpMacFlag = jumpMacFlag == null ? null : jumpMacFlag.trim();
    }

    public String getJumpMacFirepNo() {
        return jumpMacFirepNo;
    }

    public void setJumpMacFirepNo(String jumpMacFirepNo) {
        this.jumpMacFirepNo = jumpMacFirepNo == null ? null : jumpMacFirepNo.trim();
    }

    public String getJumpMacName() {
        return jumpMacName;
    }

    public void setJumpMacName(String jumpMacName) {
        this.jumpMacName = jumpMacName == null ? null : jumpMacName.trim();
    }

    public String getJumpStackFlag() {
        return jumpStackFlag;
    }

    public void setJumpStackFlag(String jumpStackFlag) {
        this.jumpStackFlag = jumpStackFlag == null ? null : jumpStackFlag.trim();
    }

    public String getJumpStackFirepNo() {
        return jumpStackFirepNo;
    }

    public void setJumpStackFirepNo(String jumpStackFirepNo) {
        this.jumpStackFirepNo = jumpStackFirepNo == null ? null : jumpStackFirepNo.trim();
    }

    public String getReduceChargeFlag() {
        return reduceChargeFlag;
    }

    public void setReduceChargeFlag(String reduceChargeFlag) {
        this.reduceChargeFlag = reduceChargeFlag == null ? null : reduceChargeFlag.trim();
    }

    public String getRedChargeFirepNo() {
        return redChargeFirepNo;
    }

    public void setRedChargeFirepNo(String redChargeFirepNo) {
        this.redChargeFirepNo = redChargeFirepNo == null ? null : redChargeFirepNo.trim();
    }

    public String getOtherReq() {
        return otherReq;
    }

    public void setOtherReq(String otherReq) {
        this.otherReq = otherReq == null ? null : otherReq.trim();
    }

    public String getCabVolGrade() {
        return cabVolGrade;
    }

    public void setCabVolGrade(String cabVolGrade) {
        this.cabVolGrade = cabVolGrade == null ? null : cabVolGrade.trim();
    }
}