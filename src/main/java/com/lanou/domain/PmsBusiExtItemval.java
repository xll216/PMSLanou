package com.lanou.domain;

public class PmsBusiExtItemval {
    private String extitemvalId;

    private String extItemId;

    private Integer valSn;

    private String extitemVal;

    public PmsBusiExtItemval(String extitemvalId, String extItemId, Integer valSn, String extitemVal) {
        this.extitemvalId = extitemvalId;
        this.extItemId = extItemId;
        this.valSn = valSn;
        this.extitemVal = extitemVal;
    }

    public PmsBusiExtItemval() {
        super();
    }

    public String getExtitemvalId() {
        return extitemvalId;
    }

    public void setExtitemvalId(String extitemvalId) {
        this.extitemvalId = extitemvalId == null ? null : extitemvalId.trim();
    }

    public String getExtItemId() {
        return extItemId;
    }

    public void setExtItemId(String extItemId) {
        this.extItemId = extItemId == null ? null : extItemId.trim();
    }

    public Integer getValSn() {
        return valSn;
    }

    public void setValSn(Integer valSn) {
        this.valSn = valSn;
    }

    public String getExtitemVal() {
        return extitemVal;
    }

    public void setExtitemVal(String extitemVal) {
        this.extitemVal = extitemVal == null ? null : extitemVal.trim();
    }
}