package com.hld.mapper;

import com.hld.entity.InterfaceManage;

import java.util.List;

public interface InterfaceManageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InterfaceManage record);

    int insertSelective(InterfaceManage record);

    InterfaceManage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InterfaceManage record);

    int updateByPrimaryKey(InterfaceManage record);


    List<InterfaceManage> getInterfaceWithUrl(String parentDepartment);

}