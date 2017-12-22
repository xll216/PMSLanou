package com.lanou.mapper;

import com.lanou.domain.FireProtectiveExt;

public interface FireProtectiveExtMapper {
    int deleteByPrimaryKey(String extId);

    int insert(FireProtectiveExt record);

    int insertSelective(FireProtectiveExt record);

    FireProtectiveExt selectByPrimaryKey(String extId);

    int updateByPrimaryKeySelective(FireProtectiveExt record);

    int updateByPrimaryKey(FireProtectiveExt record);
}