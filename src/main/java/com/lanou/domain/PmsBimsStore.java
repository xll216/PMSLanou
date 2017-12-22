package com.lanou.domain;

import java.util.Date;

public class PmsBimsStore {
    private String bimsStoreId;

    private String bimsStoreName;

    private String manageStaffNo;

    private String manageStaffName;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public PmsBimsStore(String bimsStoreId, String bimsStoreName, String manageStaffNo, String manageStaffName, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.bimsStoreId = bimsStoreId;
        this.bimsStoreName = bimsStoreName;
        this.manageStaffNo = manageStaffNo;
        this.manageStaffName = manageStaffName;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public PmsBimsStore() {
        super();
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

    public String getManageStaffNo() {
        return manageStaffNo;
    }

    public void setManageStaffNo(String manageStaffNo) {
        this.manageStaffNo = manageStaffNo == null ? null : manageStaffNo.trim();
    }

    public String getManageStaffName() {
        return manageStaffName;
    }

    public void setManageStaffName(String manageStaffName) {
        this.manageStaffName = manageStaffName == null ? null : manageStaffName.trim();
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