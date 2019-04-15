package com.hld.service.entity;

import java.util.List;

/**
 * @author: ykbian
 * @date: 2019/4/14 22:08
 * @Description:
 */
public class appinfocondition {

    public String name;
    public String type;
    public String vendor;
    public String version;
    public timerange appReleaseTime;
    public String status;
    public String description;
    public List<Object> physicalInterfaces;
    public String releaseUser;
    public String containerType;
    public String containerVersion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public timerange getAppReleaseTime() {
        return appReleaseTime;
    }

    public void setAppReleaseTime(timerange appReleaseTime) {
        this.appReleaseTime = appReleaseTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getPhysicalInterfaces() {
        return physicalInterfaces;
    }

    public void setPhysicalInterfaces(List<Object> physicalInterfaces) {
        this.physicalInterfaces = physicalInterfaces;
    }

    public String getReleaseUser() {
        return releaseUser;
    }

    public void setReleaseUser(String releaseUser) {
        this.releaseUser = releaseUser;
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
}
