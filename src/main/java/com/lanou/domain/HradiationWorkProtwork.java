package com.lanou.domain;

public class HradiationWorkProtwork {
    private String hradiId;

    private String protworkId;

    private String preYMeter;

    private String preNeutronMeter;

    private String preCollectiveMeter;

    private String prePersonalMaxmeter;

    private String maxYMeter;

    private String maxNeutronMeter;

    private String adjustMeterFlag;

    private String protMeasure;

    public HradiationWorkProtwork(String hradiId, String protworkId, String preYMeter, String preNeutronMeter, String preCollectiveMeter, String prePersonalMaxmeter, String maxYMeter, String maxNeutronMeter, String adjustMeterFlag, String protMeasure) {
        this.hradiId = hradiId;
        this.protworkId = protworkId;
        this.preYMeter = preYMeter;
        this.preNeutronMeter = preNeutronMeter;
        this.preCollectiveMeter = preCollectiveMeter;
        this.prePersonalMaxmeter = prePersonalMaxmeter;
        this.maxYMeter = maxYMeter;
        this.maxNeutronMeter = maxNeutronMeter;
        this.adjustMeterFlag = adjustMeterFlag;
        this.protMeasure = protMeasure;
    }

    public HradiationWorkProtwork() {
        super();
    }

    public String getHradiId() {
        return hradiId;
    }

    public void setHradiId(String hradiId) {
        this.hradiId = hradiId == null ? null : hradiId.trim();
    }

    public String getProtworkId() {
        return protworkId;
    }

    public void setProtworkId(String protworkId) {
        this.protworkId = protworkId == null ? null : protworkId.trim();
    }

    public String getPreYMeter() {
        return preYMeter;
    }

    public void setPreYMeter(String preYMeter) {
        this.preYMeter = preYMeter == null ? null : preYMeter.trim();
    }

    public String getPreNeutronMeter() {
        return preNeutronMeter;
    }

    public void setPreNeutronMeter(String preNeutronMeter) {
        this.preNeutronMeter = preNeutronMeter == null ? null : preNeutronMeter.trim();
    }

    public String getPreCollectiveMeter() {
        return preCollectiveMeter;
    }

    public void setPreCollectiveMeter(String preCollectiveMeter) {
        this.preCollectiveMeter = preCollectiveMeter == null ? null : preCollectiveMeter.trim();
    }

    public String getPrePersonalMaxmeter() {
        return prePersonalMaxmeter;
    }

    public void setPrePersonalMaxmeter(String prePersonalMaxmeter) {
        this.prePersonalMaxmeter = prePersonalMaxmeter == null ? null : prePersonalMaxmeter.trim();
    }

    public String getMaxYMeter() {
        return maxYMeter;
    }

    public void setMaxYMeter(String maxYMeter) {
        this.maxYMeter = maxYMeter == null ? null : maxYMeter.trim();
    }

    public String getMaxNeutronMeter() {
        return maxNeutronMeter;
    }

    public void setMaxNeutronMeter(String maxNeutronMeter) {
        this.maxNeutronMeter = maxNeutronMeter == null ? null : maxNeutronMeter.trim();
    }

    public String getAdjustMeterFlag() {
        return adjustMeterFlag;
    }

    public void setAdjustMeterFlag(String adjustMeterFlag) {
        this.adjustMeterFlag = adjustMeterFlag == null ? null : adjustMeterFlag.trim();
    }

    public String getProtMeasure() {
        return protMeasure;
    }

    public void setProtMeasure(String protMeasure) {
        this.protMeasure = protMeasure == null ? null : protMeasure.trim();
    }
}