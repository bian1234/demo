package com.hld.service.entity;

import java.util.List;

/**
 * @author: ykbian
 * @date: 2019/4/14 22:23
 * @Description:   需要查询的条件
 */
public class condition {

    public String name;
    public String status; // 应用当前状态，空值即查询全部状态  String, 支持以下几种：0：“已发布”: 1：“已下线”
    public String type;
    public String vendor;
    public String version;
    public String containerType;
    public String containerVersion;
    public List<Object>  physicalInterfaces;
    /**
     * 以下两个属性只存在一个其中容器管理中是releaseTime，应用查询是appReleaseTime
     */
    public timerange appReleaseTime;
    public timerange releaseTime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public String getContainerVersion() {
        return containerVersion;
    }

    public void setContainerVersion(String containerVersion) {
        this.containerVersion = containerVersion;
    }

    public List<Object> getPhysicalInterfaces() {
        return physicalInterfaces;
    }

    public void setPhysicalInterfaces(List<Object> physicalInterfaces) {
        this.physicalInterfaces = physicalInterfaces;
    }

    public timerange getAppReleaseTime() {
        return appReleaseTime;
    }

    public void setAppReleaseTime(timerange appReleaseTime) {
        this.appReleaseTime = appReleaseTime;
    }

    public timerange getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(timerange releaseTime) {
        this.releaseTime = releaseTime;
    }
}
