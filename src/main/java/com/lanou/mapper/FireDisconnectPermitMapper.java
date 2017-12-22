package com.lanou.mapper;

import com.lanou.domain.FireDisconnectPermit;

public interface FireDisconnectPermitMapper {
    int deleteByPrimaryKey(String disconnId);

    int insert(FireDisconnectPermit record);

    int insertSelective(FireDisconnectPermit record);

    FireDisconnectPermit selectByPrimaryKey(String disconnId);

    int updateByPrimaryKeySelective(FireDisconnectPermit record);

    int updateByPrimaryKey(FireDisconnectPermit record);
}