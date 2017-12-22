package com.lanou.mapper;

import com.lanou.domain.FireDisconnectWork;

public interface FireDisconnectWorkMapper {
    int deleteByPrimaryKey(String firedisWorkId);

    int insert(FireDisconnectWork record);

    int insertSelective(FireDisconnectWork record);

    FireDisconnectWork selectByPrimaryKey(String firedisWorkId);

    int updateByPrimaryKeySelective(FireDisconnectWork record);

    int updateByPrimaryKey(FireDisconnectWork record);
}