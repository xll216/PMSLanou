package com.lanou.domain;

public class PMSBaseDepartment {
    private Integer depid;

    private String depname;

    public PMSBaseDepartment(Integer depid, String depname) {
        this.depid = depid;
        this.depname = depname;
    }

    public PMSBaseDepartment() {
        super();
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    @Override
    public String toString() {
        return "PMSBaseDepartment{" +
                "depid=" + depid +
                ", depname='" + depname + '\'' +
                '}';
    }
}