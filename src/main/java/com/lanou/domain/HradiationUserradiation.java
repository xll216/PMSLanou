package com.lanou.domain;

public class HradiationUserradiation {
    private String teamId;

    private String hradiId;

    private String staffNo;

    private String staffName;

    private String beforeCycMeter;

    private String identityNo;

    private String cardNo;

    private String companyName;

    private String operatorName;

    public HradiationUserradiation(String teamId, String hradiId, String staffNo, String staffName, String beforeCycMeter, String identityNo, String cardNo, String companyName, String operatorName) {
        this.teamId = teamId;
        this.hradiId = hradiId;
        this.staffNo = staffNo;
        this.staffName = staffName;
        this.beforeCycMeter = beforeCycMeter;
        this.identityNo = identityNo;
        this.cardNo = cardNo;
        this.companyName = companyName;
        this.operatorName = operatorName;
    }

    public HradiationUserradiation() {
        super();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getHradiId() {
        return hradiId;
    }

    public void setHradiId(String hradiId) {
        this.hradiId = hradiId == null ? null : hradiId.trim();
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo == null ? null : staffNo.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getBeforeCycMeter() {
        return beforeCycMeter;
    }

    public void setBeforeCycMeter(String beforeCycMeter) {
        this.beforeCycMeter = beforeCycMeter == null ? null : beforeCycMeter.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }
}