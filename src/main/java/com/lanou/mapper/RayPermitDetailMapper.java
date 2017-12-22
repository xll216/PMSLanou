package com.lanou.mapper;

import com.lanou.domain.RayPermitDetail;

public interface RayPermitDetailMapper {
    int deleteByPrimaryKey(String raypermitDetailId);

    int insert(RayPermitDetail record);

    int insertSelective(RayPermitDetail record);

    RayPermitDetail selectByPrimaryKey(String raypermitDetailId);

    int updateByPrimaryKeySelective(RayPermitDetail record);

    int updateByPrimaryKey(RayPermitDetail record);
}