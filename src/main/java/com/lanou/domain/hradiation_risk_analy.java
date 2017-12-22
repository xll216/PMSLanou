package com.lanou.domain;

public class hradiation_risk_analy {
    private String riskanalyId;

    private String hradiId;

    private String workAddr;

    private String workaddrDoseRate;

    private String rxPartion;

    private String affectDesc;

    private String addrriskDesc;

    private String workSystem;

    private String worksystemDoseRate;

    private String sysFlowType;

    private String worksystemOutrayDesc;

    private String highDosePlace;

    private String worksystemFlowDesc;

    private String rangeAnalDesc;

    private String radiationAnalyDesc;

    private String dateAnalyDesc;

    private String disableAnalyDesc;

    private String toolAnalyDesc;

    private String personPreDesc;

    private String excepDealDesc;

    private String redcheckDesc;

    private String teamRadiationDesc;

    public hradiation_risk_analy(String riskanalyId, String hradiId, String workAddr, String workaddrDoseRate, String rxPartion, String affectDesc, String addrriskDesc, String workSystem, String worksystemDoseRate, String sysFlowType, String worksystemOutrayDesc, String highDosePlace, String worksystemFlowDesc, String rangeAnalDesc, String radiationAnalyDesc, String dateAnalyDesc, String disableAnalyDesc, String toolAnalyDesc, String personPreDesc, String excepDealDesc, String redcheckDesc, String teamRadiationDesc) {
        this.riskanalyId = riskanalyId;
        this.hradiId = hradiId;
        this.workAddr = workAddr;
        this.workaddrDoseRate = workaddrDoseRate;
        this.rxPartion = rxPartion;
        this.affectDesc = affectDesc;
        this.addrriskDesc = addrriskDesc;
        this.workSystem = workSystem;
        this.worksystemDoseRate = worksystemDoseRate;
        this.sysFlowType = sysFlowType;
        this.worksystemOutrayDesc = worksystemOutrayDesc;
        this.highDosePlace = highDosePlace;
        this.worksystemFlowDesc = worksystemFlowDesc;
        this.rangeAnalDesc = rangeAnalDesc;
        this.radiationAnalyDesc = radiationAnalyDesc;
        this.dateAnalyDesc = dateAnalyDesc;
        this.disableAnalyDesc = disableAnalyDesc;
        this.toolAnalyDesc = toolAnalyDesc;
        this.personPreDesc = personPreDesc;
        this.excepDealDesc = excepDealDesc;
        this.redcheckDesc = redcheckDesc;
        this.teamRadiationDesc = teamRadiationDesc;
    }

    public hradiation_risk_analy() {
        super();
    }

    public String getRiskanalyId() {
        return riskanalyId;
    }

    public void setRiskanalyId(String riskanalyId) {
        this.riskanalyId = riskanalyId == null ? null : riskanalyId.trim();
    }

    public String getHradiId() {
        return hradiId;
    }

    public void setHradiId(String hradiId) {
        this.hradiId = hradiId == null ? null : hradiId.trim();
    }

