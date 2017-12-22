package com.lanou.domain;

public class FireProtectiveProtect {
    private String protectId;

    private String firepId;

    private String riskAnal;

    private String riskMeasures;

    private String riskRemark;

    public FireProtectiveProtect(String protectId, String firepId, String riskAnal, String riskMeasures, String riskRemark) {
        this.protectId = protectId;
        this.firepId = firepId;
        this.riskAnal = riskAnal;
        this.riskMeasures = riskMeasures;
        this.riskRemark = riskRemark;
    }

    public FireProtectiveProtect() {
        super();
    }

    public String getProtectId() {
        return protectId;
    }

    public void setProtectId(String protectId) {
        this.protectId = protectId == null ? null : protectId.trim();
    }

    public String getFirepId() {
        return firepId;
    }

    public void setFirepId(String firepId) {
        this.firepId = firepId == null ? null : firepId.trim();
    }

    public String getRiskAnal() {
        return riskAnal;
    }

    public void setRiskAnal(String riskAnal) {
        this.riskAnal = riskAnal == null ? null : riskAnal.trim();
    }

    public String getRiskMeasures() {
        return riskMeasures;
    }

    public void setRiskMeasures(String riskMeasures) {
        this.riskMeasures = riskMeasures == null ? null : riskMeasures.trim();
    }

    public String getRiskRemark() {
        return riskRemark;
    }

    public void setRiskRemark(String riskRemark) {
        this.riskRemark = riskRemark == null ? null : riskRemark.trim();
    }
}