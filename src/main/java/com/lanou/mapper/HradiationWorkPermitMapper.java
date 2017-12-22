package com.lanou.mapper;

import com.lanou.domain.HradiationWorkPermit;

public interface HradiationWorkPermitMapper {
    int deleteByPrimaryKey(String hradiId);

    int insert(HradiationWorkPermit record);

    int insertSelective(HradiationWorkPermit record);

    HradiationWorkPermit selectByPrimaryKey(String hradiId);

    int updateByPrimaryKeySelective(HradiationWorkPermit record);

    int updateByPrimaryKey(HradiationWorkPermit record);
}