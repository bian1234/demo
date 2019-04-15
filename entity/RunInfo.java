package com.hld.entity;

import java.util.Date;

public class RunInfo {
    private Integer id;

    private String esn;

    private String esnname;

    private Date searchtime;

    private String province;

    private String sprovince;

    private Integer appnum;

    private String apprunstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn == null ? null : esn.trim();
    }

    public String getEsnname() {
        return esnname;
    }

    public void setEsnname(String esnname) {
        this.esnname = esnname == null ? null : esnname.trim();
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

    public Integer getAppnum() {
        return appnum;
    }

    public void setAppnum(Integer appnum) {
        this.appnum = appnum;
    }

    public String getApprunstatus() {
        return apprunstatus;
    }

    public void setApprunstatus(String apprunstatus) {
        this.apprunstatus = apprunstatus == null ? null : apprunstatus.trim();
    }
}