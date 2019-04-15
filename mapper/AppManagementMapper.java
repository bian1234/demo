package com.hld.mapper;

import com.hld.entity.AppManagement;
import com.hld.entity.AppManagementWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface AppManagementMapper {
    int deleteByPrimaryKey(String objId);

    int insert(AppManagementWithBLOBs record);

    int insertSelective(AppManagementWithBLOBs record);

    AppManagementWithBLOBs selectByPrimaryKey(String objId);

    int updateByPrimaryKeySelective(AppManagementWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AppManagementWithBLOBs record);

    int updateByPrimaryKey(AppManagement record);


    String getDepName(String depId);
}