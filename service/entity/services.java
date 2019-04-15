package com.hld.service.entity;


//应用提供的服务
public class services {

    private String serviceName;
    private int runningStatus;
    private String cpuStatus;
    private String memoryStatus;
    private String flashStatus;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(int runningStatus) {
        this.runningStatus = runningStatus;
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
}
