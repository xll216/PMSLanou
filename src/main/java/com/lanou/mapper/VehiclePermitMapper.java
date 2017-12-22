package com.lanou.mapper;

import com.lanou.domain.VehiclePermit;

public interface VehiclePermitMapper {
    int deleteByPrimaryKey(String vehiclepermitId);

    int insert(VehiclePermit record);

    int insertSelective(VehiclePermit record);

    VehiclePermit selectByPrimaryKey(String vehiclepermitId);

    int updateByPrimaryKeySelective(VehiclePermit record);

    int updateByPrimaryKey(VehiclePermit record);
}