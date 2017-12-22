package com.lanou.mapper;

import com.lanou.domain.PmsMac;

public interface PmsMacMapper {
    int deleteByPrimaryKey(String macId);

    int insert(PmsMac record);

    int insertSelective(PmsMac record);

    PmsMac selectByPrimaryKey(String macId);

    int updateByPrimaryKeySelective(PmsMac record);

    int updateByPrimaryKey(PmsMac record);
}