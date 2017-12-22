package com.lanou.mapper;

import com.lanou.domain.CargoTransPermit;

public interface CargoTransPermitMapper {
    int deleteByPrimaryKey(String transPertId);

    int insert(CargoTransPermit record);

    int insertSelective(CargoTransPermit record);

    CargoTransPermit selectByPrimaryKey(String transPertId);

    int updateByPrimaryKeySelective(CargoTransPermit record);

    int updateByPrimaryKey(CargoTransPermit record);
}