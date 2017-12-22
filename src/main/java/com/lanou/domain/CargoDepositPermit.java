package com.lanou.domain;

import java.util.Date;

public class CargoDepositPermit {
    private String depositId;

    private String depositType;

    private String addr;

    private String depositAddrType;

    private Date depositBegDate;

    private Date depositEndDate;

    private String plantId;

    private String roomId;

    private String depositDesc;

    private String depositReq;

    private String nucsafeReq;

    private String radiprotReq;

    private String existNucsafeFacility;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    private String isCon;

    public CargoDepositPermit(String depositId, String depositType, String addr, String depositAddrType, Date depositBegDate, Date depositEndDate, String plantId, String roomId, String depositDesc, String depositReq, String nucsafeReq, String radiprotReq, String existNucsafeFacility, String effectFlag, String createStaffNo, String createStaffName, Date createDate, String isCon) {
        this.depositId = depositId;
        this.depositType = depositType;
        this.addr = addr;
        this.depositAddrType = depositAddrType;
        this.depositBegDate = depositBegDate;
        this.depositEndDate = depositEndDate;
        this.plantId = plantId;
        this.roomId = roomId;
        this.depositDesc = depositDesc;
        this.depositReq = depositReq;
        this.nucsafeReq = nucsafeReq;
        this.radiprotReq = radiprotReq;
        this.existNucsafeFacility = existNucsafeFacility;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
        this.isCon = isCon;
    }

    public CargoDepositPermit() {
        super();
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId == null ? null : depositId.trim();
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType == null ? null : depositType.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getDepositAddrType() {
        return depositAddrType;
    }

    public void setDepositAddrType(String depositAddrType) {
        this.depositAddrType = depositAddrType == null ? null : depositAddrType.trim();
    }

    public Date getDepositBegDate() {
        return depositBegDate;
    }

    public void setDepositBegDate(Date depositBegDate) {
        this.depositBegDate = depositBegDate;
    }

    public Date getDepositEndDate() {
        return depositEndDate;
    }

    public void setDepositEndDate(Date depositEndDate) {
        this.depositEndDate = depositEndDate;
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId == null ? null : plantId.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getDepositDesc() {
        return depositDesc;
    }

    public void setDepositDesc(String depositDesc) {
        this.depositDesc = depositDesc == null ? null : depositDesc.trim();
    }

    public String getDepositReq() {
        return depositReq;
    }

    public void setDepositReq(String depositReq) {
        this.depositReq = depositReq == null ? null : depositReq.trim();
    }

    public String getNucsafeReq() {
        return nucsafeReq;
    }

    public void setNucsafeReq(String nucsafeReq) {
        this.nucsafeReq = nucsafeReq == null ? null : nucsafeReq.trim();
    }

    public String getRadiprotReq() {
        return radiprotReq;
    }

    public void setRadiprotReq(String radiprotReq) {
        this.radiprotReq = radiprotReq == null ? null : radiprotReq.trim();
    }

    public String getExistNucsafeFacility() {
        return existNucsafeFacility;
    }

    public void setExistNucsafeFacility(String existNucsafeFacility) {
        this.existNucsafeFacility = existNucsafeFacility == null ? null : existNucsafeFacility.trim();
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

    public String getIsCon() {
        return isCon;
    }

    public void setIsCon(String isCon) {
        this.isCon = isCon == null ? null : isCon.trim();
    }
}