package com.lanou.mapper;

import com.lanou.domain.CargoDepositDetail;

public interface CargoDepositDetailMapper {
    int deleteByPrimaryKey(String cargodepDetailId);

    int insert(CargoDepositDetail record);

    int insertSelective(CargoDepositDetail record);

    CargoDepositDetail selectByPrimaryKey(String cargodepDetailId);

    int updateByPrimaryKeySelective(CargoDepositDetail record);

    int updateByPrimaryKey(CargoDepositDetail record);
}