package com.hld.service.entity;

//应用安装信息
public class appdeploystatus {

    public int deployProgress;
    public int deployStatus;
    public String deployFailReason;

    public int getDeployProgress() {
        return deployProgress;
    }

    public void setDeployProgress(int deployProgress) {
        this.deployProgress = deployProgress;
    }

    public int getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(int deployStatus) {
        this.deployStatus = deployStatus;
    }

    public String getDeployFailReason() {
        return deployFailReason;
    }

    public void setDeployFailReason(String deployFailReason) {
        this.deployFailReason = deployFailReason;
    }
}
