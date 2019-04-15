package com.hld.service.entity;

/**
 * @author: ykbian
 * @date: 2019/4/14 21:36
 * @Description:   app应用信息
 */
public class appFiles {

    public String status;
    public String version;
    public String  logo;
    public String downloadURL;
    public String appReleaseTime;
    public String fileSizeMB;
    public String description;
    public String minRamMB;
    public String minVcpus;
    public String minRootDiskMB;
    public String minDataDiskMB;
    public String hash;
    public String physicalInterfaces;
    public String releaseUser;
    public String containerType;
    public String containerVersion;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public String getAppReleaseTime() {
        return appReleaseTime;
    }

    public void setAppReleaseTime(String appReleaseTime) {
        this.appReleaseTime = appReleaseTime;
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

    public String getMinVcpus() {
        return minVcpus;
    }

    public void setMinVcpus(String minVcpus) {
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

    public String getPhysicalInterfaces() {
        return physicalInterfaces;
    }

    public void setPhysicalInterfaces(String physicalInterfaces) {
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
