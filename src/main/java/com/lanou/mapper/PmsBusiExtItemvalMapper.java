package com.lanou.mapper;

import com.lanou.domain.PmsBusiExtItemval;

public interface PmsBusiExtItemvalMapper {
    int deleteByPrimaryKey(String extitemvalId);

    int insert(PmsBusiExtItemval record);

    int insertSelective(PmsBusiExtItemval record);

    PmsBusiExtItemval selectByPrimaryKey(String extitemvalId);

    int updateByPrimaryKeySelective(PmsBusiExtItemval record);

    int updateByPrimaryKey(PmsBusiExtItemval record);
}