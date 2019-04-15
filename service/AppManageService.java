package com.hld.service;


/**
 * @TODO:  应用管理服务
 * @author:ykbian@qq.com
 * @date:2019/4/12 12:01
 */
public interface AppManageService {

    /**
     * 查询应用商店中应用列表
     * @param string
     * @return
     */
    String appList(String string);

    /**
     * app安装
     * @param string
     * @return
     */
    String appDeploy(String string);

    /**
     * app卸载
     * @param string
     * @return
     */
    String appsUninstall(String string);

    /**
     * app监控
     */
    String appsMonitor(String string);

    /**
     * APP启动和停止
     */
    String appsOperate(String string);


}
