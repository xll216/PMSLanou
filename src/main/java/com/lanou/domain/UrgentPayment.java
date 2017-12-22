package com.lanou.domain;

import java.math.BigDecimal;
import java.util.Date;

public class UrgentPayment {
    private String urgpaymentId;

    private String projName;

    private String supplier;

    private BigDecimal payFee;

    private String payReason;

    private String remark;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    private String deptManager;

    public UrgentPayment(String urgpaymentId, String projName, String supplier, BigDecimal payFee, String payReason, String remark, String effectFlag, String createStaffNo, String createStaffName, Date createDate, String deptManager) {
        this.urgpaymentId = urgpaymentId;
        this.projName = projName;
        this.supplier = supplier;
        this.payFee = payFee;
        this.payReason = payReason;
        this.remark = remark;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
        this.deptManager = deptManager;
    }

    public UrgentPayment() {
        super();
    }

    public String getUrgpaymentId() {
        return urgpaymentId;
    }

    public void setUrgpaymentId(String urgpaymentId) {
        this.urgpaymentId = urgpaymentId == null ? null : urgpaymentId.trim();
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName == null ? null : projName.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public String getPayReason() {
        return payReason;
    }

    public void setPayReason(String payReason) {
        this.payReason = payReason == null ? null : payReason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getDeptManager() {
        return deptManager;
    }

    public void setDeptManager(String deptManager) {
        this.deptManager = deptManager == null ? null : deptManager.trim();
    }
}