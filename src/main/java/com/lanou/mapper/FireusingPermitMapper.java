package com.lanou.mapper;

import com.lanou.domain.FireusingPermit;

public interface FireusingPermitMapper {
    int deleteByPrimaryKey(String fireusingId);

    int insert(FireusingPermit record);

    int insertSelective(FireusingPermit record);

    FireusingPermit selectByPrimaryKey(String fireusingId);

    int updateByPrimaryKeySelective(FireusingPermit record);

    int updateByPrimaryKey(FireusingPermit record);
}