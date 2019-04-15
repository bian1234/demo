package com.hld.entity;

import java.util.Date;

public class Container {
    private Integer id;

    private String containername;

    private Date searchtime;

    private String province;

    private String sprovince;

    private Date releasetime;

    private String releaseuser;

    private String containertype;

    private String containerversion;

    private String containervendor;

    private String containerrunstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContainername() {
        return containername;
    }

    public void setContainername(String containername) {
        this.containername = containername == null ? null : containername.trim();
    }

    public Date getSearchtime() {
        return searchtime;
    }

    public void setSearchtime(Date searchtime) {
        this.searchtime = searchtime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getSprovince() {
        return sprovince;
    }

    public void setSprovince(String sprovince) {
        this.sprovince = sprovince == null ? null : sprovince.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public String getReleaseuser() {
        return releaseuser;
    }

    public void setReleaseuser(String releaseuser) {
        this.releaseuser = releaseuser == null ? null : releaseuser.trim();
    }

    public String getContainertype() {
        return containertype;
    }

    public void setContainertype(String containertype) {
        this.containertype = containertype == null ? null : containertype.trim();
    }

    public String getContainerversion() {
        return containerversion;
    }

    public void setContainerversion(String containerversion) {
        this.containerversion = containerversion == null ? null : containerversion.trim();
    }

    public String getContainervendor() {
        return containervendor;
    }

    public void setContainervendor(String containervendor) {
        this.containervendor = containervendor == null ? null : containervendor.trim();
    }

    public String getContainerrunstatus() {
        return containerrunstatus;
    }

    public void setContainerrunstatus(String containerrunstatus) {
        this.containerrunstatus = containerrunstatus == null ? null : containerrunstatus.trim();
    }
}