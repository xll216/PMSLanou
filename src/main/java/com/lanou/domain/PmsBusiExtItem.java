package com.lanou.domain;

/**
 * 业务扩展项的卡片
 **/
public class PmsBusiExtItem {
    private String extItemId;//扩展对象标识

    private String busiTable;//关联表名称

    private String busiId;//关联业务标识 = 项目基本标识  外健

    private String extType;//扩展类型

    private String extPropCode;//扩展属性码

    private String extPropValue;//扩展属性值

    private String remark;//备注

    private String multicheckFlag;//是否多选

    private String checkFlag;//是否选中

    public PmsBusiExtItem(String extItemId, String busiTable, String busiId, String extType, String extPropCode, String extPropValue, String remark, String multicheckFlag, String checkFlag) {
        this.extItemId = extItemId;
        this.busiTable = busiTable;
        this.busiId = busiId;
        this.extType = extType;
        this.extPropCode = extPropCode;
        this.extPropValue = extPropValue;
        this.remark = remark;
        this.multicheckFlag = multicheckFlag;
        this.checkFlag = checkFlag;
    }

    public PmsBusiExtItem() {
        super();
    }

    public String getExtItemId() {
        return extItemId;
    }

    public void setExtItemId(String extItemId) {
        this.extItemId = extItemId == null ? null : extItemId.trim();
    }

    public String getBusiTable() {
        return busiTable;
    }

    public void setBusiTable(String busiTable) {
        this.busiTable = busiTable == null ? null : busiTable.trim();
    }

    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId == null ? null : busiId.trim();
    }

    public String getExtType() {
        return extType;
    }

    public void setExtType(String extType) {
        this.extType = extType == null ? null : extType.trim();
    }

    public String getExtPropCode() {
        return extPropCode;
    }

    public void setExtPropCode(String extPropCode) {
        this.extPropCode = extPropCode == null ? null : extPropCode.trim();
    }

    public String getExtPropValue() {
        return extPropValue;
    }

    public void setExtPropValue(String extPropValue) {
        this.extPropValue = extPropValue == null ? null : extPropValue.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMulticheckFlag() {
        return multicheckFlag;
    }

    public void setMulticheckFlag(String multicheckFlag) {
        this.multicheckFlag = multicheckFlag == null ? null : multicheckFlag.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    @Override
    public String toString() {
        return "PmsBusiExtItem{" +
                "extItemId='" + extItemId + '\'' +
                ", busiTable='" + busiTable + '\'' +
                ", busiId='" + busiId + '\'' +
                ", extType='" + extType + '\'' +
                ", extPropCode='" + extPropCode + '\'' +
                ", extPropValue='" + extPropValue + '\'' +
                ", remark='" + remark + '\'' +
                ", multicheckFlag='" + multicheckFlag + '\'' +
                ", checkFlag='" + checkFlag + '\'' +
                '}';
    }
}