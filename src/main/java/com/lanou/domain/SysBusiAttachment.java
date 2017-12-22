package com.lanou.domain;

import java.util.Date;

public class SysBusiAttachment {
    private String attachid;

    private String sysname;

    private String filename;

    private String filesize;

    private String uri;

    private Date uploadtime;

    private String uploaduser;

    private String effectFlag;

    public SysBusiAttachment(String attachid, String sysname, String filename, String filesize, String uri, Date uploadtime, String uploaduser, String effectFlag) {
        this.attachid = attachid;
        this.sysname = sysname;
        this.filename = filename;
        this.filesize = filesize;
        this.uri = uri;
        this.uploadtime = uploadtime;
        this.uploaduser = uploaduser;
        this.effectFlag = effectFlag;
    }

    public SysBusiAttachment() {
        super();
    }

    public String getAttachid() {
        return attachid;
    }

    public void setAttachid(String attachid) {
        this.attachid = attachid == null ? null : attachid.trim();
    }

    public String getSysname() {
        return sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname == null ? null : sysname.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getUploaduser() {
        return uploaduser;
    }

    public void setUploaduser(String uploaduser) {
        this.uploaduser = uploaduser == null ? null : uploaduser.trim();
    }

    public String getEffectFlag() {
        return effectFlag;
    }

    public void setEffectFlag(String effectFlag) {
        this.effectFlag = effectFlag == null ? null : effectFlag.trim();
    }
}