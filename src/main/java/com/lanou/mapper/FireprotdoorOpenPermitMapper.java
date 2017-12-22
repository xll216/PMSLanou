package com.lanou.mapper;

import com.lanou.domain.FireprotdoorOpenPermit;

public interface FireprotdoorOpenPermitMapper {
    int deleteByPrimaryKey(String openId);

    int insert(FireprotdoorOpenPermit record);

    int insertSelective(FireprotdoorOpenPermit record);

    FireprotdoorOpenPermit selectByPrimaryKey(String openId);

    int updateByPrimaryKeySelective(FireprotdoorOpenPermit record);

    int updateByPrimaryKey(FireprotdoorOpenPermit record);
}