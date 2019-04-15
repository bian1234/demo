package com.hld.service.imp;

import com.hld.entity.InterfaceManage;
import com.hld.entity.Token;
import com.hld.mapper.AppManagementMapper;
import com.hld.mapper.InterfaceManageMapper;
import com.hld.mapper.TokenMapper;
import com.hld.service.AppManagementService;
import com.hld.util.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppManagementServiceImpl  implements AppManagementService {

    @Autowired
    private AppManagementMapper  appManagementMapper;

    @Autowired
    private InterfaceManageMapper interfaceManage;
    @Autowired
    private TokenMapper tokenMapper;


    public String getDepName(String depId) {
        return appManagementMapper.getDepName(depId);
    }

    public List<InterfaceManage> getInterfaceWithUrl(String parentDepartment){
        return interfaceManage.getInterfaceWithUrl(parentDepartment);
    }


    public PageData getToken(PageData pageData) {
        return tokenMapper.getToken(pageData);
    }

    public int updateToken(PageData pageData) {
        return tokenMapper.updateToken(pageData);
    }

    public int saveToken(PageData pageData) {
        return tokenMapper.saveToken(pageData);
    }
}
