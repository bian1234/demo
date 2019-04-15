package com.hld.service;


/**
 * @TODO:  应用查询服务
 * @author:ykbian@qq.com
 * @date:2019/4/12 12:01
 */

public interface AppQueryService {

    /**
     * 批量查询设备应用安装信息
     */
    String devicesDeployInfo(String string);

    /**
     * 批量查询设备应用运行信息
     * @param string
     * @return
     */
    String devicesRunInfo(String  string);


    /**
     * 查询指定设备应用安装信息
     * @param string
     * @return
     */
    String deviceDeployInfo(String string);


    /**
     * 查询指定设备应用运行信息
     * @return
     */
    String deviceRunInfo(String string);

    /**
     * 批量查询应用安装信息
     * @return
     */
    String  appsdeployinfo(String string);

    /**
     * 批量查询应用运行信息
     * @param string
     * @return
     */
    String appsRunInfo(String string);

    /**
     * 查询指定应用安装信息
     * @param string
     * @return
     */
    String  appDeployIinfo(String string);

    /**
     * 查询指定应用运行信息
     * @return
     */
    String appRunInfo(String string);



    /**
     * 指定应用查看安装与统计信息
     * @param string
     * @return
     */
    String appsStatistics(String string);
}
