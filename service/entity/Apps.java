package com.hld.service.entity;

import com.hld.service.entity.AppInfo;

import java.util.List;

/**
 * @TODO:
 * @author:ykbian@qq.com
 * @date:2019/4/13 9:53
 */

public class Apps {

    private String esn;   //设备esn（20或者32位大写字母和数字组合）
    private String containerName;   //1 ≤ length ≤ 64   需要操作的容器安装的名称
    private List<AppInfo> appInfo;  //需要查找的apps

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

    public List<AppInfo> getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(List<AppInfo> appInfo) {
        this.appInfo = appInfo;
    }
}
