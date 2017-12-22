package com.lanou.domain;

import java.math.BigDecimal;
import java.util.Date;

public class GuaranteePermit {
    private String guaranteeId;

    private String contractName;

    private String contractNo;

    private String supplier;

    private String phone;

    private String supplierBankName;

    private String swiftbic;

    private String supplierBankAddr;

    private String supplierBankPhone;

    private String currencyType;

    private BigDecimal lowercaseFee;

    private String uppercaseFee;

    private String otherReq;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    public GuaranteePermit(String guaranteeId, String contractName, String contractNo, String supplier, String phone, String supplierBankName, String swiftbic, String supplierBankAddr, String supplierBankPhone, String currencyType, BigDecimal lowercaseFee, String uppercaseFee, String otherReq, String effectFlag, String createStaffNo, String createStaffName, Date createDate) {
        this.guaranteeId = guaranteeId;
        this.contractName = contractName;
        this.contractNo = contractNo;
        this.supplier = supplier;
        this.phone = phone;
        this.supplierBankName = supplierBankName;
        this.swiftbic = swiftbic;
        this.supplierBankAddr = supplierBankAddr;
        this.supplierBankPhone = supplierBankPhone;
        this.currencyType = currencyType;
        this.lowercaseFee = lowercaseFee;
        this.uppercaseFee = uppercaseFee;
        this.otherReq = otherReq;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public GuaranteePermit() {
        super();
    }

    public String getGuaranteeId() {
        return guaranteeId;
    }

    public void setGuaranteeId(String guaranteeId) {
        this.guaranteeId = guaranteeId == null ? null : guaranteeId.trim();
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSupplierBankName() {
        return supplierBankName;
    }

    public void setSupplierBankName(String supplierBankName) {
        this.supplierBankName = supplierBankName == null ? null : supplierBankName.trim();
    }

    public String getSwiftbic() {
        return swiftbic;
    }

    public void setSwiftbic(String swiftbic) {
        this.swiftbic = swiftbic == null ? null : swiftbic.trim();
    }

    public String getSupplierBankAddr() {
        return supplierBankAddr;
    }

    public void setSupplierBankAddr(String supplierBankAddr) {
        this.supplierBankAddr = supplierBankAddr == null ? null : supplierBankAddr.trim();
    }

    public String getSupplierBankPhone() {
        return supplierBankPhone;
    }

    public void setSupplierBankPhone(String supplierBankPhone) {
        this.supplierBankPhone = supplierBankPhone == null ? null : supplierBankPhone.trim();
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    public BigDecimal getLowercaseFee() {
        return lowercaseFee;
    }

    public void setLowercaseFee(BigDecimal lowercaseFee) {
        this.lowercaseFee = lowercaseFee;
    }

    public String getUppercaseFee() {
        return uppercaseFee;
    }

    public void setUppercaseFee(String uppercaseFee) {
        this.uppercaseFee = uppercaseFee == null ? null : uppercaseFee.trim();
    }

    public String getOtherReq() {
        return otherReq;
    }

    public void setOtherReq(String otherReq) {
        this.otherReq = otherReq == null ? null : otherReq.trim();
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