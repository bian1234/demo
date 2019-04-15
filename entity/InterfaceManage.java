package com.hld.entity;

import java.util.Date;

public class InterfaceManage {
    private Integer id;

    private String jkmc;

    private String jkurl;

    private String jkport;

    private Date searchTime;

    private String zcr;

    private String parentDepartment;

    private String sjkname;

    private String password;

    private String sjkurl;

    private String sjkmc;

    private String sjkport;

    private String cswlsflt;

    private String cssjklt;

    private String jkname;

    private String jkpassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJkmc() {
        return jkmc;
    }

    public void setJkmc(String jkmc) {
        this.jkmc = jkmc == null ? null : jkmc.trim();
    }

    public String getJkurl() {
        return jkurl;
    }

    public void setJkurl(String jkurl) {
        this.jkurl = jkurl == null ? null : jkurl.trim();
    }

    public String getJkport() {
        return jkport;
    }

    public void setJkport(String jkport) {
        this.jkport = jkport == null ? null : jkport.trim();
    }

    public Date getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(Date searchTime) {
        this.searchTime = searchTime;
    }

    public String getZcr() {
        return zcr;
    }

    public void setZcr(String zcr) {
        this.zcr = zcr == null ? null : zcr.trim();
    }

    public String getParentDepartment() {
        return parentDepartment;
    }

    public void setParentDepartment(String parentDepartment) {
        this.parentDepartment = parentDepartment == null ? null : parentDepartment.trim();
    }

    public String getSjkname() {
        return sjkname;
    }

    public void setSjkname(String sjkname) {
        this.sjkname = sjkname == null ? null : sjkname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSjkurl() {
        return sjkurl;
    }

    public void setSjkurl(String sjkurl) {
        this.sjkurl = sjkurl == null ? null : sjkurl.trim();
    }

    public String getSjkmc() {
        return sjkmc;
    }

    public void setSjkmc(String sjkmc) {
        this.sjkmc = sjkmc == null ? null : sjkmc.trim();
    }

    public String getSjkport() {
        return sjkport;
    }

    public void setSjkport(String sjkport) {
        this.sjkport = sjkport == null ? null : sjkport.trim();
    }

    public String getCswlsflt() {
        return cswlsflt;
    }

    public void setCswlsflt(String cswlsflt) {
        this.cswlsflt = cswlsflt == null ? null : cswlsflt.trim();
    }

    public String getCssjklt() {
        return cssjklt;
    }

    public void setCssjklt(String cssjklt) {
        this.cssjklt = cssjklt == null ? null : cssjklt.trim();
    }

    public String getJkname() {
        return jkname;
    }

    public void setJkname(String jkname) {
        this.jkname = jkname == null ? null : jkname.trim();
    }

    public String getJkpassword() {
        return jkpassword;
    }

    public void setJkpassword(String jkpassword) {
        this.jkpassword = jkpassword == null ? null : jkpassword.trim();
    }
}