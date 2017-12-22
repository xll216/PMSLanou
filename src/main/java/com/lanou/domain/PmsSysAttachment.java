package com.lanou.domain;

import java.util.Date;

public class PmsSysAttachment {
    private String attId;

    private String attExtid;

    private String relaBusiTable;

    private String relaBusiId;

    private String colName;

    private String busiId;

    private String appType;

    private String attachmentFileDesc;

    private String attrDesc;

    private String attrSize;

    private String attrType;

    private String attrVersion;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public PmsSysAttachment(String attId, String attExtid, String relaBusiTable, String relaBusiId, String colName, String busiId, String appType, String attachmentFileDesc, String attrDesc, String attrSize, String attrType, String attrVersion, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.attId = attId;
        this.attExtid = attExtid;
        this.relaBusiTable = relaBusiTable;
        this.relaBusiId = relaBusiId;
        this.colName = colName;
        this.busiId = busiId;
        this.appType = appType;
        this.attachmentFileDesc = attachmentFileDesc;
        this.attrDesc = attrDesc;
        this.attrSize = attrSize;
        this.attrType = attrType;
        this.attrVersion = attrVersion;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public PmsSysAttachment() {
        super();
    }

    public String getAttId() {
        return attId;
    }

    public void setAttId(String attId) {
        this.attId = attId == null ? null : attId.trim();
    }

    public String getAttExtid() {
        return attExtid;
    }

    public void setAttExtid(String attExtid) {
        this.attExtid = attExtid == null ? null : attExtid.trim();
    }

    public String getRelaBusiTable() {
        return relaBusiTable;
    }

    public void setRelaBusiTable(String relaBusiTable) {
        this.relaBusiTable = relaBusiTable == null ? null : relaBusiTable.trim();
    }

    public String getRelaBusiId() {
        return relaBusiId;
    }

    public void setRelaBusiId(String relaBusiId) {
        this.relaBusiId = relaBusiId == null ? null : relaBusiId.trim();
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName == null ? null : colName.trim();
    }

    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId == null ? null : busiId.trim();
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    public String getAttachmentFileDesc() {
        return attachmentFileDesc;
    }

    public void setAttachmentFileDesc(String attachmentFileDesc) {
        this.attachmentFileDesc = attachmentFileDesc == null ? null : attachmentFileDesc.trim();
    }

    public String getAttrDesc() {
        return attrDesc;
    }

    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc == null ? null : attrDesc.trim();
    }

    public String getAttrSize() {
        return attrSize;
    }

    public void setAttrSize(String attrSize) {
        this.attrSize = attrSize == null ? null : attrSize.trim();
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType == null ? null : attrType.trim();
    }

    public String getAttrVersion() {
        return attrVersion;
    }

    public void setAttrVersion(String attrVersion) {
        this.attrVersion = attrVersion == null ? null : attrVersion.trim();
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