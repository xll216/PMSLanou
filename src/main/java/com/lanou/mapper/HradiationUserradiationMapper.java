package com.lanou.mapper;

import com.lanou.domain.HradiationUserradiation;

public interface HradiationUserradiationMapper {
    int deleteByPrimaryKey(String teamId);

    int insert(HradiationUserradiation record);

    int insertSelective(HradiationUserradiation record);

    HradiationUserradiation selectByPrimaryKey(String teamId);

    int updateByPrimaryKeySelective(HradiationUserradiation record);

    int updateByPrimaryKey(HradiationUserradiation record);
}