package com.hld.service.entity;

import java.util.List;

/**
 * @author: ykbian
 * @date: 2019/4/14 23:23
 * @Description:  容器配置信息
 */
public class containerconfig {

    public String containerName;
    public String description;
    public int cpuCores;
    public String memoryMB;
    public String diskSizeMB;
    public String volumeSizeMB;
    public List<Object>  physicalInterfaces;
    public List<Object>  openServices;

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public String getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(String memoryMB) {
        this.memoryMB = memoryMB;
    }

    public String getDiskSizeMB() {
        return diskSizeMB;
    }

    public void setDiskSizeMB(String diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
    }

    public String getVolumeSizeMB() {
        return volumeSizeMB;
    }

    public void setVolumeSizeMB(String volumeSizeMB) {
        this.volumeSizeMB = volumeSizeMB;
    }

    public List<Object> getPhysicalInterfaces() {
        return physicalInterfaces;
    }

    public void setPhysicalInterfaces(List<Object> physicalInterfaces) {
        this.physicalInterfaces = physicalInterfaces;
    }

    public List<Object> getOpenServices() {
        return openServices;
    }

    public void setOpenServices(List<Object> openServices) {
        this.openServices = openServices;
    }
}
