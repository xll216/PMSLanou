package com.lanou.domain;

import java.math.BigDecimal;
import java.util.Date;

public class RdmsProjBase {
    private String projId;

    private String projName;

    private String projType;

    private String appOrgNo;

    private String appOrgName;

    private String uniteAppOrgNo;

    private String uniteAppOrgName;

    private BigDecimal cycle;

    private BigDecimal totalBudget;

    private String purpose;

    private String safeDesc;

    private String reliableDesc;

    private String econDesc;

    private String otherDesc;

    private String achievementDesc;

    private String realUser;

    private String potentialUser;

    private String content;

    private String primeStaffNo;

    private String primeUserDesc;

    private String rightDesc;

    private String benefitsDesc;

    private String fixedAssets;

    private String acceptStand;

    private String engineerEvaluate;

    private String accordEvaluate;

    private String applicationEvaluate;

    private String totalEvaluate;

    private String pmsRequire;

    private String advice;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public RdmsProjBase(String projId, String projName, String projType, String appOrgNo, String appOrgName, String uniteAppOrgNo, String uniteAppOrgName, BigDecimal cycle, BigDecimal totalBudget, String purpose, String safeDesc, String reliableDesc, String econDesc, String otherDesc, String achievementDesc, String realUser, String potentialUser, String content, String primeStaffNo, String primeUserDesc, String rightDesc, String benefitsDesc, String fixedAssets, String acceptStand, String engineerEvaluate, String accordEvaluate, String applicationEvaluate, String totalEvaluate, String pmsRequire, String advice, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.projId = projId;
        this.projName = projName;
        this.projType = projType;
        this.appOrgNo = appOrgNo;
        this.appOrgName = appOrgName;
        this.uniteAppOrgNo = uniteAppOrgNo;
        this.uniteAppOrgName = uniteAppOrgName;
        this.cycle = cycle;
        this.totalBudget = totalBudget;
        this.purpose = purpose;
        this.safeDesc = safeDesc;
        this.reliableDesc = reliableDesc;
        this.econDesc = econDesc;
        this.otherDesc = otherDesc;
        this.achievementDesc = achievementDesc;
        this.realUser = realUser;
        this.potentialUser = potentialUser;
        this.content = content;
        this.primeStaffNo = primeStaffNo;
        this.primeUserDesc = primeUserDesc;
        this.rightDesc = rightDesc;
        this.benefitsDesc = benefitsDesc;
        this.fixedAssets = fixedAssets;
        this.acceptStand = acceptStand;
        this.engineerEvaluate = engineerEvaluate;
        this.accordEvaluate = accordEvaluate;
        this.applicationEvaluate = applicationEvaluate;
        this.totalEvaluate = totalEvaluate;
        this.pmsRequire = pmsRequire;
        this.advice = advice;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public RdmsProjBase() {
        super();
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId == null ? null : projId.trim();
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName == null ? null : projName.trim();
    }

    public String getProjType() {
        return projType;
    }

    public void setProjType(String projType) {
        this.projType = projType == null ? null : projType.trim();
    }

    public String getAppOrgNo() {
        return appOrgNo;
    }

    public void setAppOrgNo(String appOrgNo) {
        this.appOrgNo = appOrgNo == null ? null : appOrgNo.trim();
    }

    public String getAppOrgName() {
        return appOrgName;
    }

    public void setAppOrgName(String appOrgName) {
        this.appOrgName = appOrgName == null ? null : appOrgName.trim();
    }

    public String getUniteAppOrgNo() {
        return uniteAppOrgNo;
    }

    public void setUniteAppOrgNo(String uniteAppOrgNo) {
        this.uniteAppOrgNo = uniteAppOrgNo == null ? null : uniteAppOrgNo.trim();
    }

    public String getUniteAppOrgName() {
        return uniteAppOrgName;
    }

    public void setUniteAppOrgName(String uniteAppOrgName) {
        this.uniteAppOrgName = uniteAppOrgName == null ? null : uniteAppOrgName.trim();
    }

    public BigDecimal getCycle() {
        return cycle;
    }

    public void setCycle(BigDecimal cycle) {
        this.cycle = cycle;
    }

    public BigDecimal getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(BigDecimal totalBudget) {
        this.totalBudget = totalBudget;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getSafeDesc() {
        return safeDesc;
    }

    public void setSafeDesc(String safeDesc) {
        this.safeDesc = safeDesc == null ? null : safeDesc.trim();
    }

    public String getReliableDesc() {
        return reliableDesc;
    }

    public void setReliableDesc(String reliableDesc) {
        this.reliableDesc = reliableDesc == null ? null : reliableDesc.trim();
    }

    public String getEconDesc() {
        return econDesc;
    }

    public void setEconDesc(String econDesc) {
        this.econDesc = econDesc == null ? null : econDesc.trim();
    }

    public String getOtherDesc() {
        return otherDesc;
    }

    public void setOtherDesc(String otherDesc) {
        this.otherDesc = otherDesc == null ? null : otherDesc.trim();
    }

    public String getAchievementDesc() {
        return achievementDesc;
    }

    public void setAchievementDesc(String achievementDesc) {
        this.achievementDesc = achievementDesc == null ? null : achievementDesc.trim();
    }

    public String getRealUser() {
        return realUser;
    }

    public void setRealUser(String realUser) {
        this.realUser = realUser == null ? null : realUser.trim();
    }

    public String getPotentialUser() {
        return potentialUser;
    }

    public void setPotentialUser(String potentialUser) {
        this.potentialUser = potentialUser == null ? null : potentialUser.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPrimeStaffNo() {
        return primeStaffNo;
    }

    public void setPrimeStaffNo(String primeStaffNo) {
        this.primeStaffNo = primeStaffNo == null ? null : primeStaffNo.trim();
    }

    public String getPrimeUserDesc() {
        return primeUserDesc;
    }

    public void setPrimeUserDesc(String primeUserDesc) {
        this.primeUserDesc = primeUserDesc == null ? null : primeUserDesc.trim();
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

    public String getAcceptStand() {
        return acceptStand;
    }

    public void setAcceptStand(String acceptStand) {
        this.acceptStand = acceptStand == null ? null : acceptStand.trim();
    }

    public String getEngineerEvaluate() {
        return engineerEvaluate;
    }

    public void setEngineerEvaluate(String engineerEvaluate) {
        this.engineerEvaluate = engineerEvaluate == null ? null : engineerEvaluate.trim();
    }

    public String getAccordEvaluate() {
        return accordEvaluate;
    }

    public void setAccordEvaluate(String accordEvaluate) {
        this.accordEvaluate = accordEvaluate == null ? null : accordEvaluate.trim();
    }

    public String getApplicationEvaluate() {
        return applicationEvaluate;
    }

    public void setApplicationEvaluate(String applicationEvaluate) {
        this.applicationEvaluate = applicationEvaluate == null ? null : applicationEvaluate.trim();
    }

    public String getTotalEvaluate() {
        return totalEvaluate;
    }

    public void setTotalEvaluate(String totalEvaluate) {
        this.totalEvaluate = totalEvaluate == null ? null : totalEvaluate.trim();
    }

    public String getPmsRequire() {
        return pmsRequire;
    }

    public void setPmsRequire(String pmsRequire) {
        this.pmsRequire = pmsRequire == null ? null : pmsRequire.trim();
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
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