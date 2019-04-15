package com.hld.service.entity;

public class AppInfo {

    private String appName; //需要操作的app 1 ≤ length ≤ 64
    private int operateType;//0：stop；1：start


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getOperateType() {
        return operateType;
    }

    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }
}
