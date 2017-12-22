package com.lanou.domain;

public class HradiationWorkCheck {
    private String workcheckId;

    private String hradiId;

    private String checkType;

    private String checkDesc;

    public HradiationWorkCheck(String workcheckId, String hradiId, String checkType, String checkDesc) {
        this.workcheckId = workcheckId;
        this.hradiId = hradiId;
        this.checkType = checkType;
        this.checkDesc = checkDesc;
    }

    public HradiationWorkCheck() {
        super();
    }

    public String getWorkcheckId() {
        return workcheckId;
    }

    public void setWorkcheckId(String workcheckId) {
        this.workcheckId = workcheckId == null ? null : workcheckId.trim();
    }

    public String getHradiId() {
        return hradiId;
    }

    public void setHradiId(String hradiId) {
        this.hradiId = hradiId == null ? null : hradiId.trim();
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType == null ? null : checkType.trim();
    }

    public String getCheckDesc() {
        return checkDesc;
    }

    public void setCheckDesc(String checkDesc) {
        this.checkDesc = checkDesc == null ? null : checkDesc.trim();
    }
}