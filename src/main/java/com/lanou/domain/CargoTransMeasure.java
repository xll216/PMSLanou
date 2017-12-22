package com.lanou.domain;

public class CargoTransMeasure {
    private String measureId;

    private String transPertId;

    private String packageCondition;

    private String cargoName;

    private String surfaceConcType;

    private String cargopackageConc;

    public CargoTransMeasure(String measureId, String transPertId, String packageCondition, String cargoName, String surfaceConcType, String cargopackageConc) {
        this.measureId = measureId;
        this.transPertId = transPertId;
        this.packageCondition = packageCondition;
        this.cargoName = cargoName;
        this.surfaceConcType = surfaceConcType;
        this.cargopackageConc = cargopackageConc;
    }

    public CargoTransMeasure() {
        super();
    }

    public String getMeasureId() {
        return measureId;
    }

    public void setMeasureId(String measureId) {
        this.measureId = measureId == null ? null : measureId.trim();
    }

    public String getTransPertId() {
        return transPertId;
    }

    public void setTransPertId(String transPertId) {
        this.transPertId = transPertId == null ? null : transPertId.trim();
    }

    public String getPackageCondition() {
        return packageCondition;
    }

    public void setPackageCondition(String packageCondition) {
        this.packageCondition = packageCondition == null ? null : packageCondition.trim();
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName == null ? null : cargoName.trim();
    }

    public String getSurfaceConcType() {
        return surfaceConcType;
    }

    public void setSurfaceConcType(String surfaceConcType) {
        this.surfaceConcType = surfaceConcType == null ? null : surfaceConcType.trim();
    }

    public String getCargopackageConc() {
        return cargopackageConc;
    }

    public void setCargopackageConc(String cargopackageConc) {
        this.cargopackageConc = cargopackageConc == null ? null : cargopackageConc.trim();
    }
}