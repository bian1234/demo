package com.hld.service.entity;

import java.util.List;

/**
 * @author: ykbian
 * @date: 2019/4/14 23:11
 * @Description:  容器管理data信息实体
 */
public class ContainerManagerDataObject {

    public String name;
    public String type;
    public String vendor;
    public List<containerfiles> containerfiles;   //查看可安装容器文件列表

    //安装容器
    public String esn;
    public containerinfo containerInfo;
    public containerconfig containerConfig;

    //卸载容器
//    public String esn;
    public String containerName;

    //启动和停止容器（选择容器执行开启或者停止操作）
    public String errcode;
    public String errmsg;
//    public String containerName;
//    public String esn;

    //修改容器配置
   //通  启动和停止容器（选择容器执行开启或者停止操作）

    //监控容器
//    public String containerName;
//    public String esn;
    public String cpuStatus;
    public String memoryStatus;
    public String flashStatus;
    public int runningStatus;

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

    public List<containerfiles> getContainerfiles() {
        return containerfiles;
    }

    public void setContainerfiles(List<containerfiles> containerfiles) {
        this.containerfiles = containerfiles;
    }

    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getCpuStatus() {
        return cpuStatus;
    }

    public void setCpuStatus(String cpuStatus) {
        this.cpuStatus = cpuStatus;
    }

    public String getMemoryStatus() {
        return memoryStatus;
    }

    public void setMemoryStatus(String memoryStatus) {
        this.memoryStatus = memoryStatus;
    }

    public String getFlashStatus() {
        return flashStatus;
    }

    public void setFlashStatus(String flashStatus) {
        this.flashStatus = flashStatus;
    }

    public int getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(int runningStatus) {
        this.runningStatus = runningStatus;
    }

    public containerinfo getContainerInfo() {
        return containerInfo;
    }

    public void setContainerInfo(containerinfo containerInfo) {
        this.containerInfo = containerInfo;
    }

    public containerconfig getContainerConfig() {
        return containerConfig;
    }

    public void setContainerConfig(containerconfig containerConfig) {
        this.containerConfig = containerConfig;
    }
}
