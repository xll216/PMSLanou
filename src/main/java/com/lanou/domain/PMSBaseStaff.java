package com.lanou.domain;

import java.util.Date;

public class PMSBaseStaff {
    private Integer staffid;

    private String loginname;

    private String loginpwd;

    private String staffname;

    private String gender;

    private Date ondutydate;

    private Integer postid;
    private Integer deptid;

    private String linkTel;

    public PMSBaseStaff(Integer staffid, String loginname, String loginpwd, String staffname, String gender, Date ondutydate, Integer postid) {
        this.staffid = staffid;
        this.loginname = loginname;
        this.loginpwd = loginpwd;
        this.staffname = staffname;
        this.gender = gender;
        this.ondutydate = ondutydate;
        this.postid = postid;
    }

    public PMSBaseStaff(Integer staffid, String loginname, String loginpwd, String staffname, String gender, Date ondutydate, Integer postid, Integer deptid, String linkTel) {
        this.staffid = staffid;
        this.loginname = loginname;
        this.loginpwd = loginpwd;
        this.staffname = staffname;
        this.gender = gender;
        this.ondutydate = ondutydate;
        this.postid = postid;
        this.deptid = deptid;
        this.linkTel = linkTel;
    }

    public PMSBaseStaff() {
        super();
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getOndutydate() {
        return ondutydate;
    }

    public void setOndutydate(Date ondutydate) {
        this.ondutydate = ondutydate;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "PMSBaseStaff{" +
                "staffid=" + staffid +
                ", loginname='" + loginname + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                ", staffname='" + staffname + '\'' +
                ", gender='" + gender + '\'' +
                ", ondutydate=" + ondutydate +
                ", postid=" + postid +
                ", deptid=" + deptid +
                ", linkTel='" + linkTel + '\'' +
                '}';
    }
}