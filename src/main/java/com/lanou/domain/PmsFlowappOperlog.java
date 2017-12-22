package com.lanou.domain;

import java.util.Date;

public class PmsFlowappOperlog {
    private String operlogId;

    private String appId;

    private String appNo;

    private Integer processinstid;

    private String stepcode;

    private String evalType;

    private String evalValue;

    private String displayFlag;

    private String stepCode;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public PmsFlowappOperlog(String operlogId, String appId, String appNo, Integer processinstid, String stepcode, String evalType, String evalValue, String displayFlag, String stepCode, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.operlogId = operlogId;
        this.appId = appId;
        this.appNo = appNo;
        this.processinstid = processinstid;
        this.stepcode = stepcode;
        this.evalType = evalType;
        this.evalValue = evalValue;
        this.displayFlag = displayFlag;
        this.stepCode = stepCode;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public PmsFlowappOperlog() {
        super();
    }

    public String getOperlogId() {
        return operlogId;
    }

    public void setOperlogId(String operlogId) {
        this.operlogId = operlogId == null ? null : operlogId.trim();
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

    public String getStepcode() {
        return stepcode;
    }

    public void setStepcode(String stepcode) {
        this.stepcode = stepcode == null ? null : stepcode.trim();
    }

    public String getEvalType() {
        return evalType;
    }

    public void setEvalType(String evalType) {
        this.evalType = evalType == null ? null : evalType.trim();
    }

    public String getEvalValue() {
        return evalValue;
    }

    public void setEvalValue(String evalValue) {
        this.evalValue = evalValue == null ? null : evalValue.trim();
    }

    public String getDisplayFlag() {
        return displayFlag;
    }

    public void setDisplayFlag(String displayFlag) {
        this.displayFlag = displayFlag == null ? null : displayFlag.trim();
    }

    public String getStepCode() {
        return stepCode;
    }

    public void setStepCode(String stepCode) {
        this.stepCode = stepCode == null ? null : stepCode.trim();
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