    public String getWorkAddr() {
        return workAddr;
    }

    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr == null ? null : workAddr.trim();
    }

    public String getWorkaddrDoseRate() {
        return workaddrDoseRate;
    }

    public void setWorkaddrDoseRate(String workaddrDoseRate) {
        this.workaddrDoseRate = workaddrDoseRate == null ? null : workaddrDoseRate.trim();
    }

    public String getRxPartion() {
        return rxPartion;
    }

    public void setRxPartion(String rxPartion) {
        this.rxPartion = rxPartion == null ? null : rxPartion.trim();
    }

    public String getAffectDesc() {
        return affectDesc;
    }

    public void setAffectDesc(String affectDesc) {
        this.affectDesc = affectDesc == null ? null : affectDesc.trim();
    }

    public String getAddrriskDesc() {
        return addrriskDesc;
    }

    public void setAddrriskDesc(String addrriskDesc) {
        this.addrriskDesc = addrriskDesc == null ? null : addrriskDesc.trim();
    }

    public String getWorkSystem() {
        return workSystem;
    }

    public void setWorkSystem(String workSystem) {
        this.workSystem = workSystem == null ? null : workSystem.trim();
    }

    public String getWorksystemDoseRate() {
        return worksystemDoseRate;
    }

    public void setWorksystemDoseRate(String worksystemDoseRate) {
        this.worksystemDoseRate = worksystemDoseRate == null ? null : worksystemDoseRate.trim();
    }

    public String getSysFlowType() {
        return sysFlowType;
    }

    public void setSysFlowType(String sysFlowType) {
        this.sysFlowType = sysFlowType == null ? null : sysFlowType.trim();
    }

    public String getWorksystemOutrayDesc() {
        return worksystemOutrayDesc;
    }

    public void setWorksystemOutrayDesc(String worksystemOutrayDesc) {
        this.worksystemOutrayDesc = worksystemOutrayDesc == null ? null : worksystemOutrayDesc.trim();
    }

    public String getHighDosePlace() {
        return highDosePlace;
    }

    public void setHighDosePlace(String highDosePlace) {
        this.highDosePlace = highDosePlace == null ? null : highDosePlace.trim();
    }

    public String getWorksystemFlowDesc() {
        return worksystemFlowDesc;
    }

    public void setWorksystemFlowDesc(String worksystemFlowDesc) {
        this.worksystemFlowDesc = worksystemFlowDesc == null ? null : worksystemFlowDesc.trim();
    }

    public String getRangeAnalDesc() {
        return rangeAnalDesc;
    }

    public void setRangeAnalDesc(String rangeAnalDesc) {
        this.rangeAnalDesc = rangeAnalDesc == null ? null : rangeAnalDesc.trim();
    }

    public String getRadiationAnalyDesc() {
        return radiationAnalyDesc;
    }

    public void setRadiationAnalyDesc(String radiationAnalyDesc) {
        this.radiationAnalyDesc = radiationAnalyDesc == null ? null : radiationAnalyDesc.trim();
    }

    public String getDateAnalyDesc() {
        return dateAnalyDesc;
    }

    public void setDateAnalyDesc(String dateAnalyDesc) {
        this.dateAnalyDesc = dateAnalyDesc == null ? null : dateAnalyDesc.trim();
    }

    public String getDisableAnalyDesc() {
        return disableAnalyDesc;
    }

    public void setDisableAnalyDesc(String disableAnalyDesc) {
        this.disableAnalyDesc = disableAnalyDesc == null ? null : disableAnalyDesc.trim();
    }

    public String getToolAnalyDesc() {
        return toolAnalyDesc;
    }

    public void setToolAnalyDesc(String toolAnalyDesc) {
        this.toolAnalyDesc = toolAnalyDesc == null ? null : toolAnalyDesc.trim();
    }

    public String getPersonPreDesc() {
        return personPreDesc;
    }

    public void setPersonPreDesc(String personPreDesc) {
        this.personPreDesc = personPreDesc == null ? null : personPreDesc.trim();
    }

    public String getExcepDealDesc() {
        return excepDealDesc;
    }

    public void setExcepDealDesc(String excepDealDesc) {
        this.excepDealDesc = excepDealDesc == null ? null : excepDealDesc.trim();
    }

    public String getRedcheckDesc() {
        return redcheckDesc;
    }

    public void setRedcheckDesc(String redcheckDesc) {
        this.redcheckDesc = redcheckDesc == null ? null : redcheckDesc.trim();
    }

    public String getTeamRadiationDesc() {
        return teamRadiationDesc;
    }

    public void setTeamRadiationDesc(String teamRadiationDesc) {
        this.teamRadiationDesc = teamRadiationDesc == null ? null : teamRadiationDesc.trim();
    }
}