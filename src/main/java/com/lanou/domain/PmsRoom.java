package com.lanou.domain;

import java.util.Date;

public class PmsRoom {
    private String roomId;

    private String plantId;

    private String roomName;

    private String roomAddr;

    private String fireDensity;

    private String effectFlag;

    private String createStaffNo;

    private String createStaffName;

    private Date createDate;

    private String macNo;

    public PmsRoom(String roomId, String plantId, String roomName, String roomAddr, String fireDensity, String effectFlag, String createStaffNo, String createStaffName, Date createDate, String macNo) {
        this.roomId = roomId;
        this.plantId = plantId;
        this.roomName = roomName;
        this.roomAddr = roomAddr;
        this.fireDensity = fireDensity;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
        this.macNo = macNo;
    }

    public PmsRoom() {
        super();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId == null ? null : plantId.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomAddr() {
        return roomAddr;
    }

    public void setRoomAddr(String roomAddr) {
        this.roomAddr = roomAddr == null ? null : roomAddr.trim();
    }

    public String getFireDensity() {
        return fireDensity;
    }

    public void setFireDensity(String fireDensity) {
        this.fireDensity = fireDensity == null ? null : fireDensity.trim();
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

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo == null ? null : macNo.trim();
    }
}