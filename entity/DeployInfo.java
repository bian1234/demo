package com.hld.entity;

import java.util.Date;

public class DeployInfo {
    private Integer id;

    private String esn;

    private Date searchtime;

    private String province;

    private String sprovince;

    private Integer appnum;

    private String appdeployprogress;

    private String appdeploystatus;

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

    public String getAppdeployprogress() {
        return appdeployprogress;
    }

    public void setAppdeployprogress(String appdeployprogress) {
        this.appdeployprogress = appdeployprogress == null ? null : appdeployprogress.trim();
    }

    public String getAppdeploystatus() {
        return appdeploystatus;
    }

    public void setAppdeploystatus(String appdeploystatus) {
        this.appdeploystatus = appdeploystatus == null ? null : appdeploystatus.trim();
    }
}