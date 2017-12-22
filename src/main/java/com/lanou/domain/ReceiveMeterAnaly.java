package com.lanou.domain;

public class ReceiveMeterAnaly {
    private String meteranalyId;

    private String riskanalyId;

    private String workStep;

    private String site;

    private Integer userCount;

    private String preDate;

    private String premeterMsvn;

    private String premeterMsvy;

    private String premeterMann;

    private String premeterMany;

    private String protReq;

    public ReceiveMeterAnaly(String meteranalyId, String riskanalyId, String workStep, String site, Integer userCount, String preDate, String premeterMsvn, String premeterMsvy, String premeterMann, String premeterMany, String protReq) {
        this.meteranalyId = meteranalyId;
        this.riskanalyId = riskanalyId;
        this.workStep = workStep;
        this.site = site;
        this.userCount = userCount;
        this.preDate = preDate;
        this.premeterMsvn = premeterMsvn;
        this.premeterMsvy = premeterMsvy;
        this.premeterMann = premeterMann;
        this.premeterMany = premeterMany;
        this.protReq = protReq;
    }

    public ReceiveMeterAnaly() {
        super();
    }

    public String getMeteranalyId() {
        return meteranalyId;
    }

    public void setMeteranalyId(String meteranalyId) {
        this.meteranalyId = meteranalyId == null ? null : meteranalyId.trim();
    }

    public String getRiskanalyId() {
        return riskanalyId;
    }

    public void setRiskanalyId(String riskanalyId) {
        this.riskanalyId = riskanalyId == null ? null : riskanalyId.trim();
    }

    public String getWorkStep() {
        return workStep;
    }

    public void setWorkStep(String workStep) {
        this.workStep = workStep == null ? null : workStep.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public String getPreDate() {
        return preDate;
    }

    public void setPreDate(String preDate) {
        this.preDate = preDate == null ? null : preDate.trim();
    }

    public String getPremeterMsvn() {
        return premeterMsvn;
    }

    public void setPremeterMsvn(String premeterMsvn) {
        this.premeterMsvn = premeterMsvn == null ? null : premeterMsvn.trim();
    }

    public String getPremeterMsvy() {
        return premeterMsvy;
    }

    public void setPremeterMsvy(String premeterMsvy) {
        this.premeterMsvy = premeterMsvy == null ? null : premeterMsvy.trim();
    }

    public String getPremeterMann() {
        return premeterMann;
    }

    public void setPremeterMann(String premeterMann) {
        this.premeterMann = premeterMann == null ? null : premeterMann.trim();
    }

    public String getPremeterMany() {
        return premeterMany;
    }

    public void setPremeterMany(String premeterMany) {
        this.premeterMany = premeterMany == null ? null : premeterMany.trim();
    }

    public String getProtReq() {
        return protReq;
    }

    public void setProtReq(String protReq) {
        this.protReq = protReq == null ? null : protReq.trim();
    }
}