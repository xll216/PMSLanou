package com.lanou.mapper;

import com.lanou.domain.PmsPlant;

public interface PmsPlantMapper {
    int deleteByPrimaryKey(String plantId);

    int insert(PmsPlant record);

    int insertSelective(PmsPlant record);

    PmsPlant selectByPrimaryKey(String plantId);

    int updateByPrimaryKeySelective(PmsPlant record);

    int updateByPrimaryKey(PmsPlant record);
}