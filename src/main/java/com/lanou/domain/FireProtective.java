package com.lanou.domain;

import java.util.Date;

public class FireProtective {
    private String firepId;

    private String holeType;

    private String macNo;

    private String workContent;

    private String busiNo;

    private String interfStaffNo;

    private String interfStaffName;

    private String interfDeptId;

    private String interfDeptName;

    private String interfLinkcontent;

    private Date workBeginDate;

    private Date workEndDate;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public FireProtective(String firepId, String holeType, String macNo, String workContent, String busiNo, String interfStaffNo, String interfStaffName, String interfDeptId, String interfDeptName, String interfLinkcontent, Date workBeginDate, Date workEndDate, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.firepId = firepId;
        this.holeType = holeType;
        this.macNo = macNo;
        this.workContent = workContent;
        this.busiNo = busiNo;
        this.interfStaffNo = interfStaffNo;
        this.interfStaffName = interfStaffName;
        this.interfDeptId = interfDeptId;
        this.interfDeptName = interfDeptName;
        this.interfLinkcontent = interfLinkcontent;
        this.workBeginDate = workBeginDate;
        this.workEndDate = workEndDate;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public FireProtective() {
        super();
    }

    public String getFirepId() {
        return firepId;
    }

    public void setFirepId(String firepId) {
        this.firepId = firepId == null ? null : firepId.trim();
    }

    public String getHoleType() {
        return holeType;
    }

    public void setHoleType(String holeType) {
        this.holeType = holeType == null ? null : holeType.trim();
    }

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo == null ? null : macNo.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public String getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(String busiNo) {
        this.busiNo = busiNo == null ? null : busiNo.trim();
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

    public String getInterfDeptId() {
        return interfDeptId;
    }

    public void setInterfDeptId(String interfDeptId) {
        this.interfDeptId = interfDeptId == null ? null : interfDeptId.trim();
    }

    public String getInterfDeptName() {
        return interfDeptName;
    }

    public void setInterfDeptName(String interfDeptName) {
        this.interfDeptName = interfDeptName == null ? null : interfDeptName.trim();
    }

    public String getInterfLinkcontent() {
        return interfLinkcontent;
    }

    public void setInterfLinkcontent(String interfLinkcontent) {
        this.interfLinkcontent = interfLinkcontent == null ? null : interfLinkcontent.trim();
    }

    public Date getWorkBeginDate() {
        return workBeginDate;
    }

    public void setWorkBeginDate(Date workBeginDate) {
        this.workBeginDate = workBeginDate;
    }

    public Date getWorkEndDate() {
        return workEndDate;
    }

    public void setWorkEndDate(Date workEndDate) {
        this.workEndDate = workEndDate;
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