package com.lanou.mapper;

import com.lanou.domain.NewopenHole;

public interface NewopenHoleMapper {
    int deleteByPrimaryKey(String holeId);

    int insert(NewopenHole record);

    int insertSelective(NewopenHole record);

    NewopenHole selectByPrimaryKey(String holeId);

    int updateByPrimaryKeySelective(NewopenHole record);

    int updateByPrimaryKey(NewopenHole record);
}