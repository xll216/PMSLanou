package com.lanou.mapper;

import com.lanou.domain.RdmsProjChange;

public interface RdmsProjChangeMapper {
    int deleteByPrimaryKey(String pmsChange);

    int insert(RdmsProjChange record);

    int insertSelective(RdmsProjChange record);

    RdmsProjChange selectByPrimaryKey(String pmsChange);

    int updateByPrimaryKeySelective(RdmsProjChange record);

    int updateByPrimaryKey(RdmsProjChange record);
}