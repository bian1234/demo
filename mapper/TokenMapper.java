package com.hld.mapper;

import com.hld.entity.Token;
import com.hld.util.PageData;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);

    int saveToken(PageData pageData);

    int updateToken(PageData pageData);

    PageData  getToken(PageData pageData);

}