package com.lanou.mapper;

import com.lanou.domain.SpecialWorkPermit;

public interface SpecialWorkPermitMapper {
    int deleteByPrimaryKey(String speworkId);

    int insert(SpecialWorkPermit record);

    int insertSelective(SpecialWorkPermit record);

    SpecialWorkPermit selectByPrimaryKey(String speworkId);

    int updateByPrimaryKeySelective(SpecialWorkPermit record);

    int updateByPrimaryKey(SpecialWorkPermit record);
}