package com.hld.service.entity;


/**
 * @TODO: 设备信息
 * @author:ykbian@qq.com
 * @date:2019/4/15 9:37
 */

public class devicequeryresult {

    public String name;
    public String esn;
    public String mac;
    public String ip;
    public String neType;
    public String version;

    public int status;
    public int licenseStatus;

    public String vendor;
    public String description;
    public String createTime;
    public String registerTime;
    public String modifyTime;
    public String patchVersion;
    public String lastOfflineTime;
    public String onlineTime;
    public String gisLon;
    public String gisLat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNeType() {
        return neType;
    }

    public void setNeType(String neType) {
        this.neType = neType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(int licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPatchVersion() {
        return patchVersion;
    }

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }

    public String getLastOfflineTime() {
        return lastOfflineTime;
    }

    public void setLastOfflineTime(String lastOfflineTime) {
        this.lastOfflineTime = lastOfflineTime;
    }

    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    public String getGisLon() {
        return gisLon;
    }

    public void setGisLon(String gisLon) {
        this.gisLon = gisLon;
    }

    public String getGisLat() {
        return gisLat;
    }

    public void setGisLat(String gisLat) {
        this.gisLat = gisLat;
    }
}
