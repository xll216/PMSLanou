package com.lanou.domain;

public class FireProtectiveDetail {
    private String detailId;

    private String firepId;

    private String protectiveNo;

    private String pathOne;

    private String pathTwo;

    private String protectiveType;

    private String fireBorderFlag;

    public FireProtectiveDetail(String detailId, String firepId, String protectiveNo, String pathOne, String pathTwo, String protectiveType, String fireBorderFlag) {
        this.detailId = detailId;
        this.firepId = firepId;
        this.protectiveNo = protectiveNo;
        this.pathOne = pathOne;
        this.pathTwo = pathTwo;
        this.protectiveType = protectiveType;
        this.fireBorderFlag = fireBorderFlag;
    }

    public FireProtectiveDetail() {
        super();
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    public String getFirepId() {
        return firepId;
    }

    public void setFirepId(String firepId) {
        this.firepId = firepId == null ? null : firepId.trim();
    }

    public String getProtectiveNo() {
        return protectiveNo;
    }

    public void setProtectiveNo(String protectiveNo) {
        this.protectiveNo = protectiveNo == null ? null : protectiveNo.trim();
    }

    public String getPathOne() {
        return pathOne;
    }

    public void setPathOne(String pathOne) {
        this.pathOne = pathOne == null ? null : pathOne.trim();
    }

    public String getPathTwo() {
        return pathTwo;
    }

    public void setPathTwo(String pathTwo) {
        this.pathTwo = pathTwo == null ? null : pathTwo.trim();
    }

    public String getProtectiveType() {
        return protectiveType;
    }

    public void setProtectiveType(String protectiveType) {
        this.protectiveType = protectiveType == null ? null : protectiveType.trim();
    }

    public String getFireBorderFlag() {
        return fireBorderFlag;
    }

    public void setFireBorderFlag(String fireBorderFlag) {
        this.fireBorderFlag = fireBorderFlag == null ? null : fireBorderFlag.trim();
    }
}