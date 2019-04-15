package com.hld.service;


import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @TODO:  容器管理服务
 * @author:ykbian@qq.com
 * @date:2019/4/12 11:36
 */

public interface ContainerManageService {



    /**
     * 查看可安装容器文件列表
     * @param: 容器名称、开始时间，停止时间，容器类型，容器版本，排序条件，起始页码，分页大小
     * @return
     */
    public void containerList(String containerName, String startTime, String endTime,
                          String type, String version, List<Object> sort,int pageIndex,int pageSize)throws Exception;






    /**
     * @TODO: 监控容器
     * @author:ykbian@qq.com
     * @date:2019/4/15 14:02
     * @param:  esn  containerNames
     * @return:
     */
    public void containersMonitor(String esn,List<String> containerNames) throws Exception;
}
