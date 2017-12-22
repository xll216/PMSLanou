package com.lanou.domain;

import java.util.Date;

public class HradiationRxRiskcontrol {
    private String riskcontrId;

    private String hradiId;

    private String macNo;

    private Date workBegDate;

    private String workContent;

    public HradiationRxRiskcontrol(String riskcontrId, String hradiId, String macNo, Date workBegDate, String workContent) {
        this.riskcontrId = riskcontrId;
        this.hradiId = hradiId;
        this.macNo = macNo;
        this.workBegDate = workBegDate;
        this.workContent = workContent;
    }

    public HradiationRxRiskcontrol() {
        super();
    }

    public String getRiskcontrId() {
        return riskcontrId;
    }

    public void setRiskcontrId(String riskcontrId) {
        this.riskcontrId = riskcontrId == null ? null : riskcontrId.trim();
    }

    public String getHradiId() {
        return hradiId;
    }

    public void setHradiId(String hradiId) {
        this.hradiId = hradiId == null ? null : hradiId.trim();
    }

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo == null ? null : macNo.trim();
    }

    public Date getWorkBegDate() {
        return workBegDate;
    }

    public void setWorkBegDate(Date workBegDate) {
        this.workBegDate = workBegDate;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }
}