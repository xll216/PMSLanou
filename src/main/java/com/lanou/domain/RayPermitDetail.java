package com.lanou.domain;

public class RayPermitDetail {
    private String raypermitDetailId;

    private String raypermitId;

    private String raypertSystem;

    private String raypertSite;

    private String layerSite;

    public RayPermitDetail(String raypermitDetailId, String raypermitId, String raypertSystem, String raypertSite, String layerSite) {
        this.raypermitDetailId = raypermitDetailId;
        this.raypermitId = raypermitId;
        this.raypertSystem = raypertSystem;
        this.raypertSite = raypertSite;
        this.layerSite = layerSite;
    }

    public RayPermitDetail() {
        super();
    }

    public String getRaypermitDetailId() {
        return raypermitDetailId;
    }

    public void setRaypermitDetailId(String raypermitDetailId) {
        this.raypermitDetailId = raypermitDetailId == null ? null : raypermitDetailId.trim();
    }

    public String getRaypermitId() {
        return raypermitId;
    }

    public void setRaypermitId(String raypermitId) {
        this.raypermitId = raypermitId == null ? null : raypermitId.trim();
    }

    public String getRaypertSystem() {
        return raypertSystem;
    }

    public void setRaypertSystem(String raypertSystem) {
        this.raypertSystem = raypertSystem == null ? null : raypertSystem.trim();
    }

    public String getRaypertSite() {
        return raypertSite;
    }

    public void setRaypertSite(String raypertSite) {
        this.raypertSite = raypertSite == null ? null : raypertSite.trim();
    }

    public String getLayerSite() {
        return layerSite;
    }

    public void setLayerSite(String layerSite) {
        this.layerSite = layerSite == null ? null : layerSite.trim();
    }
}