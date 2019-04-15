package com.hld.service.entity;

/**
 * @author: ykbian
 * @date: 2019/4/14 22:50
 * @Description:   容器文件信息
 */
public class containerfiles {

    public String version;
    public String fileSizeMB;
    public String description;
    public String minRamMB;
    public int minVcpus;
    public String minRootDiskMB;
    public String minDataDiskMB;
    public Boolean isIncrementPkg;
    public String releaseTime;
    public String releaseUser;
    public String baseVersion;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public Boolean getIncrementPkg() {
        return isIncrementPkg;
    }

    public void setIncrementPkg(Boolean incrementPkg) {
        isIncrementPkg = incrementPkg;
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

    public String getBaseVersion() {
        return baseVersion;
    }

    public void setBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
    }
}
