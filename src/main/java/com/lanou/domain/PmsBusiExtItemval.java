package com.lanou.domain;

/**
 * 属性扩展值的卡片
 **/
public class PmsBusiExtItemval {
    private String extitemvalId;//属性扩展值标识

    private String extItemId;//扩展对象标识 外健

    private Integer valSn;//序号

    private String extitemVal;//属性值

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

    @Override
    public String toString() {
        return "PmsBusiExtItemval{" +
                "extitemvalId='" + extitemvalId + '\'' +
                ", extItemId='" + extItemId + '\'' +
                ", valSn=" + valSn +
                ", extitemVal='" + extitemVal + '\'' +
                '}';
    }
}