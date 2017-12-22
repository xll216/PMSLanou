package com.lanou.domain;

import java.util.Date;

public class PmsBusiPrint {
    private String printId;

    private Integer processinstid;

    private String printPath;

    private String printTempName;

    private String stepCode;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public PmsBusiPrint(String printId, Integer processinstid, String printPath, String printTempName, String stepCode, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.printId = printId;
        this.processinstid = processinstid;
        this.printPath = printPath;
        this.printTempName = printTempName;
        this.stepCode = stepCode;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public PmsBusiPrint() {
        super();
    }

    public String getPrintId() {
        return printId;
    }

    public void setPrintId(String printId) {
        this.printId = printId == null ? null : printId.trim();
    }

    public Integer getProcessinstid() {
        return processinstid;
    }

    public void setProcessinstid(Integer processinstid) {
        this.processinstid = processinstid;
    }

    public String getPrintPath() {
        return printPath;
    }

    public void setPrintPath(String printPath) {
        this.printPath = printPath == null ? null : printPath.trim();
    }

    public String getPrintTempName() {
        return printTempName;
    }

    public void setPrintTempName(String printTempName) {
        this.printTempName = printTempName == null ? null : printTempName.trim();
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