package com.lanou.mapper;

import com.lanou.domain.CargoTransMeasure;

public interface CargoTransMeasureMapper {
    int deleteByPrimaryKey(String measureId);

    int insert(CargoTransMeasure record);

    int insertSelective(CargoTransMeasure record);

    CargoTransMeasure selectByPrimaryKey(String measureId);

    int updateByPrimaryKeySelective(CargoTransMeasure record);

    int updateByPrimaryKey(CargoTransMeasure record);
}