package com.lanou.result;

import com.lanou.domain.PMSBaseStaff;
import com.lanou.domain.SysBusiAttachment;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class ProjectApplyBean {

    /**
     * projName : 业务流程管理平台
     * appOrgNo : 3
     * uniteAppOrgNo : 2
     * purpose : 建设科管理系统
     * safeDesc : 系统安全
     * reliableDesc : 三重保障
     * econDesc : 提高办公效率
     * otherDesc : 2016建设需要
     * achievementDesc : 蓝鸥测试数据
     * realUser : 蓝鸥测试数据
     * potentialUser : 蓝鸥测试数据
     * cycle : 10
     * content : 蓝鸥测试数据
     * totalBudget : 1200.00
     * budgetFee1 : 1200.00
     * budgetFee2 : 1200.00
     * budgetFee3 : 1200.00
     * primeUserDesc : 蓝鸥测试数据
     * projType : cb01,cb03
     * rightDesc : 蓝鸥测试数据
     * benefitsDesc : 蓝鸥测试数据
     * fixedAssets : 蓝鸥测试数据
     * acceptStand : 蓝鸥测试数据
     * projFile : C:\fakepath\idea.png
     * staffNo : 3
     */

    private String projName;
    private String appOrgNo;
    private String uniteAppOrgNo;
    private String purpose;
    private String safeDesc;
    private String reliableDesc;
    private String econDesc;
    private String otherDesc;
    private String achievementDesc;
    private String realUser;
    private String potentialUser;
    private String cycle;
    private String content;
    private String totalBudget;
    private String budgetFee1;
    private String budgetFee2;
    private String budgetFee3;
    private String primeUserDesc;
    private String projType;
    private String rightDesc;
    private String benefitsDesc;
    private String fixedAssets;
    private String acceptStand;
    private String projFile;
    private String staffNo;

    private PMSBaseStaff loginStaff;//当前登录用户

    private SysBusiAttachment attachment;//附件对象

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getAppOrgNo() {
        return appOrgNo;
    }

    public void setAppOrgNo(String appOrgNo) {
        this.appOrgNo = appOrgNo;
    }

    public String getUniteAppOrgNo() {
        return uniteAppOrgNo;
    }

    public void setUniteAppOrgNo(String uniteAppOrgNo) {
        this.uniteAppOrgNo = uniteAppOrgNo;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getSafeDesc() {
        return safeDesc;
    }

    public void setSafeDesc(String safeDesc) {
        this.safeDesc = safeDesc;
    }

    public String getReliableDesc() {
        return reliableDesc;
    }

    public void setReliableDesc(String reliableDesc) {
        this.reliableDesc = reliableDesc;
    }

    public String getEconDesc() {
        return econDesc;
    }

    public void setEconDesc(String econDesc) {
        this.econDesc = econDesc;
    }

    public String getOtherDesc() {
        return otherDesc;
    }

    public void setOtherDesc(String otherDesc) {
        this.otherDesc = otherDesc;
    }

    public String getAchievementDesc() {
        return achievementDesc;
    }

    public void setAchievementDesc(String achievementDesc) {
        this.achievementDesc = achievementDesc;
    }

    public String getRealUser() {
        return realUser;
    }

    public void setRealUser(String realUser) {
        this.realUser = realUser;
    }

    public String getPotentialUser() {
        return potentialUser;
    }

    public void setPotentialUser(String potentialUser) {
        this.potentialUser = potentialUser;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(String totalBudget) {
        this.totalBudget = totalBudget;
    }

    public String getBudgetFee1() {
        return budgetFee1;
    }

    public void setBudgetFee1(String budgetFee1) {
        this.budgetFee1 = budgetFee1;
    }

    public String getBudgetFee2() {
        return budgetFee2;
    }

    public void setBudgetFee2(String budgetFee2) {
        this.budgetFee2 = budgetFee2;
    }

    public String getBudgetFee3() {
        return budgetFee3;
    }

    public void setBudgetFee3(String budgetFee3) {
        this.budgetFee3 = budgetFee3;
    }

    public String getPrimeUserDesc() {
        return primeUserDesc;
    }

    public void setPrimeUserDesc(String primeUserDesc) {
        this.primeUserDesc = primeUserDesc;
    }

    public String getProjType() {
        return projType;
    }

    public void setProjType(String projType) {
        this.projType = projType;
    }

    public String getRightDesc() {
        return rightDesc;
    }

    public void setRightDesc(String rightDesc) {
        this.rightDesc = rightDesc;
    }

    public String getBenefitsDesc() {
        return benefitsDesc;
    }

    public void setBenefitsDesc(String benefitsDesc) {
        this.benefitsDesc = benefitsDesc;
    }

    public String getFixedAssets() {
        return fixedAssets;
    }

    public void setFixedAssets(String fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    public String getAcceptStand() {
        return acceptStand;
    }

    public void setAcceptStand(String acceptStand) {
        this.acceptStand = acceptStand;
    }

    public String getProjFile() {
        return projFile;
    }

    public void setProjFile(String projFile) {
        this.projFile = projFile;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public PMSBaseStaff getLoginStaff() {
        return loginStaff;
    }

    public void setLoginStaff(PMSBaseStaff loginStaff) {
        this.loginStaff = loginStaff;
    }

    public SysBusiAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(SysBusiAttachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "ProjectApplyBean{" +
                "projName='" + projName + '\'' +
                ", appOrgNo='" + appOrgNo + '\'' +
                ", uniteAppOrgNo='" + uniteAppOrgNo + '\'' +
                ", purpose='" + purpose + '\'' +
                ", safeDesc='" + safeDesc + '\'' +
                ", reliableDesc='" + reliableDesc + '\'' +
                ", econDesc='" + econDesc + '\'' +
                ", otherDesc='" + otherDesc + '\'' +
                ", achievementDesc='" + achievementDesc + '\'' +
                ", realUser='" + realUser + '\'' +
                ", potentialUser='" + potentialUser + '\'' +
                ", cycle='" + cycle + '\'' +
                ", content='" + content + '\'' +
                ", totalBudget='" + totalBudget + '\'' +
                ", budgetFee1='" + budgetFee1 + '\'' +
                ", budgetFee2='" + budgetFee2 + '\'' +
                ", budgetFee3='" + budgetFee3 + '\'' +
                ", primeUserDesc='" + primeUserDesc + '\'' +
                ", projType='" + projType + '\'' +
                ", rightDesc='" + rightDesc + '\'' +
                ", benefitsDesc='" + benefitsDesc + '\'' +
                ", fixedAssets='" + fixedAssets + '\'' +
                ", acceptStand='" + acceptStand + '\'' +
                ", projFile='" + projFile + '\'' +
                ", staffNo='" + staffNo + '\'' +
                '}';
    }
}

