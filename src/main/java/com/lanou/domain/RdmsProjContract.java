package com.lanou.domain;

import java.util.Date;

/**
 * 项目合同信息的卡片
 **/
public class RdmsProjContract {
    private String contractId;//合同标识

    private String projId;//项目基本标识 外健

    private String contractNo;//合同编号

    private String contractName;//合同名称

    private String oppDesc;//对方描述

    private Date contractBeginDate;//合同开始日期

    private Date contractEndDate;//合同止日期

    private String rightDesc;//产权说明

    private String benefitsDesc;//经济效益

    private String fixedAssets;//固定资产

    private String contractRunDesc;//合同运作情况说明

    private String achievementDesc;//成果应用

    private String contractSigntory;//推荐合同签署人

    private String effectFlag;//是否有效

    private String createStaffNo;//创建人

    private String createStaffName;//创建人姓名

    private Date createDate;//创建时间

    public RdmsProjContract(String contractId, String projId, String contractNo, String contractName, String oppDesc, Date contractBeginDate, Date contractEndDate, String rightDesc, String benefitsDesc, String fixedAssets, String contractRunDesc, String achievementDesc, String contractSigntory, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.contractId = contractId;
        this.projId = projId;
        this.contractNo = contractNo;
        this.contractName = contractName;
        this.oppDesc = oppDesc;
        this.contractBeginDate = contractBeginDate;
        this.contractEndDate = contractEndDate;
        this.rightDesc = rightDesc;
        this.benefitsDesc = benefitsDesc;
        this.fixedAssets = fixedAssets;
        this.contractRunDesc = contractRunDesc;
        this.achievementDesc = achievementDesc;
        this.contractSigntory = contractSigntory;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public RdmsProjContract() {
        super();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId == null ? null : projId.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public String getOppDesc() {
        return oppDesc;
    }

    public void setOppDesc(String oppDesc) {
        this.oppDesc = oppDesc == null ? null : oppDesc.trim();
    }

    public Date getContractBeginDate() {
        return contractBeginDate;
    }

    public void setContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getRightDesc() {
        return rightDesc;
    }

    public void setRightDesc(String rightDesc) {
        this.rightDesc = rightDesc == null ? null : rightDesc.trim();
    }

    public String getBenefitsDesc() {
        return benefitsDesc;
    }

    public void setBenefitsDesc(String benefitsDesc) {
        this.benefitsDesc = benefitsDesc == null ? null : benefitsDesc.trim();
    }

    public String getFixedAssets() {
        return fixedAssets;
    }

    public void setFixedAssets(String fixedAssets) {
        this.fixedAssets = fixedAssets == null ? null : fixedAssets.trim();
    }

    public String getContractRunDesc() {
        return contractRunDesc;
    }

    public void setContractRunDesc(String contractRunDesc) {
        this.contractRunDesc = contractRunDesc == null ? null : contractRunDesc.trim();
    }

    public String getAchievementDesc() {
        return achievementDesc;
    }

    public void setAchievementDesc(String achievementDesc) {
        this.achievementDesc = achievementDesc == null ? null : achievementDesc.trim();
    }

    public String getContractSigntory() {
        return contractSigntory;
    }

    public void setContractSigntory(String contractSigntory) {
        this.contractSigntory = contractSigntory == null ? null : contractSigntory.trim();
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

    @Override
    public String toString() {
        return "RdmsProjContract{" +
                "contractId='" + contractId + '\'' +
                ", projId='" + projId + '\'' +
                ", contractNo='" + contractNo + '\'' +
                ", contractName='" + contractName + '\'' +
                ", oppDesc='" + oppDesc + '\'' +
                ", contractBeginDate=" + contractBeginDate +
                ", contractEndDate=" + contractEndDate +
                ", rightDesc='" + rightDesc + '\'' +
                ", benefitsDesc='" + benefitsDesc + '\'' +
                ", fixedAssets='" + fixedAssets + '\'' +
                ", contractRunDesc='" + contractRunDesc + '\'' +
                ", achievementDesc='" + achievementDesc + '\'' +
                ", contractSigntory='" + contractSigntory + '\'' +
                ", effectFlag='" + effectFlag + '\'' +
                ", createStaffNo='" + createStaffNo + '\'' +
                ", createStaffName='" + createStaffName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}