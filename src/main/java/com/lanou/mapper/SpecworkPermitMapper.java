package com.lanou.mapper;

import com.lanou.domain.SpecworkPermit;

public interface SpecworkPermitMapper {
    int deleteByPrimaryKey(String specpertId);

    int insert(SpecworkPermit record);

    int insertSelective(SpecworkPermit record);

    SpecworkPermit selectByPrimaryKey(String specpertId);

    int updateByPrimaryKeySelective(SpecworkPermit record);

    int updateByPrimaryKey(SpecworkPermit record);
}