package com.lanou.domain;

import java.util.Date;

public class ArtificialMacDrill {
    private String drillId;

    private String drillType;

    private String appDeptId;

    private String appDeptName;

    private String appReason;

    private Date appBegDate;

    private Date appEndDate;

    private Integer operCount;

    private Integer durationTime;

    private String drillContent;

    private String specreqFlag;

    private String specReq;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    private String manageDepChiefno;

    private String manageDepChiefname;

    private String deptManagerId;

    private String deptManagerName;

    public ArtificialMacDrill(String drillId, String drillType, String appDeptId, String appDeptName, String appReason, Date appBegDate, Date appEndDate, Integer operCount, Integer durationTime, String drillContent, String specreqFlag, String specReq, String effectFlag, String createStaffNo, String createStaffName, Date createDate, String manageDepChiefno, String manageDepChiefname, String deptManagerId, String deptManagerName) {
        this.drillId = drillId;
        this.drillType = drillType;
        this.appDeptId = appDeptId;
        this.appDeptName = appDeptName;
        this.appReason = appReason;
        this.appBegDate = appBegDate;
        this.appEndDate = appEndDate;
        this.operCount = operCount;
        this.durationTime = durationTime;
        this.drillContent = drillContent;
        this.specreqFlag = specreqFlag;
        this.specReq = specReq;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
        this.manageDepChiefno = manageDepChiefno;
        this.manageDepChiefname = manageDepChiefname;
        this.deptManagerId = deptManagerId;
        this.deptManagerName = deptManagerName;
    }

    public ArtificialMacDrill() {
        super();
    }

    public String getDrillId() {
        return drillId;
    }

    public void setDrillId(String drillId) {
        this.drillId = drillId == null ? null : drillId.trim();
    }

    public String getDrillType() {
        return drillType;
    }

    public void setDrillType(String drillType) {
        this.drillType = drillType == null ? null : drillType.trim();
    }

    public String getAppDeptId() {
        return appDeptId;
    }

    public void setAppDeptId(String appDeptId) {
        this.appDeptId = appDeptId == null ? null : appDeptId.trim();
    }

    public String getAppDeptName() {
        return appDeptName;
    }

    public void setAppDeptName(String appDeptName) {
        this.appDeptName = appDeptName == null ? null : appDeptName.trim();
    }

    public String getAppReason() {
        return appReason;
    }

    public void setAppReason(String appReason) {
        this.appReason = appReason == null ? null : appReason.trim();
    }

    public Date getAppBegDate() {
        return appBegDate;
    }

    public void setAppBegDate(Date appBegDate) {
        this.appBegDate = appBegDate;
    }

    public Date getAppEndDate() {
        return appEndDate;
    }

    public void setAppEndDate(Date appEndDate) {
        this.appEndDate = appEndDate;
    }

    public Integer getOperCount() {
        return operCount;
    }

    public void setOperCount(Integer operCount) {
        this.operCount = operCount;
    }

    public Integer getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }

    public String getDrillContent() {
        return drillContent;
    }

    public void setDrillContent(String drillContent) {
        this.drillContent = drillContent == null ? null : drillContent.trim();
    }

    public String getSpecreqFlag() {
        return specreqFlag;
    }

    public void setSpecreqFlag(String specreqFlag) {
        this.specreqFlag = specreqFlag == null ? null : specreqFlag.trim();
    }

    public String getSpecReq() {
        return specReq;
    }

    public void setSpecReq(String specReq) {
        this.specReq = specReq == null ? null : specReq.trim();
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

    public String getManageDepChiefno() {
        return manageDepChiefno;
    }

    public void setManageDepChiefno(String manageDepChiefno) {
        this.manageDepChiefno = manageDepChiefno == null ? null : manageDepChiefno.trim();
    }

    public String getManageDepChiefname() {
        return manageDepChiefname;
    }

    public void setManageDepChiefname(String manageDepChiefname) {
        this.manageDepChiefname = manageDepChiefname == null ? null : manageDepChiefname.trim();
    }

    public String getDeptManagerId() {
        return deptManagerId;
    }

    public void setDeptManagerId(String deptManagerId) {
        this.deptManagerId = deptManagerId == null ? null : deptManagerId.trim();
    }

    public String getDeptManagerName() {
        return deptManagerName;
    }

    public void setDeptManagerName(String deptManagerName) {
        this.deptManagerName = deptManagerName == null ? null : deptManagerName.trim();
    }
}