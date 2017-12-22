package com.lanou.mapper;

import com.lanou.domain.RayPermit;

public interface RayPermitMapper {
    int deleteByPrimaryKey(String raypermitId);

    int insert(RayPermit record);

    int insertSelective(RayPermit record);

    RayPermit selectByPrimaryKey(String raypermitId);

    int updateByPrimaryKeySelective(RayPermit record);

    int updateByPrimaryKey(RayPermit record);
}