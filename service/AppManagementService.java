package com.hld.service;

import com.hld.entity.InterfaceManage;
import com.hld.entity.Page;
import com.hld.entity.Token;
import com.hld.util.PageData;

import java.util.List;

/**
 * @TODO:  应用管理服务接口
 * @author:ykbian@qq.com
 * @date:2019/4/11 22:55
 * @param:
 * @return:
 */

public interface AppManagementService {

    /***
     * 根据部门id查询部门名称
     */
    public String getDepName(String depId);

    public List<InterfaceManage> getInterfaceWithUrl(String parentDepartment);

    public PageData getToken(PageData pageData);

    public int updateToken(PageData pageData);

    public int saveToken(PageData pageData);
}
