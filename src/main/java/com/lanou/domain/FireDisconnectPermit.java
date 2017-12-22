package com.lanou.domain;

import java.util.Date;

public class FireDisconnectPermit {
    private String disconnId;

    private String busiNo;

    private String prepareStaffNo;

    private String prepareStaffName;

    private String bugDesc;

    private String workContent;

    private Date planBegDate;

    private String timeLimit;

    private String preparePhone;

    private String informPerson;

    private String disconnRange;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public FireDisconnectPermit(String disconnId, String busiNo, String prepareStaffNo, String prepareStaffName, String bugDesc, String workContent, Date planBegDate, String timeLimit, String preparePhone, String informPerson, String disconnRange, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.disconnId = disconnId;
        this.busiNo = busiNo;
        this.prepareStaffNo = prepareStaffNo;
        this.prepareStaffName = prepareStaffName;
        this.bugDesc = bugDesc;
        this.workContent = workContent;
        this.planBegDate = planBegDate;
        this.timeLimit = timeLimit;
        this.preparePhone = preparePhone;
        this.informPerson = informPerson;
        this.disconnRange = disconnRange;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public FireDisconnectPermit() {
        super();
    }

    public String getDisconnId() {
        return disconnId;
    }

    public void setDisconnId(String disconnId) {
        this.disconnId = disconnId == null ? null : disconnId.trim();
    }

    public String getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(String busiNo) {
        this.busiNo = busiNo == null ? null : busiNo.trim();
    }

    public String getPrepareStaffNo() {
        return prepareStaffNo;
    }

    public void setPrepareStaffNo(String prepareStaffNo) {
        this.prepareStaffNo = prepareStaffNo == null ? null : prepareStaffNo.trim();
    }

    public String getPrepareStaffName() {
        return prepareStaffName;
    }

    public void setPrepareStaffName(String prepareStaffName) {
        this.prepareStaffName = prepareStaffName == null ? null : prepareStaffName.trim();
    }

    public String getBugDesc() {
        return bugDesc;
    }

    public void setBugDesc(String bugDesc) {
        this.bugDesc = bugDesc == null ? null : bugDesc.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public Date getPlanBegDate() {
        return planBegDate;
    }

    public void setPlanBegDate(Date planBegDate) {
        this.planBegDate = planBegDate;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public String getPreparePhone() {
        return preparePhone;
    }

    public void setPreparePhone(String preparePhone) {
        this.preparePhone = preparePhone == null ? null : preparePhone.trim();
    }

    public String getInformPerson() {
        return informPerson;
    }

    public void setInformPerson(String informPerson) {
        this.informPerson = informPerson == null ? null : informPerson.trim();
    }

    public String getDisconnRange() {
        return disconnRange;
    }

    public void setDisconnRange(String disconnRange) {
        this.disconnRange = disconnRange == null ? null : disconnRange.trim();
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