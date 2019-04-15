package com.hld.mapper;

import com.hld.entity.RunInfo;

public interface RunInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RunInfo record);

    int insertSelective(RunInfo record);

    RunInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RunInfo record);

    int updateByPrimaryKey(RunInfo record);
}