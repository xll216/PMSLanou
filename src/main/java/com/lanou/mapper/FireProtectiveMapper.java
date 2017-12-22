package com.lanou.mapper;

import com.lanou.domain.FireProtective;

public interface FireProtectiveMapper {
    int deleteByPrimaryKey(String firepId);

    int insert(FireProtective record);

    int insertSelective(FireProtective record);

    FireProtective selectByPrimaryKey(String firepId);

    int updateByPrimaryKeySelective(FireProtective record);

    int updateByPrimaryKey(FireProtective record);
}