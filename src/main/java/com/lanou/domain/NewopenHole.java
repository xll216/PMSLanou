package com.lanou.domain;

import java.util.Date;

public class NewopenHole {
    private String holeId;

    private String busiNo;

    private String holeSite;

    private String diameter;

    private String installTube;

    private String completeDate;

    private String influeTubeFlag;

    private String isControlareaFlag;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public NewopenHole(String holeId, String busiNo, String holeSite, String diameter, String installTube, String completeDate, String influeTubeFlag, String isControlareaFlag, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.holeId = holeId;
        this.busiNo = busiNo;
        this.holeSite = holeSite;
        this.diameter = diameter;
        this.installTube = installTube;
        this.completeDate = completeDate;
        this.influeTubeFlag = influeTubeFlag;
        this.isControlareaFlag = isControlareaFlag;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public NewopenHole() {
        super();
    }

    public String getHoleId() {
        return holeId;
    }

    public void setHoleId(String holeId) {
        this.holeId = holeId == null ? null : holeId.trim();
    }

    public String getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(String busiNo) {
        this.busiNo = busiNo == null ? null : busiNo.trim();
    }

    public String getHoleSite() {
        return holeSite;
    }

    public void setHoleSite(String holeSite) {
        this.holeSite = holeSite == null ? null : holeSite.trim();
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter == null ? null : diameter.trim();
    }

    public String getInstallTube() {
        return installTube;
    }

    public void setInstallTube(String installTube) {
        this.installTube = installTube == null ? null : installTube.trim();
    }

    public String getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(String completeDate) {
        this.completeDate = completeDate == null ? null : completeDate.trim();
    }

    public String getInflueTubeFlag() {
        return influeTubeFlag;
    }

    public void setInflueTubeFlag(String influeTubeFlag) {
        this.influeTubeFlag = influeTubeFlag == null ? null : influeTubeFlag.trim();
    }

    public String getIsControlareaFlag() {
        return isControlareaFlag;
    }

    public void setIsControlareaFlag(String isControlareaFlag) {
        this.isControlareaFlag = isControlareaFlag == null ? null : isControlareaFlag.trim();
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