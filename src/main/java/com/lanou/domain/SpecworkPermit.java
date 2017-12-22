package com.lanou.domain;

import java.util.Date;

public class SpecworkPermit {
    private String specpertId;

    private String appType;

    private String eduProj;

    private String eduObj;

    private String needDesc;

    private String eduQualification;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public SpecworkPermit(String specpertId, String appType, String eduProj, String eduObj, String needDesc, String eduQualification, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.specpertId = specpertId;
        this.appType = appType;
        this.eduProj = eduProj;
        this.eduObj = eduObj;
        this.needDesc = needDesc;
        this.eduQualification = eduQualification;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public SpecworkPermit() {
        super();
    }

    public String getSpecpertId() {
        return specpertId;
    }

    public void setSpecpertId(String specpertId) {
        this.specpertId = specpertId == null ? null : specpertId.trim();
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    public String getEduProj() {
        return eduProj;
    }

    public void setEduProj(String eduProj) {
        this.eduProj = eduProj == null ? null : eduProj.trim();
    }

    public String getEduObj() {
        return eduObj;
    }

    public void setEduObj(String eduObj) {
        this.eduObj = eduObj == null ? null : eduObj.trim();
    }

    public String getNeedDesc() {
        return needDesc;
    }

    public void setNeedDesc(String needDesc) {
        this.needDesc = needDesc == null ? null : needDesc.trim();
    }

    public String getEduQualification() {
        return eduQualification;
    }

    public void setEduQualification(String eduQualification) {
        this.eduQualification = eduQualification == null ? null : eduQualification.trim();
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