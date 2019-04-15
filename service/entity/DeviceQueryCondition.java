package com.hld.service.entity;


import java.util.List;

/**
 * @TODO: devicequerycondition 类型
 * @author:ykbian@qq.com
 * @date:2019/4/13 13:49
 * @param:
 * @return:
 */
public class DeviceQueryCondition {

    private String name;
    private String esn;
    private String mac;
    private String ip;
    private String neType;
    private List<String> targetEsns;
    private String  version;
    private int status;
    private int licenseStatus;
    private String vendor;
    private String description;
    private String patchVersion;


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

    public List<String> getTargetEsns() {
        return targetEsns;
    }

    public void setTargetEsns(List<String> targetEsns) {
        this.targetEsns = targetEsns;
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

    public String getPatchVersion() {
        return patchVersion;
    }

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }
}
