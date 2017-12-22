package com.lanou.domain;

public class PmsFlowBusiRela {
    private String relaId;

    private String appId;

    private String relaBusiTable;

    private String relaBusiId;

    public PmsFlowBusiRela(String relaId, String appId, String relaBusiTable, String relaBusiId) {
        this.relaId = relaId;
        this.appId = appId;
        this.relaBusiTable = relaBusiTable;
        this.relaBusiId = relaBusiId;
    }

    public PmsFlowBusiRela() {
        super();
    }

    public String getRelaId() {
        return relaId;
    }

    public void setRelaId(String relaId) {
        this.relaId = relaId == null ? null : relaId.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getRelaBusiTable() {
        return relaBusiTable;
    }

    public void setRelaBusiTable(String relaBusiTable) {
        this.relaBusiTable = relaBusiTable == null ? null : relaBusiTable.trim();
    }

    public String getRelaBusiId() {
        return relaBusiId;
    }

    public void setRelaBusiId(String relaBusiId) {
        this.relaBusiId = relaBusiId == null ? null : relaBusiId.trim();
    }
}