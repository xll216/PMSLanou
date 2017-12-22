package com.lanou.domain;

import java.util.Date;

public class BimsBusiObj {
    private String bimsId;

    private String busiType;

    private String bimsStoreId;

    private String bimsStoreName;

    private String appDesc;

    private Date eduDate;

    private String eduRoom;

    private String authopenStaffNo;

    private String authopenStaffName;

    private String dealType;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    private String ydiStaff;

    public BimsBusiObj(String bimsId, String busiType, String bimsStoreId, String bimsStoreName, String appDesc, Date eduDate, String eduRoom, String authopenStaffNo, String authopenStaffName, String dealType, String effectFlag, String createStaffNo, String createStaffName, Date createDate, String ydiStaff) {
        this.bimsId = bimsId;
        this.busiType = busiType;
        this.bimsStoreId = bimsStoreId;
        this.bimsStoreName = bimsStoreName;
        this.appDesc = appDesc;
        this.eduDate = eduDate;
        this.eduRoom = eduRoom;
        this.authopenStaffNo = authopenStaffNo;
        this.authopenStaffName = authopenStaffName;
        this.dealType = dealType;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
        this.ydiStaff = ydiStaff;
    }

    public BimsBusiObj() {
        super();
    }

    public String getBimsId() {
        return bimsId;
    }

    public void setBimsId(String bimsId) {
        this.bimsId = bimsId == null ? null : bimsId.trim();
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public String getBimsStoreId() {
        return bimsStoreId;
    }

    public void setBimsStoreId(String bimsStoreId) {
        this.bimsStoreId = bimsStoreId == null ? null : bimsStoreId.trim();
    }

    public String getBimsStoreName() {
        return bimsStoreName;
    }

    public void setBimsStoreName(String bimsStoreName) {
        this.bimsStoreName = bimsStoreName == null ? null : bimsStoreName.trim();
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc == null ? null : appDesc.trim();
    }

    public Date getEduDate() {
        return eduDate;
    }

    public void setEduDate(Date eduDate) {
        this.eduDate = eduDate;
    }

    public String getEduRoom() {
        return eduRoom;
    }

    public void setEduRoom(String eduRoom) {
        this.eduRoom = eduRoom == null ? null : eduRoom.trim();
    }

    public String getAuthopenStaffNo() {
        return authopenStaffNo;
    }

    public void setAuthopenStaffNo(String authopenStaffNo) {
        this.authopenStaffNo = authopenStaffNo == null ? null : authopenStaffNo.trim();
    }

    public String getAuthopenStaffName() {
        return authopenStaffName;
    }

    public void setAuthopenStaffName(String authopenStaffName) {
        this.authopenStaffName = authopenStaffName == null ? null : authopenStaffName.trim();
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType == null ? null : dealType.trim();
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

    public String getYdiStaff() {
        return ydiStaff;
    }

    public void setYdiStaff(String ydiStaff) {
        this.ydiStaff = ydiStaff == null ? null : ydiStaff.trim();
    }
}