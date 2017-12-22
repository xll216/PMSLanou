package com.lanou.domain;

import java.util.Date;

public class CargoDepositDetail {
    private String cargodepDetailId;

    private String depositId;

    private String cargoName;

    private String cargoCode;

    private String countDesc;

    private String characterDesc;

    private String measure;

    private String quality;

    private String heatValue;

    private String roomArea;

    private String fireDensity;

    private Date createDate;

    public CargoDepositDetail(String cargodepDetailId, String depositId, String cargoName, String cargoCode, String countDesc, String characterDesc, String measure, String quality, String heatValue, String roomArea, String fireDensity, Date createDate) {
        this.cargodepDetailId = cargodepDetailId;
        this.depositId = depositId;
        this.cargoName = cargoName;
        this.cargoCode = cargoCode;
        this.countDesc = countDesc;
        this.characterDesc = characterDesc;
        this.measure = measure;
        this.quality = quality;
        this.heatValue = heatValue;
        this.roomArea = roomArea;
        this.fireDensity = fireDensity;
        this.createDate = createDate;
    }

    public CargoDepositDetail() {
        super();
    }

    public String getCargodepDetailId() {
        return cargodepDetailId;
    }

    public void setCargodepDetailId(String cargodepDetailId) {
        this.cargodepDetailId = cargodepDetailId == null ? null : cargodepDetailId.trim();
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId == null ? null : depositId.trim();
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName == null ? null : cargoName.trim();
    }

    public String getCargoCode() {
        return cargoCode;
    }

    public void setCargoCode(String cargoCode) {
        this.cargoCode = cargoCode == null ? null : cargoCode.trim();
    }

    public String getCountDesc() {
        return countDesc;
    }

    public void setCountDesc(String countDesc) {
        this.countDesc = countDesc == null ? null : countDesc.trim();
    }

    public String getCharacterDesc() {
        return characterDesc;
    }

    public void setCharacterDesc(String characterDesc) {
        this.characterDesc = characterDesc == null ? null : characterDesc.trim();
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    public String getHeatValue() {
        return heatValue;
    }

    public void setHeatValue(String heatValue) {
        this.heatValue = heatValue == null ? null : heatValue.trim();
    }

    public String getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(String roomArea) {
        this.roomArea = roomArea == null ? null : roomArea.trim();
    }

    public String getFireDensity() {
        return fireDensity;
    }

    public void setFireDensity(String fireDensity) {
        this.fireDensity = fireDensity == null ? null : fireDensity.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}