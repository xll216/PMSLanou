package com.lanou.mapper;

import com.lanou.domain.CargoDepositPermit;

public interface CargoDepositPermitMapper {
    int deleteByPrimaryKey(String depositId);

    int insert(CargoDepositPermit record);

    int insertSelective(CargoDepositPermit record);

    CargoDepositPermit selectByPrimaryKey(String depositId);

    int updateByPrimaryKeySelective(CargoDepositPermit record);

    int updateByPrimaryKey(CargoDepositPermit record);
}