package com.hld.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.hld.entity.InterfaceManage;
import com.hld.service.AppManagementService;
import com.hld.service.Assist;
import com.hld.service.ContainerManageService;
import com.hld.service.entity.condition;
import com.hld.service.entity.timerange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ContainerManageServiceImpl  implements ContainerManageService {


    @Autowired
    private Assist assist;
    @Resource(name = "manageService")
    private AppManagementService manageService;
    private static final String parentDepartment = "edbce14094424ba583cbaca7a05de547";

    @Override
    public void containerList(String containerName, String startTime, String endTime, String type,
                              String version, List<Object> sort, int pageIndex, int pageSize) throws Exception{

    }

    @Override
    public void containersMonitor(String esn, List<String> containerNames) throws Exception{
        JSONObject json = new JSONObject();
        json.put("esn",esn);
        json.put("containerNames",containerNames);
        List<InterfaceManage> interfaceManages = manageService.getInterfaceWithUrl(parentDepartment);
        if (!interfaceManages.isEmpty()) {
            for (int i = 0; i < interfaceManages.size(); i++) {
                Assist assist = new Assist();
                String post = assist.createUrlAndPost("/controller/iot/sg/v1/containers/monitor", interfaceManages.get(i), json);
                //判断是否成功
                if (!assist.isSuccess(post)){
                    break;
                }
                //这个JSONObject中包含的是data数据，需要保存在数据库
                JSONObject data = assist.getData(post);
                /**
                 * 以下为保存数据库部分
                 */
            }
        }else {
            System.out.println("接口信息为空");
        }
    }
}
