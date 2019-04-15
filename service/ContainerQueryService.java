package com.hld.service;


/**
 * @TODO:  查询容器信息
 * @author:ykbian@qq.com
 * @date:2019/4/12 11:48
 */
public interface ContainerQueryService {

    /**
     * 批量查询设备容器安装信息
     * @param string
     * @return
     */
    String devicesDeployInfo(String string);

    /**
     *批量查询设备容器运行信息
     */
    String devicesRunInfo(String string);

    /**
     * 查询指定设备容器安装信息
     */
    String deviceDeployInfo(String string);

    /**
     * 查询指定设备容器运行信息
     */
    String deviceRunInfo(String string);

    /**
     * 批量查询容器安装信息
     * @return
     */
    String containersDeployInfo(String  string);

    /**
     * 批量查询容器运行信息
     * @param string
     * @return
     */
    String containersRunInfo(String string);

    /**
     * 查询指定容器安装信息
     * @param string
     * @return
     */
    String containerDeployInfo(String string);

    /**
     *查询指定容器运行信息
     * @param string
     * @return
     */
    String containerRunInfo(String string);

    /**
     * 指定容器查看安装与统计信息
     * @param string
     * @return
     */
    String statistics(String string);
}
