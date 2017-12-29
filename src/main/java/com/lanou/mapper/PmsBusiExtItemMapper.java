package com.lanou.mapper;

import com.lanou.domain.PmsBusiExtItem;

public interface PmsBusiExtItemMapper {
    int deleteByPrimaryKey(String extItemId);

    int insert(PmsBusiExtItem record);

    int insertSelective(PmsBusiExtItem record);

    PmsBusiExtItem selectByPrimaryKey(String extItemId);

    int updateByPrimaryKeySelective(PmsBusiExtItem record);

    int updateByPrimaryKey(PmsBusiExtItem record);

    String selectMaxKey();
}