package com.lanou.mapper;

import com.lanou.domain.PmsRayUser;

public interface PmsRayUserMapper {
    int deleteByPrimaryKey(String rayStaffId);

    int insert(PmsRayUser record);

    int insertSelective(PmsRayUser record);

    PmsRayUser selectByPrimaryKey(String rayStaffId);

    int updateByPrimaryKeySelective(PmsRayUser record);

    int updateByPrimaryKey(PmsRayUser record);
}