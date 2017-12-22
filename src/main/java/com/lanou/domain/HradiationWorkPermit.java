package com.lanou.domain;

import java.util.Date;

public class HradiationWorkPermit {
    private String hradiId;

    private String macNo;

    private String busiNo;

    private Date appBegDate;

    private String timeLimit;

    private String site;

    private String operName;

    private String workAddr;

    private String workContent;

    private Date sureWorkBegdate;

    private Date sureWorkEnddate;

    private String canExecFlag;

    private String realMeter;

    private String realMaxWorktime;

    private Date realWorkDate;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public HradiationWorkPermit(String hradiId, String macNo, String busiNo, Date appBegDate, String timeLimit, String site, String operName, String workAddr, String workContent, Date sureWorkBegdate, Date sureWorkEnddate, String canExecFlag, String realMeter, String realMaxWorktime, Date realWorkDate, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.hradiId = hradiId;
        this.macNo = macNo;
        this.busiNo = busiNo;
        this.appBegDate = appBegDate;
        this.timeLimit = timeLimit;
        this.site = site;
        this.operName = operName;
        this.workAddr = workAddr;
        this.workContent = workContent;
        this.sureWorkBegdate = sureWorkBegdate;
        this.sureWorkEnddate = sureWorkEnddate;
        this.canExecFlag = canExecFlag;
        this.realMeter = realMeter;
        this.realMaxWorktime = realMaxWorktime;
        this.realWorkDate = realWorkDate;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public HradiationWorkPermit() {
        super();
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

    public String getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(String busiNo) {
        this.busiNo = busiNo == null ? null : busiNo.trim();
    }

    public Date getAppBegDate() {
        return appBegDate;
    }

    public void setAppBegDate(Date appBegDate) {
        this.appBegDate = appBegDate;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getWorkAddr() {
        return workAddr;
    }

    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr == null ? null : workAddr.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public Date getSureWorkBegdate() {
        return sureWorkBegdate;
    }

    public void setSureWorkBegdate(Date sureWorkBegdate) {
        this.sureWorkBegdate = sureWorkBegdate;
    }

    public Date getSureWorkEnddate() {
        return sureWorkEnddate;
    }

    public void setSureWorkEnddate(Date sureWorkEnddate) {
        this.sureWorkEnddate = sureWorkEnddate;
    }

    public String getCanExecFlag() {
        return canExecFlag;
    }

    public void setCanExecFlag(String canExecFlag) {
        this.canExecFlag = canExecFlag == null ? null : canExecFlag.trim();
    }

    public String getRealMeter() {
        return realMeter;
    }

    public void setRealMeter(String realMeter) {
        this.realMeter = realMeter == null ? null : realMeter.trim();
    }

    public String getRealMaxWorktime() {
        return realMaxWorktime;
    }

    public void setRealMaxWorktime(String realMaxWorktime) {
        this.realMaxWorktime = realMaxWorktime == null ? null : realMaxWorktime.trim();
    }

    public Date getRealWorkDate() {
        return realWorkDate;
    }

    public void setRealWorkDate(Date realWorkDate) {
        this.realWorkDate = realWorkDate;
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