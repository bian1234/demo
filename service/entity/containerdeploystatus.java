package com.hld.service.entity;

/**
 * @TODO: 容器安装信息
 * @author:ykbian@qq.com
 * @date:2019/4/15 10:20
 */

public class containerdeploystatus {

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
