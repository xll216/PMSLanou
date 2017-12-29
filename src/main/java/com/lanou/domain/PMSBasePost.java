package com.lanou.domain;

public class PMSBasePost {
    private Integer postid;

    private String postname;

    private Integer depid;

    public PMSBasePost(Integer postid, String postname, Integer depid) {
        this.postid = postid;
        this.postname = postname;
        this.depid = depid;
    }

    public PMSBasePost() {
        super();
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }
}