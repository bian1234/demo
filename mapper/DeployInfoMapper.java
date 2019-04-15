package com.hld.mapper;

import com.hld.entity.DeployInfo;

public interface DeployInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeployInfo record);

    int insertSelective(DeployInfo record);

    DeployInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeployInfo record);

    int updateByPrimaryKey(DeployInfo record);
}