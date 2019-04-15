package com.hld.service.entity;

import java.util.List;

//应用信息查询部分用实体
public class appinfo3 {

    public String name;
    public String type;
    public String version;
    public String vendor;
    public String appReleaseTime;
    public String status;
    public String logo;
    public String fileSizeMB;
    public String description;
    public String minRamMB;
    public int minVcpus;
    public String minRootDiskMB;
    public String minDataDiskMB;
    public String hash;
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

    public String getAppReleaseTime() {
        return appReleaseTime;
    }

    public void setAppReleaseTime(String appReleaseTime) {
        this.appReleaseTime = appReleaseTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(String fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinRamMB() {
        return minRamMB;
    }

    public void setMinRamMB(String minRamMB) {
        this.minRamMB = minRamMB;
    }

    public int getMinVcpus() {
        return minVcpus;
    }

    public void setMinVcpus(int minVcpus) {
        this.minVcpus = minVcpus;
    }

    public String getMinRootDiskMB() {
        return minRootDiskMB;
    }

    public void setMinRootDiskMB(String minRootDiskMB) {
        this.minRootDiskMB = minRootDiskMB;
    }

    public String getMinDataDiskMB() {
        return minDataDiskMB;
    }

    public void setMinDataDiskMB(String minDataDiskMB) {
        this.minDataDiskMB = minDataDiskMB;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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
