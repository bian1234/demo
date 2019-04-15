package com.hld.service.entity;

public class containerinfo {

    private String name;
    private String releaseTime;
    private String releaseUser;
    private String type;   //容器类型、0 lxc容器
    private String version;  //容器版本
    private String vendor;   //容器厂家
    private Boolean isIncrementPkg;   //是否是增量升级包,true：是容器升级包;false：容器基础包

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getReleaseUser() {
        return releaseUser;
    }

    public void setReleaseUser(String releaseUser) {
        this.releaseUser = releaseUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Boolean getIncrementPkg() {
        return isIncrementPkg;
    }

    public void setIncrementPkg(Boolean incrementPkg) {
        isIncrementPkg = incrementPkg;
    }
}
