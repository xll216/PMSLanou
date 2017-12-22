package com.lanou.mapper;

import com.lanou.domain.FireProtectiveProtect;

public interface FireProtectiveProtectMapper {
    int deleteByPrimaryKey(String protectId);

    int insert(FireProtectiveProtect record);

    int insertSelective(FireProtectiveProtect record);

    FireProtectiveProtect selectByPrimaryKey(String protectId);

    int updateByPrimaryKeySelective(FireProtectiveProtect record);

    int updateByPrimaryKey(FireProtectiveProtect record);
}